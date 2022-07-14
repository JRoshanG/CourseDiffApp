
/**
    * This Class contains a GUI with which the users can easily Register Academic Course and Non Academic Course,
    * This program also allows users to Remove the Non Academic Course if needed.
    * @author (Roshan Gautam)
    * Group N2
    * @College ID (20049215)
    * Report File Name:       20049215 Roshan Gautam
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class INGCollege
{
    // Frame Declaration and Menu Bar
    JFrame jf, jfResult;
    JPanel jWelcometoCourse, jAcademicCourse;
    Font ff, ft, fb, fr;
    JMenuBar jmb;
    JMenu file;
    JMenuItem academicCourse, nonAcademicCourse, exitApp;
    
    // JDeclaring Label and Button for Welcome Screen
    JLabel homeWelcome, homeSelect, homeAcademicCourse, homeNonAcademicCourse;
    JButton btnHacademicCourse, btnHnonAcademicCourse, btnHhelp, btnHexit;
    
    //Declaring JLabel, JTextField and Button for Academic Course
    JLabel lblAcademicCourse, lblAcourseID, lblAcourseName, lblAduration, lblAlevel, lblAcredit, lblAnumOfAssessment, lblAnumOfAssessment2, lblAcourseID2, lblAcourseLeader, lblAlecturerName, lblAstartingDate, lblAcompletionDate, lblAcompletionDate2;
    JTextField txtAcourseID, txtAcourseName, txtAduration, txtAlevel, txtAcredit, txtAnumOfAssessment, txtAcourseID2, txtAcourseLeader, txtAlecturerName, txtAstartingDate, txtAcompletionDate;
    JButton btnAadd, btnAregister, btnAdisplay, btnAclear;
    
    // Declaring JLabel, TextField and Button for Non Academic Course
    JPanel jNonAcademicCourse;
    JLabel lblNonAcademicCourse, lblNAcourseID, lblNAcourseName, lblNAduration, lblNAprerequisite, lblNAinstructorName, lblNAinstructorName2, lblNAcompletionDate, lblNAcompletionDate2, lblNAstartDate, lblNAcourseLeader, lblNAexamDate, lblNAcourseID2;
    JTextField txtNAcourseID, txtNAcourseName, txtNAduration, txtNAprerequisite, txtNAinstructorName, txtNAcompletionDate, txtNAstartDate, txtNAcourseLeader, txtNAexamDate, txtNAcourseID2;
    JButton btnNAadd, btnNAregister, btnNAremove, btnNAdisplay, btnNAclear;
        

    public INGCollege(){
        
        //Creating a Frame
        jf = new JFrame("Course Registration");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        
        // Creating a Frame for Result
        jfResult = new JFrame("Display");
        
        // Creating a Font for Both Academic Course and Non_Academic Course
        ff = new Font("Calibri",Font.PLAIN,18);
        ft = new Font("Calibri",Font.PLAIN,25);
        fb = new Font("Calibri",Font.PLAIN,15);
        fr = new Font("Calibri",Font.PLAIN,13);
        
        // Creating Menu Bar
        jmb = new JMenuBar();
        jf.setJMenuBar(jmb);
        
        // Creating Menu
        file = new JMenu("Course");
        jmb.add(file);
        
        //Creating Menu Item
        academicCourse = new JMenuItem("Academic Course");
        nonAcademicCourse = new JMenuItem("Non Academic Course");
        exitApp = new JMenuItem("Exit");
        
        // Adding MenuItems in Menu and Adding Seperator
        file.add(academicCourse);
        file.addSeparator();
        file.add(nonAcademicCourse);
        file.addSeparator();
        file.add(exitApp);
        
        // Creating a Panel for Welcome to Course Registration
        jWelcometoCourse = new JPanel();
        

        // Adding Welcome Screen Label to Course Registration Panel
        homeWelcome = new JLabel("Welcome  to  Course  Registration");
        homeWelcome.setBounds(90,10,600,30);
        Font hf = new Font("Calibri",Font.PLAIN,30);
        homeWelcome.setBackground(Color.RED);
        homeWelcome.setFont(hf);
        jWelcometoCourse.add(homeWelcome);
        
        // Adding Select Course Label
        homeSelect = new JLabel ("Select Course Below to Register");
        homeSelect.setBounds(125,75,600,25);
        homeSelect.setFont(ft);
        jWelcometoCourse.add(homeSelect);
        
        // Adding Academic Course Label
        homeAcademicCourse = new JLabel("For Academic Course");
        homeAcademicCourse.setBounds(70,125,600,20);
        homeAcademicCourse.setFont(ff);
        jWelcometoCourse.add(homeAcademicCourse);
        
        // Adding Non Academic Course Label
        homeNonAcademicCourse = new JLabel("For Non Academic Course");
        homeNonAcademicCourse.setBounds(70,165,600,20);
        homeNonAcademicCourse.setFont(ff);
        jWelcometoCourse.add(homeNonAcademicCourse);
        
        // Adding Buttons on Welcome Screen
        btnHacademicCourse = new JButton("Academic Course");
        btnHacademicCourse.setBounds( 300,125,250,20);
        btnHacademicCourse.setFont(ff);
        jWelcometoCourse.add(btnHacademicCourse);
        
        // Button For Home Registration Course
        btnHnonAcademicCourse = new JButton("Non Academic Course");
        btnHnonAcademicCourse.setBounds(300,165,250,20);
        btnHnonAcademicCourse.setFont(ff);
        jWelcometoCourse.add(btnHnonAcademicCourse);
        
        btnHhelp = new JButton("Help /  Contact Info");
        btnHhelp.setBounds(70,255,485,25);
        btnHhelp.setFont(ff);
        jWelcometoCourse.add(btnHhelp);
        
        btnHexit = new JButton("Exit Course Registration");
        btnHexit.setBounds(70,305,485,25);
        btnHexit.setFont(ff);
        jWelcometoCourse.add(btnHexit);
        
        // Adding Properties to Welcome to Course Registration
        jWelcometoCourse.setLayout(null);
        jWelcometoCourse.setBounds(0,0,600,450);
        jWelcometoCourse.setVisible(true);
        
        // Adding WelcometoCourse to Main Frame
        jf.add(jWelcometoCourse);
        
        // Creating a Panel For Academic Course
        jAcademicCourse = new JPanel();
        jAcademicCourse.setLayout(null);
        jAcademicCourse.setBounds(0,0,600,450);
        jAcademicCourse.setVisible(false);
               
        // Creating a Title for Academic Course
        lblAcademicCourse = new JLabel("Academic Course");
        lblAcademicCourse.setBounds(200,10,300,25);
        lblAcademicCourse.setFont(ft);
        jAcademicCourse.add(lblAcademicCourse);
        
        /* Creating all the Necessary Label and Text Field 
        for Academic Course */
        
        // Adding CourseID Label AND TextField on Academic Course
        lblAcourseID = new JLabel("Course ID");
        JTextField txtAcourseID = new JTextField();
        lblAcourseID.setBounds(20,60,150,20);
        txtAcourseID.setBounds(110,60,150,20);
        lblAcourseID.setFont(ff);
        jAcademicCourse.add(lblAcourseID);
        jAcademicCourse.add(txtAcourseID);
    
        // Adding CourseName Label And TextField on Academic Course
        lblAcourseName = new JLabel("Course Name");
        txtAcourseName = new JTextField();
        lblAcourseName.setBounds(290,60,150,20);
        txtAcourseName.setBounds(410,60,150,20);
        lblAcourseName.setFont(ff);
        jAcademicCourse.add(lblAcourseName);
        jAcademicCourse.add(txtAcourseName);
        
        // Adding Duration Label And TextField on Academic Course
        lblAduration = new JLabel("Duration");        
        txtAduration = new JTextField();
        lblAduration.setBounds(25,100,150,20);
        txtAduration.setBounds(110,100,150,20);
        lblAduration.setFont(ff);
        jAcademicCourse.add(lblAduration);
        jAcademicCourse.add(txtAduration);
        
        // Adding Level Label and TextField on Academic Course
        lblAlevel = new JLabel("Level");
        txtAlevel = new JTextField();
        lblAlevel.setBounds(350,100,150,20);
        txtAlevel.setBounds(410,100,150,20);
        lblAlevel.setFont(ff);
        jAcademicCourse.add(txtAlevel);
        jAcademicCourse.add(lblAlevel);
        
        // Adding Credit Label and TextField on Academic Course
        lblAcredit = new JLabel("Credit");
        txtAcredit = new JTextField();
        lblAcredit.setBounds(43,135,150,20);
        txtAcredit.setBounds(110,135,150,20);
        lblAcredit.setFont(ff);
        jAcademicCourse.add(lblAcredit);
        jAcademicCourse.add(txtAcredit);
        
        // Adding Number of Assessment Label and TextField on Academic Course
        lblAnumOfAssessment = new JLabel("Number of");
        lblAnumOfAssessment2 = new JLabel("Assessment");
        txtAnumOfAssessment = new JTextField();
        lblAnumOfAssessment.setBounds(300,135,250,20);
        lblAnumOfAssessment2.setBounds(300,155,250,20);
        txtAnumOfAssessment.setBounds(410,135,150,20);
        lblAnumOfAssessment.setFont(ff);
        lblAnumOfAssessment2.setFont(ff);
        jAcademicCourse.add(lblAnumOfAssessment);
        jAcademicCourse.add(lblAnumOfAssessment2);
        jAcademicCourse.add(txtAnumOfAssessment);
        
        // Adding CourseID Label and TextField
        lblAcourseID2 = new JLabel("Course ID");
        txtAcourseID2 = new JTextField();
        lblAcourseID2.setBounds(20,210,150,20);
        txtAcourseID2.setBounds(110,210,150,20);
        lblAcourseID2.setFont(ff);
        jAcademicCourse.add(lblAcourseID2);
        jAcademicCourse.add(txtAcourseID2);
        // Adding CourseLeader Label and TextField in Academic Course
        lblAcourseLeader = new JLabel("Course Leader");
        txtAcourseLeader = new JTextField();
        lblAcourseLeader.setBounds(290,210,150,20);
        txtAcourseLeader.setBounds(410,210,150,20);
        lblAcourseLeader.setFont(ff);
        jAcademicCourse.add(lblAcourseLeader);
        jAcademicCourse.add(txtAcourseLeader);
        
        // Adding LecturerName Label and TextField in Academic Course
        lblAlecturerName = new JLabel("Lecturer");
        txtAlecturerName = new JTextField();
        lblAlecturerName.setBounds(20,250,150,20);
        txtAlecturerName.setBounds(110,250,150,20);
        lblAlecturerName.setFont(ff);
        jAcademicCourse.add(lblAlecturerName);
        jAcademicCourse.add(txtAlecturerName);
    
        // Adding Starting Date Label and TextField in Academic Course
        lblAstartingDate = new JLabel("Starting Date");
        txtAstartingDate = new JTextField();
        lblAstartingDate.setBounds(290,250,150,20);
        txtAstartingDate.setBounds(410,250,150,20);
        lblAstartingDate.setFont(ff);
        jAcademicCourse.add(lblAstartingDate);
        jAcademicCourse.add(txtAstartingDate);
    
        // Adding Completion Date Label and TextField in Academic Course
        lblAcompletionDate = new JLabel("Completion");
        lblAcompletionDate2 = new JLabel("Date");
        txtAcompletionDate = new JTextField();
        lblAcompletionDate.setBounds(10,290,150,20);
        lblAcompletionDate2.setBounds(10,310,150,20);
        txtAcompletionDate.setBounds(110,290,150,20);
        lblAcompletionDate.setFont(ff);
        lblAcompletionDate2.setFont(ff);
        jAcademicCourse.add(lblAcompletionDate);
        jAcademicCourse.add(lblAcompletionDate2);
        jAcademicCourse.add(txtAcompletionDate);
            
        // Creating a Array for ArrayList of AcademicCourse
        ArrayList <Course> AcademicCourseList = new ArrayList <Course>();
        
        // Creating the Buttons Required for Academic Course
        
        // Adding the Add Button in Academic Course
        btnAadd = new JButton("Add");
        btnAadd.setBounds(410,170,150,25);
        btnAadd.setFont(fb);
        jAcademicCourse.add(btnAadd);
        
        btnAadd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                
                String courseID, courseName, level, credit;
                int duration, numOfAssessment;
                boolean checkInt = false;
                boolean check = false;
                duration = 0;
                numOfAssessment = 0;
                if (txtAcourseID.getText().isEmpty() || txtAcourseName.getText().isEmpty() || txtAlevel.getText().isEmpty() || txtAcredit.getText().isEmpty() || txtAduration.getText().isEmpty() || txtAnumOfAssessment.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(jf,"All of the Field are Required","Aleart",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    courseID = txtAcourseID.getText();
                    courseName = txtAcourseName.getText();
                    level = txtAlevel.getText();
                    credit = txtAcredit.getText();
                    
                    try{
                        duration = Integer.parseInt(txtAduration.getText());
                        numOfAssessment = Integer.parseInt(txtAnumOfAssessment.getText());  
                        checkInt = true;
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(jf,"Input Valid Value in Duration or Number of Assessment","Aleart",JOptionPane.WARNING_MESSAGE);
                    }
                    
                    // Checking If CourseID has been Added
                    for (Course ac: AcademicCourseList){
                        if(ac.getCourseID().equals(courseID)){
                            check = true;
                            break;
                        }
                    }
                    
                    // Adding AcademicCourse Details
                    if(check == false && checkInt == true){
                        AcademicCourse aCourse = new AcademicCourse(courseID, courseName, duration,level, credit, numOfAssessment);
                        AcademicCourseList.add(aCourse);
                        JOptionPane.showMessageDialog(jf,"Academic Course with Course ID "+ courseID + " has Been Successfully Added");   
                    }                    
                    else if (checkInt == true) {
                            JOptionPane.showMessageDialog(jf,"Academic Course with Course ID "+ courseID +" is already Added");
                    }
                }
            }
        });
        
        
        // Adding the Register Button in Academic Course
        btnAregister = new JButton("Register");
        btnAregister.setBounds(410,290,150,25);
        btnAregister.setFont(fb);
        jAcademicCourse.add(btnAregister);

        btnAregister.addActionListener ( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String courseID, courseLeader, lecturerName, startingDate, completionDate;
                boolean isRegistered = false;
                if ( txtAcourseID2.getText().isEmpty() || txtAcourseLeader.getText().isEmpty() || txtAlecturerName.getText().isEmpty() || txtAstartingDate.getText().isEmpty() || txtAcompletionDate.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(jf,"All of the Field are Required","Aleart",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    courseID = txtAcourseID2.getText();
                    courseLeader = txtAcourseLeader.getText();
                    lecturerName = txtAlecturerName.getText();
                    startingDate = txtAstartingDate.getText();
                    completionDate = txtAcompletionDate.getText();
                    
                    int i = 0;
                    for ( Course ac : AcademicCourseList){
                        if(ac.getCourseID().equals(courseID)){
                            AcademicCourse acGet = (AcademicCourse)(AcademicCourseList.get(i));
                            isRegistered = true;
                            if (!acGet.getIsRegistered()){
                                acGet.register(courseLeader, lecturerName, startingDate, completionDate);
                                JOptionPane.showMessageDialog(jf,"Academic Course with Course ID "+ courseID +" is Registered Successful");
                            }
                            else{
                                JOptionPane.showMessageDialog(jf,"Academic Course with Course ID "+ courseID +" is Already Registered");
                            }
                        }
                        i = i + 1;
                    }
                    
                    if (isRegistered == false){
                        JOptionPane.showMessageDialog(jf,"Academic Course with CourseID " + courseID + " cannot be Registered Yet");
                    }
                }
            }
        });
        
        // Adding Display Button in Academic Course
        btnAdisplay = new JButton("Display");
        btnAdisplay.setBounds(150,340,150,25);
        btnAdisplay.setFont(fb);
        jAcademicCourse.add(btnAdisplay);
        
        btnAdisplay.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                if (AcademicCourseList.size() == 0){
                    JOptionPane.showMessageDialog(jf,"No Course added Yet");
                }
                else{
                    int i = 0;
                    for (Course ac : AcademicCourseList){
                        AcademicCourse acGet = (AcademicCourse) (AcademicCourseList.get(i));
                        acGet.display();
                        i = i + 1;
                    }                
                }
            }
        });
        
        
        //Adding Clear Button in Academic Course
        btnAclear = new JButton("Clear");
        btnAclear.setBounds(330,340,150,25);
        btnAclear.setFont(fb);
        jAcademicCourse.add(btnAclear);
        
        btnAclear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                txtAcourseID.setText("");
                txtAcourseName.setText("");
                txtAduration.setText("");
                txtAlevel.setText("");
                txtAcredit.setText("");
                txtAnumOfAssessment.setText("");
                txtAcourseLeader.setText("");
                txtAlecturerName.setText("");
                txtAstartingDate.setText("");
                txtAcompletionDate.setText("");
                txtAcourseID2.setText("");
            }
        });  
        
        //Adding Academic Course Panel to Frame
        jf.add(jAcademicCourse);
        
        // Creating a Panel For Non-Academic Course
        jNonAcademicCourse = new JPanel();
        jNonAcademicCourse.setBounds(0,0,600,500);
        jNonAcademicCourse.setVisible(false);
        jNonAcademicCourse.setLayout(null);
                
        // Adding Title in Non-Academic Course
        lblNonAcademicCourse = new JLabel("Non Academic Course");
        lblNonAcademicCourse.setBounds(200,10,300,25);
        lblNonAcademicCourse.setFont(ft);
        jNonAcademicCourse.add(lblNonAcademicCourse);
        
        /* Creating all the Necessary Label and TextField for 
           Non-Academic Course*/
           
        // Adding the Course ID Label and TextField in Non-Academic Course
        lblNAcourseID = new JLabel("Course ID");
        txtNAcourseID = new JTextField();
        lblNAcourseID.setBounds(20,50,150,20);
        txtNAcourseID.setBounds(110,50,150,20);
        lblNAcourseID.setFont(ff);
        jNonAcademicCourse.add(lblNAcourseID);
        jNonAcademicCourse.add(txtNAcourseID);
                
        // Adding the Course Name Label and TextField in Non-Academic Course Panel
        lblNAcourseName = new JLabel("Course Name");
        txtNAcourseName = new JTextField();
        lblNAcourseName.setBounds(290,50,150,20);
        txtNAcourseName.setBounds(410,50,150,20);
        lblNAcourseName.setFont(ff);
        jNonAcademicCourse.add(lblNAcourseName);
        jNonAcademicCourse.add(txtNAcourseName);
        
        // Adding the Duration Label and TextField in Non-Academic Course
        lblNAduration = new JLabel("Duration");
        txtNAduration = new JTextField();
        lblNAduration.setBounds(25,90,150,20);
        txtNAduration.setBounds(110,90,150,20);
        lblNAduration.setFont(ff);
        jNonAcademicCourse.add(lblNAduration);
        jNonAcademicCourse.add(txtNAduration);
        
        // Adding the Prerequisite Label and TextField in Non-Academic Course
        lblNAprerequisite = new JLabel("Prerequisite");
        txtNAprerequisite = new JTextField();
        lblNAprerequisite.setBounds(303,90,150,20);
        txtNAprerequisite.setBounds(410,90,150,20);
        lblNAprerequisite.setFont(ff);
        jNonAcademicCourse.add(lblNAprerequisite);
        jNonAcademicCourse.add(txtNAprerequisite);
        
        //Adding CourseID for Registration
        lblNAcourseID2 = new JLabel("Course ID to Register Or Remove");
        txtNAcourseID2 = new JTextField();
        lblNAcourseID2.setBounds(20,285,250,20);
        txtNAcourseID2.setBounds(275,285,120,20);
        lblNAcourseID2.setFont(ff);
        jNonAcademicCourse.add(lblNAcourseID2);
        jNonAcademicCourse.add(txtNAcourseID2);
        
        // Adding the Instructor Name and TextField in Non-Academic Course
        lblNAinstructorName = new JLabel("Instructor");
        lblNAinstructorName2 = new JLabel("Name");
        txtNAinstructorName = new JTextField();
        lblNAinstructorName.setBounds(20,160,150,20);
        lblNAinstructorName2.setBounds(20,180,150,20);
        txtNAinstructorName.setBounds(110,160,150,20);
        lblNAinstructorName.setFont(ff);
        lblNAinstructorName2.setFont(ff);
        jNonAcademicCourse.add(lblNAinstructorName);
        jNonAcademicCourse.add(lblNAinstructorName2);
        jNonAcademicCourse.add(txtNAinstructorName);
        
        // Adding StartDate Label And TextField for Non-Academic Course
        lblNAstartDate = new JLabel("Start Date");
        txtNAstartDate = new JTextField();
        lblNAstartDate.setBounds(20,210,150,20);
        txtNAstartDate.setBounds(110,210,150,20);
        lblNAstartDate.setFont(ff);
        jNonAcademicCourse.add(lblNAstartDate);
        jNonAcademicCourse.add(txtNAstartDate);
        
        // Addimg Lecturer Label And TextFlield for Non-Academic Course 
        lblNAcourseLeader = new JLabel("Course Leader");
        txtNAcourseLeader = new JTextField();
        lblNAcourseLeader.setBounds(290,210,150,20);
        txtNAcourseLeader.setBounds(410,210,150,20);
        lblNAcourseLeader.setFont(ff);
        jNonAcademicCourse.add(txtNAcourseLeader);
        jNonAcademicCourse.add(lblNAcourseLeader);
        
        // Adding CompletionDate and TextField for Non-Academic Course
        lblNAcompletionDate = new JLabel("Completion");
        lblNAcompletionDate2 = new JLabel("Date");
        txtNAcompletionDate = new JTextField();
        lblNAcompletionDate.setBounds(300,160,150,20);
        lblNAcompletionDate2.setBounds(300,180,150,20);
        txtNAcompletionDate.setBounds(410,160,150,20);
        lblNAcompletionDate.setFont(ff);
        lblNAcompletionDate2.setFont(ff);
        jNonAcademicCourse.add(lblNAcompletionDate);
        jNonAcademicCourse.add(lblNAcompletionDate2);
        jNonAcademicCourse.add(txtNAcompletionDate);
        
        // Adding the Exam Date Label and TextField on Non-Academic Course
        lblNAexamDate = new JLabel("Exam Date");
        txtNAexamDate = new JTextField();
        lblNAexamDate.setBounds(18,250,150,20);
        txtNAexamDate.setBounds(110,250,150,20);
        lblNAexamDate.setFont(ff);
        jNonAcademicCourse.add(lblNAexamDate);
        jNonAcademicCourse.add(txtNAexamDate);
        
        //ArrayList for NonAcademicCourse 
        ArrayList <Course> NonAcademicCourseList = new ArrayList <Course>();

        // Creating all the Required Button in Non-Academic Course
        
        // Adding Add Button for Non-Academic Course
        btnNAadd = new JButton("Add");
        btnNAadd.setBounds(410,120,150,25);
        btnNAadd.setFont(fb);
        jNonAcademicCourse.add(btnNAadd);
        
        btnNAadd.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                String courseID, courseName, prerequisite;
                int duration;
                boolean checkInt = false;
                boolean check = false;
                duration = 0;
                if (txtNAcourseID.getText().isEmpty() || txtNAcourseName.getText().isEmpty() || txtNAduration.getText().isEmpty() || txtNAprerequisite.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jf,"All of The Field are Required","Aleart",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    courseID = txtNAcourseID.getText();
                    courseName = txtNAcourseName.getText();
                    prerequisite = txtNAprerequisite.getText();  
                    try{
                        duration = Integer.parseInt(txtNAduration.getText());
                        checkInt = true;
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(jf,"Please Enter Valid Input","Aleart",JOptionPane.WARNING_MESSAGE);
                    }
                    for ( Course nac : NonAcademicCourseList){
                        if (nac.getCourseID().equals(courseID)){
                            check = true;
                            break;
                        }
                    }  
                    if (check == false && checkInt == true){
                        NonAcademicCourse nacCourse = new NonAcademicCourse(courseID,courseName,duration,prerequisite);
                        NonAcademicCourseList.add(nacCourse);
                        JOptionPane.showMessageDialog(jf,"Non Academic Course with Course ID "+courseID+" has Been Successfully Added.");   
                    }
                    else if (checkInt == true){
                        JOptionPane.showMessageDialog(jf,"Non Academic Course with Course ID "+courseID+" is Already Added");
                    }
                }
            }
        });
        
        //Adding Register Button for Non-Academic Course
        btnNAregister = new JButton("Register");
        btnNAregister.setBounds(410,245,150,25);
        btnNAregister.setFont(fb);
        jNonAcademicCourse.add(btnNAregister);
        
        btnNAregister.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                String courseID, courseLeader, instructorName, startDate, completionDate, examDate;
                boolean isRegistered = false;
                if (txtNAcourseID2.getText().isEmpty() || txtNAcourseLeader.getText().isEmpty() || txtNAinstructorName.getText().isEmpty() || txtNAstartDate.getText().isEmpty() || txtNAcompletionDate.getText().isEmpty() || txtNAexamDate.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jf,"All Field are Required","Aleart",JOptionPane.WARNING_MESSAGE);   
                }
                else{
                    courseID = txtNAcourseID2.getText();
                    courseLeader = txtNAcourseLeader.getText();
                    instructorName = txtNAinstructorName.getText();
                    startDate = txtNAstartDate.getText();
                    completionDate = txtNAcompletionDate.getText();
                    examDate = txtNAexamDate.getText();
                    int i = 0;
                    for (Course nac : NonAcademicCourseList){
                        if (nac.getCourseID().equals(courseID)){
                            NonAcademicCourse nacGet = (NonAcademicCourse)(NonAcademicCourseList.get(i));
                            isRegistered = true;
                            if(!nacGet.getIsRegistered()){
                                nacGet.register(courseLeader, instructorName, startDate, completionDate, examDate);
                                JOptionPane.showMessageDialog(jf,"Non Academic Course with Course ID "+ courseID +" is Registered Successful");
                            }
                            else{
                                JOptionPane.showMessageDialog(jf,"Non Academic Course with Course ID " +courseID+ "  is Already Registered");
                            }
                        }
                        i = i + 1;
                    }
                    if (isRegistered == false){
                        JOptionPane.showMessageDialog(jf,"Non Academic Course with CourseID "+courseID+" cannot been Registered Yet");
                    }
                }
            }
        });
        
        //Adding Remove Button for Non-Academic Course
        btnNAremove = new JButton("Remove");
        btnNAremove.setBounds(410,280,150,25);
        btnNAremove.setFont(fb);
        jNonAcademicCourse.add(btnNAremove);
        
        btnNAremove.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e){
                if (txtNAcourseID2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jf,"Course ID cannot Be Empty","Aleartt",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    int a=JOptionPane.showConfirmDialog(jf,"Are you sure you want to Remove?","Remove",JOptionPane.YES_NO_OPTION);
                    if(a == JOptionPane.YES_OPTION){
                    String courseID = txtNAcourseID2.getText();
                    Iterator<Course> itr = NonAcademicCourseList.iterator();
                    boolean recordFound = false;
                    while(itr.hasNext()){
                        Course c = itr.next();
                        if (c.getCourseID().equals(courseID)){
                            recordFound = true;
                            NonAcademicCourse nac = (NonAcademicCourse) c;
                            if (!nac.getIsRemoved()){
                                nac.remove();
                            }
                            itr.remove();
                            JOptionPane.showMessageDialog(jf,"Non Academic Course with Course ID " +courseID+ " has Been Sucessful Removed");
                        }
                    }
                    
                    if (recordFound == false){
                        JOptionPane.showMessageDialog(jf,"Course ID " +courseID+ " Not Found");                        
                    }
                    }
                }
            }
        });
        
        // Adding Display Button in Academic Course
        btnNAdisplay = new JButton("Display");
        btnNAdisplay.setBounds(150,330,150,25);
        btnNAdisplay.setFont(fb);
        jNonAcademicCourse.add(btnNAdisplay);
        
        btnNAdisplay.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String prerequisite; 
                if (NonAcademicCourseList.size() == 0){
                    JOptionPane.showMessageDialog(jf,"No Course Registered Yet");
                }
                else{
                    int i = 0;
                    for (Course nac : NonAcademicCourseList){
                        NonAcademicCourse nacGet = (NonAcademicCourse) (NonAcademicCourseList.get(i));
                        nacGet.display();
                        prerequisite = nacGet.getPrerequisite();
                        System.out.println("The Prerequisite is: "+ prerequisite);
                        i = i + 1;
                    }  
                }
            }
        });
                
        //Adding Clear Button in Academic Course
        btnNAclear = new JButton("Clear");
        btnNAclear.setBounds(330,330,150,25);
        btnNAclear.setFont(fb);
        jNonAcademicCourse.add(btnNAclear);
        
        btnNAclear.addActionListener (new ActionListener() {
            public void actionPerformed( ActionEvent e){
                txtNAcourseID.setText("");
                txtNAcourseName.setText("");
                txtNAduration.setText("");
                txtNAprerequisite.setText("");
                txtNAinstructorName.setText("");
                txtNAstartDate.setText("");
                txtNAcompletionDate.setText("");
                txtNAexamDate.setText("");
                txtNAcourseID2.setText("");
                txtNAcourseLeader.setText("");
            }
        });
        
        // Adding NonAcademic Course Panel to Frame
        jf.add(jNonAcademicCourse);
        
        // Event Handling for JavaMenu 
        exitApp.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e){
                int a=JOptionPane.showConfirmDialog(jf,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
                if(a== JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        
        nonAcademicCourse.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jNonAcademicCourse.setVisible(true);
                jAcademicCourse.setVisible(false);
            }
        });         
        
        academicCourse.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jAcademicCourse.setVisible(true);
                jNonAcademicCourse.setVisible(false);
            }
        });       
        
        btnHacademicCourse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jAcademicCourse.setVisible(true);
                jWelcometoCourse.setVisible(false);
            }
        });
        
        btnHnonAcademicCourse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jNonAcademicCourse.setVisible(true);
                jWelcometoCourse.setVisible(false);
            }
        });
        
        btnHexit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a=JOptionPane.showConfirmDialog(jf,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
                if(a== JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        
        btnHhelp.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(jf,"For any help on this Application or incase of any queries Contact: np01nt4s210047@islingtoncollege.edu.np");
            }
        });        
        
        //Adding Properties to jfResult
        jfResult.setResizable(false);
        jfResult.setLayout(null);
        jfResult.setSize(600,450);
        
        // Adding Properties to Frame
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setSize(600,450);
        jf.setVisible(true);
        
    }
    
    public static void main(String[] args){
        new INGCollege();
    }
}
