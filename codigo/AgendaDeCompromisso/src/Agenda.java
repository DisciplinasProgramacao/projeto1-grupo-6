import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;

public class Agenda {

    //Declaracao e inicializacao das variaveis
    private final ArrayList<Data> datas = new ArrayList<>();
    private final ArrayList<String> compromissos = new ArrayList<>();
    private int quantidadeCompromissosNaLista=0;

    //Metodo que adciona compromisso e data nas listas
    public void adcionarCompromisso(String compromisso, Data data, int repetirCada_X_Dias, int quantidadeDeVezesDoCompromisso){

        for(int i=0; i<quantidadeDeVezesDoCompromisso; i++){
            datas.add(data);
            compromissos.add(compromisso);
            quantidadeCompromissosNaLista++;
            data.addDias(repetirCada_X_Dias);
        }


    }

    //Metodo que retorna lista de compromissos na ordem COMPROMISSO, DATA
    public String verTodosCompromissos(){

        StringBuilder output = new StringBuilder();
        for(int i = 0, z = 1; i< quantidadeCompromissosNaLista; i++, z++){
            output.append(z);
            output.append("-");
            output.append(compromissos.get(i));
            output.append(", ");
            output.append(datas.get(i));
            output.append("\n");
        }

        return output.toString();

    }

}
