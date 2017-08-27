package level0;

	import java.awt.Dimension;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.image.BufferedImage;
	import java.io.IOException;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.Random;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	import javax.imageio.ImageIO;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;

	public class RockPaperSciors extends JPanel implements ActionListener{
	    Random randy = new Random();
	    JFrame window = new JFrame("Rock Paper Scissors");
	    JButton rockButton = new JButton();
	    JButton paperButton = new JButton();
	    JButton scissorsButton = new JButton();
	    
	    JLabel instructionLabel = new JLabel();
	    
	    BufferedImage rockImage;
	    BufferedImage paperImage;
	    BufferedImage scissorsImage;
	    
	    Dimension buttonDim = new Dimension(300, 200);
	    
	    public void run(){
	        URL url;
	        try {
	            //1. Find a picture of a rock, paper, and scissors on the internet. Replace the URL's below with your images
	            rockImage = ImageIO.read(new URL("http://3.bp.blogspot.com/-KHc70esXncY/T76RN0I7mKI/AAAAAAAAOwg/8xUnLhIcHGU/s1600/key%2Bholder.jpg"));  
	            paperImage = ImageIO.read(new URL("http://braillepaper.com/wp-content/uploads/2014/01/stack-braille-paper.png")); 
	            scissorsImage = ImageIO.read(new URL("https://pptcrafter.files.wordpress.com/2014/09/sciss7.png")); 
	        } catch (MalformedURLException ex) {
	            Logger.getLogger(RockPaperSciors.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IOException ex) {
	            Logger.getLogger(RockPaperSciors.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        rockButton.setIcon(new ImageIcon(rockImage));
	        paperButton.setIcon(new ImageIcon(paperImage));
	        scissorsButton.setIcon(new ImageIcon(scissorsImage));
	        
	        rockButton.addActionListener(this);
	        paperButton.addActionListener(this);
	        scissorsButton.addActionListener(this);
	        
	        rockButton.setPreferredSize(buttonDim);
	        paperButton.setPreferredSize(buttonDim);
	        scissorsButton.setPreferredSize(buttonDim);
	        
	        instructionLabel.setText("Choose Your Weapon!");
	        
	        add(instructionLabel);
	        add(rockButton);
	        add(paperButton);
	        add(scissorsButton);
	        
	        window.add(this);
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setVisible(true);
	        window.pack();
	    }
	    
	    public static void main(String[] args) {
	        new RockPaperSciors().run();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        int selection = 0;
	        //2. Run the program multiple times. Does the computer always choose the same thing?
	        //3. Make oppenentSelection a random number between 0 and 2;
	        Random rock = new Random();
	        int random = rock.nextInt(3);
	        int opponentSelection = rock.nextInt(3);
	        
	        //4. Run the program again. Is the result better?
	        
	        if(e.getSource() == paperButton){
	            selection = 1;
	        }else if(e.getSource() == scissorsButton){
	            selection = 2;
	        }
	        JOptionPane.showMessageDialog(null, "You chose: " + convertSelection(selection) + ".\n"
	                    + "The computer chose: " + convertSelection(opponentSelection) + ".\n");
	        
	        if(selection == opponentSelection){
	            JOptionPane.showMessageDialog(null, "No Winner.  Play again.");
	        }else if((selection == 0 && opponentSelection == 2) || 
	                 (selection == 1 && opponentSelection == 0) ||
	                 (selection == 2 && opponentSelection == 1)){
	            JOptionPane.showMessageDialog(null, "You Win!");
	        }else{
	            JOptionPane.showMessageDialog(null, "You Lose!");
	        }
	    }
	    
	    private String convertSelection(int s){
	        switch(s){
	            case 0: return "ROCK";
	            case 1: return "PAPER";
	            case 2: return "SCISSORS";
	            default: return "";
	        }
	    }
	    
	}

