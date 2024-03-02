/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8feb;

/**
 *
 * @author ahmed
 */
class animal{
    void eat(){
        System.out.println("animal is eating");
        
    }
}
    class cat extends animal{

       void eat(){
           super.eat();
       // System.out.println("animal is eating");
        
    }

    }//end animal class
class PetCat extends cat{
    void eat(){
        super.eat();
    }
    
} //end class petcat

class student{
    int rollNo;
    String name;
    static String collegename = "vanier";
    
    static void change(){ //non static variables cant be accessed inside static methodes
        collegename = "mtl";
        System.out.println("mtl college");
    }

    public student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    void display (){
        System.out.println("Student name "+name+"\n rollno is "+rollNo+" \n college "+collegename);
    }
}//end of class student

class counter{
    
    static int count = 0 ;
    
    counter(){
        count++;
        System.out.println("count is :"+count);
    }
} // end of class counter

class poly {
    double MortgageRate(){
        return 5.0;
    }
}
class CIBC extends poly{
    double MortgageRate(){
        return 4.98;
    }
}
class TD extends poly{
    double MortgageRate(){
        return 2;
    }
}

public class Main {

/*
static int add(int a,int b){
    return a+b;
}
static double add(double a, int b, int c){
    return a+b+c;
}
*/
    
    
    public static void main(String[] args) {
//System.out.println(Main.add(2,4,7)); //static can be accessed directly from name of class
//System.out.println(Main.add(4,7)); //overload
cat c = new cat();
c.eat();
PetCat b = new PetCat();
b.eat();
    
    
    student student1 = new student(1235,"mm");
    //student1.display();
    student1.change();
    System.out.println();
    student1.display();
    
    counter pp = new counter();
    counter p = new counter();
    
    
    TD l = new TD();
    System.out.println(l.MortgageRate());
    poly C;
    C=new TD();
    System.out.println("rate is: "+C.MortgageRate());
    C= new CIBC();
        System.out.println("rate is: "+C.MortgageRate());

    
    }
    
}
