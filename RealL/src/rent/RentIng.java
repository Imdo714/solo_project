package rent;

public class RentIng {

	private int rentKey; 		// 렌트 번호
	private String rentDate;	// 대여 날짜
	private String rentYN; 		// 대여 여부
	private int rentNum; 	// 차량 번호
	
	
	public RentIng() {
		super();
	}
	
	public RentIng(int rentKey, String rentDate, String rentYN, int rentNum) {
		super();
		this.rentKey = rentKey;
		this.rentDate = rentDate;
		this.rentYN = rentYN;
		this.rentNum = rentNum;
	}
	
	public RentIng(int rentNum) {
		this.rentNum = rentNum;
	}

	public int getRentKey() {
		return rentKey;
	}

	public void setRentKey(int rentKey) {
		this.rentKey = rentKey;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public String getRentYN() {
		return rentYN;
	}

	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}

	public int getRentNum() {
		return rentNum;
	}

	public void setRentNum(int rentNum) {
		this.rentNum = rentNum;
	}

	@Override
	public String toString() {
		return rentKey + ", " + rentDate + ", " + rentYN + ", " + rentNum;
	}
	
	

	
}
