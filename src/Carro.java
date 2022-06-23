

  

import javax.swing.JOptionPane;
import java.util.*;
    
    public class Carro {

        
        public static void main(String[] args) {
        
            int i,j;
            ArrayList<String> opcoes = new ArrayList();

            // [ B ] usando o método add() para gravar 4 contatos na agenda

            do
            {
                String menu= JOptionPane.showInputDialog("MENU\n1-Inserir\n2-Listar\n3-Excluir\n4-Alterar\n5-Sair");
                i = Integer.parseInt(menu);
                switch (i)
                {
                    case 1:
                        String marca= JOptionPane.showInputDialog("Digite a marca: ");
                        opcoes.add(marca+";"+marca);
                        String modelo= JOptionPane.showInputDialog("Digite o modelo: ");
                        opcoes.add(modelo+";"+modelo);
                        String ano= JOptionPane.showInputDialog("Digite o ano: ");
                        opcoes.add(ano+";"+ano);
                        String valor= JOptionPane.showInputDialog("Digite o valor: ");
                        opcoes.add(valor+";"+valor);
                        JOptionPane.showMessageDialog(null, "Inserido com Sucesso");


                        double valor1 = Double.parseDouble(valor);

                        int nAcima = 0, somaVal = 0, media = 0;
                        for (int a = 0; a < opcoes.size(); a++) {
                            if (valor1 > 50000) {
                                nAcima++;
                                somaVal += opcoes.size();

                            }
                        }
                        media = somaVal / nAcima;
                        break;
                    case 2:
                        j = 0;
                        Iterator<String> iterator = opcoes.iterator();
                        while (iterator.hasNext()) {
                            System.out.printf("Posição %d- %s\n", j, iterator.next());
                            j++;
                        }
                        break;

                    case 3:

                        try {
                            System.out.println("--------------------");
                            System.out.println("A média entre o preço dos carros é: " + media);
                        } catch (Exception e){
                            System.out.println("Não é possível dividir por zero");
                        }
                        break;

                    case 4:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
                      }
                     } while (i!=4);

                }
            }

// break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
//                }
//            } while (i!=4);

// String nomevelho= JOptionPane.showInputDialog("Digite o Nome Anterior:");
//                        String novonome= JOptionPane.showInputDialog("Digite o Nome Novo:");
//                        try {
//                            opcoes.set(opcoes.indexOf(nomevelho), novonome);
//                        } catch (IndexOutOfBoundsException e) {
//                            // exceção lançada para indicar que um índice (i)
//                            // está fora do intervalo válido (de 0 até agenda.size()-1)
//                            System.out.printf("\nErro: posição inválida (%s).",e.getMessage());
//                        }
//                        JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
//                        break;

//JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
//                        try {
//                            opcoes.remove(nomeexcluir);
//                        } catch (IndexOutOfBoundsException e) {
//                            // exceção lançada para indicar que um índice (i)
//                            // está fora do intervalo válido (de 0 até agenda.size()-1)
//                            System.out.printf("\nErro: posição inválida (%s).",
//                                    e.getMessage());
//                        }
