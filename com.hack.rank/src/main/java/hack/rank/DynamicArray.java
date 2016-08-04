package hack.rank;

import java.util.Scanner;

class DArray {
	long arr[];
	int index = 0;
	String name = "";
	DArray(int size,String name) {
		arr = new long[size];
		this.name = name;
	}
	public long[] getArray(){
		return this.arr;
	}
	public void add(long data){
		this.arr[this.index] = data;
		this.index++;
		System.out.println(this.name+"::"+this.index);
	}
}

public class DynamicArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fl = scanner.nextLine();
//		String fl = "2 5";
		String inputs[] = fl.split(" ");
		int sequences = Integer.valueOf(inputs[0]);
		int queries = Integer.valueOf(inputs[1]);
		DArray arr[] = new DArray[sequences];
		long lastAns = 0;
		String lines[] = new String[queries];
//		lines[0] = "1 0 5";
//		lines[1] = "1 1 7";
//		lines[2] = "1 0 3";
//		lines[3] = "2 1 0";
//		lines[4] = "2 1 1";
		for(int q=0;q<queries;q++) {
			String query = scanner.nextLine();
			lines[q] = query;
		}
		int i = 0;
		for(String q: lines) {
			String query = q ;
			String[] values = query.split(" ");
			int qtype = Integer.valueOf(values[0]);
			if(qtype==1) {
				long x = Long.valueOf(values[1]);
				long y = Long.valueOf(values[2]);
				int seq = (int)(x ^ lastAns) % sequences;
				if(arr[seq]==null) {
					arr[seq] = new DArray(queries,"array-"+i++);	
				}
				arr[seq].add(y);
			}
			if(qtype==2) {
				long x = Long.valueOf(values[1]);
				long y = Long.valueOf(values[2]);
				int index = (int)((x ^ lastAns) % sequences);
				long seqArr[] = arr[index].getArray();
				long value = seqArr[(int)y%seqArr.length];
				lastAns = value;
				System.out.println(lastAns);
			}
		
		}
	}

}
