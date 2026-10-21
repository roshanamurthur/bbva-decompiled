package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionData;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.mastercard.sonic.StatusCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import m0.a0;
import m0.d0;
import m0.x;
import m0.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 d2\u00020\u0001:\u0005d>efgB\u000f\u0012\u0006\u0010G\u001a\u00020\u0007¢\u0006\u0004\bb\u0010cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0087@¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\r\u0010\u0006J*\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\u0011H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0016\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u001d\u0010\u001e\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b$\u0010 J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0010¢\u0006\u0004\b(\u0010)J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0010¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0010¢\u0006\u0004\b0\u0010.J\u001f\u00106\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u00103\u001a\u000202H\u0010¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b7\u0010 J\u0019\u0010;\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020+H\u0010¢\u0006\u0004\b9\u0010:R$\u0010B\u001a\u00020<2\u0006\u0010=\u001a\u00020<8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010G\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\b\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR \u0010O\u001a\b\u0012\u0004\u0012\u00020J0I8FX\u0087\u0004¢\u0006\f\u0012\u0004\bM\u0010N\u001a\u0004\bK\u0010LR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020J0P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010W\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020T8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010VR\u0014\u0010_\u001a\u00020T8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b^\u0010VR\u0014\u0010a\u001a\u00020T8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b`\u0010V¨\u0006h"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "", "runRecomposeAndApplyChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, HearingDisabilitiesConstants.CLOSE_MODAL, "join", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "awaitIdle", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "", "<set-?>", "a", "J", "getChangeCount", "()J", "changeCount", "w", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "()V", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "", "getHasPendingWork", "()Z", "hasPendingWork", "", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingCallByInformation$runtime_release", "collectingCallByInformation", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Companion", "b", "c", "State", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 10 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1646:1\n1299#1,5:1712\n1305#1:1722\n1299#1,5:1735\n1305#1:1745\n1299#1,5:1766\n1305#1:1829\n1208#2:1647\n1187#2,2:1648\n89#3:1650\n89#3:1651\n89#3:1654\n89#3:1656\n89#3:1663\n89#3:1664\n89#3:1665\n89#3:1666\n89#3:1684\n89#3:1685\n89#3:1686\n89#3:1687\n89#3:1688\n89#3:1689\n89#3:1690\n89#3:1697\n89#3:1707\n89#3:1710\n89#3:1711\n89#3:1723\n89#3:1724\n89#3:1774\n89#3:1816\n89#3:1830\n89#3:1853\n89#3:1854\n89#3:1855\n89#3:1856\n89#3:1859\n89#3:1862\n89#3:1863\n89#3:1864\n89#3:1865\n89#3:1866\n89#3:1867\n89#3:1868\n1229#4,2:1652\n1#5:1655\n1#5:1812\n33#6,6:1657\n33#6,6:1667\n33#6,6:1691\n93#6,2:1725\n33#6,4:1727\n95#6,2:1731\n38#6:1733\n97#6:1734\n120#6,3:1746\n33#6,4:1749\n123#6,2:1753\n125#6,2:1762\n38#6:1764\n127#6:1765\n82#6,3:1775\n33#6,4:1778\n85#6,2:1782\n38#6:1784\n87#6:1785\n110#6,2:1786\n33#6,6:1788\n112#6:1794\n110#6,2:1795\n33#6,6:1797\n112#6:1803\n211#6,3:1804\n33#6,4:1807\n214#6:1811\n215#6:1813\n38#6:1814\n216#6:1815\n231#6,3:1817\n64#6,4:1820\n234#6,2:1824\n69#6:1826\n236#6:1827\n82#6,3:1831\n33#6,4:1834\n85#6,2:1838\n38#6:1840\n87#6:1841\n33#6,6:1842\n460#7,11:1673\n735#7,2:1857\n728#7,2:1860\n314#8,9:1698\n323#8,2:1708\n138#9,5:1717\n138#9,5:1740\n138#9,3:1771\n142#9:1828\n138#9,5:1848\n361#10,7:1755\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1121#1:1712,5\n1121#1:1722\n1198#1:1735,5\n1198#1:1745\n1218#1:1766,5\n1218#1:1829\n218#1:1647\n218#1:1648,2\n297#1:1650\n347#1:1651\n441#1:1654\n446#1:1656\n460#1:1663\n469#1:1664\n474#1:1665\n485#1:1666\n497#1:1684\n505#1:1685\n751#1:1686\n781#1:1687\n812#1:1688\n824#1:1689\n841#1:1690\n989#1:1697\n1001#1:1707\n1086#1:1710\n1102#1:1711\n1134#1:1723\n1165#1:1724\n1221#1:1774\n1239#1:1816\n1262#1:1830\n1329#1:1853\n1366#1:1854\n1381#1:1855\n1413#1:1856\n1421#1:1859\n1430#1:1862\n1437#1:1863\n1444#1:1864\n1453#1:1865\n1459#1:1866\n1471#1:1867\n1171#1:1868\n348#1:1652,2\n1236#1:1812\n452#1:1657,6\n491#1:1667,6\n842#1:1691,6\n1166#1:1725,2\n1166#1:1727,4\n1166#1:1731,2\n1166#1:1733\n1166#1:1734\n1215#1:1746,3\n1215#1:1749,4\n1215#1:1753,2\n1215#1:1762,2\n1215#1:1764\n1215#1:1765\n1222#1:1775,3\n1222#1:1778,4\n1222#1:1782,2\n1222#1:1784\n1222#1:1785\n1231#1:1786,2\n1231#1:1788,6\n1231#1:1794\n1231#1:1795,2\n1231#1:1797,6\n1231#1:1803\n1236#1:1804,3\n1236#1:1807,4\n1236#1:1811\n1236#1:1813\n1236#1:1814\n1236#1:1815\n1244#1:1817,3\n1244#1:1820,4\n1244#1:1824,2\n1244#1:1826\n1244#1:1827\n1266#1:1831,3\n1266#1:1834,4\n1266#1:1838,2\n1266#1:1840\n1266#1:1841\n1273#1:1842,6\n495#1:1673,11\n1415#1:1857,2\n1423#1:1860,2\n1000#1:1698,9\n1000#1:1708,2\n1121#1:1717,5\n1198#1:1740,5\n1218#1:1771,3\n1218#1:1828\n1303#1:1848,5\n1215#1:1755,7\n*E\n"})
public final class Recomposer extends CompositionContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long changeCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BroadcastFrameClock f14656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f14657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Job f14658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Throwable f14659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f14660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public List<? extends ControlledComposition> f14661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public MutableScatterSet<Object> f14662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableVector<ControlledComposition> f14663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ArrayList f14664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ArrayList f14665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f14666l;

    @NotNull
    public final LinkedHashMap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ArrayList f14667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Set<ControlledComposition> f14668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public CancellableContinuation<? super Unit> f14669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public b f14672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14673t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<State> f14674u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final CompletableJob f14675v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext effectCoroutineContext;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final c f14677x;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<PersistentSet<c>> f14653y = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<Boolean> f14654z = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010\u001aJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R4\u0010%\u001a\"\u0012\f\u0012\n #*\u0004\u0018\u00010\u00020\u00020\"j\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00020\u0002`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010+\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060)R\u00020*0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "", "value", "", "setHotReloadEnabled$runtime_release", "(Z)V", "setHotReloadEnabled", "saveStateAndDisposeForHotReload$runtime_release", "()Ljava/lang/Object;", "saveStateAndDisposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "(Ljava/lang/Object;)V", "loadStateAndComposeForHotReload", "", "key", "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime_release", "()V", "clearErrors", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "runningRecomposers", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$c;", "Landroidx/compose/runtime/Recomposer;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n1360#2:1647\n1446#2,5:1648\n1855#2,2:1653\n1855#2,2:1667\n1855#2,2:1669\n1603#2,9:1671\n1855#2:1680\n1856#2:1682\n1612#2:1683\n1603#2,9:1684\n1855#2:1693\n1856#2:1695\n1612#2:1696\n33#3,6:1655\n33#3,6:1661\n1#4:1681\n1#4:1694\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1522#1:1647\n1522#1:1648,5\n1530#1:1653,2\n1539#1:1667,2\n1546#1:1669,2\n1560#1:1671,9\n1560#1:1680\n1560#1:1682\n1560#1:1683\n1565#1:1684,9\n1565#1:1693\n1565#1:1695\n1565#1:1696\n1536#1:1655,6\n1537#1:1661,6\n1560#1:1681\n1565#1:1694\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void access$addRunning(Companion companion, c cVar) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            companion.getClass();
            do {
                persistentSet = (PersistentSet) Recomposer.f14653y.getValue();
                persistentSetAdd = persistentSet.add(cVar);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer.f14653y.compareAndSet(persistentSet, persistentSetAdd));
        }

        public static final void access$removeRunning(Companion companion, c cVar) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            companion.getClass();
            do {
                persistentSet = (PersistentSet) Recomposer.f14653y.getValue();
                persistentSetRemove = persistentSet.remove(cVar);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer.f14653y.compareAndSet(persistentSet, persistentSetRemove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer.f14653y.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b bVarAccess$resetErrorState = Recomposer.access$resetErrorState(Recomposer.this);
                if (bVarAccess$resetErrorState != null) {
                    arrayList.add(bVarAccess$resetErrorState);
                }
            }
        }

        @NotNull
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer.f14653y.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b bVarA = ((c) it.next()).a();
                if (bVarA != null) {
                    arrayList.add(bVarA);
                }
            }
            return arrayList;
        }

        @NotNull
        public final StateFlow<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer.f14653y;
        }

        public final void invalidateGroupsWithKey$runtime_release(int key) {
            List listE;
            Recomposer.f14654z.set(Boolean.TRUE);
            for (c cVar : (Iterable) Recomposer.f14653y.getValue()) {
                b bVarA = cVar.a();
                if (bVarA == null || bVarA.f14680a) {
                    Recomposer.access$resetErrorState(Recomposer.this);
                    Object obj = Recomposer.this.f14657c;
                    Recomposer recomposer = Recomposer.this;
                    synchronized (obj) {
                        listE = recomposer.e();
                    }
                    ArrayList arrayList = new ArrayList(listE.size());
                    int size = listE.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ControlledComposition controlledComposition = (ControlledComposition) listE.get(i10);
                        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                        if (compositionImpl != null) {
                            arrayList.add(compositionImpl);
                        }
                    }
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((CompositionImpl) arrayList.get(i11)).invalidateGroupsWithKey(key);
                    }
                    Recomposer.access$retryFailedCompositions(Recomposer.this);
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@NotNull Object token) {
            Recomposer.f14654z.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer.f14653y.getValue()).iterator();
            while (it.hasNext()) {
                Recomposer.access$resetErrorState(Recomposer.this);
            }
            Intrinsics.checkNotNull(token, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) token;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) list.get(i10);
                aVar.f14678a.setComposable(aVar.f14679b);
            }
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                a aVar2 = (a) list.get(i11);
                CompositionImpl compositionImpl = aVar2.f14678a;
                if (compositionImpl.getIsRoot()) {
                    compositionImpl.setContent(aVar2.f14679b);
                }
            }
            Iterator it2 = ((Iterable) Recomposer.f14653y.getValue()).iterator();
            while (it2.hasNext()) {
                Recomposer.access$retryFailedCompositions(Recomposer.this);
            }
        }

        @NotNull
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            List listE;
            Recomposer.f14654z.set(Boolean.TRUE);
            Iterable<c> iterable = (Iterable) Recomposer.f14653y.getValue();
            ArrayList arrayList = new ArrayList();
            for (c cVar : iterable) {
                Object obj = Recomposer.this.f14657c;
                Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    listE = recomposer.e();
                }
                ArrayList arrayList2 = new ArrayList(listE.size());
                int size = listE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ControlledComposition controlledComposition = (ControlledComposition) listE.get(i10);
                    CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                    if (compositionImpl != null) {
                        arrayList2.add(compositionImpl);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    CompositionImpl compositionImpl2 = (CompositionImpl) arrayList2.get(i11);
                    a aVar = new a(compositionImpl2);
                    if (compositionImpl2.getIsRoot()) {
                        compositionImpl2.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m2061getLambda1$runtime_release());
                    }
                    arrayList3.add(aVar);
                }
                bk.g.addAll(arrayList, arrayList3);
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean value) {
            Recomposer.f14654z.set(Boolean.valueOf(value));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State Idle;
        public static final State Inactive;
        public static final State InactivePendingWork;
        public static final State PendingWork;
        public static final State ShutDown;
        public static final State ShuttingDown;

        static {
            State state = new State("ShutDown", 0);
            ShutDown = state;
            State state2 = new State("ShuttingDown", 1);
            ShuttingDown = state2;
            State state3 = new State("Inactive", 2);
            Inactive = state3;
            State state4 = new State("InactivePendingWork", 3);
            InactivePendingWork = state4;
            State state5 = new State("Idle", 4);
            Idle = state5;
            State state6 = new State("PendingWork", 5);
            PendingWork = state6;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CompositionImpl f14678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function2<? super Composer, ? super Integer, Unit> f14679b;

        public a(@NotNull CompositionImpl compositionImpl) {
            this.f14678a = compositionImpl;
            this.f14679b = compositionImpl.getComposable();
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    public static final class b implements RecomposerErrorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f14680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Exception f14681b;

        public b(boolean z10, @NotNull Exception exc) {
            this.f14680a = z10;
            this.f14681b = exc;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        @NotNull
        public final Exception getCause() {
            return this.f14681b;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public final boolean getRecoverable() {
            return this.f14680a;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n89#2:1647\n89#2:1648\n89#2:1667\n211#3,3:1649\n33#3,4:1652\n214#3:1656\n215#3:1658\n38#3:1659\n216#3:1660\n33#3,6:1661\n211#3,3:1668\n33#3,4:1671\n214#3:1675\n215#3:1677\n38#3:1678\n216#3:1679\n82#3,3:1680\n33#3,4:1683\n85#3:1687\n86#3:1689\n38#3:1690\n87#3:1691\n1#4:1657\n1#4:1676\n1#4:1688\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n373#1:1647\n378#1:1648\n386#1:1667\n382#1:1649,3\n382#1:1652,4\n382#1:1656\n382#1:1658\n382#1:1659\n382#1:1660\n383#1:1661,6\n390#1:1668,3\n390#1:1671,4\n390#1:1675\n390#1:1677\n390#1:1678\n390#1:1679\n391#1:1680,3\n391#1:1683,4\n391#1:1687\n391#1:1689\n391#1:1690\n391#1:1691\n382#1:1657\n390#1:1676\n*E\n"})
    public final class c implements RecomposerInfo {
        public c() {
        }

        @Nullable
        public final b a() {
            b bVar;
            Object obj = Recomposer.this.f14657c;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                bVar = recomposer.f14672s;
            }
            return bVar;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public final long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public final boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        @NotNull
        public final Flow<State> getState() {
            return Recomposer.this.getCurrentState();
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f14683p0;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(2, continuation);
            dVar.f14683p0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((d) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.f14683p0).compareTo(State.Idle) > 0);
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1646:1\n89#2:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n*L\n146#1:1647\n*E\n"})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CancellableContinuation cancellableContinuationB;
            Object obj = Recomposer.this.f14657c;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                cancellableContinuationB = recomposer.b();
                if (((State) recomposer.f14674u.getValue()).compareTo(State.ShuttingDown) <= 0) {
                    throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer.f14659e);
                }
            }
            if (cancellableContinuationB != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationB.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1646:1\n89#2:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n251#1:1647\n*E\n"})
    public static final class f extends Lambda implements Function1<Throwable, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            CancellableContinuation cancellableContinuation;
            CancellableContinuation cancellableContinuation2;
            Throwable th3 = th2;
            CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th3);
            Object obj = Recomposer.this.f14657c;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                try {
                    Job job = recomposer.f14658d;
                    cancellableContinuation = null;
                    if (job != null) {
                        recomposer.f14674u.setValue(State.ShuttingDown);
                        if (recomposer.f14671r) {
                            if (recomposer.f14669p != null) {
                                cancellableContinuation2 = recomposer.f14669p;
                            }
                            recomposer.f14669p = null;
                            job.invokeOnCompletion(new androidx.compose.runtime.b(recomposer, th3));
                            cancellableContinuation = cancellableContinuation2;
                        } else {
                            job.cancel(CancellationException);
                        }
                        cancellableContinuation2 = null;
                        recomposer.f14669p = null;
                        job.invokeOnCompletion(new androidx.compose.runtime.b(recomposer, th3));
                        cancellableContinuation = cancellableContinuation2;
                    } else {
                        recomposer.f14659e = CancellationException;
                        recomposer.f14674u.setValue(State.ShutDown);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f14686p0;

        public g() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = new g(2, continuation);
            gVar.f14686p0 = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((g) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.f14686p0) == State.ShutDown);
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1054}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1646:1\n89#2:1647\n89#2:1654\n33#3,6:1648\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n1050#1:1647\n1059#1:1654\n1052#1:1648,6\n*E\n"})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ObserverHandle f14687p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f14688q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f14689r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> f14691t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MonotonicFrameClock f14692u0;

        /* JADX INFO: compiled from: Recomposer.kt */
        @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1055}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f14693p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f14694q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> f14695r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ MonotonicFrameClock f14696s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f14695r0 = function3;
                this.f14696s0 = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f14695r0, this.f14696s0, continuation);
                aVar.f14694q0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f14693p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f14694q0;
                    this.f14693p0 = 1;
                    if (this.f14695r0.invoke(coroutineScope, this.f14696s0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: Recomposer.kt */
        @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1646:1\n89#2:1647\n48#3,3:1648\n53#3:1679\n55#3:1682\n267#4,4:1651\n237#4,7:1655\n248#4,3:1663\n251#4,2:1667\n272#4:1669\n273#4:1671\n254#4,6:1672\n274#4:1678\n1810#5:1662\n1672#5:1666\n51#6:1670\n1855#7,2:1680\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n1027#1:1647\n1030#1:1648,3\n1030#1:1679\n1030#1:1682\n1030#1:1651,4\n1030#1:1655,7\n1030#1:1663,3\n1030#1:1667,2\n1030#1:1669\n1030#1:1671\n1030#1:1672,6\n1030#1:1678\n1030#1:1662\n1030#1:1666\n1033#1:1670\n1030#1:1680,2\n*E\n"})
        public static final class b extends Lambda implements Function2<Set<? extends Object>, Snapshot, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Recomposer f14697p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Recomposer recomposer) {
                super(2);
                this.f14697p0 = recomposer;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x008b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:31:0x008d A[Catch: all -> 0x007a, LOOP:0: B:11:0x003e->B:31:0x008d, LOOP_END, TryCatch #0 {all -> 0x007a, blocks: (B:4:0x0013, B:6:0x0025, B:8:0x002e, B:11:0x003e, B:13:0x004e, B:15:0x005a, B:17:0x0063, B:19:0x006c, B:27:0x0083, B:24:0x007c, B:31:0x008d, B:41:0x00b6, B:32:0x0090, B:33:0x0096, B:35:0x009c, B:37:0x00a4, B:40:0x00b2), top: B:51:0x0013 }] */
            /* JADX WARN: Code duplicated, block: B:54:0x00b6 A[EDGE_INSN: B:54:0x00b6->B:41:0x00b6 BREAK  A[LOOP:0: B:11:0x003e->B:31:0x008d], SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
                CancellableContinuation cancellableContinuationB;
                int i10;
                Set<? extends Object> set2 = set;
                Object obj = this.f14697p0.f14657c;
                Recomposer recomposer = this.f14697p0;
                synchronized (obj) {
                    try {
                        if (((State) recomposer.f14674u.getValue()).compareTo(State.Idle) >= 0) {
                            MutableScatterSet mutableScatterSet = recomposer.f14662h;
                            if (set2 instanceof ScatterSetWrapper) {
                                ScatterSet set$runtime_release = ((ScatterSetWrapper) set2).getSet$runtime_release();
                                Object[] objArr = set$runtime_release.elements;
                                long[] jArr = set$runtime_release.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j10 = jArr[i11];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i11 != length) {
                                                break;
                                                break;
                                            }
                                            i11++;
                                        } else {
                                            int i12 = 8;
                                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((255 & j10) < 128) {
                                                    Object obj2 = objArr[(i11 << 3) + i14];
                                                    if (!(obj2 instanceof StateObjectImpl) || ((StateObjectImpl) obj2).m2182isReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(1))) {
                                                        mutableScatterSet.add(obj2);
                                                    }
                                                    i10 = 8;
                                                } else {
                                                    i10 = i12;
                                                }
                                                j10 >>= i10;
                                                i14++;
                                                i12 = i10;
                                            }
                                            if (i13 != i12) {
                                                break;
                                            }
                                            if (i11 != length) {
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj3 : set2) {
                                    if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).m2182isReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(1))) {
                                        mutableScatterSet.add(obj3);
                                    }
                                }
                            }
                            cancellableContinuationB = recomposer.b();
                        } else {
                            cancellableContinuationB = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuationB != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationB.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f14691t0 = function3;
            this.f14692u0 = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = Recomposer.this.new h(this.f14691t0, this.f14692u0, continuation);
            hVar.f14689r0 = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x009d A[Catch: all -> 0x00a1, TryCatch #1 {all -> 0x00a1, blocks: (B:28:0x0097, B:30:0x009d, B:33:0x00a3), top: B:57:0x0097 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00cc A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:44:0x00c6, B:46:0x00cc, B:49:0x00d2), top: B:55:0x00c6 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Job job;
            ObserverHandle observerHandle;
            Throwable th2;
            List listE;
            Object obj2;
            Recomposer recomposer;
            Object obj3;
            Recomposer recomposer2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f14688q0;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                observerHandle = this.f14687p0;
                job = (Job) this.f14689r0;
                try {
                    ResultKt.throwOnFailure(obj);
                    observerHandle.dispose();
                    obj3 = Recomposer.this.f14657c;
                    recomposer2 = Recomposer.this;
                    synchronized (obj3) {
                        try {
                            if (recomposer2.f14658d == job) {
                                recomposer2.f14658d = null;
                            }
                            recomposer2.b();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Companion.access$removeRunning(Recomposer.INSTANCE, Recomposer.this.f14677x);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th2 = th4;
                    observerHandle.dispose();
                    obj2 = Recomposer.this.f14657c;
                    recomposer = Recomposer.this;
                    synchronized (obj2) {
                        try {
                            if (recomposer.f14658d == job) {
                                recomposer.f14658d = null;
                            }
                            recomposer.b();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    Companion.access$removeRunning(Recomposer.INSTANCE, Recomposer.this.f14677x);
                    throw th2;
                }
            }
            ResultKt.throwOnFailure(obj);
            job = JobKt.getJob(((CoroutineScope) this.f14689r0).getCoroutineContext());
            Recomposer.access$registerRunnerJob(Recomposer.this, job);
            ObserverHandle observerHandleRegisterApplyObserver = Snapshot.INSTANCE.registerApplyObserver(new b(Recomposer.this));
            Companion.access$addRunning(Recomposer.INSTANCE, Recomposer.this.f14677x);
            try {
                Object obj4 = Recomposer.this.f14657c;
                Recomposer recomposer3 = Recomposer.this;
                synchronized (obj4) {
                    listE = recomposer3.e();
                }
                int size = listE.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((ControlledComposition) listE.get(i11)).invalidateAll();
                }
                a aVar = new a(this.f14691t0, this.f14692u0, null);
                this.f14689r0 = job;
                this.f14687p0 = observerHandleRegisterApplyObserver;
                this.f14688q0 = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                observerHandle = observerHandleRegisterApplyObserver;
                observerHandle.dispose();
                obj3 = Recomposer.this.f14657c;
                recomposer2 = Recomposer.this;
                synchronized (obj3) {
                    if (recomposer2.f14658d == job) {
                        recomposer2.f14658d = null;
                    }
                    recomposer2.b();
                    Companion.access$removeRunning(Recomposer.INSTANCE, Recomposer.this.f14677x);
                    return Unit.INSTANCE;
                }
            } catch (Throwable th6) {
                observerHandle = observerHandleRegisterApplyObserver;
                th2 = th6;
                observerHandle.dispose();
                obj2 = Recomposer.this.f14657c;
                recomposer = Recomposer.this;
                synchronized (obj2) {
                    if (recomposer.f14658d == job) {
                        recomposer.f14658d = null;
                    }
                    recomposer.b();
                    Companion.access$removeRunning(Recomposer.INSTANCE, Recomposer.this.f14677x);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {574, 585}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1646:1\n89#2:1647\n89#2:1735\n33#3,6:1648\n33#3,6:1736\n267#4,4:1654\n237#4,7:1658\n248#4,3:1666\n251#4,2:1670\n272#4,2:1672\n254#4,6:1674\n274#4:1680\n267#4,4:1681\n237#4,7:1685\n248#4,3:1693\n251#4,2:1697\n272#4,2:1699\n254#4,6:1701\n274#4:1707\n267#4,4:1708\n237#4,7:1712\n248#4,3:1720\n251#4,2:1724\n272#4,2:1726\n254#4,6:1728\n274#4:1734\n1810#5:1665\n1672#5:1669\n1810#5:1692\n1672#5:1696\n1810#5:1719\n1672#5:1723\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n536#1:1647\n567#1:1735\n540#1:1648,6\n568#1:1736,6\n546#1:1654,4\n546#1:1658,7\n546#1:1666,3\n546#1:1670,2\n546#1:1672,2\n546#1:1674,6\n546#1:1680\n552#1:1681,4\n552#1:1685,7\n552#1:1693,3\n552#1:1697,2\n552#1:1699,2\n552#1:1701,6\n552#1:1707\n557#1:1708,4\n557#1:1712,7\n557#1:1720,3\n557#1:1724,2\n557#1:1726,2\n557#1:1728,6\n557#1:1734\n546#1:1665\n546#1:1669\n552#1:1692\n552#1:1696\n557#1:1719\n557#1:1723\n*E\n"})
    public static final class i extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public List f14698p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public List f14699q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public List f14700r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public MutableScatterSet f14701s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public MutableScatterSet f14702t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public MutableScatterSet f14703u0;
        public Set v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public MutableScatterSet f14704w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f14705x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ MonotonicFrameClock f14706y0;

        /* JADX INFO: compiled from: Recomposer.kt */
        @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1646:1\n46#2,5:1647\n46#2,3:1652\n50#2:1673\n89#3:1655\n89#3:1674\n89#3:1762\n460#4,11:1656\n838#4,15:1681\n33#5,6:1667\n33#5,6:1675\n33#5,6:1696\n33#5,6:1702\n267#6,4:1708\n237#6,7:1712\n248#6,3:1720\n251#6,2:1724\n272#6,2:1726\n254#6,6:1728\n274#6:1734\n267#6,4:1735\n237#6,7:1739\n248#6,3:1747\n251#6,2:1751\n272#6,2:1753\n254#6,6:1755\n274#6:1761\n1810#7:1719\n1672#7:1723\n1810#7:1746\n1672#7:1750\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n*L\n589#1:1647,5\n599#1:1652,3\n599#1:1673\n603#1:1655\n634#1:1674\n725#1:1762\n604#1:1656,11\n647#1:1681,15\n615#1:1667,6\n635#1:1675,6\n681#1:1696,6\n684#1:1702,6\n699#1:1708,4\n699#1:1712,7\n699#1:1720,3\n699#1:1724,2\n699#1:1726,2\n699#1:1728,6\n699#1:1734\n713#1:1735,4\n713#1:1739,7\n713#1:1747,3\n713#1:1751,2\n713#1:1753,2\n713#1:1755,6\n713#1:1761\n699#1:1719\n699#1:1723\n713#1:1746\n713#1:1750\n*E\n"})
        public static final class a extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Recomposer f14707p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MutableScatterSet<Object> f14708q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ MutableScatterSet<ControlledComposition> f14709r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ List<ControlledComposition> f14710s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ List<MovableContentStateReference> f14711t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ MutableScatterSet<ControlledComposition> f14712u0;
            public final /* synthetic */ List<ControlledComposition> v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public final /* synthetic */ MutableScatterSet<ControlledComposition> f14713w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public final /* synthetic */ Set<Object> f14714x0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Recomposer recomposer, MutableScatterSet<Object> mutableScatterSet, MutableScatterSet<ControlledComposition> mutableScatterSet2, List<ControlledComposition> list, List<MovableContentStateReference> list2, MutableScatterSet<ControlledComposition> mutableScatterSet3, List<ControlledComposition> list3, MutableScatterSet<ControlledComposition> mutableScatterSet4, Set<? extends Object> set) {
                super(1);
                this.f14707p0 = recomposer;
                this.f14708q0 = mutableScatterSet;
                this.f14709r0 = mutableScatterSet2;
                this.f14710s0 = list;
                this.f14711t0 = list2;
                this.f14712u0 = mutableScatterSet3;
                this.v0 = list3;
                this.f14713w0 = mutableScatterSet4;
                this.f14714x0 = set;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x01cb A[Catch: all -> 0x01e0, Exception -> 0x01e2, TryCatch #18 {Exception -> 0x01e2, blocks: (B:93:0x01a7, B:96:0x01b1, B:98:0x01bd, B:100:0x01cb, B:102:0x01d3), top: B:238:0x01a7, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:102:0x01d3 A[Catch: all -> 0x01e0, Exception -> 0x01e2, TRY_LEAVE, TryCatch #18 {Exception -> 0x01e2, blocks: (B:93:0x01a7, B:96:0x01b1, B:98:0x01bd, B:100:0x01cb, B:102:0x01d3), top: B:238:0x01a7, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:112:0x01f2  */
            /* JADX WARN: Code duplicated, block: B:114:0x01f8 A[LOOP:4: B:96:0x01b1->B:114:0x01f8, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:121:0x0216 A[Catch: all -> 0x00f0, TryCatch #8 {all -> 0x00f0, blocks: (B:11:0x004f, B:12:0x0056, B:23:0x0088, B:24:0x0089, B:25:0x008f, B:27:0x009a, B:30:0x00ab, B:32:0x00b6, B:44:0x00ec, B:51:0x0107, B:52:0x010a, B:49:0x00fd, B:53:0x010b, B:87:0x0194, B:82:0x017c, B:91:0x01a1, B:115:0x01fb, B:121:0x0216, B:122:0x021a, B:124:0x021e, B:125:0x021f, B:128:0x0234, B:129:0x0235, B:119:0x0212, B:120:0x0215, B:118:0x020d, B:88:0x0199, B:89:0x019c, B:197:0x0361, B:152:0x0279, B:154:0x0282, B:183:0x0318, B:185:0x031e, B:186:0x0321, B:188:0x032c, B:193:0x0345, B:158:0x0291, B:159:0x0295, B:182:0x0317, B:194:0x0353, B:195:0x0354, B:201:0x0369, B:202:0x036c, B:203:0x036d, B:204:0x036e, B:93:0x01a7, B:96:0x01b1, B:98:0x01bd, B:100:0x01cb, B:102:0x01d3, B:117:0x01ff, B:33:0x00c1, B:35:0x00c8, B:40:0x00d9, B:42:0x00e0, B:123:0x021b, B:48:0x00f3, B:130:0x0236, B:132:0x023d, B:134:0x0245, B:136:0x024b, B:143:0x0260, B:196:0x0355, B:56:0x011a, B:57:0x011f, B:60:0x0127, B:68:0x0150, B:86:0x0186, B:160:0x0296, B:162:0x02a1, B:164:0x02af, B:166:0x02b5, B:169:0x02bf, B:170:0x02c4, B:172:0x02d0, B:174:0x02de, B:176:0x02e4, B:180:0x0301, B:179:0x02f3, B:181:0x0306, B:13:0x0057, B:15:0x0061, B:16:0x0066, B:22:0x007f), top: B:222:0x004f, inners: #0, #3, #9, #11, #12, #13, #15, #16, #17 }] */
            /* JADX WARN: Code duplicated, block: B:220:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:223:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:238:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:246:0x01fb A[EDGE_INSN: B:246:0x01fb->B:115:0x01fb BREAK  A[LOOP:4: B:96:0x01b1->B:114:0x01f8], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:247:0x01fb A[EDGE_INSN: B:247:0x01fb->B:115:0x01fb BREAK  A[LOOP:4: B:96:0x01b1->B:114:0x01f8], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:249:0x017c A[EDGE_INSN: B:249:0x017c->B:82:0x017c BREAK  A[LOOP:6: B:60:0x0127->B:78:0x016b], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:250:0x017c A[EDGE_INSN: B:250:0x017c->B:82:0x017c BREAK  A[LOOP:6: B:60:0x0127->B:78:0x016b], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:59:0x0126  */
            /* JADX WARN: Code duplicated, block: B:63:0x0137  */
            /* JADX WARN: Code duplicated, block: B:65:0x0145  */
            /* JADX WARN: Code duplicated, block: B:67:0x014d  */
            /* JADX WARN: Code duplicated, block: B:77:0x0169 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:78:0x016b A[LOOP:6: B:60:0x0127->B:78:0x016b, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:81:0x0178  */
            /* JADX WARN: Code duplicated, block: B:90:0x019d  */
            /* JADX WARN: Code duplicated, block: B:95:0x01b0  */
            /* JADX WARN: Code duplicated, block: B:98:0x01bd A[Catch: all -> 0x01e0, Exception -> 0x01e2, TryCatch #18 {Exception -> 0x01e2, blocks: (B:93:0x01a7, B:96:0x01b1, B:98:0x01bd, B:100:0x01cb, B:102:0x01d3), top: B:238:0x01a7, outer: #0 }] */
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Long l6) {
                MutableScatterSet<Object> mutableScatterSet;
                MutableScatterSet<ControlledComposition> mutableScatterSet2;
                Set<? extends Object> set;
                Set<? extends Object> set2;
                MutableScatterSet<Object> mutableScatterSet3;
                MutableScatterSet<ControlledComposition> mutableScatterSet4;
                boolean z10;
                Object[] objArr;
                long[] jArr;
                int length;
                int i10;
                long j10;
                int i11;
                long j11;
                int i12;
                Object[] objArr2;
                long[] jArr2;
                int length2;
                int i13;
                long j12;
                int i14;
                long j13;
                int i15;
                long jLongValue = l6.longValue();
                if (Recomposer.access$getHasBroadcastFrameClockAwaiters(this.f14707p0)) {
                    Recomposer recomposer = this.f14707p0;
                    Trace trace = Trace.INSTANCE;
                    Object objBeginSection = trace.beginSection("Recomposer:animation");
                    try {
                        recomposer.f14656b.sendFrame(jLongValue);
                        Snapshot.INSTANCE.sendApplyNotifications();
                        Unit unit = Unit.INSTANCE;
                        trace.endSection(objBeginSection);
                    } catch (Throwable th2) {
                        Trace.INSTANCE.endSection(objBeginSection);
                        throw th2;
                    }
                }
                Recomposer recomposer2 = this.f14707p0;
                MutableScatterSet<Object> mutableScatterSet5 = this.f14708q0;
                MutableScatterSet<ControlledComposition> mutableScatterSet6 = this.f14709r0;
                List<ControlledComposition> list = this.f14710s0;
                List<MovableContentStateReference> list2 = this.f14711t0;
                MutableScatterSet<ControlledComposition> mutableScatterSet7 = this.f14712u0;
                List<ControlledComposition> list3 = this.v0;
                MutableScatterSet<ControlledComposition> mutableScatterSet8 = this.f14713w0;
                Set<? extends Object> set3 = this.f14714x0;
                Object objBeginSection2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
                try {
                    Recomposer.access$recordComposerModifications(recomposer2);
                    synchronized (recomposer2.f14657c) {
                        try {
                            MutableVector mutableVector = recomposer2.f14663i;
                            int size = mutableVector.getSize();
                            if (size > 0) {
                                Object[] content = mutableVector.getContent();
                                int i16 = 0;
                                while (true) {
                                    Object[] objArr3 = content;
                                    list.add((ControlledComposition) content[i16]);
                                    i16++;
                                    if (i16 >= size) {
                                        break;
                                    }
                                    content = objArr3;
                                }
                            }
                            recomposer2.f14663i.clear();
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    mutableScatterSet5.clear();
                    mutableScatterSet6.clear();
                    while (true) {
                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                            break;
                        }
                        MutableScatterSet<Object> mutableScatterSet9 = mutableScatterSet5;
                        MutableScatterSet<ControlledComposition> mutableScatterSet10 = mutableScatterSet6;
                        try {
                            try {
                                int size2 = list.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    ControlledComposition controlledComposition = list.get(i17);
                                    mutableScatterSet = mutableScatterSet9;
                                    try {
                                        ControlledComposition controlledCompositionAccess$performRecompose = Recomposer.access$performRecompose(recomposer2, controlledComposition, mutableScatterSet);
                                        if (controlledCompositionAccess$performRecompose != null) {
                                            try {
                                                list3.add(controlledCompositionAccess$performRecompose);
                                                Unit unit3 = Unit.INSTANCE;
                                            } catch (Exception e5) {
                                                e = e5;
                                                mutableScatterSet2 = mutableScatterSet10;
                                                Recomposer.j(recomposer2, e, true, 2);
                                                i.a(recomposer2, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet, mutableScatterSet2);
                                                list.clear();
                                                Trace.INSTANCE.endSection(objBeginSection2);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        mutableScatterSet2 = mutableScatterSet10;
                                        try {
                                            mutableScatterSet2.add(controlledComposition);
                                            i17++;
                                            mutableScatterSet9 = mutableScatterSet;
                                            mutableScatterSet10 = mutableScatterSet2;
                                        } catch (Exception e7) {
                                            e = e7;
                                            Recomposer.j(recomposer2, e, true, 2);
                                            i.a(recomposer2, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet, mutableScatterSet2);
                                            list.clear();
                                            Trace.INSTANCE.endSection(objBeginSection2);
                                            return Unit.INSTANCE;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        mutableScatterSet2 = mutableScatterSet10;
                                        Recomposer.j(recomposer2, e, true, 2);
                                        i.a(recomposer2, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet, mutableScatterSet2);
                                        list.clear();
                                        Trace.INSTANCE.endSection(objBeginSection2);
                                        return Unit.INSTANCE;
                                    }
                                }
                                MutableScatterSet<Object> mutableScatterSet11 = mutableScatterSet9;
                                MutableScatterSet<ControlledComposition> mutableScatterSet12 = mutableScatterSet10;
                                list.clear();
                                if (mutableScatterSet11.isNotEmpty() || recomposer2.f14663i.isNotEmpty()) {
                                    synchronized (recomposer2.f14657c) {
                                        try {
                                            List listE = recomposer2.e();
                                            int size3 = listE.size();
                                            for (int i18 = 0; i18 < size3; i18++) {
                                                ControlledComposition controlledComposition2 = (ControlledComposition) listE.get(i18);
                                                if (!mutableScatterSet12.contains(controlledComposition2) && controlledComposition2.observesAnyOf(set3)) {
                                                    list.add(controlledComposition2);
                                                }
                                            }
                                            MutableVector mutableVector2 = recomposer2.f14663i;
                                            int size4 = mutableVector2.getSize();
                                            int i19 = 0;
                                            int i20 = 0;
                                            while (i19 < size4) {
                                                ControlledComposition controlledComposition3 = (ControlledComposition) mutableVector2.getContent()[i19];
                                                if (mutableScatterSet12.contains(controlledComposition3) || list.contains(controlledComposition3)) {
                                                    set2 = set3;
                                                    if (i20 > 0) {
                                                        mutableVector2.getContent()[i19 - i20] = mutableVector2.getContent()[i19];
                                                    }
                                                } else {
                                                    set2 = set3;
                                                    list.add(controlledComposition3);
                                                    i20++;
                                                }
                                                i19++;
                                                set3 = set2;
                                            }
                                            set = set3;
                                            int i21 = size4 - i20;
                                            ArraysKt___ArraysJvmKt.fill(mutableVector2.getContent(), (Object) null, i21, size4);
                                            mutableVector2.setSize(i21);
                                            Unit unit4 = Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                } else {
                                    set = set3;
                                }
                                if (list.isEmpty()) {
                                    try {
                                        i.b(list2, recomposer2);
                                        while (!list2.isEmpty()) {
                                            mutableScatterSet7.plusAssign(recomposer2.h(list2, mutableScatterSet11));
                                            i.b(list2, recomposer2);
                                        }
                                    } catch (Exception e11) {
                                        Recomposer.j(recomposer2, e11, true, 2);
                                        i.a(recomposer2, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet11, mutableScatterSet12);
                                    }
                                }
                                mutableScatterSet5 = mutableScatterSet11;
                                mutableScatterSet6 = mutableScatterSet12;
                                set3 = set;
                            } catch (Exception e12) {
                                e = e12;
                                mutableScatterSet = mutableScatterSet9;
                            }
                        } catch (Throwable th5) {
                            list.clear();
                            throw th5;
                        }
                        Trace.INSTANCE.endSection(objBeginSection2);
                        return Unit.INSTANCE;
                    }
                    int i22 = 6;
                    if (!list3.isEmpty()) {
                        recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                        try {
                            try {
                                int size5 = list3.size();
                                for (int i23 = 0; i23 < size5; i23++) {
                                    mutableScatterSet8.add(list3.get(i23));
                                }
                                int size6 = list3.size();
                                for (int i24 = 0; i24 < size6; i24++) {
                                    list3.get(i24).applyChanges();
                                }
                                list3.clear();
                                if (mutableScatterSet7.isNotEmpty()) {
                                    try {
                                        try {
                                            mutableScatterSet8.plusAssign(mutableScatterSet7);
                                            objArr = mutableScatterSet7.elements;
                                            try {
                                                jArr = mutableScatterSet7.metadata;
                                                length = jArr.length - 2;
                                                if (length >= 0) {
                                                    i10 = 0;
                                                    while (true) {
                                                        j10 = jArr[i10];
                                                        mutableScatterSet3 = mutableScatterSet5;
                                                        mutableScatterSet4 = mutableScatterSet6;
                                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            if (i10 != length) {
                                                                break;
                                                                break;
                                                            }
                                                            i10++;
                                                            mutableScatterSet5 = mutableScatterSet3;
                                                            mutableScatterSet6 = mutableScatterSet4;
                                                        } else {
                                                            i11 = 8 - ((~(i10 - length)) >>> 31);
                                                            j11 = j10;
                                                            for (i12 = 0; i12 < i11; i12++) {
                                                                if ((j11 & 255) < 128) {
                                                                    try {
                                                                        ((ControlledComposition) objArr[(i10 << 3) + i12]).applyLateChanges();
                                                                    } catch (Exception e13) {
                                                                        e = e13;
                                                                        z10 = false;
                                                                        i22 = 6;
                                                                        Recomposer.j(recomposer2, e, z10, i22);
                                                                        i.a(recomposer2, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet3, mutableScatterSet4);
                                                                        mutableScatterSet7.clear();
                                                                        Trace.INSTANCE.endSection(objBeginSection2);
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                                j11 >>= 8;
                                                            }
                                                            if (i11 == 8) {
                                                                break;
                                                            }
                                                            if (i10 != length) {
                                                                break;
                                                            }
                                                            i10++;
                                                            mutableScatterSet5 = mutableScatterSet3;
                                                            mutableScatterSet6 = mutableScatterSet4;
                                                        }
                                                    }
                                                } else {
                                                    mutableScatterSet3 = mutableScatterSet5;
                                                    mutableScatterSet4 = mutableScatterSet6;
                                                }
                                                mutableScatterSet7.clear();
                                            } catch (Exception e14) {
                                                e = e14;
                                                mutableScatterSet3 = mutableScatterSet5;
                                                mutableScatterSet4 = mutableScatterSet6;
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            mutableScatterSet3 = mutableScatterSet5;
                                            mutableScatterSet4 = mutableScatterSet6;
                                            z10 = false;
                                        }
                                    } catch (Throwable th6) {
                                        mutableScatterSet7.clear();
                                        throw th6;
                                    }
                                } else {
                                    mutableScatterSet3 = mutableScatterSet5;
                                    mutableScatterSet4 = mutableScatterSet6;
                                }
                                try {
                                    if (mutableScatterSet8.isNotEmpty()) {
                                        try {
                                            objArr2 = mutableScatterSet8.elements;
                                            jArr2 = mutableScatterSet8.metadata;
                                            length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                i13 = 0;
                                                while (true) {
                                                    j12 = jArr2[i13];
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                        j13 = j12;
                                                        for (i15 = 0; i15 < i14; i15++) {
                                                            if ((j13 & 255) < 128) {
                                                                ((ControlledComposition) objArr2[(i13 << 3) + i15]).changesApplied();
                                                            }
                                                            j13 >>= 8;
                                                        }
                                                        if (i14 == 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i13 != length2) {
                                                        break;
                                                    }
                                                    i13++;
                                                }
                                            }
                                            mutableScatterSet8.clear();
                                            synchronized (recomposer2.f14657c) {
                                                recomposer2.b();
                                            }
                                            Snapshot.INSTANCE.notifyObjectsInitialized();
                                            mutableScatterSet4.clear();
                                            mutableScatterSet3.clear();
                                            recomposer2.f14668o = null;
                                            Unit unit5 = Unit.INSTANCE;
                                        } catch (Exception e16) {
                                            Recomposer.j(recomposer2, e16, false, 6);
                                            i.a(recomposer2, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet3, mutableScatterSet4);
                                            mutableScatterSet8.clear();
                                        }
                                    } else {
                                        synchronized (recomposer2.f14657c) {
                                            recomposer2.b();
                                            Snapshot.INSTANCE.notifyObjectsInitialized();
                                            mutableScatterSet4.clear();
                                            mutableScatterSet3.clear();
                                            recomposer2.f14668o = null;
                                            Unit unit6 = Unit.INSTANCE;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    mutableScatterSet8.clear();
                                    throw th7;
                                }
                            } catch (Exception e17) {
                                Recomposer.j(recomposer2, e17, false, 6);
                                i.a(recomposer2, list, list2, list3, mutableScatterSet7, mutableScatterSet8, mutableScatterSet5, mutableScatterSet6);
                                list3.clear();
                            }
                        } catch (Throwable th8) {
                            list3.clear();
                            throw th8;
                        }
                    } else {
                        if (mutableScatterSet7.isNotEmpty()) {
                            mutableScatterSet8.plusAssign(mutableScatterSet7);
                            objArr = mutableScatterSet7.elements;
                            jArr = mutableScatterSet7.metadata;
                            length = jArr.length - 2;
                            if (length >= 0) {
                                i10 = 0;
                                while (true) {
                                    j10 = jArr[i10];
                                    mutableScatterSet3 = mutableScatterSet5;
                                    mutableScatterSet4 = mutableScatterSet6;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        if (i10 != length) {
                                            break;
                                            break;
                                        }
                                        i10++;
                                        mutableScatterSet5 = mutableScatterSet3;
                                        mutableScatterSet6 = mutableScatterSet4;
                                    } else {
                                        i11 = 8 - ((~(i10 - length)) >>> 31);
                                        j11 = j10;
                                        while (i12 < i11) {
                                            if ((j11 & 255) < 128) {
                                                ((ControlledComposition) objArr[(i10 << 3) + i12]).applyLateChanges();
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i11 == 8) {
                                            break;
                                            break;
                                        }
                                        if (i10 != length) {
                                            break;
                                            break;
                                        }
                                        i10++;
                                        mutableScatterSet5 = mutableScatterSet3;
                                        mutableScatterSet6 = mutableScatterSet4;
                                    }
                                }
                            } else {
                                mutableScatterSet3 = mutableScatterSet5;
                                mutableScatterSet4 = mutableScatterSet6;
                            }
                            mutableScatterSet7.clear();
                        } else {
                            mutableScatterSet3 = mutableScatterSet5;
                            mutableScatterSet4 = mutableScatterSet6;
                        }
                        if (mutableScatterSet8.isNotEmpty()) {
                            objArr2 = mutableScatterSet8.elements;
                            jArr2 = mutableScatterSet8.metadata;
                            length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                i13 = 0;
                                while (true) {
                                    j12 = jArr2[i13];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i14 = 8 - ((~(i13 - length2)) >>> 31);
                                        j13 = j12;
                                        while (i15 < i14) {
                                            if ((j13 & 255) < 128) {
                                                ((ControlledComposition) objArr2[(i13 << 3) + i15]).changesApplied();
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i14 == 8) {
                                            break;
                                            break;
                                        }
                                    }
                                    if (i13 != length2) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            mutableScatterSet8.clear();
                            synchronized (recomposer2.f14657c) {
                                recomposer2.b();
                                Snapshot.INSTANCE.notifyObjectsInitialized();
                                mutableScatterSet4.clear();
                                mutableScatterSet3.clear();
                                recomposer2.f14668o = null;
                                Unit unit7 = Unit.INSTANCE;
                            }
                        } else {
                            synchronized (recomposer2.f14657c) {
                                recomposer2.b();
                                Snapshot.INSTANCE.notifyObjectsInitialized();
                                mutableScatterSet4.clear();
                                mutableScatterSet3.clear();
                                recomposer2.f14668o = null;
                                Unit unit8 = Unit.INSTANCE;
                            }
                        }
                    }
                    Trace.INSTANCE.endSection(objBeginSection2);
                    return Unit.INSTANCE;
                } catch (Throwable th9) {
                    Trace.INSTANCE.endSection(objBeginSection2);
                    throw th9;
                }
            }
        }

        public i(Continuation<? super i> continuation) {
            super(3, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0083 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x0085 A[Catch: all -> 0x002b, LOOP:1: B:12:0x0043->B:23:0x0085, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x004e, B:16:0x005a, B:18:0x0064, B:19:0x0074, B:23:0x0085, B:24:0x008e, B:27:0x009b, B:29:0x00aa, B:31:0x00b6, B:33:0x00c0, B:34:0x00ca, B:38:0x00d6, B:39:0x00d9, B:42:0x00e9, B:44:0x00f8, B:46:0x0104, B:48:0x010e, B:49:0x011e, B:55:0x013a, B:56:0x013d), top: B:61:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00d4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d6 A[Catch: all -> 0x002b, LOOP:3: B:27:0x009b->B:38:0x00d6, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x004e, B:16:0x005a, B:18:0x0064, B:19:0x0074, B:23:0x0085, B:24:0x008e, B:27:0x009b, B:29:0x00aa, B:31:0x00b6, B:33:0x00c0, B:34:0x00ca, B:38:0x00d6, B:39:0x00d9, B:42:0x00e9, B:44:0x00f8, B:46:0x0104, B:48:0x010e, B:49:0x011e, B:55:0x013a, B:56:0x013d), top: B:61:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:65:0x008e A[EDGE_INSN: B:65:0x008e->B:24:0x008e BREAK  A[LOOP:1: B:12:0x0043->B:23:0x0085], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:0x00d9 A[EDGE_INSN: B:70:0x00d9->B:39:0x00d9 BREAK  A[LOOP:3: B:27:0x009b->B:38:0x00d6], SYNTHETIC] */
        public static final void a(Recomposer recomposer, List list, List list2, List list3, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, MutableScatterSet mutableScatterSet3, MutableScatterSet mutableScatterSet4) {
            synchronized (recomposer.f14657c) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ControlledComposition controlledComposition = (ControlledComposition) list3.get(i10);
                        controlledComposition.abandonChanges();
                        recomposer.l(controlledComposition);
                    }
                    list3.clear();
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
                    int length = jArr.length - 2;
                    long j10 = -9187201950435737472L;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j11 = jArr[i11];
                            long[] jArr2 = jArr;
                            if ((((~j11) << 7) & j11 & j10) != j10) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j11 & 255) < 128) {
                                        ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i11 << 3) + i13];
                                        controlledComposition2.abandonChanges();
                                        recomposer.l(controlledComposition2);
                                    }
                                    j11 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                                if (i11 != length) {
                                    break;
                                }
                                i11++;
                                jArr = jArr2;
                                j10 = -9187201950435737472L;
                            } else if (i11 != length) {
                                break;
                                break;
                            } else {
                                i11++;
                                jArr = jArr2;
                                j10 = -9187201950435737472L;
                            }
                        }
                    }
                    mutableScatterSet.clear();
                    Object[] objArr2 = mutableScatterSet2.elements;
                    long[] jArr3 = mutableScatterSet2.metadata;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j12 = jArr3[i14];
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i14 != length2) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((j12 & 255) < 128) {
                                        ((ControlledComposition) objArr2[(i14 << 3) + i16]).changesApplied();
                                    }
                                    j12 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                } else if (i14 != length2) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    mutableScatterSet2.clear();
                    mutableScatterSet3.clear();
                    Object[] objArr3 = mutableScatterSet4.elements;
                    long[] jArr4 = mutableScatterSet4.metadata;
                    int length3 = jArr4.length - 2;
                    if (length3 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j13 = jArr4[i17];
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((j13 & 255) < 128) {
                                        ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i17 << 3) + i19];
                                        controlledComposition3.abandonChanges();
                                        recomposer.l(controlledComposition3);
                                    }
                                    j13 >>= 8;
                                }
                                if (i18 != 8) {
                                    break;
                                }
                            }
                            if (i17 == length3) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                    mutableScatterSet4.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public static final void b(List list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.f14657c) {
                try {
                    List list2 = recomposer.f14665k;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((MovableContentStateReference) list2.get(i10));
                    }
                    recomposer.f14665k.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            i iVar = Recomposer.this.new i(continuation);
            iVar.f14706y0 = monotonicFrameClock;
            return iVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:15:0x00d0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:19:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:21:0x0137 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0138  */
        /* JADX WARN: Code duplicated, block: B:25:0x0150  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0138 -> B:23:0x0144). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0150 -> B:24:0x014d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {890, StatusCode.ERROR_WHILE_PLAYING_HAPTICS, 911}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1646:1\n33#2,7:1647\n485#3:1654\n486#3,6:1656\n492#3,2:1666\n495#3:1669\n496#3,7:1682\n89#4:1655\n89#4:1677\n89#4:1689\n33#5,4:1662\n38#5:1668\n460#6,7:1670\n467#6,4:1678\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n880#1:1647,7\n893#1:1654\n893#1:1656,6\n893#1:1666,2\n893#1:1669\n893#1:1682,7\n893#1:1655\n894#1:1677\n906#1:1689\n893#1:1662,4\n893#1:1668\n893#1:1670,7\n893#1:1678,4\n*E\n"})
    public static final class j extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Job f14715p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f14716q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f14717r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f14718s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f14719t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Recomposer f14720u0;

        /* JADX INFO: compiled from: Recomposer.kt */
        @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n89#2:1647\n1#3:1648\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n*L\n899#1:1647\n*E\n"})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Recomposer f14721p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ControlledComposition f14722q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Recomposer recomposer, ControlledComposition controlledComposition, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f14721p0 = recomposer;
                this.f14722q0 = controlledComposition;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f14721p0, this.f14722q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CancellableContinuation cancellableContinuationB;
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ControlledComposition controlledCompositionAccess$performRecompose = Recomposer.access$performRecompose(this.f14721p0, this.f14722q0, null);
                Object obj2 = this.f14721p0.f14657c;
                Recomposer recomposer = this.f14721p0;
                synchronized (obj2) {
                    if (controlledCompositionAccess$performRecompose != null) {
                        try {
                            recomposer.f14664j.add(controlledCompositionAccess$performRecompose);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    recomposer.f14670q--;
                    cancellableContinuationB = recomposer.b();
                }
                if (cancellableContinuationB != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationB.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: Recomposer.kt */
        @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1", f = "Recomposer.kt", i = {}, l = {com.salesforce.marketingcloud.analytics.b.C}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f14723p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Recomposer f14724q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ MonotonicFrameClock f14725r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ x f14726s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Recomposer recomposer, MonotonicFrameClock monotonicFrameClock, x xVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f14724q0 = recomposer;
                this.f14725r0 = monotonicFrameClock;
                this.f14726s0 = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f14724q0, this.f14725r0, this.f14726s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f14723p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f14723p0 = 1;
                    if (Recomposer.access$runFrameLoop(this.f14724q0, this.f14725r0, this.f14726s0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super j> continuation) {
            super(3, continuation);
            this.f14719t0 = coroutineContext;
            this.f14720u0 = recomposer;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            j jVar = new j(this.f14719t0, this.f14720u0, continuation);
            jVar.f14717r0 = coroutineScope;
            jVar.f14718s0 = monotonicFrameClock;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0154 A[EDGE_INSN: B:101:0x0154->B:55:0x0154 BREAK  A[LOOP:1: B:43:0x0115->B:50:0x0146], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:50:0x0146 A[LOOP:1: B:43:0x0115->B:50:0x0146, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:98:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bd -> B:26:0x00bf). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 465
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Recomposer(@NotNull CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new e());
        this.f14656b = broadcastFrameClock;
        this.f14657c = new Object();
        this.f14660f = new ArrayList();
        this.f14662h = new MutableScatterSet<>(0, 1, null);
        this.f14663i = new MutableVector<>(new ControlledComposition[16], 0);
        this.f14664j = new ArrayList();
        this.f14665k = new ArrayList();
        this.f14666l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.f14674u = StateFlowKt.MutableStateFlow(State.Inactive);
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.INSTANCE));
        completableJobJob.invokeOnCompletion(new f());
        this.f14675v = completableJobJob;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(completableJobJob);
        this.f14677x = new c();
    }

    public static void a(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
            mutableSnapshot.dispose();
        } catch (Throwable th2) {
            mutableSnapshot.dispose();
            throw th2;
        }
    }

    public static final Object access$awaitWorkAvailable(Recomposer recomposer, Continuation continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (recomposer.d()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl2.initCancellability();
        synchronized (recomposer.f14657c) {
            if (recomposer.d()) {
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                recomposer.f14669p = cancellableContinuationImpl2;
                cancellableContinuationImpl = null;
            }
        }
        if (cancellableContinuationImpl != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl2.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == ek.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final void access$discardUnusedValues(Recomposer recomposer) {
        int i10;
        List listEmptyList;
        synchronized (recomposer.f14657c) {
            try {
                if (!recomposer.f14666l.isEmpty()) {
                    List listFlatten = CollectionsKt__IterablesKt.flatten(recomposer.f14666l.values());
                    recomposer.f14666l.clear();
                    ArrayList arrayList = new ArrayList(listFlatten.size());
                    int size = listFlatten.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) listFlatten.get(i11);
                        arrayList.add(TuplesKt.to(movableContentStateReference, recomposer.m.get(movableContentStateReference)));
                    }
                    recomposer.m.clear();
                    listEmptyList = arrayList;
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = listEmptyList.size();
        for (i10 = 0; i10 < size2; i10++) {
            Pair pair = (Pair) listEmptyList.get(i10);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    public static final boolean access$getHasBroadcastFrameClockAwaiters(Recomposer recomposer) {
        boolean zC;
        synchronized (recomposer.f14657c) {
            zC = recomposer.c();
        }
        return zC;
    }

    public static final boolean access$getHasConcurrentFrameWorkLocked(Recomposer recomposer) {
        return (recomposer.f14664j.isEmpty() ^ true) || recomposer.c();
    }

    public static final boolean access$getShouldKeepRecomposing(Recomposer recomposer) {
        boolean z10;
        synchronized (recomposer.f14657c) {
            z10 = !recomposer.f14671r;
        }
        if (z10) {
            return true;
        }
        Iterator<Job> it = recomposer.f14675v.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    public static final ControlledComposition access$performRecompose(Recomposer recomposer, ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet) {
        recomposer.getClass();
        if (controlledComposition.isComposing() || controlledComposition.getP0()) {
            return null;
        }
        Set<ControlledComposition> set = recomposer.f14668o;
        if (set != null && set.contains(controlledComposition)) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(new a0(controlledComposition), new d0(mutableScatterSet, controlledComposition));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            if (mutableScatterSet != null) {
                try {
                    if (mutableScatterSet.isNotEmpty()) {
                        controlledComposition.prepareCompose(new z(mutableScatterSet, controlledComposition));
                    }
                } catch (Throwable th2) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            }
            boolean zRecompose = controlledComposition.recompose();
            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            a(mutableSnapshotTakeMutableSnapshot);
            if (!zRecompose) {
                controlledComposition = null;
            }
            return controlledComposition;
        } catch (Throwable th3) {
            a(mutableSnapshotTakeMutableSnapshot);
            throw th3;
        }
    }

    public static final boolean access$recordComposerModifications(Recomposer recomposer) {
        boolean z10;
        List<ControlledComposition> listE;
        synchronized (recomposer.f14657c) {
            z10 = false;
            int i10 = 1;
            if (recomposer.f14662h.isEmpty()) {
                z10 = recomposer.f14663i.isNotEmpty() || recomposer.c();
            } else {
                Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(recomposer.f14662h);
                DefaultConstructorMarker defaultConstructorMarker = null;
                recomposer.f14662h = new MutableScatterSet<>(z10 ? 1 : 0, i10, defaultConstructorMarker);
                synchronized (recomposer.f14657c) {
                    listE = recomposer.e();
                }
                try {
                    int size = listE.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        listE.get(i11).recordModificationsOf(setWrapIntoSet);
                        if (recomposer.f14674u.getValue().compareTo(State.ShuttingDown) <= 0) {
                            break;
                        }
                    }
                    synchronized (recomposer.f14657c) {
                        recomposer.f14662h = new MutableScatterSet<>(z10 ? 1 : 0, i10, defaultConstructorMarker);
                        Unit unit = Unit.INSTANCE;
                    }
                    synchronized (recomposer.f14657c) {
                        if (recomposer.b() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                        z10 = recomposer.f14663i.isNotEmpty() || recomposer.c();
                    }
                } catch (Throwable th2) {
                    synchronized (recomposer.f14657c) {
                        recomposer.f14662h.addAll(setWrapIntoSet);
                        throw th2;
                    }
                }
            }
        }
        return z10;
    }

    public static final void access$registerRunnerJob(Recomposer recomposer, Job job) {
        synchronized (recomposer.f14657c) {
            Throwable th2 = recomposer.f14659e;
            if (th2 != null) {
                throw th2;
            }
            if (recomposer.f14674u.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (recomposer.f14658d != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            recomposer.f14658d = job;
            recomposer.b();
        }
    }

    public static final b access$resetErrorState(Recomposer recomposer) {
        b bVar;
        synchronized (recomposer.f14657c) {
            bVar = recomposer.f14672s;
            if (bVar != null) {
                recomposer.f14672s = null;
                recomposer.b();
            }
        }
        return bVar;
    }

    public static final void access$retryFailedCompositions(Recomposer recomposer) {
        ArrayList arrayList;
        int i10;
        synchronized (recomposer.f14657c) {
            arrayList = recomposer.f14667n;
            recomposer.f14667n = null;
        }
        if (arrayList == null) {
            return;
        }
        while (true) {
            i10 = 0;
            try {
                if (!(!arrayList.isEmpty())) {
                    break;
                }
                ControlledComposition controlledComposition = (ControlledComposition) bk.g.removeLast(arrayList);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (recomposer.f14672s != null) {
                        break;
                    }
                }
            } catch (Throwable th2) {
                if (!arrayList.isEmpty()) {
                    synchronized (recomposer.f14657c) {
                        try {
                            int size = arrayList.size();
                            while (i10 < size) {
                                recomposer.l((ControlledComposition) arrayList.get(i10));
                                i10++;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                throw th2;
            }
        }
        if (!arrayList.isEmpty()) {
            synchronized (recomposer.f14657c) {
                try {
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        recomposer.l((ControlledComposition) arrayList.get(i10));
                        i10++;
                    }
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {, blocks: (B:20:0x0081, B:22:0x0089, B:27:0x0096), top: B:58:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:20:0x0081, B:22:0x0089, B:27:0x0096), top: B:58:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:31:0x00a6, B:33:0x00ae, B:36:0x00b8), top: B:60:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:31:0x00a6, B:33:0x00ae, B:36:0x00b8), top: B:60:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r2.withFrameNanos(r12, r0) == r1) goto L53;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0101 -> B:13:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$runFrameLoop(androidx.compose.runtime.Recomposer r9, androidx.compose.runtime.MonotonicFrameClock r10, m0.x r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.access$runFrameLoop(androidx.compose.runtime.Recomposer, androidx.compose.runtime.MonotonicFrameClock, m0.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void g(ArrayList arrayList, Recomposer recomposer, ControlledComposition controlledComposition) {
        arrayList.clear();
        synchronized (recomposer.f14657c) {
            try {
                Iterator it = recomposer.f14665k.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) it.next();
                    if (Intrinsics.areEqual(movableContentStateReference.getComposition(), controlledComposition)) {
                        arrayList.add(movableContentStateReference);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void j(Recomposer recomposer, Exception exc, boolean z10, int i10) throws Exception {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        recomposer.i(exc, null, z10);
    }

    @NotNull
    public final RecomposerInfo asRecomposerInfo() {
        return this.f14677x;
    }

    @Nullable
    public final Object awaitIdle(@NotNull Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.collect(FlowKt.takeWhile(getCurrentState(), new d(2, null)), continuation);
        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final CancellableContinuation<Unit> b() {
        State state;
        MutableStateFlow<State> mutableStateFlow = this.f14674u;
        int iCompareTo = mutableStateFlow.getValue().compareTo(State.ShuttingDown);
        ArrayList arrayList = this.f14665k;
        ArrayList arrayList2 = this.f14664j;
        int i10 = 0;
        MutableVector<ControlledComposition> mutableVector = this.f14663i;
        int i11 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (iCompareTo <= 0) {
            this.f14660f.clear();
            this.f14661g = CollectionsKt__CollectionsKt.emptyList();
            this.f14662h = new MutableScatterSet<>(i10, i11, defaultConstructorMarker);
            mutableVector.clear();
            arrayList2.clear();
            arrayList.clear();
            this.f14667n = null;
            CancellableContinuation<? super Unit> cancellableContinuation = this.f14669p;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.f14669p = null;
            this.f14672s = null;
            return null;
        }
        if (this.f14672s != null) {
            state = State.Inactive;
        } else if (this.f14658d == null) {
            this.f14662h = new MutableScatterSet<>(i10, i11, defaultConstructorMarker);
            mutableVector.clear();
            state = c() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (mutableVector.isNotEmpty() || this.f14662h.isNotEmpty() || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || this.f14670q > 0 || c()) ? State.PendingWork : State.Idle;
        }
        mutableStateFlow.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.f14669p;
        this.f14669p = null;
        return cancellableContinuation2;
    }

    public final boolean c() {
        return !this.f14673t && this.f14656b.getHasAwaiters();
    }

    public final void cancel() {
        synchronized (this.f14657c) {
            try {
                if (this.f14674u.getValue().compareTo(State.Idle) >= 0) {
                    this.f14674u.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.f14675v, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.f14675v.complete()) {
            synchronized (this.f14657c) {
                this.f14671r = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) throws Exception {
        boolean zIsComposing = composition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(new a0(composition), new d0(null, composition));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    composition.composeContent(content);
                    Unit unit = Unit.INSTANCE;
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    a(mutableSnapshotTakeMutableSnapshot);
                    if (!zIsComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.f14657c) {
                        if (this.f14674u.getValue().compareTo(State.ShuttingDown) > 0 && !e().contains(composition)) {
                            this.f14660f.add(composition);
                            this.f14661g = null;
                        }
                    }
                    try {
                        f(composition);
                        try {
                            composition.applyChanges();
                            composition.applyLateChanges();
                            if (zIsComposing) {
                                return;
                            }
                            companion.notifyObjectsInitialized();
                        } catch (Exception e5) {
                            j(this, e5, false, 6);
                        }
                    } catch (Exception e7) {
                        i(e7, composition, true);
                    }
                } catch (Throwable th2) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                a(mutableSnapshotTakeMutableSnapshot);
                throw th3;
            }
        } catch (Exception e10) {
            i(e10, composition, true);
        }
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.f14657c) {
            z10 = this.f14662h.isNotEmpty() || this.f14663i.isNotEmpty() || c();
        }
        return z10;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        synchronized (this.f14657c) {
            RecomposerKt.addMultiValue(this.f14666l, reference.getContent$runtime_release(), reference);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> e() {
        List list = this.f14661g;
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = this.f14660f;
            List listEmptyList = arrayList.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : new ArrayList(arrayList);
            this.f14661g = listEmptyList;
            list2 = listEmptyList;
        }
        return list2;
    }

    public final void f(ControlledComposition controlledComposition) {
        synchronized (this.f14657c) {
            ArrayList arrayList = this.f14665k;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.areEqual(((MovableContentStateReference) arrayList.get(i10)).getComposition(), controlledComposition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList2 = new ArrayList();
                    g(arrayList2, this, controlledComposition);
                    while (!arrayList2.isEmpty()) {
                        h(arrayList2, null);
                        g(arrayList2, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return f14654z.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @NotNull
    public final StateFlow<State> getCurrentState() {
        return this.f14674u;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z10;
        synchronized (this.f14657c) {
            z10 = true;
            if (!this.f14662h.isNotEmpty() && !this.f14663i.isNotEmpty() && this.f14670q <= 0 && !(!this.f14664j.isEmpty()) && !c()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @NotNull
    public final Flow<State> getState() {
        return getCurrentState();
    }

    public final List<ControlledComposition> h(List<MovableContentStateReference> list, MutableScatterSet<Object> mutableScatterSet) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            MovableContentStateReference movableContentStateReference = list.get(i10);
            ControlledComposition composition = movableContentStateReference.getComposition();
            Object arrayList2 = map.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(movableContentStateReference);
        }
        for (Map.Entry entry : map.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(new a0(controlledComposition), new d0(mutableScatterSet, controlledComposition));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.f14657c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list2.get(i11);
                            arrayList.add(TuplesKt.to(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.f14666l, movableContentStateReference2.getContent$runtime_release())));
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        if (((Pair) arrayList.get(i12)).getSecond() != null) {
                            int size4 = arrayList.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                if (((Pair) arrayList.get(i13)).getSecond() == null) {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size5 = arrayList.size();
                                    for (int i14 = 0; i14 < size5; i14++) {
                                        Pair pair = (Pair) arrayList.get(i14);
                                        MovableContentStateReference movableContentStateReference3 = pair.getSecond() == null ? (MovableContentStateReference) pair.getFirst() : null;
                                        if (movableContentStateReference3 != null) {
                                            arrayList3.add(movableContentStateReference3);
                                        }
                                    }
                                    synchronized (this.f14657c) {
                                        bk.g.addAll(this.f14665k, arrayList3);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i15 = 0; i15 < size6; i15++) {
                                        Object obj = arrayList.get(i15);
                                        if (((Pair) obj).getSecond() != null) {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    arrayList = arrayList4;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    Unit unit2 = Unit.INSTANCE;
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    a(mutableSnapshotTakeMutableSnapshot);
                } catch (Throwable th2) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                a(mutableSnapshotTakeMutableSnapshot);
                throw th3;
            }
        }
        return CollectionsKt___CollectionsKt.toList(map.keySet());
    }

    public final void i(Exception exc, ControlledComposition controlledComposition, boolean z10) throws Exception {
        int i10 = 0;
        if (!f14654z.get().booleanValue() || (exc instanceof ComposeRuntimeError)) {
            synchronized (this.f14657c) {
                b bVar = this.f14672s;
                if (bVar != null) {
                    throw bVar.f14681b;
                }
                this.f14672s = new b(false, exc);
                Unit unit = Unit.INSTANCE;
            }
            throw exc;
        }
        synchronized (this.f14657c) {
            try {
                ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exc);
                this.f14664j.clear();
                this.f14663i.clear();
                this.f14662h = new MutableScatterSet<>(i10, 1, null);
                this.f14665k.clear();
                this.f14666l.clear();
                this.m.clear();
                this.f14672s = new b(z10, exc);
                if (controlledComposition != null) {
                    l(controlledComposition);
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        CancellableContinuation<Unit> cancellableContinuationB;
        synchronized (this.f14657c) {
            this.f14665k.add(reference);
            cancellableContinuationB = b();
        }
        if (cancellableContinuationB != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationB.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
        CancellableContinuation<Unit> cancellableContinuationB;
        synchronized (this.f14657c) {
            if (this.f14663i.contains(composition)) {
                cancellableContinuationB = null;
            } else {
                this.f14663i.add(composition);
                cancellableContinuationB = b();
            }
        }
        if (cancellableContinuationB != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationB.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
        CancellableContinuation<Unit> cancellableContinuationB;
        synchronized (this.f14657c) {
            this.f14662h.add(scope);
            cancellableContinuationB = b();
        }
        if (cancellableContinuationB != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationB.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
    }

    @Nullable
    public final Object join(@NotNull Continuation<? super Unit> continuation) {
        Object objFirst = FlowKt.first(getCurrentState(), new g(2, null), continuation);
        return objFirst == ek.a.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    public final Object k(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.f14656b, new h(function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void l(ControlledComposition controlledComposition) {
        ArrayList arrayList = this.f14667n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f14667n = arrayList;
        }
        if (!arrayList.contains(controlledComposition)) {
            arrayList.add(controlledComposition);
        }
        this.f14660f.remove(controlledComposition);
        this.f14661g = null;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) {
        synchronized (this.f14657c) {
            this.m.put(reference, data);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        MovableContentState movableContentState;
        synchronized (this.f14657c) {
            movableContentState = (MovableContentState) this.m.remove(reference);
        }
        return movableContentState;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.f14657c) {
            this.f14673t = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(@NotNull ControlledComposition composition) {
        synchronized (this.f14657c) {
            try {
                Set linkedHashSet = this.f14668o;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f14668o = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation<Unit> cancellableContinuationB;
        synchronized (this.f14657c) {
            if (this.f14673t) {
                this.f14673t = false;
                cancellableContinuationB = b();
            } else {
                cancellableContinuationB = null;
            }
        }
        if (cancellableContinuationB != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationB.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
    }

    @Nullable
    public final Object runRecomposeAndApplyChanges(@NotNull Continuation<? super Unit> continuation) {
        Object objK = k(new i(null), continuation);
        return objK == ek.a.getCOROUTINE_SUSPENDED() ? objK : Unit.INSTANCE;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super Unit> continuation) {
        Object objK = k(new j(coroutineContext, this, null), continuation);
        return objK == ek.a.getCOROUTINE_SUSPENDED() ? objK : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
        synchronized (this.f14657c) {
            this.f14660f.remove(composition);
            this.f14661g = null;
            this.f14663i.remove(composition);
            this.f14664j.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
    }
}
