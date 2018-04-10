package bangshinchul.toy.SpringToyProject.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import bangshinchul.toy.SpringToyProject.bean.TestBean;

// TestDAO 인터페이스를 상속받은 class를 만듬.
@Repository //DAO를 스프링에 인식 시킴
public class TestDAOImpl implements TestDAO { //사용할 Mapper.xml의 namespace명

	private static final String namespace = "bangshinchul.toy.SpringToyProject.Mapper";
	
	/* @Inject
		- 자바에서 지원해주는 의존관계를 자동으로 연결해주는 기능을 가진 어노테이션
		- 연결방식은 타입에 맞춰 연결해준다.
	*/
	/* @Autowired 
		- 스프링에서 지원해주는 의존관계를 자동으로 연결해주는 기능을 가진 어노테이션
		- 연결방식은 타입에 맞춰 연결해준다.
	*/
	/* @Resource
		- 자바에서 지원해주는 의존관계를 자동으로 연결해주는 기능을 가진 어노테이션
		- 연결방식은 이름으로 연결해준다.
	 */
	/*
	 * 자세한 설명을 하자면, 
	 * @Inject와 @Resource는 
	 * JSR에 실려있는 자바 기존의 어노테이션입니다. 
	 * 반면 @Autowired의 경우에는 
	 * 스프링에서 등장한 어노테이션입니다. 
	 * 따라서 스프링 이외에서는 사용 할 수 없습니다. 
	 * 만약에 프로젝트를 스프링에서 
	 * 다른 프레임워크로 바꿀 생각이 있으시다면
	 *  @Autowired보단 
	 *  @Inject나 @Resource를 쓰시면 됩니다. 
	 *  다만 이런 경우는 거의 없다고 봅니다.
	 * */
	
	@Inject 
	private SqlSession sqlSession;
	//DB커넥션과 클로즈를 자동으로 해주는 SqlSession
	
	/*
	 * 만일 @Override 어노테이션이 붙은 메서드가 
	 * 부모 메서드를 오버라이드하지 않는다면 
	 * 컴파일시 오류가 발생하게 됩니다.
	 * */
	@Override
	public List<TestBean> test() throws Exception {
		
		return sqlSession.selectList(namespace+".test");
		// .test : Mapper.xml 쿼리문의 id
		// sqlSession.selectList() : row가 1개 이상인 select문을 구동시키는 메서드
	}

}
