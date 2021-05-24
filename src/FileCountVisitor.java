public class FileCountVisitor implements FileVisitor {
    private int numFiles;

    public FileCountVisitor() {
        numFiles = 0;
    }

    public int getNumFiles() {
        return numFiles;
    }

    @Override
    public void visit(HtmlFileDetails file) {
        numFiles += 1;
    }

    @Override
    public void visit(DocxFileDetails file) {
        numFiles += 1;
    }

    @Override
    public void visit(JpgFileDetails file) {
        numFiles += 1;
    }

    @Override
    public void visit(Mp3FileDetails file) {
        numFiles += 1;
    }

    @Override
    public void visit(PptxFileDetails file) {
        numFiles += 1;
    }

    @Override
    public void visit(TxtFileDetails file) {
        numFiles += 1;
    }

    @Override
    public void visit(DirectoryDetails Directory) {
    }
}
