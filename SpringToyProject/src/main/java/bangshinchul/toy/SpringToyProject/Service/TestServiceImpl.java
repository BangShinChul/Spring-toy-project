package bangshinchul.toy.SpringToyProject.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import bangshinchul.toy.SpringToyProject.DAO.TestDAO;
import bangshinchul.toy.SpringToyProject.bean.TestBean;

/*
 * DAO가 DB값 입출력을 담당한다면,
 * Service는 DAO에서 
 * 입력하거나 출력할 때
 * 데이터를 가공하는 역할을 합니다.
 * 
 * 예를들어, DB에서 
 * 매출, 매입 값을 불러왔다면
 * 순이익을 계산하기 위해서
 * Service안에 
 * (매출-매입=순이익) 이라는
 * 공식을 넣어서
 * Service로 순이익 값을 구하고
 * Controller로 넘길 때 사용합니다.
 * 
 * 즉, 
 * Controller는 
 * 최대한 페이지의 전환역할만을 하도록 하고,
 * DAO는 데이터의 입출력만 담당하도록 하고,
 * 데이터 가공이나 연산이 필요한 경우는
 * Service에서 처리하도록 합니다.
 * 
 * DAO : DB 입출력을 담당
 * Service : 데이터 처리(연산)을 담당
 * Controller : 페이지(View) 전환을 담당
 * */


@Repository
public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestBean> test() throws Exception {
		// 여기에서 DAO를 통해 데이터를 불러오고, 
		// 데이터 처리가 필요할 경우 여기에서 작업한다.
		// 그리고 리턴해준다.
		return dao.test(); //TestDAOImpl의 List<TestBeam>타입의 리턴값을 제공하는 test메서드
	}

}
