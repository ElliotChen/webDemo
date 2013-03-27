package tw.elliot.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import tw.elliot.domain.User;
@Repository
public class UserDaoImpl extends AbstractBaseDao<User, String> {
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	@Override
	public Logger getLogger() {
		return logger;
	}

}
