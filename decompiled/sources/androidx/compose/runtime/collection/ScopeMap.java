package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import bk.w;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScopeMap.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\n\u0010\bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u000fH\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\f0\u000fH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0006J\u001d\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001b\u001a\u00020\u00062#\b\u0004\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\f0\u000fH\u0086\bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f0\u001eR#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "Key", "Scope", "key", "scope", "", "add", "(Ljava/lang/Object;Ljava/lang/Object;)V", "value", SetCommand.ID, "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "block", "forEachScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "anyScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", ClearCommand.ID, RemoveCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeScopeIf", "removeScope", "(Ljava/lang/Object;)V", "", "", "asMap", "Landroidx/collection/MutableScatterMap;", "a", "Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "map", "", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,194:1\n77#1,5:240\n85#1,4:272\n874#2,18:195\n1047#2:276\n1049#2:290\n1050#2,3:318\n1053#2:327\n1047#2:328\n1049#2,4:342\n1053#2:352\n267#3,4:213\n237#3,7:217\n248#3,3:225\n251#3,2:229\n272#3,2:231\n254#3,6:233\n274#3:239\n267#3,4:245\n237#3,7:249\n248#3,3:257\n251#3,2:261\n272#3,2:263\n254#3,6:265\n274#3:271\n237#3,7:293\n248#3,3:301\n251#3,2:305\n254#3,6:311\n1810#4:224\n1672#4:228\n1810#4:256\n1672#4:260\n1810#4:283\n1672#4:287\n1810#4:300\n1672#4:304\n1810#4:335\n1672#4:339\n1810#4:363\n1672#4:367\n363#5,6:277\n373#5,3:284\n376#5,2:288\n379#5,6:321\n363#5,6:329\n373#5,3:336\n376#5,2:340\n379#5,6:346\n391#5,4:353\n363#5,6:357\n373#5,3:364\n376#5,2:368\n396#5,2:370\n379#5,6:372\n398#5:378\n842#6,2:291\n845#6,4:307\n849#6:317\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n91#1:240,5\n91#1:272,4\n37#1:195,18\n138#1:276\n138#1:290\n138#1:318,3\n138#1:327\n159#1:328\n159#1:342,4\n159#1:352\n81#1:213,4\n81#1:217,7\n81#1:225,3\n81#1:229,2\n81#1:231,2\n81#1:233,6\n81#1:239\n91#1:245,4\n91#1:249,7\n91#1:257,3\n91#1:261,2\n91#1:263,2\n91#1:265,6\n91#1:271\n143#1:293,7\n143#1:301,3\n143#1:305,2\n143#1:311,6\n81#1:224\n81#1:228\n91#1:256\n91#1:260\n138#1:283\n138#1:287\n143#1:300\n143#1:304\n159#1:335\n159#1:339\n180#1:363\n180#1:367\n138#1:277,6\n138#1:284,3\n138#1:288,2\n138#1:321,6\n159#1:329,6\n159#1:336,3\n159#1:340,2\n159#1:346,6\n180#1:353,4\n180#1:357,6\n180#1:364,3\n180#1:368,2\n180#1:370,2\n180#1:372,6\n180#1:378\n143#1:291,2\n143#1:307,4\n143#1:317\n*E\n"})
public final class ScopeMap<Key, Scope> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableScatterMap<Object, Object> map = ScatterMapKt.mutableScatterMapOf();

    public final void add(@NotNull Key key, @NotNull Scope scope) {
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(key);
        boolean z10 = iFindInsertIndex < 0;
        Object obj = z10 ? null : mutableScatterMap.values[iFindInsertIndex];
        if (obj != null) {
            if (obj instanceof MutableScatterSet) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((MutableScatterSet) obj).add(scope);
            } else if (obj != scope) {
                MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                mutableScatterSet.add(obj);
                mutableScatterSet.add(scope);
                scope = (Scope) mutableScatterSet;
            }
            scope = (Scope) obj;
        }
        if (!z10) {
            mutableScatterMap.values[iFindInsertIndex] = scope;
            return;
        }
        int i10 = ~iFindInsertIndex;
        mutableScatterMap.keys[i10] = key;
        mutableScatterMap.values[i10] = scope;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[LOOP:0: B:9:0x0020->B:21:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[SYNTHETIC] */
    public final boolean anyScopeOf(@NotNull Key key, @NotNull Function1<? super Scope, Boolean> block) {
        Object obj = getMap().get(key);
        if (obj != null) {
            if (obj instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128 && block.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                                    return true;
                                }
                                j10 >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                }
            } else if (block.invoke(obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[LOOP:0: B:5:0x0016->B:19:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[EDGE_INSN: B:22:0x0075->B:20:0x0075 BREAK  A[LOOP:0: B:5:0x0016->B:19:0x0072], SYNTHETIC] */
    @NotNull
    public final Map<Key, Set<Scope>> asMap() {
        Set setMutableSetOf;
        HashMap map = new HashMap();
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4");
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4>");
                                setMutableSetOf = ((MutableScatterSet) obj2).asSet();
                            } else {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4");
                                setMutableSetOf = w.mutableSetOf(obj2);
                            }
                            map.put(obj, setMutableSetOf);
                            i11 = 8;
                        }
                        j10 >>= i11;
                    }
                    if (i12 != i11) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return map;
    }

    public final void clear() {
        this.map.clear();
    }

    public final boolean contains(@NotNull Key element) {
        return this.map.containsKey(element);
    }

    public final void forEachScopeOf(@NotNull Key key, @NotNull Function1<? super Scope, Unit> block) {
        Object obj = getMap().get(key);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            block.invoke(obj);
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @NotNull
    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public final int getSize() {
        return this.map.get_size();
    }

    public final boolean remove(@NotNull Key key, @NotNull Scope scope) {
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MutableScatterSet)) {
            if (!Intrinsics.areEqual(obj, scope)) {
                return false;
            }
            mutableScatterMap.remove(key);
            return true;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        boolean zRemove = mutableScatterSet.remove(scope);
        if (zRemove && mutableScatterSet.isEmpty()) {
            mutableScatterMap.remove(key);
        }
        return zRemove;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    public final void removeScope(@NotNull Scope scope) {
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = mutableScatterMap.keys[i13];
                        Object obj2 = mutableScatterMap.values[i13];
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            mutableScatterSet.remove(scope);
                            if (mutableScatterSet.isEmpty()) {
                                mutableScatterMap.removeValueAt(i13);
                            }
                        } else if (obj2 == scope) {
                            mutableScatterMap.removeValueAt(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void removeScopeIf(@NotNull Function1<? super Scope, Boolean> predicate) {
        long[] jArr;
        int i10;
        int i11;
        int i12;
        long j10;
        int i13;
        boolean zBooleanValue;
        int i14;
        MutableScatterMap<Object, Object> map = getMap();
        long[] jArr2 = map.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j11 = jArr2[i15];
            char c10 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j11 & 255) < 128) {
                        int i19 = (i15 << 3) + i18;
                        Object obj = map.keys[i19];
                        Object obj2 = map.values[i19];
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr3 = mutableScatterSet.metadata;
                            int length2 = jArr3.length - 2;
                            if (length2 >= 0) {
                                int i20 = 0;
                                while (true) {
                                    long j13 = jArr3[i20];
                                    i12 = i17;
                                    long[] jArr4 = jArr3;
                                    j10 = -9187201950435737472L;
                                    if ((((~j13) << c10) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                        int i22 = 0;
                                        while (i22 < i21) {
                                            if ((j13 & 255) < 128) {
                                                int i23 = (i20 << 3) + i22;
                                                i14 = i15;
                                                if (predicate.invoke(objArr[i23]).booleanValue()) {
                                                    mutableScatterSet.removeElementAt(i23);
                                                }
                                            } else {
                                                i14 = i15;
                                            }
                                            j13 >>= 8;
                                            i22++;
                                            i15 = i14;
                                        }
                                        i11 = i15;
                                        if (i21 != 8) {
                                            break;
                                        }
                                    } else {
                                        i11 = i15;
                                    }
                                    if (i20 == length2) {
                                        break;
                                    }
                                    i20++;
                                    i17 = i12;
                                    jArr3 = jArr4;
                                    i15 = i11;
                                    c10 = 7;
                                }
                            } else {
                                i11 = i15;
                                i12 = i17;
                                j10 = -9187201950435737472L;
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            i11 = i15;
                            i12 = i17;
                            j10 = j12;
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                            zBooleanValue = predicate.invoke(obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            map.removeValueAt(i19);
                        }
                        i13 = 8;
                    } else {
                        jArr2 = jArr2;
                        length = length;
                        i11 = i15;
                        i12 = i17;
                        j10 = j12;
                        i13 = i16;
                    }
                    j11 >>= i13;
                    i18++;
                    i16 = i13;
                    j12 = j10;
                    jArr2 = jArr2;
                    length = length;
                    i17 = i12;
                    i15 = i11;
                    c10 = 7;
                }
                jArr = jArr2;
                int i24 = length;
                int i25 = i15;
                if (i17 != i16) {
                    return;
                }
                length = i24;
                i10 = i25;
            } else {
                jArr = jArr2;
                i10 = i15;
            }
            if (i10 == length) {
                return;
            }
            i15 = i10 + 1;
            jArr2 = jArr;
        }
    }

    public final void set(@NotNull Key key, @NotNull Scope value) {
        this.map.set(key, value);
    }
}
