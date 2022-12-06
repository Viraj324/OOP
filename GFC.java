import java.util.*;


public class Complex {
    public int real,imaginary;
    public Complex(){
        real = 0;
        complex = 0;
    }

    public Complex(int real,int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c1,Complex c2){
        Complex c3;
        c3.real = c1.real + c2.real;
        c3.imaginary = c2.imaginary + c2.imaginary;
        return c3;
    }

    public Complex sub(Complex c1,Complex c2){
        Complex c3;
        c3.real = c1.real - c2.real;
        c3.imaginary = c2.imaginary - c2.imaginary;
        return c3;
    }

    public Complex multiply(Complex c1,Complex c2){
        Complex c3;
        c3.real = c1.real * c2.real;
        c3.imaginary = c2.imaginary * c2.imaginary;
        return c3;
    }

    public Complex div(Complex c1,Complex c2){1
        Complex c3;
        c3.real = c1.real / c2.real;
        c3.imaginary = c2.imaginary / c2.imaginary;
        return c3;
    }

}

public class GFC{
    public static void main(String[] args){

        int real,imaginary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of number 1...\n");
        System.out.println("Real : ");
        real = sc.nextInt();
        System.out.println("Imaginary : ");
        imaginary = sc.nextInt();
        Complex c1 = new Complex(real,imaginary);

        System.out.println("\n\nEnter the values of number 12...\n");
        System.out.println("Real : ");
        real = sc.nextInt();
        System.out.println("Imaginary : ");
        imaginary = sc.nextInt();
        Complex c2 = new Complex(real,imaginary);

        System.out.println("Complex number 1 : " + C1.real
                + " + i" + C1.imaginary);

        System.out.println("Complex number 2 : " + C2.real
                + " + i" + C2.imaginary);

        // Storing the sum
        Complex C3 = new Complex();


        int choice = sc.nextInt();
        switch(choice){
            case 1 :
                C3.add(c1,c2);
                System.out.println("Sum of complex number : " + C3.real + " + i" + C3.imaginary);
                break;
            case 2 :
                C3.sub(c1,c2);
                System.out.println("Substraction of complex number : " + C3.real + " + i" + C3.imaginary);
                break;
            case 3 :
                System.out.println("Multiplication of complex number : " + C3.real + " + i" + C3.imaginary);
                C3.multiply(c1,c2);
                break;
            case 4 :
                System.out.println("Division of complex number : " + C3.real + " + i" + C3.imaginary);
                C3.div(c1,c2);
                break;
        }

    }
}
