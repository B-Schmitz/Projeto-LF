
public class Principal extends javax.swing.JFrame {

    // Váriaveis usadas para armazenar os TextField
    private String simboloInicial;
    private String terminais;
    private String naoTerminais;
    private String producoes;

    private String producoesVazias = "";
    // Vetores que armazenam a Gramatica separadamente
    private String[] vTerminais, vNaoTerminais, vProducoes, vetorNproducoes, vProducaoVazio;

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
        TextSimboloInicial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextProducoes = new javax.swing.JTextArea();
        BotaoSimplificacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        BotaoInserirGramatica.setText("Inserir Gramatica");
        BotaoInserirGramatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInserirGramaticaActionPerformed(evt);
            }
        });

        BotaoProducoesUnitarias.setText("Produções Unitárias");

        BotaoSimbolosInuteis.setText("Simbolos Inúteis");

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

        TextNaoTerminais.setBackground(new java.awt.Color(51, 51, 51));
        TextNaoTerminais.setForeground(new java.awt.Color(255, 255, 255));
        TextNaoTerminais.setText("J,G,H,K,L");
        TextNaoTerminais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Não Terminais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N

        TextSimboloInicial.setBackground(new java.awt.Color(51, 51, 51));
        TextSimboloInicial.setForeground(new java.awt.Color(255, 255, 255));
        TextSimboloInicial.setText("J");
        TextSimboloInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Simbolo Inicial:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255))); // NOI18N
        TextSimboloInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSimboloInicialActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextSimboloInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextTerminais)
                                .addComponent(TextNaoTerminais)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(BotaoSimplificacao)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoInserirGramatica)
                            .addComponent(BotaoProducoesUnitarias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoProducoesVazias)
                            .addComponent(BotaoSimbolosInuteis)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BotaoSimplificacao)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextSimboloInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSimboloInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSimboloInicialActionPerformed

    private void BotaoInserirGramaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInserirGramaticaActionPerformed
        simboloInicial = TextSimboloInicial.getText();
        terminais = TextTerminais.getText();
        naoTerminais = TextNaoTerminais.getText();
        producoes = TextProducoes.getText();

        vTerminais = terminais.split(",");
        vNaoTerminais = naoTerminais.split(",");
        vProducoes = producoes.split("\n");
        TextGramatica.setText(TextProducoes.getText());

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
            vProducoes[i] = vProducoes[i].replace(vProducoes[i].charAt(0) + "", "");
            vProducoes[i] = vProducoes[i].replace(vProducoes[i].charAt(0) + "", "");
        }
        //ProducoesVazias();

    }//GEN-LAST:event_BotaoInserirGramaticaActionPerformed

    private void BotaoProducoesVaziasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProducoesVaziasActionPerformed
        // Percorre todo vetor de produções, já separado e procura por &(vazio)
        for (int i = 0; i < vProducoes.length; i++) {
            for (int j = 0; j < vProducoes[i].length(); j++) {

                if (vProducoes[i].charAt(j) == '&') {
                    if ("".equals(producoesVazias)) {
                        producoesVazias += vetorNproducoes[i];
                    } else {

                        producoesVazias += "," + vetorNproducoes[i];
                    }
                }

            }
        }
        vProducaoVazio = producoesVazias.split(",");

        producoesVazias = "";
        //teste nao ta funcionando ainda
        String prod = producoes;
        for (int i = 0; i < vProducoes.length; i++) {
            for (int j = 0; j < vProducoes[i].length(); j++) {
                for (int t = 0; t < vProducaoVazio.length; t++) {
                    if (vProducaoVazio[t].charAt(0) == vProducoes[i].charAt(j)) {
                        prod += "\n" + vetorNproducoes[i] + "-" + vProducoes[i].replace(vProducaoVazio[t], "");
                    }


                }
                if ('&' == vProducoes[i].charAt(j)) {
                    prod += "\n" + vetorNproducoes[i] + "-" + vProducoes[i].replace("&", "");
                }
            }
        }
        System.out.println("tetetet: " + prod);
        TextGramatica.setText(null);
        TextGramatica.setText(prod);

    }//GEN-LAST:event_BotaoProducoesVaziasActionPerformed

    /**
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
    private javax.swing.JTextField TextSimboloInicial;
    private javax.swing.JTextField TextTerminais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
