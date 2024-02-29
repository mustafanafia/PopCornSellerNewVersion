//Name:             Mustafa Mohammednafia
//Instructor:       Cindy Tucker
//Date:             12/3/2018
//Subject:          GUI


import javax.swing.JFrame;                      //importing the swing class.


public class PopCornProgram {                   //Creating the class in which will be used to create frame and panel.
    
    public static void main(String[] args){
      

      
     
      JFrame frame = new JFrame ("POPCORN PROGRAM");                            //Creating the frame.
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                     //Set the exit on close.
      
      
      
      PopCornConfirmation panel = new PopCornConfirmation();                    //Creating the panel.
      
      frame.getContentPane().add(panel);                                        //Adding the contents of panel inside the frame.
      
      
      
      
      frame.pack();
      frame.setVisible(true);                                                   //Making the frame visible.
    }
          
}

    
   
        
        
        


      
      
      
     
   

