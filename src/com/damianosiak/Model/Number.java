package com.damianosiak.Model;


/**
 * This class is responsible for containing variables related to "Number" named model
 */
public class Number {
    private Long numberA; /** This variable is containing first application input parameter */
    private Long numberB; /** This variable is containing second application input parameter */
    private Long additionValue; /** This variable is containing addition calculation method return value */
    private Long subtractionValue; /** This variable is containing addition calculation function return value */
    private Long multiplicationValue; /** This variable is containing multiplication calculation function return value */
    private Long divisionValue; /** This variable is containing division calculation function return value */
    private Long exponentiationValue; /** This variable is containing exponentiation calculation function return value */
    private Team team; /** This variable is containing this model chosen team */

    /**
     * This enum named "Team" is containing three teams with specific team motto
     * Enum containing constructor and get team motto method
     */
    public enum Team{
        RED("Roses are red"),
        GREEN("Grass is green"),
        BLUE("Sky is blue");

        private String teamMotto;

        Team(String teamMotto){
            this.teamMotto=teamMotto;
        }

        public String getTeamMotto(){
            return teamMotto;
        }
    }

    /**
     * This method is returning "numberA" variable value
     * @return
     */
    public Long getNumberA(){
        return numberA;
    }

    /**
     * This method is returning "numberB" variable value
     * @return
     */
    public Long getNumberB(){
        return numberB;
    }

    /**
     * This method is returning "addition" variable value
     * @return
     */
    public Long getAdditionvalue(){
        return additionValue;
    }

    /**
     * This method is returning "division" variable value
     * @return
     */
    public Long getDivisionValue(){return divisionValue;}

    /**
     * This method is returning "subtraction" variable value
     * @return
     */
    public Long getSubtractionValue() {
        return subtractionValue;
    }

    /**
     * This method is returning "multiplication" variable value
     * @return
     */
    public Long getMultiplicationValue() {
        return multiplicationValue;
    }

    /**
     * This method is returning "exponentiation" variable value
     * @return
     */
    public Long getExponentiation(){
        return exponentiationValue;
    }

    /**
     * This method is setting "exponentiation" variable value from input parameter in "Long" variable system
     * @param exponentiationValue
     */
    public void setExponentiationValue(Long exponentiationValue){
        this.exponentiationValue=exponentiationValue;
    }

    /**
     * This method is setting "numberA" variable value from input parameter in "Long" variable system
     * @param numberA
     */
    public void setNumberA(Long numberA){
        this.numberA=numberA;
    }

    /**
     * This method is setting "numberB" variable value from input parameter in "Long" variable system
     * @param numberB
     */
    public void setNumberB(Long numberB){
        this.numberB=numberB;
    }

    /**
     * This method is setting "addition" variable value from input parameter in "Long" variable system
     * @param additionValue
     */
    public void setAdditionValue(Long additionValue){
        this.additionValue=additionValue;
    }

    /**
     * This method is setting "division" variable value from input parameter in "Long" variable system
     * @param divisionValue
     */
    public void setDivisionValue(Long divisionValue){
        this.divisionValue=divisionValue;
    }

    /**
     * This method is setting "subtraction" variable value from input parameter in "Long" variable system
     * @param subtractionValue
     */
    public void setSubtractionValue(Long subtractionValue){
        this.subtractionValue=subtractionValue;
    }

    /**
     * This method is setting "multiplication" variable value from input parameter in "Long" variable system
     * @param multiplicationValue
     */
    public void setMultiplicationValue(Long multiplicationValue){
        this.multiplicationValue=multiplicationValue;
    }

    /**
     * This method is returning "team" variable value
     * @return
     */
    public String getTeam(){
        return team.teamMotto;
    }

    /**
     * This method is setting "team" variable value from input parameter as "Team" enum
     * @param team
     */
    public void setTeam(Team team){
        this.team=team;
    }

    /**
     * This method is "Number" model constructor with two input parameters in "Long" variable system
     * @param numberA
     * @param numberB
     */
    public Number(Long numberA, Long numberB){
        this.numberA=numberA;
        this.numberB=numberB;
    }

    /**
     * This method is empty "Number" model constructor
     */
    public Number(){
    }
}
