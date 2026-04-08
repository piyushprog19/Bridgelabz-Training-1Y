import java.util.ArrayList;

public class question5{
	public static void main(String[] args){
		double sum=0;
		double[] prices = {10.5,20.0,35.75,5.5};
		ArrayList<Double> priceList = new ArrayList<>();
		for(int i=0;i<prices.length;i++){
			priceList.add(prices[i]);
		}
		for(int i=0;i<prices.length;i++){
			sum+=priceList.get(i);
		}
		double avg=sum/prices.length;
		System.out.println("average of prices is :- " + avg);
		System.out.println("highest price is :- " + priceList.get(2));
	}
}