package CompositeChallenge;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		Supervisor technologyDean = new Supervisor("Mike", "Dean of Technology");
		Supervisor chairOfMath = new Supervisor("John", "Chair of Math Department");
		Supervisor chairOfCS = new Supervisor("Luka", "Chair of CS");
		
		Professor mathProf1 = new Professor("Janko","Adjunct","A1");
		Professor mathProf2 = new Professor("Mihael","Associate","A2");
		
		Professor csProf1 = new Professor("Josip","Adjunct","B1");
		Professor csProf2 = new Professor("Jurica","Professor","B2");
		Professor csProf3 = new Professor("Jojo","Professor","B3");
		
		technologyDean.addFaculty(chairOfMath);
		technologyDean.addFaculty(chairOfCS);
		
		chairOfMath.addFaculty(mathProf1);
		chairOfMath.addFaculty(mathProf2);
		
		chairOfCS.addFaculty(csProf1);
		chairOfCS.addFaculty(csProf2);
		chairOfCS.addFaculty(csProf3);
		
		System.out.println("***Composite Patter Demo");
		
		System.out.println(technologyDean.getDetails());
		List<Faculty> chairs=technologyDean.getFacultyList();
		for(int i=0;i<chairs.size();i++) {
			System.out.println("\t" + chairs.get(i).getDetails());
		}
		List<Faculty> math=chairOfMath.getFacultyList();
		for(int i=0;i<math.size();i++) {
			System.out.println("\t" + math.get(i).getDetails());
		}
		List<Faculty> cs=chairOfCS.getFacultyList();
		for(int i=0;i<cs.size();i++) {
			System.out.println("\t" + cs.get(i).getDetails());
		}
		chairOfCS.removeFaculty(csProf2);
		
		System.out.println("Update of the CS department");
		
		cs=chairOfCS.getFacultyList();
		for(int i=0;i<math.size();i++) {
			System.out.println("\t" + cs.get(i).getDetails());
		}
		
		
		
		
		

	}

}
