public class PooEj12{
    public static void main(String[] args){
        int horas = 48;
        int pagoHora = 5000;
        double bruto = horas*pagoHora; //Salario bruto
        double retencion = bruto * 0.125 ;// Retencion en la fuente
        double neto = bruto - retencion; //Salario neto
        System.out.println("El salario bruto del trabajador es $"+bruto +"\nLa retencion en la fuente es de $"+retencion+"\nEl salario neto del trabajador es $"+neto);
    }
}