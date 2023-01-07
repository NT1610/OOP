package exercises1.exercises1_7;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = real;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        if (imag == 0.0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (imag == 0.0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.getReal(),2) + Math.pow(this.getImag(),2));
    }

    public MyComplex addInto(MyComplex right) {
        this.setReal(this.getReal() + right.getReal());
        this.setImag(this.getImag() + right.getImag());
        return this;
    }
    public MyComplex addNew(MyComplex right){
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.getReal() + right.getReal());
        newComplex.setImag(this.getImag() + right.getImag());
        return newComplex;
    }


}
