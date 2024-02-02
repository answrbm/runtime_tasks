package classwork.projects.filemanagersystem;

import classwork.projects.filemanagersystem.exceptions.*;

import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class FileManager {

    private final HashMap<String, ArrayList<File>> fileSystem;

    public FileManager() {
        this.fileSystem = new HashMap<>();
    }

    public void createFile(String directory, String fileName, boolean isProtected) throws InvalidPathException, FileAlreadyExistsException {
        if(fileSystem.containsKey(directory)) {
            ArrayList<File> filesInDirectory = fileSystem.get(directory);
            if(filesInDirectory.contains(new File(fileName)))
                throw new FileAlreadyExistsException("File already exists");
            filesInDirectory.add(new File(fileName,isProtected));
            fileSystem.put(directory,filesInDirectory);
        } else {
            throw new InvalidPathException("Directory doesn't exist");
        }
    }

    public void deleteFile(String fileName) throws FileNotFoundException, FileDeletionException {
        boolean isFileFound = false;
        for(ArrayList<File> files : fileSystem.values()) {
            Optional<File> foundFile = files.stream().filter(file -> file.getFileName().equals(fileName)).findAny();
            if(foundFile.isPresent()) {
                if(foundFile.get().isDeleteProtection())
                    throw new FileDeletionException("File cannot be deleted");
                files.remove(foundFile.get());
                isFileFound = true;
                break;
            }
        }
        if(!isFileFound)
            throw new FileNotFoundException("File not found");
    }

    public void moveFile(String destinationDirectory, String fileName) throws FileNotFoundException, DirectoryNotFoundException, FileAlreadyExistsException {
        File file = findFile(fileName);
        if(!fileSystem.containsKey(destinationDirectory))
            throw new DirectoryNotFoundException("Directory doesn't exist");
        ArrayList<File> files = fileSystem.get(destinationDirectory);
        if(files.contains(new File(fileName))) {
            throw new FileAlreadyExistsException("File already exists");
        }
        String directory = findDirectoryByFile(file);
        fileSystem.get(directory).remove(file);
        fileSystem.get(destinationDirectory).add(file);
    }

    public void createDirectory(String directoryName) throws DirectoryAlreadyExistsException {
        if(fileSystem.containsKey(directoryName)) {
            throw new DirectoryAlreadyExistsException("Directory already exists");
        } else {
            fileSystem.put(directoryName,new ArrayList<>());
        }
    }

    public void deleteDirectory(String directoryName) throws DirectoryNotEmptyException {
        if(fileSystem.containsKey(directoryName)) {
            ArrayList<File> files = fileSystem.get(directoryName);
            if(files.size() > 0)
                throw new DirectoryNotEmptyException("Directory is not empty");
            fileSystem.remove(directoryName);
        }
    }

    private String findDirectoryByFile(File file) throws DirectoryNotFoundException {
        for(Map.Entry<String, ArrayList<File>> fileEntry : fileSystem.entrySet()) {
            if(fileEntry.getValue().contains(file)) {
                return fileEntry.getKey();
            }
        }
        throw new DirectoryNotFoundException("Directory doesn't exist");
    }

    private File findFile(String fileName) throws FileNotFoundException {
        for(ArrayList<File> files : fileSystem.values()) {
            Optional<File> foundFile = files.stream().filter(file -> file.getFileName().equals(fileName)).findAny();
            if(foundFile.isPresent())
                return foundFile.get();
        }
        throw new FileNotFoundException("File not found");
    }

    public void showDirectoriesAndFiles() {
        for(Map.Entry<String, ArrayList<File>> fileEntry : fileSystem.entrySet()) {
            System.out.println("Directory:" + fileEntry.getKey());
            for(File files : fileEntry.getValue()) {
                System.out.println("File:" + files.getFileName());
            }
        }
    }

}
