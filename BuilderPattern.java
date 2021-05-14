package demo3;

public class BuilderPattern {
	public static void main (String [ ] args) {
		User one = new User.Builder("Shivam", "Singhal").setAge(29).setPhone("9100087319").setAddress("Meerut").build();
		System.out.println(one.getName());
	}
	
	
}

//In a immutable class, if we have a lot of parameters which are also optional / mandatory then we would
//need either a very heavy constructor or a lot of constructors. We can solve the above problem from builder DP

final class User {
	private final String first_name;
	private final String last_name;
	private final int age;
	private final String address;
	private final String phone;
	
	public User(Builder b) {
		this.first_name = b.first_name;
		this.last_name = b.last_name;
		this.age = b.age;
		this.address = b.address;
		this.phone = b.phone;
	}
	
	public String getName () {
		return this.first_name + this.last_name;
	}
	
	public int getAge () {
		return this.age;
	}
	
	public String getPhone () {
		return this.phone;
	}
	
	public String getAddress () {
		return this.address;
	}
	
	
	
	public static class Builder {
		private final String first_name;
		private final String last_name;
		private int age;
		private String address;
		private String phone;
		
		public Builder (String fname, String lname) {
			this.first_name = fname;
			this.last_name = lname;
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public User build () {
			User user = new User(this);
			return user;
		}
		
	}
}
