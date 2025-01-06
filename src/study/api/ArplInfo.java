package study.api;

public class ArplInfo {
	
	/*
		CREATE TABLE ARPLINFO (
		    arplno NUMBER Primary key,
		    informCode varchar2(64),
		    actionKnack varchar2(1024),
		    informCause varchar2(1024),
		    informData varchar2(1024),
		    informGrade varchar2(1024),
		    imageUrl varchar2(1024)
		);
		
		CREATE SEQUENCE arplinfo_pk_seq
		start with 1
		increment by 1
		nocycle;
	*/
	
	int arplNo;	//PK 역할 순번
	String informCode;
	String actionKnack;
	String informCause;
	String informData;
	String informGrade;
	String imageUrl;
	
	public int getArplNo() {
		return arplNo;
	}
	public void setArplNo(int arplNo) {
		this.arplNo = arplNo;
	}
	public String getInformCode() {
		return informCode;
	}
	public void setInformCode(String informCode) {
		this.informCode = informCode;
	}
	public String getActionKnack() {
		return actionKnack;
	}
	public void setActionKnack(String actionKnack) {
		this.actionKnack = actionKnack;
	}
	public String getInformCause() {
		return informCause;
	}
	public void setInformCause(String informCause) {
		this.informCause = informCause;
	}
	public String getInformData() {
		return informData;
	}
	public void setInformData(String informData) {
		this.informData = informData;
	}
	public String getInformGrade() {
		return informGrade;
	}
	public void setInformGrade(String informGrade) {
		this.informGrade = informGrade;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public String toString() {
		return "ArplInfo [arplNo=" + arplNo + ", informCode=" + informCode + ", actionKnack=" + actionKnack
				+ ", informCause=" + informCause + ", informData=" + informData + ", informGrade=" + informGrade
				+ ", imageUrl=" + imageUrl + "]";
	}
	
}
