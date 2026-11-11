# HighLow

**Jogo de cartas desenvolvido em Java no âmbito da unidade curricular de Programação Orientada a Objetos.**

## Descrição do projeto

HithLow é um jogo de cartas que utiliza um baralho completo, com as 52 cartas. Nele, o jogador deve prever se a próxima carta a ser tirada vai ser maior ou menor que a carta atual. O jogo termina quando o jogador erra ou o baralho acaba.
---

## Objetivo

Este projeto tem uma finalizade acadêmica, de desenvolver conhecimentos referente a Programação Orientada a Objetos aplicando alguns de seus conceitos, como encapsulamento, polimorfismo e composição.
---
## Funcionamento do jogo

O jogo segue a seguinte rotina:
1. É criado e embaralhado um baralho de 52 cartas.
2. Uma carta é retirada do baralho e apresentada ao jogador.
3. O jogador deve prever se a próxima carta será maior ou menor que a carta atual.
4. Quando a próxima carta é revelada:
    - Se a previsão estiver correta, o jogador recebe um ponto.
    - Se a previsão estiver incorreta ou as cartas tiverem o mesmo valor, a ronda termina.
5. Após cada ronda, o jogador pode escolher continuar ou terminar o jogo.
6. No final, são apresentados o número total de rondas realizadas e a pontuação média obtida.
---
## Estrutura do projeto

O projeto está organizado em 4 classes:
- **Carta:** Classe que representa cada carta que está presente no jogo. Nela, são quardados os valores e naipes das cartas.
- **Baralho:** Classe que representa o baralho de 52 cartas que é usado no jogo. Esta classe é responsável por criar e guardar as cartas, embaralhar as cartar, tirar uma carta para apresentar ao jogador e mostrar quantas cartas ainda estão presentes no baralho.
- **HithLow:** Classe que representa o jogo em si. Essa quase tem como responsabilidade executar cada etapa do jogo, realizando as rodadas, armazenando os pontos e apresentando as informações de pontuação e rodadas ao final do jogo.
- **Main:** Classe responsável por iniciar a execução do projeto.
---
## Autores

- Isaque Santos (a22608528);
- Nair Assis (a22608157);
- Diogo Correia (a22608200).
