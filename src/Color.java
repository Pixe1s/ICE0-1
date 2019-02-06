//One error Rule 1
// https://wiki.sei.cmu.edu/confluence/pages/viewpage.action?pageId=88487858
public class Color {
    int r = 245;
    int g = 123;
    int b = 70;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Color getColor(){
        return this;
    }
}
