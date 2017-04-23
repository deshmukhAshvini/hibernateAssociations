package hibernate.associations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addressTbl")
public class Address {
	/**
	 * Variablename and Methodname - should start with small letter + camelcase
	 * Class - start with Capital + camelcase
	 * Constants - All capital
	 * Package name-  all small letters
	 */
	@Id
	@Column(name="addressID")
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int addressId;
	
	@Column(name="ad_line1")
	private String line1;

	@Column(name="ad_line2")
	private String line2;
	
	@Column(name="ad_city")
	private String city;
	
	@Column(name="ad_state")
	private String state;
	
	@Column(name="ad_pin")
	private long pin;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	
	
	public Address(String line1, String line2, String city, String state, long pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", city=" + city
				+ ", state=" + state + ", pin=" + pin + "]";
	}
	

	
	
	
}
