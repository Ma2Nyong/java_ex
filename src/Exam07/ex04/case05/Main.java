package Exam07.ex04.case05;

import Exam07.ex04.case05.dao.ScoreDao;
import Exam07.ex04.case05.dao.ScoreDaoImpl;
import Exam07.ex04.case05.domain.Score;
import Exam07.ex04.case05.persertation.ScoreIo;
import Exam07.ex04.case05.service.ScoreService;
import Exam07.ex04.case05.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		ScoreDao scoreDao = new ScoreDaoImpl(new Score[5]);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();
	}
}
