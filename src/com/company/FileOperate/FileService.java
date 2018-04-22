package com.company.FileOperate;

import java.io.*;
import java.util.ArrayList;

public class FileService {

    public  static  String[] getFileContent(String filepath)  {

        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line = br.readLine();
            while (line!= null) {
                lines.add(line.trim());
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (String[]) lines.toArray(new String[0]);
    }

    public static  String[] getDirFileName(String filePath) {

        File dir = new File(filePath);
        if (dir.isDirectory()) {
            String[] filesName  = dir.list();
            return filesName;
        }
        System.out.println("not directory");
        return null;
    }

    public static void writeToFile(String[] content, String filePath) {

            try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
                    for (String str: content) {
                        bw.write(str);
                        bw.newLine();
                     }
                     bw.flush();
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





}
