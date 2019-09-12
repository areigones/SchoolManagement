package entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "login")
public class login {
		@NotBlank
		private long personID;
		
		@NotBlank
		private String hash;
		
		login(long personID, String hash){
			this.hash = hash;
			this.personID = personID;
		}

		public long getPersonID() {
			return personID;
		}

		public void setPersonID(long personID) {
			this.personID = personID;
		}

		public String getHash() {
			return hash;
		}

		public void setHash(String hash) {
			this.hash = hash;
		}

		@Override
		public String toString() {
			return "login [personID=" + personID + ", hash=" + hash + "]";
		}
		

}


