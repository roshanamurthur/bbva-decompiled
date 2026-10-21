package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\t\u0010\u0004J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ThreadLocal;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/ThreadLocal;", "get", "()Ljava/lang/Object;", "value", "", SetCommand.ID, "(Ljava/lang/Object;)V", "initialValue", RemoveCommand.ID, "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class ThreadLocal<T> extends java.lang.ThreadLocal<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<T> f14806a;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadLocal(@NotNull Function0<? extends T> function0) {
        this.f14806a = function0;
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        return (T) super.get();
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    public T initialValue() {
        return this.f14806a.invoke();
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        super.remove();
    }

    @Override // java.lang.ThreadLocal
    public void set(T value) {
        super.set(value);
    }
}
