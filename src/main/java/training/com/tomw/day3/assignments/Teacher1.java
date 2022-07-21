package training.com.tomw.day3.assignments;

public class Teacher1 {
		
		private String name;
		
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getTopic() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public void getDetails() {
			System.out.println(name + " " + age);
		}
		
}
