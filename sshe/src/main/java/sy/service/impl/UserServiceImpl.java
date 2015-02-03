package sy.service.impl;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserDaoI;
import sy.model.Tuser;
import sy.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	private UserDaoI userDao;

	public UserDaoI getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDaoI userDao) {
		this.userDao = userDao;
	}

	public static Logger getLogger() {
		return logger;
	}

	@Override
	public void save() {
		logger.info("UserServiceImpl save()...");
	}

	@Override
	public Serializable save(Tuser t) {
		return userDao.save(t);
	}

}
