public class Student {
    private String failCount;  //不及格次数
    private String name;     //名字
    private String chineseTeacher; //科任老师
    private String classTeacher;   //班主任

    public String getFailCount() {
        return failCount;
    }

    public void setFailCount(String failCount) {
        this.failCount = failCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChineseTeacher() {
        return chineseTeacher;
    }

    public void setChineseTeacher(String chineseTeacher) {
        this.chineseTeacher = chineseTeacher;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }
}
