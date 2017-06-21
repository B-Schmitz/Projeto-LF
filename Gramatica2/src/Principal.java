
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame {

    // Váriaveis usadas para armazenar os TextField
    private String simboloInicial;
    private String terminais;
    private String naoTerminais;
    private String producoes;
    private String prod = "";

    private String producoesVazias = "";
    // Vetores que armazenam a Gramatica separadamente
    private String[] vTerminais, vNaoTerminais, vProducoes, vetorNproducoes; //(Vetor dos não terminais de todas produções)
    private String[] vProducaoVazio; // (Explique-me)

    boolean naoterminal = false, LivreDeUnitaria = true;
    String unitario = "";
    private NaoTerminal ClasseNaoTerminal[];

    //  private String GeraTerminaisDiretamente = "";
    ArrayList<String> GeraTerminais;

    ArrayList<String> ProducoesComTerminais = new ArrayList<>();
    ArrayList<String> NaoTerminais = new ArrayList<>();

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoInserirGramatica = new javax.swing.JButton();
        BotaoProducoesUnitarias = new javax.swing.JButton();
        BotaoSimbolosInuteis = new javax.swing.JButton();
        BotaoProducoesVazias = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextGramatica = new javax.swing.JTextArea();
        TextTerminais = new javax.swing.JTextField();
        TextNaoTerminais = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextProducoes = new javax.swing.JTextArea();
        BotaoSimplificacao = new javax.swing.JButton();
        TextSimboloInicial = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        BotaoInserirGramatica.setText("Inserir Gramatica");
        BotaoInserirGramatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInserirGramaticaActionPerformed(evt);
            }
        });

        BotaoProducoesUnitarias.setText("Produções Unitárias");
        BotaoProducoesUnitarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProducoesUnitariasActionPerformed(evt);
            }
        });

        BotaoSimbolosInuteis.setText("Simbolos Inúteis");
        BotaoSimbolosInuteis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSimbolosInuteisActionPerformed(evt);
            }
        });

        BotaoProducoesVazias.setText("Produções Vazias");
        BotaoProducoesVazias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProducoesVaziasActionPerformed(evt);
            }
        });

        TextGramatica.setEditable(false);
        TextGramatica.setBackground(new java.awt.Color(51, 51, 51));
        TextGramatica.setColumns(20);
        TextGramatica.setForeground(new java.awt.Color(255, 255, 255));
        TextGramatica.setRows(5);
        TextGramatica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gramatica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 255, 0))); // NOI18N
        jScrollPane2.setViewportView(TextGramatica);

        TextTerminais.setBackground(new java.awt.Color(51, 51, 51));
        TextTerminais.setForeground(new java.awt.Color(255, 255, 255));
        TextTerminais.setText("a,b,c,d,e");
        TextTerminais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Terminais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        TextTerminais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextTerminaisFocusLost(evt);
            }
        });

        TextNaoTerminais.setBackground(new java.awt.Color(51, 51, 51));
        TextNaoTerminais.setForeground(new java.awt.Color(255, 255, 255));
        TextNaoTerminais.setText("J,G,H,K,L");
        TextNaoTerminais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Não Terminais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        TextNaoTerminais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextNaoTerminaisFocusLost(evt);
            }
        });

        TextProducoes.setBackground(new java.awt.Color(51, 51, 51));
        TextProducoes.setColumns(20);
        TextProducoes.setForeground(new java.awt.Color(255, 255, 255));
        TextProducoes.setRows(5);
        TextProducoes.setText("J-abG\nG-cd\nH-eK\nK-dL\nL-&");
        TextProducoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produções:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        jScrollPane1.setViewportView(TextProducoes);

        BotaoSimplificacao.setText("Simplificação Combinada");

        TextSimboloInicial.setBackground(new java.awt.Color(51, 51, 51));
        TextSimboloInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Simbolo Inicial:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        TextSimboloInicial.setForeground(new java.awt.Color(255, 255, 255));
        try {
            TextSimboloInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextSimboloInicial.setText("J");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoProducoesVazias)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoSimbolosInuteis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoInserirGramatica)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoProducoesUnitarias)))
                        .addGap(18, 18, 18)
                        .addComponent(BotaoSimplificacao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextSimboloInicial)
                            .addComponent(TextTerminais)
                            .addComponent(TextNaoTerminais)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextSimboloInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextTerminais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextNaoTerminais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoInserirGramatica)
                            .addComponent(BotaoProducoesUnitarias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoProducoesVazias)
                            .addComponent(BotaoSimbolosInuteis)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoSimplificacao)
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BotaoInserirGramaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInserirGramaticaActionPerformed
        simboloInicial = TextSimboloInicial.getText().trim();
        terminais = TextTerminais.getText().trim();
        naoTerminais = TextNaoTerminais.getText().trim();
        producoes = TextProducoes.getText().trim();

        vTerminais = terminais.split(",");
        vNaoTerminais = naoTerminais.split(",");
        vProducoes = producoes.split("\n");
        TextGramatica.setText(TextProducoes.getText());

        // Percorre todo vetor de não-terminais e o vetor de produções
        // Compara a primeira letra, se forem iguais armazena em string auxiliar
        // Vetor de Não-Terminais (Todos Simbolos da Esquerda das produções) é armazenado em vetorNproducoes
        String aux = "";
        for (int i = 0; i < vNaoTerminais.length; i++) {
            for (int j = 0; j < vProducoes.length; j++) {
                if (vNaoTerminais[i].charAt(0) == (vProducoes[j].charAt(0))) {
                    if ("".equals(aux)) {
                        aux += vNaoTerminais[i];
                    } else {
                        aux += "," + vNaoTerminais[i];
                    }

                }
            }
        }
        vetorNproducoes = aux.split(",");
        aux = "";

        // Remove o Não-Termimal e o "-" da Produção
        for (int i = 0; i < vProducoes.length; i++) {
            vProducoes[i] = vProducoes[i].replaceFirst(vProducoes[i].charAt(0) + "", "");
            vProducoes[i] = vProducoes[i].replaceFirst(vProducoes[i].charAt(0) + "", "");
        }
    }//GEN-LAST:event_BotaoInserirGramaticaActionPerformed

    public void SalvaGramatica() {

        //Aqui é definido o tamanho do vetor da classe sendo esse o mesmo tamanho do numero de não terminais
        ClasseNaoTerminal = new NaoTerminal[vNaoTerminais.length];

        //Esse for() serve para 'rotular' cada posição no vetor da classe
        //Cada possição vai representar um não terminal
        for (int i = 0; i < vNaoTerminais.length; i++) {
            ClasseNaoTerminal[i] = new NaoTerminal();
            ClasseNaoTerminal[i].setNaoTerminal(vNaoTerminais[i]);
        }

        //Nessa parte estão sendo enviadas as produções pra a classe e será armazenado de acordo com o que o usuario informou
        //EX: se o usuario informou S-Aa / Ca
        //                          A-A / &
        //Nesse exemplo as produções Aa/Ca seram atribuidas a ClasseNaoTerminal[0] que representaria o não terminal :S
        //E na ClasseNaoTerminal[1] estariam atribuidos as produções A/& e assim por diante
        for (int i = 0; i < vetorNproducoes.length; i++) {
            for (int j = 0; j < vNaoTerminais.length; j++) {

                if (ClasseNaoTerminal[j].getNaoTerminal().equals(vetorNproducoes[i])) {
                    ClasseNaoTerminal[j].setProducoes(vProducoes[i]);
                }

            }
        }
    }

    public void ProducoesVazias() {
        SalvaGramatica();
        producoesVazias = "";
        String auxNaoterminal;
        String auxprod, aux, inutil = "";
        ArrayList<String> lis;

        int tamclas = ClasseNaoTerminal.length;

        for (int i = 0; i < tamclas; i++) {

            //Aqui em auxNaoterminal é armazenado o não terminal que gera as produções que sarão analizadas
            auxNaoterminal = ClasseNaoTerminal[i].getNaoTerminal();

            int tam = ClasseNaoTerminal[i].getProducoes().size();

            for (int j = 0; j < tam; j++) {

                //Aqui auxprod recebe uma das produções de um dos nao terminais da ClasseNaoTerminal
                auxprod = ClasseNaoTerminal[i].getProducoes().get(j);

                int tam3 = auxprod.length();
                for (int t = 0; t < tam3; t++) {

                    //Não sei se essa parte é necessario
                    if (ClasseNaoTerminal[i] != null) {

                        //Aqui acontece uma verificação da produção analizada caracter por caracter
                        //buscando por produções vazias
                        if (auxprod.charAt(t) == '&') {

                            //Pensando bem acho q essa parte não é necessaria mas precisso dar uma olhada 
                            //e de qualquer forma evita alguns erros
                            if (auxprod.replace("&", "").equals("")) {

                                //Nessa parte esata sendo removido a produção vazia, ou seja a produção que posuir o simbolo &
                                ClasseNaoTerminal[i].getProducoes().remove(j);
                                tam = ClasseNaoTerminal[i].getProducoes().size();

                                //Depois de excluir a produção, nessa parte verifica-se se ainda há alguma produção
                                //se nao hover esse simbolo será considerado um simbolo 'inutil'
                                // Isso acontece quando um nao terminal tem apenas uma produção e essa produção é uma 
                                //prosução vazia
                                if (ClasseNaoTerminal[i].getProducoes().size() == 0) {

                                    inutil += ClasseNaoTerminal[i].getNaoTerminal();
                                    ClasseNaoTerminal[i].setNaoTerminal("");
                                    break;
                                }
                            }
                            //E aqui são armazenadas as produções vazias
                            if (producoesVazias == "") {
                                producoesVazias = auxNaoterminal;
                            } else {

                                producoesVazias += "," + auxNaoterminal;
                            }

                        }

                    }
                }
            }
        }

        vProducaoVazio = producoesVazias.split(",");

        for (int i = 0; i < ClasseNaoTerminal.length; i++) {

            lis = new ArrayList<>();

            int tam = ClasseNaoTerminal[i].getProducoes().size();

            for (int j = 0; j < tam; j++) {

                //aux está recebemdo uma das produções da ClasseNaoTerminal
                aux = ClasseNaoTerminal[i].getProducoes().get(j);
                //Mais uma vez, não tenho certeza se essa verificação ainda é necessaria
                if (aux.length() > 0) {
                    aux = aux.replace("&", "");
                }

                //Esse for() é para ja eliminar qualquer simbolo que foi consideado 'inutil'
                for (int k = 0; k < inutil.length(); k++) {
                    aux = aux.replace(inutil.charAt(k) + "", "");

                }

                //Essa parte é necessario pois se hover algum simbolo que foi considerado inutil na etapa anterior
                //O não terminal correspondente foi substituido por 'vazio' = ""
                if (!ClasseNaoTerminal[i].getNaoTerminal().equals("")) {
                    //Caso o simbolo não for inutil a produção é armazenada
                    prod += ClasseNaoTerminal[i].getNaoTerminal() + "-" + aux + "\n";

                    lis.add(aux);

                }

                for (int p = 0; p < vProducaoVazio.length; p++) {
                    for (int t = 0; t < vProducaoVazio.length; t++) {

                        //È aqui que todas as produções vazias são removidas e todas as posibilidades são feitas
                        //Esse primeiro if é para garantir que todas as posibilidades com a posição 0,1,2,3,..... aconteçam
                        
                            for (int l = 0; l < lis.size(); l++) {
                                //Caso um elemento que não exista na lista seja encontrado
                                //Ele será adicionado a lista
                                String teste = lis.get(l).replace(vProducaoVazio[t], "");
                                if (!lis.contains(teste) && !teste.equals("")) {

                                    
                                    prod += ClasseNaoTerminal[i].getNaoTerminal() + "-" + lis.get(l).replace(vProducaoVazio[t], "") + "\n";

                                    lis.add(lis.get(l).replace(vProducaoVazio[t], ""));

                                }
                            }
                        

                    }

                }

            }
            //Aqui todas as produções do não terminal analizado até aqui serão apagadas
            ClasseNaoTerminal[i].getProducoes().clear();
            //E esse for() mandará a lista de produções atualizada para a ClasseNaoTerminal 
            for (int e = 0; e < lis.size(); e++) {
                ClasseNaoTerminal[i].setProducoes(lis.get(e));
            }

        }
    }

    private void BotaoProducoesVaziasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProducoesVaziasActionPerformed

        ProducoesVazias();

        TextGramatica.setText(null);
        TextGramatica.setText(prod);
        prod = "";

    }//GEN-LAST:event_BotaoProducoesVaziasActionPerformed

    private void TextTerminaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextTerminaisFocusLost
        TextTerminais.setText(TextTerminais.getText().toLowerCase());
    }//GEN-LAST:event_TextTerminaisFocusLost

    private void TextNaoTerminaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextNaoTerminaisFocusLost
        TextNaoTerminais.setText(TextNaoTerminais.getText().toUpperCase());
    }//GEN-LAST:event_TextNaoTerminaisFocusLost

    //A função ataliza a gramatica após retirar as produções unitarias
    public void AtualzaGramticaUnitaria(int i) {

        for (int k = 0; k < ClasseNaoTerminal.length; k++) {

            for (int u = 0; u < unitario.length(); u++) {
                if (!ClasseNaoTerminal[k].getNaoTerminal().equals("")) {
                    if (unitario.charAt(u) == ClasseNaoTerminal[k].getNaoTerminal().charAt(0)) {

                        int tamNovasProd = ClasseNaoTerminal[k].getProducoes().size();

                        //Aqui são adicionadas as novas produções
                        for (int l = 0; l < tamNovasProd; l++) {

                            ClasseNaoTerminal[i].setProducoes(ClasseNaoTerminal[k].getProducoes().get(l));

                        }

                    }
                }

            }

        }

    }

    public void Unitario() {
        naoterminal = false;
        int tamclas = ClasseNaoTerminal.length;

        for (int i = 0; i < tamclas; i++) {

            int tamprod = ClasseNaoTerminal[i].getProducoes().size();
            for (int j = 0; j < tamprod; j++) {

                //Aqui verifica se o tamanho da produção é igual a 1
                //se for essa produção é uma possivel produção unitaria 
                if (ClasseNaoTerminal[i].getProducoes().get(j).length() == 1) {

                    //Esse for() é para verificar se a produção de tamanho 1 é um não terminal
                    for (int p = 0; p < vNaoTerminais.length; p++) {

                        //É nesse if() que se verifica se é ou não um terminal
                        //Se for naoterminal = true
                        //Tambem impede que produções unitarias do tipo: J-J aconteçam.
                        //Obs: é essa a parte que te perguntei no face não sei o que fazer com essa produção
                        if (vNaoTerminais[p].equals(ClasseNaoTerminal[i].getProducoes().get(j))) {

                            if (!vNaoTerminais[p].equals(ClasseNaoTerminal[i].getNaoTerminal())) {
                                naoterminal = true;
                                break;
                            } else {
                                if (ClasseNaoTerminal[i].getProducoes().size() > 1) {
                                    ClasseNaoTerminal[i].getProducoes().remove(j);
                                    tamprod = ClasseNaoTerminal[i].getProducoes().size();;
                                    break;
                                }
                            }
                        }

                    }

                    //Se naoterminal = true a produção correspondente será adicionada a variavel unitario
                    //e será removida
                    if (naoterminal) {
                        unitario += ClasseNaoTerminal[i].getProducoes().get(j);
                        ClasseNaoTerminal[i].getProducoes().remove(j);
                        //Isso é porque o tamanho das produções diminuiu incluseive o j--;
                        tamprod = ClasseNaoTerminal[i].getProducoes().size();
                        j--;
                        naoterminal = false;
                    }

                }

            }
            //Aqui verifica se há produções unitarias, se sim chama a função AtualizaGramaticaUnitaria
            if (unitario.length() > 0) {

                //Esse LivreDeUnitaria = false; vai servir depois como um parametro informando que não há mais produções unitarias
                //isso é porque pode haver algo do tipo: J-H  H-K H-ac K-as
                LivreDeUnitaria = false;
                AtualzaGramticaUnitaria(i);

            }
            unitario = "";
        }
        //Nessa parte se a variavel LivreDeUnitaria for igual a false significa qua na gramatica original existe pelo menos uma produção unitaria
        //nesse caso há a aqui uma recurção chamando mais uma vez a função Unitario() e isso se repete até que não haja nehuma produção unitaria
        if (!LivreDeUnitaria) {
            LivreDeUnitaria = true;
            Unitario();
        }
    }
    private void BotaoProducoesUnitariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProducoesUnitariasActionPerformed

        SalvaGramatica();
        ProducoesVazias();
        Unitario();
        prod = "";

        for (int i = 0; i < ClasseNaoTerminal.length; i++) {
            int tamprod = ClasseNaoTerminal[i].getProducoes().size();

            for (int j = 0; j < tamprod; j++) {

                prod += ClasseNaoTerminal[i].getNaoTerminal() + "-" + ClasseNaoTerminal[i].getProducoes().get(j) + "\n";

            }
        }

        TextGramatica.setText(null);
        TextGramatica.setText(prod);
        prod = "";


    }//GEN-LAST:event_BotaoProducoesUnitariasActionPerformed

    private void BotaoSimbolosInuteisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSimbolosInuteisActionPerformed

        SalvaGramatica();
        GeraTerminais = new ArrayList<>();
        String auxproducao;

       /* for (int i = 0; i < ClasseNaoTerminal.length; i++) {

            for (int k = 0; k < ClasseNaoTerminal[i].getProducoes().size(); k++) {

                auxproducao = ClasseNaoTerminal[i].getProducoes().get(k);
                teste(auxproducao, i);

            }

        }
        //EliminaProblema();
*/
        teste2();

    }//GEN-LAST:event_BotaoSimbolosInuteisActionPerformed

    public void EliminaProblema() {

        for (int i = 0; i < ClasseNaoTerminal.length; i++) {

            for (int j = 0; j < ClasseNaoTerminal[i].getProducoes().size(); j++) {

                String aux = ClasseNaoTerminal[i].getProducoes().get(j);
                EliminaTerminais(aux);
                aux = aux.replaceAll(ClasseNaoTerminal[i].getNaoTerminal(), "");
                if (aux.length() < 1) {

                    ClasseNaoTerminal[i].getProducoes().remove(j);
                    break;

                }

            }
        }

    }

    public void teste2() {
        String auxproducao;

        for (int i = 0; i < ClasseNaoTerminal.length; i++) {

            for (int k = 0; k < ClasseNaoTerminal[i].getProducoes().size(); k++) {

                auxproducao = ClasseNaoTerminal[i].getProducoes().get(k);
                TerminalIndiretamente(auxproducao, i,0);

            }

        }
    }

    public void teste(String prod, int i) {

        /*   int cont = 0;

        for (int p = 0; p < prod.length(); p++) {

            for (int j = 0; j < vNaoTerminais.length; j++) {

                if (vNaoTerminais[j].charAt(0) == prod.charAt(p)) {

                    cont++;
                    break;
                }

            }
        }*/
        //  if (0 == cont) {
        prod = EliminaTerminais(prod);

        if (prod.length() == 0) {

            //  GeraTerminaisDiretamente += ClasseNaoTerminal[i].getNaoTerminal();
            String aux = ClasseNaoTerminal[i].getNaoTerminal();
            if (!GeraTerminais.contains(aux)) {
                GeraTerminais.add(aux);
            }

        } //else {

        //  TerminalIndiretamente(prod, i , i);
        /*
            ProducoesComTerminais.add(prod);
            NaoTerminais.add(prod);*/
        //    }
        // cont = 0;
    }

    public String EliminaTerminais(String prod) {

        for (int p = 0; p < vTerminais.length; p++) {

            prod = prod.replaceAll(vTerminais[p], "");

        }

        prod = prod.replaceAll("&", "");
        return prod;
    }

    public void atualizaInutil() {

        boolean NterminalEsta = false;
        SalvaGramatica();

        for (int i = 0; i < ClasseNaoTerminal.length; i++) {
            for (int j = 0; j < GeraTerminais.size(); j++) {

                if (ClasseNaoTerminal[i].getNaoTerminal().equals(GeraTerminais.get(j))) {

                    NterminalEsta = true;
                    break;

                }
                if(NterminalEsta){
                    int tam = ClasseNaoTerminal[i].getProducoes().size();
                for (int l = 0; l < tam;l++) {

                    String aux = ClasseNaoTerminal[i].getProducoes().get(l);
                    
                    EliminaTerminais(aux);
                    
                    if (!aux.equals(GeraTerminais.get(j))) {

                       ClasseNaoTerminal[i].getProducoes().get(l);
                        
                    }

                }
                }
                else if( !ClasseNaoTerminal[i].getNaoTerminal().equals(simboloInicial)){
                   
                    ClasseNaoTerminal[i].setNaoTerminal("");
                    ClasseNaoTerminal[i].getProducoes().clear();
                    
                }

            }
        }

    }
    
    //terminar
    

    public void EstadosAcessiveis() {

        for(int i = 0; i <  ClasseNaoTerminal.length; i ++){
            
            for(int j = 0; j < ClasseNaoTerminal[i].getProducoes().size(); j++){
                
                
            }
        }
        
    }

    public void TerminalIndiretamente(String prod, int i,int cont) {

      
        if(cont > ClasseNaoTerminal.length){
            return;
        }
        prod = EliminaTerminais(prod);
        int tam = prod.length();
        if (tam > 0) {

            for (int j = 0; j < tam; j++) {
                for (int p = 0; p < GeraTerminais.size(); p++) {

                    if (prod.length() > 0) {
                        if (GeraTerminais.get(p).charAt(0) == prod.charAt(j)) {

                            prod = prod.replaceAll(prod.charAt(j) + "", "");
                            
                         
                            tam = prod.length();
                            cont++;
                            TerminalIndiretamente(prod, i,cont);
                        }

                    } else {
                        return;
                    }
                }

                for (int l = 0; l < ClasseNaoTerminal.length; l++) {
                    if (prod.length() > 0) {
                        if (ClasseNaoTerminal[l].getNaoTerminal().charAt(0) == prod.charAt(j)) {

                            for (int m = 0; m < ClasseNaoTerminal[l].getProducoes().size(); m++) {

                                prod = prod.replace(ClasseNaoTerminal[l].getNaoTerminal(), ClasseNaoTerminal[l].getProducoes().get(m));

                                prod = prod.replaceAll(ClasseNaoTerminal[l].getNaoTerminal(), "");

                                if (ClasseNaoTerminal[l].getProducoes().size() > 1) {
                                    cont++;
                                    TerminalIndiretamente(prod, i,cont);
                                } else {

                                    prod = prod.replaceAll(ClasseNaoTerminal[l].getNaoTerminal(), "");

                                    if (prod.length() < 1) {

                                        return;
                                    } else {
                                        cont++;
                                        TerminalIndiretamente(prod, i,cont);
                                    }
                                }

                            }

                        }
                    } else {
                        return;
                    }
                }

            }

        } else {
            String aux = ClasseNaoTerminal[i].getNaoTerminal();
            if (!GeraTerminais.contains(aux)) {

                GeraTerminais.add(aux);
                System.out.println("ttt: " + aux);

            }
            //GeraTerminaisDiretamente += ClasseNaoTerminal[i].getNaoTerminal();
        }

    }

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoInserirGramatica;
    private javax.swing.JButton BotaoProducoesUnitarias;
    private javax.swing.JButton BotaoProducoesVazias;
    private javax.swing.JButton BotaoSimbolosInuteis;
    private javax.swing.JButton BotaoSimplificacao;
    private javax.swing.JTextArea TextGramatica;
    private javax.swing.JTextField TextNaoTerminais;
    private javax.swing.JTextArea TextProducoes;
    private javax.swing.JFormattedTextField TextSimboloInicial;
    private javax.swing.JTextField TextTerminais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
