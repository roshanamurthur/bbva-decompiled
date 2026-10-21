package androidx.lifecycle;

import android.os.SystemClock;
import androidx.room.AutoCloser;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.bbva.ui.widget.BbvaTextView;
import com.google.android.material.motion.MaterialBackOrchestrator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f22064p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f22065q0;

    public /* synthetic */ b(Object obj, int i10) {
        this.f22064p0 = i10;
        this.f22065q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Unit unit;
        switch (this.f22064p0) {
            case 0:
                ComputableLiveData this$0 = (ComputableLiveData) this.f22065q0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean zHasActiveObservers = this$0.getLiveData().hasActiveObservers();
                if (this$0.f21826c.compareAndSet(false, true) && zHasActiveObservers) {
                    this$0.f21824a.execute(this$0.refreshRunnable);
                    return;
                }
                return;
            case 1:
                AutoCloser this$1 = (AutoCloser) this.f22065q0;
                AutoCloser.Companion companion = AutoCloser.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                synchronized (this$1.f23111c) {
                    try {
                        if (SystemClock.uptimeMillis() - this$1.lastDecrementRefCountTimeStamp < this$1.f23112d) {
                            return;
                        }
                        if (this$1.refCount != 0) {
                            return;
                        }
                        Runnable runnable = this$1.onAutoCloseCallback;
                        if (runnable != null) {
                            runnable.run();
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                        }
                        SupportSQLiteDatabase supportSQLiteDatabase = this$1.delegateDatabase;
                        if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                            supportSQLiteDatabase.close();
                        }
                        this$1.delegateDatabase = null;
                        Unit unit2 = Unit.INSTANCE;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 2:
                BbvaTextView this_apply = (BbvaTextView) this.f22065q0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.setVisibility(4);
                return;
            default:
                ((MaterialBackOrchestrator) this.f22065q0).startListeningForBackCallbacksWithPriorityOverlay();
                return;
        }
    }
}
