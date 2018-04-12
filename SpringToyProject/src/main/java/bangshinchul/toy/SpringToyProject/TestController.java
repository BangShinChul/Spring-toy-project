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
	// value�� ������������ ����� �ּҰ�,
	// method�� ���۹��
	// DB���� �޾Ƽ� ���������� �������̱� ������ �޼��� �Ű������� Model�� �߰�����
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(Model model) throws Exception {
		List<TestBean> list;
		list = service.test(); 
		//TestService�� �ִ� test�޼��带 �����Ű�� db���� list������ ����
		
		model.addAttribute("list", list);
		//Model�� list������ ��(DB���� �����°�)�� �־��ش�.
		// "list"�� ��ȯ�� jsp���� �� ������
		// list�� Model�� ���� ��(����)
		
		return "test";
		// http://127.0.0.1/SpringToyProject/test �� �ԷµǸ�
		// test.jsp�� �̵���Ŵ
	}
	
	
}
