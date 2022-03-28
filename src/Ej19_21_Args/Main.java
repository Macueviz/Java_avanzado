package Ej19_21_Args;

public class Main {
    public static void main(String []args){
       /* if(args[0].equalsIgnoreCase("uno")){
            System.out.println("Hola!");
        }else if(args[0].equalsIgnoreCase("dos")){
            System.out.println("Adiós");
        }*/

        OptionsParser optionsParser = new OptionsParser(args);
        optionsParser.registerOption("minval"); //Registramos el nombre
        optionsParser.registerOption("maxval");

        optionsParser.parse(); //Metodo que recorre hashmap y lo añade

        String maxval = optionsParser.getOption("maxval");//Optenemos el valor de maxval y lo metemos en VAR
        System.out.println(maxval);


        /*
         * Implementar con librerías
         * Aoache Commons CLI
         * JSAP
         */
        /*
        public static demoACCLI(String []args) {
        Options options = new Options();   --CREAMOS EL PARSE DE OPCIONES
        option minval = new option("m", "maxval", true, "Valor máximo");
        minval.setRequired(true)  PEDIMOS QUE EXISTA VALOR OBLIGATORIO

        CommanLineParser parser ==new CommandLineParser();  --CREAMOS EL PARSE
        HelpFomatter helpFomatter ) new HelpFormatter(); --DAMOS FORMATO A LA AYUDA
        CommandLine cmd = null;  -- NO ES BUENA PRÁCTICA DECLARARLO NULL

        try{
            cmd = parser.parse(options, args);  --AL PARSE DE ARRIBA LE DECIMOS QUE PARSEE LAS OPCIONES QUE ESTAN EN ARGS
        }catch (Exception e){
        }
        String miMinVal = Integer.parseInt(cmd.getOptionValue("minval"));  --METEMOS EL VALOR EN LA VAR
        System.out.println("Mi min val es " + miMinVal);  --SACAMOS LA VAR POR CONSOLA
         */
    }
}
