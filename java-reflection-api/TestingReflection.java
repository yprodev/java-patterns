import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestingReflection {

	public static void main(String[] args) {
		Class reflectClass = UFOEnemyShip.class;
		String className = reflectClass.getName();
		System.out.print(className + "\n");

		int classModifier = reflectClass.getModifiers();

		/**
		 * How to check modifiers?
		 * .isPublic
		 * .isInterface
		 * .isFinal
		 * .isAbstract
		 * .isPrivate
		 * .isProtected
		 * .isStatic
		 * .isStrict
		 * .isSynchronized
		 * .isVolatile
		 * ... and other
		 */

		System.out.print(Modifier.isPublic(classModifier) + "\n"); // must be true


		Class[] interfaces = reflectClass.getInterfaces();
		Class classSuper = reflectClass.getSuperclass();
		System.out.print(classSuper.getName() + "\n");

		Method[] classMethods = reflectClass.getMethods();

		for(Method method : classMethods) {
			System.out.print("Method name: " + method.getName() + "\n");
			if(method.getName().startsWith("get")) {
				System.out.print("Getter Method");
			} else if(method.getName().startsWith("set")) {
				System.out.print("Getter Method");
			}

			System.out.print("Return Type: " + method.getReturnType());

			Class[] parameterType = method.getParameterTypes();
			System.out.print("Parameters: ");

			for(Class parameter : parameterType) {
				System.out.print("Parameter name: " + parameter.getName() + "\n");
			}

			System.out.println();
		}

		/**
		 * Accessing Class Constructor
		 */

		Constructor constructor = null;
		Object constructor2 = null;

		try {
			constructor = reflectClass.getConstructor(new Class[]{EnemyShipFactory.class});
			constructor2 = reflectClass.getConstructor(int.class, String.class).newInstance(12, "Random String");
		} catch(NoSuchMethodExeption | SecurityException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch(IllegalTargetException e) {
			e.printStackTrace();
		}

		Class[] constructParameters = constructor.getParameterTypes();
		for (Class paramter : constructParameters) {
			System.out.println(parameter.getName());
		}


		UFOEnemyShip newEnemyShip = null;
		EnemyShipFactory shipFactory = null;

		try{
			newEnemyShip = (UFOEnemyShip) constructor.newInstance(shipFactory);
		} catch(InstantiationException | IllegalException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

		newEnemyShip.setName("XT-1000");
		System.out.println("EnemyShip Name: " + newEnemyShip.getName());



		Field privateStringName = null;
		UFOEnemyShip enemyshipPrivate = new UFOEnemyShip(shipFactory);

		try {
			String idCodeString = "idcode";
			privateStringName = UFOEnemyShip.class.getDeclatedField("idCode");
			privateStringName.setAccessible(true);
			try {
				String valueOfName = (String) privateStringName.get(enemyshipPrivate);
				System.out.println("Private Field Name: " + valueOfName);

				String methodName = "getPrivate";
				Method privateMethod = UFOEnemyShip.class.getDeclaredMethod(methodName, null);
				privateMethod.setAccessible(true);
				String privateReturnVal = (String) privateMethod.invoke(enemyshipPrivate, null);
				System.out.println("EnemyShip private method: " + privateReturnVal);



			} catch (IllegalArgumentException | IllegalAccessException) {
				e.printStackTrace();
			}

		} catch(NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}








	}

}
