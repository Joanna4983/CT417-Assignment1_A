package com.JO.SoftEng3Assignment1;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.List;

public class Course {

    String cName;
    List<Module> modList;
    DateTime dtStart;
    DateTime dtFinish;

    public Course(String cName, List modList, String dtStart, String dtFinish) {
        this.cName = cName;
        this.modList = modList;


        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");

        this.dtStart = dtf.parseDateTime(dtStart);
        this.dtFinish = dtf.parseDateTime(dtFinish);

    }

    public String getCourseName(){return cName;}

    public List<Module> getModuleList(){return modList;}

    public DateTime getStartDate(){return dtStart;}

    public DateTime getFinDate(){return dtFinish;}

//    public String toString(List modlist){
//        String a = "";
//        for(i=0; i<modList.size(); i++){
//            a += modList[i].getModName() + " ";
//            //a="foo";
//        }
//        return a;
//    }
}
