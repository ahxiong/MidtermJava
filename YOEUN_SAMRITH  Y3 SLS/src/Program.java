import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Program {
	public static void main(String arg[]){
		
	ArrayList<Teacher> array = new ArrayList<>();;
	
	while(true){
		
		int WelcomeOption =WelcomeDialog();
		
		switch(WelcomeOption){
		
		//input the teacher
		case 1:
			
			int n=InputNumber();
			 
			for(int i=0;i<n;i++){
				while(true){	
				int inputOption =InputType();	
					if(inputOption == 1 ) 
						{
							array.add(new FullTimeTeacher());
							array.get(array.size()-1).Input();
							break;
						}
						else if (inputOption ==2) 
						{							
							array.add(new PartTimeTeacher());
							array.get(array.size()-1).Input();
							break;
						}
				}
			}
			break;
		
		//output all the teacher 
		case 2: 
			Teacher.Output(array);
			break;
			
		//update the teacher
		case 3:
			Teacher.Update(array);
			break;
		
		//delete the teacher	
		case 4:
			Teacher.Delete(array);
			break;
			
		case 5:
			System.exit(0);
			break;
			
		}
		}
		
	}
	
	public static int WelcomeDialog(){
		
		int optionSelected =
				Integer.parseInt(
				JOptionPane.showInputDialog(null,
				"Please Enter the Number to select the option\n"
				+ "\n1.  Input new Teacher to the List"
				+ "\n2.  Show all the Teacher Information"
				+ "\n3.  Update the Teacher Information"
				+ "\n4.  Delete the Teacher from the List"
				+ "\n5.  Exit the Program\n\n"
				));
		
		return optionSelected;
	}
	
	public static int InputType(){
		
		int optionSelected =
				Integer.parseInt(
				JOptionPane.showInputDialog(null,
				"Select the Type of Teacher you want to input\n"
				+ "\n1.  Full-Time Teacher"
				+ "\n2.  Part-Time Teacher"
				
				));
		
		return optionSelected;
	}
	
	public static int InputNumber(){
		
		int optionSelected =
				Integer.parseInt(
				JOptionPane.showInputDialog(null,
				"How many Teachers you want to input ?" 
				));
		
		return optionSelected;
	}

}
