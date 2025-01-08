package org.example.models;

public interface Piece {
    String getName();

    void setName(String name);

    void setPosition(int x, int y);

    Movements getMovement();

    int getX();

    void setX(int x);

    int getY();

    void setY(int y);

    public String display();


}