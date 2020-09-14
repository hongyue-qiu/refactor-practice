package com.twu.refactoring;

public class Direction {
    private final char direction;

    public Direction(char direction) {
        this.direction = direction;
    }

    public Direction turnRight() {
        return getDirection('E', 'W');
    }

    public com.twu.refactoring.Direction getDirection(char charOfE, char charOfW) {
        switch (direction) {
            case 'N':
                return new Direction(charOfE);
            case 'S':
                return new Direction(w);
            case 'E':
                return new Direction('N');
            case 'W':
                return new Direction('S');
            default:
                throw new IllegalArgumentException();
        }
    }

    public Direction turnLeft() {
        return getDirection('W', 'E');
    }

    @Override
    public boolean equals(Object object) {

        Direction direction1 = (Direction) object;

        if (direction != direction1.direction ||object == null || getClass() != object.getClass()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) direction;
    }

    @Override
    public String toString() {
        return "Direction{direction=" + direction + '}';
    }
}
