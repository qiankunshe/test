package cn.xysfxy.base.business.service.impl;

import cn.xysfxy.base.business.dao.IBaseDAO;

public class BaseServiceImpl {
		private IBaseDAO baseDAO;

		public IBaseDAO getBaseDAO() {
			return baseDAO;
		}

		public void setBaseDAO(IBaseDAO baseDAO) {
			this.baseDAO = baseDAO;
		}
		
}
