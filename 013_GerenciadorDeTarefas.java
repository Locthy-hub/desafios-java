/*
 * ==========================================================
 * DESAFIO 013 - Gerenciador de Tarefas com Prioridades
 * ==========================================================
 *
 * OBJETIVO:
 * Combinar arrays paralelos, while, métodos e switch para gerenciar uma lista de tarefas com
 * prioridade.
 *
 * ENUNCIADO:
 * Desenvolva um gerenciador de tarefas que armazena até 10 tarefas, cada uma com descrição,
 * prioridade (1-Alta, 2-Media, 3-Baixa) e status de concluída (true/false). O usuário deve
 * poder adicionar, concluir, listar e filtrar tarefas por prioridade através de um menu.
 *
 * REGRAS:
 * - Utilize arrays paralelos para descrição, prioridade e status.
 * - Menu: 1 - Adicionar tarefa, 2 - Concluir tarefa, 3 - Listar todas, 4 - Filtrar por
 * - prioridade, 5 - Sair.
 * - Ao adicionar, verifique se ainda há espaço disponível (máximo 10 tarefas); caso não haja,
 * - avise o usuário.
 * - Ao filtrar por prioridade, liste apenas as tarefas não concluídas daquela prioridade.
 * - Crie um método contarTarefasPendentes(...) que retorna quantas tarefas ainda não foram
 * - concluídas.
 *
 * ENTRADA:
 * Opções do menu, descrição e prioridade das tarefas, e índice para conclusão/filtro.
 *
 * SAIDA ESPERADA:
 * Confirmações de cadastro/conclusão, listagens filtradas e contagem de tarefas pendentes ao sair.
 *
 * EXEMPLOS:
 * Exemplo 1:
 * Entrada:
 *   1
 *   Estudar Java
 *   1
 *   3
 *   5
 * Saida:
 *   Tarefa adicionada!
 *   [0] Estudar Java - Prioridade: Alta - Pendente
 *   
 *   Tarefas pendentes: 1
 *   Encerrando...
 *
 * CASOS DE TESTE PARA VALIDAR SUA SOLUCAO:
 * Caso 1: Tentar adicionar uma 11ª tarefa quando o limite já foi atingido.
 * Caso 2: Concluir uma tarefa e depois tentar concluí-la novamente.
 * Caso 3: Filtrar por uma prioridade sem nenhuma tarefa pendente correspondente.
 *
 * OBSERVACOES IMPORTANTES:
 * Utilize uma variável contadora para controlar quantas posições dos arrays estão realmente em uso.
 *
 * ==========================================================
 */

public class Main {

    public static void main(String[] args) {

        // Escreva sua solucao aqui

    }

}
