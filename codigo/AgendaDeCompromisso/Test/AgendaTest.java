import org.junit.jupiter.api.Test;
import javax.management.InvalidAttributeValueException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgendaTest {

    @Test
    public void criarCompromisso() throws InvalidAttributeValueException {

        Agenda agenda = new Agenda();
        agenda.adcionarCompromisso("Dentista", 20, 7,2022);
        agenda.adcionarCompromisso("Ir ao mercado", 19, 12, 2022);
        assertEquals("1-Dentista, 20/07/2022\n2-Ir ao mercado, 19/12/2022\n", agenda.verTodosCompromissos());

    }

}
