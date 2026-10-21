package s3;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DirectExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a implements Executor {
    private static final /* synthetic */ a[] $VALUES;
    public static final a INSTANCE;

    static {
        a aVar = new a("INSTANCE", 0);
        INSTANCE = aVar;
        $VALUES = new a[]{aVar};
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
