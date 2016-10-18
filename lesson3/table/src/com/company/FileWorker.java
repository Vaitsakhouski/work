package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * creating html table
 * and pushing name of files, type,size
 * and time of creating
 */
public class FileWorker {
    private String HEAD_COLOR = "#cecfce";
    private String ROW_COLOR1 = "#efefef";
    private String ROW_COLOR2 = "#f7f7f7";
    private File file;
    private ArrayList<String> rows = new ArrayList<>();
    private String head = "<!DOCTYPE HTML>\n" +
            "<html>\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\">\n" +
            "</head>\n" +
            "<body>\n";
    private String footer = "</body>\n" +
            "</html>";

    /**
     * set path to html file and directory
     *
     * @param filePath - path to html file
     * @param dirPath  - path to directory,in which saved html file
     */
    public FileWorker(String filePath, String dirPath) {
        file = new File(filePath);
        search(new File(dirPath));
    }

    /**
     * if html file is non - creating
     * making head and footer of table in file
     */
    public void push() {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(head);
            bw.write("<table border = '0' cellspacing = \"1\" align = center width=35%>\n");
            bw.write("<tr bgcolor =\"" + HEAD_COLOR + "\">\n" +
                    "<th align = center valign=\"top\"  width=18%> ИМЯ </th>\n" +
                    "<th align = center valign=\"top\"  width=18%> ТИП </th>\n" +
                    "<th align = center valign=\"top\"  width=18%> ДАТА СОЗДАНИЯ </th>\n" +
                    "<th align = center valign=\"top\" nowrap width=18%> РАЗМЕР (в kB) </th>\n" +
                    "</tr>\n");
            int i = 0;
            for (String row : rows) {
                if (i % 2 == 0) {
                    bw.write("<tr bgcolor=\"" + ROW_COLOR1 + "\">" + row + "</tr>\n");
                } else {
                    bw.write("<tr bgcolor=\"" + ROW_COLOR2 + "\">" + row + "</tr>\n");
                }
                i++;
            }
            bw.write("</table>");
            bw.write(footer);
            bw.close();

        } catch (IOException e) {
            System.out.println("couldn't read file");
        }
    }

    /**
     * receive files from a directory
     * adding rows in to html table with
     * time of creating files and with
     * size of files
     *
     * @param dir - directory of files
     */
    public void search(File dir) {
        for (File file : dir.listFiles()) {
            String row = "<td>" + file.getName() + "</td><td>";
            if (file.isDirectory()) {
                row += "DIR";
            }
            if (file.isFile()) {
                row += "FILE";
            }
            try {
                Path path = file.toPath();
                BasicFileAttributes qw = Files.readAttributes(path, BasicFileAttributes.class);
                row += "</td><td>" + convertDate((qw.creationTime().toString().split("T"))[0]);
            } catch (IOException e) {
            }
            row += "</td><td>" + ((double) getFileSize(file)) / 1024 + "</td>";
            rows.add(row);
        }
    }

    /**
     * getting size of files and directory
     *
     * @param dir - directory of files
     * @return size of file
     */
    public static long getFileSize(File dir) {
        long length = 0;
        if (dir.isFile()) {
            length = dir.length();
        } else {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    length += file.length();
                } else {
                    length += getFileSize(file);
                }
            }
        }
        return length;
    }

    /**
     * method, which convert creation time
     * in other size
     *
     * @return - returns the creation time in other sight
     */
    public String convertDate(String date) {
        String[] dateFiles = date.split("-");
        String rightDate = "";
        for (int i = dateFiles.length - 1; i >= 0; i--) {
            rightDate += dateFiles[i];
            if (i != 0) {
                rightDate += ".";
            }
        }
        return rightDate;
    }
}
