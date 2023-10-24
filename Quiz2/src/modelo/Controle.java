package modelo;

public class Controle
{
    private String selecionado = "";
    private String estado = "parado";
    private int maxFases = 9;
    private int fase = 0;
    public String pergunta = "";
    public String[] opcao;
    public String resposta = "";

    Quiz quiz = new Quiz();
    Pontuacao pontuacao = new Pontuacao();

    public void dificuldade(String dificuldade)
    {
        quiz.Difuldade(dificuldade);
    }

    public void IniciarQuiz()
    {      
        if (this.fase > maxFases)
        {
            estado = "resultado";
            Estaticos.contFase = 0;
        }
        else
        {
            Estaticos.contFase+=1;
            
            this.opcao = Estaticos.getOpcao(this.fase);
            this.pergunta = Estaticos.getPergunta(this.fase);
            this.resposta = Estaticos.getResposta(this.fase);
            estado = "iniciado";
        }
    }

    public void verificarResposta(String Selecionado)
    {
        this.selecionado = Selecionado;
        verificarRespostac(this.selecionado);
        this.fase = Estaticos.contFase;
        Estaticos.fase = this.fase;
    }

    public void validarPontos(String selecionada, String resposta)
    {
        pontuacao.validarPontos(this.resposta, selecionada);
    }
    
     public void verificarRespostac(String selecionado)
    {
        validarPontos(selecionado, this.resposta);
    }

    public String getEstado()
    {
        return estado;
    }
    
    public int getFase()
    {
        return fase;
    }
}
