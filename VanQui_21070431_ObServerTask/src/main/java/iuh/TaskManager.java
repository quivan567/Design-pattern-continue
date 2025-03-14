package iuh;

public class TaskManager extends Subject {
    private String taskStatus;

    public void setTaskStatus(String status) {
        this.taskStatus = status;
        notifyObservers("Trang thai cong viec thay doi: " + status);
    }
}
