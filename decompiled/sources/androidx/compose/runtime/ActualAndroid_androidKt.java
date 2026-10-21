package androidx.compose.runtime;

import android.os.Looper;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.naturalauth.Constants;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\rH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0010H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\"!\u0010 \u001a\u00020\u00198FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010%\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$*\f\b\u0000\u0010'\"\u00020&2\u00020&¨\u0006("}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Landroidx/compose/runtime/SnapshotMutationPolicy;", Constants.policy, "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "createSnapshotMutableState", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "Landroidx/compose/runtime/MutableIntState;", "createSnapshotMutableIntState", "", "Landroidx/compose/runtime/MutableLongState;", "createSnapshotMutableLongState", "", "Landroidx/compose/runtime/MutableFloatState;", "createSnapshotMutableFloatState", "", "Landroidx/compose/runtime/MutableDoubleState;", "createSnapshotMutableDoubleState", "", "message", "", "e", "", "logError", "Landroidx/compose/runtime/MonotonicFrameClock;", "a", "Lkotlin/Lazy;", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "b", "J", "getMainThreadId", "()J", "MainThreadId", "Landroidx/annotation/CheckResult;", "CheckResult", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class ActualAndroid_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f14427a = LazyKt__LazyJVMKt.lazy(a.f14429p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f14428b;

    /* JADX INFO: compiled from: ActualAndroid.android.kt */
    public static final class a extends Lambda implements Function0<MonotonicFrameClock> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f14429p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final MonotonicFrameClock invoke() {
            return Looper.getMainLooper() != null ? androidx.compose.runtime.a.f14814p0 : c.f14821p0;
        }
    }

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f14428b = id;
    }

    @NotNull
    public static final MutableDoubleState createSnapshotMutableDoubleState(double d2) {
        return new ParcelableSnapshotMutableDoubleState(d2);
    }

    @NotNull
    public static final MutableFloatState createSnapshotMutableFloatState(float f6) {
        return new ParcelableSnapshotMutableFloatState(f6);
    }

    @NotNull
    public static final MutableIntState createSnapshotMutableIntState(int i10) {
        return new ParcelableSnapshotMutableIntState(i10);
    }

    @NotNull
    public static final MutableLongState createSnapshotMutableLongState(long j10) {
        return new ParcelableSnapshotMutableLongState(j10);
    }

    @NotNull
    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t10, @NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(t10, snapshotMutationPolicy);
    }

    @NotNull
    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) f14427a.getValue();
    }

    public static final long getMainThreadId() {
        return f14428b;
    }

    @Deprecated(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }

    public static final void logError(@NotNull String str, @NotNull Throwable th2) {
    }
}
