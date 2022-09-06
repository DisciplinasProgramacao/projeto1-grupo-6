import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.management.InvalidAttributeValueException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgendaTest {

    Data data1;
    Data data2;
    Data data3;
    Data data4;
    Data data5;
    
    Agenda agenda = new Agenda();

    @BeforeEach
    public void init() throws InvalidAttributeValueException {
        data1 = new Data(20, 7,2022);
        data2 = new Data(19, 12, 2022);
        data3 = new Data(15, 10, 2022);
        data4 = new Data(19, 10, 2022);
        data5 = new Data(15, 11, 2022);
        
        agenda.adcionarCompromisso("Dentista", data1, 2, 2);
        agenda.adcionarCompromisso("Ir ao mercado", data2, 0, 1);
        agenda.adcionarCompromisso("Reunião", data3, 0, 1);
        agenda.adcionarCompromisso("Casamento", data4, 0, 1);
        agenda.adcionarCompromisso("Viagem", data5, 0, 1);

    }

    @Test
    public void criarCompromisso() throws InvalidAttributeValueException {

        
        assertEquals("1-Dentista, 20/07/2022\n2-Dentista, 22/07/2022\n3-Ir ao mercado, 19/12/2022\n", agenda.verTodosCompromissos());

    }
    
        @Test
        public void listarCompromissos() throws InvalidAttributeValueException {

        assertEquals("Compromisso - Reunião: 15/10/2022\nCompromisso - Casamento: 19/10/2022\nCompromisso - Viagem: 15/11/2022", agenda.listarCompromissos(new Data(15, 10, 2022), new Data(15, 11, 2022)) );


    }

}
