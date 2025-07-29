
public class Pro {
	static int count = 0;
	int serialNo;
	String produceName;
	
	{
		serialNo = ++count;
	}
	
	Pro(){}
	
	Pro(String produceName){
		this.produceName = produceName;
	}
}
