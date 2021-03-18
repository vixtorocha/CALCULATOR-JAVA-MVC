package calculator;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

  private JTextField firstNumber  = new JTextField(10);
  private JLabel additionLabel = new JLabel("+");
  private JTextField secondNumber = new JTextField(10);
  private JButton calculateButton = new JButton("Calculate");
  private JTextField calcSolution = new JTextField(10);

  private JTextField firstNumberSub = new JTextField(10);
  private JLabel subtractionLabel = new JLabel("-");
  private JTextField secondNumberSub = new JTextField(10);
  private JButton calculateButtonSub = new JButton("Calculate");
  private JTextField calcSolutionSub = new JTextField(10);

  private JTextField firstNumberMultiplication = new JTextField(10);
  private JLabel multiplicationLabel = new JLabel("x");
  private JTextField secondNumberMultiplication = new JTextField(10);
  private JButton calculateButtonMultiplication = new JButton("Calculate");
  private JTextField calcSolutionMultiplication = new JTextField(10);

  private JTextField firstNumberDivision = new JTextField(10);
  private JLabel divisionLabel = new JLabel("÷");
  private JTextField secondNumberDivision = new JTextField(10);
  private JButton calculateButtonDivision = new JButton("Calculate");
  private JTextField calcSolutionDivision = new JTextField(10);

  CalculatorView(){

    // Sets up the view and adds the components

    JPanel calcPanel = new JPanel();

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 200);

    calcPanel.add(firstNumber);
    calcPanel.add(additionLabel);
    calcPanel.add(secondNumber);
    calcPanel.add(calculateButton);
    calcPanel.add(calcSolution);

    calcPanel.add(firstNumberSub);
    calcPanel.add(subtractionLabel);
    calcPanel.add(secondNumberSub);
    calcPanel.add(calculateButtonSub);
    calcPanel.add(calcSolutionSub);

    calcPanel.add(firstNumberMultiplication);
    calcPanel.add(multiplicationLabel);
    calcPanel.add(secondNumberMultiplication);
    calcPanel.add(calculateButtonMultiplication);
    calcPanel.add(calcSolutionMultiplication);

    calcPanel.add(firstNumberDivision);
    calcPanel.add(divisionLabel);
    calcPanel.add(secondNumberDivision);
    calcPanel.add(calculateButtonDivision);
    calcPanel.add(calcSolutionDivision);

    this.add(calcPanel);
  }

  public int getFirstNumber(){
    return Integer.parseInt(firstNumber.getText());
  }

  public int getSecondNumber(){
    return Integer.parseInt(secondNumber.getText());
  }

  public int getCalcSolution(){
    return Integer.parseInt(calcSolution.getText());
  }

  public void setCalcSolution(int solution){
    calcSolution.setText(Integer.toString(solution));
  }

  public int getFirstNumberSub(){
    return Integer.parseInt(firstNumberSub.getText());
  }

  public int getSecondNumberSub(){
    return Integer.parseInt(secondNumberSub.getText());
  }

  public int getCalcSolutionSub(){
    return Integer.parseInt(calcSolutionSub.getText());
  }

  public void setCalcSolutionSub(int solution){
    calcSolutionSub.setText(Integer.toString(solution));
  }

  public int getFirstNumberMulti(){
    return Integer.parseInt(firstNumberMultiplication.getText());
  }

  public int getSecondNumberMulti(){
    return Integer.parseInt(secondNumberMultiplication.getText());
  }

  public int getCalcSolutionMulti(){
    return Integer.parseInt(calcSolutionMultiplication.getText());
  }

  public void setCalcSolutionMultiplication(int calcSolution) {
    calcSolutionMultiplication.setText(Integer.toString(calcSolution));
  }

  public int getFirstNumberDivision(){
    return Integer.parseInt(firstNumberDivision.getText());
  }

  public int getSecondNumberDivision(){
    return Integer.parseInt(secondNumberDivision.getText());
  }

  public int getCalcSolutionDivision(){
    return Integer.parseInt(calcSolutionDivision.getText());
  }

  public void setCalcSolutionDivision(int calcSolution) {
    calcSolutionDivision.setText(Integer.toString(calcSolution));
  }

  // Se o botão de calcular for clicado.

  void addCalculateListener(ActionListener listenForCalcButton){
    calculateButton.addActionListener(listenForCalcButton);
  }

  void subCalculateListener(ActionListener listenForCalcButton){
    calculateButtonSub.addActionListener(listenForCalcButton);
  }

  void multiCalculateListener(ActionListener listenForCalcButton){
    calculateButtonMultiplication.addActionListener(listenForCalcButton);
  }

  void divisionCalculateListener(ActionListener listenForCalcButton){
    calculateButtonDivision.addActionListener(listenForCalcButton);
  }

  // Pop-up com a mensagem de erro.

  void displayErrorMessage(String errorMessage){
    JOptionPane.showMessageDialog(this, errorMessage);
  }

}
