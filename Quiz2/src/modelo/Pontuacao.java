package modelo;

public class Pontuacao
{
    private int ponto;

    public int validarPontos(String resposta, String selecionada)
    {
        if(resposta.equals(selecionada))
        {
            Estaticos.contPontos+=1;
            ponto+=1;
        }
        return ponto;
    }

    public int getPonto()
    {
        this.ponto = Estaticos.contPontos;
        return ponto;
    }
}
