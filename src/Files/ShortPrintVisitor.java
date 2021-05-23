package Files;

public class ShortPrintVisitor implements FileVisitor {
    @Override
    public void visit(HtmlFileDetails file) {
        System.out.println(file.getFullName());
    }

    @Override
    public void visit(DocxFileDetails file) {
        System.out.println(file.getFullName());
    }

    @Override
    public void visit(JpgFileDetails file) {
        System.out.println(file.getFullName());
    }

    @Override
    public void visit(Mp3FileDetails file) {
        System.out.println(file.getFullName());
    }

    @Override
    public void visit(PptxFileDetails file) {
        System.out.println(file.getFullName());
    }

    @Override
    public void visit(TxtFileDetails file) {
        System.out.println(file.getFullName());
    }

    @Override
    public void visit(DirectoryDetails Directory) {
        System.out.println(Directory.getFullName());
    }
}
