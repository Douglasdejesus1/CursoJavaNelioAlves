package entities;
import java.util.Objects;

public class Users {

		private String name;
		private String logs;
		public Users(String name, String logs) {
			super();
			this.name = name;
			this.logs = logs;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLogs() {
			return logs;
		}
		public void setLogs(String logs) {
			this.logs = logs;
		}
		@Override
		public int hashCode() {
			return Objects.hash(name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Users other = (Users) obj;
			return Objects.equals(name, other.name);
		}



		
		

}
