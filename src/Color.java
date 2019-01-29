//One error Rule 1
// https://wiki.sei.cmu.edu/confluence/pages/viewpage.action?pageId=88487858
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
