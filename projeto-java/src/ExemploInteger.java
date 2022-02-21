public class ExemploInteger {
   public static void main(String[] args) {

       Integer i = 1;
       Integer i2 = Integer.valueOf("1");
       Integer i3 = new Integer(1);
       Integer i4 = new Integer("2");

       //Compara os valores dos objetos e retorna true se iguais
       //boolean 	equals(Object obj)
       //Sobrescreve o método da Classe Object

       if(i.equals(i2))
        System.out.println("i igual a i2");
       else
        System.out.println("i diferente de i2");

       System.out.println(i3.equals(i4) ? "i3 igual a i4": "i3 diferente de i4");

       //Recebe uma String e converte em int
       //static int 	parseInt(String s)

       int i6 = Integer.parseInt("1");
       i6++;
       System.out.println("i6: " + i6);

       //Recebe um int e retorna uma String
       //static String 	toString(int i)
       //Sobrescreve o métodos da Classe Object

       String numero = Integer.toString(i6);
       numero = "::" + numero + "::";
       System.out.println(numero);

       //Recebe uma String e retorna um Integer
       //static Integer 	valueOf(String s)


   } 
}
