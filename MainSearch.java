package practice;

public class MainSearch {
	static int searchArr(int x[],int ele) {
		for(int i=0 ; i<x.length;i++) {
			if(x[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int ar[]= {34,54,54,67,89};
		int in=searchArr(ar,67);
		if(in==-1) {
			System.out.println("Element is not found");
		}
		else
			System.out.println("Element present at:"+in);
		
	}

}
