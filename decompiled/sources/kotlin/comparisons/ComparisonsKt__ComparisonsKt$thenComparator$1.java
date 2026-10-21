package kotlin.comparisons;

import androidx.exifinterface.media.ExifInterface;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements Comparator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Comparator<T> f79572p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<T, T, Integer> f79573q0;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$thenComparator$1(Comparator<T> comparator, Function2<? super T, ? super T, Integer> function2) {
        this.f79572p0 = comparator;
        this.f79573q0 = function2;
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f79572p0.compare(t10, t11);
        return iCompare != 0 ? iCompare : this.f79573q0.invoke(t10, t11).intValue();
    }
}
