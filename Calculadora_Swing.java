import javax.swing.*;

public class Calculadora_Swing extends javax.swing.JFrame {
    public float operador_Uno;
    public float operador_Dos;
    public String el_Operador;
   
    public Calculadora_Swing() {
        initComponents();
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaInicial = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        boton_mas = new javax.swing.JButton();
        boton_menos = new javax.swing.JButton();
        boton_reset = new javax.swing.JButton();
        Boton_resultado = new javax.swing.JButton();
        boton_division = new javax.swing.JButton();
        boton_punto = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pantallaInicial.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        pantallaInicial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantallaInicial.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder()));

        boton1.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton1.setText("1");
        boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton2.setText("2");
        boton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton3.setText("3");
        boton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton4.setText("4");
        boton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton5.setText("5");
        boton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton6.setText("6");
        boton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton7.setText("7");
        boton7.setAlignmentY(0.0F);
        boton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton8.setText("8");
        boton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton9.setText("9");
        boton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton0.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton0.setText("0");
        boton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        boton_mas.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton_mas.setText("+");
        boton_mas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_masActionPerformed(evt);
            }
        });

        boton_menos.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton_menos.setText("-");
        boton_menos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_menosActionPerformed(evt);
            }
        });

        boton_reset.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton_reset.setText("C");
        boton_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_resetActionPerformed(evt);
            }
        });

        Boton_resultado.setText("=");
        Boton_resultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_resultadoActionPerformed(evt);
            }
        });

        boton_division.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        boton_division.setText("/");
        boton_division.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divisionActionPerformed(evt);
            }
        });

        boton_punto.setText(".");
        boton_punto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_puntoActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jButton17.setText("*");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pantallaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_division, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Boton_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantallaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_division, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "8");
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
       pantallaInicial.setText(pantallaInicial.getText() + "9");
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "0");
    }//GEN-LAST:event_boton0ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "6");;
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "7");
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_menosActionPerformed
        try{
            this.operador_Uno = Float.parseFloat(pantallaInicial.getText());
            this.el_Operador = "-";
            this.pantallaInicial.setText("");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se puede restar sin operaciones.");
        } 
    }//GEN-LAST:event_boton_menosActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "1");
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        pantallaInicial.setText(pantallaInicial.getText() + "3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_masActionPerformed
        try{
            this.operador_Uno = Float.parseFloat(pantallaInicial.getText());
            this.el_Operador = "+";
            this.pantallaInicial.setText("");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede sumar sin operaciones.");
        }         
    }//GEN-LAST:event_boton_masActionPerformed

    private void boton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_resetActionPerformed
        pantallaInicial.setText("");
    }//GEN-LAST:event_boton_resetActionPerformed

    private void Boton_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_resultadoActionPerformed
        try{
            this.operador_Dos = Float.parseFloat(pantallaInicial.getText());
            switch(el_Operador){
                case "+": this.pantallaInicial.setText(Float.toString(operador_Uno + operador_Dos));
                    break;
                case "-": this.pantallaInicial.setText(Float.toString(operador_Uno - operador_Dos));
                    break;
                case "*": this.pantallaInicial.setText(Float.toString(operador_Uno * operador_Dos));
                    break;
                case "/": this.pantallaInicial.setText(Float.toString(operador_Uno / operador_Dos));
                    break;
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Resultado erroneo, inútil.");
        }       
    }//GEN-LAST:event_Boton_resultadoActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       try{
           this.operador_Uno = Float.parseFloat(pantallaInicial.getText());
           this.el_Operador = "*";
           this.pantallaInicial.setText("");
       }
       catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se puede multiplicar sin operaciones.");
        }  
    }//GEN-LAST:event_jButton17ActionPerformed

    private void boton_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divisionActionPerformed
        try{
           this.operador_Uno = Float.parseFloat(pantallaInicial.getText());
           this.el_Operador = "/";
           this.pantallaInicial.setText("");
           }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se puede dividir sin operaciones");
        }  
    }//GEN-LAST:event_boton_divisionActionPerformed

    private void boton_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_puntoActionPerformed
       if(!(this.pantallaInicial.getText().equals("."))){
            pantallaInicial.setText(pantallaInicial.getText() + ".");
       }
    }//GEN-LAST:event_boton_puntoActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Swing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_resultado;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton boton_division;
    private javax.swing.JButton boton_mas;
    private javax.swing.JButton boton_menos;
    private javax.swing.JButton boton_punto;
    private javax.swing.JButton boton_reset;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel pantallaInicial;
    // End of variables declaration//GEN-END:variables
}
