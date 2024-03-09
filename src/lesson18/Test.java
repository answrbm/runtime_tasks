package lesson18;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
//        Path reportsDirectoryPath = Path.of("resources/reports");
//        Path reportFile = Path.of(reportsDirectoryPath.toString() + "/report.txt");
//        if (Files.exists(reportsDirectoryPath)) {
//            System.out.println("Директория уже существует");
//            return;
//        }
//
//        Files.createDirectory(reportsDirectoryPath);
//        System.out.println("Директория создана");
//
//        Files.createFile(reportFile);
//        System.out.printf("Файл %s был создан\n", reportFile.getFileName());

//        Path files = Path.of("files");
//        Files.createDirectory(files);
//        System.out.println("Directory created");
//        for(int i = 0; i < 5; i++) {
//            Files.createFile(Path.of(files + "/file"+(i+1)+".txt"));
//            System.out.println("File"+ (i+1) +" created");
//        }

        System.out.println("Что вы хотите сделать? ");
        System.out.println("ls - посмотреть содержимое директории.");
        System.out.println("mkdir - создать директорию.");
        System.out.println("touch - создать файл.");
        System.out.println("rename - переименовать директорию/файл.");
        System.out.println("rm_file - удалить файл.");
        System.out.println("exit - выход.");
        Scanner scanner = new Scanner(System.in);
        String input;
        while(!(input = scanner.nextLine()).equals("exit")) {
            switch (input) {
                case "ls" -> {
                    System.out.println("Введите название директории:");
                    String directoryName = scanner.nextLine();
                    Path directory = Path.of(directoryName);
                    if(Files.exists(directory)) {
                        Files.list(directory).forEach(System.out::println);
                    } else {
                        System.out.println("Нету такой директории");
                    }
                }
                case "mkdir" -> {
                    System.out.println("Введите название директории:");
                    String directoryName = scanner.nextLine();
                    Path directory = Path.of(directoryName);
                    Files.createDirectory(directory);
                }
                case "touch" -> {
                    System.out.println("Введите название файла:");
                    String fileName = scanner.nextLine();
                    System.out.println("Введите название директории:");
                    String directoryName = scanner.nextLine();
                    Path file = Path.of(fileName);
                    Path directory = Path.of(directoryName);
                    Files.createFile(Path.of(directory+"/"+file));
                }
                case "rename" -> {
                    System.out.println("Введите название файла:");
                    String fileName = scanner.nextLine();
                    Path file = Path.of(fileName);
                    if(Files.exists(file)) {
                        System.out.println("Введите новое название файла:");
                        String newFileName = scanner.nextLine();
                        Files.move(file,file.resolveSibling(newFileName));
                        System.out.println("Файл был переименован");
                    } else {
                        System.out.println("Нету такого файла");
                    }
                }
                case "rm_file" -> {
                    System.out.println("Введите название файла:");
                    String fileName = scanner.nextLine();
                    Path file = Path.of(fileName);
                    if(Files.exists(file)) {
                        boolean isDeleted = Files.deleteIfExists(file);
                        if(isDeleted)
                            System.out.println("Файл был удален");
                    } else {
                        System.out.println("Нету такого файла");
                    }
                }
                default -> {
                    System.out.println("Нету такой команды");
                }
            }
            System.out.println("Что вы хотите сделать? ");
            System.out.println("ls - посмотреть содержимое директории.");
            System.out.println("mkdir - создать директорию.");
            System.out.println("touch - создать файл.");
            System.out.println("rename - переименовать директорию/файл.");
            System.out.println("rm_file - удалить файл.");
            System.out.println("exit - выход.");
        }

    }

}
