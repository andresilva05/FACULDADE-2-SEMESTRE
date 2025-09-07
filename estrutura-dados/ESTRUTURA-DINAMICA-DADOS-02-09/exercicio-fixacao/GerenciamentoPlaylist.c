#include <stdio.h>  // Inclui funções de entrada/saída padrão
#include <string.h> // Inclui funções para manipulação de strings

// Define a estrutura Musica para representar cada música da playlist
typedef struct
{
    char *titulo;           // Ponteiro para o título da música
    char *artista;          // Ponteiro para o nome do artista
    int duracao;            // Duração da música em segundos
    struct Musica *proxima; // Ponteiro para a próxima música na lista
} Musica;

// Declaração das funções utilizadas no programa
void menu();
void adicionarMusica(Musica **inicioPlaylist);
void exibirPlaylist(Musica **inicioPlaylist);
void atualizarMusica(Musica **inicioPlaylist);
void informacoesPlaylist(Musica **inicioPlaylist);
void limpar_buffer_entrada();
void limpar_tela();
void aguardar_tecla();

int main()
{
    int opcao; // Variável para armazenar a opção do usuário

    Musica *inicioPlaylist = NULL; // Ponteiro para o início da playlist (lista ligada)
    do
    {
        menu();                  // Exibe o menu principal
        scanf("%d", &opcao);     // Lê a opção escolhida pelo usuário
        limpar_buffer_entrada(); // Limpa o buffer de entrada para evitar problemas com fgets

        switch (opcao) // Executa a ação conforme a opção escolhida
        {
        case 1:
            adicionarMusica(&inicioPlaylist); // Adiciona uma nova música à playlist
            break;
        case 2:
            exibirPlaylist(&inicioPlaylist); // Exibe todas as músicas da playlist
            break;
        case 3:
            atualizarMusica(&inicioPlaylist); // Atualiza informações de uma música
            break;
        case 4:
            informacoesPlaylist(&inicioPlaylist); // Mostra total de músicas e duração
            break;
        case 5:
            printf("Encerrando o sistema. Ate logo!\n"); // Sai do programa
            break;
        default:
            printf("Opcao invalida! Por favor, tente novamente.\n"); // Opção inválida
            break;
        }

        if (opcao != 5)
        {
            aguardar_tecla(); // Aguarda o usuário pressionar Enter antes de continuar
        }
    } while (opcao != 5); // Repete até o usuário escolher sair

    // Libera toda a memória alocada para a playlist antes de encerrar
    Musica *atual = inicioPlaylist;
    while (atual != NULL)
    {
        Musica *proximo = atual->proxima; // Guarda o próximo nó
        free(atual->titulo);              // Libera memória do título
        free(atual->artista);             // Libera memória do artista
        free(atual);                      // Libera memória da estrutura Musica
        atual = proximo;                  // Avança para o próximo nó
    }

    return 0; // Finaliza o programa
}

// Exibe o menu principal do sistema
void menu()
{
    limpar_tela(); // Limpa a tela antes de mostrar o menu
    printf("--- GERENCIAMENTO DE PLAYLIST ---\n");
    printf("1. Adicionar musica\n");
    printf("2. Exibir playlist completa\n");
    printf("3. Atualizar musica\n");
    printf("4. Exibe total de musicas e duracao\n");
    printf("5. Sair\n");
    printf("---------------------------------------\n");
    printf("Escolha uma opcao: ");
}

// Limpa a tela do terminal, dependendo do sistema operacional
void limpar_tela()
{
#ifdef _WIN32
    system("cls"); // Comando para Windows
#else
    system("clear"); // Comando para Linux/Mac
#endif
}

// Aguarda o usuário pressionar Enter para continuar
void aguardar_tecla()
{
    printf("\n\nPressione Enter para continuar...");
    getchar(); // Lê o Enter do usuário
}

// Limpa o buffer de entrada para evitar problemas com fgets após scanf
void limpar_buffer_entrada()
{
    int c;
    while ((c = getchar()) != '\n' && c != EOF)
    {
        ; // Descarta todos os caracteres até o fim da linha
    }
}

// Adiciona uma nova música à playlist
void adicionarMusica(Musica **inicioPlaylist)
{
    limpar_tela(); // Limpa a tela
    printf("==== ADICIONA MUSICA NA PLAYLIST ====");

    char buffer[200]; // Buffer para leitura de strings

    // Cria um novo nó Musica dinamicamente
    Musica *musicaNova = malloc(sizeof(Musica));
    if (musicaNova == NULL)
    {
        printf("\nErro na alocacao de memoria!\n");
        return; // Sai se não conseguir alocar memória
    }

    musicaNova->proxima = NULL; // Inicializa o ponteiro para próxima música

    // Lê o título da música
    printf("\nInforme o titulo da musica: ");
    fgets(buffer, 200, stdin); // Lê o título do usuário
    int tamanho = strlen(buffer);
    if (buffer[tamanho - 1] == '\n') // Remove o caractere de nova linha
    {
        buffer[tamanho - 1] = '\0';
        tamanho--;
    }
    musicaNova->titulo = malloc((tamanho + 1) * sizeof(char)); // Aloca memória para o título
    strcpy(musicaNova->titulo, buffer);                        // Copia o título para a estrutura

    // Lê o nome do artista
    printf("Informe o artista: ");
    fgets(buffer, 200, stdin); // Lê o artista do usuário
    tamanho = strlen(buffer);
    if (buffer[tamanho - 1] == '\n') // Remove o caractere de nova linha
    {
        buffer[tamanho - 1] = '\0';
        tamanho--;
    }
    musicaNova->artista = malloc((tamanho + 1) * sizeof(char)); // Aloca memória para o artista
    strcpy(musicaNova->artista, buffer);                        // Copia o artista para a estrutura

    // Lê a duração da música
    printf("\nInforme a duracao em segundos: ");
    scanf("%d", &musicaNova->duracao); // Lê a duração
    limpar_buffer_entrada();           // Limpa o buffer de entrada

    // Adiciona a nova música ao final da lista ligada
    if (*inicioPlaylist == NULL)
    {
        *inicioPlaylist = musicaNova; // Se a lista está vazia, novo nó é o primeiro
    }
    else
    {
        Musica *musicaAtual = *inicioPlaylist;
        while (musicaAtual->proxima != NULL)
        {
            musicaAtual = musicaAtual->proxima; // Avança até o último nó
        }
        musicaAtual->proxima = musicaNova; // Adiciona o novo nó ao final
    }

    printf("\nMusica adicionada com sucesso!\n");
}

// Exibe todas as músicas da playlist
void exibirPlaylist(Musica **inicioPlaylist)
{
    limpar_tela(); // Limpa a tela

    printf("==== MUSICAS NA PLAYLIST ====\n");

    if (*inicioPlaylist == NULL)
    {
        printf("\nPlaylist vazia"); // Se a lista está vazia, informa ao usuário
    }
    else
    {
        Musica *musicaAtual = *inicioPlaylist;

        while (musicaAtual != NULL) // Percorre toda a lista ligada
        {
            printf("\nTITULO: %s", musicaAtual->titulo);   // Exibe título
            printf("\nARTISTA: %s", musicaAtual->artista); // Exibe artista
            printf("\nDURACAO: %d segundos", musicaAtual->duracao); // Exibe duração
            printf("\n");
            musicaAtual = musicaAtual->proxima; // Avança para próxima música
        }
    }
}

// Atualiza informações de uma música da playlist
void atualizarMusica(Musica **inicioPlaylist)
{
    limpar_tela(); // Limpa a tela

    char buffer[200]; // Buffer para leitura de strings
    Musica *musicaAtual = *inicioPlaylist;
    int encontrada = 0;            // Flag para verificar se encontrou a música
    char musicaParaAtualizar[200]; // Armazena o título da música a ser atualizada
    int escolhaUsuario;            // Armazena a escolha do usuário

    printf("==== ATUALIZA MUSICA DA PLAYLIST ====\n");

    if (*inicioPlaylist == NULL)
    {
        printf("Playlist vazia\n"); // Se a lista está vazia, informa ao usuário
        return;
    }

    // Lê o título da música que o usuário deseja atualizar
    printf("\nInforme qual titulo da musica que deseja atualizar: ");
    fgets(buffer, 200, stdin);
    int tamanho = strlen(buffer);
    if (buffer[tamanho - 1] == '\n')
        buffer[tamanho - 1] = '\0';
    strcpy(musicaParaAtualizar, buffer);

    // Percorre a lista para encontrar a música
    while (musicaAtual != NULL)
    {
        if (strcmp(musicaAtual->titulo, musicaParaAtualizar) == 0)
        {
            encontrada = 1; // Marca que encontrou a música

            // Pergunta ao usuário o que deseja atualizar
            do
            {
                limpar_tela();
                printf("\nO que deseja atualizar da musica escolhida?\n");
                printf("1. ALTERAR TITULO\n");
                printf("2. ALTERAR ARTISTA\n");
                printf("3. ALTERAR DURACAO\n");
                scanf("%d", &escolhaUsuario);
                limpar_buffer_entrada();
            } while (escolhaUsuario != 1 && escolhaUsuario != 2 && escolhaUsuario != 3);

            // Atualiza conforme a escolha do usuário
            if (escolhaUsuario == 1)
            {
                printf("\nInforme o novo titulo: ");
                fgets(buffer, 200, stdin);
                tamanho = strlen(buffer);
                if (buffer[tamanho - 1] == '\n')
                    buffer[tamanho - 1] = '\0';

                free(musicaAtual->titulo);                                  // Libera memória do título antigo
                musicaAtual->titulo = malloc((tamanho + 1) * sizeof(char)); // Aloca nova memória
                strcpy(musicaAtual->titulo, buffer);                        // Copia novo título
            }
            else if (escolhaUsuario == 2)
            {
                printf("\nInforme o novo artista: ");
                fgets(buffer, 200, stdin);
                tamanho = strlen(buffer);
                if (buffer[tamanho - 1] == '\n')
                    buffer[tamanho - 1] = '\0';

                free(musicaAtual->artista);                                  // Libera memória do artista antigo
                musicaAtual->artista = malloc((tamanho + 1) * sizeof(char)); // Aloca nova memória
                strcpy(musicaAtual->artista, buffer);                        // Copia novo artista
            }
            else
            {
                printf("\nInforme a duracao em segundos: ");
                scanf("%d", &musicaAtual->duracao); // Atualiza duração
                limpar_buffer_entrada();
            }

            printf("\nMusica atualizada com sucesso!\n");
            break; // Sai do loop após atualizar
        }

        musicaAtual = musicaAtual->proxima; // Avança para próxima música
    }

    if (!encontrada)
        printf("\nMusica nao encontrada\n"); // Informa se não encontrou a música
}

// Exibe informações gerais da playlist (quantidade e duração total)
void informacoesPlaylist(Musica **inicioPlaylist)
{
    limpar_tela(); // Limpa a tela

    int qtdMusicas = 0, totalDuracao = 0; // Variáveis para contar músicas e somar duração
    printf("==== EXIBI INFORMACOES DA PLAYLIST ====\n");

    Musica *musicaAtual;

    musicaAtual = *inicioPlaylist;

    if (musicaAtual == NULL)
    {
        printf("\nPlaylist vazia"); // Se a lista está vazia, informa ao usuário
        return;
    }
    else
    {
        while (musicaAtual != NULL) // Percorre toda a lista ligada
        {
            totalDuracao += musicaAtual->duracao; // Soma a duração de cada música
            qtdMusicas++;                         // Conta cada música
            musicaAtual = musicaAtual->proxima;   // Avança para próxima música
        }

        printf("\nTOTAL DE MUSICAS: %d", qtdMusicas); // Exibe total de músicas
        printf("\nDURACAO TOTAL: %d", totalDuracao);  // Exibe duração total
    }
}