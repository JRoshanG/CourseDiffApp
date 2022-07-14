
/**
 * Write a description of class Course here.
 *
 * @author (Roshan Gautam)
 * @version (a version number or a date)
 */
public class Course
{
    // Defining the Four Attributes of Course Class
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    
    // Creating a Course Constructor which accepts 3 parameter and Assigning the value for each attribute
    public Course (String courseID, String courseName, int duration){
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }
    
    // Creating a Accessor Method for Each Attribute
    public String getCourseID(){
        return courseID;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public String getCourseLeader(){
        return courseLeader;
    }
    
    public int getDuration(){
        return duration;
    }
    
    // Set method to set the new name of Course Leader
    public void setCourseLeader(String courseLeader){
        this.courseLeader = courseLeader;
    }
    
    //Display method is made to display CourseID, CourseName, Duration and CourseLeader if Exists.
    public void display(){
        System.out.println("ID of Course is: " + getCourseID());
        System.out.println("Name of Course is: " + getCourseName());
        System.out.println("Duration to Complete Course is: " + getDuration());
        if(courseLeader != "")
            System.out.println("Name of Course Leader is: " + getCourseLeader());
        else 
            System.out.println("There is no current Course Leader");
    }
}
