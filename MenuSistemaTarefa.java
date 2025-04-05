package br.ufpb.dcx.caio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSistemaTarefa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean DejCont = true;
        while (DejCont){
            System.out.println("Tare-fa\n"+"1. Cadastrar tarefa\n" + "2. Apagar tarefa\n" + "3. Atualizar tarefa\n" + "4. Pesquisar tarefas por...\n" +
                    "5. sair\n");
            int num = Integer.parseInt(leitor.nextLine());
            switch (num){
                case 1:
                    System.out.println("descrição");
                    String descrição = leitor.nextLine();
                    System.out.println("categoria");
                    String categoria  = leitor.nextLine();


                    System.out.println("dia");
                    int dia = Integer.parseInt(leitor.nextLine());
                    System.out.println("Mês");
                    int mes = Integer.parseInt(leitor.nextLine());
                    System.out.println("Ano");
                    int ano = Integer.parseInt(leitor.nextLine());

                    DataSimples data = new DataSimples(dia,mes,ano);

                    System.out.println("Status");
                    String status = leitor.nextLine();
                    MeuSistemaTarefas sistemaCase1 = new MeuSistemaTarefas();

                    sistemaCase1.cadastrarTarefa(descrição,categoria,data,status);

                    break;
                case 2:
                    //TODO criar o método de apagar
                    break;
                case 3:

                    System.out.println("Digite a descriçaõ do tarefa que deseja atualizar");
                    String Descricao = leitor.nextLine();
                    System.out.println("Digite o novo status dessa tarefa");
                    String Status = leitor.nextLine();

                    MeuSistemaTarefas sistemaCase2 = new MeuSistemaTarefas();
                    sistemaCase2.atualizarStatusDeTarefa(Descricao,Status);
                    break;
                case 4:
                    System.out.println("Digite por onde você deseja pesquisar tarefa\n" + "1. Categoria\n" + "2. Mês\n" + "3. Status\n");
                    int number = Integer.parseInt(leitor.nextLine());
                    switch (number){
                        case 1:
                            MeuSistemaTarefas sistemaCase14 = new MeuSistemaTarefas();
                            System.out.println("Digite a categória: ");
                            String Categoria = leitor.nextLine();
                            List<Tarefa> tarefasEncontradas = sistemaCase14.pesquisarTarefasDaCategoria(Categoria);
                            System.out.println("Resultado");
                            for (Tarefa t : tarefasEncontradas) {
                                System.out.println(t.toString());
                            }
                            break;
                        case 2:
                            MeuSistemaTarefas sistemaCase24 = new MeuSistemaTarefas();
                            System.out.println("Digite o mês: ");
                            int Mes = Integer.parseInt(leitor.nextLine());
                            System.out.println("Digite o ano: ");
                            int Ano = Integer.parseInt(leitor.nextLine());

                            List<Tarefa> tarefasEncontradas01 = sistemaCase24.pesquisarTarefasParaOMes(Mes,Ano);
                            System.out.println("=-=-=-=-=-=-=-=Resultado=-=-=-=-=-=-=-=-=-=-=");
                            for (Tarefa t: tarefasEncontradas01){
                                System.out.println(t.toString());
                            }
                            break;
                        case 3:
                            MeuSistemaTarefas sistemaCase34 = new MeuSistemaTarefas();
                            System.out.println("Digite o status: ");
                            String Status01 = leitor.nextLine();
                            List<Tarefa> tarefasEncontradas02 = sistemaCase14.pesquisarTarefasPorStatus(Status01);
                            System.out.println("Resultado");
                            for (Tarefa t : tarefasEncontradas02) {
                                System.out.println(t.toString());
                            }
                            break;

                    }
                case 5:
                    System.out.println("Fechando programa...volte sempre");
                    leitor.close();
                    break;
                boolean num = false;
                }
            }
        }
    }


