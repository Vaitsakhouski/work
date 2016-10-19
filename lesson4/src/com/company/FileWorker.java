package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.lang.System.out;

/**
 * creating html table
 * and pushing address of server and his ping
 */
public class FileWorker {
    private ArrayList<String> cc = new ArrayList<>();
    private String HEAD_COLOR = "#999999";
    private String ROW_COLOR1 = "efefef";
    private File input_file;
    private File output_file;
    private String head = "<!DOCTYPE HTML>\n" +
            "<html>\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\">\n" +
            "</head>\n" +
            "<body>\n";
    private String foot = "</body>\n" +
            "</html>";

    /**
     * set path to html file and file with address
     *
     * @param filePath   - path to html file
     * @param file_2Path - path to file with address
     */
    public FileWorker(String filePath, String file_2Path) {
        input_file = new File(filePath);
        output_file = new File(file_2Path);
    }

    /**
     * creatring of files
     */
    public void createFile(File file) {
        try {
            if (!input_file.exists()) {
                input_file.createNewFile();
            }
            if (!output_file.exists()) {
                output_file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * creating html table and pushing
     * server address to file
     * next,read and send address to html table
     */
    public void write() {
        try {
            FileWriter fw = new FileWriter(input_file);
            BufferedWriter bw = new BufferedWriter(fw);
            FileWriter re = new FileWriter(output_file);
            BufferedWriter br = new BufferedWriter(re);
            cc.add("223.421.000.111\n");
            cc.add("444.213.111.887\n");
            cc.add("424.113.181.286\n");
            br.write("233.421.000.111\n");
            OutputStream f = new FileOutputStream(".\\text.txt", true);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            String row = " ";
            for (int i = 0; i < cc.size(); i++) {
                row += cc.get(i);
            }
            FileReader qq = new FileReader(".\\text.txt");
            BufferedReader qw = new BufferedReader(qq);
            bw.write(head);
            bw.write("<table border = '0' cellspacing = \"1\" align = center width=35%>\n");
            bw.write("<tr bgcolor =\"" + HEAD_COLOR + "\">\n" +
                    "<th align = center valign=\"top\"  width=18%> Server </th>\n" +
                    "<th align = center valign=\"top\"  width=18%> Response, ms </th>\n" +
                    "</tr>\n");
            for (int i = 0; i < cc.size(); i++) {
                bw.write("<tr bgcolor=\"" + ROW_COLOR1 + "\">" + "<td>" + row + "</td>"
                        + "<td>" + (int) (Math.random() * 490 + 10) + "</td>" + "</tr>\n");
            }
            bw.write("</table>\n");
            bw.write(foot);
            bw.close();
            br.close();
            qq.close();
            qw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}