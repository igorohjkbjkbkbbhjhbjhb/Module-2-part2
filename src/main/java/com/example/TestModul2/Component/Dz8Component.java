package com.example.TestModul2.Component;
import org.springframework.stereotype.Component;

@Component
public class Dz8Component {
    private int totalTasks;
    private int completedTasts;
    private int pendingTasks;

    public int getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(int totalTasks) {
        this.totalTasks = totalTasks;
    }

    public int getCompletedTasts() {
        return completedTasts;
    }

    public void setCompletedTasts(int completedTasts) {
        this.completedTasts = completedTasts;
    }

    public int getPendingTasks() {
        return pendingTasks;
    }

    public void setPendingTasks(int pendingTasks) {
        this.pendingTasks = pendingTasks;
    }

    public Dz8Component(){}
}
