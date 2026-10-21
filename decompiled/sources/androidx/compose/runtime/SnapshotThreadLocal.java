package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMap_jvmKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/SnapshotThreadLocal;", ExifInterface.GPS_DIRECTION_TRUE, "", "get", "()Ljava/lang/Object;", "value", "", SetCommand.ID, "(Ljava/lang/Object;)V", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,146:1\n89#2:147\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n74#1:147\n*E\n"})
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReference<ThreadMap> f14801a = new AtomicReference<>(ThreadMap_jvmKt.getEmptyThreadMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f14802b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f14803c;

    @Nullable
    public final T get() {
        long id = Thread.currentThread().getId();
        return id == ActualAndroid_androidKt.getMainThreadId() ? this.f14803c : (T) this.f14801a.get().get(id);
    }

    public final void set(@Nullable T value) {
        long id = Thread.currentThread().getId();
        if (id == ActualAndroid_androidKt.getMainThreadId()) {
            this.f14803c = value;
            return;
        }
        synchronized (this.f14802b) {
            ThreadMap threadMap = this.f14801a.get();
            if (threadMap.trySet(id, value)) {
                return;
            }
            this.f14801a.set(threadMap.newWith(id, value));
            Unit unit = Unit.INSTANCE;
        }
    }
}
