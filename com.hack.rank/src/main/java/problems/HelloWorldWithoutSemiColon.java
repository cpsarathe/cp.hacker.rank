package problems;

public class HelloWorldWithoutSemiColon {

	//places where we dont need semi colon
	//if 
	//while
	//switch
	public static void main(String[] args) {
		//System.out.println() returns void.
		//printf returns printstream , will convert it to string to check for any invalid
		//by the time comaprison is made it will print hello world
		while(System.out.printf("Hello World").toString()=="0"){
			
		}
		
		//any other way
		//try switch statement
		switch(System.out.printf("Hello World").toString()){
		
		}

	}

}
