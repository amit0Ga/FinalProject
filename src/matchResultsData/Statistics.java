package matchResultsData;

public class Statistics {
	 Team HomeObject;
	 Team AwayObject;

	 public Statistics(Team homeObject,Team awayObject )
	 {
		 HomeObject = homeObject;
		 AwayObject = awayObject;
	 }
	 public void setHomeObject(Team homeObject)
	 {
		 HomeObject = new Team();
		 HomeObject.setBallPossession(homeObject.getBallPossession());
	 }
	 public void setAwayObject(Team awayObject)
	 {
		 
	 }
	public Statistics() {
		// TODO Auto-generated constructor stub
	}

}
