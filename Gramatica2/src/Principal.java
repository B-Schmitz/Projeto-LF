
import java.util.ArrayList;
import java.util.Stack;

public class Principal extends javax.swing.JFrame {

    // Váriaveis usadas para armazenar os TextField
    private String simboloInicial;
    private String prod = "";
    private String producoesVazias;
    //private String producoesVazias = "";
    // Vetores que armazenam a Gramatica separadamente
    private String[] vTerminais, vNaoTerminais, vProducoes, vetorNproducoes; //(Vetor dos não terminais de todas produções)
    private String[] vProducaoVazio;

    boolean naoterminal = false, LivreDeUnitaria = true;
    String unitario = "";
    private NaoTerminal ClasseNaoTerminal[];

    //  Private String GeraTerminaisDiretamente = "";
    ArrayList<String> GeraTerminais;
    ArrayList<String> lista;

    ArrayList<String> ProducoesComTerminais = new ArrayList<>();
    ArrayList<String> NaoTerminais = new ArrayList<>();

    Stack pilha;

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
        TextTerminais.setText("a,b,c");
        TextTerminais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Terminais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        TextTerminais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextTerminaisFocusLost(evt);
            }
        });

        TextNaoTerminais.setBackground(new java.awt.Color(51, 51, 51));
        TextNaoTerminais.setForeground(new java.awt.Color(255, 255, 255));
        TextNaoTerminais.setText("s,a,b,e,f,g");
        TextNaoTerminais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Não Terminais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        TextNaoTerminais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextNaoTerminaisFocusLost(evt);
            }
        });
        TextNaoTerminais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNaoTerminaisActionPerformed(evt);
            }
        });

        TextProducoes.setBackground(new java.awt.Color(51, 51, 51));
        TextProducoes.setColumns(20);
        TextProducoes.setForeground(new java.awt.Color(255, 255, 255));
        TextProducoes.setRows(5);
        TextProducoes.setText("S-baB\nS-bBcG\nA-baB\nA-a\nB-bFa\nB-aG\nB-&\nE-aE\nE-a\nF-aB\nF-bEa\nG-baG\nG-aGb");
        TextProducoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produções:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        jScrollPane1.setViewportView(TextProducoes);

        BotaoSimplificacao.setText("Simplificação Combinada");
        BotaoSimplificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSimplificacaoActionPerformed(evt);
            }
        });

        TextSimboloInicial.setBackground(new java.awt.Color(51, 51, 51));
        TextSimboloInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Simbolo Inicial:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        TextSimboloInicial.setForeground(new java.awt.Color(255, 255, 255));
        try {
            TextSimboloInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextSimboloInicial.setText("S");

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
        vTerminais = TextTerminais.getText().trim().split(",");
        vNaoTerminais = TextNaoTerminais.getText().trim().split(",");
        vProducoes = TextProducoes.getText().trim().split("\n");
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

        // Esse for() serve para "rotular" cada posição no vetor da classe
        // Cada possição vai representar um não naoterminal
        for (int i = 0; i < vNaoTerminais.length; i++) {
            ClasseNaoTerminal[i] = new NaoTerminal();
            ClasseNaoTerminal[i].setNaoTerminal(vNaoTerminais[i]);
        }

        // Nessa parte estão sendo enviadas as produções para a classe e será armazenado de acordo com o que o usúario informou
        // EX: Se o usúario informou S-Aa / Ca
        //                          A-A / &
        // Nesse exemplo as produções Aa/Ca seram atribuidas a ClasseNaoTerminal[0] que representaria o não naoterminal :S
        // E na ClasseNaoTerminal[1] estariam atribuidos as produções A/& e assim por diante
        for (int i = 0; i < vetorNproducoes.length; i++) {
            for (int j = 0; j < vNaoTerminais.length; j++) {

                if (ClasseNaoTerminal[j].getNaoTerminal().equals(vetorNproducoes[i])) {
                    ClasseNaoTerminal[j].setProducoes(vProducoes[i]);
                }
            }
        }
    }

    public void ProducoesVazias() {

        producoesVazias = "";
        String auxNaoterminal;
        String auxprod, aux, inutil = "";
        ArrayList<String> lis;

        int tamclas = ClasseNaoTerminal.length;

        for (int i = 0; i < tamclas; i++) {

            // Aqui em auxNaoterminal é armazenado o não naoterminal que gera as produções que serão analizadas
            auxNaoterminal = ClasseNaoTerminal[i].getNaoTerminal();

            int tam = ClasseNaoTerminal[i].getProducoes().size();

            for (int j = 0; j < tam; j++) {

                // Aqui auxprod recebe uma das produções de um dos não terminais da ClasseNaoTerminal
                auxprod = ClasseNaoTerminal[i].getProducoes().get(j);

                int tam3 = auxprod.length();
                for (int t = 0; t < tam3; t++) {

                    // Aqui acontece uma verificação da produção analizando caracter por caracter
                    // buscando por produções vazias
                    if (auxprod.charAt(t) == '&') {

                        // Nessa parte está sendo removido a produção vazia, ou seja a produção que possuir o simbolo &
                        ClasseNaoTerminal[i].getProducoes().remove(j);
                        tam = ClasseNaoTerminal[i].getProducoes().size();

                        // Depois de excluir a produção, nessa parte verifica-se se ainda há alguma produção,
                        // se não houver, esse símbolo será considerado um simbolo 'inutil'
                        // Isso acontece quando um não naoterminal tem apenas uma produção e essa produção é uma 
                        // produção com vazio (&)
                        if (ClasseNaoTerminal[i].getProducoes().size() == 0) {

                            inutil += ClasseNaoTerminal[i].getNaoTerminal();
                            ClasseNaoTerminal[i].setNaoTerminal("");
                            break;
                        }
                        // }

                        // E aqui são armazenadas as produções vazias
                        if (producoesVazias == "") {
                            producoesVazias = auxNaoterminal;
                        } else {
                            producoesVazias += "," + auxNaoterminal;
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

                // aux está recebendo uma das produções da ClasseNaoTerminal
                aux = ClasseNaoTerminal[i].getProducoes().get(j);

                // Esse for() é para eliminar qualquer simbolo que foi considerado 'inutil' anteriormente
                for (int k = 0; k < inutil.length(); k++) {
                    aux = aux.replace(inutil.charAt(k) + "", "");

                }

                // Essa parte é necessario pois se houver algum simbolo que foi considerado inutil na etapa anterior
                // O não naoterminal correspondente foi substituido por 'vazio' = ""
                if (!ClasseNaoTerminal[i].getNaoTerminal().equals("") && !aux.equals("")) {
                    
                    // Caso o simbolo não for inutil a produção é armazenada
                    lis.add(aux);

                }

                for (int t = 0; t < vProducaoVazio.length; t++) {

                    // É aqui que todas as produções vazias são removidas e todas as posibilidades são feitas
                    // Esse primeiro if é para garantir que todas as posibilidades com a posição 0,1,2,3,..... aconteçam
                    for (int l = 0; l < lis.size(); l++) {
                        // Caso um elemento que não exista na lista seja encontrado
                        // Ele será adicionado a lista
                        String teste = lis.get(l).replaceFirst(vProducaoVazio[t], "");
                        if (!lis.contains(teste) && !teste.equals("")) {

                            lis.add(lis.get(l).replaceFirst(vProducaoVazio[t], ""));
                        }
                    }
                }
            }

            // Todas as produções do não naoterminal analizado até aqui, serão apagadas
            ClasseNaoTerminal[i].getProducoes().clear();
            // E esse for() mandará a lista de produções atualizada para a ClasseNaoTerminal 
            for (int e = 0; e < lis.size(); e++) {
                ClasseNaoTerminal[i].setProducoes(lis.get(e));
            }
        }
    }

    private void BotaoProducoesVaziasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProducoesVaziasActionPerformed

        //Vazio tem um erro
        SalvaGramatica();
        ProducoesVazias();
        armazenaInfo();
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

    // A função atualiza a gramatica após retirar as produções unitarias
    public void AtualzaGramticaUnitaria(int i) {

        for (int k = 0; k < ClasseNaoTerminal.length; k++) {

            for (int u = 0; u < unitario.length(); u++) {
                if (!ClasseNaoTerminal[k].getNaoTerminal().equals("")) {
                    if (unitario.charAt(u) == ClasseNaoTerminal[k].getNaoTerminal().charAt(0)) {

                        int tamNovasProd = ClasseNaoTerminal[k].getProducoes().size();

                        // Aqui são adicionadas as novas produções
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

                // Aqui verifica se o tamanho da produção é igual a 1
                // se for essa produção é uma possivel produção unitaria 
                if (ClasseNaoTerminal[i].getProducoes().get(j).length() == 1) {
                    // Esse for() é para verificar se a produção de tamanho 1 é um não naoterminal
                    for (int p = 0; p < vNaoTerminais.length; p++) {

                        // É nesse if() que se verifica se é ou não um não-terminal
                        // Se for naoterminal = true
                        // Tambem impede que produções unitarias do tipo: J-J aconteçam.
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

                    // Se naoterminal = true a produção correspondente será adicionada a variavel unitario
                    // e será removida
                    if (naoterminal) {
                        unitario += ClasseNaoTerminal[i].getProducoes().get(j);
                        ClasseNaoTerminal[i].getProducoes().remove(j);
                        // Isso é porque o tamanho das produções diminuiu inclusive o j--;
                        tamprod = ClasseNaoTerminal[i].getProducoes().size();
                        j--;
                        naoterminal = false;
                    }
                }
            }
            // Aqui verifica se há produções unitarias, se sim chama a função AtualizaGramaticaUnitaria
            if (unitario.length() > 0) {

                // Esse LivreDeUnitaria = false; vai servir depois como um parametro informando que não há mais produções unitarias
                // isso é porque pode haver algo do tipo: J-H  H-K H-ac K-as
                LivreDeUnitaria = false;
                AtualzaGramticaUnitaria(i);
            }

            unitario = "";
        }

        // Nessa parte se a variavel LivreDeUnitaria for igual a false significa qua na gramatica original existe pelo menos uma produção unitaria
        // nesse caso há a aqui uma recurção chamando mais uma vez a função Unitario() e isso se repete até que não haja nehuma produção unitaria
        if (!LivreDeUnitaria) {
            LivreDeUnitaria = true;
            Unitario();
        }
    }
    private void BotaoProducoesUnitariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProducoesUnitariasActionPerformed

        SalvaGramatica();
        ProducoesVazias();
        Unitario();
        armazenaInfo();

        TextGramatica.setText(null);
        TextGramatica.setText(prod);
        prod = "";


    }//GEN-LAST:event_BotaoProducoesUnitariasActionPerformed

    public void armazenaInfo() {
        prod = "";
        for (int i = 0; i < ClasseNaoTerminal.length; i++) {
            int tamprod = ClasseNaoTerminal[i].getProducoes().size();

            for (int j = 0; j < tamprod; j++) {

                // Aqui só esta passando para a variavel prod toda a gramatica ja formatada e que será imprimida.
                prod += ClasseNaoTerminal[i].getNaoTerminal() + "-" + ClasseNaoTerminal[i].getProducoes().get(j) + "\n";
            }
        }
    }

    private void BotaoSimbolosInuteisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSimbolosInuteisActionPerformed

        SalvaGramatica();
        VerificaGeraTerminais();
        SalvaGramatica();
        atualizaInutil();
        EstadosAcessiveis();
        atualizaInutil();
        armazenaInfo();

        TextGramatica.setText(null);
        TextGramatica.setText(prod);
        prod = "";

    }//GEN-LAST:event_BotaoSimbolosInuteisActionPerformed

    public void VerificaGeraTerminais() {
        GeraTerminais = new ArrayList<>();
        String auxproducao;

        // Esse primeiro conjunto de for's() manda para a função  TerminaisDiretamente(auxproducao, i);
        // o não-terminal analizado e suas produçoes, elas são mandadas uma a uma até que todas as produções 
        // sejam analizadas, após as produções do terminal forem todas analizadas, o proximo não-terminal será
        // mandado junco com suas produções e assim segue sucessivamete até que todos os não-terminais e suas
        // produções sejam analizadas.
        //Função para verificar se há produções que geram terminais diretamente
        for (int i = 0; i < ClasseNaoTerminal.length; i++) {

            for (int k = 0; k < ClasseNaoTerminal[i].getProducoes().size(); k++) {
                auxproducao = ClasseNaoTerminal[i].getProducoes().get(k);
                TerminaisDiretamente(auxproducao, i);
            }
        }

        //Essa parte é igual a anterior só dessa vez esta chamando a função TerminalIndiretamente(auxproducao, i);
        //Dessa vez verifica indiretamente
        for (int i = 0; i < ClasseNaoTerminal.length; i++) {
            lista = new ArrayList<>();
            lista.add(ClasseNaoTerminal[i].getNaoTerminal());

            for (int k = 0; k < ClasseNaoTerminal[i].getProducoes().size(); k++) {

                auxproducao = ClasseNaoTerminal[i].getProducoes().get(k);
                TerminalIndiretamente(auxproducao, i);

            }

        }
        System.out.println("");
    }

    private void BotaoSimplificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSimplificacaoActionPerformed

        SalvaGramatica();
        ProducoesVazias();
        Unitario();

        VerificaGeraTerminais();
        atualizaInutil();
        EstadosAcessiveis();
        atualizaInutil();
        armazenaInfo();

        TextGramatica.setText(null);
        TextGramatica.setText(prod);
        prod = "";


    }//GEN-LAST:event_BotaoSimplificacaoActionPerformed

    private void TextNaoTerminaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNaoTerminaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNaoTerminaisActionPerformed

    public void TerminaisDiretamente(String prod, int i) {

        // Essa função é chamada para que não haja a necessidade de se verificar se a posição
        // da produção que está sendo representada pela variavel "prod" é igual a um não-terminal
        // uma vez que se todos os terminais de uma produção forem eliminados só restará não-terminais.
        prod = EliminaTerminais(prod);

        if (prod.length() == 0) {

            String aux = ClasseNaoTerminal[i].getNaoTerminal();
            if (!GeraTerminais.contains(aux)) {
                GeraTerminais.add(aux);
            }

        }
    }

    public String EliminaTerminais(String prod) {

        //Essa função serve para retirar todos os terminais
        for (int p = 0; p < vTerminais.length; p++) {

            prod = prod.replaceAll(vTerminais[p], "");

        }

        prod = prod.replaceAll("&", "");
        return prod;
    }

    public void atualizaInutil() {

        boolean NterminalEsta = false;
        // Por enquanto essa string a baixo vai ficar aqui
        String NaoGeraTerminais = "";

        for (int i = 0; i < ClasseNaoTerminal.length; i++) {

            for (int j = 0; j < GeraTerminais.size(); j++) {

                // Caso ClasseNaoTerminal[i].getNaoTerminal() for encontrado na lista GeraTerminais
                // esse simbolo será ignorado e não será modificado
                if (GeraTerminais.get(j).equals(ClasseNaoTerminal[i].getNaoTerminal())) {

                    NterminalEsta = true;
                    // Se entrou aqui significa que está na lista GeraTerminais
                    // por isso não há a necessidade de continuar, por isso o break
                    // para parar o for().
                    break;
                }
            }

            // Se não estiver na lista será adicionado a variavel "NaoGeraTerminais"
            // e o não terminal e suas produções serão apagadas
            // Obs: a variavel "NaoGeraTerminais" será utilizada para eliminar as
            // produções dos outros não-terminais que possuirem pelo menos um dos
            // não-terminais existentes na variavel "NaoGeraTerminais"
            if (!NterminalEsta) {

                NaoGeraTerminais += ClasseNaoTerminal[i].getNaoTerminal();
                ClasseNaoTerminal[i].setNaoTerminal("");
                ClasseNaoTerminal[i].getProducoes().clear();

            } else {
                NterminalEsta = false;
            }

        }

        for (int i = 0; i < ClasseNaoTerminal.length; i++) {

            for (int j = 0; j < ClasseNaoTerminal[i].getProducoes().size(); j++) {

                for (int p = 0; p < NaoGeraTerminais.length(); p++) {

                    String aux = ClasseNaoTerminal[i].getProducoes().get(j);

                    // Elimina qualquer terminal existe na produção, assim não há a necessidade
                    // de verificar se a posição verificada da produção é ou nao um não-terminal
                    aux = EliminaTerminais(aux);
                    for (int l = 0; l < aux.length(); l++) {
                        {
                            // Aqui está comparando cada posição da produção com a lista de
                            // não-terminais que não geram terminais.
                            if (aux.charAt(l) == NaoGeraTerminais.charAt(p)) {

                                // Caso encontre, essa produção será removida
                                ClasseNaoTerminal[i].getProducoes().remove(j);
                                // Isso é porque o numero de produções diminuiu
                                j--;
                                // E o break é porque não há mais a necesidade de buscar
                                // não-terminais dentro da produção, uma vez que a mesma
                                // ja foi excluida.
                                break;

                            }
                        }
                    }
                    // Isso é se não houver mais produções, ou seja se todas as produções de um não-terminal forem excluias
                    if (ClasseNaoTerminal[i].getProducoes().size() == 0) {
                        break;
                    }

                }
            }
        }
    }

    public void EstadosAcessiveis() {
        
        // A lista GeraTerminais será usada dessa vez para armazenar estados acessiveis
        // Assim é possivel utilizar o metodo atualizaInutil, não precisando criar um novo método.
        GeraTerminais = new ArrayList<>();
        pilha = new Stack();
        // Adiciona o simbolo inicial a GeraTerminais(Lembrando q apesar do nome estaremos armazenando estados acessiveis nessa lista)
        GeraTerminais.add(simboloInicial);
        // E tambem é adicionado a uma pilha
        pilha.push(simboloInicial);

        // Agora o ultimo elemento da pilha é eliminado e adicionado a variavel "aux"
        String aux;

        do {
            aux = pilha.pop().toString();
            for (int i = 0; i < ClasseNaoTerminal.length; i++) {
                 // Se entrar nesse if() achou o não-terminal correspondente ao não-terminal que esta em aux
                if (ClasseNaoTerminal[i].getNaoTerminal().equals(aux)) {

                    // Aqui é mandado a posição do não-terminal para pegar dentro das produções dele
                    // os não terminais que ele alcança
                    teste(i, aux);

                    // O break é para reiniciar o for() pois o proximo não-terminal da pilha
                    // pode estar nas posições anteriores
                    break;

                }

            }

            
        } while (!pilha.empty());
    }

    public void teste(int i, String aux) {

        String prodAux;
        for (int j = 0; j < ClasseNaoTerminal[i].getProducoes().size(); j++) {

            // Pega uma produção do não-terminal analizado
            prodAux = ClasseNaoTerminal[i].getProducoes().get(j);

            // Elimina terminais
            // Mais uma vez, apenas os não-terminais é que importam
            prodAux = EliminaTerminais(prodAux);
            for (int p = 0; p < prodAux.length(); p++) {

                // Se o não-terminal ainda não estiver na lista de GeraTerminais esse será adicionado
                // tambem será adicionado a pilha
                if (!GeraTerminais.contains(prodAux.charAt(p) + "")) {
                    GeraTerminais.add(prodAux.charAt(p) + "");
                    pilha.push(prodAux.charAt(p));
                }

            }

        }

    }

    public void TerminalIndiretamente(String prod, int i) {

        // Essa função é chamada para que não haja a necessidade de se verificar se a posição
        // da produção que está sendo representada pela variavel "prod" é igual a um não-terminal
        // uma vez que se todos os terminais de uma produção forem eliminados só restará não-terminais.
        prod = EliminaTerminais(prod);
        int tam = prod.length();
        // Esse if() é para verificar se prod não está vazio, se estiver significa que a produção foi eliminada 
        // na etapa anterior pos só haviam terminais na produção.
        if (tam > 0) {

            for (int j = 0; j < tam; j++) {
                for (int p = 0; p < GeraTerminais.size(); p++) {

                    if (prod.length() > 0) {
                        // Esse if() verifaca se o não-terminal analizado da produção
                        // já está na lista dos que geram terminais.
                        if (GeraTerminais.get(p).charAt(0) == prod.charAt(j)) {

                            // Caso o não-terminal analizado esteja na lista todas as ocorrencias
                            // existentes na produção analizada serão apagadas atráves do replaceAll();
                            // isso porque não há a necesidade de analiza-lo pois já foi constatado
                            // que ele gera terminais diretamente (analizado em uma etapa anterior)
                            // ou indiretamente dentro dessa mesma função.
                            prod = prod.replaceAll(prod.charAt(j) + "", "");

                            // Isso é porque a produção diminuiu de tamanho
                            tam = prod.length();
                            if (j > 0) {
                                j--;
                            }
                            // Essa "lista" é para evitar loop, toda vez que um não-terminal encontrado
                            // não estiver na lista esse é adicionado a lista
                            // isso serve para que se um não-terminal da produção analizada começar a se repetrir
                            // não ficar em loop.
                            if (!lista.contains(GeraTerminais.get(p))) {
                                lista.add(GeraTerminais.get(p));

                                // Aqui vai chamar uma recurssiva mandando a posição do não-terminal que está gerando
                                // essa produção e a produçao após a verificação se há um não-terminal que esteja na lista
                                // GeraTerminais
                                // Ex1: A-aG , GeraTerminais[G,T,...] essa produção após passar pela eliminação
                                // dos terminais sobrará apenas A-G e com G esta na lista de nãoterminais essa
                                // essa produção ficará A-"" nesse caso será mandado na recurção "" (Vazio).
                                // EX2:  A-aGT , GeraTerminais[G,T,...] ja nesse caso a produção que seria enviada na recurção
                                // será "T".
                                TerminalIndiretamente(prod, i);

                            } // Se o simbolo verificado estiver na lista simplismente retorna, não há porque continuar
                            // caso contrario poderia dar loop.
                            else {
                                return;
                            }

                            // "prod" pode estar menor, por isso tam = prod.length();
                            tam = prod.length();
                        }

                    } else {
                        return;
                    }
                }

                for (int l = 0; l < ClasseNaoTerminal.length; l++) {

                    // Isso é para não dar erro de index
                    if (prod.length() > 0) {

                        // Se ClasseNaoTerminal[l].getNaoTerminal() for igual a posição analizada da produção ele entra.
                        if (ClasseNaoTerminal[l].getNaoTerminal().charAt(0) == prod.charAt(j)) {

                            //Aqui novamente....
                            // Essa "lista" é para evitar loop, toda vez que um não-terminal encontrado
                            // não estiver na lista esse é adicionado a lista
                            // isso serve para que se um não-terminal da produção analizada começar a se repetrir
                            // não ficar em loop.
                            if (!lista.contains(ClasseNaoTerminal[l].getNaoTerminal())) {

                                lista.add(ClasseNaoTerminal[l].getNaoTerminal());

                                for (int m = 0; m < ClasseNaoTerminal[l].getProducoes().size(); m++) {

                                    // Nessa parte está sendo substituido o não-terminal encontrado na produção por uma de  suas produções
                                    prod = prod.replace(ClasseNaoTerminal[l].getNaoTerminal(), ClasseNaoTerminal[l].getProducoes().get(m));

                                    TerminalIndiretamente(prod, i);

                                }
                            }

                        }
                    } else {
                        return;
                    }
                }

            }

        } // Se "prod" = "" (Vazio) siginifica que o não-terminal que está chamando as produções
        // gera terminais.
        else {
            String aux = ClasseNaoTerminal[i].getNaoTerminal();
            if (!GeraTerminais.contains(aux)) {

                GeraTerminais.add(aux);

            }
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
