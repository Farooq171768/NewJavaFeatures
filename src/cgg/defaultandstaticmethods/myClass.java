package cgg.defaultandstaticmethods;

import java.util.Collections;
import java.util.List;

public class myClass implements MyInterface {
	
	@Override
	public int getMaxNum(List<Integer> intList) {
		Integer max=Collections.max(intList);
		return max;
	}

	 @Override
	    public List<Student> sortStudents(List<Student> stuList) {
	        Collections.sort(stuList);
	        return stuList;
	    }
	

}
