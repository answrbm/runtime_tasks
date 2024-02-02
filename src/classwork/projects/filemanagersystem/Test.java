package classwork.projects.filemanagersystem;

import classwork.projects.filemanagersystem.exceptions.*;

import java.nio.file.FileAlreadyExistsException;

public class Test {

    public static void main(String[] args) throws FileAlreadyExistsException, InvalidPathException,
            FileNotFoundException, DirectoryAlreadyExistsException, FileDeletionException, DirectoryNotEmptyException,
            DirectoryNotFoundException {
        FileManager fileManager = new FileManager();
        fileManager.createDirectory("d1");
        fileManager.createDirectory("d2");
        fileManager.createFile("d1","f1",true);
        fileManager.createFile("d2","f2",false);

        fileManager.showDirectoriesAndFiles();
        System.out.println("___");
        fileManager.moveFile("d1","f2");
        fileManager.showDirectoriesAndFiles();
        System.out.println("___");
        fileManager.moveFile("d2","f2");
        fileManager.showDirectoriesAndFiles();

    }
}
