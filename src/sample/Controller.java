package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class Controller extends Turn {

    public Spinner<Integer> userNum1;
    public Spinner<Integer> userNum2;
    public Spinner<Integer> userNum3;
    public Spinner<Integer> userNum4;
    public TableView<Turn> turnList;

    private int turnCounter;

    public void doTurn(ActionEvent actionEvent) {
    int n1=userNum1.getValue();
    int n2=userNum2.getValue();
    int n3=userNum3.getValue();
    int n4=userNum4.getValue();

    turnCounter++;


    var guess=String.format("%d %d %d %d",n1,n2,n3,n4);
    var turn=new Turn();
    turn.setTurnNr(turnCounter);
    turn.setUserGuess(guess);
    turnList.getItems().add(0,turn);
    turnList.sort();

    }
}
