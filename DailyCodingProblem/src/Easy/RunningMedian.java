package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunningMedian {
	
	private List<Integer> sortedList;
	
	public RunningMedian() {
		sortedList=new ArrayList<>();
	}
	public void addNumber(int num) {
		sortedList.add(num);
		Collections.sort(sortedList);
	}
	public double getMedian() {
		if(sortedList.isEmpty()) {
			throw new IllegalStateException("No elements in the sequence.");
		}
		
		int size=sortedList.size();
		if(size%2 ==0) {
			
			int mid1=sortedList.get(size/2-1);
			int mid2=sortedList.get(size/2);
			return (mid1+mid2)/2.0;
		}else {
			return sortedList.get(size/2);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] sequence= {2, 1, 5, 7, 2, 0, 5};
		
		RunningMedian runningMedian=new RunningMedian();
		
		for(int num:sequence) {
			runningMedian.addNumber(num);
			System.out.println("Running Median: " + runningMedian.getMedian());
		}

	}

}
