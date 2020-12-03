
package GUI;

import Logica.GameState;
import Logica.Jugador;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;



public class Tablerito extends javax.swing.JFrame {

    AccionesGUI Acciones;         
    TableroUI tab;
    
    GameState state;
    Jugador ClientPlayer;

    public Tablerito(AccionesGUI Acciones) {
        //this.cantidadAPag = cantidadApag;
        //this.players = players;
        initComponents();
        
        
        this.Acciones = Acciones;

        TableroUI t = new TableroUI(fichas());
        t.setBounds(250, 150, 500, 470);
        this.add(t);
        tab = t;

    }
    
    // Manejar Juego GUI
    public void RefreshGameState(GameState state, Jugador ClientPlayer){
        this.state = state;
        this.ClientPlayer = ClientPlayer;
        
        setPlayersInfo();
        tab.Refresh(state);
        
        
    }
    
    private void setPlayersInfo() {
        if (state.players.length >= 1 ) {
            lblJugador1.setText(state.players[0].Nombre);
            lblMonto1.setText(state.players[0].cantidad + "");
        }

        if (state.players.length >= 2) {
            lblJugador2.setText(state.players[1].Nombre);
            lblMonto2.setText(state.players[1].cantidad + "");
        }

        if (state.players.length >= 3) {
            lblJugador3.setText(state.players[2].Nombre);
            lblMonto3.setText(state.players[2].cantidad + "");
        }

        if (state.players.length >= 4) {
            lblJugador4.setText(state.players[3].Nombre);
            lblMonto4.setText(state.players[3].cantidad + "");
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJugador1 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lblJugador3 = new javax.swing.JLabel();
        lblJugador4 = new javax.swing.JLabel();
        lblMonto1 = new javax.swing.JLabel();
        lblMonto2 = new javax.swing.JLabel();
        lblMonto3 = new javax.swing.JLabel();
        lblMonto4 = new javax.swing.JLabel();
        btnTerminarTurno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lblJugador1.setText("Jugador1");

        lblJugador2.setText("Jugador2");

        lblJugador3.setText("Jugador3");

        lblJugador4.setText("Jugador4");

        lblMonto1.setText("Monto1");

        lblMonto2.setText("Monto2");

        lblMonto3.setText("Monto3");

        lblMonto4.setText("Monto4");

        btnTerminarTurno.setText("Terminar turno");
        btnTerminarTurno.setEnabled(false);
        btnTerminarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jButton1.setText("Lanzar Cañas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(581, 581, 581)
                .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(546, 546, 546)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblMonto1)
                .addGap(683, 683, 683)
                .addComponent(lblMonto2))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(602, 602, 602)
                .addComponent(lblJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblMonto3)
                .addGap(683, 683, 683)
                .addComponent(lblMonto4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(btnTerminarTurno))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJugador2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblMonto1))
                    .addComponent(lblMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(349, 349, 349)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJugador3)
                    .addComponent(lblJugador4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMonto3)
                            .addComponent(lblMonto4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnTerminarTurno)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection elString = new StringSelection(evt.getX() + ", " + evt.getY());
        clip.setContents(elString, null);
        System.out.println("a.addPoint(" + evt.getX() + "," + evt.getY() + ");");

    }//GEN-LAST:event_formMouseClicked

    private void btnTerminarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarTurnoActionPerformed

        jButton1.setEnabled(true);
        
        btnTerminarTurno.setEnabled(false);


    }//GEN-LAST:event_btnTerminarTurnoActionPerformed
   

    public int[][] fichas() {
        int ox = 282;
        int oy = 156;
        int fich[][] = new int[][]{{314, 573}, {337, 551}, {355, 535}, {370, 520}, {393, 499}, {420, 472}, {448, 444}, {473, 418}, {498, 393}, {520, 417}, {548, 445}, {574, 471}, {600, 498}, {627, 520}, {638, 539}, {656, 554},
        {682, 573}, {701, 554}, {680, 528}, {665, 510}, {648, 497}, {625, 475}, {600, 448}, {571, 421}, {544, 393}, {521, 370}, {545, 345}, {572, 319}, {599, 291}, {625, 265}, {650, 240}, {673, 227}, {684, 208}, {703, 184},
        {680, 165}, {660, 185}, {642, 195}, {629, 215}, {603, 240}, {575, 268}, {548, 295}, {520, 322}, {497, 345}, {475, 324}, {449, 297}, {422, 270}, {393, 242}, {368, 218}, {353, 197}, {336, 185}, {315, 166}, {292, 185},
        {313, 206}, {325, 225}, {344, 239}, {368, 263}, {395, 291}, {423, 318}, {449, 345}, {473, 370}, {450, 393}, {423, 420}, {396, 446}, {368, 474}, {346, 499}, {327, 508}, {314, 530}, {291, 554}};

        for (int i = 0; i < fich.length; i++) {
            fich[i][0] -= ox;
            fich[i][1] -= oy;
        }

        return fich;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminarTurno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblJugador4;
    private javax.swing.JLabel lblMonto1;
    private javax.swing.JLabel lblMonto2;
    private javax.swing.JLabel lblMonto3;
    private javax.swing.JLabel lblMonto4;
    // End of variables declaration//GEN-END:variables
}
