// Define the Printable interface

interface Printable {
    void printDocument(String document);
}

// Define the Scannable interface

interface Scannable {
    void scanDocument(String document);
}


// Implement both interfaces in the MultiFunctionPrinter class

class MultiFunctionPrinter implements Printable, Scannable {

    // Implement the printDocument method from Printable interface
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    // Implement the scanDocument method from Scannable interface
    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning document: " + document);
    }
}

// Test the MultiFunctionPrinter class
public class Read_File {
    public static void main(String[] args) {
        // Create an instance of MultiFunctionPrinter
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        
        // Use the MultiFunctionPrinter to print and scan documents
        mfp.printDocument("Check.txt");
        mfp.scanDocument("Checkphoto.png");
    }
}