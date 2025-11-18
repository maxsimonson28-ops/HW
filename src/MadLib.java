public class MadLib {
    public int wholeNumberBetween1And4;
    public String classmate;
    public String city;
    public String noun;
    public String pluralNoun;
    public double decimalBiggerThan1;
    public String adjective;
    public int number1;
    public String pluralAnimal;
    public String miltonTeacher;
    public boolean trueOrFalse;
    public String season;
    public String miltonDean;
    public int number2;
    public String letterGrade;


 public static void main(String[] args) {
     MadLib myStory = new MadLib();
 }
 public MadLib(){
   wholeNumberBetween1And4 = 3;
   classmate = "Max";
   city = "Boston";
   noun = "tissue";
   pluralNoun = "gloves";
   decimalBiggerThan1 = 24.43;
   adjective = "purple";
   number1 = 3289;
   pluralAnimal = "iguanas";
   miltonTeacher = "Mr.Hales";
   trueOrFalse = true;
   season = "spring";
   miltonDean = "Ms. Sugrue";
   number2 = 38923;
   letterGrade = "A++";

    System.out.println("hello world");
    String story = "This weekend I am going camping with "
            +classmate+ ". We are going to a campsite in "
            +city+ ". I packed my "+noun+ " and "
            +pluralNoun + ".  The forecast is calling for a high of "
            +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
            +adjective+" day! This year, the park rangers have seen "
            +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
            +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
            +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
            +miltonDean+ " said it actually has only happened "
            + number2+" times. Wish us luck! If we survive, we will earn a "
            +letterGrade+ "- in P.E. class.";




//now print story to the dos window
        System.out.println(story);

}
}
