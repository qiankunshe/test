package cn.xysfxy.base.business.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

public interface IBaseDAO {

	public abstract SqlMapClientTemplate getSqlMapClient();

	/**
	 * 
	 * @param sql
	 *            ibatis 查询id
	 * @param parms
	 *            参数
	 * @return
	 */
	public abstract Object queryOject(String sql, Object parms);

	/**
	 * 查询列表方法
	 * 
	 * @param sql
	 *            ibatis 查询id
	 * @param parms
	 *            参数
	 * @return
	 */
	public abstract <T extends Object> List<T> queryList(String sql,
			Object parms);

	/**
	 * 查询存储过程
	 * 
	 * @param sql
	 *            ibatis 查询id
	 * @param parms
	 *            参数
	 * @return
	 */
	public abstract Map<String, Object> queryList(String sql,
			Map<String, Object> parms);

	/**
	 * 查询列表方法,带分页,本分页性能不是很好,如果是大数据,请自己写分页
	 * 
	 * @param sql
	 *            ibatis 查询id
	 * @param parms
	 *            参数
	 * @param skipResults
	 *            开始位置
	 * @param maxResults
	 *            查询个数
	 * @return
	 */
	public abstract <T extends Object> List<T> queryList(String sql,
			Object parms, int skipResults, int maxResults);

	/**
	 * 新增
	 * 
	 * @param sql
	 *            ibatis 插入时sqlid
	 * @param parms
	 *            参数
	 * @return
	 */
	public abstract Object insert(String sql, Object parms);

	/**
	 * 修改
	 * 
	 * @param sql
	 *            ibatis 修改时sqlid
	 * @param parms
	 *            参数
	 * @return
	 */
	public abstract int update(String sql, Object parms);

}