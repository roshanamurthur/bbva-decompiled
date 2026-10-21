package kotlin.collections.builders;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u000e\b\u0000\u0018\u0000 ^*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006^_`abcB\t\b\u0016¢\u0006\u0004\b[\u0010 B\u0011\b\u0016\u0012\u0006\u0010\\\u001a\u00020\u001b¢\u0006\u0004\b[\u0010]J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0013\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0016J\u0019\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010#J#\u0010+\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0000¢\u0006\u0004\b)\u0010*J\u001b\u00100\u001a\u00020\b2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,H\u0000¢\u0006\u0004\b.\u0010/J#\u00102\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0000¢\u0006\u0004\b1\u0010*J\u0017\u00105\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0001H\u0000¢\u0006\u0004\b4\u0010\fJ\u001b\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000106H\u0000¢\u0006\u0004\b7\u00108J\u001b\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:H\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>H\u0000¢\u0006\u0004\b?\u0010@J\b\u0010B\u001a\u00020\u0018H\u0002R$\u0010H\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR$\u0010M\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00010R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR&\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010V0N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010PR\u0014\u0010Z\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010G¨\u0006d"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "isEmpty", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", PutCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "from", "", "putAll", RemoveCommand.ID, ClearCommand.ID, "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "checkIsMutable$kotlin_stdlib", "()V", "checkIsMutable", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "addKey", "removeKey$kotlin_stdlib", "removeKey", "", "entry", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "", "m", "containsAllEntries$kotlin_stdlib", "(Ljava/util/Collection;)Z", "containsAllEntries", "removeEntry$kotlin_stdlib", "removeEntry", "element", "removeValue$kotlin_stdlib", "removeValue", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator", "writeReplace", "<set-?>", "x0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize", "()I", "size", "G0", "Z", "isReadOnly$kotlin_stdlib", "()Z", "isReadOnly", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", "entries", "getCapacity$kotlin_stdlib", "capacity", "<init>", "initialCapacity", "(I)V", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final MapBuilder H0;

    @Nullable
    public MapBuilderValues<V> E0;

    @Nullable
    public MapBuilderEntries<K, V> F0;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public boolean isReadOnly;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public K[] f79528p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public V[] f79529q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public int[] f79530r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public int[] f79531s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f79532t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f79533u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f79534w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public MapBuilderKeys<K> f79536y0;

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "Lkotlin/collections/builders/MapBuilder;", "", "Empty", "Lkotlin/collections/builders/MapBuilder;", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "", "INITIAL_CAPACITY", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final int access$computeHashSize(Companion companion, int i10) {
            companion.getClass();
            return Integer.highestOneBit(c.coerceAtLeast(i10, 1) * 3);
        }

        public static final int access$computeShift(Companion companion, int i10) {
            companion.getClass();
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        @NotNull
        public final MapBuilder getEmpty$kotlin_stdlib() {
            return MapBuilder.H0;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntriesItr(@NotNull MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        public final void nextAppendString(@NotNull StringBuilder sb2) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (getIndex() >= getMap$kotlin_stdlib().f79533u0) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            Object obj = getMap$kotlin_stdlib().f79528p0[getLastIndex()];
            if (obj == getMap$kotlin_stdlib()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = getMap$kotlin_stdlib().f79529q0;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == getMap$kotlin_stdlib()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex() >= getMap$kotlin_stdlib().f79533u0) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            Object obj = getMap$kotlin_stdlib().f79528p0[getLastIndex()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = getMap$kotlin_stdlib().f79529q0;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return iHashCode2;
        }

        @Override // java.util.Iterator
        @NotNull
        public EntryRef<K, V> next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= getMap$kotlin_stdlib().f79533u0) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            EntryRef<K, V> entryRef = new EntryRef<>(getMap$kotlin_stdlib(), getLastIndex());
            initNext$kotlin_stdlib();
            return entryRef;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0019"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "Lkotlin/collections/builders/MapBuilder;", "map", FirebaseAnalytics.Param.INDEX, "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final MapBuilder<K, V> f79537p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f79538q0;

        public EntryRef(@NotNull MapBuilder<K, V> map, int i10) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f79537p0 = map;
            this.f79538q0 = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object other) {
            if (other instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) other;
                if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) this.f79537p0.f79528p0[this.f79538q0];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = this.f79537p0.f79529q0;
            Intrinsics.checkNotNull(objArr);
            return (V) objArr[this.f79538q0];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            MapBuilder<K, V> mapBuilder = this.f79537p0;
            mapBuilder.checkIsMutable$kotlin_stdlib();
            Object[] objArrAccess$allocateValuesArray = MapBuilder.access$allocateValuesArray(mapBuilder);
            int i10 = this.f79538q0;
            V v3 = (V) objArrAccess$allocateValuesArray[i10];
            objArrAccess$allocateValuesArray[i10] = newValue;
            return v3;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\r¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0004J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u0006R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019¨\u0006!"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "initNext$kotlin_stdlib", "()V", "initNext", "", "hasNext", RemoveCommand.ID, "checkForComodification$kotlin_stdlib", "checkForComodification", "Lkotlin/collections/builders/MapBuilder;", "p0", "Lkotlin/collections/builders/MapBuilder;", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "map", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", FirebaseAnalytics.Param.INDEX, "r0", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "lastIndex", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
    public static class Itr<K, V> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MapBuilder<K, V> map;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        public int lastIndex;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f79542s0;

        public Itr(@NotNull MapBuilder<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.f79542s0 = map.f79534w0;
            initNext$kotlin_stdlib();
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (this.map.f79534w0 != this.f79542s0) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: getIndex$kotlin_stdlib, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: getLastIndex$kotlin_stdlib, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        @NotNull
        public final MapBuilder<K, V> getMap$kotlin_stdlib() {
            return this.map;
        }

        public final boolean hasNext() {
            return this.index < this.map.f79533u0;
        }

        public final void initNext$kotlin_stdlib() {
            while (true) {
                int i10 = this.index;
                MapBuilder<K, V> mapBuilder = this.map;
                if (i10 >= mapBuilder.f79533u0) {
                    return;
                }
                int[] iArr = mapBuilder.f79530r0;
                int i11 = this.index;
                if (iArr[i11] >= 0) {
                    return;
                } else {
                    this.index = i11 + 1;
                }
            }
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            MapBuilder<K, V> mapBuilder = this.map;
            mapBuilder.checkIsMutable$kotlin_stdlib();
            mapBuilder.f(this.lastIndex);
            this.lastIndex = -1;
            this.f79542s0 = mapBuilder.f79534w0;
        }

        public final void setIndex$kotlin_stdlib(int i10) {
            this.index = i10;
        }

        public final void setLastIndex$kotlin_stdlib(int i10) {
            this.lastIndex = i10;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeysItr(@NotNull MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= getMap$kotlin_stdlib().f79533u0) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            K k10 = (K) getMap$kotlin_stdlib().f79528p0[getLastIndex()];
            initNext$kotlin_stdlib();
            return k10;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValuesItr(@NotNull MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= getMap$kotlin_stdlib().f79533u0) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            Object[] objArr = getMap$kotlin_stdlib().f79529q0;
            Intrinsics.checkNotNull(objArr);
            V v3 = (V) objArr[getLastIndex()];
            initNext$kotlin_stdlib();
            return v3;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        H0 = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    public static final Object[] access$allocateValuesArray(MapBuilder mapBuilder) {
        V[] vArr = mapBuilder.f79529q0;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ListBuilderKt.arrayOfUninitializedElements(mapBuilder.getCapacity$kotlin_stdlib());
        mapBuilder.f79529q0 = vArr2;
        return vArr2;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final void a(int i10) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i11 = this.f79533u0;
        int i12 = capacity$kotlin_stdlib - i11;
        int size = i11 - size();
        if (i12 < i10 && i12 + size >= i10 && size >= getCapacity$kotlin_stdlib() / 4) {
            e(this.f79531s0.length);
            return;
        }
        int i13 = this.f79533u0 + i10;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > getCapacity$kotlin_stdlib()) {
            int iNewCapacity$kotlin_stdlib = AbstractList.INSTANCE.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), i13);
            this.f79528p0 = (K[]) ListBuilderKt.copyOfUninitializedElements(this.f79528p0, iNewCapacity$kotlin_stdlib);
            V[] vArr = this.f79529q0;
            this.f79529q0 = vArr != null ? (V[]) ListBuilderKt.copyOfUninitializedElements(vArr, iNewCapacity$kotlin_stdlib) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f79530r0, iNewCapacity$kotlin_stdlib);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f79530r0 = iArrCopyOf;
            int iAccess$computeHashSize = Companion.access$computeHashSize(INSTANCE, iNewCapacity$kotlin_stdlib);
            if (iAccess$computeHashSize > this.f79531s0.length) {
                e(iAccess$computeHashSize);
            }
        }
    }

    public final int addKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iD = d(key);
            int iCoerceAtMost = c.coerceAtMost(this.f79532t0 * 2, this.f79531s0.length / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f79531s0[iD];
                if (i11 <= 0) {
                    if (this.f79533u0 >= getCapacity$kotlin_stdlib()) {
                        a(1);
                        break;
                    }
                    int i12 = this.f79533u0;
                    int i13 = i12 + 1;
                    this.f79533u0 = i13;
                    this.f79528p0[i12] = key;
                    this.f79530r0[i12] = iD;
                    this.f79531s0[iD] = i13;
                    this.size = size() + 1;
                    this.f79534w0++;
                    if (i10 > this.f79532t0) {
                        this.f79532t0 = i10;
                    }
                    return i12;
                }
                if (Intrinsics.areEqual(this.f79528p0[i11 - 1], key)) {
                    return -i11;
                }
                i10++;
                if (i10 > iCoerceAtMost) {
                    e(this.f79531s0.length * 2);
                    break;
                }
                iD = iD == 0 ? this.f79531s0.length - 1 : iD - 1;
            }
        }
    }

    public final int b(K k10) {
        int iD = d(k10);
        int i10 = this.f79532t0;
        while (true) {
            int i11 = this.f79531s0[iD];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (Intrinsics.areEqual(this.f79528p0[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iD = iD == 0 ? this.f79531s0.length - 1 : iD - 1;
        }
    }

    @NotNull
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = H0;
        Intrinsics.checkNotNull(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final int c(V v3) {
        int i10 = this.f79533u0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f79530r0[i10] >= 0) {
                V[] vArr = this.f79529q0;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.areEqual(vArr[i10], v3)) {
                    return i10;
                }
            }
        }
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        ?? it = new IntRange(0, this.f79533u0 - 1).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            int[] iArr = this.f79530r0;
            int i10 = iArr[iNextInt];
            if (i10 >= 0) {
                this.f79531s0[i10] = 0;
                iArr[iNextInt] = -1;
            }
        }
        ListBuilderKt.resetRange(this.f79528p0, 0, this.f79533u0);
        V[] vArr = this.f79529q0;
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, 0, this.f79533u0);
        }
        this.size = 0;
        this.f79533u0 = 0;
        this.f79534w0++;
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        V[] vArr = this.f79529q0;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.areEqual(vArr[iB], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return b(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return c(value) >= 0;
    }

    public final int d(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.v0;
    }

    public final void e(int i10) {
        int[] iArr;
        int i11;
        this.f79534w0++;
        int i12 = 0;
        if (this.f79533u0 > size()) {
            V[] vArr = this.f79529q0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i11 = this.f79533u0;
                if (i13 >= i11) {
                    break;
                }
                if (this.f79530r0[i13] >= 0) {
                    K[] kArr = this.f79528p0;
                    kArr[i14] = kArr[i13];
                    if (vArr != null) {
                        vArr[i14] = vArr[i13];
                    }
                    i14++;
                }
                i13++;
            }
            ListBuilderKt.resetRange(this.f79528p0, i14, i11);
            if (vArr != null) {
                ListBuilderKt.resetRange(vArr, i14, this.f79533u0);
            }
            this.f79533u0 = i14;
        }
        int[] iArr2 = this.f79531s0;
        if (i10 != iArr2.length) {
            this.f79531s0 = new int[i10];
            this.v0 = Companion.access$computeShift(INSTANCE, i10);
        } else {
            ArraysKt___ArraysJvmKt.fill(iArr2, 0, 0, iArr2.length);
        }
        while (i12 < this.f79533u0) {
            int i15 = i12 + 1;
            int iD = d(this.f79528p0[i12]);
            int i16 = this.f79532t0;
            while (true) {
                iArr = this.f79531s0;
                if (iArr[iD] == 0) {
                    break;
                }
                i16--;
                if (i16 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iD = iD == 0 ? iArr.length - 1 : iD - 1;
            }
            iArr[iD] = i15;
            this.f79530r0[i12] = iD;
            i12 = i15;
        }
    }

    @NotNull
    public final EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
        return new EntriesItr<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        if (other != this) {
            if (other instanceof Map) {
                Map map = (Map) other;
                if (size() != map.size() || !containsAllEntries$kotlin_stdlib(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i10) {
        ListBuilderKt.resetAt(this.f79528p0, i10);
        int length = this.f79530r0[i10];
        int iCoerceAtMost = c.coerceAtMost(this.f79532t0 * 2, this.f79531s0.length / 2);
        int i11 = 0;
        int i12 = length;
        do {
            length = length == 0 ? this.f79531s0.length - 1 : length - 1;
            i11++;
            if (i11 > this.f79532t0) {
                this.f79531s0[i12] = 0;
            } else {
                int[] iArr = this.f79531s0;
                int i13 = iArr[length];
                if (i13 == 0) {
                    iArr[i12] = 0;
                } else {
                    if (i13 < 0) {
                        iArr[i12] = -1;
                    } else {
                        int i14 = i13 - 1;
                        int iD = d(this.f79528p0[i14]) - length;
                        int[] iArr2 = this.f79531s0;
                        if ((iD & (iArr2.length - 1)) >= i11) {
                            iArr2[i12] = i13;
                            this.f79530r0[i14] = i12;
                        }
                        iCoerceAtMost--;
                    }
                    i12 = length;
                    i11 = 0;
                    iCoerceAtMost--;
                }
            }
            this.f79530r0[i10] = -1;
            this.size = size() - 1;
            this.f79534w0++;
        } while (iCoerceAtMost >= 0);
        this.f79531s0[i12] = -1;
        this.f79530r0[i10] = -1;
        this.size = size() - 1;
        this.f79534w0++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        int iB = b(key);
        if (iB < 0) {
            return null;
        }
        V[] vArr = this.f79529q0;
        Intrinsics.checkNotNull(vArr);
        return vArr[iB];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.f79528p0.length;
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.F0;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.F0 = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @NotNull
    public Set<K> getKeys() {
        MapBuilderKeys<K> mapBuilderKeys = this.f79536y0;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.f79536y0 = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    public int getSize() {
        return this.size;
    }

    @NotNull
    public Collection<V> getValues() {
        MapBuilderValues<V> mapBuilderValues = this.E0;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.E0 = mapBuilderValues2;
        return mapBuilderValues2;
    }

    @Override // java.util.Map
    public int hashCode() {
        EntriesItr<K, V> entriesItrEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iNextHashCode$kotlin_stdlib = 0;
        while (entriesItrEntriesIterator$kotlin_stdlib.hasNext()) {
            iNextHashCode$kotlin_stdlib += entriesItrEntriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return iNextHashCode$kotlin_stdlib;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: isReadOnly$kotlin_stdlib, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @NotNull
    public final KeysItr<K, V> keysIterator$kotlin_stdlib() {
        return new KeysItr<>(this);
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(key);
        V[] vArr = this.f79529q0;
        if (vArr == null) {
            vArr = (V[]) ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
            this.f79529q0 = vArr;
        }
        if (iAddKey$kotlin_stdlib >= 0) {
            vArr[iAddKey$kotlin_stdlib] = value;
            return null;
        }
        int i10 = (-iAddKey$kotlin_stdlib) - 1;
        V v3 = vArr[i10];
        vArr[i10] = value;
        return v3;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        a(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
            V[] vArr = this.f79529q0;
            if (vArr == null) {
                vArr = (V[]) ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
                this.f79529q0 = vArr;
            }
            if (iAddKey$kotlin_stdlib >= 0) {
                vArr[iAddKey$kotlin_stdlib] = entry.getValue();
            } else {
                int i10 = (-iAddKey$kotlin_stdlib) - 1;
                if (!Intrinsics.areEqual(entry.getValue(), vArr[i10])) {
                    vArr[i10] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        int iRemoveKey$kotlin_stdlib = removeKey$kotlin_stdlib(key);
        if (iRemoveKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.f79529q0;
        Intrinsics.checkNotNull(vArr);
        V v3 = vArr[iRemoveKey$kotlin_stdlib];
        ListBuilderKt.resetAt(vArr, iRemoveKey$kotlin_stdlib);
        return v3;
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        V[] vArr = this.f79529q0;
        Intrinsics.checkNotNull(vArr);
        if (!Intrinsics.areEqual(vArr[iB], entry.getValue())) {
            return false;
        }
        f(iB);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        int iB = b(key);
        if (iB < 0) {
            return -1;
        }
        f(iB);
        return iB;
    }

    public final boolean removeValue$kotlin_stdlib(V element) {
        checkIsMutable$kotlin_stdlib();
        int iC = c(element);
        if (iC < 0) {
            return false;
        }
        f(iC);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        EntriesItr<K, V> entriesItrEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i10 = 0;
        while (entriesItrEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            entriesItrEntriesIterator$kotlin_stdlib.nextAppendString(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @NotNull
    public final ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
        return new ValuesItr<>(this);
    }

    public MapBuilder(int i10) {
        K[] kArr = (K[]) ListBuilderKt.arrayOfUninitializedElements(i10);
        int[] iArr = new int[i10];
        Companion companion = INSTANCE;
        int iAccess$computeHashSize = Companion.access$computeHashSize(companion, i10);
        this.f79528p0 = kArr;
        this.f79529q0 = null;
        this.f79530r0 = iArr;
        this.f79531s0 = new int[iAccess$computeHashSize];
        this.f79532t0 = 2;
        this.f79533u0 = 0;
        this.v0 = Companion.access$computeShift(companion, iAccess$computeHashSize);
    }
}
