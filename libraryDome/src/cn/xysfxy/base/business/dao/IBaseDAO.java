package cn.xysfxy.base.business.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

public interface IBaseDAO {

	public abstract SqlMapClientTemplate getSqlMapClient();

	/**
	 * 
	 * @param sql
	 *            ibatis ��ѯid
	 * @param parms
	 *            ����
	 * @return
	 */
	public abstract Object queryOject(String sql, Object parms);

	/**
	 * ��ѯ�б���
	 * 
	 * @param sql
	 *            ibatis ��ѯid
	 * @param parms
	 *            ����
	 * @return
	 */
	public abstract <T extends Object> List<T> queryList(String sql,
			Object parms);

	/**
	 * ��ѯ�洢����
	 * 
	 * @param sql
	 *            ibatis ��ѯid
	 * @param parms
	 *            ����
	 * @return
	 */
	public abstract Map<String, Object> queryList(String sql,
			Map<String, Object> parms);

	/**
	 * ��ѯ�б���,����ҳ,����ҳ���ܲ��Ǻܺ�,����Ǵ�����,���Լ�д��ҳ
	 * 
	 * @param sql
	 *            ibatis ��ѯid
	 * @param parms
	 *            ����
	 * @param skipResults
	 *            ��ʼλ��
	 * @param maxResults
	 *            ��ѯ����
	 * @return
	 */
	public abstract <T extends Object> List<T> queryList(String sql,
			Object parms, int skipResults, int maxResults);

	/**
	 * ����
	 * 
	 * @param sql
	 *            ibatis ����ʱsqlid
	 * @param parms
	 *            ����
	 * @return
	 */
	public abstract Object insert(String sql, Object parms);

	/**
	 * �޸�
	 * 
	 * @param sql
	 *            ibatis �޸�ʱsqlid
	 * @param parms
	 *            ����
	 * @return
	 */
	public abstract int update(String sql, Object parms);

}