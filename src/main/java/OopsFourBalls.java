import processing.core.PApplet;

public class OopsFourBalls extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    Ball ballOne, ballTwo, ballThree, ballFour;

    public static void main(String[] args) {
        PApplet.main("OopsFourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
         ballOne = new BallOne();
         ballTwo = new BallTwo();
         ballThree = new BallThree();
         ballFour = new BallFour();
    }

    @Override
    public void draw() {
        drawCircle(ballOne);
        drawCircle(ballTwo);
        drawCircle(ballThree);
        drawCircle(ballFour);
    }

    private void drawCircle(Ball ball) {
        ellipse(ball.SPEED, ball.HEIGHT, ball.SIZE, ball.SIZE);
        ball.setSPEED();
    }
}
