#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int numeroInt = 45;
    printf("\nO tamanho da variavel numeroInt � %u bytesz\n", sizeof(numeroInt));

    double numeroDouble = 3.14;
    printf("\nO tamanho da variavel numeroDouble � %u bytesz\n", sizeof(numeroDouble));

    char letraChar = 'letra';
    printf("\nO tamanho da variavel letraChar � %u bytesz\n", sizeof(letraChar));

    return 0;
}
