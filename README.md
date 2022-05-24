# CALCULO DA MEDIA
 dia 2504 ex001
 
 # ALGORITMO
 inicio

    escreva "Digite a nota de AC1:  "
    ler notaum

    escreva "Digite a nota de AC2:  "
    ler notadois

    escreva "Digite a nota de AG:    "
    ler notaag

    escreva "Digite a nota de AF:  "
    ler notaaf
    
    notaum = notaum * 0.15
    notadois = notadois * 0.3
    notaag = notaag * 0.1
    notaaf = notaaf * 0.45

    resultado = notaum + notadois + notaag + notaaf
    
    se resultado >= 5 faca
        escreva "Aluno Aprovado"
    senão 
        escreva "Aluno Reprovado"
    fimse
fim 
 

# FLUXOGRAMA
![Fluxograma calculo da media](https://user-images.githubusercontent.com/104398779/169932483-b41324ba-6649-4e91-a80c-047f243f8f82.png)
