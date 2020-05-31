package JavaIO.CopyFileTree;

public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException {
//                        return (Files.isRegularFile(path));
//                    }
//                };

//        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
//
//        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
////        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");  // FileTree\\Dir2 (windows)
//        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
//            for (Path file : contents) {
//                System.out.println(file.getFileName());
//            }
//
//        } catch (IOException | DirectoryIteratorException e) {
//            System.out.println(e.getMessage());
//        }
//
//        String separator = File.separator;
//        System.out.println(separator);
//        separator = FileSystems.getDefault().getSeparator();
//        System.out.println(separator);
//
//        try {
//            Path tempFile = Files.createTempFile("myapp", ".appext");  // C:\Users\???\AppData\Local\Temp\myapp1797805585146820741.appext
//            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
//
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
//        for(FileStore store : stores) {
//            System.out.println("Volume name/Drive letter = " + store);
//            System.out.println("file store = " + store.name());
//        }
//
//        System.out.println("*******************");
//        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
//        for(Path path : rootPaths) {
//            System.out.println(path);
//        }

//        Path dir2Path = FileSystems.getDefault().getPath("src"+ File.separator +"FourteenthChapter"+
//                File.separator + "FileTree" + File.separator + "Dir2");
//
//        System.out.println("---Copy Dir2 to Dir4/Dir2Copy---");
//        Path copyPath = FileSystems.getDefault().getPath("src"+ File.separator +"FourteenthChapter"+
//                File.separator +"FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
//        try {
//            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
//
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }



    }
}
