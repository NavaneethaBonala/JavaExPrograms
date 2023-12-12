package collections;

public class Template {
	public static void main(String[] args) {
		
		TemplateClass<String,Integer> obj = new TemplateClass();
		
		obj.setData("Java programming");
		obj.setData2(10);
		
		System.out.println(obj.getData()+ " "+ obj.getData2());
		
		
		TemplateClass<String,Boolean> obj1 = new TemplateClass();
		
		obj1.setData("Java programming");
		obj1.setData2(true);
		
		System.out.println(obj1.getData()+ " "+ obj1.getData2());
		
		

	}

}
