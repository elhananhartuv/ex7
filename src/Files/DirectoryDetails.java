package Files;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {
    List<FileDetails> homeDirectory;
    private int numFiles;
    public DirectoryDetails(String path, String name){
        super(path,name);
        homeDirectory=new LinkedList<FileDetails>();
        numFiles=0;
    }

    public int getNumFiles() {
        return numFiles;
    }

    public void setNumFiles(int numFiles) {
        this.numFiles = numFiles;
    }

    @Override
    public void accept(FileVisitor fileVisitor) {
        for(FileDetails file:homeDirectory){
            file.accept(fileVisitor);
        }
        fileVisitor.visit(this);
    }
    public void addFile(FileDetails fileDetails){
        homeDirectory.add(fileDetails);
    }
}
