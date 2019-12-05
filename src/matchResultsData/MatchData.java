package matchResultsData;
import java.util.ArrayList;


public class MatchData {
 private String match_id;
 private String country_id;
 private String country_name;
 private String league_id;
 private String league_name;
 private String match_date;
 private String match_status;
 private String match_time;
 private String match_hometeam_id;
 private String match_hometeam_name;
 private String match_hometeam_score;
 private String match_awayteam_name;
 private String match_awayteam_id;
 private String match_awayteam_score;
 private String match_hometeam_halftime_score;
 private String match_awayteam_halftime_score;
 private String match_hometeam_extra_score;
 private String match_awayteam_extra_score;
 private String match_hometeam_penalty_score;
 private String match_awayteam_penalty_score;
 private String match_hometeam_system;
 private String match_awayteam_system;
 private String match_live;
 ArrayList < Object > goalscorer = new ArrayList < Object > ();
 ArrayList < Object > cards = new ArrayList < Object > ();
 Substitutions SubstitutionsObject;
 Lineup LineupObject;
 ArrayList < Object > statistics = new ArrayList < Object > ();


 // Getter Methods 

 public String getMatch_id() {
  return match_id;
 }

 public String getCountry_id() {
  return country_id;
 }

 public String getCountry_name() {
  return country_name;
 }

 public String getLeague_id() {
  return league_id;
 }

 public String getLeague_name() {
  return league_name;
 }

 public String getMatch_date() {
  return match_date;
 }

 public String getMatch_status() {
  return match_status;
 }

 public String getMatch_time() {
  return match_time;
 }

 public String getMatch_hometeam_id() {
  return match_hometeam_id;
 }

 public String getMatch_hometeam_name() {
  return match_hometeam_name;
 }

 public String getMatch_hometeam_score() {
  return match_hometeam_score;
 }

 public String getMatch_awayteam_name() {
  return match_awayteam_name;
 }

 public String getMatch_awayteam_id() {
  return match_awayteam_id;
 }

 public String getMatch_awayteam_score() {
  return match_awayteam_score;
 }

 public String getMatch_hometeam_halftime_score() {
  return match_hometeam_halftime_score;
 }

 public String getMatch_awayteam_halftime_score() {
  return match_awayteam_halftime_score;
 }

 public String getMatch_hometeam_extra_score() {
  return match_hometeam_extra_score;
 }

 public String getMatch_awayteam_extra_score() {
  return match_awayteam_extra_score;
 }

 public String getMatch_hometeam_penalty_score() {
  return match_hometeam_penalty_score;
 }

 public String getMatch_awayteam_penalty_score() {
  return match_awayteam_penalty_score;
 }

 public String getMatch_hometeam_system() {
  return match_hometeam_system;
 }

 public String getMatch_awayteam_system() {
  return match_awayteam_system;
 }

 public String getMatch_live() {
  return match_live;
 }

 public Substitutions getSubstitutions() {
  return SubstitutionsObject;
 }

 public Lineup getLineup() {
  return LineupObject;
 }

 // Setter Methods 

 public void setMatch_id(String match_id) {
  this.match_id = match_id;
 }

 public void setCountry_id(String country_id) {
  this.country_id = country_id;
 }

 public void setCountry_name(String country_name) {
  this.country_name = country_name;
 }

 public void setLeague_id(String league_id) {
  this.league_id = league_id;
 }

 public void setLeague_name(String league_name) {
  this.league_name = league_name;
 }

 public void setMatch_date(String match_date) {
  this.match_date = match_date;
 }

 public void setMatch_status(String match_status) {
  this.match_status = match_status;
 }

 public void setMatch_time(String match_time) {
  this.match_time = match_time;
 }

 public void setMatch_hometeam_id(String match_hometeam_id) {
  this.match_hometeam_id = match_hometeam_id;
 }

 public void setMatch_hometeam_name(String match_hometeam_name) {
  this.match_hometeam_name = match_hometeam_name;
 }

 public void setMatch_hometeam_score(String match_hometeam_score) {
  this.match_hometeam_score = match_hometeam_score;
 }

 public void setMatch_awayteam_name(String match_awayteam_name) {
  this.match_awayteam_name = match_awayteam_name;
 }

 public void setMatch_awayteam_id(String match_awayteam_id) {
  this.match_awayteam_id = match_awayteam_id;
 }

 public void setMatch_awayteam_score(String match_awayteam_score) {
  this.match_awayteam_score = match_awayteam_score;
 }

 public void setMatch_hometeam_halftime_score(String match_hometeam_halftime_score) {
  this.match_hometeam_halftime_score = match_hometeam_halftime_score;
 }

 public void setMatch_awayteam_halftime_score(String match_awayteam_halftime_score) {
  this.match_awayteam_halftime_score = match_awayteam_halftime_score;
 }

 public void setMatch_hometeam_extra_score(String match_hometeam_extra_score) {
  this.match_hometeam_extra_score = match_hometeam_extra_score;
 }

 public void setMatch_awayteam_extra_score(String match_awayteam_extra_score) {
  this.match_awayteam_extra_score = match_awayteam_extra_score;
 }

 public void setMatch_hometeam_penalty_score(String match_hometeam_penalty_score) {
  this.match_hometeam_penalty_score = match_hometeam_penalty_score;
 }

 public void setMatch_awayteam_penalty_score(String match_awayteam_penalty_score) {
  this.match_awayteam_penalty_score = match_awayteam_penalty_score;
 }

 public void setMatch_hometeam_system(String match_hometeam_system) {
  this.match_hometeam_system = match_hometeam_system;
 }

 public void setMatch_awayteam_system(String match_awayteam_system) {
  this.match_awayteam_system = match_awayteam_system;
 }

 public void setMatch_live(String match_live) {
  this.match_live = match_live;
 }

 public void setSubstitutions(Substitutions substitutionsObject) {
  this.SubstitutionsObject = substitutionsObject;
 }

 public void setLineup(Lineup lineupObject) {
  this.LineupObject = lineupObject;
 }
}
