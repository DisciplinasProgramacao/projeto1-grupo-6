import javax.management.InvalidAttributeValueException;

public class App {

    public static void main(String[] args) throws InvalidAttributeValueException {

        Agenda agenda = new Agenda();
        Data data1 = new Data(20, 7,2022);
        Data data2 = new Data(19, 12, 2022);

        agenda.adcionarCompromisso("Dentista", data1, 2, 2);
        agenda.adcionarCompromisso("Ir ao mercado", data2, 0, 1);

        System.out.println(agenda.verTodosCompromissos());

    }

}
