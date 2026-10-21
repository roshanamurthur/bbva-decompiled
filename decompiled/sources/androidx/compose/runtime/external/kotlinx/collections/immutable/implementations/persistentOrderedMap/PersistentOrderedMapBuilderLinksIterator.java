package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.camera.core.impl.a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b!\u0010\"J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "hasNext", "next", "", RemoveCommand.ID, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "q0", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "builder", "", "r0", "Ljava/lang/Object;", "getLastIteratedKey$runtime_release", "()Ljava/lang/Object;", "setLastIteratedKey$runtime_release", "(Ljava/lang/Object;)V", "lastIteratedKey", "", "u0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", FirebaseAnalytics.Param.INDEX, "nextKey", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Object f14994p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PersistentOrderedMapBuilder<K, V> builder;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object lastIteratedKey = EndOfChain.INSTANCE;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f14997s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f14998t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public int index;

    public PersistentOrderedMapBuilderLinksIterator(@Nullable Object obj, @NotNull PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.f14994p0 = obj;
        this.builder = persistentOrderedMapBuilder;
        this.f14998t0 = persistentOrderedMapBuilder.getHashMapBuilder$runtime_release().getModCount();
    }

    @NotNull
    public final PersistentOrderedMapBuilder<K, V> getBuilder$runtime_release() {
        return this.builder;
    }

    /* JADX INFO: renamed from: getIndex$runtime_release, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: getLastIteratedKey$runtime_release, reason: from getter */
    public final Object getLastIteratedKey() {
        return this.lastIteratedKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.builder.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f14997s0) {
            throw new IllegalStateException();
        }
        Object obj = this.lastIteratedKey;
        PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder = this.builder;
        TypeIntrinsics.asMutableMap(persistentOrderedMapBuilder).remove(obj);
        this.lastIteratedKey = null;
        this.f14997s0 = false;
        this.f14998t0 = persistentOrderedMapBuilder.getHashMapBuilder$runtime_release().getModCount();
        this.index--;
    }

    public final void setIndex$runtime_release(int i10) {
        this.index = i10;
    }

    public final void setLastIteratedKey$runtime_release(@Nullable Object obj) {
        this.lastIteratedKey = obj;
    }

    @Override // java.util.Iterator
    @NotNull
    public LinkedValue<V> next() {
        PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder = this.builder;
        if (persistentOrderedMapBuilder.getHashMapBuilder$runtime_release().getModCount() != this.f14998t0) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.lastIteratedKey = this.f14994p0;
        this.f14997s0 = true;
        this.index++;
        LinkedValue<V> linkedValue = persistentOrderedMapBuilder.getHashMapBuilder$runtime_release().get(this.f14994p0);
        if (linkedValue == null) {
            throw new ConcurrentModificationException(a.e(new StringBuilder("Hash code of a key ("), this.f14994p0, ") has changed after it was added to the persistent map."));
        }
        LinkedValue<V> linkedValue2 = linkedValue;
        this.f14994p0 = linkedValue2.getNext();
        return linkedValue2;
    }
}
