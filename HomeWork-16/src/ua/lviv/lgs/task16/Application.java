package ua.lviv.lgs.task16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class commodity = Commodity.class;
		
		System.out.println("Name of Class: " + commodity.getName());
		System.out.println("Simple name of class: " + commodity.getSimpleName());
		System.out.println("Modifier of class: " + Modifier.toString(commodity.getModifiers()));
		System.out.println("Package of class: " + commodity.getPackage());
		System.out.println("SuperClass of class: " + commodity.getSuperclass());
		System.out.println();
		
		System.out.println("Class " + commodity.getSimpleName() + " has the following set of fields:");
		Field[] commodityFields = commodity.getDeclaredFields();
		for (Field field : commodityFields) {
			System.out.println("Field: " + field);
		}
		System.out.println("Total number of all fields in the class " + commodity.getSimpleName() + " - " + commodityFields.length);
		System.out.println();
		
		System.out.println("Class " + commodity.getSimpleName() + " has the following set of public fields: ");
		Field[] commodityPublicFields = commodity.getFields();
		for (Field field : commodityPublicFields) {
			System.out.println("Field: " + field);
		}
		System.out.println("Total number of public fields of the class " + commodity.getSimpleName() + " - " + commodityPublicFields.length);
		System.out.println();
		
		System.out.println("Class " + commodity.getSimpleName() + " has the following set of constructors: ");
		Constructor[] commodityConstructors = commodity.getConstructors();
		for (Constructor constructor : commodityConstructors) {
			System.out.println("Constructor " + constructor);
		}
		System.out.println("Total number of class constructors " + commodity.getSimpleName() + " - " + commodityConstructors.length);
		System.out.println();
		
		System.out.println("Class " + commodity.getSimpleName() + " has the following set of methods: ");
		Method[] commodityMethods = commodity.getMethods();
		for (Method method : commodityMethods) {
			System.out.println("Method: " + method);
		}
		System.out.println("Total number of class methods " + commodity.getSimpleName() + " - " + commodityMethods.length);
		System.out.println();
		
		System.out.println("Let's add a new product using reflection: ");
		Constructor<Commodity> constructor = commodity.getConstructor(String.class, int.class, int.class);
		Commodity newInstance = constructor.newInstance("Box", 25, 50);
		System.out.println(newInstance);
		System.out.println();
		
		System.out.println("Let's change the name of the product using reflection: ");
		Field fieldName = commodity.getField("name");
		fieldName.set(newInstance, "Big box");
		System.out.println(newInstance);
		System.out.println();
		
		System.out.println("Add weight to the product using reflection: ");
		Method commodityMethod = commodity.getMethod("setWeight", int.class);
		commodityMethod.invoke(newInstance, 49);
		System.out.println(newInstance);
		System.out.println();
		
		System.out.println("Let's display the name of the product on the console using reflection: ");
		commodityMethod = commodity.getMethod("getName", null);
		System.out.println("Name of the selected item - " + commodityMethod.invoke(newInstance, null));
		System.out.println();
		
		System.out.println("Let's place the product on the indicated shelf using reflection: ");
		commodityMethod = commodity.getMethod("putOnShelf", int.class);
		commodityMethod.invoke(newInstance, 23);
		System.out.println();
		
		System.out.println("We will transfer the goods to the specified person for storage using reflection: ");
		commodityMethod = commodity.getMethod("giveForSafeKeeping", String.class);
		commodityMethod.invoke(newInstance, "Lenin V.I. ");
	}
	
}
