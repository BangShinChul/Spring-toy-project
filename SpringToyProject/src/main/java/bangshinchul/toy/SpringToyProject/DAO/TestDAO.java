package bangshinchul.toy.SpringToyProject.DAO;

import java.util.List;

import bangshinchul.toy.SpringToyProject.bean.TestBean;

/*
 * �������̽��� ����ϴ� ������ 
 * ��Ʈ�ѷ��� Service���� ȣ���� ��� 
 * �������̽��� ���� �Ŀ� 
 * �������̽��� ���� �� �ϳ��� �޼ҵ带 �ҷ����°� �� ������, 
 * �޼ҵ��� ���� ���Ƽ� �ڵ带 ã�� ��ưų� 
 * �ް��� ��쿡 �������̽��� ���� 
 * �ξ� �� �����ϰ� 
 * � �޼ҵ尡 �ִ��� �ľ��� �� �ֱ� ������ 
 * �������̽��� ����մϴ�. 
 * �׸���, 
 * ��Ÿ�� �߸��� �޼ҵ� �Է����� ���� 
 * ������ �� �� �ɷ��ִ� ������ ���ݴϴ�.
 * */

public interface TestDAO {
	public List<TestBean> test() throws Exception;
	//TestBeanŸ���� test������ DB������� list�� ����.
}
