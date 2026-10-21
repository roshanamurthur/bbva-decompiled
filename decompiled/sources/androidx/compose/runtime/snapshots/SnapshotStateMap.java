package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.m;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001NB\u0007¢\u0006\u0004\bM\u0010GJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J!\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\u00072\u0014\u0010\u0018\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u000eJ0\u0010\"\u001a\u00020\f2\u001e\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\u0012\u0004\u0012\u00020\f0\u001dH\u0080\b¢\u0006\u0004\b \u0010!J0\u0010%\u001a\u00020\f2\u001e\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#\u0012\u0004\u0012\u00020\f0\u001dH\u0080\b¢\u0006\u0004\b$\u0010!J0\u0010'\u001a\u00020\f2\u001e\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#\u0012\u0004\u0012\u00020\f0\u001dH\u0080\b¢\u0006\u0004\b&\u0010!R$\u0010-\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R,\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00106\u001a\b\u0012\u0004\u0012\u00028\u00000.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R \u0010<\u001a\b\u0012\u0004\u0012\u00028\u0001078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020=8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R&\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C8@X\u0080\u0004¢\u0006\f\u0012\u0004\bF\u0010G\u001a\u0004\bD\u0010ER&\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8AX\u0080\u0004¢\u0006\f\u0012\u0004\bK\u0010G\u001a\u0004\bI\u0010J¨\u0006O"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "", "toMap", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "", "toString", ClearCommand.ID, PutCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "from", "putAll", RemoveCommand.ID, "removeValue$runtime_release", "removeValue", "Lkotlin/Function1;", "", "predicate", "removeIf$runtime_release", "(Lkotlin/jvm/functions/Function1;)Z", "removeIf", "", "any$runtime_release", "any", "all$runtime_release", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "<set-?>", "p0", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "", "q0", "Ljava/util/Set;", "getEntries", "()Ljava/util/Set;", "entries", "r0", "getKeys", "keys", "", "s0", "Ljava/util/Collection;", "getValues", "()Ljava/util/Collection;", "values", "", "getSize", "()I", "size", "getModification$runtime_release", "modification", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "()V", "readable", "getDebuggerDisplayValue", "()Ljava/util/Map;", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n166#1:374\n133#1:375\n167#1,2:377\n137#1:379\n169#1,3:386\n174#1:392\n140#1,5:393\n145#1:399\n133#1:400\n146#1,7:402\n137#1:409\n153#1,6:415\n161#1,3:424\n140#1,5:427\n145#1:433\n133#1:434\n146#1,7:436\n137#1:443\n153#1,6:449\n161#1,3:458\n140#1,5:461\n145#1:467\n133#1:468\n146#1,7:470\n137#1:477\n153#1,6:483\n161#1,3:492\n140#1,5:498\n145#1:504\n133#1:505\n146#1,7:507\n137#1:514\n153#1,6:520\n161#1,3:529\n133#1:532\n133#1:545\n137#1:547\n133#1:558\n137#1:560\n2420#2:373\n2420#2:376\n2313#2,2:380\n1843#2:382\n2315#2,2:384\n2317#2,3:389\n2420#2:401\n2313#2,2:410\n1843#2:412\n2315#2,2:413\n2317#2,3:421\n2420#2:435\n2313#2,2:444\n1843#2:446\n2315#2,2:447\n2317#2,3:455\n2420#2:469\n2313#2,2:478\n1843#2:480\n2315#2,2:481\n2317#2,3:489\n2420#2:506\n2313#2,2:515\n1843#2:517\n2315#2,2:518\n2317#2,3:526\n2420#2:533\n2420#2:534\n2313#2,2:535\n1843#2:537\n2315#2,5:539\n2420#2:546\n2313#2,2:548\n1843#2:550\n2315#2,2:552\n2317#2,3:555\n2420#2:559\n2313#2,2:561\n1843#2:563\n2315#2,2:565\n2317#2,3:568\n89#3:383\n89#3:398\n89#3:432\n89#3:466\n89#3:503\n89#3:538\n89#3:544\n89#3:551\n89#3:554\n89#3:564\n89#3:567\n288#4,2:495\n1#5:497\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n81#1:374\n81#1:375\n81#1:377,2\n81#1:379\n81#1:386,3\n81#1:392\n82#1:393,5\n82#1:399\n82#1:400\n82#1:402,7\n82#1:409\n82#1:415,6\n82#1:424,3\n83#1:427,5\n83#1:433\n83#1:434\n83#1:436,7\n83#1:443\n83#1:449,6\n83#1:458,3\n84#1:461,5\n84#1:467\n84#1:468\n84#1:470,7\n84#1:477\n84#1:483,6\n84#1:492,3\n97#1:498,5\n97#1:504\n97#1:505\n97#1:507,7\n97#1:514\n97#1:520,6\n97#1:529,3\n129#1:532\n145#1:545\n152#1:547\n166#1:558\n168#1:560\n77#1:373\n81#1:376\n81#1:380,2\n81#1:382\n81#1:384,2\n81#1:389,3\n82#1:401\n82#1:410,2\n82#1:412\n82#1:413,2\n82#1:421,3\n83#1:435\n83#1:444,2\n83#1:446\n83#1:447,2\n83#1:455,3\n84#1:469\n84#1:478,2\n84#1:480\n84#1:481,2\n84#1:489,3\n97#1:506\n97#1:515,2\n97#1:517\n97#1:518,2\n97#1:526,3\n129#1:533\n133#1:534\n137#1:535,2\n137#1:537\n137#1:539,5\n145#1:546\n152#1:548,2\n152#1:550\n152#1:552,2\n152#1:555,3\n166#1:559\n168#1:561,2\n168#1:563\n168#1:565,2\n168#1:568,3\n81#1:383\n82#1:398\n83#1:432\n84#1:466\n97#1:503\n137#1:538\n144#1:544\n152#1:551\n153#1:554\n168#1:564\n169#1:567\n89#1:495,2\n*E\n"})
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, KMutableMap {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public StateMapStateRecord f15310p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final a f15311q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final b f15312r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final c f15313s0;

    /* JADX INFO: compiled from: SnapshotStateMap.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "assign", "create", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "map", "", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "modification", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,372:1\n89#2:373\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n186#1:373\n*E\n"})
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public PersistentMap<K, ? extends V> map;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int modification;

        public StateMapStateRecord(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) value;
            synchronized (SnapshotStateMapKt.f15316a) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        @NotNull
        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        /* JADX INFO: renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setMap$runtime_release(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i10) {
            this.modification = i10;
        }
    }

    public SnapshotStateMap() {
        PersistentMap persistentMapPersistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(persistentMapPersistentHashMapOf);
        if (Snapshot.INSTANCE.isInSnapshot()) {
            StateMapStateRecord stateMapStateRecord2 = new StateMapStateRecord(persistentMapPersistentHashMapOf);
            stateMapStateRecord2.setSnapshotId$runtime_release(1);
            stateMapStateRecord.setNext$runtime_release(stateMapStateRecord2);
        }
        this.f15310p0 = stateMapStateRecord;
        this.f15311q0 = new a(this);
        this.f15312r0 = new b(this);
        this.f15313s0 = new c(this);
    }

    public final boolean all$runtime_release(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime_release();
        PersistentMap<K, V> persistentMapPersistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentMapPersistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                synchronized (SnapshotStateMapKt.f15316a) {
                    stateMapStateRecord3.setMap$runtime_release(persistentMapPersistentHashMapOf);
                    stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                }
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().get(key);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release();
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return this.f15311q0;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.f15310p0;
    }

    @NotNull
    public Set<K> getKeys() {
        return this.f15312r0;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification();
    }

    @NotNull
    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @NotNull
    public Collection<V> getValues() {
        return this.f15313s0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return m.a(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f15310p0 = (StateMapStateRecord) value;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        V vPut;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateMapKt.f15316a) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder2();
            vPut = builder.put(key, value);
            PersistentMap<K, V> persistentMapBuild = builder.build2();
            if (Intrinsics.areEqual(persistentMapBuild, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                synchronized (SnapshotStateMapKt.f15316a) {
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                        z10 = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z10);
        return vPut;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0077 */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void putAll(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.access$getSync$p()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.StateRecord r1 = r7.getFirstStateRecord()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L7e
            androidx.compose.runtime.snapshots.SnapshotStateMap$StateMapStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) r1     // Catch: java.lang.Throwable -> L7e
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.current(r1)     // Catch: java.lang.Throwable -> L7e
            androidx.compose.runtime.snapshots.SnapshotStateMap$StateMapStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) r1     // Catch: java.lang.Throwable -> L7e
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap r2 = r1.getMap$runtime_release()     // Catch: java.lang.Throwable -> L7e
            int r1 = r1.getModification()     // Catch: java.lang.Throwable -> L7e
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder r0 = r2.builder2()
            r0.putAll(r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap r0 = r0.build2()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 != 0) goto L7d
            androidx.compose.runtime.snapshots.StateRecord r2 = r7.getFirstStateRecord()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            androidx.compose.runtime.snapshots.SnapshotStateMap$StateMapStateRecord r2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) r2
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer()
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.Snapshot$Companion r4 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L77
            androidx.compose.runtime.snapshots.Snapshot r4 = r4.getCurrent()     // Catch: java.lang.Throwable -> L77
            androidx.compose.runtime.snapshots.StateRecord r2 = androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(r2, r7, r4)     // Catch: java.lang.Throwable -> L77
            androidx.compose.runtime.snapshots.SnapshotStateMap$StateMapStateRecord r2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) r2     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.access$getSync$p()     // Catch: java.lang.Throwable -> L77
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L77
            int r6 = r2.getModification()     // Catch: java.lang.Throwable -> L6c
            if (r6 != r1) goto L6e
            r2.setMap$runtime_release(r0)     // Catch: java.lang.Throwable -> L6c
            int r0 = r2.getModification()     // Catch: java.lang.Throwable -> L6c
            r1 = 1
            int r0 = r0 + r1
            r2.setModification$runtime_release(r0)     // Catch: java.lang.Throwable -> L6c
            goto L6f
        L6c:
            r8 = move-exception
            goto L79
        L6e:
            r1 = 0
        L6f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(r4, r7)
            if (r1 == 0) goto L0
            goto L7d
        L77:
            r8 = move-exception
            goto L7b
        L79:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
            throw r8     // Catch: java.lang.Throwable -> L77
        L7b:
            monitor-exit(r3)
            throw r8
        L7d:
            return
        L7e:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateMap.putAll(java.util.Map):void");
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        V vRemove;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateMapKt.f15316a) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder2();
            vRemove = builder.remove(key);
            PersistentMap<K, V> persistentMapBuild = builder.build2();
            if (Intrinsics.areEqual(persistentMapBuild, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                synchronized (SnapshotStateMapKt.f15316a) {
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                        z10 = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z10);
        return vRemove;
    }

    public final boolean removeIf$runtime_release(@NotNull Function1<? super Map.Entry<K, V>, Boolean> predicate) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        Snapshot current;
        boolean z10;
        boolean z11 = false;
        do {
            synchronized (SnapshotStateMapKt.f15316a) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification = stateMapStateRecord.getModification();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th2) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            InlineMarker.finallyEnd(1);
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder2();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (predicate.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z11 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            PersistentMap<K, V> persistentMapBuild = builder.build2();
            if (Intrinsics.areEqual(persistentMapBuild, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    synchronized (SnapshotStateMapKt.f15316a) {
                        try {
                            if (stateMapStateRecord3.getModification() == modification) {
                                stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            InlineMarker.finallyStart(1);
                        } catch (Throwable th3) {
                            InlineMarker.finallyStart(1);
                            InlineMarker.finallyEnd(1);
                            throw th3;
                        }
                    }
                    InlineMarker.finallyEnd(1);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th4) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th4;
                }
            }
            InlineMarker.finallyEnd(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z10);
        return z11;
    }

    public final boolean removeValue$runtime_release(V value) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), value));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    @NotNull
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }
}
