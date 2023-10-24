package modelo;

public class Quiz
{
    Pergunta pergunta = new Pergunta();
    Pontuacao validacao = new Pontuacao();

    public void Difuldade(String dificuldade)
    {
        if (dificuldade.equals("Facil"))
        {
            Estaticos.opcao = pergunta.getFacil();
            Estaticos.pergunta = pergunta.getPerguntaFacil();
            Estaticos.resposta = pergunta.getRespostaFacil();
        }

        if (dificuldade.equals("Medio"))
        {
            Estaticos.opcao = pergunta.getNormal();
            Estaticos.pergunta = pergunta.getPerguntaNormal();
            Estaticos.resposta = pergunta.getRespostaNormal();
        }

        if (dificuldade.equals("Dificil"))
        {
            Estaticos.opcao = pergunta.getDificil();
            Estaticos.pergunta = pergunta.getPerguntaDificil();
            Estaticos.resposta = pergunta.getRespostaDificil();
        }
    } 
}
