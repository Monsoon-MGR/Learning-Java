/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  static int calculateFactorial (int n)
  {
    int result = 1;
    for (int i = 1; i <= n; i++)
      {
	result = result * i;
      }
    return result;
  }

  public static void main (String[]args)
  {
    System.out.println ("5!=" + calculateFactorial (5));
  }
}
