package Encapsulation;

public class LinearEquation {
    private float a, b, c, d, e, f;

    public LinearEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public float getE() {
        return e;
    }

    public void setE(float e) {
        this.e = e;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public boolean isSolvable() {
        if (this.a * this.d - this.b * this.c != 0) {
            return true;
        } else {
            return false;
        }
    }

    public float getX() {
        return (float) (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
    }

    public float getY() {
        return (float) (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
    }
}
