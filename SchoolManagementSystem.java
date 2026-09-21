public class SchoolManagementSystem {
    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attendanceModule = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingModule = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryModule = new LibrarySystemAdapter(librarySystem);
        
        System.out.println("=====Unified School Management App=====");
        attendanceModule.integrateSystem();
        gradingModule.integrateSystem();
        libraryModule.integrateSystem();
    }
}