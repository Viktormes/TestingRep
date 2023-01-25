package org.example.tennis;



import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TennisTest {
   public final Tennis tennis = new Tennis();
    @Test
    void newTennisObjectHasScoreLoveLove() {



        assertThat(tennis.readScore()).isEqualTo("love-love");

    }

    @Test
    void afterPlayer1WinsBallScoreShouldBe15Love() {



        tennis.incrementScore("player1");
        assertThat(tennis.readScore()).isEqualTo("15-love");
    }

    @Test
    void afterPlayersHaveWonOneBallEachScoreShouldBe1515() {


        tennis.incrementScore("player1");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("15-15");


    }

    @Test
    void afterPlayer1HasWonTwoBallsScoreShouldBe30Love() {

        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("30-love");


    }

    @Test
    void afterPlayer1HasWonThreeBallsScoreShouldBe40Love() {

        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("40-love");
    }

    @Test
    void playerThatHasWon3BallsAndWinAnotherShouldWinTheGame() {

        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.isGameOver()).isTrue();

    }

    @Test
    void playerBothPlayerHasWon3BallsPlayer1ShouldNotWinAfterABallWin() {

        play4040();
        tennis.incrementScore("player1");

        assertThat(tennis.isGameOver()).isFalse();

    }

    @Test
    void whenOnePlayerHasWon2MoreBallsThanTheOtherAndGameIsOver() {


        play4040();
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.isGameOver()).isTrue();


    }

    @Test
    void whenBothPlayerHaveWonAtleast3BallsEach() {


        play4040();

        assertThat(tennis.readScore()).isEqualTo("deuce");
        assertThat(tennis.isGameOver()).isFalse();


    }
    @Test
    void whenBothPlayerHaveWonAtleast4BallsEach() {


        play4040();
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("deuce");
        assertThat(tennis.isGameOver()).isFalse();


    }
    @Test
    void whenBothPlayerHasMoreThan3BallsAndOneHasOneMore() {

        play4040();
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("advantage player1");
        assertThat(tennis.isGameOver()).isFalse();


    }
    @Test
    void whenBothPlayerHasMoreThan3BallsAndPlayer2HasOneMore() {


        play4040();
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("advantage player2");
        assertThat(tennis.isGameOver()).isFalse();


    }

    private void play4040() {
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
    }


}

