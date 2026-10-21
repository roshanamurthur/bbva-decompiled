package m0;

import androidx.collection.MutableScatterMap;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@JvmInline
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MutableScatterMultiMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1#1,4584:1\n874#2,18:4585\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MutableScatterMultiMap\n*L\n4254#1:4585,18\n*E\n"})
public final class t<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableScatterMap<K, Object> f83317a;

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return Intrinsics.areEqual(this.f83317a, ((t) obj).f83317a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f83317a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f83317a + RootService.CLOSE_BRACKET;
    }
}
