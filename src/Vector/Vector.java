package Vector;

import java.util.Random;

public class Vector extends MyMath {
    public Vector(int x1, int y1, int z1, int x2, int y2, int z2) {

        this.setX1(x1);
        this.setY1(y1);
        this.setZ1(z1);
        this.setX2(x2);
        this.setY2(y2);
        this.setZ2(z2);
    }

    public Vector() {

    }


    @Override
    public double lengthVector() {
        double r = Math.sqrt(Math.pow(getX2() - getX1(), 2) + Math.pow(getY2() - getY1(), 2) + Math.pow(getZ2() - getZ1(), 2));
        return r;
    }

    @Override
    public int scalar(Vector vector1, Vector vector2) {
        int r = ((vector1.getX2() - vector1.getX1()) * (vector2.getX2() - vector2.getX1()))
                + ((vector1.getY2() - vector1.getY1()) * (vector2.getY2() - vector2.getY1()))
                + ((vector1.getZ2() - vector1.getZ1()) * (vector2.getZ2() - vector2.getZ1()));
        return r;
    }

    @Override
    public int[] proizved(Vector v1, Vector v2) {
        //int[] vec = new int[2];
        int x0 = ((v1.getY2() - v1.getY1()) * (v2.getZ2() - v2.getZ1())) - ((v1.getZ2() - v1.getZ1()) * (v2.getY2() - v2.getY1()));
        int y0 = ((v1.getZ2() - v1.getZ1()) * (v2.getX2() - v2.getX1())) - ((v1.getX2() - v1.getX1()) * (v2.getZ2() - v2.getZ1()));
        int z0 = ((v1.getZ2() - v1.getZ1()) * (v2.getY2() - v2.getY1())) - ((v1.getY2() - v1.getY1()) * (v2.getX2() - v2.getX1()));
        int[] vec = {x0, y0, z0};

        // vec = new Vector(x0, y0, z0);
        return vec;
    }

    private int[] countArray(Vector vector) {
        int[] arr = {vector.getX2() - vector.getX1(),
                vector.getY2() - vector.getY1(),
                vector.getY2() - vector.getY1()};
        return arr;
    }


    @Override
    public double corner(Vector v1, Vector v2) {
        double alfa = 0;
        int[] a = countArray(v1);
        int[] b = countArray(v2);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                alfa = (a[0] * b[0] + a[1] * b[1] + a[2] * b[2])
                        / (Math.sqrt(a[0] * a[0] + a[1] * a[1] + a[2] * a[2]))
                        * (Math.sqrt(b[0] * b[0] + b[1] * b[1] + b[2] * b[2]));
            }
        }
        return alfa;
    }

    @Override
    public Vector summ(Vector v1, Vector v2) {
        int a = v1.getX1() + v2.getX1();
        int b = v1.getY1() + v2.getY1();
        int c = v1.getZ1() + v2.getZ1();
        int d = v1.getX2() + v2.getX2();
        int e = v1.getY1() + v2.getY1();
        int g = v1.getZ1() + v2.getZ1();
        Vector vec = new Vector(a, b, c, d, e, g);
        return vec;
    }

    @Override
    public void soutVector(Vector v) {
        System.out.println("{ " + v.getX1() + ", " +
                v.getY1() + ", " +
                v.getZ1() + ", " +
                v.getX2() + ", " +
                v.getY2() + ", " +
                v.getZ2() + " }");
    }

    @Override
    public void soutRandVector(Vector[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print("{ ");
            System.out.print("x1 = " + v[i].getX1() + ", "
                    +"y1 = " + v[i].getY1() + ", "
                    +"z1 = " + v[i].getZ1() + ", "
                    +"x2 = " + v[i].getX2() + ", "
                    +"y2 = " + v[i].getY2() + ", "
                    +"z2 = " + v[i].getZ2());
            System.out.print(" }");
            if (i < v.length) {
                System.out.println(",");
            }
        }

    }

    @Override
    public Vector subtraction(Vector v1, Vector v2) {
        int a = v1.getX1() - v2.getX1();
        int b = v1.getY1() - v2.getY1();
        int c = v1.getZ1() - v2.getZ1();
        int d = v1.getX2() - v2.getX2();
        int e = v1.getY1() - v2.getY1();
        int g = v1.getZ1() - v2.getZ1();
        Vector vec = new Vector(a, b, c, d, e, g);
        return vec;
    }

    public static int scalar2(Vector vector1, Vector vector2) {
        int result;
        int koordx1 = vector1.getX2() - vector1.getX1();
        int koordy1 = vector1.getY2() - vector1.getY1();
        int koordz1 = vector1.getZ2() - vector1.getZ1();

        int koordx2 = vector2.getX2() - vector2.getX1();
        int koordy2 = vector2.getY2() - vector2.getY1();
        int koordz2 = vector2.getZ2() - vector2.getZ1();
        result = koordx1 * koordx2 + koordy1 * koordy2 + koordz1 * koordz2;
        return result;
    }


    public static Vector[] randomVectors(int N) {
        Vector[] vecs = new Vector[N];
        Random ran = new Random();
        for (int i = 0; i < N; i++) {
            vecs[i] = new Vector(ran.nextInt(20),
                    ran.nextInt(20),
                    ran.nextInt(20),
                    ran.nextInt(20),
                    ran.nextInt(20),
                    ran.nextInt(20));
        }
        return vecs;
    }

    /*public int getVectorSum(Vector vector1, Vector vector2) {

        int res5 = 0;
        int i = 0;
        int[] arr1 = {vector1.getX2() - vector1.getX1(),
                vector1.getY2() - vector1.getY1(),
                vector1.getZ2() - vector1.getZ1()};

        int[] arr2 = {vector2.getX2() - vector2.getX1(),
                vector2.getY2() - vector2.getY1(),
                vector2.getZ2() - vector2.getZ1()};

        for (int n : arr1) {
            res5 += n * arr2[i];
            i++;
        }

        return res5;
    }*/
}
