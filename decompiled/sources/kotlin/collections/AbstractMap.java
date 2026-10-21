package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0007\b'\u0018\u0000 &*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001&B\t\b\u0004¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007J!\u0010\u000e\u001a\u00020\u00052\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "", "entry", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", GenerateActivationFormCommand.HASH_CODE, "isEmpty", "", "toString", "getSize", "()I", "size", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "<init>", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public volatile AbstractMap$keys$1 f79426p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public volatile AnonymousClass1 f79427q0;

    /* JADX INFO: compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "()V", "entryEquals", "", "e", "", "other", "entryEquals$kotlin_stdlib", "entryHashCode", "", "entryHashCode$kotlin_stdlib", "entryToString", "", "entryToString$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean entryEquals$kotlin_stdlib(@NotNull Map.Entry<?, ?> e5, @Nullable Object other) {
            Intrinsics.checkNotNullParameter(e5, "e");
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return Intrinsics.areEqual(e5.getKey(), entry.getKey()) && Intrinsics.areEqual(e5.getValue(), entry.getValue());
        }

        public final int entryHashCode$kotlin_stdlib(@NotNull Map.Entry<?, ?> e5) {
            Intrinsics.checkNotNullParameter(e5, "e");
            Object key = e5.getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = e5.getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @NotNull
        public final String entryToString$kotlin_stdlib(@NotNull Map.Entry<?, ?> e5) {
            Intrinsics.checkNotNullParameter(e5, "e");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e5.getKey());
            sb2.append('=');
            sb2.append(e5.getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AbstractMap<K, V> f79428p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractMap<K, ? extends V> abstractMap) {
            super(1);
            this.f79428p0 = abstractMap;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull Map.Entry<? extends K, ? extends V> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractMap.access$toString(this.f79428p0, it);
        }
    }

    public static final String access$toString(AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.getClass();
        StringBuilder sb2 = new StringBuilder();
        Object key = entry.getKey();
        sb2.append(key == abstractMap ? "(this Map)" : String.valueOf(key));
        sb2.append('=');
        Object value = entry.getValue();
        sb2.append(value != abstractMap ? String.valueOf(value) : "(this Map)");
        return sb2.toString();
    }

    public final Map.Entry<K, V> a(K k10) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Map.Entry) next).getKey(), k10)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v3 = get(key);
        if (!Intrinsics.areEqual(value, v3)) {
            return false;
        }
        if (v3 != null) {
            return true;
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return a(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Map.Entry) it.next()).getValue(), value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        Map map = (Map) other;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        Map.Entry<K, V> entryA = a(key);
        if (entryA != null) {
            return entryA.getValue();
        }
        return null;
    }

    public abstract Set getEntries();

    @NotNull
    public Set<K> getKeys() {
        if (this.f79426p0 == null) {
            this.f79426p0 = new AbstractSet<K>(this) { // from class: kotlin.collections.AbstractMap$keys$1

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ AbstractMap<K, V> f79429p0;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f79429p0 = this;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public boolean contains(Object element) {
                    return this.f79429p0.containsKey(element);
                }

                @Override // kotlin.collections.AbstractCollection
                /* JADX INFO: renamed from: getSize */
                public int getF79490r0() {
                    return this.f79429p0.size();
                }

                @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                @NotNull
                public Iterator<K> iterator() {
                    return new AbstractMap$keys$1$iterator$1(this.f79429p0.entrySet().iterator());
                }
            };
        }
        AbstractMap$keys$1 abstractMap$keys$1 = this.f79426p0;
        Intrinsics.checkNotNull(abstractMap$keys$1);
        return abstractMap$keys$1;
    }

    public int getSize() {
        return entrySet().size();
    }

    @NotNull
    public Collection<V> getValues() {
        if (this.f79427q0 == null) {
            this.f79427q0 = new AbstractCollection<V>(this) { // from class: kotlin.collections.AbstractMap.values.1

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ AbstractMap<K, V> f79431p0;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f79431p0 = this;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public boolean contains(Object element) {
                    return this.f79431p0.containsValue(element);
                }

                @Override // kotlin.collections.AbstractCollection
                /* JADX INFO: renamed from: getSize */
                public int getF79490r0() {
                    return this.f79431p0.size();
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                @NotNull
                public Iterator<V> iterator() {
                    return new AbstractMap$values$1$iterator$1(this.f79431p0.entrySet().iterator());
                }
            };
        }
        AnonymousClass1 anonymousClass1 = this.f79427q0;
        Intrinsics.checkNotNull(anonymousClass1);
        return anonymousClass1;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K k10, V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(entrySet(), ", ", "{", "}", 0, null, new a(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
