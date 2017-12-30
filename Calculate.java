public class Calculate {
public static void main (String[] arg){
System.out.println("Load sucess.");
int a = Integer.valueOf(arg[0]);
int b = Integer.valueOf(arg[1]);
System.out.println("Результат сложения " + (a+b));
System.out.println("Результат вычитания " + (a-b));
System.out.println("Результат умножения " + (a*b));
System.out.println("Результат деления " + (a/b));
System.out.println("Результат возведения в степень " + Math.pow(a,b));

}
}