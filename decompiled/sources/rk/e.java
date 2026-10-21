package rk;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: moduleByClassLoader.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<ClassLoader> f93105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93106b;

    public e(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f93105a = new WeakReference<>(classLoader);
        this.f93106b = System.identityHashCode(classLoader);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof e) && this.f93105a.get() == ((e) obj).f93105a.get();
    }

    public int hashCode() {
        return this.f93106b;
    }

    @NotNull
    public String toString() {
        String string;
        ClassLoader classLoader = this.f93105a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }

    public final void setTemporaryStrongRef(@Nullable ClassLoader classLoader) {
    }
}
