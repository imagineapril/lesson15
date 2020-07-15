package ru.timokhina.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Task02 {

    private static File[] files;

    public static void recursiveBypass(File mainDirectory) {
        files = mainDirectory.listFiles();
        if(files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    recursiveBypass(file);
                }
                file.getName();
                System.out.println(file.getName());
            }
        }
        mainDirectory.getName();
    }

//    public static void recursiveBypass(File mainDirectory) {
//        System.out.println(mainDirectory.isDirectory());
//        if (mainDirectory.isDirectory()) {
//            for (File item : mainDirectory.listFiles()) {
//                if (item.isDirectory()) {
//                    System.out.println("[" + item.getName() + "]");
//                } else {
//                    System.out.println(item.getName());
//                }
//            }
//        }
//    }

    public static void main(String[] args) throws Exception {



        File mainDirectory = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory");
        mainDirectory.mkdir();
        File directory1 = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/directory1");
        directory1.mkdir();
        File file1InMainDirectory = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/file1InMainDirectory.txt");
        file1InMainDirectory.createNewFile();
        File file2InMainDirectory = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/file2InMainDirectory.txt");
        file2InMainDirectory.createNewFile();
        File file3InMainDirectory = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/file3InMainDirectory.txt");
        file3InMainDirectory.createNewFile();
        File file1 = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/directory1/1.txt");
        file1.createNewFile();
        File directory2 = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/directory2");
        directory2.mkdir();
        File file2 = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/directory2/2.txt");
        file2.createNewFile();
        File directory3 = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/directory3");
        directory3.mkdir();
        File file3 = new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/mainDirectory/directory3/3.txt");
        file3.createNewFile();

        recursiveBypass(mainDirectory);
}
}
