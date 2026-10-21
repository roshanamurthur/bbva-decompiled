package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1\n*L\n1#1,456:1\n*E\n"})
public final class LazyStaggeredGridDslKt$itemsIndexed$4$1 extends Lambda implements Function1<Integer, StaggeredGridItemSpan> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Integer, T, StaggeredGridItemSpan> f5160p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<T> f5161q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$4$1(Function2<? super Integer, ? super T, StaggeredGridItemSpan> function2, List<? extends T> list) {
        super(1);
        this.f5160p0 = function2;
        this.f5161q0 = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final StaggeredGridItemSpan invoke(int i10) {
        return this.f5160p0.invoke(Integer.valueOf(i10), (T) this.f5161q0.get(i10));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
