1 - String(cadeia de caracteres ou texto vazio), caracteres(qualquer caractere baseado em unicode), n�mero(inteiro, decimal, exponencial e quaisquer combina��es desses), objetos(combina��es dos valores aceitos), array(lista de valores pertencentes a um tipo espec�fico), valores boolean(true e false) e null(nada).
2 - application/json � o MIME type oficial para arquivos .json, por�m, o internet explorer vez ou outra encontra problemas para lidar com o tipo application/json, portanto algumas vezes usa-se text/javascript. A formata��o padr�o � UTF-8.
3 - nil n�o � um valor reconhecido pelo JSON, deve ser escrito null.
4 - 
{
"cadence":"12",
"gear":"15",
"speed":"65"
}
5a)
{
"cidade":"Goi�nia",
"cidade":"Trindade"
}
5b)
{
"salada":"alface"
}
5c)
{
"altura":2.3
}
5d)
{
"sabor":null
}
6 - 
curl https://headers.jsontest.com






