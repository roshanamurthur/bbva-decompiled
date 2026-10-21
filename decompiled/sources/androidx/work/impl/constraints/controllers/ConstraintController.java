package androidx.work.impl.constraints.controllers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24497a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f24498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintTracker<T> f24499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnConstraintUpdatedCallback f24500d;

    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(@NonNull List<String> list);

        void onConstraintNotMet(@NonNull List<String> list);
    }

    public ConstraintController(ConstraintTracker<T> constraintTracker) {
        this.f24499c = constraintTracker;
    }

    public abstract boolean a(@NonNull WorkSpec workSpec);

    public abstract boolean b(@NonNull T t10);

    public final void c(@Nullable OnConstraintUpdatedCallback onConstraintUpdatedCallback, @Nullable T t10) {
        ArrayList arrayList = this.f24497a;
        if (arrayList.isEmpty() || onConstraintUpdatedCallback == null) {
            return;
        }
        if (t10 == null || b(t10)) {
            onConstraintUpdatedCallback.onConstraintNotMet(arrayList);
        } else {
            onConstraintUpdatedCallback.onConstraintMet(arrayList);
        }
    }

    public boolean isWorkSpecConstrained(@NonNull String str) {
        T t10 = this.f24498b;
        return t10 != null && b(t10) && this.f24497a.contains(str);
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(@Nullable T t10) {
        this.f24498b = t10;
        c(this.f24500d, t10);
    }

    public void replace(@NonNull Iterable<WorkSpec> iterable) {
        ArrayList arrayList = this.f24497a;
        arrayList.clear();
        for (WorkSpec workSpec : iterable) {
            if (a(workSpec)) {
                arrayList.add(workSpec.id);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ConstraintTracker<T> constraintTracker = this.f24499c;
        if (zIsEmpty) {
            constraintTracker.removeListener(this);
        } else {
            constraintTracker.addListener(this);
        }
        c(this.f24500d, this.f24498b);
    }

    public void reset() {
        ArrayList arrayList = this.f24497a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.clear();
        this.f24499c.removeListener(this);
    }

    public void setCallback(@Nullable OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.f24500d != onConstraintUpdatedCallback) {
            this.f24500d = onConstraintUpdatedCallback;
            c(onConstraintUpdatedCallback, this.f24498b);
        }
    }
}
