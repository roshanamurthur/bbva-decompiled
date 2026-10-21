package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentVectorIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "next", "()Ljava/lang/Object;", "previous", "", "", "root", "tail", "", FirebaseAnalytics.Param.INDEX, "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final T[] f14912r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final TrieIterator<T> f14913s0;

    public PersistentVectorIterator(@NotNull Object[] objArr, @NotNull T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f14912r0 = tArr;
        int iRootSize = UtilsKt.rootSize(i11);
        this.f14913s0 = new TrieIterator<>(objArr, c.coerceAtMost(i10, iRootSize), iRootSize, i12);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkHasNext$runtime_release();
        TrieIterator<T> trieIterator = this.f14913s0;
        if (trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return trieIterator.next();
        }
        int index = getIndex();
        setIndex(index + 1);
        return this.f14912r0[index - trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkHasPrevious$runtime_release();
        int index = getIndex();
        TrieIterator<T> trieIterator = this.f14913s0;
        if (index <= trieIterator.getSize()) {
            setIndex(getIndex() - 1);
            return trieIterator.previous();
        }
        setIndex(getIndex() - 1);
        return this.f14912r0[getIndex() - trieIterator.getSize()];
    }
}
