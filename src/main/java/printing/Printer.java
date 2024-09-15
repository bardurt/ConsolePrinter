package printing;

import printing.command.PrinterCommand;

public interface Printer {

    void addCommand(PrinterCommand printerCommand);
    void print();
}
