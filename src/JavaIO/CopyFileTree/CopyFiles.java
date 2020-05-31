package JavaIO.CopyFileTree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFiles extends SimpleFileVisitor<Path>{
    private Path sourceRoot;
    private Path destRoot;

    public CopyFiles(Path sourceRoot, Path destRoot) {
        this.sourceRoot = sourceRoot;
        this.destRoot = destRoot;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Copying folder " + dir.toString());
        Path currentDir = sourceRoot.relativize(dir);
        Path destDir = destRoot.resolve(currentDir);
        try{
            Files.copy(dir, destDir);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Copying file " + file.toString());
        Path currentFile = sourceRoot.relativize(file);
        Path destFile = destRoot.resolve(currentFile);
        try{
            Files.copy(file, destFile);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }
}