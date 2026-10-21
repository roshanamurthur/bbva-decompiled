package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class ConstraintTracker<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24508d = Logger.tagWithPrefix("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24509a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f24510b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f24511c;
    protected final Context mAppContext;
    protected final TaskExecutor mTaskExecutor;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List f24512p0;

        public a(ArrayList arrayList) {
            this.f24512p0 = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f24512p0.iterator();
            while (it.hasNext()) {
                ((ConstraintListener) it.next()).onConstraintChanged(ConstraintTracker.this.f24511c);
            }
        }
    }

    public ConstraintTracker(@NonNull Context context, @NonNull TaskExecutor taskExecutor) {
        this.mAppContext = context.getApplicationContext();
        this.mTaskExecutor = taskExecutor;
    }

    public void addListener(ConstraintListener<T> constraintListener) {
        synchronized (this.f24509a) {
            try {
                if (this.f24510b.add(constraintListener)) {
                    if (this.f24510b.size() == 1) {
                        this.f24511c = getInitialState();
                        Logger.get().debug(f24508d, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f24511c), new Throwable[0]);
                        startTracking();
                    }
                    constraintListener.onConstraintChanged(this.f24511c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract T getInitialState();

    public void removeListener(ConstraintListener<T> constraintListener) {
        synchronized (this.f24509a) {
            try {
                if (this.f24510b.remove(constraintListener) && this.f24510b.isEmpty()) {
                    stopTracking();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setState(T t10) {
        synchronized (this.f24509a) {
            try {
                T t11 = this.f24511c;
                if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                    this.f24511c = t10;
                    this.mTaskExecutor.getMainThreadExecutor().execute(new a(new ArrayList(this.f24510b)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
