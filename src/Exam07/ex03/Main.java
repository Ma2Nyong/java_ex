package Exam07.ex03;

import Exam07.ex03.dao.UserDao;
import Exam07.ex03.dao.UserDaoImpl;
import Exam07.ex03.persertation.Console;
import Exam07.ex03.persertation.UserIo;
import Exam07.ex03.service.UserService;
import Exam07.ex03.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.play();
		Console.info("end.");
	}
}
