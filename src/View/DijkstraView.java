/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CityController;
import Controller.DijkstraMethodController;
import Controller.DistanceController;
import Model.City;
import Model.DijkstraOutPut;
import Model.Distance;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Poshitha_Ravindu
 */
public class DijkstraView extends javax.swing.JFrame {

    ArrayList<Distance> distanceList = new ArrayList();
    ArrayList<City> cityList = new ArrayList();
    DijkstraOutPut output = new DijkstraOutPut();
    int startIndex = -1;
    int endIndex = -1;
    int distanceData[][] = null;
    /**
     * Creates new form DijkstraView
     */
    public DijkstraView() {
        initComponents();
        loadItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        startCmb = new javax.swing.JComboBox<>();
        endCmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalDistanceTxt = new javax.swing.JLabel();
        findpathBtn = new javax.swing.JToggleButton();
        pathTxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Find the shortest path");

        startCmb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City" }));
        startCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startCmbActionPerformed(evt);
            }
        });

        endCmb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        endCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City" }));
        endCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endCmbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Start City");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("End City");

        totalDistanceTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        findpathBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        findpathBtn.setText("Find Shortest Path");
        findpathBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findpathBtnActionPerformed(evt);
            }
        });

        pathTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Path to the Destination");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total Distance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(startCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalDistanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(endCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(findpathBtn)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pathTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findpathBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalDistanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pathTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(186, 186, 186))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startCmbActionPerformed
        // TODO add your handling code here:
        
        startIndex = this.getSelectedCityinCmb(startCmb);
    }//GEN-LAST:event_startCmbActionPerformed

    private void endCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endCmbActionPerformed
        // TODO add your handling code here:
         endIndex = this.getSelectedCityinCmb(endCmb);
    }//GEN-LAST:event_endCmbActionPerformed

    private void findpathBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findpathBtnActionPerformed
        // TODO add your handling code here:
        
        if(startIndex == endIndex){
            JOptionPane.showMessageDialog(this, "Same city can't enter", "Error.", JOptionPane.ERROR_MESSAGE);  
        }else if(startIndex == -1 || endIndex == -1){
             JOptionPane.showMessageDialog(this, "Select the start and the end destinations", "Error.", JOptionPane.ERROR_MESSAGE); 
        }else{
           
        output = DijkstraMethodController.dijkstra(distanceData, startIndex,endIndex);
        String pathNames = "";
            String[] split = output.getPath().split("");
            for(int x =0;x<split.length;x++){
                
                if( x < split.length -1 ){
                    int i = Integer.parseInt(split[x]);
                pathNames += cityList.get(Integer.parseInt(split[x])).getCityName()+" ---> ";
                }else if(x == split.length -1 ){
                     pathNames += cityList.get(Integer.parseInt(split[x])).getCityName();
                }
            }
            
        pathTxt.setText(pathNames);
        totalDistanceTxt.setText(String.valueOf(output.getTotalDistance()));
        
        }
    }//GEN-LAST:event_findpathBtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        new DistanceDetailFrame().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DijkstraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DijkstraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DijkstraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DijkstraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DijkstraView().setVisible(true);
//            }
//        });
//    }
    
    public void loadItems(){
        distanceList = DistanceController.getAllDistances();
        cityList = CityController.getAllCitiesExists();
        for(City a:cityList)
        System.out.println(a.getCityName());
        
        distanceData = getDistanceToArray(distanceList,cityList);
        System.out.print("{");
        System.out.println("");
        for(int a=0;a<distanceData.length;a++){
            System.out.print("{");
            for(int b=0;b<distanceData.length;b++){
            System.out.print(distanceData[a][b]+" ");
            }
            System.out.print("}");
            System.out.println(" ");
        }
        System.out.print("}");
        
        
        
        for(City city:cityList){
            startCmb.addItem(city.getCityName());
            endCmb.addItem(city.getCityName());
        }
    }
    
    public int[][] getDistanceToArray(ArrayList<Distance> distances,ArrayList<City> cities){
        
        int [][] distancesData = new int[cities.size()][cities.size()];
        
        for(int x=0;x < cities.size();x++){
            City rowCity = cities.get(x);
             for(int y=0;y < cities.size();y++){
                City colmnCity = cities.get(y);
                 int data = 0;
                 
                 if(x<y){
                     
                     for(Distance d:distances){
                         if(d.getFirstCityId() == rowCity.getCityID() && d.getSecCityId()== colmnCity.getCityID()){
                                                     
                                 data = (int) d.getDistance();
                         }
                        
                     }
                     distancesData[x][y] =  data; 
                 }else if(x>y){
                     
                      distancesData[x][y] = distancesData[y][x];
                 }else{
                     distancesData[x][y] =  data;
                 }
                 
                 
                 
                

            }
        }

        return distancesData;
    }
    
     public int getSelectedCityinCmb(JComboBox<String> cmb){
       int index = 0;
        String key = cmb.getSelectedItem().toString();
        for(City city:cityList){
            
            if(city.getCityName().equals(key)){
                return index;
            }
            index+=1;
        }
        return 0;  
    }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> endCmb;
    private javax.swing.JToggleButton findpathBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel pathTxt;
    private javax.swing.JComboBox<String> startCmb;
    private javax.swing.JLabel totalDistanceTxt;
    // End of variables declaration//GEN-END:variables
}