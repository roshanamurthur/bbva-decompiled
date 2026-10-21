package qk;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KProperty1 f92876a;

    public b(KProperty1 kProperty1) {
        this.f92876a = kProperty1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        KProperty1 tmp0 = this.f92876a;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Iterable) tmp0.invoke((KClass) obj);
    }
}
