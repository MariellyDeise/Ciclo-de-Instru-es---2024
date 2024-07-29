public class Instrucao_000111 {
    int lin;

    public Instrucao_000111(int lin){
        this.lin = lin;
    }

    public void jumpLin(){
        System.out.println("RI  <OPCODE>: 000111");
        System.out.println("RI  <LIN>: " + lin);
        System.out.println("DECODIFICACAO DA INSTRUCAO:");
        System.out.println("JUMP to #LIN");
        System.out.println("JUMP to #" + lin);
        System.out.println("EXECUTANDO OPERACAO");
        System.out.println("INSTRUCAO EXECUTADA!");
    }
}
