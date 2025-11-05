package wrapper_enum_generico;

public class DemoEnum {
    enum Dia {
        LUNES, MARTES,MIERCOLES, JUEVES,VIERNES
    }
    public static void main(String[] args) {
        Dia hoy = Dia.MIERCOLES;
        String diaSemana = Dia.LUNES.name();

        switch (diaSemana) {
            case "LUNES":
                System.out.println("Inicio de semana");
                break;
            case "VIERNES":
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("dia de hoy, dia normal");
        }

    }
}