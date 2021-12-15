package Question1;
public class Roomba implements iRobot{

    private int[][] room;
    private int posX;
    private int posY;
    private Direction dire = Direction.DOWN;

    public Roomba(int[][] room) {
        this.room = room;
        this.posX = 0;
        this.posY = 0;
    }


    @Override
    public boolean move() {
        if (dire == Direction.DOWN) {
            int tempX = posX++;
            if (tempX < 0 || tempX >= room.length) {
                return false;
            }
            if (room[tempX][posY] == -1) {
                return false;
            }
            posX = tempX;
            return true;
        } else if (dire == Direction.RIGHT) {
            int tempY = posY++;
            if (tempY < 0 || tempY >= room[0].length) {
                return false;
            }
            if (room[posX][tempY] == -1) {
                return false;
            }
            posY = tempY;
            return true;
        } else if (dire == Direction.UP) {
            int tempX = posX--;
            if (tempX < 0 || tempX >= room.length) {
                return false;
            }
            if (room[tempX][posY] == -1) {
                return false;
            }
            posX = tempX;
            return true;
        } else {
            int tempY = posY--;
            if (tempY < 0 || tempY >= room[0].length) {
                return false;
            }
            if (room[posX][tempY] == -1) {
                return false;
            }
            posY = tempY;
            return true;
        }
    }

    @Override
    public void turnLeft() {
        if (dire == Direction.DOWN) {
            dire = Direction.RIGHT;
        } else if (dire == Direction.RIGHT) {
            dire = Direction.UP;
        } else if (dire == Direction.UP) {
            dire = Direction.LEFT;
        } else {
            dire = Direction.DOWN;
        }
    }

    @Override
    public void turnRight() {
        if (dire == Direction.DOWN) {
            dire = Direction.LEFT;
        } else if (dire == Direction.LEFT) {
            dire = Direction.UP;
        } else if (dire == Direction.UP) {
            dire = Direction.RIGHT;
        } else {
            dire = Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        this.room[posX][posY] = 1;
    }
}
