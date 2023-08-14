
public class VowCheck {

	public boolean checkInBuilt(String name) {
		if(name.contains("a") && name.contains("e") && name.contains("i") && name.contains("o") && name.contains("u")) {
			return true;
		}
		return false;
	}
	
	public boolean checkWithoutInBuilt(String name) {
		boolean a = false;
		boolean e = false;
		boolean i = false;
		boolean o = false;
		boolean u = false;
		
		for(int j = 0;j<name.length();j++) {
			if(name.charAt(j)=='a') {
				a = true;
			}
			if(name.charAt(j)=='e') {
				e = true;
			}
			if(name.charAt(j)=='i') {
				i = true;
			}
			if(name.charAt(j)=='o') {
				o = true;
			}
			if(name.charAt(j)=='u') {
				u = true;
			}
			
		}
		
		return ( a && e && i && o && u);
	}
	
	
}
