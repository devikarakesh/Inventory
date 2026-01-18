package test;

public class InventoryAlert {
	public static void main(String[] args) {
		int []stock= {15,3,0,22,8,1};
		for(int st:stock) {
			if(st==0) {
				System.out.println(st+"-"+"Out of stock");
			}
			else if(st>=1 && st<=5) {
				System.out.println(st+"-"+"Restock Immediately");
			}
		}
	}
}
