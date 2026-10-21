package com.google.firebase.storage.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class ActivityLifecycleListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ActivityLifecycleListener f49118c = new ActivityLifecycleListener();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f49119a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49120b = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Activity f49121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Runnable f49122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final Object f49123c;

        public a(@NonNull Activity activity, @NonNull Object obj, @NonNull Runnable runnable) {
            this.f49121a = activity;
            this.f49122b = runnable;
            this.f49123c = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f49123c.equals(this.f49123c) && aVar.f49122b == this.f49122b && aVar.f49121a == this.f49121a;
        }

        public final int hashCode() {
            return this.f49123c.hashCode();
        }
    }

    public static class b extends LifecycleCallback {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayList f49124p0;

        public b(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.f49124p0 = new ArrayList();
            this.mLifecycleFragment.addCallback("StorageOnStopCallback", this);
        }

        public final void a(a aVar) {
            synchronized (this.f49124p0) {
                this.f49124p0.add(aVar);
            }
        }

        public final void b(a aVar) {
            synchronized (this.f49124p0) {
                this.f49124p0.remove(aVar);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        @MainThread
        public final void onStop() {
            ArrayList<a> arrayList;
            synchronized (this.f49124p0) {
                arrayList = new ArrayList(this.f49124p0);
                this.f49124p0.clear();
            }
            for (a aVar : arrayList) {
                if (aVar != null) {
                    aVar.f49122b.run();
                    ActivityLifecycleListener.getInstance().removeCookie(aVar.f49123c);
                }
            }
        }
    }

    @NonNull
    public static ActivityLifecycleListener getInstance() {
        return f49118c;
    }

    public void removeCookie(@NonNull Object obj) {
        synchronized (this.f49120b) {
            try {
                a aVar = (a) this.f49119a.get(obj);
                if (aVar != null) {
                    LifecycleFragment fragment = LifecycleCallback.getFragment(new LifecycleActivity(aVar.f49121a));
                    b bVar = (b) fragment.getCallbackOrNull("StorageOnStopCallback", b.class);
                    if (bVar == null) {
                        bVar = new b(fragment);
                    }
                    bVar.b(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void runOnActivityStopped(@NonNull Activity activity, @NonNull Object obj, @NonNull Runnable runnable) {
        synchronized (this.f49120b) {
            a aVar = new a(activity, obj, runnable);
            LifecycleFragment fragment = LifecycleCallback.getFragment(new LifecycleActivity(activity));
            b bVar = (b) fragment.getCallbackOrNull("StorageOnStopCallback", b.class);
            if (bVar == null) {
                bVar = new b(fragment);
            }
            bVar.a(aVar);
            this.f49119a.put(obj, aVar);
        }
    }
}
