package com.salesforce.marketingcloud.behaviors;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class LifecycleManager extends f implements LifecycleObserver {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    static LifecycleManager f64042g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Application f64043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f64044e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    AtomicBoolean f64045f = new AtomicBoolean(false);

    private LifecycleManager(Application application) {
        this.f64043d = application;
    }

    public static synchronized LifecycleManager a(Application application) {
        try {
            if (f64042g == null) {
                f64042g = new LifecycleManager(application);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f64042g;
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "LifecycleManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onApplicationBackgrounded() {
        if (this.f64045f.getAndSet(false)) {
            g.a(c.f64064k, "Application went into the background.", new Object[0]);
            c.a(this.f64043d, a.BEHAVIOR_APP_BACKGROUNDED, new Bundle());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onApplicationForegrounded() {
        if (this.f64045f.getAndSet(true) || !this.f64044e.get()) {
            return;
        }
        g.a(c.f64064k, "Application came into the foreground.", new Object[0]);
        c.a(this.f64043d, a.BEHAVIOR_APP_FOREGROUNDED, new Bundle());
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        this.f64044e.set(false);
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        this.f64044e.set(true);
        if (this.f64045f.get()) {
            c.a(this.f64043d, a.BEHAVIOR_APP_FOREGROUNDED, null);
        }
    }
}
