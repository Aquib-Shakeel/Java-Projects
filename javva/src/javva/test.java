package javva;

public class test {

	public static void main(String[] args) {		
		int arr[]= {3,5,4,1,9};
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
		}
		System.out.print(min+" "+max);

	}

}
