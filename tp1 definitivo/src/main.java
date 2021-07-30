import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // continuação do exemplo anterior

        int ref = 200;// referencia
        Scanner ler = new Scanner(System.in);
        int qnt_usuarios = 0;
        // Criando um Array de ref números
        String nome[] = new String[ref];// referencia String
        String endereco[] = new String[ref];// referencia String
        String telefone[] = new String[ref];// referencia String
        int refp = 200;
        String nomep[] = new String[refp];
        String descricaop[] = new String[refp];
        int valorcp[] = new int[refp];// valor compra produto
        int porctp[] = new int[refp];
        int qntp[] = new int[refp];
        int variavel = -1;
        int varqntclientes = 10;

        int varqntclientesp = 10;
        // Cadastro base de clientes 10
        nome[0] = "caio1";
        endereco[0] = "cabv1";
        telefone[0] = "1001";

        nome[1] = "caio2";
        endereco[1] = "cabv2";
        telefone[1] = "1002";

        nome[2] = "caio3";
        endereco[2] = "cabv3";
        telefone[2] = "1003";

        nome[3] = "caio4";
        endereco[3] = "cabv4";
        telefone[3] = "1004";

        nome[4] = "caio5";
        endereco[4] = "cabv5";
        telefone[4] = "1005";

        nome[5] = "caio6";
        endereco[5] = "cabv6";
        telefone[5] = "1006";

        nome[6] = "caio7";
        endereco[6] = "cabv7";
        telefone[6] = "1007";

        nome[7] = "caio8";
        endereco[7] = "cabv8";
        telefone[7] = "1008";

        nome[8] = "caio9";
        endereco[8] = "cabv9";
        telefone[8] = "1009";

        nome[9] = "caio10";
        endereco[9] = "cabv10";
        telefone[9] = "10010";
        // Cadastro base de produtos 10

        nomep[0] = "maca1";
        descricaop[0] = "fruta";
        valorcp[0] = 3;
        porctp[0] = 50;
        qntp[0] = 10;

        nomep[1] = "banana2";
        descricaop[1] = "fruta";
        valorcp[1] = 2;
        porctp[1] = 55;
        qntp[1] = 15;

        nomep[2] = "arroz";
        ;
        descricaop[2] = "graos";
        valorcp[2] = 15;
        porctp[2] = 30;
        qntp[2] = 5;

        nomep[3] = "feijao";
        descricaop[3] = "feijao";
        valorcp[3] = 5;
        porctp[3] = 20;
        qntp[3] = 5;

        nomep[4] = "carvao";
        descricaop[4] = "combustivel";
        valorcp[4] = 15;
        porctp[4] = 50;
        qntp[4] = 10;

        nomep[5] = "queijo";
        descricaop[5] = "auxiliar";
        valorcp[5] = 4;
        porctp[5] = 100;
        qntp[5] = 10;

        nomep[6] = "pao";
        descricaop[6] = "comida";
        valorcp[6] = 1;
        porctp[6] = 100;
        qntp[6] = 20;

        nomep[7] = "presunto";
        descricaop[7] = "comida";
        valorcp[7] = 2;
        porctp[7] = 100;
        qntp[7] = 100;

        nomep[8] = "frango";
        descricaop[8] = "comida";
        valorcp[8] = 10;
        porctp[8] = 20;
        qntp[8] = 10;

        nomep[9] = "carne";
        descricaop[9] = "comida";
        valorcp[9] = 30;
        porctp[9] = 30;
        qntp[9] = 5;

        do {
            System.out.println("1. Cadastro de novo cliente.");
            System.out.println("2. Busca por cliente.");
            System.out.println("3. Cadastro de novo produto.");
            System.out.println("4. Busca por produto");
            System.out.println("5. Cadastro de venda.");
            System.out.println("6. Mostrar produtos em estoque.");
            System.out.println("7. Sair");
            System.out.printf("Digite um numero: ");
            int numeroEsc;
            numeroEsc = ler.nextInt();
            switch (numeroEsc) {
                case 1:
                    System.out.println("Informe quantos pessoas:");
                    qnt_usuarios = ler.nextInt();
                    ler.nextLine();
                    for (int aux = varqntclientes; aux < qnt_usuarios + varqntclientes; aux++) {
                        System.out.print("Número digite o nome: usuario" + (aux + 1) + " :");
                        nome[aux] = ler.nextLine();
                        System.out.print("Número digite o endereco: usuario" + (aux + 1) + " :");
                        endereco[aux] = ler.nextLine();
                        System.out.print("Número digite o telefone: usuario" + (aux + 1) + " :");
                        telefone[aux] = ler.nextLine();
                    }
                    varqntclientes = varqntclientes + qnt_usuarios;
                    break;
                case 2:
                    String nomeB;
                    System.out.println("digite o nome por favor");
                    ler.nextLine();
                    nomeB = ler.nextLine();
                    boolean flag1 = false;
                    for (int cont = 0; cont < varqntclientes; cont++) {
                        if (nomeB.equalsIgnoreCase(nome[cont])) {
                            flag1 = true;
                            System.out.println("dados do usuario:" + nomeB);
                            System.out.println("Digite o nome:");
                            System.out.println(nome[cont]);
                            System.out.println("Digite o endereco:");
                            System.out.println(endereco[cont]);
                            System.out.println("digite o telefone:");
                            System.out.println(telefone[cont]);
                            System.out.println("Deseja alterar os dados do usuario se sim digite 1:");
                            int numberif; // numero if
                            numberif = ler.nextInt();
                            if (numberif != 0) {
                                String nomealt;// alterar
                                String enderecoalt;
                                String telefonealt;
                                ler.nextLine();
                                System.out.println("digite o nome do usuario" + cont + ":");
                                nomealt = ler.nextLine();
                                nome[cont] = nomealt;
                                System.out.println("digite endereco:");
                                enderecoalt = ler.nextLine();
                                endereco[cont] = enderecoalt;
                                System.out.println("digite o telefone:");
                                telefonealt = ler.nextLine();
                                telefone[cont] = telefonealt;
                                System.out.println(nome[cont] + endereco[cont] + telefone[cont]);
                                System.out.println(nomealt + enderecoalt + telefonealt);
                            }
                        }
                    }
                    if (flag1 == false) {
                        System.out.println("o nome não existe: ");
                    }
                    break;

                case 3:
                    // referencia produto
                    int numerorefp = 0;

                    System.out.println("Informe quantos produtos:");
                    numerorefp = ler.nextInt();
                    for (int auxp = varqntclientesp; auxp < varqntclientesp + numerorefp; auxp++) {
                        ler.nextLine();
                        System.out.println("digite o nome do produto" + (auxp + 1) + ":");
                        nomep[auxp] = ler.nextLine();
                        System.out.println("Digite a descricao do produto:" + (auxp + 1) + ":");
                        descricaop[auxp] = ler.nextLine();
                        System.out.println("Digite o valor de compra do produto:" + (auxp + 1) + ":");
                        valorcp[auxp] = ler.nextInt();
                        System.out.println("Digite a porcentagem de venda:" + (auxp + 1) + ":");
                        porctp[auxp] = ler.nextInt();
                        System.out.println("Digite a quantidade em estoque:" + (auxp + 1) + ":");
                        qntp[auxp] = ler.nextInt();
                    }
                    varqntclientesp = varqntclientesp + numerorefp;
                    break;
                // Buscar produto
                case 4:
                    String nomeBp;
                    boolean flag3 = false;
                    System.out.println("digite o nome do produto que deseja buscar");
                    ler.nextLine();
                    nomeBp = ler.nextLine();
                    for (int cont = 0; cont < varqntclientesp; cont++) {
                        if (nomeBp.equalsIgnoreCase(nomep[cont])) {
                            flag3 = true;
                            System.out.println("dados do usuario:" + nomeBp);
                            System.out.println("nome: " + nomep[cont]);
                            System.out.println("descricao: " + descricaop[cont]);
                            System.out.println("valor compra produto: " + valorcp[cont]);
                            System.out.println("valor porcentagem: " + porctp[cont]);
                            System.out.println("quantidade de produtos: " + qntp[cont]);
                            System.out.println("Deseja alterar os dados do usuario se sim digite 1:");
                            int numberifp; // numero if
                            numberifp = ler.nextInt();
                            if (numberifp != 0) {
                                String nomepalt;// alterar
                                String descricaopalt;
                                int valorcpalt;
                                int porctpalt;
                                int qntpalt;
                                ler.nextLine();
                                System.out.println("digite o nome do produto" + cont + ":");
                                nomepalt = ler.nextLine();
                                nomep[cont] = nomepalt;
                                System.out.println("digite a descricao do usuario" + cont + ":");
                                descricaopalt = ler.nextLine();
                                descricaop[cont] = descricaopalt;
                                System.out.println("digite o valor do produto do usuario" + cont + ":");
                                valorcpalt = ler.nextInt();
                                valorcp[cont] = valorcpalt;
                                System.out.println("digite a porcentagem de venda do produto do usuario" + cont + ":");
                                porctpalt = ler.nextInt();
                                porctp[cont] = porctpalt;
                                System.out.println("digite a quantidade do produto do usuario" + cont + ":");
                                qntpalt = ler.nextInt();
                                qntp[cont] = qntpalt;

                            }
                        }
                    }
                    if (flag3 == false) {
                        System.out.println("produto não exite");
                    }
                    break;
                case 5:
                    // mostrar clientes
                    for (int cont = 0; cont < varqntclientes; cont++) {
                        System.out.println(nome[cont]);
                    }
                    // escolher o nome
                    int lugarprodr = 0; // lugar em que a pessoa escolheu o produto dentro array
                    ler.nextLine();
                    System.out.println("digite o nome para fazer o cadastro de produtos:");
                    nomeB = ler.nextLine();
                    int flag = 0;
                    boolean flag2 = false;
                    for (int contc = 0; contc < varqntclientes; contc++) {
                        if (nomeB.equalsIgnoreCase(nome[contc])) {
                            flag2 = true;
                            System.out.println("-----Lista-----");
                            // mostrar produto
                            for (int contp = 0; contp < varqntclientesp; contp++) {
                                System.out.println("produto " + contp + ":");
                                System.out.println(nomep[contp]);
                            }
                            // buscar produto
                            System.out.println("digite o nome do produto:");
                            nomeBp = ler.nextLine();
                            for (int cont = 0; cont < varqntclientesp; cont++) {
                                if (nomeBp.equalsIgnoreCase(nomep[cont])) {
                                    flag = 1;
                                    System.out.println("digite a quantidade de itens que foram comprados:");
                                    int produtosr = 0; // produtos para retirar
                                    produtosr = ler.nextInt();
                                    qntp[cont] = qntp[cont] - produtosr;
                                    if (qntp[cont] < 0) {
                                        System.out.println(
                                                "Digite a quantidada valida a ser retirada não potendo ser maior que o estoque");
                                        produtosr = ler.nextInt();
                                        qntp[cont] = qntp[lugarprodr] - produtosr;
                                    }
                                }
                            }
                            if (flag < 0) {
                                System.out.println("o nome não existe:");

                            }

                        }
                    }
                    if (flag2 == false) {
                        System.out.println("o nome não existe:");
                    }

                    break;
                case 6:
                    System.out.println("-----Lista-----");
                    for (int cont = 0; cont < varqntclientesp; cont++) {
                        System.out.println("produto " + cont + ":");
                        System.out.println(nomep[cont]);
                        System.out.println(qntp[cont]);

                    }
                    break;
                case 7:
                    System.out.println("Sair");
                    variavel = 0;

                    break;
            }
        } while (variavel != 0);
        ler.close();
    }
}
