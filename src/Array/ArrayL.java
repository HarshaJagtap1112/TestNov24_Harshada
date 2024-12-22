package Array;

public class ArrayL {
	String[]names= {"Anuja","Harshada","Premlata","Maulik","Ashavi"};
	
	void printArray() {
		//System.out.println(names.length);
		for(int index=0;index<names.length;index++) {
			//System.out.println(names[index]+" -> "+names[index].length());
			String str=names[index];
			int length=names[index].length();
			//System.out.println(length);
			int middleIndex=length/2;
			//System.out.println(middleIndex);
			if(length%2==0) {
				System.out.println(str+" -> "+str.charAt(middleIndex-1));
			}else if(length%2==1) {
				System.out.println(str+" -> "+str.charAt(middleIndex));
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayL arrayL=new ArrayL();
		arrayL.printArray();
	}
}
