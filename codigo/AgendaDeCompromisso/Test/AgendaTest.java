import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.management.InvalidAttributeValueException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgendaTest {

    Data data1;
    Data data2;

    @BeforeEach
    public void init() throws InvalidAttributeValueException {
        data1 = new Data(20, 7,2022);
        data2 = new Data(19, 12, 2022);

    }

    @Test
    public void criarCompromisso() throws InvalidAttributeValueException {

        Agenda agenda = new Agenda();
        agenda.adcionarCompromisso("Dentista", data1, 2, 2);
        //agenda.adcionarCompromisso("Ir ao mercado", data2);
        //assertEquals("1-Dentista, 20/07/2022\n2-Ir ao mercado, 19/12/2022\n", agenda.verTodosCompromissos());
        assertEquals("1-Dentista, 20/07/2022\n2-Dentista, 22/07/2022\n", agenda.verTodosCompromissos());

    }

}
