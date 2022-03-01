package CompositeChallenge;

import java.util.ArrayList;
import java.util.List;

class Supervisor implements Faculty {
	
	private List<Faculty> facultyList;
	
	private String name;
	private String departmentName;
	
	public Supervisor(String n, String dn) {
		name=n;
		departmentName=dn;
		facultyList=new ArrayList<>();
	}
    public void addFaculty(Faculty f) {
            facultyList.add(f);
    }
    public void removeFaculty(Faculty f) {
    	    facultyList.remove(f);
    }
    public List<Faculty> getFacultyList(){
    	return facultyList;
    }
    public String getDetails() {
    	return "Name: "+ name + "\nDepartment name: " + departmentName;
    }
    public String getName() {
    	return name;
    }
    public String getDepartmentName() {
    	return departmentName;
    }
	
	

}
