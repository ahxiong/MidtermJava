import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public abstract class Teacher {
	protected int id;
	protected String name;
	protected String gender;
	protected String degree;
	protected String type;
	
 	public Teacher(){
		this.id=0;
		this.name="";
		this.gender="";
		this.degree="";
	}
	
	public Teacher(int id, String name, String gender, String degree){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.degree=degree;
		
	}
	
	public int GetId(){return id;} 
	public String GetInfo() {
		return id+"\t"+name+"\t"+gender+"\t"+degree+"\t"+type+"\t"+MonthlySalary()+"\n";
	}

	
	public static void Output(ArrayList<Teacher> teacher){
		String info ="ID\tName\tGender\tDegree\tType\tMonthly Salary\n";
		info +="-----------------------------------------------------------------------------------------------------------------------------------\n";
		
		for(Teacher t : teacher){
			info+=t.GetInfo();
		}
		
		JTextArea message = new JTextArea(info);
		message.setEditable(false);
		message.setOpaque(false);
	
		JOptionPane.showMessageDialog(null,message,"Detail",JOptionPane.PLAIN_MESSAGE);
	}
	public static void Update(ArrayList<Teacher> teacher){
		int id= Integer.parseInt(
				JOptionPane.showInputDialog(null
						,"Please Enter the ID of Teacher you want to Update"));
				
		Boolean found =false;
		for(int i=0;i<teacher.size();i++){
			if(id==teacher.get(i).GetId()){
				found =true;
				teacher.get(i).Input();
				break;
			}
		}
		
		if(found==false){JOptionPane.showMessageDialog(null, "Inputed ID is invalid, We cannot find this ID in our list");}
	}
	
	public static void Delete(ArrayList<Teacher> teacher){
		int id= Integer.parseInt(
				JOptionPane.showInputDialog(null
						,"Please Enter the ID of Teacher you want to Delete"));
				
		Boolean found =false;
		for(int i=0;i<teacher.size();i++){
			if(id==teacher.get(i).GetId()){
				found =true;
				teacher.remove(i);
				break;
			}
		}
		
		if(found==false){JOptionPane.showMessageDialog(null, "Inputed ID is invalid, We cannot find this ID in our list");}
		if(found==true){JOptionPane.showMessageDialog(null, "We have already deleted this teacher !");}
	
	}
	public abstract void Input();
	public abstract double MonthlySalary();
}
