public class StudentManagement implements Management{
    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        
    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {

    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        return null;
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return null;
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        return null;
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return null;
    }
}
