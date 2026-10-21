package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;

/* JADX INFO: compiled from: ConstraintsCommandHandler.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24477d = Logger.tagWithPrefix("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkConstraintsTracker f24480c;

    public a(@NonNull Context context, int i10, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f24478a = context;
        this.f24479b = i10;
        this.f24480c = new WorkConstraintsTracker(context, systemAlarmDispatcher.f24459q0, null);
    }
}
