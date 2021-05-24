public interface FileVisitor {
    void visit(HtmlFileDetails file);
    void visit(DocxFileDetails file);
    void visit(JpgFileDetails file);
    void visit(Mp3FileDetails file);
    void visit(PptxFileDetails file);
    void visit(TxtFileDetails file);
    void visit(DirectoryDetails Directory);
}
