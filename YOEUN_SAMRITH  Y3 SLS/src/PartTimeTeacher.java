import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PartTimeTeacher extends Teacher{

	private double rate;
	private double hours;
	
	
	@Override
	public void Input() {
		JTextField txtId = new JTextField();
		JTextField txtName = new JTextField();
		JTextField txtGender = new JTextField();
		JTextField txtDegree = new JTextField();
		JTextField txtRate = new JTextField();
		JTextField txtHour = new JTextField();
		
		Object[] field={
				"ID",txtId,
				"NAME",txtName,
				"GENDER",txtGender,
				"DEGREE",txtDegree,
				"RATE",txtRate,
				"HOUR",txtHour
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
				hours =Double.parseDouble(txtDegree.getText());
				rate =Double.parseDouble(txtRate.getText());
				type = "PartTime";
			}
				
	}
	
	@Override
	public double MonthlySalary() {
		return rate*hours;
	}

}
