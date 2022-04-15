package baseball;

import baseball.controller.GameController;
import baseball.service.BaseballService;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.start();
    }
}
