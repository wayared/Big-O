
/*
Big-O Notation

n - The size of the input Complexities ordered in from smallest to largest
Constant Time: O(1)
Logarithmisc Time: O(log(n))
Linear Time: O(n)
Linearithmic Time: O(nlog(n))
Quadric Time: O(n^2)
Cubic Time: O(n^3)
Exponential Time: O(b^n) , b>1
Factorial Time: O(n!)

Big-O Examples
i:=0
While i < n Do
    j=0
    While j <= 3*n Do
        j = j + 1
    j = 0
    While j< 2*n Do
        j = j + 1
    i = i + 1

f(n) = n * (3n + 2n) = 5n^2
O(f(n)) = O(n^2)
-------------------------------------

i:=0
While i < 3 * n Do
    j: = 0
    While j <= 50 Do
        j = j + 1
    j = 0
    While j < n*n*n Do
        j = j + 2
    i = i + 1

f(n) = 3n * (40 + n^3/2) = 3n/40 + 3n^4/2
O(f(n)) = O(n^4)

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    }
}