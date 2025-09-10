class TemperatureSensor{
	
	private int temperature ;
	
	public void setTemperature(int t){
		if(t>=0 && t<=100){
			temperature=t;
		}
		else {
			System.out.println("Invalid temperature");
		}
	}
	
	public int getTemperature(){
		return temperature;
	}
	
	public static void main(String args[]){
		TemperatureSensor t1=new TemperatureSensor();
		
		t1.setTemperature(-5);
		
		System.out.println("Temperature out of range");
		
	}
}

		