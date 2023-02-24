package ex;

import java.util.ArrayList;
import java.util.List;

import ex.dao.LaborerDao;
import ex.dao.LaborerDaoImpl;
import ex.domain.Laborer;
import ex.persentation.Console;
import ex.persentation.LaborerIo;
import ex.service.LaborerService;
import ex.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<>();
		
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
		Console.info("end");
	}
}
