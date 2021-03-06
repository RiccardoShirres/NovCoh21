package com.tsi.training.NovCoh21.Minesweeper;

import java.util.ArrayList;

public class Board {

    ////////////////////////Attributes///////////////////

    public int size;

    public String difficulty;

    public int totalMines;

    ////////////////////////Methods//////////////////////

    public ArrayList createGrid(int size)
    {
        ArrayList<ArrayList<Space>> grid = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
        {
            grid.add(new ArrayList<Space>(size));
        }
        return grid;
    }

    ///////////////////////Constructor//////////////////

    public Board()
    {
        createGrid(size);
    }

    ////////////////////////Getters & Setters////////////

    public int getSize()
    {
        return size;
    }

    public String getDifficulty()
    {
        return difficulty;
    }

    public int getTotalMines()
    {
        return totalMines;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public void setDifficulty(String difficulty)
    {
        this.difficulty = difficulty;
    }

    public void setTotalMines(int totalMines)
    {
        this.totalMines = totalMines;
    }
}
