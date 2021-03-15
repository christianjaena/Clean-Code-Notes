/**
	ARGUMENT OBJECTS
*/

// When a function seems to need more than two or three arguments, it is likely that some of those arguments ought to be wrapped into a class of their own.


class Circle {
	public void makeCircle(double x, double y, double radius) {}
	public void makeCircle(Point center, double radius) {}
}

Circle circle1 = new Circle(1, 2, 3);
Circle circle2 = new Circle(2, 3);

