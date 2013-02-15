package cn.xysfxy.base.business.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import cn.xysfxy.base.business.dao.IBaseDAO;


/**
 * 父数据层方法，如果业务很简单，请直接使用当前方法，如果复制，新增自己的dao 方法
 * 
 * @author liuzejian
 * 
 */
public class BaseDAOImpl implements  IBaseDAO {
	private SqlMapClientTemplate sqlMapClient;

	/* (non-Javadoc)
	 * @see cn.xysfxy.base.business.dao.impl.IBaseDAO#getSqlMapClient()
	 */
	public SqlMapClientTemplate getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClientTemplate sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	/* (non-Javadoc)
	 * @see cn.xysfxy.base.business.dao.impl.IBaseDAO#queryOject(java.lang.String, java.lang.Object)
	 */
	public Object queryOject(String sql, Object parms) {
		return sqlMapClient.queryForObject(sql, parms);
	}

	/* (non-Javadoc)
	 * @see cn.xysfxy.base.business.dao.impl.IBaseDAO#queryList(java.lang.String, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public final <T extends Object> List<T> queryList(final String sql,
			final Object parms) {
		return (List<T>) sqlMapClient.queryForList(sql, parms);
	}

	
	/* (non-Javadoc)
	 * @see cn.xysfxy.base.business.dao.impl.IBaseDAO#queryList(java.lang.String, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	public final Map<String,Object> queryList(final String sql,
			final Map<String,Object> parms) {
		return (Map<String, Object>) sqlMapClient.queryForObject(sql, parms);
	}
	
	/* (non-Javadoc)
	 * @see cn.xysfxy.base.business.dao.impl.IBaseDAO#queryList(java.lang.String, java.lang.Object, int, int)
	 */
	@SuppressWarnings("unchecked")
	public final <T extends Object> List<T> queryList(final String sql,
			final Object parms, int skipResults, int maxResults) {
		return (List<T>) sqlMapClient.queryForList(sql, parms, skipResults,
				maxResults);
	}

	/* (non-Javadoc)
	 * @see cn.xysfxy.base.business.dao.impl.IBaseDAO#insert(java.lang.String, java.lang.Object)
	 */
	public Object insert(final String sql, final Object parms) {
		return sqlMapClient.insert(sql, parms);
	}

	/* (non-Javadoc)
	 * @see cn.xysfxy.base.business.dao.impl.IBaseDAO#update(java.lang.String, java.lang.Object)
	 */
	public int update(final String sql, final Object parms) {
		return sqlMapClient.update(sql, parms);
	}
}
