import javax.management.InvalidAttributeValueException;

public class App {

    public static void main(String[] args) throws InvalidAttributeValueException {

        Agenda agenda = new Agenda();
        agenda.adcionarCompromisso("Dentista", 20, 7,2022);
        agenda.adcionarCompromisso("Ir ao mercado", 19, 12, 2022);

        System.out.println(agenda.verTodosCompromissos());

    }

}
