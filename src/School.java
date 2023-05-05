public class School {
   private String schoolName;
   private int yearOfFound;
   private String heading;
   private int pupilsQuantity;


   public String getSchoolName() {
      return schoolName;
   }

   public void setSchoolName(String schoolName) {
      this.schoolName = schoolName;
   }

   public int getYearOfFound() {
      return yearOfFound;
   }

   public void setYearOfFound(int yearOfFound) {
      this.yearOfFound = yearOfFound;
   }

   public String getHeading() {
      return heading;
   }

   public void setHeading(String heading) {
      this.heading = heading;
   }

   public int getPupilsQuantity() {
      return pupilsQuantity;
   }

   public void setPupilsQuantity(int pupilsQuantity) {
      this.pupilsQuantity = pupilsQuantity;
   }

   @Override
   public String toString() {
      return "School: " +
              "schoolName: " + schoolName + '\'' +
              "yearOfFound: " + yearOfFound +
              "heading: " + heading + '\'' +
              "pupilsQuantity: " + pupilsQuantity;
   }
}
