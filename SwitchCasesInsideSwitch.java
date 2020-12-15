
public class SwitchCasesInsideSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String college = "GSSS";
		String branch = "EEE";
		switch (college) {
		case "GSSS":
			System.out.println("GSSS");
			switch (branch) {
	    case "EEE":
			System.out.println("power systems");
		
		}	
			break;
		case "bitm":
			switch (branch) {
	    case "MECH":
			System.out.println("CAED");
		
		}	
			break;
		default:
			System.out.println("Select valid " + " option");
		}

	}
}
