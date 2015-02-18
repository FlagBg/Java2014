/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractise;

public class PrivatePerson {
    protected String fName;
	protected String lName;
	protected int age;
	
	
	public PrivatePerson(String f, String l, int a){
		this.fName = f;
		this.lName = l;
		this.age = a;
	}
	
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("FName: " + fName + " |LName: " 
		+ lName + " |Age: " + age);
	}// end printInfo()


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

}// end class
