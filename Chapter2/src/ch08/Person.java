package ch08;

public class Person {
	
	public int height;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public String ShowPerson() {
		
		return "키가 "+ height + "이고 몸무게가 " + weight + "인 " + gender+ "이 있습니다. 이름은 "+ name + "이고 나이는 "+ age 
				+ "세입니다.";
	}

}
