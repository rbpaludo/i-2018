1 - String(cadeia de caracteres ou texto vazio), caracteres(qualquer caractere baseado em unicode), número(inteiro, decimal, exponencial e quaisquer combinações desses), objetos(combinações dos valores aceitos), array(lista de valores pertencentes a um tipo específico), valores boolean(true e false) e null(nada).  
2 - application/json é o MIME type oficial para arquivos .json, porém, o internet explorer vez ou outra encontra problemas para lidar com o tipo application/json, portanto algumas vezes usa-se text/javascript. A formatação padrão é UTF-8.  
3 - nil não é um valor reconhecido pelo JSON, deve ser escrito null.  
4 -   
{  
   "cadence":"12",  
   "gear":"15",  
   "speed":"65"  
}  
5a)  
{  
   "cidade":"Goiânia",  
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
curl https://<span></span>headers.jsontest.com

![CurlHeaders](https://github.com/rbpaludo/i-2018/blob/master/Imagens/curlHeaders.png)

curl -v https://<span></span>headers.jsontest.com

![CurlHeadersVerbose](https://github.com/rbpaludo/i-2018/blob/master/Imagens/curlHeadersVerbose.png)

curl http://<span></span>ip.jsontest.com

![CurlIp](https://github.com/rbpaludo/i-2018/blob/master/Imagens/curlIp.png)

curl http://<span></span>echo.jsontext.com/<span></span>integracao/aplicacoes/atSup02/json

![CurlCustom](https://github.com/rbpaludo/i-2018/blob/master/Imagens/curlCustom.png)
