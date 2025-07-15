public class Problems {
    private String name;
    private String info;
    private String date;

    public Problems(String name, String about, String date) {
        this.name = name;
        this.info = about;
        this.date = date;
    }

    public void printInfo() {
        System.out.println("Задача: " + name);
        System.out.println("Содержание: " + info);
        System.out.println("Дата: " + date);
    }
    public boolean nameComparison(String name) {
        return this.name.contains(name);
    }
}


