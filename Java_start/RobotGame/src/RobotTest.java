import java.util.Arrays;

public class RobotTest {
    public static void main(String[] args) {

        Robot robot = new Robot();

        moveRobot(robot, 3, 0);
        System.out.println(Arrays.toString(new int[]{robot.getX(), robot.getY()}));
        System.out.println(robot.getDirection());

        moveRobot(robot, 0, 3);
        System.out.println(Arrays.toString(new int[]{robot.getX(), robot.getY()}));
        System.out.println(robot.getDirection());

    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        while ((toX - robot.getX() != 0) || (toY - robot.getY() != 0)) {

            if (toX - robot.getX() > 0) {
                while (robot.getDirection() != Robot.Direction.RIGHT) {
                    robot.turnLeft();
                }
                robot.stepForward();

            } else if (toX - robot.getX() < 0) {
                while (robot.getDirection() != Robot.Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();

            } else if (toY - robot.getY() > 0) {
                while (robot.getDirection() != Robot.Direction.UP) {
                    robot.turnLeft();
                }
                robot.stepForward();

            } else {
                while (robot.getDirection() != Robot.Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }

}
