package designPattern.Prototype;

// 原型模式（浅克隆、深克隆）
public class ProtoType {

    static class Student implements Cloneable {
        String name;
        Teacher teacher;

        Student(String name, Teacher teacher) {
            this.name = name;
            this.teacher = teacher;
        }

        // 浅克隆的克隆方法
//        public Student clone() {
//            try {
//                return (Student) super.clone();
//            } catch (CloneNotSupportedException e) {
//                e.printStackTrace();-
//            }
//            return null;
//        }

        // 深克隆的克隆方法
        public Student clone() {
            try {
                Student clone = (Student) super.clone();
                clone.teacher = clone.teacher.clone();
                return clone;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    static class Teacher implements Cloneable {
        String name;

        Teacher(String name) {
            this.name = name;
        }

        public Teacher clone() {
            try {
                return (Teacher) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher("A");
        Student student = new Student("A", teacher);

        Student cloneStudent = student.clone();

        System.out.println(student == cloneStudent);
        System.out.println(student.name.equals(cloneStudent.name));
        System.out.println(student.teacher == cloneStudent.teacher);

    }

}
