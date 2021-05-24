public class StatisticsVisitor implements FileVisitor {
    @Override
    public void visit(HtmlFileDetails file) {
        System.out.println("The file " + file.getName() + " contains " + file.getLines() + " lines.");
    }

    @Override
    public void visit(DocxFileDetails file) {
        System.out.format("The file %s has an average of %f words per page.", file.getName(), (float) file.getWords() / file.getPages());
    }

    @Override
    public void visit(JpgFileDetails file) {
        float size = file.getSize();
        float width = file.getWidth();
        float height = file.getHeight();
        System.out.format("The picture %s has an average of %f bits per pixel.", file.getName(), size / (width * height));
    }

    @Override
    public void visit(Mp3FileDetails file) {
        System.out.format("The bitrate of %s is %f bytes per second.\n",
                file.name, (float) file.getSize() / file.getLengthSec() + 0.000001);
    }

    @Override
    public void visit(PptxFileDetails file) {
        System.out.format("The average slide size in Presentation %s is %f.\n",
                file.name, (float) file.getSize() / file.getSlides());
    }

    @Override
    public void visit(TxtFileDetails file) {
        System.out.println("The file " + file.getName() + " contains " + file.getWords() + " words.");
    }

    @Override
    public void visit(DirectoryDetails Directory) {
        FileVisitor visitor = new FileCountVisitor();
        Directory.accept(visitor);
        int count = ((FileCountVisitor) visitor).getNumFiles();
        System.out.println("Directory " + Directory.getName() + " has " + count + " files.");
    }
}

