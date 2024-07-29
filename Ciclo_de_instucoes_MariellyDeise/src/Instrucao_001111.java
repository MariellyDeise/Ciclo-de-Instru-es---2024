public class Instrucao_001111 {
    int pos;
    double MBR;
    double[] memoria_dados;

    public Instrucao_001111(int pos, double MBR, double[] memoria_dados){
        this.pos = pos;
        this.MBR = MBR;
        this.memoria_dados = memoria_dados;
    }

    public double pos_MBR(){
        System.out.println("RI  <OPCODE>: 001111");
        System.out.println("RI  <OP1>: " + pos);
        System.out.println("DECODIFICACAO DA INSTRUCAO:");
        System.out.println("#POS <- MBR");
        System.out.println("#" + pos + " <- " + MBR);
        System.out.println("CALCULO DO ENDERECO DO OPERANDO: ");
        System.out.println("ENDERECO: " + pos);
        System.out.println("BUSCANDO OPERANDO NA POSICAO: ");
        System.out.println("MAR: " + pos);
        System.out.println("OPERACAO DE DADOS: ");
        System.out.println("EXECUTANDO OPERACAO");
        System.out.println("VALOR DO MBR: \n" + MBR);
        System.out.println("O VALOR NA MEMORIA: \n" + memoria_dados[pos]);
        memoria_dados[pos] = MBR;
        System.out.println("VALOR NA MEMORIA APOS A OPERACAO:\n" + memoria_dados[pos]);
        System.out.println("INSTRUCAO ARMAZENADA!");
       
        return memoria_dados[pos];
    }
}
