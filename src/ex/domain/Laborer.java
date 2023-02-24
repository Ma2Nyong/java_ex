package ex.domain;

import java.time.LocalDate;

public record Laborer(int laborerId, String laborerName, LocalDate hireDate) {
	@Override
	public String toString() {
		return String.format("%3d %-5s %s", laborerId, laborerName, hireDate);
	}
}
