package setY;

import java.util.ArrayList;

public class BBET {
    boolean value;
    String operator;

    ArrayList<BBET> children=new ArrayList<>(2);

    public BBET(boolean value){
        this.value=value;
    }

    public BBET(String operator){
        this.operator=operator;
    }

    public void AddChild(BBET child)
    {
        children.add(child);
    }

    public boolean getValue(){
        if(children.isEmpty())
        {
            return value;
        }
        return Evaluate(children.get(0).getValue(),operator,children.get(1).getValue());
    }

    public boolean Evaluate(boolean v1,String op, boolean v2) {

        if (op=="&"){
            return v1 && v2;
        }
        else if(op == "|"){
            return v1 || v2;
        }
        else if(op == "^"){
            return v1 ^ v2;
        }

        return false;
    }
}

