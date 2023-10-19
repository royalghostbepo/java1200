
public class Student {


    //id, name, grade
    private long id;

    private String name;

    private Double grade;

    //Default COnstrucctor

    public Student() {
        this.id = 0L;
        this.name = "";
        this.grade = 0.0;
    }


    public Student(String name, double grade) {
        this.id = 0L;
        this.name = name;
        this.grade = grade;
    }

    //getters, setters
    
    public Long getId() {  //getter
        return id;
    }

    public void setId(Long id) {  //setter
        this.id = id;
    }

    public String getName() {
        return name;
    } 
    public void setName(String name) {
        this.name = name;
        }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        if(grade > 0.0 && grade <= 100.0){
            this.grade = grade;
        }
    }
    
    //Display method ...2 print
    System.out.println("Name: " + this.name);
    System.out.println("ID :" + this.id);
    System.out.println("Grade: " + this.grade);


    
}
