import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FullTimeTeacher extends Teacher{
	private double salary;

	@Override
	public void Input() {
		JTextField txtId = new JTextField();
		JTextField txtName = new JTextField();
		JTextField txtGender = new JTextField();
		JTextField txtDegree = new JTextField();
		JTextField txtSalary = new JTextField();
		
		Object[] field={
				"ID",txtId,
				"NAME",txtName,
				"GENDER",txtGender,
				"DEGREE",txtDegree,
				"SALARY",txtSalary,
		};
		
		int option =JOptionPane.showConfirmDialog(null 
				,field
				,"Input PartTime Teacher"
				,JOptionPane.OK_CANCEL_OPTION);
		
		if(option ==JOptionPane.OK_OPTION){
				id= Integer.parseInt(txtId.getText());	
				name= txtName.getText();
				gender= txtGender.getText();
				degree = txtDegree.getText();
				salary =Double.parseDouble(txtSalary.getText());
				type = "FullTime";
			}
	
		
	}

	@Override
	public double MonthlySalary() {
		return salary;
	}

	
	
}
