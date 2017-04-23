/**
 * 
 */
package hibernate.associations;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Progvaltion_11
 *
 */

@Entity
@Table(name="studentTbl")
public class Student {
	
	@Id
	@Column(name="studid")
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int studId;

	@Column(name="studname")
	private String studName;
	
	@Column(name="studage")
	private int age;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="stud_address")
	private Address address;
	
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student(String studName, int age) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.age = age;
		this.address = address;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", age=" + age + ", address=" + address + "]";
	}
	
	
	

	
	
	

}
