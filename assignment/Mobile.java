package week1.assignment;

public class Mobile {
	public void makeCall() {
		String mobileModel="Vivo";
		float mobileWeight=10.2f;
		
		System.out.println("Mobile model is "+mobileModel);
		System.out.println("Mobile weight is "+mobileWeight);
		
		}
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=25000;
		
		System.out.println("Mobile is fully charged "+isFullCharged);
		System.out.println("Mobile cost is "+mobileCost);
		
	}

	public static void main(String[] args) {
		Mobile mbl=new Mobile();
		mbl.makeCall();
		mbl.sendMsg();
		System.out.println("This is my mobile");
	}

}
