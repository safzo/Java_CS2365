//Grant Hall and Safwan Hasan(me)
//R11547156(my R number)
//G18
//Q0

import java.util.Scanner;

import javax.swing.JOptionPane;
class DiningTable{
  private float fWeight,fLength,fWidth,fCost;
  //Get functions
  public float getWeight(){
    return fWeight;
  }
  public float getLength(){
    return fLength;
  }
  public float getWidth(){
    return fWidth;
  }
  public float getCost(){
    return fCost;
  }
  //Set functions
  private void setWeight(float fWeight){
    this.fWeight = fWeight;
  }
  private void setLength(float fLength){
    this.fLength = fLength;
  }
  private void setWidth(float fWidth){
    this.fWidth = fWidth;
  }
  private void setCost(){
    this.fCost = (fWeight*fLength*fWidth);
  }
  //call for user input on weight, length, width
  
  public void DiningTable(){
	JOptionPane pane = new JOptionPane();
    float fWeight,fLength,fWidth;
    String str = new String();
    //user inputs for weight, length, and float
    while(true){
      str = JOptionPane.showInputDialog("Enter Weight:");
      try {
    	  fWeight = Float.parseFloat(str);
    	  if (fWeight > 0.0 && fWeight < 20.0){
    	        break;
    	      }
    	      else{
    	    	  pane.showMessageDialog(null, "Error, Weight needs to be between 0.0 and 20.0");
    	      }
      }
      catch (Exception e) {
    	  pane.showMessageDialog(null, "Error, Weight needs to be a floating point number");
      }
    }
    while(true){
        str = JOptionPane.showInputDialog("Enter Length:");
        try {
      	  fLength = Float.parseFloat(str);
      	  if (fLength > 0.0 && fLength < 20.0){
            break;
          }
          else{
        	  pane.showMessageDialog(null, "Error, Length needs to be between 0.0 and 20.0");
          }
        }
        catch (Exception e) {
        	  pane.showMessageDialog(null, "Error, Length needs to be a floating point number");
        }
    }
    while(true){
        str = JOptionPane.showInputDialog("Enter Width:");
        try {
      	  fWidth = Float.parseFloat(str);
      	  if (fWidth > 0.0 && fWidth < 20.0){
            break;
          }
          else{
        	  pane.showMessageDialog(null, "Error, Width needs to be between 0.0 and 20.0");
          }
        }
        catch (Exception e) {
      	  pane.showMessageDialog(null, "Error, Width needs to be a floating point number");
        }
      }
    //entering user inputs and calculating cost
    setWeight(fWeight);
    setLength(fLength);
    setWidth(fWidth);
    setCost();
  }
  //calc functions
  float calcArea(){
    return (fLength*fWidth);
  }
  float calcPerimeter(){
    return ((fLength*2)+(fWidth*2));
  }
}