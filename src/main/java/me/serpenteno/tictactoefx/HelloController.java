package me.serpenteno.tictactoefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Button button00;
    @FXML
    private Button button10;
    @FXML
    private Button button20;
    @FXML
    private Button button01;
    @FXML
    private Button button11;
    @FXML
    private Button button21;
    @FXML
    private Button button02;
    @FXML
    private Button button12;
    @FXML
    private Button button22;
    @FXML
    private Button resetButton;

    ArrayList<Button> buttons;

    private boolean playerTurn = false;

    private String symbol;

    private int firstMove = 0;

    private int counter;

    @FXML
    private Text title;

    @FXML
    private Text gameStatus;

    public void GameStart()
    {
        counter = 0;
        buttons = new ArrayList<>(Arrays.asList(button00, button10, button20, button01, button11, button21, button02, button12, button22));

        buttons.forEach(button ->
        {
            button.setText("");
            EnableButtons();
        });
    }

    public void GameReset (ActionEvent event) {
        firstMove++;
        counter = 0;
        buttons.forEach(button ->
        {
            button.setText("");
            EnableButtons();
        });
        PlayerTurn();
    }

    public void PlayerTurn()
    {
        if (firstMove%2 == 0)
        {
            gameStatus.setText("Player X turn");
            playerTurn = false;
        }
        else
        {
            gameStatus.setText("Player O turn");
            playerTurn = true;
        }
    }

    public void SetSymbol()
    {
        if (!playerTurn)
        {
            symbol = "X";
            playerTurn = true;
            gameStatus.setText("Player O turn");
        }
        else
        {
            symbol = "O";
            playerTurn = false;
            gameStatus.setText("Player X turn");
        }
    }

    public void DisableButtons()
    {
        buttons.forEach(button -> button.setDisable(true));
    }
    public void EnableButtons()
    {
        buttons.forEach(button -> button.setDisable(false));
    }

    public void ButtonClick00(ActionEvent event)
    {
        SetSymbol();
        button00.setText(symbol);
        button00.setDisable(true);
        counter++;
        IsGameOver();
    }
    public void ButtonClick10(ActionEvent event)
    {
        SetSymbol();
        button10.setText(symbol);
        button10.setDisable(true);
        counter++;
        IsGameOver();
    }
    public void ButtonClick20(ActionEvent event)
    {
        SetSymbol();
        button20.setText(symbol);
        button20.setDisable(true);
        counter++;
        IsGameOver();
    }
    public void ButtonClick01(ActionEvent event)
    {
        SetSymbol();
        button01.setText(symbol);
        button01.setDisable(true);
        counter++;
        IsGameOver();
    }
    public void ButtonClick11(ActionEvent event)
    {
        SetSymbol();
        button11.setText(symbol);
        button11.setDisable(true);
        counter++;
        IsGameOver();
    }
    public void ButtonClick21(ActionEvent event)
    {
        SetSymbol();
        button21.setText(symbol);
        button21.setDisable(true);
        counter++;
        IsGameOver();
    }
    public void ButtonClick02(ActionEvent event)
    {
        SetSymbol();
        button02.setText(symbol);
        button02.setDisable(true);
        counter++;
        IsGameOver();
    }
    public void ButtonClick12(ActionEvent event)
    {
        SetSymbol();
        button12.setText(symbol);
        button12.setDisable(true);
        counter++;
        IsGameOver();
    }
    public void ButtonClick22(ActionEvent event)
    {
        SetSymbol();
        button22.setText(symbol);
        button22.setDisable(true);
        counter++;
        IsGameOver();
    }

    public void GameOver()
    {
        gameStatus.setText(symbol + " won!");
        DisableButtons();
    }

    public void IsGameOver()
    {
        if (counter <= 9) {
            //Vertical win
            if (button00.getText() != "" && button00.getText() == button01.getText() && button00.getText() == button02.getText()) {
                GameOver();
                return;
            }
            if (button10.getText() != "" && button10.getText() == button11.getText() && button10.getText() == button12.getText()) {
                GameOver();
                return;
            }
            if (button20.getText() != "" && button20.getText() == button21.getText() && button20.getText() == button22.getText()) {
                GameOver();
                return;
            }
            //Horizontal win
            if (button00.getText() != "" && button00.getText() == button10.getText() && button00.getText() == button20.getText()) {
                GameOver();
                return;
            }
            if (button01.getText() != "" && button01.getText() == button11.getText() && button01.getText() == button21.getText()) {
                GameOver();
                return;
            }
            if (button02.getText() != "" && button02.getText() == button12.getText() && button02.getText() == button22.getText()) {
                GameOver();
                return;
            }
            //Diagonal win
            if (button00.getText() != "" && button00.getText() == button11.getText() && button00.getText() == button22.getText()) {
                GameOver();
                return;
            }
            if (button20.getText() != "" && button20.getText() == button11.getText() && button20.getText() == button02.getText()) {
                GameOver();
                return;
            }
            else if (counter == 9)
            {
                gameStatus.setText("Draw");
                DisableButtons();
                return;
            }
        }
    }
}