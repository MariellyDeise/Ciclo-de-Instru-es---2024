public class Instrucao_001001 {       
 int lin;
 double MBR;
   
    public Instrucao_001001(int lin, double MBR){
        this.lin = lin;
        this.MBR = MBR;
    }
    
    public boolean jumpN(){

        System.out.println("RI  <OPCODE>: 001001");
        System.out.println("RI  <LIN>: " + lin);
        System.out.println("DECODIFICACAO DA INSTRUCAO:");
        System.out.println("JUMP to #LIN");
        System.out.println("JUMP to #" + lin);
        System.out.println("EXECUTANDO OPERACAO");
        if(MBR < 0){
            return true;
        }else{
            System.out.println("Erro: MBR >= 0.");
            return false;
        }
    }
    
}
