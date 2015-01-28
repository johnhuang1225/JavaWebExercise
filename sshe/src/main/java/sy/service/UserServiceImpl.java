package sy.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Override
	public void save() {
		logger.info("UserServiceImpl save()...");
	}

}
