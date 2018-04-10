package bangshinchul.toy.SpringToyProject.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import bangshinchul.toy.SpringToyProject.bean.TestBean;

// TestDAO �������̽��� ��ӹ��� class�� ����.
@Repository //DAO�� �������� �ν� ��Ŵ
public class TestDAOImpl implements TestDAO { //����� Mapper.xml�� namespace��

	private static final String namespace = "bangshinchul.toy.SpringToyProject.Mapper";
	
	/* @Inject
		- �ڹٿ��� �������ִ� �������踦 �ڵ����� �������ִ� ����� ���� ������̼�
		- �������� Ÿ�Կ� ���� �������ش�.
	*/
	/* @Autowired 
		- ���������� �������ִ� �������踦 �ڵ����� �������ִ� ����� ���� ������̼�
		- �������� Ÿ�Կ� ���� �������ش�.
	*/
	/* @Resource
		- �ڹٿ��� �������ִ� �������踦 �ڵ����� �������ִ� ����� ���� ������̼�
		- �������� �̸����� �������ش�.
	 */
	/*
	 * �ڼ��� ������ ���ڸ�, 
	 * @Inject�� @Resource�� 
	 * JSR�� �Ƿ��ִ� �ڹ� ������ ������̼��Դϴ�. 
	 * �ݸ� @Autowired�� ��쿡�� 
	 * ���������� ������ ������̼��Դϴ�. 
	 * ���� ������ �̿ܿ����� ��� �� �� �����ϴ�. 
	 * ���࿡ ������Ʈ�� ���������� 
	 * �ٸ� �����ӿ�ũ�� �ٲ� ������ �����ôٸ�
	 *  @Autowired���� 
	 *  @Inject�� @Resource�� ���ø� �˴ϴ�. 
	 *  �ٸ� �̷� ���� ���� ���ٰ� ���ϴ�.
	 * */
	
	@Inject 
	private SqlSession sqlSession;
	//DBĿ�ؼǰ� Ŭ��� �ڵ����� ���ִ� SqlSession
	
	/*
	 * ���� @Override ������̼��� ���� �޼��尡 
	 * �θ� �޼��带 �������̵����� �ʴ´ٸ� 
	 * �����Ͻ� ������ �߻��ϰ� �˴ϴ�.
	 * */
	@Override
	public List<TestBean> test() throws Exception {
		
		return sqlSession.selectList(namespace+".test");
		// .test : Mapper.xml �������� id
		// sqlSession.selectList() : row�� 1�� �̻��� select���� ������Ű�� �޼���
	}

}
