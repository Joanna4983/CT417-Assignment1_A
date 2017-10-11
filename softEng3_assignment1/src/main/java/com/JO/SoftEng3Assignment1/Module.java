package com.JO.SoftEng3Assignment1;

import java.util.List;

public class Module {

    String modName;
    String modCode;
    List<Student> studentList;

    public Module(String modName, String modCode, List studentList) {
        this.modName = modName;
        this.modCode = modCode;
        this.studentList = studentList;
    }

    public String getModName() {
        return modName;
    }

    public String getModCode() {
        return modCode;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
