package DiaryPackage;

import java.util.ArrayList;

public class MikeDiary {
    private  ArrayList<Entry>entry = new ArrayList<>();
    private boolean isLocked;
    private String password;
    private int entryCounter=0;

    public MikeDiary(String username, String password) {
    }

    public ArrayList<Entry> getEntry() {
        return entry;
    }

    public void setEntry(ArrayList<Entry> entry) {
        this.entry = entry;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean diaryIsLocked() {
       return isLocked = true;
    }

    public boolean checkPassword(String password) {
        boolean answer;     String pass = "password";
        if (password.equals(pass)){ answer =true;
        }else {answer = false;}
        return  answer;
    }

    public Object createEntry(String b, String a) {
        Entry entry  = new Entry();
        entry.setBody(b);
        entry.setTitle(a);
        entryCounter++;
        return null;
    }
    public int countEntry(){
        return entryCounter;
//        return entry.size();
    }




}
