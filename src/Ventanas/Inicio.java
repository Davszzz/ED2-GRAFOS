package Ventanas;

import Clases.DatosGraficos;
import Clases.PintanrDibujos;
import Clases.AlgoritmoDijkstra;
import Controllers.UsuarioController;
import Models.Usuario;
import static Ventanas.InicioSesion.contraseña;
import static Ventanas.InicioSesion.texto;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose H Elel
 */
public class Inicio extends javax.swing.JFrame {
    private UsuarioController uController = new UsuarioController();
    

    private int Numerotope = 0;//Numero de nodos 
    
    DatosGraficos arboles = new DatosGraficos();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public Inicio() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
        this.labelusu.setText(texto);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarCaminos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        colorOrigen = new javax.swing.JLabel();
        txtColorOrigen = new javax.swing.JLabel();
        colorDestino = new javax.swing.JLabel();
        txtColorDestino = new javax.swing.JLabel();
        colorNodoVisitado = new javax.swing.JLabel();
        txtColorNodoRecorrido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EleccionDestino = new javax.swing.JComboBox<>();
        BuscarCamino = new javax.swing.JButton();
        EleccionOrigen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        txtDestino = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        kmRecorridos1 = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        labelusu = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();
        kmRecorridos2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarCaminos.setBackground(new java.awt.Color(204, 204, 204));
        MostrarCaminos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarCaminos.setForeground(new java.awt.Color(0, 0, 204));
        MostrarCaminos.setText("MOSTRAR GRAFO");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 220, 50));

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorOrigen.setBackground(new java.awt.Color(255, 0, 0));
        colorOrigen.setOpaque(true);
        jPanel1.add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 20, 20));

        txtColorOrigen.setBackground(new java.awt.Color(0, 153, 51));
        txtColorOrigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtColorOrigen.setText("Origen--------------->");
        txtColorOrigen.setOpaque(true);
        jPanel1.add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        colorDestino.setBackground(new java.awt.Color(51, 255, 51));
        colorDestino.setOpaque(true);
        jPanel1.add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 20, 20));

        txtColorDestino.setBackground(new java.awt.Color(0, 153, 51));
        txtColorDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtColorDestino.setText("Destino-------------->");
        txtColorDestino.setOpaque(true);
        jPanel1.add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 30));

        colorNodoVisitado.setBackground(new java.awt.Color(0, 51, 255));
        colorNodoVisitado.setOpaque(true);
        jPanel1.add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 20, 20));

        txtColorNodoRecorrido.setBackground(new java.awt.Color(0, 153, 51));
        txtColorNodoRecorrido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorNodoRecorrido.setForeground(new java.awt.Color(255, 255, 255));
        txtColorNodoRecorrido.setText("Nodo Recorrido ---->");
        txtColorNodoRecorrido.setOpaque(true);
        jPanel1.add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\esali\\Downloads\\Peru2.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 500, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 830, 720));

        EleccionDestino.setBackground(java.awt.SystemColor.activeCaptionBorder);
        EleccionDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(0, 0, 153));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Áncash", "Apurímac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huánuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 460, 50));

        BuscarCamino.setBackground(java.awt.SystemColor.activeCaptionBorder);
        BuscarCamino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BuscarCamino.setForeground(new java.awt.Color(51, 0, 204));
        BuscarCamino.setText("Buscar Camino mas corto");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 300, 60));

        EleccionOrigen.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        EleccionOrigen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(0, 0, 153));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Áncash", "Apurímac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huánuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 460, 50));

        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 500, 140));

        txtDestino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("SELECCIONE EL PUNTO DE LLEGADA:");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 480, 40));

        kmRecorridos.setBackground(new java.awt.Color(0, 153, 51));
        kmRecorridos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 390, 40));

        txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("SELECCIONE EL PUNTO DE PARTIDA: ");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 480, 40));

        kmRecorridos1.setBackground(new java.awt.Color(0, 153, 51));
        kmRecorridos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos1.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos1.setOpaque(true);
        getContentPane().add(kmRecorridos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 140, 40));

        LateralSuperior.setBackground(new java.awt.Color(0, 153, 51));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 720));

        labelusu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelusu.setForeground(new java.awt.Color(255, 255, 255));
        labelusu.setText("*");
        getContentPane().add(labelusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 140, 30));

        LateralSuperior1.setBackground(new java.awt.Color(0, 153, 51));
        LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior1.setOpaque(true);
        getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 560, 60));

        LateralSuperior2.setBackground(new java.awt.Color(0, 153, 51));
        LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(255, 255, 255));
        LateralSuperior2.setText("                            Bienvenido al sistema");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 40));

        kmRecorridos2.setBackground(new java.awt.Color(0, 153, 51));
        kmRecorridos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos2.setForeground(new java.awt.Color(255, 255, 255));
        kmRecorridos2.setText("                         Kilometros recorridos:");
        kmRecorridos2.setOpaque(true);
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 510, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\esali\\Downloads\\ola123.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());
        
        int Matriz[][] = {
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
            {1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0},
        };


        double coe[][] = {
            {0, 0, 0, 0, 0, 232, 0, 0, 0, 0, 0, 0, 339, 0, 0, 443, 0, 0, 0, 0, 0, 276, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 160, 0, 0, 165, 0, 308, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0,0,0,310,157,0,0,134,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,310,0,461,0,0,323,0,0,521,0,0,0,0,0,0,91,0,0,173,0,0,0,0},
            {0,0,157,461,0,0,0,247,92,0,192,237,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {232,0,0,0,0,0,0,0,0,0,0,0,109,173,0,0,0,0,0,320,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,0,0,0,0,0,0,0,0,0,0},
            {0,0,134,323,247,0,0,0,0,0,0,440,0,0,0,0,233,0,0,0,332,0,0,0,638},
            {0,0,0,0,92,0,0,0,0,0,165,166,0,0,238,0,0,0,0,0,0,0,0,0,0},
            {0,160,0,0,0,0,0,0,0,0,0,0,316,0,250,672,0,0,132,0,0,306,0,0,250},
            {0,0,0,521,192,0,0,0,165,0,0,0,0,0,264,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,237,0,0,440,166,0,0,0,0,0,200,0,0,0,101,0,0,0,0,0,338},
            {339,165,0,0,0,109,0,0,0,316,0,0,0,244,0,0,0,0,0,0,0,207,0,0,0},
            {0,0,0,0,0,173,0,0,0,0,0,0,244,0,0,0,0,0,0,163,0,0,0,0,0},
            {0,308,0,0,0,0,11,0,238,250,264,200,0,0,0,0,0,0,271,0,0,0,0,0,0},
            {443,0,0,0,0,0,0,0,0,672,0,0,0,0,0,0,0,0,0,0,0,442,0,0,464},
            {0,0,0,0,0,0,0,233,0,0,0,0,0,0,0,0,0,0,0,0,461,0,0,0,558},
            {0,0,0,91,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,147,0,140,0,0},
            {0,0,0,0,0,0,0,0,0,132,0,101,0,0,271,0,0,0,0,0,0,0,0,0,362},
            {0,0,0,0,0,320,0,0,0,0,0,0,0,163,0,0,0,0,0,0,0,0,0,183,0},
            {0,0,0,173,0,0,0,332,0,0,0,0,0,0,0,0,461,147,0,0,0,0,242,0,0},
            {276,0,0,0,0,0,0,0,0,306,0,0,207,0,0,442,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,140,0,0,242,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0},
            {0,0,0,0,0,0,0,638,0,250,0,338,0,0,0,464,558,0,362,0,0,0,0,0,0}, };
        

        int xx1[] = {355, 370, 540, 600, 495, 330, 390, 540, 470, 420, 450, 490, 370, 290, 420, 600, 650, 610, 440, 270, 650, 410, 650, 250, 520, 0};
        int yy1[] = {190, 365, 510, 590, 510, 250, 450, 430, 470, 350, 550, 430, 300, 250, 460, 150, 450, 630, 390, 200, 550, 270, 650, 150, 350, 0};
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"};
      
        for (int j = 0; j < 25; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 25; j++) {
            for (int k = 0; k < 25; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        Numerotope = 25;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 0, destino = 0;
        double precio=0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();
        
        Usuario objlogin = uController.obtenerObjeto(texto, contraseña);
        
        if(objlogin.getCodc()==1)
        {
            precio = 0.20;
        }
        else if(objlogin.getCodc()==2)
        {
            precio = 0.25;
        }
        else if(objlogin.getCodc()==3)
        {
            precio = 0.30;
        }

        if ("Amazonas".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("Áncash".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Apurímac".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Arequipa".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Ayacucho".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("Cajamarca".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("Callao".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("Cusco".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("Huancavelica".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Huánuco".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("Ica".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("Junín".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("La Libertad".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("Lambayeque".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("Lima".equals(nombreOrigen)) {
            origen = 14;
        }
        if ("Loreto".equals(nombreOrigen)) {
            origen = 15;
        }
        if ("Madre de Dios".equals(nombreOrigen)) {
            origen = 16;
        }
        if ("Moquegua".equals(nombreOrigen)) {
            origen = 17;
        }
        if ("Pasco".equals(nombreOrigen)) {
            origen = 18;
        }
        if ("Piura".equals(nombreOrigen)) {
            origen = 19;
        }
        if ("Puno".equals(nombreOrigen)) {
            origen = 20;
        }
        if ("San Martín".equals(nombreOrigen)) {
            origen = 21;
        }
        if("Tacna".equals(nombreOrigen)){
            origen = 22;
        }
        if("Tumbes".equals(nombreOrigen))
        {
            origen = 23;
        }
        if("Ucayali".equals(nombreOrigen))
        {
            origen = 24;
        }
        
        if ("Amazonas".equals(nombreDestino)) {
            destino = 0;
        }
        if ("Áncash".equals(nombreDestino)) {
            destino = 1;
        }
        if ("Apurímac".equals(nombreDestino)) {
            destino = 2;
        }
        if ("Arequipa".equals(nombreDestino)) {
            destino = 3;
        }
        if ("Ayacucho".equals(nombreDestino)) {
            destino = 4;
        }
        if ("Cajamarca".equals(nombreDestino)) {
            destino = 5;
        }
        if ("Callao".equals(nombreDestino)) {
            destino = 6;
        }
        if ("Cusco".equals(nombreDestino)) {
            destino = 7;
        }
        if ("Huancavelica".equals(nombreDestino)) {
            destino = 8;
        }
        if ("Huánuco".equals(nombreDestino)) {
            destino = 9;
        }
        if ("Ica".equals(nombreDestino)) {
            destino = 10;
        }
        if ("Junín".equals(nombreDestino)) {
            destino = 11;
        }
        if ("La Libertad".equals(nombreDestino)) {
            destino = 12;
        }
        if ("Lambayeque".equals(nombreDestino)) {
            destino = 13;
        }
        if ("Lima".equals(nombreDestino)) {
            destino = 14;
        }
        if ("Loreto".equals(nombreDestino)) {
            destino = 15;
        }
        if ("Madre de Dios".equals(nombreDestino)) {
            destino = 16;
        }
        if ("Moquegua".equals(nombreDestino)) {
            destino = 17;
        }
        if ("Pasco".equals(nombreDestino)) {
            destino = 18;
        }
        if ("Piura".equals(nombreDestino)) {
            destino = 19;
        }
        if ("Puno".equals(nombreDestino)) {
            destino = 20;
        }
        if ("San Martín".equals(nombreDestino)) {
            destino = 21;
        }
        if("Tacna".equals(nombreDestino)){
            destino = 22;
        }
        if("Tumbes".equals(nombreDestino))
        {
            destino = 23;
        }
        if("Ucayali".equals(nombreDestino))
        {
            destino = 24;
        }

        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
            txtKMAcumulados.setText("Intenta de nuevo!!");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();
            Dijkstra.getNombre();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("Señor si usted quiere llegar a: " + nombreDestino + " debera seguir la siguiente ruta: \n" );
            for(int i= Dijkstra.imprimirNodosRecorridos().size() -1; i>=0; i--)//Listar el arreglo desde el ultimo
            {  
                    txtKMAcumulados.append(Dijkstra.imprimirNodosRecorridos().get(i) + "->\n");
                
                
            }
            txtKMAcumulados.append(nombreDestino + "\n");
            txtKMAcumulados.append("Precio estimado del viaje: " + (Dijkstra.getAcumulado() * precio));
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);
            
            kmRecorridos.setText(Dijkstra.getAcumulado() + " KM");
        }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior1;
    private javax.swing.JLabel LateralSuperior2;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel colorDestino;
    private javax.swing.JLabel colorNodoVisitado;
    private javax.swing.JLabel colorOrigen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos1;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel labelusu;
    private javax.swing.JLabel txtColorDestino;
    private javax.swing.JLabel txtColorNodoRecorrido;
    private javax.swing.JLabel txtColorOrigen;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
