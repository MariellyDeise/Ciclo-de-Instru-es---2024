public class Instrucao_000010 {
    double dado;
    int pos;

    public Instrucao_000010(int pos, double dado){
        this.pos = pos;
        this.dado = dado;
    }

    public double atribuir(){
        System.out.println("RI  <OPCODE>: 000010");
        System.out.println("RI  <OP1>: " + pos);
        System.out.println("RI  <OP2>: " + dado);
        System.out.println("DECODIFICACAO DA INSTRUCAO:");
        System.out.println("#POS <- #DADO");
        System.out.println("#" + pos + " <- " + dado);
        System.out.println("CALCULO DO ENDERECO DO OPERANDO: ");
        System.out.println("ENDERECO: " + pos);
        System.out.println("BUSCANDO OPERANDO NA POSICAO: ");
        System.out.println("MAR: " + pos);
        System.out.println("CALCULO DO ENDERECO DO SEGUNDO OPERANDO: ");
        System.out.println("ENDERECO: " + dado);
        System.out.println("BUSCANDO OPERANDO NA POSICAO: ");
        System.out.println("MAR: " + dado);
        System.out.println("OPERACAO DE DADOS: ");
        System.out.println("ARMAZENANDO\n" + dado);
        System.out.println("NA POSICAO\n" + pos);
        System.out.println("CALCULO DO ENDERECO DO OPERANDO: ");
        System.out.println("ENDERECO: " + pos);
        System.out.println("ARMAZENANDO OPERANDO: ");
        System.out.println("MAR: " + pos);
        System.out.println("O VALOR FOI ARMAZENADO!");
        return dado;
    }
}
