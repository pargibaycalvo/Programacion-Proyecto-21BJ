
package interfazGrafica;


//import blackjack.Juego;
import jugador.blackjack.jugadorJuega;


public class interfaz extends javax.swing.JFrame { 
    
    public interfaz() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("21 Black Jack");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aceptarReto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cuandroTexto1 = new javax.swing.JTextArea();
        noGracias = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        aceptarReto.setText("Acepto el Reto");
        aceptarReto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarRetoActionPerformed(evt);
            }
        });

        cuandroTexto1.setColumns(20);
        cuandroTexto1.setRows(5);
        cuandroTexto1.setText("Bienvenido a 21BlackJack\t\nCreado por:\n\nPedro Argibay\nMiguel Sáchez\nSergio Lago");
        jScrollPane2.setViewportView(cuandroTexto1);

        noGracias.setText("No Gracias");
        noGracias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noGraciasActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("LEER ATENTAMENTE:\n\n\nEste juego consiste en mediante las cartas que te\ndamos tienes que sumar 21 en total, claramente no en la primera\nmano tendrás 21 (puede ser posible, eso es tener suerte).Una vez\nque te demos las 2 primeras cartas verás el resultado reflejado en la\nconsolapodrás cojer carta para seguir sumando y obtener 21 o si ves\nque tienes buena mano plantarte y ver si tu oponente se planta\no se rinde. \n\nRecuerda no puedes pasarte de 21 si no pierdes la partida ni tampoco\nquedar por debajo de tu oponente intenta siempre llegar a 21 o lo más\naproximado que puedas. Sé más listo que tu oponente.");
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aceptarReto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noGracias, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarReto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noGracias, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noGraciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noGraciasActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_noGraciasActionPerformed

    private void aceptarRetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarRetoActionPerformed

        jugadorJuega jj = new jugadorJuega();
        jj.numCartasJug();

    }//GEN-LAST:event_aceptarRetoActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }
    
    public static void main(){
    interfaz interf = new interfaz();
        
        jugadorJuega tu = new jugadorJuega(); //crea la clase jugadorJuega
        tu.numCartasJug();
        
        
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarReto;
    private javax.swing.JTextArea cuandroTexto1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton noGracias;
    // End of variables declaration//GEN-END:variables
}
