package Exam07.ex02.service;

import Exam07.ex02.dao.UserDao;
import Exam07.ex02.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
