package com.noknok.android.client.utils;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class EventQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<EventTask> f63435a = new ArrayList();

    public class EventTask extends BaseTask<Void> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f63436c = EventTask.class.getSimpleName();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ActivityProxy f63437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Runnable f63438e;

        public EventTask(ActivityProxy activityProxy, Runnable runnable) {
            this.f63437d = activityProxy;
            this.f63438e = runnable;
        }

        @Override // com.noknok.android.client.utils.BaseTask
        public void doInBackground(Void... voidArr) {
            try {
                this.f63438e.run();
            } finally {
                ActivityProxy activityProxy = this.f63437d;
                if (activityProxy != null) {
                    activityProxy.finish();
                }
                EventQueue.this.a();
            }
        }

        @Override // com.noknok.android.client.utils.BaseTask
        public void handleException(RuntimeException runtimeException, Void... voidArr) {
            Logger.e(this.f63436c, "Failed to process event", runtimeException);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.utils.EventQueue$EventTask>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.utils.EventQueue$EventTask>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.utils.EventQueue$EventTask>] */
    public final synchronized void a() {
        this.f63435a.remove(0);
        if (!this.f63435a.isEmpty()) {
            ((EventTask) this.f63435a.get(0)).execute(new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.utils.EventQueue$EventTask>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.utils.EventQueue$EventTask>] */
    public synchronized void triggerEvent(ActivityProxy activityProxy, Runnable runnable) {
        EventTask eventTask = new EventTask(activityProxy, runnable);
        boolean zIsEmpty = this.f63435a.isEmpty();
        this.f63435a.add(eventTask);
        if (zIsEmpty) {
            eventTask.execute(new Void[0]);
        }
    }
}
