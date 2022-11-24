
public class Example1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn="IB-6325-85-4-1";
		String title = "Basic Java Programming";
		int unit = 5;
		float price = 225.75f;
		System.out.println("BookISBN : "+isbn);
		System.out.println("BookISBN : "+title);
		System.out.println("BookISBN : "+unit);
		System.out.println("BookISBN : "+price);
		float totlePrice = price*unit;
		System.out.println("Total Price is : "+totlePrice);
		float pricewithVat = totlePrice+(totlePrice*7/100);
		System.out.println("Add VAT 7% is : "+pricewithVat);

	}
	

}
