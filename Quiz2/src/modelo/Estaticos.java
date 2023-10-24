package modelo;

public class Estaticos
{
    static public String[] pergunta;
    static public String [][] opcao;
    static public String[] resposta ;
    static public int fase = 0;
    static public int contFase = 0;
    static public int contPontos = 0;

    public static String getPergunta(int indice)
    {
        return pergunta[indice];
    }

    public static String[] getOpcao(int fileira)
    {
        return opcao[fileira];
    }

    public static String getResposta(int indice)
    {
        return resposta[indice];
    }
    
    public static int getFase()
    {
        return fase;
    }
}
