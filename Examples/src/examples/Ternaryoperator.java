package examples;

public class Ternaryoperator {

	public static void main(String[] args) {
		
		float salesvalue=23000.45f,commission;
		
		commission = (salesvalue>50000) ? salesvalue * 5/100 : salesvalue * 2.5f/100 ;
		
		System.out.println(commission);

	}

}


