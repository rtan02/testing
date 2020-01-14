
public class Classroom {

    private int id;
    private String name;
    private String address;
    private String programName;
    
    public Classroom(){
        
    }
    
    public Classroom(int id, String name, String address, String programName){
        this.id = id;
        this.name = name;
        this.address = address;
        this.programName = programName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getProgramName() {
        return programName;
    }
    
    public void setProgramName(String programName) {
        this.programName = programName;
    }
    
    public String toString() {
        return(id + " " + name + " " + address + " " + programName);
    }
}
