package Exam07.ex04.case05.dao;

import Exam07.ex04.case05.domain.Score;

public interface ScoreDao {
	void insertScore(Score score);
	Score[] selectScores();
}
