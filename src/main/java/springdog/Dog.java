package springdog;

public class Dog {
	private String color;
	private String breed;
	private String year;
	private Food food;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", year=" + year + ", food=" + food + "]";
	}
	
	

}
