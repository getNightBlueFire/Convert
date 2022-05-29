package Vector;

public interface IVector {
    double lengthVector();
    int scalar(Vector v1, Vector v2);
    int[] proizved(Vector v1, Vector v2);

    double corner(Vector v1, Vector v2);

    Vector summ(Vector v1, Vector v2);

    void soutVector(Vector v1);

    Vector subtraction(Vector v1, Vector v2);

    void soutRandVector(Vector[] v);


}
