package bangshinchul.toy.SpringToyProject;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bangshinchul.toy.SpringToyProject.Service.TestService;
import bangshinchul.toy.SpringToyProject.bean.TestBean;

@Controller //Controller를 정의해주는 어노테이션
public class TestController {
	
	//사용할 서비스를 inject함(의존관계 자동연결)
	@Inject
	TestService service;
	
	/* RequestMapping 어노테이션은 
	* 이름 그대로 요청(Request)를 매핑해주는 기능을 한다.
	* 요청이 get으로 왔는지, Post로 왔는지,
	* 어떤 value(경로)로 요청이 왔는지에 따라 메서드가 매핑된다.
	* RequestMapping을 통해 파라미터도 전달받을 수 있다.
	*/
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(Model model) throws Exception {
		List<TestBean> list;
		list = service.test();
		model.addAttribute("list", list);
		return "test";
	}
	
	
}
