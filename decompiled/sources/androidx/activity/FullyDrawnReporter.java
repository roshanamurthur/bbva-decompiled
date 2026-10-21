package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\u0014\u0010\b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\b\u0010\t\u001a\u00020\u0002H\u0007R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "", "addReporter", "removeReporter", "Lkotlin/Function0;", "callback", "addOnReportDrawnListener", "removeOnReportDrawnListener", "fullyDrawnReported", "", "isFullyDrawnReported", "()Z", "Ljava/util/concurrent/Executor;", "executor", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class FullyDrawnReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Executor f317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    public int f320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("lock")
    public boolean f321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("lock")
    public boolean f322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("lock")
    @NotNull
    public final ArrayList f323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final o f324h;

    public FullyDrawnReporter(@NotNull Executor executor, @NotNull Function0<Unit> reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f317a = executor;
        this.f318b = reportFullyDrawn;
        this.f319c = new Object();
        this.f323g = new ArrayList();
        this.f324h = new o(this, 0);
    }

    public final void addOnReportDrawnListener(@NotNull Function0<Unit> callback) {
        boolean z10;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f319c) {
            if (this.f322f) {
                z10 = true;
            } else {
                this.f323g.add(callback);
                z10 = false;
            }
        }
        if (z10) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.f319c) {
            try {
                if (!this.f322f) {
                    this.f320d++;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.f319c) {
            try {
                this.f322f = true;
                Iterator it = this.f323g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f323g.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z10;
        synchronized (this.f319c) {
            z10 = this.f322f;
        }
        return z10;
    }

    public final void removeOnReportDrawnListener(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f319c) {
            this.f323g.remove(callback);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeReporter() {
        int i10;
        synchronized (this.f319c) {
            try {
                if (!this.f322f && (i10 = this.f320d) > 0) {
                    int i11 = i10 - 1;
                    this.f320d = i11;
                    if (!this.f321e && i11 == 0) {
                        this.f321e = true;
                        this.f317a.execute(this.f324h);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
