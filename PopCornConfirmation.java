import java.awt.*;                                                          //Calling the classes that will be used in the program.
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;  


      public class PopCornConfirmation extends JPanel {                                     //Using JPanel class to create the panel popcornconfirmation. 
    
          
    
    private JLabel dateLabel;                                                               //Declaring the labels, textfields and buttons.
    private JTextField dateField;
    
    private JLabel firstNameLabel;
    private JTextField firstNameField;
    
    private JLabel lastNameLabel;
    private JTextField lastNameField;
    
    private JLabel bagsPurchasedLabel;
    private JTextField bagsPurchasedField;
    
    private JLabel drinksPurchasedLabel;
    private JTextField drinksPurchasedField;
    
    private JButton Calculate;
    private JButton Clear;
    private JButton Exit;
    
    
    

    
    
       public PopCornConfirmation() {                           
        
        
        
        dateLabel = new JLabel("Enter today's date:");                  //Setting values to Labels and Textfields.
        dateField = new JTextField(10);
        
        
        
        firstNameLabel = new JLabel("Enter your first name:");
        firstNameField = new JTextField(10);
        
        
        lastNameLabel = new JLabel("Enter your last name:");
        lastNameField = new JTextField(10); 
        
        
        bagsPurchasedLabel = new JLabel("Number of popcorn purchased:");
        bagsPurchasedField = new JTextField(10); 
        
        
        
        drinksPurchasedLabel = new JLabel("Number of drinks purchased:");
        drinksPurchasedField = new JTextField(10); 
        
        

        
        add(dateLabel);                                                             //Adding labels and textfields and buttons to the panel.
        add(dateField);
        
                
        add(firstNameLabel);     
        add(firstNameField);
        
                        
        add(lastNameLabel);     
        add(lastNameField);
        
        add(bagsPurchasedLabel);
        add(bagsPurchasedField);
        
        add(drinksPurchasedLabel);
        add(drinksPurchasedField);
        
        
        
        
        
        setBackground(Color.pink);                                                  //Setting the background of the program.
        setPreferredSize(new Dimension(350,500));                                   //Setting the size of the program.
        
        
        
           
        Calculate = new JButton("Click to get Confiramtion");
        
        Calculate.addActionListener(new CalculateListener());       
        add(Calculate);
        
  
        
        Clear = new JButton("Click to Clear");
        Clear.addActionListener(new ClearListener());        
        add(Clear);
        
        
        
        Exit = new JButton("Click to Exit");
        Exit.addActionListener(new ExitListener());       
        add(Exit);
        
    }
    
    private class CalculateListener implements ActionListener {                                 //Creating an actionlistener for the button calculate.
        
    public void actionPerformed(ActionEvent event) { 
    Random randGen = new Random();                                                              //Objects will be used in the calculate button.
    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
    DecimalFormat fmt2 = new DecimalFormat ("#,###.00");
    
    
    final String vendorId = "101MO";                                                            //Declaring variables.
    final char poundSign = '#';
    final char timeSign = '@';                                        
    int popcornPricePennies = 450;
    int softdrinkPricePennies = 100;
    
    
    
    
    String date = dateField.getText();                                                         //Setting each variable with its textfield input.
    String firstName = firstNameField.getText();
    String lastName = lastNameField.getText(); 
    int randomNumber = randGen.nextInt(4000) + 1000;                                           //Generating random number between 1000 and 3999.                                               
    char firstInitial = firstName.charAt(0);                                                   //First initial.
    
    
                                                                                
    String confirmation = ("POPCORN" + poundSign + lastName + poundSign + firstInitial + poundSign + randomNumber + poundSign + vendorId);       //Creating confirmation.
    
   
    double popCornPriceDollars = (double)popcornPricePennies / 100;                                                             //Converting Popcorn price to dollars.
    
    
    String bagsPurchasedInString = bagsPurchasedField.getText();                                                                //Converting popcorn bags purchased into an int.    
    int bagsPurchased = Integer.parseInt(bagsPurchasedInString);
    
           
    double softdrinkPriceDollars = (double)softdrinkPricePennies / 100;                                                         //Converting Drinks price to dollars.  
    
     
    String drinksPurchasedInString = drinksPurchasedField.getText();                                                            //Converting drinks purchased into an int.                                 //
    int drinksPurchased = Integer.parseInt(drinksPurchasedInString);
      
    
    double total = (bagsPurchased * popCornPriceDollars) + (drinksPurchased * softdrinkPriceDollars);                           //Calculating total.
    
                                                        
    date = date.substring(0, 2) + "-" + date.substring(2,4) + "-" + date.substring (4);                                         //Putting a dash between the date numbers.
    
    
    
    System.out.println("\t" + "**** Mustafa's Best Popcorn! ****\n");                                                           //Printing the full receipt.
    
    System.out.println("Confirmation for " + firstName + " " + lastName + "\n");                                                
    
    System.out.println("Confirmation Number is: " + confirmation + "\n");
    
    System.out.println("Popcorn:\t " + bagsPurchased + " " + timeSign + " " + fmt1.format(popCornPriceDollars) + " " + "each"
    +"\n");
    
    System.out.println("Soft Drinks:\t " + drinksPurchased + " " + timeSign + " " + fmt1.format(softdrinkPriceDollars)
    + " " + "each" + "\n");
    
    System.out.println("TOTAL IS:\t " + "$"+ fmt2.format(total) + "\n");
    
    System.out.println("\t" + "**** Thank you for visiting our shop on: " + date + " ****");
    
    
        
   }
    
 }
    
    private class ClearListener implements ActionListener {                                                             //Creating an actionlistener for clear Button.
        
       public void actionPerformed(ActionEvent event) { 
           
        dateField.setText("");                                                                          //Assigning a blank for each field string if clear button is clicked.
        firstNameField.setText("");
        lastNameField.setText("");
        bagsPurchasedField.setText("");
        drinksPurchasedField.setText("");
        
    
    
   }
 }
 
  private class ExitListener implements ActionListener {                                                            //Creating an actionlistener for the exit button
      
      public void actionPerformed(ActionEvent event) {
          
          System.exit(0);                                                                                           //Exits if exit button is clicked.
 
 
 
  }

 }
}
