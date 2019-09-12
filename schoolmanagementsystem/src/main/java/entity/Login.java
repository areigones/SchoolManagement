package entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Login")
public class Login {
		@NotBlank
		private long personID;
		
		@NotBlank
		private String hash;
		
		Login(long personID, String hash){
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
			return "Login [personID=" + personID + ", hash=" + hash + "]";
		}
		

}


