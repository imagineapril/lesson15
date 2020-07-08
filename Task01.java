package ru.timokhina.lesson15;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Task01 {

    public static void main(String[] args) throws Exception {

        File file = new File ("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/a.txt");
        file.createNewFile();

        File fileToBeDeleted = new File ("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/fileToBeDeleted.txt");
        fileToBeDeleted.createNewFile();
        fileToBeDeleted.delete();

        file.renameTo(new File("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/b.txt"));


        Path p1 = Paths.get("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/b.txt");
        Path p2 = Paths.get("/Users/julia/IdeaProjects/inno/src/ru/timokhina/lesson15/copyb.txt");
        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);

    }
}
