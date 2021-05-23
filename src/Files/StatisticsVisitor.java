package Files;

public class StatisticsVisitor implements FileVisitor {
    @Override
    public void visit(HtmlFileDetails file) {
        System.out.println("The file " + file.getFullName() + " contains " + file.getLines() + " lines.");
    }

    @Override
    public void visit(DocxFileDetails file) {
        double numWords = file.getWords();
        double numPages = file.getPages();
        System.out.println("The file " + file.getFullName() + " has an average of " + numWords / numPages + " words per page.");
    }

    @Override
    public void visit(JpgFileDetails file) {
        double size = file.getSize();
        double width = file.getWidth();
        double height = file.getHeight();
        System.out.println("The picture " + file.getFullName() + " has an average of  " + size / (width * height) + " bytes per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails file) {
        double size = file.getSize();
        double sec = file.getLengthSec();
        System.out.println("The bitrate of " + file.getFullName() + " is " + size / sec + " bytes per second.");
    }

    @Override
    public void visit(PptxFileDetails file) {
        double size = file.getSize();
        double slides = file.getSlides();
        System.out.println("The average slide size in Presentation " + file.getFullName() + " is " + size / slides);
    }

    @Override
    public void visit(TxtFileDetails file) {
        System.out.println("The file " + file.getFullName() + " contains " + file.getWords() + " words.");
    }

    @Override
    public void visit(DirectoryDetails Directory) {
        FileVisitor visitor = new FileCountVisitor();
        Directory.accept(new FileCountVisitor());
        int count = ((FileCountVisitor) visitor).getNumFiles();
        System.out.println("Directory "+Directory.getFullName()+" has "  +count+ " files.");
    }
}

