package bangshinchul.toy.SpringToyProject.DAO;

import java.util.List;

import bangshinchul.toy.SpringToyProject.bean.TestBean;

/*
 * 인터페이스를 사용하는 이유는 
 * 컨트롤러나 Service에서 호출할 경우 
 * 인터페이스를 읽은 후에 
 * 인터페이스에 연결 된 하나의 메소드를 불러오는게 더 빠르고, 
 * 메소드의 양이 많아서 코드를 찾기 어렵거나 
 * 햇갈릴 경우에 인터페이스를 보면 
 * 훨씬 더 간단하게 
 * 어떤 메소드가 있는지 파악할 수 있기 때문에 
 * 인터페이스를 사용합니다. 
 * 그리고, 
 * 오타나 잘못된 메소드 입력으로 인한 
 * 오류도 한 번 걸러주는 역할을 해줍니다.
 * */

public interface TestDAO {
	public List<TestBean> test() throws Exception;
	//TestBean타입의 test변수에 DB결과값을 list로 받음.
}
