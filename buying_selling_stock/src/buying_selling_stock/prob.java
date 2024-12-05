package buying_selling_stock;

public class prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(profit(prices));
		System.out.println(maxprofit(prices,prices.length-1,Integer.MAX_VALUE));

	}
	static int profit(int[] price) {
		if(price.length==0) {
			return 0;
		}
		int minprice=price[0];
		int maxprofit=0;
		for(int i=0;i<price.length;i++) {
			if(price[i]<minprice) {
				minprice=price[i];
			}
			maxprofit=Math.max(maxprofit, price[i]-minprice);
		}
		return maxprofit;
	}
	//using recursion
	static int maxprofit(int[]price,int day,int minprice) {
		if(day<0) {
			return 0;
		}
		minprice=Math.min(minprice,price[day]);
		int curr_profit=price[day]-minprice;
		int maxprofitsofar=maxprofit(price,day-1,minprice);
		return Math.max(curr_profit, maxprofitsofar);
		
	}

}
