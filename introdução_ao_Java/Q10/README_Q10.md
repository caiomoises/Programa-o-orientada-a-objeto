### Questão 10:

 Determine se cada uma das seguintes alternativas é verdadeira ou falsa. Se falsa, explique por quê.

( <span style="color: red">F</span> ) O caso default é requerido na instrução de seleção switch.

<span style="color: yellow">Explicação: </span> O caso 'default' não é obrigatório. Ele serve para ser executado quando nenhum dos casos anteriores são atendidos. Então, pode ser omitido se não for necessário.

( <span style="color: red">F</span> ) A instrução break é requerida no último caso de uma instrução de seleção switch.

<span style="color: yellow">Explicação: </span> Não é necessariamente obrigatorio o uso de break no ultimo caso de uma instrução switch. Se o break não estiver presente, a execução continuará no próximo caso. No entanto, geralmente é uma boa prática incluir o break para evitar a execução acidental de outros casos.

( <span style="color: red">F</span> ) A expressão ((x > y)&&(a < b)) é verdadeira se (x > y) for verdadeiro ou (a < b) for verdadeira.

<span style="color: yellow">Explicação: </span> A expressão é verdadeira somente se ambas as condições forem satisfeitas. O operador logico '&&' representa a conjunção logica 'e', e ambas as expressões devem ser verdadeiras para que a expressão seja verdade.

( <span style="color: green">V</span> ) Uma expressão contendo o operador || é verdadeira se um ou ambos de seus operandos forem verdadeiros.

<span style="color: yellow">Explicação: </span> O operador logico '||' que representa a conjunção logica 'ou', necessita que apenas uma das condições seja satisfeita. Então, a sentença é verdadeira.

( <span style="color: red">F</span> ) Para testar para uma série de valores em uma instrução switch, pode-se utilizar um hífen ( - ) entre os valores inicial e final da série em um rótulo case.

<span style="color: yellow">Explicação: </span> Em Java, o uso de um hífen não é permitido entre os valores em um rótulo case. Você deve usar rótulos individuais para cada valor ou combinar vários valores usando o operador | (pipe).

( <span style="color: green">V</span> ) Listar casos consecutivamente sem instruções entre eles permite aos casos executar o mesmo conjunto de instruções. 

<span style="color: yellow">Explicação: </span> Se você não incluir instruções entre os casos, os casos consecutivos que compartilham o mesmo conjunto de instruções serão executados continuamente até encontrar um break ou até o final da instrução switch. Essa é uma característica do switch em Java.


