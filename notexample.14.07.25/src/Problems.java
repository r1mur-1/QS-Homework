public class Problems {
    private String name;
    private String info;
    private String date;
    public static int count = 0;

    public Problems(String name, String info, String date) {
        this.name = name;
        this.info = info;
        this.date = date;
        count++;
    }

    public void printInfo() {
        System.out.println("Задача: " + name);
        System.out.println("Содержание: " + info);
        System.out.println("Дата: " + date);
    }

    public boolean nameComparison(String name) {
        return this.name.contains(name);
    }

    public String getName() { return name; }
    public String getInfo() { return info; }
    public String getDate() { return date; }

    public Problems(Problems problem) {
        this(problem.getName(), problem.getInfo(), problem.getDate());
    }
}


