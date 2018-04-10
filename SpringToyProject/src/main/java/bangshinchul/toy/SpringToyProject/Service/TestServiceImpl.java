package bangshinchul.toy.SpringToyProject.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import bangshinchul.toy.SpringToyProject.DAO.TestDAO;
import bangshinchul.toy.SpringToyProject.bean.TestBean;

/*
 * DAO�� DB�� ������� ����Ѵٸ�,
 * Service�� DAO���� 
 * �Է��ϰų� ����� ��
 * �����͸� �����ϴ� ������ �մϴ�.
 * 
 * �������, DB���� 
 * ����, ���� ���� �ҷ��Դٸ�
 * �������� ����ϱ� ���ؼ�
 * Service�ȿ� 
 * (����-����=������) �̶��
 * ������ �־
 * Service�� ������ ���� ���ϰ�
 * Controller�� �ѱ� �� ����մϴ�.
 * 
 * ��, 
 * Controller�� 
 * �ִ��� �������� ��ȯ���Ҹ��� �ϵ��� �ϰ�,
 * DAO�� �������� ����¸� ����ϵ��� �ϰ�,
 * ������ �����̳� ������ �ʿ��� ����
 * Service���� ó���ϵ��� �մϴ�.
 * 
 * DAO : DB ������� ���
 * Service : ������ ó��(����)�� ���
 * Controller : ������(View) ��ȯ�� ���
 * */


@Repository
public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestBean> test() throws Exception {
		// ���⿡�� DAO�� ���� �����͸� �ҷ�����, 
		// ������ ó���� �ʿ��� ��� ���⿡�� �۾��Ѵ�.
		// �׸��� �������ش�.
		return dao.test(); //TestDAOImpl�� List<TestBeam>Ÿ���� ���ϰ��� �����ϴ� test�޼���
	}

}
