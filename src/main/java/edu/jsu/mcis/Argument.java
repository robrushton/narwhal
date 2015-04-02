package edu.jsu.mcis;


import java.util.*;
import edu.jsu.mcis.ArgumentParser.Datatype;

public class Argument <T>{
    protected String name;
    protected Datatype dataType;
    protected List<String> restrictions;
    protected String defaultValue;
    
    public Argument(){
        name = "";
        defaultValue = "";
        restrictions = new ArrayList<>();
    }
    
    public List<String> getRestrictions() {
        return restrictions;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
    public Datatype getDataType() {
        return dataType;
    }

    public void setDataType(Datatype d) {
        dataType = d;
    }
    
    public String getDefaultValue() {
        return defaultValue;
    }
    
    public void setDefaultValue(String s) {
        defaultValue = s;
    }
}
