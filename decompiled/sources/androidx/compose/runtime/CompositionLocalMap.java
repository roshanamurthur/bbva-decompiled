package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CompositionLocalMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\"\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H¦\u0002¢\u0006\u0002\u0010\u0006\u0082\u0001\u0001\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionLocalMap;", "", "get", ExifInterface.GPS_DIRECTION_TRUE, "key", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "Companion", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CompositionLocalMap {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f14534a;

    /* JADX INFO: compiled from: CompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/CompositionLocalMap$Companion;", "", "Landroidx/compose/runtime/CompositionLocalMap;", "b", "Landroidx/compose/runtime/CompositionLocalMap;", "getEmpty", "()Landroidx/compose/runtime/CompositionLocalMap;", "Empty", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f14534a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PersistentCompositionLocalHashMap f14535b = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

        @NotNull
        public final CompositionLocalMap getEmpty() {
            return f14535b;
        }
    }

    <T> T get(@NotNull CompositionLocal<T> key);
}
