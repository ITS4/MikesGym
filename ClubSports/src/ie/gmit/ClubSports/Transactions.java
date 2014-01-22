package ie.gmit.ClubSports;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Transactions {
int tid;
int mid;
String amount;
String memType;
String startDate;
String endDate;
@Id
@GeneratedValue
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getMemType() {
	return memType;
}
public void setMemType(String memType) {
	this.memType = memType;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public Transactions(int tid, int mid, String amount, String memType,
		String startDate, String endDate) {
	super();
	this.tid = tid;
	this.mid = mid;
	this.amount = amount;
	this.memType = memType;
	this.startDate = startDate;
	this.endDate = endDate;
}
@Override
public String toString() {
	return "Transactions [tid=" + tid + ", mid=" + mid + ", amount=" + amount
			+ ", memType=" + memType + ", startDate=" + startDate
			+ ", endDate=" + endDate + "]";
}
public Transactions() {
	super();
	// TODO Auto-generated constructor stub
}

}
