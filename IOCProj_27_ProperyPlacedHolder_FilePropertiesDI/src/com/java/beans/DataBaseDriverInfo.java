package com.java.beans;

public class DataBaseDriverInfo {

	private String driverName;
	private String driverUrl;
	private String user;
	private String password;
	

	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverUrl() {
		return driverUrl;
	}
	public void setDriverUrl(String driverUrl) {
		this.driverUrl = driverUrl;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DataBaseDriverInfo [driverName=" + driverName + ", driverUrl=" + driverUrl + ", user=" + user
				+ ", password=" + password + "]";
	}
}
