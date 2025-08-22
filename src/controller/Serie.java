package controller;

public class Serie {
    public static Double serie(int N)
    {
        // A condição é definida que a serie termina quando
        // o valor de N é 1 então se ele for menor que 2 ele
        // chegou no final da série
        if (N < 2)
            return 1.0;
        // O próximo passo é chamado com uma diminuição do N em 1;
        return 1.0 / ((double)N) + serie(N - 1);
    }
}
