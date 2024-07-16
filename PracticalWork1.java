
public class PracticalWork1 {

	public static void main(String[] args) {
		int a = 2;
		int b = 6;
		showRectangleInfo(a, b);
	}

	public static void showRectangleInfo(int x, int y) {
		int perimeter = (x + y) * 2;
		int area = x * y;
		String rectangle = "rectangle";

		if (x <= 0 || y <= 0) {
			System.out.println("Invalid parameters.");
			return;
		}

		if (x == y) {
			rectangle = "square";
			System.out.println("This figure is a " + rectangle + ".");
		} else {
			System.out.println("This figure is a " + rectangle + ".");
		}

		System.out.println("The perimeter of given " + rectangle + " is " + perimeter + " units.");
		System.out.println("The area of given " + rectangle + " is " + area + " square units.");
	}

}
