package taller.tipo_de_datos;

public class estructura_condicional {
    public static void main(String[] args) {
        int edad = 18;
        if(edad>17) {
            System.out.println("Puede votar");
        }


        int edadParaVotar = 17;
        if(edadParaVotar > 17) {
            System.out.println("Puede votar, cumple con la edad");
        } else {
            System.out.println("Regresa a casa");
        }


        int edadCiudadano = 17;
        boolean esMexicano = true;
        if(edadCiudadano > 17)
            System.out.println("Cumple con la edad, tiene: " + edadCiudadano);
        else if (esMexicano  )
            System.out.println("Si es de México");


        int entero =  4;
        if(entero == 1)
            System.out.println("Es uno");
        else if(entero == 2)
            System.out.println("Es dos");
        else if(entero == 3)
            System.out.println("Es tres");


        int valorEntero = 10;
        switch (valorEntero) {
            case 1 :
            case 3 :
            case 5 :
                System.out.println("Valor impar");
                break;
            case 2 :
            case 4 :
            case 6 :
                System.out.println("Valor par");
                break;
            default:
                System.out.println("No se encuentra el número");
                break;
        }

    }
}
