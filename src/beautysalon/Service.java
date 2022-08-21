package beautysalon;

public class Service 
{
	int hairTreatment;
	int Spa;
	int massage;
	int nailCare;
	int makeUp;
	int facialTreatment;
	int price;
	
	public Service() 
	{
		hairTreatment = 500;
		Spa = 655;
		massage = 400;
		nailCare = 300;
		makeUp = 700;
		facialTreatment = 499;
		
	}

	public int getHairTreatment() {
		return hairTreatment;
	}

	public void setHairTreatment(int hairTreatment) {
		this.hairTreatment = hairTreatment;
	}

	public int getSpa() {
		return Spa;
	}
	public String getSpaa() {
		return "Spa";
	}

	public void setSpa(int spa) {
		Spa = spa;
	}

	public int getMassage() {
		return massage;
	}

	public void setMassage(int massage) {
		this.massage = massage;
	}

	public int getNailCare() {
		return nailCare;
	}

	public void setNailCare(int nailCare) {
		this.nailCare = nailCare;
	}

	public int getMakeUp() {
		return makeUp;
	}

	public void setMakeUp(int makeUp) {
		this.makeUp = makeUp;
	}

	public int getFacialTreatment() {
		return facialTreatment;
	}

	public void setFacialTreatment(int facialTreatment) {
		this.facialTreatment = facialTreatment;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
