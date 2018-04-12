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
	// value는 웹브라우저에서 사용할 주소값,
	// method는 전송방식
	// DB값을 받아서 웹브라우저로 보낼것이기 때문에 메서드 매개변수로 Model을 추가해줌
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(Model model) throws Exception {
		List<TestBean> list;
		list = service.test(); 
		//TestService에 있는 test메서드를 실행시키고 db값을 list변수에 담음
		
		model.addAttribute("list", list);
		//Model에 list변수의 값(DB에서 가져온값)을 넣어준다.
		// "list"는 반환된 jsp에서 쓸 변수명
		// list는 Model에 넣을 값(변수)
		
		return "test";
		// http://127.0.0.1/SpringToyProject/test 가 입력되면
		// test.jsp로 이동시킴
	}
	
	
}
