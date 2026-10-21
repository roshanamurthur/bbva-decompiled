package com.bbva.androidtoolkit.plugin.component;

import android.app.Activity;
import com.bbva.androidtoolkit.optional.Optional;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f26519a;

    public ActivityContainer() {
    }

    public Optional<Activity> get() {
        WeakReference<Activity> weakReference = this.f26519a;
        return Optional.ofNullable(weakReference == null ? null : weakReference.get());
    }

    public void set(Activity activity) {
        WeakReference<Activity> weakReference = this.f26519a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f26519a = new WeakReference<>(activity);
    }

    public ActivityContainer(Activity activity) {
        this.f26519a = new WeakReference<>(activity);
    }
}
