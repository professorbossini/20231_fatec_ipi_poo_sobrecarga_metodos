public class TesteCalculadora{
  public static void main (String [] args){
    Calculadora calc = new Calculadora();
    //polimorfismo estático (feito pelo compilador)
    // System.out.println(calc.somar(2, 3));
    // System.out.println(calc.somar(1.2, 3.4));
    // System.out.println(calc.somar("1", "2"));
    // System.out.println(calc.somar(1, 2, 3));
    // System.out.println(calc.somar("1", 2));
    // System.out.println(calc.somar(2, "1"));

    // float r1 = calc.somar(1, 2);
    // int r2 = calc.somar(1, 2);

    // var r3 = calc.somar(2, 1);
    // System.out.println(calc.somar(2, 1));

    // int a = 2, b = 3, d = 2;
    // int r1 = calc.somar(new int[]{a, b, c});
    // int r3 = calc.somar(a, b, c);
    // int r2 = calc.somar(new int[]{a, b});
    // int r4 = calc.somar(a, b);

    float f1 = 2.5f, f2 = 1.2f;
    calc.somar(f1, f2);

  }
}