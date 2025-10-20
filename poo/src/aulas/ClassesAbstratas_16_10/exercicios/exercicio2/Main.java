package ClassesAbstratas_16_10.exercicios.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // Cria um vetor com alguns imóveis de tipos diferentes
        Imovel[] meusImoveis = {
                new LojaComercial(1, "São Paulo", 30),
                new Chacara(2, "Mineiros Tietê", "Chácara Bela Vista", 4, false),
                new Apartamento(3, "Paraná", 2, 200)
        };

        // Lista todos os imóveis disponíveis
        for (Imovel imovel : meusImoveis) {
            imovel.mostrarDetalhes();
            System.out.println("----------------------------");
        }

        // Usuário escolhe o imóvel que deseja alugar
        System.out.println("Digite o id do imóvel desejado: ");
        int idUsuario = ler.nextInt();

        Imovel imovelSelecionado = null; // guarda o imóvel encontrado

        // Busca o imóvel pelo ID informado
        for (Imovel imovel : meusImoveis) {
            if (imovel.getId() == idUsuario) {
                imovelSelecionado = imovel;
                break; // interrompe o laço ao encontrar
            }
        }

        // Se o imóvel existir
        if (imovelSelecionado != null) {
            imovelSelecionado.mostrarDetalhes();

            // Verifica se já está alugado
            if (imovelSelecionado.isOcupado()) {
                System.out.println("Imóvel já está alugado.");
            } else {
                // Calcula e mostra o valor do aluguel
                double valor = imovelSelecionado.calcularAluguel();
                System.out.printf("Valor do aluguel: R$ %.2f%n", valor);

                // Marca o imóvel como alugado
                imovelSelecionado.setOcupado(true);
                System.out.println("Imóvel alugado com sucesso!");
            }
        } else {
            // Caso o ID não exista
            System.out.println("Imóvel com ID " + idUsuario + " não encontrado.");
        }

    }
}
