public class Instrucao_001011 {
    double MBR;

    public Instrucao_001011(double MBR){
        this.MBR = MBR;
    }

    public double negativo(){
        System.out.println("RI  <OPCODE>: 001011");
        System.out.println("DECODIFICACAO DA INSTRUCAO:");
        System.out.println("MBR <- -MBR");
        System.out.println(MBR + " <- -" + MBR);
        System.out.println("CALCULO DO ENDERECO DO OPERANDO: ");
        System.out.println("ENDERECO: " + MBR);
        System.out.println("BUSCANDO OPERANDO NA POSICAO: ");
        System.out.println("MAR: " + MBR);
        System.out.println("OPERACAO DE DADOS: ");
        System.out.println("EXECUTANDO OPERACAO");
        System.out.println("VALOR DO MBR: \n" + MBR);
        MBR *= (-1);
        System.out.println("VALOR DO MBR APOS A OPERACAO:\n" + MBR);
        System.out.println("INSTRUCAO ARMAZENADA!");
        return MBR;
    }
}
