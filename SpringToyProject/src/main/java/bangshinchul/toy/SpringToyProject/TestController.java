package bangshinchul.toy.SpringToyProject;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bangshinchul.toy.SpringToyProject.Service.TestService;
import bangshinchul.toy.SpringToyProject.bean.TestBean;

@Controller //Controller�� �������ִ� ������̼�
public class TestController {
	
	//����� ���񽺸� inject��(�������� �ڵ�����)
	@Inject
	TestService service;
	
	/* RequestMapping ������̼��� 
	* �̸� �״�� ��û(Request)�� �������ִ� ����� �Ѵ�.
	* ��û�� get���� �Դ���, Post�� �Դ���,
	* � value(���)�� ��û�� �Դ����� ���� �޼��尡 ���εȴ�.
	* RequestMapping�� ���� �Ķ���͵� ���޹��� �� �ִ�.
	*/
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(Model model) throws Exception {
		List<TestBean> list;
		list = service.test();
		model.addAttribute("list", list);
		return "test";
	}
	
	
}
