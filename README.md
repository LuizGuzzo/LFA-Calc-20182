# Trabalho de LFA 2018/1

## Extensoes para a Calculadora Antlr (calc4)

###Grupo:
<p>
 Luiz Antonio (20151bsi0193);<br />
 Thalles ();<br />
 William ;<br />
 
 GitHub do projeto: https://github.com/victorgonn/LFA-ANTLR-CALCULADORA
</p>

###Tarefas Implementadas e Consideracoes:

####3.1 String
<p>
Foi implementado a comportamento de String, suas funcoes e ajustado os operadores para passar a aceitar string.

Obs1: Foi ajustado a "impressao" da string reconhecida pela calculadora para nao imprimir contendo as "" de reconhecimento da mesma. Esse comportamento, acabava influenciando as outras funcoes, como por exemplo:
Comportamento anterior:<br />
    - Ao inserir uma String "oi", a calculadora identificava e imprimia como "oi", ou seja em vez de 2 characteres, ela entedia como 4 (fazendo com que as " de idenfificacao passasse a valer como parte da string).
<br />Novo Comportamento :<br />
     - Ao inserir uma String "oi", a calculadora identificava e imprimia como oi, atribuindo assim o seu lenght como 2 corretamente.
     
     
Obs2: Na funcao formate, foram tratados a formatacao de %s, %d, %f .    

Obs3: Operadores ==, != e + ajustados para funcionar com String.
</p>

####3.2 Lambda
<p>
Gramatica : lfunction(parametros) then expressao;<br />
Gramatica - OK;<br />
Java - Pendente;
</p>

####3.3 Vetores
<p>
Foi implementado.
</p>

####3.4 Elsif
<p>
Parcilamente implementado.
Java - OK: o java esta preparado pra tratar o else if...<br />
Gramatica - Pendente: Feita, mas por alguma razao meu CalcParser nao atualiza com a mudanca da gramatica, assim nao consegui fazer a gramatica reconhecer os novos makeIfs**...
</p>
