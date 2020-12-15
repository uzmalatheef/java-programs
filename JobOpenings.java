
public class JobOpenings {
	public static void main(String[] args) {
		Job ibm = new Job();
		ibm.company = "IBM";
		ibm.qualification = "BE";
		ibm.position = "software engineer";
		ibm.salary = 400000;

		System.out.println("the ibm company");
		System.out.println(" ibm.company");
		System.out.println("ibm.position");
		System.out.println("ibm.qaualification");
		System.out.println("ibm.salary");

		Job dell = new Job();
		dell.company = "DELL";
		dell.qualification = "BE";
		dell.position = "assitant engineer";
		dell.salary = 300000;

		System.out.println("the dell company");
		System.out.println(" dell.company");
		System.out.println("dell.position");
		System.out.println("dell.qaualification");
		System.out.println("dell.salary");
	}
}
