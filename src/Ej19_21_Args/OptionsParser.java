package Ej19_21_Args;

import java.util.HashMap;

public class OptionsParser {
    private HashMap<String, String> options = new HashMap();
    private String []args;

    private OptionsParser(){}

    public OptionsParser(String []args){
        this.args = args;
    }

    public void registerOption(String optionName){
        options.put(optionName, "");
    }

    public String getOption(String optionName){
        return options.get(optionName);
    }

    public void setOptionValue(String optionName, String optionValue){
        options.replace(optionName, optionValue); //Metemos nombre y valor en el hashmap
    }

    public void parse(){
        for (int i = 0; i < args.length; i++){
            String optionName = args[i].replace("-", ""); //quitamos el tener que declarar con guiones
            if (options.containsKey(optionName)){ //Si encuentra un valor en el hashmap, lo mete en el sig metodo
                setOptionValue(optionName, args[i + 1]);  //Mete el nombre y el valor en el hashmap
            }
        }
    }
}
