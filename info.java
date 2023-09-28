import java.util.Scanner;

public class info {
    String name,section,motto;
    
    public String getName(){
        return name;
    }
    void setName(){
        name = new Scanner(System.in).nextLine();
    }
     public String getSection(){
        return section;
    }
    void setSection(){
        section = new Scanner(System.in).nextLine();
    }
     public String getMotto(){
        return motto;
    }
    void setMotto(){
        motto = new Scanner(System.in).nextLine();
    }
    
    void info(){
        
        System.out.println("Name: " +name);
         System.out.println("Section: " +section);
          System.out.println("Motto: " +motto);
    }

    void setinfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}