//   1A
//     2B 3C
//     4D 5E 6F
//     7G 8H 9I 10J

package Harshada;

public class PatternPrint {
	static	char ch='A';
 static	void printPatterm() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+""+ch+" ");
				i++;
				ch++;
			}System.out.println();
		}
	}
	
 public static void main(String[] args) {
	printPatterm();
}
	
}
