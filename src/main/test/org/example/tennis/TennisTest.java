package org.example.tennis;



import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TennisTest {

    @Test
    void newTennisObjectHasScoreLoveLove() {

        Tennis tennis = new Tennis();

        assertThat(tennis.readScore()).isEqualTo("love-love");

    }

    @Test
    void afterPlayer1WinsBallScoreShouldBe15Love() {

        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        assertThat(tennis.readScore()).isEqualTo("15-love");
    }

    @Test
    void afterPlayersHaveWonOneBallEachScoreShouldBe1515() {
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("15-15");


    }

    @Test
    void afterPlayer1HasWonTwoBallsScoreShouldBe30Love() {
        Tennis tennis = new Tennis();
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("30-love");


    }

    @Test
    void afterPlayer1HasWonThreeBallsScoreShouldBe40Love() {
        Tennis tennis = new Tennis();
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("40-love");
    }

    @Test
    void playerThatHasWon3BallsAndWinAnotherShouldWinTheGame() {
        Tennis tennis = new Tennis();
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.isGameOver()).isTrue();

    }

    @Test
    void playerBothPlayerHasWon3BallsPlayer1ShouldNotWinAfterABallWin() {
        Tennis tennis = new Tennis();
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player2");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");

        assertThat(tennis.isGameOver()).isFalse();

    }

    @Test
    void whenOnePlayerHasWon2MoreBallsThanTheOtherAndGameIsOver() {
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("deuce");


    }

    @Test
    void whenBothPlayerHaveWonAtleast3BallsEach() {
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("deuce");
        assertThat(tennis.isGameOver()).isFalse();


    }
    @Test
    void whenBothPlayerHaveWonAtleast4BallsEach() {
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("deuce");
        assertThat(tennis.isGameOver()).isFalse();


    }
    @Test
    void whenBothPlayerHasMoreThan3BallsAndOneHasOneMore() {
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("advantage player1");
        assertThat(tennis.isGameOver()).isFalse();


    }


}

