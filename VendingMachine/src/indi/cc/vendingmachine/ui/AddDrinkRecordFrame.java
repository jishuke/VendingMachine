package indi.cc.vendingmachine.ui;

import indi.cc.vendingmachine.bean.AddDrinkRecords;
import indi.cc.vendingmachine.model.AddDrinkRecordsModel;
import indi.cc.vendingmachine.util.WindowUtil;

import javax.swing.JDialog;

//�������ϼ�¼����
public class AddDrinkRecordFrame extends javax.swing.JDialog {

	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTable jTable1;
	    private JDialog jd;
             
	    /**
		 * 
		 * @param owner ���ĸ�����
		 * @param title ������
		 * @param modal ָ����ģʽ���ڣ����з�ģʽ����
		 */
		public AddDrinkRecordFrame(JDialog owner, String title, boolean modal){
	    	super(owner, title, modal);
			  initComponents();
			  WindowUtil.setFrameCenter(this);
		        this.setResizable(false);
		        this.setVisible(true);
		}
    private void initComponents() {
    	this.jd = this;
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
    
       //�������ϲ����¼ģ��
        AddDrinkRecordsModel model = new AddDrinkRecordsModel(jd);
        jTable1.setModel(model);//��������ģ��
        
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
       
        jScrollPane1.setViewportView(jTable1);

    
       
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }          
                  
}