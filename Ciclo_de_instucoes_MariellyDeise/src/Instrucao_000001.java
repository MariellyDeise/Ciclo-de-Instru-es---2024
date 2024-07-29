public class Instrucao_000001 {
    double MBR;
    int pos;
    double[] memoria_dados;

    public Instrucao_000001(int pos, double MBR, double[] memoria_dados){
        this.pos = pos;
        this.MBR = MBR;
        this.memoria_dados = memoria_dados;
    }

    public double atribuir(){
        System.out.println("RI  <OPCODE>: 000001");
        System.out.println("RI  <OP1>: " + pos);
        System.out.println("DECODIFICACAO DA INSTRUCAO:");
        System.out.println("MBR <- #POS");
        System.out.println(MBR + " <- #" + pos);
        System.out.println("CALCULO DO ENDERECO DO OPERANDO: ");
        System.out.println("ENDERECO: " + pos);
        System.out.println("BUSCANDO OPERANDO NA POSICAO: ");
        System.out.println("MAR: " + pos);
        System.out.println("OPERACAO DE DADOS: ");
        System.out.println("EXECUTANDO OPERACAO");
        System.out.println("VALOR DO MBR: \n" + MBR);
        MBR = memoria_dados[pos];
        System.out.println("O VALOR NA MEMORIA: \n" + MBR);
        System.out.println("VALOR DO MBR APOS A OPERACAO:\n" + MBR);
        System.out.println("O VALOR FOI ARMAZENADO!");
        return MBR;
    }
    
}
