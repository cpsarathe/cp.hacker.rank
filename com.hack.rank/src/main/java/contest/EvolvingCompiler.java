package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EvolvingCompiler {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		String line;
		try {
			while ((line = stdin.readLine())!=null && line.length()!=0) {
				sb1.append(line);
				sb1.append("\n");
			}
			stdin.close();
			String[] strArr= sb1.toString().split("\n");
			for(String str : strArr) { 
				if(str.contains("==")) {
					if(str.contains("//")) {
						String str1 = str.substring(0,str.indexOf("//"));
						String str2 = str.substring(str.indexOf("//"));
						str1 = str1.replaceAll("==", "@@");
						sb2.append(str1);
						sb2.append(str2);
					} else {
						str = str.replaceAll("==", "@@");
						sb2.append(str);
					}
					sb2.append("\n");
				} else {
					sb2.append(str);
					sb2.append("\n");
					continue;
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println(sb2);
	}

}

//int index = str.indexOf("//");
//char[] ch = str.toCharArray();
//for (int j = 0; j < ch.length; j++) {
//	if (j<ch.length-1 && ch[j] == '=' && ch[j + 1] == '=') {
//		ch[j] = '@';
//		ch[j + 1] = '@';
//	} else if (j<ch.length-1 && ch[j] == '/' && ch[j + 1] == '/') {
//		j = ch.length - 1;
//	}
//}
//sb2.append(new String(ch));
//sb2.append("\n");
