package finalprogramming;

import java.util.Objects;

public class Object {
	
	private String id;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Object [id=" + id + "]";
	}


	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Object other = (Object) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
