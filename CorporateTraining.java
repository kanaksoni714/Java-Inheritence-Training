class CorporateTraining extends Training{
		public int days;
		int fees;
		String Subject;
		
		
		public CorporateTraining(int days, int fees) {
			this.days =days;
			this.fees =fees;
			this.Subject ="Big Data";
		}
		public int getOrderValue1(){
			return days * fees;
	}
}