package com.collection.part01.sort;

import java.util.Objects;

public class Score implements Comparable{
	private String name;
	private int score;
	
	public Score() {}
	public Score(String name, int score) {
		this.name=name;
		this.score=score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}
	
	//상속받은 compare 인터페이스를 구현해야함 추상메서드
	@Override
	public int compareTo(Object o) {
		String otherName=((Score)o).getName();
		
		return -name.compareTo(otherName);
		
		//오름차순기준으로 생각
		//"나".compareTo("가") ==> compareTo의 결과 :양수
								//오름차순을 위해return 해야하는 값: 바꿔야하니까 양수가 return 되어야함.
	}
	
}
