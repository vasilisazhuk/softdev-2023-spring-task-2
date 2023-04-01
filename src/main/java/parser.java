import org.kohsuke.args4j.*;
import java.io.IOException;

public class parser {

    public parser(String[] args) {
    }

    @Argument(metaVar = "-i", required = false, usage = "ignore case")
    Boolean flag_i = false;

    @Argument(metaVar = "-s", usage = "ignore first n- chars")
    Integer n = 0;

    @Argument(metaVar = "-u", required = false, usage = "unique lines only")
    Boolean flag_u = false;

    @Argument(metaVar = "-c", required = false, usage = "counting lines")
    Boolean flag_c = false;

    @Option(name = "-o", required = false)
    String flag_o = "";


    private void commandLine(String[] args){
        CmdLineParser parser = new CmdLineParser(this);

        try {
            parser.parseArgument(args);

        } catch (CmdLineException e){
            System.err.println(e.getMessage());
            return;
        }
    }

    /**private void launch(String[] args) {
        CmdLineParser parser = new CmdLineParser(this);

        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            System.err.println("java -jar recoder.jar -ie EncodingI -oe EncodingO InputName OutputName");
            parser.printUsage(System.err);
            return;
        }

        Recoder recoder = new Recoder(inputEncoding, outputEncoding);
        try {
            int result = recoder.recode(inputFileName, outputFileName);
            System.out.println("Total of " + result + " symbols recoded");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }*/
}