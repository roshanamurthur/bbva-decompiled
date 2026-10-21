package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.camera.core.impl.a;
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

/* JADX INFO: compiled from: PersistentOrderedMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B+\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "hasNext", "next", "", "p0", "Ljava/lang/Object;", "getNextKey$runtime_release", "()Ljava/lang/Object;", "setNextKey$runtime_release", "(Ljava/lang/Object;)V", "nextKey", "", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", FirebaseAnalytics.Param.INDEX, "", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object nextKey;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Map<K, LinkedValue<V>> f15007q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public int index;

    public PersistentOrderedMapLinksIterator(@Nullable Object obj, @NotNull Map<K, LinkedValue<V>> map) {
        this.nextKey = obj;
        this.f15007q0 = map;
    }

    /* JADX INFO: renamed from: getIndex$runtime_release, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: getNextKey$runtime_release, reason: from getter */
    public final Object getNextKey() {
        return this.nextKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.f15007q0.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i10) {
        this.index = i10;
    }

    public final void setNextKey$runtime_release(@Nullable Object obj) {
        this.nextKey = obj;
    }

    @Override // java.util.Iterator
    @NotNull
    public LinkedValue<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        LinkedValue<V> linkedValue = this.f15007q0.get(this.nextKey);
        if (linkedValue == null) {
            throw new ConcurrentModificationException(a.e(new StringBuilder("Hash code of a key ("), this.nextKey, ") has changed after it was added to the persistent map."));
        }
        LinkedValue<V> linkedValue2 = linkedValue;
        this.index++;
        this.nextKey = linkedValue2.getNext();
        return linkedValue2;
    }
}
