package ie.gmit.ClubSports;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Member {
int memId;
String startDate;
String dob; 
String title; 
String mobile; 
String county; 
String town; 
String address; 
String lastName; 
String firstName; 
String password; 
String email;
String endDate;
@Id
@GeneratedValue
public int getMemId() {
	return memId;
}
public void setMemId(int memId) {
	this.memId = memId;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getCounty() {
	return county;
}
public void setCounty(String county) {
	this.county = county;
}
public String getTown() {
	return town;
}
public void setTown(String town) {
	this.town = town;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public Member(int memId, String startDate, String dob, String title,
		String mobile, String county, String town, String address,
		String lastName, String firstName, String password, String email,
		String endDate) {
	super();
	this.memId = memId;
	this.startDate = startDate;
	this.dob = dob;
	this.title = title;
	this.mobile = mobile;
	this.county = county;
	this.town = town;
	this.address = address;
	this.lastName = lastName;
	this.firstName = firstName;
	this.password = password;
	this.email = email;
	this.endDate = endDate;
}
public Member(String emailLogin, String passwordLogin) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Member [memId=" + memId + ", startDate=" + startDate + ", dob="
			+ dob + ", title=" + title + ", mobile=" + mobile + ", county="
			+ county + ", town=" + town + ", address=" + address
			+ ", lastName=" + lastName + ", firstName=" + firstName
			+ ", password=" + password + ", email=" + email + ", endDate="
			+ endDate + "]";
}
}
