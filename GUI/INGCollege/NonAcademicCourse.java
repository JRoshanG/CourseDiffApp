
/**
 * Write a description of class NonAcademicCourse here.
 *
 * @author (Roshan Gautam)
 * @version ()
 */
public class NonAcademicCourse extends Course
{
    // Defining the Seven Attributes of Academic Course 
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    /** The AcademicCourse Constructor accepts four parameters in which 3 parameters are assigned 
        to Course Class and stores the assigned value to six parameters */
    
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID, courseName, duration);
        this.prerequisite = prerequisite;
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
    
    // Creating the Accessor method for Each Attribute
    public String getInstructorName(){
        return instructorName;
    }
    
    public String getStartDate(){
        return startDate;
    }
    
    public String getCompletionDate(){
        return completionDate;
    }
    
    public String getExamDate(){
        return examDate;
    }
    
    public String getPrerequisite(){
        return prerequisite;
    }
    
    public boolean getIsRegistered(){
        return isRegistered;
    }
    
    public boolean getIsRemoved(){
        return isRemoved;
    }
    
    // Setter Method is Created to Register the Instructor Name if not registered yet.
    public void setInstructorName(String instructorName){
        if(isRegistered == false){
            this.instructorName = instructorName;    
        }
        else{
            System.out.println("The Instructor Name Cannot be Changed");
        }
    }
    
    /** The register Method Accepts five parameters to set the detial of courses
        If the Course detail is already registered, appropriate message is Displayed. */
     
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
        if (isRegistered == false){
            setInstructorName(instructorName);
            super.setCourseLeader(courseLeader);
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            this.isRegistered = true;
        }
        else{
            System.out.println("The Course is already Registered");
        }
    }
    
    // Remove Method is used to Removed all the details of Course by Replacing it with "" if not Removed yet.. 
    public void remove(){
        if (isRemoved == true){
            System.out.println("The course has been Already Removed");
        }
        else{
            super.setCourseLeader("");
            this.instructorName = "";
            this.startDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    }
    
    /** Display Method is used to display the Detial of Course.
        Display Method is called from Course Class which displays  CourseID, CourseName, Duration and CourseLeader if Exists.
        If the Course is Registered, Details of Course are Displayed such as Instructor Name, Start, Completion and Exam Date. */

    public void display(){
        super.display();
        if (isRegistered == true){
            System.out.println("The Name of Instructor is: " + getInstructorName());
            System.out.println("The Starting Date of Course is: " + getStartDate());
            System.out.println("The Completion Date of Course is: " + getCompletionDate());
            System.out.println("The Exam Date is: " + getExamDate());
        }
    }
}
