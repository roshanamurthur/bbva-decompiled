package kotlin.comparisons;

import androidx.exifinterface.media.ExifInterface;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
public final class ComparisonsKt__ComparisonsKt$compareBy$3<T> implements Comparator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Comparator<Object> f79557p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<T, Object> f79558q0;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareBy$3(Comparator<Object> comparator, Function1<? super T, Object> function1) {
        this.f79557p0 = comparator;
        this.f79558q0 = function1;
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        Function1<T, Object> function1 = this.f79558q0;
        return this.f79557p0.compare(function1.invoke(t10), function1.invoke(t11));
    }
}
