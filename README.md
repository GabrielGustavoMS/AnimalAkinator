# [Projeto Animal Akinator] - [Desenvolvido por:] - Gabriel Gustavo M. da Silva. 
* Ciência da Computação - 2019.

[Projeto Animal Akinator] - Esse projeto foi desenvolvido com base no conceito de árvore binária de
decisão, baseado em diretrizes descritas no pdf disponibilizado pelo professor.  

[Regras e diretrizes](\ProjetoFinal\Projeto_ED2.pdf)

##  Discplina: Estruturas de Dados 2.
##  Professor:  Ms. Tales Gouveia Fernandes.
============================================= 



### Instruções para rodar o projeto:
* Use NetBeans IDE  para compilar e rodar o projeto localizado na  pasta projeto final

* Para isso, abra o NetBeans IDE e clique em abrir projeto.

* E selecione a pasta do projeto denominada [ProjetoED2_Com_View] dentro da pasta ProjetoFinal.

* Em seguida, clique na classe "Game" [Game.java] localizada no pacote "akinator" [akinator] dentro do pacote 
de Códigos-Fonte Padrão.

* Execute o projeto clicando no botão em formato de "Play" na barra de ferramentas do seu  NetBeans.


=============================================
#### Informações adicionais: 

#### Árvore de decisão: 

* A classe responsável pela árvore de decisão é a classe Tree localizada dentro do pacote akinator.

* Caso queira utilizar outros valores para os nodos, será necessário alterar o vetor de Strings "nodes"
dentro da classe "GameHandle" [GameHandle.java],localizado dentro do pacote "akinator" [akinator] dentro
do pacote de Códigos-Fonte Padrão.

* A Inserção dos valores no vetor deve ser obrigatóriamente feita em nível.

* Para visualizar as novas imagens na interface gráfica elas devem ser adicionadas no pacode "akinator.img" [akinator.img] e 
obrigatóriamente devem estar no formato ".jpg".

* O projeto necessita de uma árvore binária cheia para funcionar.



#### Modos de exibição:

* Ao rodar o projeto utlizando o NetBeans, os resultados podem ser exibidos no terminal ou em uma interface 
gráfica baseada em Java Swing.

* Para escolher o modo de exibição para terminal altere o parâmetro do objeto saida da classe exibir localizada
no método principal - Exibir.modosDeExibicao.TERMINAL 

* Para escolher o modo de exibição para janela altere o mesmo parâmetro para - Exibir.modosDeExibicao.JANELA