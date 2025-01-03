package study.db.sample.v2;

public class Product {
	int pCode;
	String pName;
	int pPrice;
	
	
	public Product() {}
	public Product(int pCode, String pName, int pPrice) {
		this.pCode = pCode;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pCode=" + pCode + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
}
