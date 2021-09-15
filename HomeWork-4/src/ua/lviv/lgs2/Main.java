package ua.lviv.lgs2;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal("�������", 20, 7);

		System.out.println("�������� ��������� - " + animal.getName() + ", �������� ��������� - " + animal.getSpeed()
				+ ", ������� ��������� - " + animal.getAge() + " ���!");

		// animal.Animal_Info(animal.getName(), animal.getSpeed(), animal.getAge());

		animal.setName("���");
		animal.setSpeed(2);
		animal.setAge(14);

		System.out.println("�������� ��������� - " + animal.getName() + ", �������� ��������� - " + animal.getSpeed()
				+ ", ������� ��������� - " + animal.getAge() + " ���!");

	}

}
