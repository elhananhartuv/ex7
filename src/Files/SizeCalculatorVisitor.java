package Files;

public class SizeCalculatorVisitor implements FileVisitor{
    private int size;
    public SizeCalculatorVisitor(){
        size=0;
    }
    public int getSize(){
        return size;
    }
    @Override
    public void visit(HtmlFileDetails file) {
        size+=file.getSize();
    }

    @Override
    public void visit(DocxFileDetails file) {
        size+=file.getSize();
    }

    @Override
    public void visit(JpgFileDetails file) {
        size+=file.getSize();
    }

    @Override
    public void visit(Mp3FileDetails file) {
        size+=file.getSize();
    }

    @Override
    public void visit(PptxFileDetails file) {
        size+=file.getSize();
    }

    @Override
    public void visit(TxtFileDetails file) {
        size+=file.getSize();
    }

    @Override
    public void visit(DirectoryDetails Directory) {

    }
}
