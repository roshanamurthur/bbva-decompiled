package com.noknok.android.client.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public class ActivityProxy {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final HashMap<Integer, ActivityProxy> f63402n = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData<IActivityCommand> f63403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f63404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Semaphore f63405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f63407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f63408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f63409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ComponentName f63410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Intent f63411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Uri f63412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f63413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f63414l;
    private ActivityLifeCycleListener m;

    public interface ActivityLifeCycleListener {
        void onActivityDestroy(AppCompatActivity appCompatActivity);
    }

    public interface IActivityCommand {
        void executeInActivity(Activity activity);
    }

    private ActivityProxy(Activity activity, boolean z10) {
        this.f63403a = new MutableLiveData<>();
        this.f63405c = new Semaphore(0, true);
        this.f63406d = false;
        this.f63407e = true;
        this.f63414l = z10;
        this.f63408f = activity.getApplicationContext();
        this.f63409g = activity.getCallingPackage();
        this.f63410h = activity.getCallingActivity();
        this.f63411i = activity.getIntent();
        this.f63412j = b(activity);
        this.f63413k = a(activity);
        a();
    }

    public static ActivityProxy createFromActivity(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity is required");
        }
        Logger.i("ActivityProxy", String.format("ActivityProxy starts new Worker Activity. Was created from: %s", activity.getClass().getName()));
        ActivityProxy activityProxy = new ActivityProxy(activity, true);
        Intent intent = new Intent(activity, (Class<?>) WorkerActivity.class);
        intent.putExtra("AP_HASHCODE", activityProxy.hashCode());
        activity.startActivity(intent);
        return activityProxy;
    }

    public static ActivityProxy createFromAppContext(Context context, boolean z10) {
        if (context == null) {
            throw new IllegalArgumentException("Context is required");
        }
        ActivityProxy activityProxy = new ActivityProxy(context, z10);
        if (z10) {
            Intent intent = new Intent(context, (Class<?>) WorkerActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("AP_HASHCODE", activityProxy.hashCode());
            context.startActivity(intent);
            activityProxy.f63411i = intent;
            Logger.i("ActivityProxy", "ActivityProxy starts new Worker Activity. Was created from the context");
        }
        return activityProxy;
    }

    public static ActivityProxy find(Activity activity) {
        try {
            return ((WorkerActivity) activity).getActivityProxy();
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    public static ActivityProxy onActivityCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        ActivityProxy activityProxy;
        int intExtra = appCompatActivity.getIntent().getIntExtra("AP_HASHCODE", 0);
        ActivityProxy activityProxy2 = null;
        if (intExtra == 0) {
            if (bundle != null) {
                int i10 = bundle.getInt("AP_HASHCODE", 0);
                synchronized (ActivityProxy.class) {
                    activityProxy = f63402n.get(Integer.valueOf(i10));
                }
                if (activityProxy == null) {
                    Logger.i("ActivityProxy", "Activity Proxy is not present in the hashmap.");
                    return null;
                }
            }
            if (activityProxy2 == null) {
                activityProxy2 = new ActivityProxy((Activity) appCompatActivity, false);
            }
            Logger.i("ActivityProxy", String.format("ActivityProxy will use Activity: %s", appCompatActivity.getClass().getName()));
            activityProxy2.getLiveData().observe(appCompatActivity, new n4.f(appCompatActivity, 2));
            return activityProxy2;
        }
        synchronized (ActivityProxy.class) {
            activityProxy = f63402n.get(Integer.valueOf(intExtra));
        }
        if (activityProxy == null) {
            Logger.i("ActivityProxy", "Activity Proxy is not present in the hashmap. Finish Worker Activity.");
            appCompatActivity.finish();
            return null;
        }
        activityProxy2 = activityProxy;
        if (activityProxy2 == null) {
            activityProxy2 = new ActivityProxy((Activity) appCompatActivity, false);
        }
        Logger.i("ActivityProxy", String.format("ActivityProxy will use Activity: %s", appCompatActivity.getClass().getName()));
        activityProxy2.getLiveData().observe(appCompatActivity, new n4.f(appCompatActivity, 2));
        return activityProxy2;
    }

    public Intent createIntent(final Class<?> cls) {
        return (Intent) executeInActivity(new IActivityCommand() { // from class: com.noknok.android.client.utils.b
            @Override // com.noknok.android.client.utils.ActivityProxy.IActivityCommand
            public final void executeInActivity(Activity activity) {
                this.f63494a.a(cls, activity);
            }
        });
    }

    public Object executeInActivity(IActivityCommand iActivityCommand) {
        Object obj;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Would block the Main thread");
        }
        synchronized (this) {
            if (this.f63406d) {
                throw new IllegalStateException("Activity is finished");
            }
            if (!this.f63407e) {
                throw new IllegalStateException("Activity Proxy was not converted from Activity");
            }
            this.f63403a.postValue(iActivityCommand);
            try {
                this.f63405c.acquire();
                obj = this.f63404b;
                if (obj instanceof InterruptedException) {
                    throw ((InterruptedException) obj);
                }
                this.f63404b = null;
            } catch (InterruptedException e5) {
                throw new IllegalStateException("ActivityProxy waiting thread interrupted", e5);
            }
        }
        return obj;
    }

    public void finish() {
        synchronized (this) {
            try {
                if (!this.f63406d && this.f63407e && this.f63414l) {
                    executeInActivity(new IActivityCommand() { // from class: com.noknok.android.client.utils.c
                        @Override // com.noknok.android.client.utils.ActivityProxy.IActivityCommand
                        public final void executeInActivity(Activity activity) {
                            this.f63496a.c(activity);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Context getApplicationContext() {
        return this.f63408f;
    }

    public ComponentName getCallingActivity() {
        return this.f63410h;
    }

    public String getCallingPackage() {
        return this.f63409g;
    }

    public Intent getIntent() {
        return this.f63411i;
    }

    public MutableLiveData<IActivityCommand> getLiveData() {
        return this.f63403a;
    }

    public String getRefAppPackage() {
        return this.f63413k;
    }

    public Uri getReferrer() {
        return this.f63412j;
    }

    public Activity getWorkerActivity() {
        return (Activity) executeInActivity(new IActivityCommand() { // from class: com.noknok.android.client.utils.d
            @Override // com.noknok.android.client.utils.ActivityProxy.IActivityCommand
            public final void executeInActivity(Activity activity) {
                this.f63497a.onResult(activity);
            }
        });
    }

    public boolean hasActivity() {
        return this.f63407e;
    }

    public void onActivityDestroy(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.isFinishing() && !appCompatActivity.isChangingConfigurations()) {
            this.f63406d = true;
            synchronized (ActivityProxy.class) {
                f63402n.remove(Integer.valueOf(hashCode()));
            }
            onResult(new InterruptedException("Activity destroyed"));
        }
        ActivityLifeCycleListener activityLifeCycleListener = this.m;
        if (activityLifeCycleListener != null) {
            activityLifeCycleListener.onActivityDestroy(appCompatActivity);
        }
    }

    public void onActivitySaveSate(Bundle bundle) {
        bundle.putInt("AP_HASHCODE", hashCode());
    }

    public void onResult(Object obj) {
        this.f63404b = obj;
        this.f63403a.postValue(null);
        this.f63405c.release();
    }

    public void setIntentClass(final Intent intent, final Class<?> cls) {
        executeInActivity(new IActivityCommand() { // from class: com.noknok.android.client.utils.e
            @Override // com.noknok.android.client.utils.ActivityProxy.IActivityCommand
            public final void executeInActivity(Activity activity) {
                this.f63498a.a(intent, cls, activity);
            }
        });
    }

    public void setListener(ActivityLifeCycleListener activityLifeCycleListener) {
        this.m = activityLifeCycleListener;
    }

    public void startActivity(final Intent intent) {
        if (this.f63407e) {
            executeInActivity(new IActivityCommand() { // from class: com.noknok.android.client.utils.a
                @Override // com.noknok.android.client.utils.ActivityProxy.IActivityCommand
                public final void executeInActivity(Activity activity) {
                    this.f63492a.a(intent, activity);
                }
            });
        } else {
            intent.addFlags(335544320);
            this.f63408f.startActivity(intent);
        }
    }

    public <IN, OUT> OUT startActivityForResult(Intent intent, IN in2) {
        ActivityInOutParams activityInOutParamsPublish = ActivityInOutParams.publish(in2, intent);
        startActivity(intent);
        return (OUT) activityInOutParamsPublish.waitForResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AppCompatActivity appCompatActivity, IActivityCommand iActivityCommand) {
        if (iActivityCommand != null) {
            iActivityCommand.executeInActivity(appCompatActivity);
        }
    }

    @Nullable
    private Uri b(Activity activity) {
        return activity.getReferrer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(0, 0);
        onResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Class cls, Activity activity) {
        onResult(new Intent(activity, (Class<?>) cls));
    }

    private Uri b(Context context) {
        return new Uri.Builder().scheme("android-app").authority(context.getPackageName()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, Class cls, Activity activity) {
        onResult(intent.setClass(activity, cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, Activity activity) {
        activity.startActivity(intent);
        onResult(null);
    }

    private void a() {
        synchronized (ActivityProxy.class) {
            f63402n.put(Integer.valueOf(hashCode()), this);
        }
    }

    @Nullable
    private String a(Activity activity) {
        try {
            Field declaredField = Activity.class.getDeclaredField("mReferrer");
            declaredField.setAccessible(true);
            return (String) declaredField.get(activity);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Logger.i("ActivityProxy", "Failed to get refAppPackage");
            return null;
        }
    }

    private ActivityProxy(Context context, boolean z10) {
        this.f63403a = new MutableLiveData<>();
        this.f63405c = new Semaphore(0, true);
        this.f63406d = false;
        this.f63407e = z10;
        this.f63414l = z10;
        this.f63408f = context.getApplicationContext();
        this.f63409g = null;
        this.f63410h = null;
        this.f63411i = null;
        if (z10) {
            this.f63412j = b(context);
            this.f63413k = a(context);
            a();
        } else {
            this.f63412j = null;
            this.f63413k = null;
        }
    }

    private String a(Context context) {
        return context.getPackageName();
    }
}
