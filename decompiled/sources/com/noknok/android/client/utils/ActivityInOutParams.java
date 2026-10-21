package com.noknok.android.client.utils;

import android.app.Activity;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class ActivityInOutParams {
    public static final String SDATA_HASHCODE = "SDATA_HASHCODE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<Integer, ActivityInOutParams> f63397e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f63398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f63399b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Semaphore f63400c = new Semaphore(0, true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63401d = false;

    private ActivityInOutParams(Object obj) {
        this.f63398a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.noknok.android.client.utils.ActivityInOutParams>] */
    private static ActivityInOutParams a(Activity activity) {
        ActivityInOutParams activityInOutParams;
        ?? r1 = f63397e;
        synchronized (r1) {
            activityInOutParams = (ActivityInOutParams) r1.get(Integer.valueOf(activity.getIntent().getIntExtra(SDATA_HASHCODE, 0)));
        }
        return activityInOutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.noknok.android.client.utils.ActivityInOutParams>] */
    private static ActivityInOutParams b(Activity activity) {
        ActivityInOutParams activityInOutParams;
        ?? r1 = f63397e;
        synchronized (r1) {
            activityInOutParams = (ActivityInOutParams) r1.remove(Integer.valueOf(activity.getIntent().getIntExtra(SDATA_HASHCODE, 0)));
        }
        return activityInOutParams;
    }

    public static <IN> IN getDataAndRemove(Activity activity) {
        ActivityInOutParams activityInOutParamsB = b(activity);
        if (activityInOutParamsB != null) {
            return (IN) activityInOutParamsB.f63398a;
        }
        return null;
    }

    public static <IN> IN getIncomingData(Activity activity) {
        ActivityInOutParams activityInOutParamsA = a(activity);
        if (activityInOutParamsA != null) {
            return (IN) activityInOutParamsA.f63398a;
        }
        return null;
    }

    public static boolean onActivityCreate(Activity activity) {
        ActivityInOutParams activityInOutParamsA = a(activity);
        if (activityInOutParamsA == null) {
            activity.finish();
            return false;
        }
        if (activityInOutParamsA.f63401d) {
            return false;
        }
        activityInOutParamsA.f63401d = true;
        activityInOutParamsA.f63400c.release();
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.noknok.android.client.utils.ActivityInOutParams>] */
    public static <IN> ActivityInOutParams publish(IN in2, Intent intent) {
        ActivityInOutParams activityInOutParams = new ActivityInOutParams(in2);
        ?? r3 = f63397e;
        synchronized (r3) {
            r3.put(Integer.valueOf(activityInOutParams.hashCode()), activityInOutParams);
        }
        intent.putExtra(SDATA_HASHCODE, activityInOutParams.hashCode());
        return activityInOutParams;
    }

    public static <OUT> void setResult(Activity activity, OUT out) {
        ActivityInOutParams activityInOutParamsB = b(activity);
        if (activityInOutParamsB != null) {
            activityInOutParamsB.f63399b = out;
            activityInOutParamsB.f63400c.release();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.noknok.android.client.utils.ActivityInOutParams>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.noknok.android.client.utils.ActivityInOutParams>] */
    public <OUT> OUT waitForResult() {
        try {
            if (this.f63400c.tryAcquire(2000L, TimeUnit.MILLISECONDS)) {
                this.f63400c.acquire();
                return (OUT) this.f63399b;
            }
            ?? r1 = f63397e;
            synchronized (r1) {
                r1.remove(Integer.valueOf(hashCode()));
            }
            throw new IllegalStateException("The target Activity doesn't start within 2000ms");
        } catch (InterruptedException e5) {
            ?? r3 = f63397e;
            synchronized (r3) {
                r3.remove(Integer.valueOf(hashCode()));
                throw new IllegalStateException("Failed to get the response from the target Activity", e5);
            }
        }
    }
}
