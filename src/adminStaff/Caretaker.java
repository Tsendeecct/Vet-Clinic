package adminStaff;

import staff.AdminStaff;
import staff.StaffType;

public class Caretaker extends AdminStaff {

	public Caretaker(String firstname, String surname) {
		
		super(firstname, surname,  StaffType.CARETAKER);
		
	}

	

}
