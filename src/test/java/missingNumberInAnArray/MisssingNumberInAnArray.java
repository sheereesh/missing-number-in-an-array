package missingNumberInAnArray;

public class MisssingNumberInAnArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,10};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<array.length;i++) {
			sum1=sum1+array[i];
			
		}
System.out.println("sum1"+sum1);
for(int i=1;i<=10;i++) {
	sum2=sum2+i;
}
System.out.println("sum2"+sum2);
System.out.println("missin number is "+(sum2-sum1));
	}

}
