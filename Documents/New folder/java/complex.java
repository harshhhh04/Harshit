import java.util.*;

public class complex{
    int real;
    int img;
    public complex(int r, int i){
        real = r;
        img = i;
    }
    
    public static complex add(complex a, complex b){
        return new complex( a.real + b.real, a.img + b.img);
    }

    public static complex sub(complex a, complex b){
        return new complex( a.real - b.real, a.img - b.img);
    }
    
    public void printcomplex(){
        System.out.println(real + "+" + "i" + img);

    }
    
}

class solution{
    public static void main(String args[]){
        complex c = new complex(4,5);
        complex d = new complex(9,4);

        complex e = complex.add(c,d);
        complex f = complex.sub(c,d);

        e.printcomplex();
        f.printcomplex();
    }
}