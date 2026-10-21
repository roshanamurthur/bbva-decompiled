package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lkotlin/collections/MovingSubList;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "fromIndex", "toIndex", "", "move", FirebaseAnalytics.Param.INDEX, "get", "(I)Ljava/lang/Object;", "getSize", "()I", "size", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<E> f79488p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79489q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f79490r0;

    /* JADX WARN: Multi-variable type inference failed */
    public MovingSubList(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f79488p0 = list;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.f79490r0);
        return this.f79488p0.get(this.f79489q0 + index);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int getF79490r0() {
        return this.f79490r0;
    }

    public final void move(int fromIndex, int toIndex) {
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.f79488p0.size());
        this.f79489q0 = fromIndex;
        this.f79490r0 = toIndex - fromIndex;
    }
}
