package huy.recyclerview;

public class Student {
    private String mName;
    private String mAddress;

    public Student() {
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public Student(String mName, String mAddress) {
        this.mName = mName;
        this.mAddress = mAddress;
    }
}
