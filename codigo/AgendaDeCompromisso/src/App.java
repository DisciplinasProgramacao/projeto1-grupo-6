import javax.management.InvalidAttributeValueException;

public class App {

    public static void main(String[] args) throws InvalidAttributeValueException {

        Agenda agenda = new Agenda();
        Data data1 = new Data(20, 7,2022);
        Data data2 = new Data(19, 12, 2022);
        Data data3 = new Data(15, 10, 2022);
        Data data4 = new Data(19, 10, 2022);
        Data data5 = new Data(15, 11, 2022);

        Data data_inicial = new Data(15, 10, 2022);
        Data data_final = new Data(15, 11, 2022);

        agenda.adcionarCompromisso("Dentista", data1, 2, 2);
        agenda.adcionarCompromisso("Ir ao mercado", data2, 0, 1);
        agenda.adcionarCompromisso("Reuniao", data3, 0, 1);
        agenda.adcionarCompromisso("Casamento", data4, 0, 1);
        agenda.adcionarCompromisso("Viagem", data5, 0, 1);

        System.out.println(agenda.verTodosCompromissos());
        
        System.out.println(agenda.listarCompromissosEntreDuasDatas(data_inicial, data_final));

    }

}
