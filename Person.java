package Ziyi.hw52;
public class Person {

     private String name;   // private means name and age only in the class: CreateClass 
     private byte age;
     // after creating the class, create a method: constructor. 
     //constructor without type, variables, this constructor just to initialize 
		     public Person() {
		    	 name ="Ziyi";
		    	 age = 26;
			}
     // another constructor with parameters. 
     public Person (String name, byte age){
    	 this.name = name;
     }
	// getters methods,accessory, this is not a contructor so need the type.
     public String getName(){
    	 return this.name; // whenever use this, refer to the attributes of the class but not the parameters
     }
     // setter methods, mutator methods
     public void setName(String name){
    	 this.name = name;
     }
     public byte getAge(){
    	 return age;
     }
     public void setAge(byte age){
    	 this.age = age;
     }
     public String toString(){
		return "name "+ this.name + " Age "+ this.age;
    	 
     }
	}


