#### [Batista & Moraes (2013), Questão 1] Analise as seguintes declarações de variáveis e assinale (V) para Verdadeiro e (F) para Falso.

    a) Falso - Valor acima do limite aceitado pelo Byte.
    b) Verdadeiro
    c) Falso - Número com ponto flutuante invés de inteiro
    d) Verdadeiro
    e) Falso - Foi atribuido um número invés de um caracter
    f) Falso - O operador = foi utilizado invés de ==
    g) Falso - Foi atribuída uma string invés de um char
    h) Falso - Faltou o ;
    i) Falso - Faltou o f;
    j) Falso - Foi atribuído um boolean invés de um inteiro

#### [Batista & Moraes (2013), Questão 4] Declare uma variável chamada long1 do tipo long e a inicialize com 100. Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com 200. Agora faça int2 receber int1 mais long1 e explique os resultados. Arrume o código para que não ocorra o erro anterior.

Houve um erro de compatibilidade de tipos de variáveis, pois ao tentar somar um int e um long ocorre o seguinte erro:

    error: incompatible types: possible lossy conversion from long to int

Uma forma de solucionar esse problema é declarando int1 e int 2 como long.