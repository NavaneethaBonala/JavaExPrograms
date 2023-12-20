package lambdaExpression;
interface MessageCreator{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.print(msg);
	}
}
public class ConstructorReference {
	public static void main(String[] args) {
		MessageCreator hello = Message::new;
		hello.getMessage("Hello");
	}
}
