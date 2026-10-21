package kotlin.io;

import ak.b;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¨\u0006\u0005"}, d2 = {"Ljava/io/Closeable;", "", "cause", "", "closeFinally", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "CloseableKt")
public final class CloseableKt {
    @SinceKotlin(version = "1.1")
    @PublishedApi
    public static final void closeFinally(@Nullable Closeable closeable, @Nullable Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                b.addSuppressed(th2, th3);
            }
        }
    }
}
