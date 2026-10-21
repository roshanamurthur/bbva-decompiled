package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements Function0<Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<Object> f5568p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List<? extends Object> list) {
        super(0);
        this.f5568p0 = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Object obj = this.f5568p0.get(2);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return (Integer) obj;
    }
}
