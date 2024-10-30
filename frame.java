package com.mycompany.bdowithdrawal;

import javax.swing.*;

class frame {
    // Date of Withdrawal
    public int date = 7; 
    public int month = 10; 
    public int year = 24;
    
    // Additional Info
    public String location = "SMCITYLIPA";
    public int terminalId = 102084;
    public long cardNo = 1234567891234567L;
    public String appLabel = "BDO VISA DEBIT";
    
    // Balances
    public double currentBal = 3500.00;
    public double previousBal = 3500.00;
    
    public String reciept;

    public frame() {
        updateReceipt(); // Initialize receipt
    }
    
    public void updateReceipt() {
        reciept = """
                     ------------------------------------------------------------------------
                                     BDO TRANSACTION RECORD
                     Date: """ + date + " " + month + " " + year + "\n" +
                    "Location: " + location + "\n" + 
                    "Terminal ID: " + terminalId + "\n" + 
                    "Card NO. " + cardNo + "\n" + 
                    "Application Label: " + appLabel + "\n" + "\n" +
                    "Previous Balance: " + previousBal + "\n" + 
                    "Current Balance: " + currentBal + "\n" + 
                    "------------------------------------------------------------------------";
    }
    public void Frame() {
        JFrame f = new JFrame();
        
        //frame size
        f.setSize(350,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Text area
        JTextArea textArea = new JTextArea();
        textArea.setText(reciept);
        textArea.setEditable(false); // Make it read-only
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        // Wrap the JTextArea in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        f.add(scrollPane); // Add the scroll pane to the frame
        
        f.setVisible(true);
    } 

}
