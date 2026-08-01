# Desafios Java — Do Básico à Integração Total

Uma coleção de **30 desafios de programação em Java**, feita para revisar e fixar todo o conteúdo básico da linguagem através de problemas realistas — no estilo de plataformas como Beecrowd, LeetCode e HackerRank.

Aqui você **não vai encontrar teoria nem soluções prontas**. Cada desafio é um enunciado completo, com regras, exemplos e casos de teste, seguido de um arquivo `.java` com a estrutura inicial pronta para você implementar sua solução.

## Filosofia da coleção

A maioria dos exercícios de curso treina um assunto por vez (só `for`, só `if`, só array...). Aqui é diferente: **cada desafio mistura vários conteúdos ao mesmo tempo**, simulando um problema real — porque é assim que a programação funciona na prática. A complexidade aumenta gradualmente ao longo da coleção, sem rótulos de "fácil/médio/difícil": você mesmo vai sentir a evolução.

## Conteúdos utilizados

Os desafios combinam, em proporções variadas:

- Variáveis e tipos primitivos
- Operadores aritméticos, relacionais e lógicos
- Entrada de dados com `Scanner`
- Estruturas condicionais (`if` / `else`, `switch`)
- Estruturas de repetição (`while`, `do-while`, `for`)
- Métodos (criação, parâmetros, retorno)
- Arrays (simples e paralelos)

## Quantidade de desafios

**30 desafios**, numerados de `001` a `030`, com complexidade crescente. O desafio `030` é o **Desafio Final**, que integra obrigatoriamente todos os conteúdos da lista acima em um único sistema.

## Estrutura de cada desafio

Cada arquivo `.java` contém, em um bloco de comentário no topo:

- **Título**
- **Objetivo**
- **Enunciado completo**
- **Regras**
- **Entrada**
- **Saída esperada**
- **Exemplos**
- **Casos de teste**
- **Observações importantes**

Logo abaixo, a estrutura inicial do código:

```java
public class Main {

    public static void main(String[] args) {

        // Escreva sua solução aqui

    }

}
```

Nenhuma solução é fornecida — o objetivo é que você raciocine e implemente por conta própria.

## Como executar os códigos

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/desafios-java.git
   cd desafios-java
   ```
2. Compile o desafio desejado (o nome da classe pública é sempre `Main`, então compile e rode um arquivo por vez, em uma pasta separada ou renomeando temporariamente):
   ```bash
   javac 001_CadastroDeAlunos.java -d out
   java -cp out Main
   ```
3. Leia o enunciado no comentário do próprio arquivo antes de começar a implementar.

> Dica: como todas as classes se chamam `Main`, é mais prático abrir um desafio por vez em uma pasta de trabalho isolada (ou usar uma IDE que compile arquivo por arquivo).

## Checklist de progresso

Marque conforme for concluindo cada desafio:

- [ ] **001** - Cadastro de Alunos com Cálculo de Média (`001_CadastroDeAlunos.java`)
- [ ] **002** - Simulador de Caixa Eletrônico (`002_CaixaEletronico.java`)
- [ ] **003** - Sistema de Notas com Conceito Final por Switch (`003_SistemaDeNotas.java`)
- [ ] **004** - Controle de Estoque com Reposição Automática (`004_Estoque.java`)
- [ ] **005** - Simulador de Conta Bancária com Operações via Menu (`005_Banco.java`)
- [ ] **006** - Carrinho de Compras de Loja Virtual (`006_LojaVirtual.java`)
- [ ] **007** - Folha de Pagamento com Cálculo de Bônus (`007_ControleDeFuncionarios.java`)
- [ ] **008** - Sistema de Empréstimo de Livros (`008_Biblioteca.java`)
- [ ] **009** - Jogo de Adivinhação com Limite de Tentativas (`009_JogoDeAdivinhacao.java`)
- [ ] **010** - Calculadora de Imposto de Renda Simplificada (`010_CalculadoraDeImpostos.java`)
- [ ] **011** - Sistema de Votação com Apuração de Resultado (`011_SistemaDeVotacao.java`)
- [ ] **012** - Conversor Universal de Unidades (`012_ConversorDeUnidades.java`)
- [ ] **013** - Gerenciador de Tarefas com Prioridades (`013_GerenciadorDeTarefas.java`)
- [ ] **014** - Análise de Temperaturas da Semana (`014_AnaliseDeTemperaturas.java`)
- [ ] **015** - Sistema de Reserva de Assentos de Cinema (`015_ReservasDeCinema.java`)
- [ ] **016** - Tabela de Classificação de Torneio de Futebol (`016_TorneioDeFutebol.java`)
- [ ] **017** - Controle de Consumo de Combustível de Frota (`017_ControleDeFrota.java`)
- [ ] **018** - Sistema de Login com Bloqueio por Tentativas (`018_SistemaDeLogin.java`)
- [ ] **019** - Calculadora de Média Ponderada com Validação de Pesos (`019_MediaPonderada.java`)
- [ ] **020** - Validador de Jogadas do Jogo da Velha (`020_JogoDaVelha.java`)
- [ ] **021** - Sistema de Controle de Vacinação (`021_ControleDeVacinacao.java`)
- [ ] **022** - Sistema de Pedidos de Restaurante (`022_PedidosDeRestaurante.java`)
- [ ] **023** - Análise de Vendas Mensais por Vendedor (`023_AnaliseDeVendas.java`)
- [ ] **024** - Simulador de Elevador Inteligente (`024_SimuladorDeElevador.java`)
- [ ] **025** - Validador de Força de Senha (`025_ValidadorDeSenha.java`)
- [ ] **026** - Sistema de Matrícula Escolar com Turmas (`026_MatriculaEscolar.java`)
- [ ] **027** - Calculadora de Conta de Água por Faixas de Consumo (`027_ContaDeAgua.java`)
- [ ] **028** - Sistema Suíço Simplificado de Torneio de Xadrez (`028_TorneioDeXadrez.java`)
- [ ] **029** - Simulador de Empréstimo Bancário com Juros Compostos (`029_EmprestimoBancario.java`)
- [ ] **030** - Desafio Final - Sistema Integrado de Gestão de Supermercado (`030_DesafioFinal.java`)

---

Bons estudos e bom raciocínio! 🚀
