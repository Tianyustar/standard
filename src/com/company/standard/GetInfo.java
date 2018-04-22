package com.company.standard;

import com.company.FileOperate.FileService;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GetInfo {

    public static HashMap<String , Student> getList(String[] lines) {
        // 格式 学号 姓名 邮箱
        HashMap<String, Student> hashMap = new HashMap<>();
        for (String line: lines) {
            String[] info = line.split("  ");
            Student student  = new Student(info[0].trim(),info[1].trim(),info[2].trim());
            hashMap.put(student.getName(),student);
        }
        return hashMap;
    }
    public static void main(String[] args) {

        String[] info = FileService.getFileContent("E:\\standard\\docu\\sum.txt");
        String[] name = FileService.getFileContent("E:\\standard\\docu\\result_name.txt");
        HashMap<String , Student> hashMap = GetInfo.getList(info);
        ArrayList<String> result = new ArrayList<>();

        for (String str: name) {

            Student student = hashMap.get(str);
            if (student !=  null) {
                result.add(hashMap.get(str).toLine());

            }
        }
        FileService.writeToFile((String[]) result.toArray(new String[0]),"E:\\standard\\docu\\result.txt");
    }
}
