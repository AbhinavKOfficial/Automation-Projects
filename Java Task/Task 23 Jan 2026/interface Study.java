interface Study {
    void study();
}

interface Play {
    void play();
}

class Student implements Study, Play {

    @Override
    public void study() {
        System.out.println("Student is studying.");
    }

    @Override
    public void play() {
        System.out.println("Student is playing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        s.play();
    }
}