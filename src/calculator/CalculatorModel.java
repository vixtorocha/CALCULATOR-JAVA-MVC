package calculator;

public class CalculatorModel {

  private int addResult, subResult, multiResult, divisionResult;

  public void addTwoNumbers(int firstNumber, int secondNumber){
    addResult = firstNumber + secondNumber;
  }

  public void subTwoNumbers(int firstNumber, int secondNumber){
    subResult = firstNumber - secondNumber;
  }

  public void multiplyTwoNumbers(int firstNumber, int secondNumber){
    multiResult = firstNumber * secondNumber;
  }

  public void divideTwoNumbers(int firstNumber, int secondNumber){
    if (secondNumber == 0){
      throw new ArithmeticException("Não é possível dividir por zero.");
    }
    divisionResult = firstNumber / secondNumber;
  }

  public int getAddResult(){
    return addResult;
  }

  public int getSubResult(){
    return subResult;
  }

  public int getMultiResult() {
    return multiResult;
  }

  public int getDivisionResult() {
    return divisionResult;
  }
}
