package CompositeChallenge;

interface Faculty {
	
	public String getDetails();

}
class Professor implements Faculty {
	String name;
	String position;
	String officeNumber;
	
	public Professor(String n, String p, String id) {
		name=n;
		position=p;
		officeNumber=id;
	}
	public String getDetails() {
		return "Professor: " + name + "\nPosition: " +
	             position + "\nOffice number: " + officeNumber;
	}
}
