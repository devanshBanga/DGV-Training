package quizApplication;

import java.util.Comparator;

public class SortRank implements Comparator<Rank>{

	@Override
	public int compare(Rank rank1, Rank rank2) {
		return rank2.getScore()-rank1.getScore();
	}
	
}
