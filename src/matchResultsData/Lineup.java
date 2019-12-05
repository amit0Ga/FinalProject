package matchResultsData;
public class Lineup {
 Lineup HomeObject;
 Away AwayObject;


 // Getter Methods 

 public Lineup getHome() {
  return HomeObject;
 }

 public Away getAway() {
  return AwayObject;
 }

 // Setter Methods 

 public void setHome(Lineup homeObject) {
  this.HomeObject = homeObject;
 }

 public void setAway(Away awayObject) {
  this.AwayObject = awayObject;
 }
}