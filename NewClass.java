import javax.swing.JOptionPane;
public class NewClass
{
    public static void main(String[] args)
    {
        String input;
        int num1;
        int num2;
        int num3;
        int sum;
        
        input=JOptionPane.showInputDialog("Enter first number : ");
        num1=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("Enter second number : ");
        num2=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("Enter third number : ");
        num3=Integer.parseInt(input);
        
        sum=num1+num2+num3;
        System.out.println("Sum : "+sum);
    }
}
