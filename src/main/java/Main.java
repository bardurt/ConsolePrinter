import printing.Alignment;
import printing.Color;
import printing.ConsolePrinter;
import printing.Printer;
import printing.command.*;

public class Main {

    public static void main(String[] args){

        Printer printer = new ConsolePrinter();

        printer.addCommand(new BackgroundColorCommand(Color.BLACK));
        printer.addCommand(new TextColorCommand(Color.DEFAULT));
        printer.addCommand(new TextCommand("Col 1"));
        printer.addCommand(new ColumnCommand(6));
        printer.addCommand(new AlignmentCommand(Alignment.LEFT));
        printer.print();

        printer.addCommand(new BackgroundColorCommand(Color.BLACK));
        printer.addCommand(new TextColorCommand(Color.DEFAULT));
        printer.addCommand(new TextCommand("Col 2"));
        printer.addCommand(new ColumnCommand(6));
        printer.addCommand(new AlignmentCommand(Alignment.RIGHT));
        printer.print();

        printer.addCommand(new BackgroundColorCommand(Color.BLACK));
        printer.addCommand(new TextColorCommand(Color.DEFAULT));
        printer.addCommand(new TextCommand("Col 3"));
        printer.addCommand(new ColumnCommand(8));
        printer.addCommand(new AlignmentCommand(Alignment.RIGHT));
        printer.print();

        printer.addCommand(new BackgroundColorCommand(Color.BLACK));
        printer.addCommand(new TextColorCommand(Color.DEFAULT));
        printer.addCommand(new TextCommand("Col 4"));
        printer.addCommand(new ColumnCommand(12));
        printer.addCommand(new AlignmentCommand(Alignment.RIGHT));
        printer.print();

        printer.addCommand(new BackgroundColorCommand(Color.BLACK));
        printer.addCommand(new TextColorCommand(Color.DEFAULT));
        printer.addCommand(new TextCommand("Col 5"));
        printer.addCommand(new ColumnCommand(7));
        printer.addCommand(new AlignmentCommand(Alignment.RIGHT));
        printer.print();

        printer.addCommand(new BackgroundColorCommand(Color.BLACK));
        printer.addCommand(new TextColorCommand(Color.DEFAULT));
        printer.addCommand(new TextCommand("Col 6"));
        printer.addCommand(new ColumnCommand(20));
        printer.addCommand(new AlignmentCommand(Alignment.CENTER));
        printer.print();

        printer.addCommand(new NewLineCommand());
        printer.print();

        printer.addCommand(new BackgroundColorCommand(Color.BLUE));
        printer.addCommand(new TextColorCommand(Color.RED));
        printer.addCommand(new TextCommand("Col 1"));
        printer.addCommand(new ColumnCommand(6));
        printer.addCommand(new AlignmentCommand(Alignment.LEFT));
        printer.print();


        printer.addCommand(new BackgroundColorCommand(Color.YELLOW));
        printer.addCommand(new TextColorCommand(Color.RED));
        printer.addCommand(new TextCommand("Col 2"));
        printer.addCommand(new ColumnCommand(14));
        printer.addCommand(new AlignmentCommand(Alignment.CENTER));
        printer.print();

        printer.addCommand(new NewLineCommand());
        printer.print();

        printer.addCommand(new BackgroundColorCommand(Color.PURPLE));
        printer.addCommand(new TextColorCommand(Color.CYAN));
        printer.addCommand(new TextCommand("Col 1"));
        printer.addCommand(new ColumnCommand(34));
        printer.addCommand(new AlignmentCommand(Alignment.LEFT));
        printer.print();

        printer.addCommand(new NewLineCommand());
        printer.print();

        printer.addCommand(new BackgroundColorCommand(Color.BLACK));
        printer.addCommand(new TextColorCommand(Color.CYAN));
        printer.addCommand(new TextCommand("Col 1"));
        printer.addCommand(new ColumnCommand(25));
        printer.addCommand(new AlignmentCommand(Alignment.LEFT));
        printer.print();

    }
}
