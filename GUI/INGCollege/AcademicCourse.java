
/**
 * Write a description of class AcademicCourse here.
 * Academic Course is a sub class of Courses that has seven attributes.
 * Academic Course is used to Register the Academic Course.
 * @author (Roshan Gautam)
 * @version (a version number or a date)
 */
public class AcademicCourse extends Course
{
    // Defining the Seven Attributes of Academic Course 
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessment;
    private boolean isRegistered;
    
    /** The AcademicCourse Constructor accepts six parameters where 3 parameters are 
        assigned to Course Class and stores the assigned value to seven parameters */
    
    public AcademicCourse(String courseID, String courseName, int duration, String level, String credit,int numberOfAssessment){
        super(courseID, courseName, duration);
        this.level = level;
        this.credit = credit;
        this.numberOfAssessment = numberOfAssessment;
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
    }
    
    // Creating a Accessor Method for Each Attribute
    public String getLecturerName(){
        return lecturerName;
    }

    public String getLevel(){
        return level;
    }
    
    public String getCredit(){
        return credit;
    }
    
    public String getStartingDate(){
        return startingDate;
    }
    
    public String getCompletionDate(){
        return completionDate;
    }
    
    public int getNumberOfAssessment(){
        return numberOfAssessment;
    }
    
    public boolean getIsRegistered(){
        return isRegistered;
    }
    
    // Creating a Setter Method for Lecuture name and Number of Assessment
    public void setLectureName(String lecturerName){
        this.lecturerName = lecturerName;
    }
    
    public void setNumberOfAssessment(int numberOfAssessment){
        this.numberOfAssessment = numberOfAssessment;
    }
    
    /** The Method register accepts Four parameter to register the academic course.
     If the coure exists then Instructor Name, Starting Date and Completion Date is Printed.
     Where as if course is not registered yet, All of Four parament is stored with their Respective Attributes
     And CourseLeader Name is set in setCourseLeader Method of Course Class*/

    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){
        if(isRegistered == true)
        {
            System.out.println("Name of Instructor: " + getLecturerName());
            System.out.println("Starting Date is " + getStartingDate());
            System.out.println("Completion Date is " + getCompletionDate());
        }
        else
        {
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }
    }
    
    /** Display Method is used to display the Detial of Course.
        Display Method is called from Course Class which displays  CourseID, CourseName, Duration and CourseLeader if Exists.
        If the Course is Registered, Details of Course are Displayed. */
    
    public void display(){
        super.display();
        if (isRegistered == true){
            System.out.println("The Name of Lecturer is: " + getLecturerName());
            System.out.println("The level is: " + getLevel());
            System.out.println("The Credit is: " + getCredit());
            System.out.println("The Starting Date of Course is: " + getStartingDate());
            System.out.println("The Completion Date is: " + getCompletionDate());
            System.out.println("Number of Assessment is: " + getNumberOfAssessment());
        }
    }
}
