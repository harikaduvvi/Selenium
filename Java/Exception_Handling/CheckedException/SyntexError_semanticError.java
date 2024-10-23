package CheckedException;

public class SyntexError_semanticError {
public static void main(String[] args) {
	new SyntexError_semanticError().m1(10);
}
void m1 (int m)
{int a = 0;  // or in a; instead of int declare in so the compiler throws syntex
System.out.println("Value="+""+a);
m=t; //In this code, t is undeclared that's why it shows the semantic error.
}
}
