package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    public static final class C0034a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final C0034a f5336p0 = new C0034a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return null;
        }
    }

    public static /* synthetic */ void a(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, Function3 function3, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        if ((i10 & 4) != 0) {
            staggeredGridItemSpan = null;
        }
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(LazyStaggeredGridScope lazyStaggeredGridScope, int i10, Function1 function1, Function1 function2, Function1 function3, Function4 function4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        Function1 function5 = (i11 & 2) != 0 ? null : function1;
        if ((i11 & 4) != 0) {
            function2 = C0034a.f5336p0;
        }
        lazyStaggeredGridScope.items(i10, function5, function2, (i11 & 8) != 0 ? null : function3, function4);
    }
}
