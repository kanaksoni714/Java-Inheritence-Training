class PublicTraining extends Training{
	int participant;
	int fees;
	String Subject;
	public PublicTraining(int participant, int fees) {
		this.participant =participant;
		this.fees =fees;
		this.Subject ="Java";
	}
	public int getOrderValue(){
		return fees * participant;
	}
}