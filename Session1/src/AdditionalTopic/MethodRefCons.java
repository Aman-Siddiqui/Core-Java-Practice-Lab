package AdditionalTopic;

interface Messageable{
	MethodRefCons getMessage(String msg); 
	//return MethodRefCons
}

public class MethodRefCons {
	
	MethodRefCons(String msg){  
        System.out.print(msg);  
    }  

	public static void main(String[] args) {  
        Messageable msg = MethodRefCons::new;  
        msg.getMessage("Hello");  
    }  
}
