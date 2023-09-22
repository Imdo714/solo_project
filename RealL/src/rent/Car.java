package rent;

public class Car {

	private int rentNum; // 차량번호
	private String rentName; // 차량회사
	private String rentNo;	// 차량 년도
	private String rentCar; // 차량 이름
	private int rentPrice;	// 차량 가격
	private String maxSped;	// 최고 속도
	private String rentYN;	// 대여 여부
	
	
	public Car() {
		super();
	}
	
	public Car(int rentNum, String rentName, String rentNo, String rentCar, int rentPrice, String maxSped,
			String rentYN) {
		super();
		this.rentNum = rentNum;
		this.rentName = rentName;
		this.rentNo = rentNo;
		this.rentCar = rentCar;
		this.rentPrice = rentPrice;
		this.maxSped = maxSped;
		this.rentYN = rentYN;
	}
	
	public Car(String rentName, String rentNo, String rentCar, int rentPrice, String maxSped,
			String rentYN) {
		super();
		this.rentName = rentName;
		this.rentNo = rentNo;
		this.rentCar = rentCar;
		this.rentPrice = rentPrice;
		this.maxSped = maxSped;
		this.rentYN = rentYN;
	}

	public int getRentNum() {
		return rentNum;
	}

	public void setRentNum(int rentNum) {
		this.rentNum = rentNum;
	}

	public String getRentName() {
		return rentName;
	}

	public void setRentName(String rentName) {
		this.rentName = rentName;
	}

	public String getRentNo() {
		return rentNo;
	}

	public void setRentNo(String rentNo) {
		this.rentNo = rentNo;
	}

	public String getRentCar() {
		return rentCar;
	}

	public void setRentCar(String rentCar) {
		this.rentCar = rentCar;
	}

	public int getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getMaxSped() {
		return maxSped;
	}

	public void setMaxSped(String maxSped) {
		this.maxSped = maxSped;
	}

	public String getRentYN() {
		return rentYN;
	}

	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}

	@Override
	public String toString() {
		return rentNum + ", " + rentName + ", " + rentNo + ", " + rentCar
				+ ", " + rentPrice + ", " + maxSped + ", " + rentYN;
	}
	
	
	
}
