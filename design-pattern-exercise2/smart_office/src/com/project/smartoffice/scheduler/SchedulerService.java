package com.project.smartoffice.scheduler;

import com.project.smartoffice.util.AppLogger;

import java.util.concurrent.*;

public class SchedulerService {
    private static SchedulerService instance;
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    private SchedulerService() {}

    public static synchronized SchedulerService getInstance() {
        if(instance == null) instance = new SchedulerService();
        return instance;
    }

    public void schedule(Runnable task, int delaySeconds) {
        scheduler.schedule(task, delaySeconds, TimeUnit.SECONDS);
        AppLogger.log("Task scheduled in " + delaySeconds + " seconds.");
    }
}
