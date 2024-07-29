public class Instrucao_000100 {
    double MBR;
    double[] memoria_dados;
    int pos;

    public Instrucao_000100(double MBR, int pos, double[] memoria_dados){
        this.MBR = MBR;
        this.pos = pos;
        this.memoria_dados = memoria_dados;
    }

    public double subtrair(){
        System.out.println("RI  <OPCODE>: 000100");
        System.out.println("RI  <OP1>: " + pos);
        System.out.println("DECODIFICACAO DA INSTRUCAO:");
        System.out.println("MBR <- MBR - #POS");
        System.out.println(MBR + " <- " + MBR + " - #"+ pos);
        System.out.println("CALCULO DO ENDERECO DO OPERANDO: ");
        System.out.println("ENDERECO: " + pos);
        System.out.println("BUSCANDO OPERANDO NA POSICAO: ");
        System.out.println("MAR: " + pos);
        System.out.println("OPERACAO DE DADOS: ");
        System.out.println("EXECUTANDO OPERACAO");
        System.out.println("VALOR DO MBR: \n" + MBR);
        System.out.println("VALOR DO CEONTEUDO DA POSICAO:\n" + memoria_dados[pos]);
        MBR -= memoria_dados[pos];
        System.out.println("VALOR DO MBR APOS A OPERACAO:\n" + MBR);
        System.out.println("O VALOR FOI ARMAZENADO!");
        return MBR;
    }
}
