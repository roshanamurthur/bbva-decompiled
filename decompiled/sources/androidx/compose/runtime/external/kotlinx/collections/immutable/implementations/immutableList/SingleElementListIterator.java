package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: compiled from: AbstractListIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SingleElementListIterator;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "next", "()Ljava/lang/Object;", "previous", "element", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SingleElementListIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final E f14918r0;

    public SingleElementListIterator(E e5, int i10) {
        super(i10, 1);
        this.f14918r0 = e5;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        checkHasNext$runtime_release();
        setIndex(getIndex() + 1);
        return this.f14918r0;
    }

    @Override // java.util.ListIterator
    public E previous() {
        checkHasPrevious$runtime_release();
        setIndex(getIndex() - 1);
        return this.f14918r0;
    }
}
