/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_1;

import java.util.ArrayList;

/**
 *
 * @author Murilo Marcineiro
 */
public class Identificador implements Comparable<Identificador>{
    private String name;
    private int times;
    ArrayList<Integer> timesInLine;
    ArrayList<Integer> line;

    @Override
    public int compareTo(Identificador d1){
        return this.getName().compareTo(d1.getName());
    }
    
    public Identificador(String name) {
        this.name = name;
    }

    public Identificador(String name, int times, ArrayList timesInLine, ArrayList line) {
        this.name = name;
        this.times = times;
        this.timesInLine = timesInLine;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public ArrayList getTimesInLine() {
        return timesInLine;
    }

    public void setTimesInLine(ArrayList timesInLine) {
        this.timesInLine = timesInLine;
    }

    public ArrayList getLine() {
        return line;
    }

    public void setLine(ArrayList line) {
        this.line = line;
    }
    
    
}
