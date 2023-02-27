public enum Week {
    MONDAY("����һ"),
    TUESDAY("���ڶ�"),
    WEDNESDAY("������"),
    THURSDAY("������"),
    FRIDAY("������"),
    SATURDAY("������"),
    SUNDAY("������");

    private final String description;

    private Week(String description){
        this.description = description;
    }

    @Override
    public String toString() {
//        return super.toString() +":"+ description;
        return toString() +","+ description;
    }
}
