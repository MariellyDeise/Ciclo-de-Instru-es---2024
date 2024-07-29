import java.util.Scanner;

public class TelaInicial {
    static Scanner scanf = new Scanner(System.in);
    static String red = "\033[0;31m";
    static String bold = "\033[1m";
    static String reset = "\033[0m";
    static int opcao;
    static int novamente;
    static boolean conf;

    static public void tabelaInstrucoes(){
       
        System.out.println(red + bold + "\t\t\tINSTRUCOES:\t\t\t\n");
        System.out.println("COD\t \tOP1\t \tOP2\t \tRESULTADOS" + reset);
        System.out.println("000001\t \t#POS\t \t   \t \tMBR <- #POS\t");
        System.out.println("000010\t \t#POS\t \t#DADO\t \t#POS <- #DADO\t");
        System.out.println("000011\t \t#POS\t \t   \t \tMBR <- MBR + #POS\t");
        System.out.println("000100\t \t#POS\t \t   \t \tMBR <- MBR - #POS\t");
        System.out.println("000101\t \t#POS\t \t   \t \tMBR <- MBR * #POS\t");
        System.out.println("000110\t \t#POS\t \t   \t \tMBR <- MBR / #POS\t");
        System.out.println("000111\t \t#LIN\t \t   \t \tJUMP to #LIN\t");
        System.out.println("001000\t \t#LIN\t \t   \t \tJUMP IF Z to #LIN\t");
        System.out.println("001001\t \t#LIN\t \t   \t \tJUMP IF N to #LIN\t");
        System.out.println("001010\t \t   \t \t   \t \tMBR <- raix_quadrada(MBR)\t");
        System.out.println("001011\t \t   \t \t   \t \tMBR <- -MBR\t");
        System.out.println("001111\t \t#POS\t \t   \t \t#POS <- MBR\t");
        System.out.println("001100\t \t#LIN\t \t   \t \tNOP\t\n");
        System.out.println("--------------------------------------------------------------------------------------\t\n");

    }

    static void opcoes_metodo(){
        System.out.println(red + bold + "\t\t\tOPCOES:\t\t\t\n" + reset);
        System.out.println(bold + "\t\t\t1 - INSERIR E EXECUTAR\t\t\t");
        System.out.println("\t\t\t2 - VER INSTRUCOES\t\t\t");
        System.out.println("\t\t\t3 - VER DADOS\t\t\t");
        System.out.println("\t\t\t4 - SAIR\t\t\t\n");
    }

    public static void main(String[] args){

        opcoes_metodo();

        do{
            System.out.print("Digite a opcao escolhida: ");
            conf = true;
            do{
                opcao = scanf.nextInt();
                if(opcao < 1 || opcao > 4){
                    System.out.print("Opcao invalida digite novamente: ");
                }else{
                    conf = false;
                }
            }while(conf == true);
            System.out.println("--------------------------------------------------------------------------------------\t\n");
    
            if(opcao == 2){
                tabelaInstrucoes();
            }else if(opcao == 1){
                Teste qualq = new Teste();
                qualq.executando_instrucoes();
            }else if(opcao == 3){
                Teste qualq = new Teste();
                qualq.ver_dados();
            }else if(opcao == 4){
                System.out.println("FINALIZADO!");
                break;
            }

            System.out.print("\nDeseja escolher outra opcao? 1 - sim 0 - nao 2 - ver opcoes novamente: ");
            conf = true;
            do{
                novamente = scanf.nextInt();
                if(novamente > 2 && novamente < 0){
                    System.out.println("Erro: opcao invalida");
                    System.out.print("Digite novamente: ");
                }else{
                    conf = false;
                }
            }while(conf == true); 
            
            if(novamente == 2){
                opcoes_metodo();
                novamente = 1;
            }
        }while(novamente == 1);
    }
    
}
