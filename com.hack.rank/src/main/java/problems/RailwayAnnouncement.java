package problems;

import java.util.HashMap;
import java.util.Map;

public class RailwayAnnouncement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trainNumberToWords(2110);
		trainNumberToWords(0);
		trainNumberToWords(1);
		trainNumberToWords(111);
		trainNumberToWords(77);
	}
	
	static void trainNumberToWords(int N)
	{
		int temp = N;
	    int count = 0;
	    Map<Integer,String> map = initializeMap();
	    StringBuilder sb = new StringBuilder();
	    if(temp>=0 && temp<10 ) {
	    	sb.append(map.get(temp));
	    	sb.append(" ");
	    } else {
	    	while(temp>=1) {
		    	temp = temp/10;
		    	count++;
		    }
	    	for(int i = count,j=0 ; i>0;i--,j++) {
		    	int div = (int)Math.pow(10,i-1);
		    	int res = N / div ;
		    	N = N%div;
		    	sb.append(map.get(res));
		    	sb.append(" ");
	    	}
	    }
	    System.out.println(sb.toString());
	}
	
	static Map<Integer,String> initializeMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(0, "ZERO");
		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");
		map.put(4, "FOUR");
		map.put(5, "FIVE");
		map.put(6, "SIX");
		map.put(7, "SEVEN");
		map.put(8, "EIGHT");
		map.put(9, "NINE");
		
		return map;
	}

}
