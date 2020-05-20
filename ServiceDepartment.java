import java.time.LocalDateTime;

public class ServiceDepartment extends Department {
    // Constructor with deptName and numEmployees given
    public ServiceDepartment() {
        super("Service", 20);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return false;
        } else {
            return true;
        }
    }
}