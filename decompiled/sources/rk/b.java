package rk;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function2 f93103p0;

    public b(Function2 function2) {
        this.f93103p0 = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        KDeclarationContainerImpl.Companion companion = KDeclarationContainerImpl.INSTANCE;
        Function2 tmp0 = this.f93103p0;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }
}
