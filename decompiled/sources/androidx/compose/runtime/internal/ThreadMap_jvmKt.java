package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ThreadMap.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "a", "Landroidx/compose/runtime/internal/ThreadMap;", "getEmptyThreadMap", "()Landroidx/compose/runtime/internal/ThreadMap;", "emptyThreadMap", "runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap_jvmKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,112:1\n26#2:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap_jvmKt\n*L\n111#1:113\n*E\n"})
public final class ThreadMap_jvmKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ThreadMap f15188a = new ThreadMap(0, new long[0], new Object[0]);

    @NotNull
    public static final ThreadMap getEmptyThreadMap() {
        return f15188a;
    }
}
