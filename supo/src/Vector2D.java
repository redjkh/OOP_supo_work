public class Vector2D {
    public final double x, y;

    public Vector2D(double uniform) {
        this(uniform, uniform);
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Add two vectors together
    public Vector2D add(Vector2D other) {
        return new Vector2D(x + other.x, y + other.y);
    }

    // Add a scalar to a vector
    public Vector2D add(double other) {
        return new Vector2D(x + other, y + other);
    }

    // Scale a vector by a scalar
    public Vector2D scale(double scalar) {
        return new Vector2D(scalar * x, scalar * y);
    }

    // Magnitude of a vector
    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    // Normalise a vector
    public Vector2D normalised() {
        double magnitude = this.magnitude();
        return new Vector2D(x / magnitude, y / magnitude);
    }
}
