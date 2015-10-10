/* TASK
Write a program in which you create and use a class called Point, with two fields of type double (e.g. x, y) and the
following methods:
distanceTo(Point): calculates the distance to another point.
distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method.
moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y.
moveTo(Point): changes the coordinates of this point to move where the given point is.
clone(): returns a copy of the current point with the same coordinates.
opposite(): returns a copy of the current point with the coordinates multiplied by −1.
Two methods in a class can have the same name (identifier) as long as their parameters are different. This is
called method overloading and we will see more of that in the future. */

class Point {
    double x
    double y
    class distanceTo(Point) {
        int c = x-y
        return c
    }
    double moveTo(double x, double y) {
    this.x = x;
    this.y = y;
    }
    void opposite() {
    this.x = this.x * -1
    this.y = this.y * -1
    println "(" + this.x + ", " + this.y + ")"
    }
}
Point test = new Point()
test.x = 1
test.y = 6
println "(" + test.x + ", " + test.y + ")"
test.moveTo(1.3,4.4)
println "(" + test.x + ", " + test.y + ")"
test.opposite()
