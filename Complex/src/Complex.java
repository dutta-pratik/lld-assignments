public class Complex {
    int real;
    int img;
    Complex(){
        System.out.println("Default constructor");
    }
    Complex(int real, int img){
        this.real = real;
        this.img = img;
    }

    static void addition(Complex c1, Complex c2){
        int realVal = c1.real + c2.real;
        int imgVal = c1.img + c2.img;
        System.out.println("("+c1.real+"+"+c1.img+"i)+"+"("+c2.real+"+"+c2.img+"i) = "+realVal+"+"+imgVal+"i");
    }

    static void substraction(Complex c1, Complex c2){
        int realVal = c1.real - c2.real;
        int imgVal = c1.img - c2.img;
        System.out.println("("+c1.real+"+"+c1.img+"i)-"+"("+c2.real+"+"+c2.img+"i) = "+realVal+"+"+imgVal+"i");
    }

    static void multiplication(Complex c1, Complex c2){
        int realVal = (c1.real * c2.real) - (c1.img * c2.img);
        int imgVal = (c1.real * c2.img) + (c1.img * c2.real);
        System.out.println("("+c1.real+"+"+c1.img+"i)*"+"("+c2.real+"+"+c2.img+") = "+realVal+"+"+imgVal+"i");
    }

    static void division(Complex c1, Complex c2){
        double realVal = ((c1.real * c2.real) + (c1.img * c2.img))/(Math.pow(c2.real,2) + Math.pow(c2.img,2));
        double imgVal = ((c1.img * c2.real) - (c1.real * c2.img))/(Math.pow(c2.real,2)+Math.pow(c2.img,2));
        System.out.println("("+c1.real+"+"+c1.img+"i)/"+"("+c2.real+"+"+c2.img+") = "+realVal+"+"+imgVal+"i");
    }
}
