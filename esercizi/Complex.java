public class Complex {

    int a, b;

    Complex(){
        a = 0;
        b = 0;
    }
    Complex(int aa, int bb){
        a = aa;
        b = bb;
    }
    void show(){
        System.out.printf("\n%d + %di", a, b);
    }
    void showIm(){
        System.out.println(b);
    }
    void showRe(){
        System.out.println(a);
    }
    void incIm(){
        b = b++;
    }
    void decIm(){
        b = b--;
    }
    void incRe(){
        a = a++;
    }
    void decRe(){
        a = a--;
    }
    void add(int aa, int bb){
        a += aa;
        b += bb;
    }
    void sub(int aa, int bb){
        a -= aa;
        b -= bb;
    }
    void mult(int aa, int bb){
        int temp1 = a * aa - b * bb;
        int temp2 = a * bb + b * aa;
        a = temp1;
        b = temp2;
    }
    void div(int aa, int bb){
        int temp1 = (a * aa + b *bb) / (aa*aa + bb*bb);
        int temp2 = (b * aa - a * bb) / (aa*aa + bb*bb);
        a = temp1;
        b = temp2;
    }
}
