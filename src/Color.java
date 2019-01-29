//One error Rule 1
public class Color {
    int r;
    int g;
    int b;

    public Color() {
        r = 245;
        g = 123;
        b = 70;
    }

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Color getColor(){
        return this;
    }
}
