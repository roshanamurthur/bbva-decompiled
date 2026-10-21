package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.collection.j;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentOrderedSetIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", ExifInterface.LONGITUDE_EAST, "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "q0", "Ljava/util/Map;", "getMap$runtime_release", "()Ljava/util/Map;", "map", "", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", FirebaseAnalytics.Param.INDEX, "", "nextElement", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public class PersistentOrderedSetIterator<E> implements Iterator<E>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Object f15021p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<E, Links> map;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public int index;

    public PersistentOrderedSetIterator(@Nullable Object obj, @NotNull Map<E, Links> map) {
        this.f15021p0 = obj;
        this.map = map;
    }

    /* JADX INFO: renamed from: getIndex$runtime_release, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Map<E, Links> getMap$runtime_release() {
        return this.map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.map.size();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e5 = (E) this.f15021p0;
        this.index++;
        Links links = this.map.get(e5);
        if (links == null) {
            throw new ConcurrentModificationException(j.b("Hash code of an element (", e5, ") has changed after it was added to the persistent set."));
        }
        this.f15021p0 = links.getNext();
        return e5;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i10) {
        this.index = i10;
    }
}
