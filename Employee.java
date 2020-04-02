public class Employee {
    //Instance variable
    private int id;
    private String name;
    private int age;
    private String hiredAt;
    private boolean exempt;
    private String jobTitle;

    //constructor, main was giving an error when adding to the arraylist without it
    public Employee(int id, String name, int age, String hiredAt, boolean exempt, String jobTitle){
        this.id = id;
        this.name = name;
        this.age = age;
        this.hiredAt = hiredAt;
        this.exempt = exempt;
        this.jobTitle = jobTitle;
    }
    //Setters
    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setHiredAt(String hiredAt){
        this.hiredAt = hiredAt;
    }
    public void setExempt(Boolean exempt){
        this.exempt = exempt;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    //Getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getHiredAt(){
        return this.hiredAt;
    }
    public boolean getExempt(){
        return this.exempt;
    }
    public String getJobTitle(){
        return this.jobTitle;
    }
    public String toString(){
        if(id <= 0 || (name == null || name.length() < 2) || age < 16 || (jobTitle == null || jobTitle.length() < 5)){
            throw new RuntimeException();
        }
        return String.format("id: %d\n" +
        "name: %s\n" + 
        "age: %d\n" +
        "hiredAt: %s\n" +
        "exempt: %b\n" +
        "jobTitle: %s\n", this.id, this.name, this.age, this.hiredAt, this.exempt, this.jobTitle);
    }
}