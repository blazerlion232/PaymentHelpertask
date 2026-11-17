class GuestUserPayment implements Payment {
	String name;
    public GuestUserPayment() {
        this.name = "guest";
    }
    @Override
    public void previousPaymentInfo(){
    	System.out.println("Processing " +name+"s previous payments");
    }
 
    @Override
    public void newPayment(){
    	System.out.println("Processing "+name+"'s current payment request.");
    	//Some other code, if any
    }
}