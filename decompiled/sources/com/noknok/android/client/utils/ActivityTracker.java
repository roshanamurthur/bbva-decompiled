package com.noknok.android.client.utils;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ActivityTracker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ActivityTracker f63416c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63418a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63415b = ActivityData.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SparseArray<ActivityData> f63417d = new SparseArray<>();

    public static class ActivityData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Activity f63419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ActivityUpdater> f63420b = new ArrayList();

        public ActivityData(Activity activity) {
            this.f63419a = activity;
        }
    }

    public interface ActivityUpdater {
        void update(Activity activity);
    }

    public static class SetResultUpdater implements ActivityUpdater {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f63421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f63422b;

        public SetResultUpdater(int i10, Intent intent) {
            this.f63421a = i10;
            this.f63422b = intent;
        }

        @Override // com.noknok.android.client.utils.ActivityTracker.ActivityUpdater
        public void update(Activity activity) {
            activity.setResult(this.f63421a, this.f63422b);
            activity.finish();
        }
    }

    public static ActivityTracker getActivityTracker() {
        if (f63416c == null) {
            f63416c = new ActivityTracker();
        }
        return f63416c;
    }

    public int generateActivityId() {
        int i10 = this.f63418a;
        this.f63418a = i10 + 1;
        return i10;
    }

    public void onCreateActivity(int i10, Activity activity) {
        SparseArray<ActivityData> sparseArray = f63417d;
        ActivityData activityData = sparseArray.get(i10);
        if (activityData == null) {
            sparseArray.put(i10, new ActivityData(activity));
            return;
        }
        activityData.f63419a = activity;
        Iterator it = activityData.f63420b.iterator();
        while (it.hasNext()) {
            ((ActivityUpdater) it.next()).update(activity);
        }
        activityData.f63420b.clear();
    }

    public void onDestroyActivity(int i10) {
        Activity activity;
        SparseArray<ActivityData> sparseArray = f63417d;
        ActivityData activityData = sparseArray.get(i10);
        if (activityData == null || (activity = activityData.f63419a) == null) {
            Logger.e(f63415b, "onDestroyActivity called multiple times");
        } else if (activity.isFinishing()) {
            sparseArray.remove(i10);
        } else {
            activityData.f63419a = null;
        }
    }

    public void updateActivity(int i10, ActivityUpdater activityUpdater) {
        ActivityData activityData = f63417d.get(i10);
        if (activityData == null) {
            Logger.w(f63415b, "Not updating activity has been permanently deleted");
            return;
        }
        Activity activity = activityData.f63419a;
        if (activity == null) {
            activityData.f63420b.add(activityUpdater);
        } else {
            activityUpdater.update(activity);
        }
    }
}
