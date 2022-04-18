import java.text.SimpleDateFormat;
import java.util.Date;

class lab33 {
//static block- runs only once when class is loaded
    static{
        System.out.println("\nHello, let's work on static keyword\n");
    }
    public static void main(String args[]){
       
        // Calling static method befor creating obj
        //Member.member("not");
        // Creating Member OBJECT
        Member member1 = new Member(1,"shilpa","Faculty","Christ");
        Member member2 = new Member(2,"Madhura","student","Christ");
        member1.getMemberDetails();
    member2.getMemberDetails();


        //Creating Employee obj
        Employee employee1 = new Employee(1,"vasanth","Kormangala","Faculty"),employee2 = new Employee(2,"sam","Jayanagr","Lab Staff");  
        employee1.getEmpDetails();
        employee2.getEmpDetails();

        //Creating stream obj using ref var
        stream stre = new stream(1,"Science");
        stre.getstreamDetails();

        stream stre1 = stre;
        stre1.getstreamDetails();

        new stream(3,"Commerce").randomstream();
       
       
        //Create a new department obj
        department dep = new department(1,"MCA","SAM");
        dep.getdepartmentDetails();

       
        ////create an array of alumni object
        alumni [] alumArr = new alumni[2];
        //create & initialize actual quipment objects using constructor

        alumArr[0] = new alumni("suman","suman@gmail.com","active");
        alumArr[1] = new alumni("dan","dan@gmail.com","active");


        //display the alumni object data
        alumArr[0].getalumniDetails();
        alumArr[1].getalumniDetails();

        alumni.getInventoryInfo(alumArr);
        alumni.getInventoryInfo(alumArr,"suman");

        //creating Attendance obj
        Attendance today = new Attendance(1,new Date(),new Date());
        today.getAttendanceDetails();


exam.change();//calling change method  
    //creating objects  
    exam s1 = new exam(1,"Mid-sem","java");  
    exam s2 = new exam(2,"CIA","ds");  
    exam s3 = new exam(3,"ESE","ada");  
    //calling display method  
    s1.display();  
    s2.display();  
    s3.display();
    }    
}

class Member{
    int emp_id;
    String emp_name;
    String emp_type;
    String alum_eid;
    int stream_id;
    int dep_id;
    static String clge_name;
    int targetWeight;
    int progress;
    String alum_name;
    String dep_name;
    String hod_name;
    Date start_Date;;
    Date validity;

//Parameterised constructor
public Member(int emp_id,String emp_name,String emp_type,String clge_name)
{
    // constructor chaining
    this(emp_id);

    this.emp_id = emp_id;
    this.emp_name = emp_name;
    this.emp_type = emp_type;
    this.alum_name = alum_name;
    this.stream_id = stream_id;
this.clge_name = clge_name;
}

public Member(int emp_id){

    this();

        this.start_Date = new Date();
}

public Member(){
    System.out.println("new member successfully created");

}


public void getMemberDetails(){
    System.out.println("Member details:\nId : "+emp_id+"\nName : "+emp_name+"\nStart Date: "+start_Date+ "\nCollege name: "+clge_name);
}
//method overloading

}

class Employee{
    int emp_id;//instance variable
  String emp_name;
  String emp_address;
  static String emp_type;
   
    public Employee(int emp_id,String emp_name,String emp_address,String emp_type){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_type = emp_type;
    }

    public void getEmpDetails(){
        System.out.println("\nEmployee Details\nId : "+emp_id+"\nName : "+emp_name+"\nAddress: "+emp_address);
    }

    public void getEmpDetails(String name){
        System.out.println("\nEmployee Details\nId : "+emp_id+"\nName : "+emp_name+"\nAddress: "+emp_address);
    }
}

class stream{

    int stream_id;
  String stream_name;
  String hod_name;

    public stream(int stream_id,String stream_name){
        this.stream_id = stream_id;
        this.stream_name = stream_name;
    }

    public void randomstream(){
        System.out.println("Random stream created");
    }

    public void getstreamDetails(){
        System.out.println("\nStream Details\nStream id : "+stream_id+"\nStream Name : "+stream_name);
    }

}

class department{

     int dep_id;
  String dep_name;
  String hod_name;

    public department(int dep_id,String dep_name,String hod_name){
        this.dep_id = dep_id;
        this.dep_name = dep_name;
        this.hod_name = hod_name;
    }

    public void getdepartmentDetails(){
        System.out.println("\nDepartment Details\nDepartment Id : "+dep_id+"\nDepartment name : "+dep_name+"\nHod name : "+hod_name);
    }
}

class alumni{
      String alum_name;
  String alum_eid;
  String status;

    public alumni(String alum_name,String alum_eid,String status){
        this.alum_name=alum_name;
        this.alum_eid=alum_eid;
        this.status = status;
    }

    public void getalumniDetails(){
        System.out.println("\nAlumni Details\nAlumni name : "+alum_name+"\nAlumni email-id : "+alum_eid+"\nStatus :"+status);
    }

    //method overloading by changing the number of arguments and by changing the data types
    public static void getInventoryInfo(alumni [] alumArr,String alum_name){
        for(alumni element: alumArr){
            if(element.alum_name == alum_name ){
                System.out.println("\n************ Search by name = "+alum_name);
                System.out.println("\nAlumni Email-id : "+element.alum_eid+"\nAlumni name : "+element.alum_name+"\nStatus :"+element.status);            
            }else{
                System.out.println("No  found");
            }
        }
    }

    public static void getInventoryInfo(alumni [] alumArr){
        System.out.println("\n*********** Alumni List\n");
        for (alumni element: alumArr) {
           System.out.println("\n\nAlumni Email-id : "+element.alum_eid+"\nAlumni name : "+element.alum_name+"\nStatus :"+element.status);
        }
        System.out.println("\n");

    }
}

class Attendance{
    int id;
    Date signIn;
    Date signOut;

    public Attendance(int id,Date signIn,Date signOut){
        this.id =id;
        this.signIn = signIn;
        this.signOut = signOut;
    }


    public void getAttendanceDetails(){
        System.out.println("\nAttendance Details\nId : "+id+"\nsignIn : "+signIn+"\nsignOut : "+signOut);
    }
}

class exam{  
     int exam_id;  
     String exam_name;  
     static String subject_name = "java";  
     //static method to change the value of static variable  
     static void change(){  
     subject_name = "Mp";  
     }  
     //constructor to initialize the variable  
     exam(int eid, String ename,String sub_n){  
     exam_id = eid;  
     exam_name = ename;
subject_name = sub_n;  
     }  
     //method to display values  
     void display(){System.out.println(exam_id+" "+exam_name+" "+subject_name);
}  
} 
