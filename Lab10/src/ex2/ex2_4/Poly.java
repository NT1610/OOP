package ex2.ex2_4;

public interface Poly {
    int degree();

    Poly derivative();

    double[] coefficients();

    double coefficient(int degree);
}
