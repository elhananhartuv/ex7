import java.util.LinkedList;
import java.util.List;


public class DirectoryDetails extends FileDetails {
    List<FileDetails> homeDirectory;

    public DirectoryDetails(String path, String name) {
        super(path, name);
        homeDirectory = new LinkedList<FileDetails>();
    }

    @Override
    public void accept(FileVisitor fileVisitor) {
        for (FileDetails file : homeDirectory) {
            file.accept(fileVisitor);
        }
        fileVisitor.visit(this);
    }
    public void addFile(FileDetails fileDetails) {
        homeDirectory.add(fileDetails);
    }
}
