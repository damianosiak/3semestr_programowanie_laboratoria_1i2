package com.damianosiak.Controller;
import com.damianosiak.Model.Number;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This class is responsible for various calculation methods
 */
public class Calculations {
    private Vector<Long> history = new Vector<Long>(); /** This vector is containing all history of results - in long variable system
     * @return*/
    public Vector<Long> getHistoryVector(){
        return history;
    }

    /**
     * This method is responsible for getting history of results.
     * getHistory method is using foreach loop with "history" named vector variable and displaying result as one line output
     */
    public void getHistory(){
        String historyOneLineValue="History: ";
        for(Long temp : history){
            historyOneLineValue+=temp+", ";
        }
        System.out.println(historyOneLineValue);
    }

    /**
     * This method is responsible for multiplication calculation.
     * "multiplication" named method have two input parameters in "Long" variable system
     * After call this method, new "Number" object is creating with these same input parameters
     * The result of calculation is saving to history and return as "Long"
     * @param numberA
     * @param numberB
     * @return
     */
    public Long multiplication(Long numberA, Long numberB){
        Number number = new Number(numberA,numberB);
        Long multiplicationValue = number.getNumberA()*number.getNumberB();
        number.setMultiplicationValue(multiplicationValue);
        history.add(multiplicationValue);
        return multiplicationValue;
    }

    /**
     * This method is responsible for addition calculation.
     * "addition" named method have two input parameters in "Long" variable system
     * After call this method, new "Number" object is creating with these same input parameters
     * The result of calculation is saving to history and return as "Long"
     * @param numberA
     * @param numberB
     * @return
     */
    public Long addition(Long numberA, Long numberB){
        Number number = new Number(numberA,numberB);
        Long additionValue = number.getNumberA()+number.getNumberB();
        number.setAdditionValue(additionValue);
        history.add(additionValue);
        return additionValue;
    }

    /**
     * This method is responsible for subtraction calculation.
     * "subtraction" named method have two input parameters in "Long" variable system
     * After call this method, new "Number" object is creating with these same input parameters
     * The result of calculation is saving to history and return as "Long"
     * @param numberA
     * @param numberB
     * @return
     */
    public Long subtraction(Long numberA, Long numberB){
        Number number = new Number(numberA,numberB);
        Long subtractionValue = number.getNumberA()-number.getNumberB();
        number.setMultiplicationValue(subtractionValue);
        history.add(subtractionValue);
        return subtractionValue;
    }

    /**
     * This method is responsible for exponentiation calculation with Lambda in specially created for this new thread
     * "exponentiation" named method have two input parameters in "Long" variable system
     * After call this method, new "Number" object is creating with these same input parameters
     * This method is using also "AtomicReference" model and containing own exception
     * The result of calculation is saving to history and return as "Long"
     * @param numberA
     * @param numberB
     * @return
     */
    public Long exponentiation(Long numberA, Long numberB){
        AtomicReference<Long> exponentiationValue = new AtomicReference<>();
        Thread thread = new Thread(() -> {
            exponentiationValue.set((long) Math.pow(numberA,numberB));
        });
        thread.start();
        try{
            thread.join();
        }catch(InterruptedException e){
            System.out.println("Error in new thread");
        }
        Number number = new Number(numberA,numberB);
        number.setExponentiationValue(exponentiationValue.get());
        history.add(exponentiationValue.get());
        return exponentiationValue.get();
    }


}
