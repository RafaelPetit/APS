package modelo;

public class Pergunta
{
    private String[] perguntaFacil =
    {
        "<html>Ao considerar a reciclagem de plásticos, é essencial levar em conta a complexidade da estrutura química de cada tipo "
            + "Entre os plásticos amplamente utilizados listados abaixo, qual não é possível a reciclagem devido à sua estrutura química "
            + "complexa, presença de aditivos e baixa taxa de sucesso na reciclagem?</html>",
        "<html>Ao contrário do pensamento de muitos, a origem de uma ideia com semelhanças com reciclagem pode ser rastreada para os "
            + "primórdios da civilização humana Qual das segues civilizações antigas é considerada uma das primeiras a praticar a reciclagem "
            + "de papel, demonstrando uma preocupação com a conservação de recursos e a sustentabilidade ambiental?</html>",
        "<html>A reciclagem de vidro desempenha um papel crucial na redução do impacto ambiental da produção de embalagens e produtos feitos"
            + " com esse material No entanto, existem desafios significativos associados a esse processo Entre os segues aspectos, qual "
            + "representa um dos desafios mais proeminentes que podem afetar a eficácia da reciclagem de vidro e sua sustentabilidade "
            + "ambiental?</html>",
        "<html>Qual é um dos principais benefícios da reciclagem de metais em comparação com a extração de metais a partir de minérios "
            + "brutos, considerando o contexto ambiental e econômico?</html>",
        "<html>A reciclagem de papel desempenha um papel fundamental na redução do desmatamento e na conservação de recursos naturais no "
            + "entanto, existem desafios significativos associados a esse processo Dentre os segues fatores, qual representa um dos desafios "
            + "mais proeminentes na reciclagem de papel, contribuindo para a diminuição da qualidade do papel reciclado e exigindo processos "
            + "adicionais de purificação?</html>",
        "<html>A reciclagem é um componente fundamental da gestão de resíduos e da promoção da sustentabilidade ambiental No contexto do "
            + "Brasil, um país vasto e diversificado, vários desafios têm sido enfrentados para promover a reciclagem de maneira efetiva e "
            + "abrangente Dentre os segues desafios, qual representa um obstáculo notório para a expansão bem-sucedida da reciclagem no Brasil, "
            + "afetando a capacidade de coleta e processamento de materiais recicláveis?</html>",
        "<html>Qual dos segues princípios fundamentais da Política Nacional de Resíduos Sólidos (PNRS) no Brasil enfatiza a responsabilidade "
            + "compartilhada pelo ciclo de vida dos produtos, desde a sua concepção até a sua destinação final?</html>",
        "<html>A reciclagem é um processo fundamental no gerenciamento de resíduos sólidos e na promoção da sustentabilidade ambiental "
            + "Trata-se de uma prática que busca reduzir o desperdício de recursos naturais e minimizar o impacto ambiental, contribuindo para "
            + "a conservação do meio ambiente No contexto da gestão de resíduos, qual é a definição mais precisa de reciclagem?</html>",
        "<html>A reciclagem é uma prática essencial para a gestão sustentável de resíduos e desempenha um papel fundamental tanto no "
            + "contexto ambiental quanto econômico Além da óbvia redução do acúmulo de resíduos em aterros sanitários, um dos benefícios mais "
            + "significativos da reciclagem é sua capacidade de proporcionar impactos positivos tanto para o meio ambiente quanto para a economia "
            + "Dentre as segues opções, qual representa um desses impactos positivos da reciclagem?</html>",
        "<html>A reciclagem de matéria orgânica desempenha um papel crucial na gestão sustentável de resíduos e na promoção da conservação de "
            + "recursos naturais Além da produção de composto orgânico para fertilização do solo, qual é outro benefício significativo associado "
            + "à reciclagem de resíduos orgânicos, como restos de alimentos e vegetais, que tem um impacto positivo tanto no meio ambiente "
            + "quanto na gestão de resíduos?</html>"
    };

    private String[] perguntaNormal =
    {
        "Qual dos segues não é um dos pilares da sustentabilidade?",
        "Qual é a definição correta de biodiversidade?",
        "O que é a poluição sonora e como ela pode afetar o meio ambiente?",
        "Qual é o papel das energias renováveis na promoção da sustentabilidade?",
        "Qual é o conceito de \"sustentabilidade\" no contexto ambiental?",
        "Qual é a importância da camada de ozônio para o meio ambiente?",
        "O que significa o termo \"Efeito Estufa\"?",
        "O que são alimentos orgânicos?",
        "O que é a \"Economia Circular\" e qual é o seu objetivo?",
        "Qual é a importância da preservação das florestas para a biodiversidade?",
    };

    private String[] perguntaDificil =
    {
        "Qual o órgão responsável por cuidar do meio ambiente do Brasil?",
        "É uma consequência da poluição atmosférica devido a queima de combustível:",
        "O que pode ser feito para descartes de lixos eletrônicos?",
        "Como colaborar com a redução da produção de resíduos?",
        "I – Lixo Orgânico: resto de comida, papel sujo e não possível de reutilizacao;\n"
        + "II – Lixo reciclável: Baterias e dispositivos eletrônicos;\n"
        + "Responda as questões abaixo com V (Verdadeiro) e F (Falso):",
        "Uma lata de alumínio pode ser matéria prima de qual objeto, após ser reciclada?",
        "Ao dirigir com menos velocidade, consome-se menos combustível?",
        "Qual o seguimento que mais se consome água?",
        "Qual não é utilizado como fonte de energia:",
        "Qual a média de água consumida por cada brasileiro por dia?",
    };

    private String[][] opcaoFacil =
    {
        {
            "PET (Tereftalato de polietileno)", "PEAD(Polietileno de Alta Densidade)", "PU (Poliuretano)"
        },
        {
            "Império Romano", "Antigo Japão", "Antigo Egito"
        },
        {
            "<html>O vidro possui um ciclo de vida limitado, o que significa que não pode ser reciclado várias vezes</html>", "<html>A "
            + "reciclagem de vidro consome mais energia do que a fabricação de vidro novo, tornando-a menos eficiente em termos energéticos</html>", 
            "<html>O vidro possui um ciclo de vida limitado, o que significa que não pode ser recicladovárias vezes</html>"
        },
        {
            "A reciclagem de metais requer menos energia do que a extração de minérios, reduzindo as emissões de carbono", "A reciclagem de "
            + "metais não gera resíduos tóxicos, enquanto a extração de minérios pode liberar poluentes nocivos", "A reciclagem de metais é "
            + "menos custosa do que a extração de minérios, tornando os produtos mais acessíveis"
        },
        {
            "<html>O processo de reciclagem de papel consome grandes quantidades de água, aumentando a pressão sobre os recursos hídricos</html>", 
            "<html>A reciclagem de papel não é economicamente viável devido aos altos custos de transporte envolvidos na coleta de papel</html>"
            + "reciclável", "<html>A presença de contaminantes, como fragmentos de plástico e tas, na celulose reciclada dificulta o processo de "
            + "reciclagem e prejudica a qualidade do produto final</html>"
        },
        {
            "<html>Falta de práticas para incentivar a conscientização pública sobre a importância da reciclagem e suas implicações "
            + "ambientais e econômicas</html>", "<html>Ausência de infraestrutura de coleta seletiva em áreas rurais remotas, dificultando o acesso a "
            + "serviços de reciclagem</html>", "<html>Grande dependência de catadores informais na coleta de materiais recicláveis, "
            + "resultando em desafios de organização e inclusão social</html>"
        },
        {
            "Princípio da obrigatoriedade da reciclagem de todos os resíduos sólidos gerados", "Princípio da priorização da incineração "
            + "de resíduos para geração de energia", "Princípio da ernalização dos custos ambientais e sociais na gestão dos resíduos"
        },
        {
            "Um processo que envolve a queima controlada de resíduos para geração de energia", "Um método de disposição final de resíduos "
            + "em aterros sanitários, promovendo a degradação controlada dos materiais", "<html>Um processo de transformação de materiais descartados "
            + "em novos produtos ou matérias-primas, reduzindo a necessidade de recursos virgens</html>"
        },
        {
            "<html>Aumento das emissões de gases de efeito estufa devido à logística de coleta de materiais recicláveis, impactando negativamente o "
            + "meio ambiente</html>", "Diminuição da biodiversidade em áreas próximas a instalações de reciclagem, devido à perturbação do habitat "
            + "natural", "<html>Geração de empregos e estímulo ao crescimento econômico sustentável, contribuindo para o bem-estar social e a "
            + "estabilidade econômica</html>"
        },
        {
            "Geração de calor para fornecer energia elétrica a partir da queima controlada dos resíduos orgânicos", "<html>Redução significativa da "
            + "emissão de gases de efeito estufa, como o metano, provenientes da decomposição em aterros sanitários</html>", "Aumento do pH do solo, "
            + "tornando-o mais alcalino e favorável para a agricultura convencional"
        }
    };

    private String[][] opcaoNormal =
    {
        {
            "Desenvolvimento social", "Desenvolvimento econômico", "Desenvolvimento militar"
        },
        {
            "Apenas a diversidade de animais em um ecossistema", "A variedade de formas de vida na Terra, incluindo genes, espécies e "
            + "ecossistemas", "A diversidade de plantas em um jardim específico"
        },
        {
            "Liberação de gases tóxicos por fontes sonoras", "Excesso de ruído que pode prejudicar a saúde humana e animal", "Emissão de "
            + "luz excessiva durante a noite"
        },
        {
            "Aumentar a dependência de combustíveis fósseis", "Contribuir para a diversidade de resíduos tóxicos", "Reduzir a emissão de gases "
            + "de efeito estufa"
        },
        {
            "Utilização ensiva de recursos naturais", "Equilíbrio entre as necessidades atuais e a capacidade futura da Terra de atendê-las", 
            "Aumento irrestrito da produção industrial"
        },
        {
            "Absorver a luz solar e aumentar a temperatura da atmosfera", "Reduzir a poluição atmosférica", "Proteger a vida na Terra bloqueando"
            + " raios ultravioleta prejudiciais"
        },
        {
            "Aquecimento global causado pelo aumento da concentração de gases na atmosfera", "Método de aquecimento de estufas agrícolas", 
            "Estratégia para resfriar a atmosfera"
        },
        {
            "Produtos cultivados com uso ensivo de agrotóxicos e pesticidas", "Alimentos geneticamente modificados", "Produtos cultivados sem "
            + "o uso de produtos químicos séticos"
        },
        {
            "Modelo econômico baseado no crescimento ilimitado", "Estratégia para esgotar rapidamente os recursos naturais", "Prática de "
            + "reutilizar materiais e minimizar o desperdício"
        },
        {
            "Redução da biodiversidade ao promover a monocultura", "Criação de habitats artificiais", "Manutenção de ecossistemas e suporte à "
            + "diversidade de espécies"
        }
    };

    private String[][] opcaodificil =
    {
        {
            "MMA (Ministério do Meio Ambiente).", "MPA (Ministério Público Ambiental).", "MAN (Ministério do Agro Negócio)."
        },
        {
            "Chuva ensa;", "Chuva Ácida;", "Tempestades Ácidas"
        },
        {
            "Procurar lugares específicos de descartes desses materiais", "Jogar em lixos comuns", "Descarta-los com plásticos e metais"
        },
        {
            "Comprar produtos com recipientes reciclados", "Reutilizar produtos e matérias se for possível", "Todas as alternativas estão "
            + "Corretas"
        },
        {
            "V e V", "V e F", "V e F"
        },
        {
            "Garrafa de vidro", "Bicicleta", "Embalagem de comida"
        },
        {
            "Verdadeiro", "Falso", "É importante conduzir o veículo a uma velocidade considerável"
        },
        {
            "Uso doméstico", "Indústria", "Agricultura"
        },
        {
            "Água", "Alumínio", "Luz solar"
        },
        {
            "150 Litros", "200 Litros", "250 Litros"
        }
    };

    private String[] respostaFacil =
    {
        "PU (Poliuretano)",
        "Antigo Egito",
        "A reciclagem de vidro consome mais energia do que a fabricação de vidro novo, tornando-a menos eficiente em termos energéticos",
        "A reciclagem de metais requer menos energia do que a extração de minérios, reduzindo as emissões de carbono",
        "A presença de contaminantes, como fragmentos de plástico e tas, na celulose reciclada dificulta o processo de reciclagem e prejudica a "
            + "qualidade do produto final",
        "Grande dependência de catadores informais na coleta de materiais recicláveis, resultando em desafios de organização e inclusão social",
        "Princípio da obrigatoriedade da reciclagem de todos os resíduos sólidos gerados",
        "Um processo de transformação de materiais descartados em novos produtos ou matérias-primas, reduzindo a necessidade de recursos virgens",
        "Geração de empregos e estímulo ao crescimento econômico sustentável, contribuindo para o bem-estar social e a estabilidade econômica",
        ") Redução significativa da emissão de gases de efeito estufa, como o metano, provenientes da decomposição em aterros sanitários",
    };

    private String[] respostaNormal =
    {
        "Desenvolvimento militar",
        "A variedade de formas de vida na Terra, incluindo genes, espécies e ecossistemas",
        "Excesso de ruído que pode prejudicar a saúde humana e animal",
        "Reduzir a emissão de gases de efeito estufa",
        "Equilíbrio entre as necessidades atuais e a capacidade futura da Terra de atendê-las",
        "Proteger a vida na Terra bloqueando raios ultravioleta prejudiciais",
        "Aquecimento global causado pelo aumento da concentração de gases na atmosfera",
        "Produtos cultivados sem o uso de produtos químicos séticos",
        "Prática de reutilizar materiais e minimizar o desperdício",
        "Manutenção de ecossistemas e suporte à diversidade de espécies",
    };

    private String[] respostaDificil =
    {
        "MMA (Ministério do Meio Ambiente).",
        "Chuva Ácida",
        "Procurar lugares específicos de descartes desses materiais",
        "Todas as alternativas estão Corretas",
        "V e F",
        "Bicicleta",
        "Verdadeiro",
        "Agricultura",
        "Alumínio",
        "150 Litros",
    };

    public String[] getPerguntaFacil()
    {
        return perguntaFacil;
    }

    public String[] getPerguntaNormal()
    {
        return perguntaNormal;
    }

    public String[] getPerguntaDificil()
    {
        return perguntaDificil;
    }

    public String[][] getFacil()
    {
        return opcaoFacil;
    }

    public String[][] getNormal()
    {
        return opcaoNormal;
    }

    public String[][] getDificil()
    {
        return opcaodificil;
    }

    public String[] getRespostaFacil()
    {
        return respostaFacil;
    }

    public String[] getRespostaNormal()
    {
        return respostaNormal;
    }

    public String[] getRespostaDificil()
    {
        return respostaDificil;
    }

}
