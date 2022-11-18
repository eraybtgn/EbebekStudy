public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mehmet Hoca","905555555500", "Elektrik");
        Teacher t2 = new Teacher("Güner Tata","90551111111", "Elektronik");
        Teacher t3 = new Teacher("Hamit Torpi","90552222222", "Manyetik Alan");

        Course mat = new Course("Elektrik","Elk101","Elk");
        Course fzk = new Course("Elektronik", "Elktrnk101","Elktrnk");
        Course kmy = new Course("Manyetik","My101","MY");

        mat.addTeacher(t1);
        fzk.addTeacher(t2);
        kmy.addTeacher(t3);

        Student s1 = new Student("Ali Kara", 3,"1921241029",mat, fzk,kmy);
        s1.addExamNote(65,32,45);
        s1.addsozluNote(90,80,95);
        s1.isPass();

        Student s2 = new Student("Deli Necmi",2,"200203004",mat,fzk,kmy);
        s2.addExamNote(76,55,34);
        s2.addsozluNote(100,85,90);
        s2.isPass();
    }
}
