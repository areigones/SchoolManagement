/*package com.sms.schoolmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "Login")
public class Login {
		@Id
		@GeneratedValue
		private long loginID;
		
		@Column(unique = true)
		private String loginUsername;
		
		@OneToOne
		@MapsId
		private Person person;
		
		@NotBlank
		private String hash;
		
		Login(){
			super();
		}
		
		
		public Login(String loginUsername, String hash){
			this.loginUsername = loginUsername;
//			this.person = person;
			this.hash = hash;
		}

		public Person getPersonID() {
			return person;
		}

		public void setPersonID(Person personID) {
			this.person = personID;
		}

		public String getHash() {
			return hash;
		}

		public void setHash(String hash) {
			this.hash = hash;
		}
		
		

		public long getLoginID() {
			return loginID;
		}


		public void setLoginID(long loginID) {
			this.loginID = loginID;
		}


		public String getLoginUsername() {
			return loginUsername;
		}


		public void setLoginUsername(String loginUsername) {
			this.loginUsername = loginUsername;
		}


		public Person getPerson() {
			return person;
		}


		public void setPerson(Person person) {
			this.person = person;
		}


		@Override
		public String toString() {
			return "Login [loginID=" + loginID + ", loginUsername=" + loginUsername + ", person=" + person + ", hash="
					+ hash + "]";
		}


		

}*/


