public class Calculate {
public static void main (String[] arg){
System.out.println("Load sucess.");
int a = Integer.valueOf(arg[0]);
int b = Integer.valueOf(arg[1]);
System.out.println("��������� �������� " + (a+b));
System.out.println("��������� ��������� " + (a-b));
System.out.println("��������� ��������� " + (a*b));
System.out.println("��������� ������� " + (a/b));
System.out.println("��������� ���������� � ������� " + Math.pow(a,b));

}
}