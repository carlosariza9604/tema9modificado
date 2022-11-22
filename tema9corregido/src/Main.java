public class Main {
    public static void main(String[] args) {
      Cliente c1=new Cliente();
      Trabajador t1= new Trabajador();
      c1.nombre= "Carlos";
      c1.edad=26;
      c1.telefono=129654456;
      c1.credito=155.55;
      System.out.println("soy "+c1.nombre + ", tengo "+ c1.edad + " años y mi telefono es "+c1.telefono+
              " y mi credito disponible es " + c1.credito + "$" );
      t1.nombre= "Jose";
      t1.edad= 25;
      t1.telefono= 26565654;
      t1.salario=1000;
        System.out.println("soy "+t1.nombre + ", tengo "+ t1.edad + " años y mi telefono es "+t1.telefono+
                " y mi salario  es " + t1.salario + "$" );


    }
}
class Persona {
    int edad;
    int telefono;
    static String nombre;
}
class Cliente extends Persona{
    double credito;
}
class Trabajador extends Persona{
    double salario;
}
