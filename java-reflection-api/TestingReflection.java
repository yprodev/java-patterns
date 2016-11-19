import java.lang.reflect.Modifier;
import java.lang.reflect.Method;

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

	}

}
