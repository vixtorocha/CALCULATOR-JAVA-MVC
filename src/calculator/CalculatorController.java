package calculator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {

  private CalculatorView view;
  private CalculatorModel model;

  public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
    this.view = theView;
    this.model = theModel;

    this.view.addCalculateListener(new AdditionListener());
    this.view.subCalculateListener(new SubtractionListener());
    this.view.multiCalculateListener(new MultiplicationListener());
    this.view.divisionCalculateListener(new DivisionListener());
  }


  class AdditionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      int firstNumber, secondNumber = 0;

      try{
        firstNumber = view.getFirstNumber();
        secondNumber = view.getSecondNumber();

        model.addTwoNumbers(firstNumber, secondNumber);

        view.setCalcSolution(model.getAddResult());
      }

      catch(NumberFormatException ex){
        System.out.println(ex);

        view.displayErrorMessage("É necessário informar dois números");
      }
    }
  }


  class SubtractionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      int firstNumber2, secondNumber2 = 0;

      try{
        firstNumber2 = view.getFirstNumberSub();
        secondNumber2 = view.getSecondNumberSub();

        model.subTwoNumbers(firstNumber2, secondNumber2);

        view.setCalcSolutionSub(model.getSubResult());
      }

      catch(NumberFormatException ex){
        System.out.println(ex);

        view.displayErrorMessage("É necessário informar dois números");
      }
    }
  }

  class MultiplicationListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      int firstNumber3, secondNumber3 = 0;

      try{
        firstNumber3 = view.getFirstNumberMulti();
        secondNumber3 = view.getSecondNumberMulti();

        model.multiplyTwoNumbers(firstNumber3, secondNumber3);

        view.setCalcSolutionMultiplication(model.getMultiResult());
      }

      catch(NumberFormatException ex){
        System.out.println(ex);

        view.displayErrorMessage("É necessário informar dois números");
      }
    }
  }

  class DivisionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      int firstNumber4, secondNumber4 = 0;

      try{
        firstNumber4 = view.getFirstNumberDivision();
        secondNumber4 = view.getSecondNumberDivision();

        model.divideTwoNumbers(firstNumber4, secondNumber4);

        view.setCalcSolutionDivision(model.getDivisionResult());
      }

      catch(NumberFormatException ex){
        System.out.println(ex);

        view.displayErrorMessage("É necessário informar dois números");
      }
    }
  }
}
