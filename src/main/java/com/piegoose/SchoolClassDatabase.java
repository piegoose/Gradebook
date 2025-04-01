package com.piegoose;

import java.util.HashMap;
import java.util.Map;

public class SchoolClassDatabase {
    // todo metody ktore zarzadzaja klasami w szkole

    private Map<String, SchoolClass> imMemoryDatabase = new HashMap<>();

    public void addSchoolClassToDatabase(SchoolClass schoolClass){

        String schoolClassName = schoolClass.getSchoolClassName();
        if(imMemoryDatabase.containsKey(schoolClassName)){
            throw new IllegalStateException("Klasa o nazwie: " + schoolClassName + " juz istnieje");
        }
        imMemoryDatabase.put(schoolClassName, schoolClass);

    }
        public void removeSchoolClass(String schoolClassname){
            if(!imMemoryDatabase.containsKey(schoolClassname)){
                throw new IllegalStateException("Nie istenieje taka klasa");
            }
            imMemoryDatabase.remove(schoolClassname);

        }





}
