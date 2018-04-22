package com.company.util;

import com.company.FileOperate.FileService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CheckList {
    public String[] allName;
    public String[]  nameList;

    public CheckList(String[] allName , String[] nameList) {
        this.allName = allName;
        this.nameList = nameList;
    }

    public  String[]  getWithoutName() {

       ArrayList<String> name = new ArrayList<>(Arrays.asList(allName));
        for (String str : nameList) {
            Iterator<String> iterator = name.iterator();
            while (iterator.hasNext()) {
                String studentName = iterator.next();
                if (str.contains(studentName)) {
                    name.remove(studentName);
                    System.out.println(studentName);
                    break;
                }
            }
        }
        return name.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String studentNamePath = "E:\\standard\\util\\student_name.txt";
        String filePath = "E:\\standard\\18-a\\7\\实训\\作业";
        String resultPath = "E:\\standard\\util\\7实训作业.txt";
        CheckList checkList  = new CheckList(FileService.getFileContent(studentNamePath), FileService.getDirFileName(filePath));
        String[] names = checkList.getWithoutName();
        FileService.writeToFile(names,resultPath);
    }
}
