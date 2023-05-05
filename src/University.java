public class University {
   private String namedAfter;
   private int yearOfFound;
   private String headingProf;
   private int studentsQuantity;
   public University(String namedAfter, int yearOfFound, String headingProf, int studentsQuantity){
      this.namedAfter=namedAfter;
      this.yearOfFound=yearOfFound;
      this.headingProf=headingProf;
      this.studentsQuantity=studentsQuantity;
   }

   public String getNamedAfter() {
      return namedAfter;
   }

   public void setNamedAfter(String namedAfter) {
      this.namedAfter = namedAfter;
   }

   public int getYearOfFound() {
      return yearOfFound;
   }

   public void setYearOfFound(int yearOfFound) {
      this.yearOfFound = yearOfFound;
   }

   public String getHeadingProf() {
      return headingProf;
   }

   public void setHeadingProf(String headingProf) {
      this.headingProf = headingProf;
   }

   public int getStudentsQuantity() {
      return studentsQuantity;
   }

   public void setStudentsQuantity(int studentsQuantity) {
      this.studentsQuantity = studentsQuantity;
   }

   @Override
   public String toString() {
      return "University" +
              "namedAfter: " + namedAfter + '\'' +
              "yearOfFound: " + yearOfFound +
              "headingProf: " + headingProf + '\'' +
              "studentsQuantity: " + studentsQuantity;
   }
}
