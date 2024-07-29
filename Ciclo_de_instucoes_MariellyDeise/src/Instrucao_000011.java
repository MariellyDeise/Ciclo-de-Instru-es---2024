public class Instrucao_000011 {
    double MBR;
    double[] memoria_dados;
    int pos;

    public Instrucao_000011(double MBR, int pos, double[] memoria_dados){
        this.pos = pos;
        this.MBR = MBR;
        this.memoria_dados = memoria_dados;
    }

    public double somar(){
        System.out.println("RI  <OPCODE>: 000011");
        System.out.println("RI  <OP1>: " + pos);
        System.out.println("DECODIFICACAO DA INSTRUCAO:");
        System.out.println("MBR <- MBR + #POS");
        System.out.println(MBR + " <- " + MBR + " + #"+ pos);
        System.out.println("CALCULO DO ENDERECO DO OPERANDO: ");
        System.out.println("ENDERECO: " + pos);
        System.out.println("BUSCANDO OPERANDO NA POSICAO: ");
        System.out.println("MAR: " + pos);
        System.out.println("OPERACAO DE DADOS: ");
        System.out.println("EXECUTANDO OPERACAO");
        System.out.println("VALOR DO MBR: \n" + MBR);
        System.out.println("VALOR DO CONTEUDO DA POSICAO:\n" + memoria_dados[pos]);
        MBR += memoria_dados[pos];
        System.out.println("VALOR DO MBR APOS A OPERACAO:\n" + MBR);
        System.out.println("O VALOR FOI ARMAZENADO!");
        return MBR;
    }
}
