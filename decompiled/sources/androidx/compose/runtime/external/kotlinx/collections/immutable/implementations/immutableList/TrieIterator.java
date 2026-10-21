package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrieIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\fJ7\u0010\r\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "", "root", "", FirebaseAnalytics.Param.INDEX, "size", "height", "", "reset$runtime_release", "([Ljava/lang/Object;III)V", "reset", "next", "()Ljava/lang/Object;", "previous", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class TrieIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f14921r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public Object[] f14922s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f14923t0;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(@NotNull Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f14921r0 = i12;
        Object[] objArr2 = new Object[i12];
        this.f14922s0 = objArr2;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f14923t0 = r10;
        objArr2[0] = objArr;
        b(i10 - r10, 1);
    }

    public final E a() {
        int index = getIndex() & 31;
        Object obj = this.f14922s0[this.f14921r0 - 1];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f14921r0 - i11) * 5;
        while (i11 < this.f14921r0) {
            Object[] objArr = this.f14922s0;
            Object obj = objArr[i11 - 1];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[UtilsKt.indexSegment(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (UtilsKt.indexSegment(getIndex(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(getIndex(), ((this.f14921r0 - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eA = a();
        setIndex(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.f14923t0 = true;
            return eA;
        }
        c(0);
        return eA;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        if (this.f14923t0) {
            this.f14923t0 = false;
            return a();
        }
        c(31);
        return a();
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void reset$runtime_release(@NotNull Object[] root, int index, int size, int height) {
        setIndex(index);
        setSize(size);
        this.f14921r0 = height;
        if (this.f14922s0.length < height) {
            this.f14922s0 = new Object[height];
        }
        this.f14922s0[0] = root;
        ?? r1 = index == size ? 1 : 0;
        this.f14923t0 = r1;
        b(index - r1, 1);
    }
}
