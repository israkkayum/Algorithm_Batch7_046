package com.mycompany.algorithm_final_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Activity {

    int start;
    int finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {

    public static void activity_selection(List<Activity> activities) {
        int n = activities.size();

        Collections.sort(activities, Comparator.comparingInt(a -> a.finish));

        List<Activity> selectedActivities = new ArrayList<>();
        selectedActivities.add(activities.get(0));
        int lastSelected = 0;

        for (int i = 1; i < n; i++) {
            if (activities.get(i).start >= activities.get(lastSelected).finish) {
                selectedActivities.add(activities.get(i));
                lastSelected = i;
            }
        }

        System.out.println(" Selected Activities:");
        for (Activity activity : selectedActivities) {
            System.out.println(" Start time: " + activity.start + ", Finish time: " + activity.finish);
        }
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the number of activities: ");
        int n = s.nextInt();

        List<Activity> activities = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println(" Enter the start and finish times for activity " + (i + 1) + ":");
            System.out.print(" Start time: ");
            int start = s.nextInt();
            System.out.print(" Finish time: ");
            int finish = s.nextInt();
            activities.add(new Activity(start, finish));
        }

        activity_selection(activities);
    }

}
