package Exam07.ex03.service;

import Exam07.ex03.dao.UserDao;
import Exam07.ex03.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
	
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}
	
	@Override
	public void fixUser(String userName) {
		userDao.updateUser(userName);
	}
	
	@Override
	public void delUser() {
		userDao.deleteUser();
	}
}
