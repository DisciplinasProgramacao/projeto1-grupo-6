import javax.management.InvalidAttributeValueException;

public class Data extends Object implements Comparable<Data>{
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private static final int[] MAX_DIA = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] MAX_DIA_BISEXTO={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int MAX_MES=12;
    
    public Data(int dia,int mes,int ano) throws InvalidAttributeValueException{
        this.ano=ano;
        if(mes>=1 && mes<=12)this.mes=mes;
        else throw new InvalidAttributeValueException("Valor de mes invalido");
        if(dia>=1 && dia<=this.getMAX_DIA())this.dia=dia;
        else throw new InvalidAttributeValueException("Valor de dia invalido");
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String maiorData(Data o) {
        switch (this.compareTo(o)) {
            case -1:
                return "A mais futura e: " + o.toString();

            case 0:
                return "As datas são iguais.";

            case 1:
                return "A mais futura e: " + this.toString();

            default:
                return "Não foi possível comparar as datas.";
        }
    }

    public void addDias(int dias){
        this.dia+=dias;
        while(this.dia>this.getMAX_DIA()){
            this.dia-=this.getMAX_DIA();
            this.addMeses(1);
        }
    }

    public void addMeses(int meses){
        int vezes=0;
        this.mes+=meses;
        while(this.mes>this.MAX_MES){
            this.mes-=this.MAX_MES;
            vezes++;
        }
        addAnos(vezes);
    }

    public void addAnos(int anos){
        this.ano+=anos;
    }

    private int getMAX_DIA(int mes){
        return (this.ano%4==0) ? MAX_DIA_BISEXTO[mes-1] : MAX_DIA[mes-1];
    }
    private int getMAX_DIA(){
        return this.getMAX_DIA(this.mes);
    }
    private int getMesesEmDias(){
        int dias=0;
        for (int i=1;i<=mes;i++) {
            dias+=getMAX_DIA(i);
        }
        return dias;
    }
    private int getDataEmDias(){
        int anosBisextos=this.ano/4;
        int dias=anosBisextos*366;
        dias+=(this.ano-anosBisextos)*365;
        dias+=(this.ano<0)?-1*getMesesEmDias():getMesesEmDias();
        dias+=(this.ano<0)?-1*getDia():getDia();
        return dias;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String output=(this.dia.toString().length()==1)?"0"+this.dia.toString():this.dia.toString();
        output+="/";
        output+=(this.mes.toString().length()==1)?"0"+this.mes.toString():this.mes.toString();
        output+="/";
        output+=(this.ano.intValue()<0)?(this.ano.intValue()*-1)+"a.C":this.ano.toString();
        return output;
    }

    @Override
    public int compareTo(Data o) {
        // TODO Auto-generated method stub
        return (this.getDataEmDias()==o.getDataEmDias())?0:this.getDataEmDias()<o.getDataEmDias()?-1:1;
    }

}
