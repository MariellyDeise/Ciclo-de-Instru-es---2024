import java.util.Scanner;

public class Teste {
    public static Scanner scanf = new Scanner(System.in);

    static double[] vet_dado;
    static int numero_instrucoes;
    static int[] vet_posicao;
    static int[] linha;
    static String[] vet_instrucoes;
    

    public static int tratando_pos(int indice_memoria){
        boolean bool = false;
        int pos;
        do{
            pos = scanf.nextInt();
            if(pos >= indice_memoria || pos < 0){
                System.out.println("Erro: o a posicao nao deve ser maior que " + indice_memoria + " nem menor que '0'.");
                System.out.print("Tente novamente.\n#POS: ");
            }else{
                bool = true;
            }
        }while(bool == false);
        
        return pos;
    }

    public static int tratamento_lin(int numero_instrucoes){
        boolean bool = false;
        int lin;
        do{
            lin = scanf.nextInt();
            if(lin > numero_instrucoes || lin <= 0){
                System.out.println("Erro: o a posicao nao deve ser maior que " + numero_instrucoes + " nem menor que '0'.");
                System.out.print("Tente novamente.\n#LIN: ");
            }else{
                bool = true;
            }
        }while(bool == false);
        return lin;
    }

    static void executando_instrucoes(){
        int indice_instrucao = 500;
        int indice_memoria = 500;
        double MBR = 0;
        double[] memoria_dados = new double[indice_memoria];
        vet_instrucoes = new String[indice_instrucao];

        for(int i = 0; i < indice_memoria; i++){
            memoria_dados[i] = 0;
        }

        System.out.print("Quantas instrucoes deseja executar? (numero maximo de " + indice_instrucao + ") ");
        numero_instrucoes = scanf.nextInt();
        scanf.nextLine();

        vet_dado = new double[numero_instrucoes];
        linha = new int[numero_instrucoes];
        vet_posicao = new int[numero_instrucoes];
        int[] orden_dado = new int[numero_instrucoes];
        int[] orden_lin = new int[numero_instrucoes];
        int[] orden_pos = new int[numero_instrucoes];
        

        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < (numero_instrucoes); i++){
            boolean aceita;

            do{// verificar na parte de incerção.
                aceita = true;
                System.out.print("Insira a " + (i+1) + "° instrucao: ");
                vet_instrucoes[i] = scanf.nextLine();

                if(vet_instrucoes[i].equals("000001")){//00
                    System.out.print("#POS: ");
                    vet_posicao[x] = tratando_pos(indice_memoria);
                    orden_pos[x] = i + 1;
                    x++;
                    scanf.nextLine();
                    
                }else if(vet_instrucoes[i].equals("000010")){//01
                    System.out.print("#POS: ");
                    vet_posicao[x] = tratando_pos(indice_memoria);
                    orden_pos[x] = i + 1;
                    x++;
    
                    System.out.print("#DADO: ");
                    vet_dado[y] = scanf.nextDouble();
                    orden_dado[y] = i + 1;
                    y++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("000011")){//02
                    System.out.print("#POS: ");
                    vet_posicao[x] = tratando_pos(indice_memoria);
                    orden_pos[x] = i + 1;
                    x++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("000100")){//03
                    System.out.print("#POS: ");
                    vet_posicao[x] = tratando_pos(indice_memoria);
                    orden_pos[x] = i + 1;
                    x++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("000101")){//04
                    System.out.print("#POS: ");
                    vet_posicao[x] = tratando_pos(indice_memoria);
                    orden_pos[x] = i + 1;
                    x++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("000110")){//05
                    System.out.print("#POS: ");
                    vet_posicao[x] = tratando_pos(indice_memoria);
                    orden_pos[x] = i + 1;
                    x++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("000111")){//06
                    System.out.print("#LIN: ");
                    linha[z] = tratamento_lin(numero_instrucoes);
                    orden_lin[z] = i + 1;
                    z++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("001000")){//07
                    System.out.print("#LIN: ");
                    linha[z] = tratamento_lin(numero_instrucoes);
                    orden_lin[z] = i + 1;
                    z++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("001001")){//08
                    System.out.print("#LIN: ");
                    linha[z] = tratamento_lin(numero_instrucoes);
                    orden_lin[z] = i + 1;
                    z++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("001010")){//09
                    System.out.println("Instrucao armazenada");
    
                }else if(vet_instrucoes[i].equals("001011")){//10
                    System.out.println("Instrucao armazenada");
    
                }else if(vet_instrucoes[i].equals("001111")){//11
                    System.out.print("#POS: ");
                    vet_posicao[x] = tratando_pos(indice_memoria);
                    orden_pos[x] = i + 1;
                    x++;
                    scanf.nextLine();
    
                }else if(vet_instrucoes[i].equals("001100")){//12
                    System.out.println("Instrucao armazenada");
    
                }else{
                    System.out.println("Erro: instrucao nao existente.");
                    aceita = false;
                }

            }while(aceita != true);// substituir por 'if';
        }

        x = 0;
        y = 0;
        z = 0;

        int[] memori_indice_x = new int[numero_instrucoes];// variável usada para regatar o valor da instrução na linha usada pela primeira vez, para se caso a linha seja repedida o calor da posição que a instrução usa seja o mesmo instruido anteriormente.
        int[] memori_indice_y = new int[numero_instrucoes];// variável usada para regatar o valor da instrução na linha usada pela primeira vez, para se caso a linha seja repedida o calor do dado que a instrução usa seja o mesmo instruido anteriormente.
        int[] memori_indice_z = new int[numero_instrucoes];// variável usada para regatar o valor da instrução na linha usada pela primeira vez, para se caso a linha seja repedida o calor da linha que a instrução usa seja o mesmo instruido anteriormente.
        for(int i = 0; i < numero_instrucoes; i++){// iguala tudo a '-1', pois não existe indice -1.
            memori_indice_x[i] = -1;
            memori_indice_y[i] = -1;
            memori_indice_z[i] = -1;
        }

        boolean stop = false;


        for(int i = 0; i < numero_instrucoes && stop == false; i++){// o for executa enquanto o numero de instruções não forem atendidos, ou a instrução de finalização ser executada.
            System.out.println("--------------------------------------------------------------------------------------\t\n");
            System.out.println("\nCALCULANDO O ENDERECO DA INSTRUCAO = \nPC: " + (i+1));
            System.out.println("BUSCA DA INSTRUCAO: ");
            if(vet_instrucoes[i].equals("000001")){//00 atribui o valor na posição inserida ao MBR.
                if(memori_indice_x[i] == -1){
                    memori_indice_x[i] = x;
                }else{
                    x = memori_indice_x[i];
                }
                Instrucao_000001 qualq = new Instrucao_000001(vet_posicao[x], MBR, memoria_dados);//instanciando a classe.
                MBR = qualq.atribuir();
                x++; 

            }else if(vet_instrucoes[i].equals("000010")){//01 atribui um valor na memória para a posição inserida.
                if(memori_indice_x[i] == -1 && memori_indice_y[i] == -1){
                    memori_indice_x[i] = x;
                    memori_indice_y[i] = y;
                }else{
                    x = memori_indice_x[i];
                    y = memori_indice_y[i];
                }
                Instrucao_000010 qualq = new Instrucao_000010(vet_posicao[x], vet_dado[y]);
                memoria_dados[vet_posicao[x]] = qualq.atribuir();
                x++;
                y++;

            }else if(vet_instrucoes[i].equals("000011")){//02 MBR somado ao conteúdo na posição inserida.
                if(memori_indice_x[i] == -1){
                    memori_indice_x[i] = x;
                }else{
                    x = memori_indice_x[i];
                }
                Instrucao_000011 qualq = new Instrucao_000011(MBR, vet_posicao[x], memoria_dados);
                MBR = qualq.somar();
                x++;
                
            }else if(vet_instrucoes[i].equals("000100")){//03 MBR subtraido o conteúdo da posição inserida.
                if(memori_indice_x[i] == -1){
                    memori_indice_x[i] = x;
                }else{
                    x = memori_indice_x[i];
                }
                Instrucao_000100 qualq = new Instrucao_000100(MBR, vet_posicao[x], memoria_dados);
                MBR = qualq.subtrair();
                x++;
                
            }else if(vet_instrucoes[i].equals("000101")){//04 MBR multiplicado ao conteúdo da posição inserida.
                if(memori_indice_x[i] == -1){
                    memori_indice_x[i] = x;
                }else{
                    x = memori_indice_x[i];
                }
                Instrucao_000101 qualq = new Instrucao_000101(MBR, vet_posicao[x], memoria_dados);
                MBR = qualq.multiplicar();
                x++;
               
            }else if(vet_instrucoes[i].equals("000110")){//05 MBR dividido pelo conteúdo da posição inserida.
                if(memori_indice_x[i] == -1){
                    memori_indice_x[i] = x;
                }else{
                    x = memori_indice_x[i];
                }
                Instrucao_000110 qualq = new Instrucao_000110(MBR, vet_posicao[x], memoria_dados);
                MBR = qualq.dividir();
                x++;
                
            }else if(vet_instrucoes[i].equals("000111")){//06 pula para a linha de execução escolhida.
                if(memori_indice_z[i] == -1){
                    memori_indice_z[i] = z;
                }else{
                    z = memori_indice_z[i];
                }
                Instrucao_000111 qualq = new Instrucao_000111(linha[z]);
                qualq.jumpLin();
                i = linha[z] - 2;// subtrai 1, pois não existe linha 0...................
                z++;    

            }else if(vet_instrucoes[i].equals("001000")){//07 muda a linha que esta sendo realizada a instrução para a linha inserida se o MBR for igual a 0.
                if(memori_indice_z[i] == -1){
                    memori_indice_z[i] = z;
                }else{
                    z = memori_indice_z[i];
                }
                Instrucao_001000 qualq = new Instrucao_001000(linha[z], MBR);
                boolean bool = qualq.jumpZ();
                if(bool == true){
                    i = linha[z] - 2;//.............
                }
                z++; 

            }else if(vet_instrucoes[i].equals("001001")){//08 muda a linha que esta sendo realizada a instrução para a linha inserida se o MBR for negativo.
                if(memori_indice_z[i] == -1){
                    memori_indice_z[i] = z;
                }else{
                    z = memori_indice_z[i];
                }
                Instrucao_001001 qualq = new Instrucao_001001(linha[z], MBR);
                boolean bool = qualq.jumpN();
                if(bool == true){
                    i = linha[z] - 2;// decrementa 1 pois não existe linha 0...............
                }
                z++; 

            }else if(vet_instrucoes[i].equals("001010")){//09 MBR passa a possuir o valor de sua raiz quadrada.
                Instrucao_001010 qualq = new Instrucao_001010(MBR);
                MBR = qualq.raizMBR();

            }else if(vet_instrucoes[i].equals("001011")){//10 MBR passa a possuir o valor de seu inverso.
                Instrucao_001011 qualq = new Instrucao_001011(MBR);
                MBR = qualq.negativo();

            }else if(vet_instrucoes[i].equals("001111")){//11 a memoria na posição desejada passa a armazenar o valor do MBR atual.
                if(memori_indice_x[i] == -1){
                    memori_indice_x[i] = x;
                }else{
                    x = memori_indice_x[i];
                }
                Instrucao_001111 qualq = new Instrucao_001111(vet_posicao[x], MBR, memoria_dados);
                memoria_dados[vet_posicao[x]] = qualq.pos_MBR();
                x++;

            }else if(vet_instrucoes[i].equals("001100")){//12 finaliza o ciclo de instruções.
                Instrucao_001100 qualq = new Instrucao_001100();
                qualq.nop();
                stop = true;
                System.out.println("OPERACOES ENCERRADAS!");
                System.out.println("--------------------------------------------------------------------------------------\t\n");
            }
        }

    }

    static void ver_dados(){

        int x = 0;
        int y = 0;
        int z = 0;

        for(int i = 0; i < numero_instrucoes; i++){
            System.out.println("--------------------------------------------------------------------------------------\t\n");
            if(vet_instrucoes[i].equals("000001")){//00 atribui o valor na posição inserida ao MBR.
                System.out.println("Dados inctrucao: 000001");
                System.out.println("#POS = " + vet_posicao[x]);
                x++;

            }else if(vet_instrucoes[i].equals("000010")){//01 atribui um valor na memória para a posição inserida.
                System.out.println("Dados inctrucao: 000010");
                System.out.println("#POS = " + vet_posicao[x]);
                x++;
                System.out.println("DADO = " + vet_dado[y]);
                y++;

            }else if(vet_instrucoes[i].equals("000011")){//02 MBR somado ao conteúdo na posição inserida.
                System.out.println("Dados inctrucao: 000011");
                System.out.println("#POS = " + vet_posicao[x]);
                x++;
               
            }else if(vet_instrucoes[i].equals("000100")){//03 MBR subtraido o conteúdo da posição inserida.
                System.out.println("Dados inctrucao: 000100");
                System.out.println("#POS = " + vet_posicao[x]);
                x++;
                
            }else if(vet_instrucoes[i].equals("000101")){//04 MBR multiplicado ao conteúdo da posição inserida.
                System.out.println("Dados inctrucao: 000101");
                System.out.println("#POS = " + vet_posicao);
                x++;
               
            }else if(vet_instrucoes[i].equals("000110")){//05 MBR dividido pelo conteúdo da posição inserida.
                System.out.println("Dados inctrucao: 000110");
                System.out.println("#POS = " + vet_posicao[x]);
                x++;
                
            }else if(vet_instrucoes[i].equals("000111")){//06 pula para a linha de execução escolhida.
                System.out.println("Dados inctrucao: 000111");
                System.out.println("LIN = " + linha[z]);
                z++;    

            }else if(vet_instrucoes[i].equals("001000")){//07 muda a linha que esta sendo realizada a instrução para a linha inserida se o MBR for igual a 0.
                System.out.println("Dados inctrucao: 001000");
                System.out.println("LIN = " + linha[z]);
                z++; 

            }else if(vet_instrucoes[i].equals("001001")){//08 muda a linha que esta sendo realizada a instrução para a linha inserida se o MBR for negativo.
                System.out.println("Dados inctrucao: 001001");
                System.out.println("LIN = " + linha[z]);
                z++; 

            }else if(vet_instrucoes[i].equals("001010")){//09 MBR passa a possuir o valor de sua raiz quadrada.
               System.out.println("Nenhuma informacao inserida.");

            }else if(vet_instrucoes[i].equals("001011")){//10 MBR passa a possuir o valor de seu inverso.
                 System.out.println("Nenhuma informacao inserida.");

            }else if(vet_instrucoes[i].equals("001111")){//11 a memoria na posição desejada passa a armazenar o valor do MBR atual.
                System.out.println("Dados inctrucao: 001111");
                System.out.println("#POS = " + vet_posicao[x]);
                x++;

            }else if(vet_instrucoes[i].equals("001100")){//12 finaliza o ciclo de instruções.
                System.out.println("Nenhuma informacao inserida.");
                System.out.println("--------------------------------------------------------------------------------------\t\n");

            }
        }
    }
}
