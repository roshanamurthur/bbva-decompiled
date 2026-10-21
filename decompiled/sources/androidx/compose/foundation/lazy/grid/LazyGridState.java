package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.o;
import u0.e;
import u0.f;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ©\u00012\u00020\u0001:\u0002©\u0001B\u001e\u0012\t\b\u0002\u0010\u0096\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0098\u0001\u001a\u00020\u0002¢\u0006\u0005\b¨\u0001\u0010\tJ%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJD\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0007J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00103\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R+\u0010:\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010N\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u00107R\"\u0010R\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010E\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR$\u0010Z\u001a\u0004\u0018\u00010S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010f\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0088\u0001\u0010t\u001a/\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bh\u0012\b\bi\u0012\u0004\b\b(j\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020m0l0k0g23\u0010.\u001a/\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bh\u0012\b\bi\u0012\u0004\b\b(j\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020m0l0k0g8@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010z\u001a\u00020u8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001b\u0010\u0080\u0001\u001a\u00020{8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R/\u0010\u008a\u0001\u001a\u00020C2\u0006\u0010.\u001a\u00020C8V@RX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010o\u001a\u0005\b\u0088\u0001\u0010G\"\u0005\b\u0089\u0001\u0010IR/\u0010\u008e\u0001\u001a\u00020C2\u0006\u0010.\u001a\u00020C8V@RX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010o\u001a\u0005\b\u008c\u0001\u0010G\"\u0005\b\u008d\u0001\u0010IR \u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0013\u0010\u0096\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u00107R\u0013\u0010\u0098\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u00107R\u0015\u0010\u009c\u0001\u001a\u00030\u0099\u00018F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0015\u0010 \u0001\u001a\u00030\u009d\u00018F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010¦\u0001\u001a\u00030¡\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001*\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010§\u0001\u001a\u00020C8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006ª\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "(II)V", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "distance", "onScroll$foundation_release", "(F)F", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", "updateScrollPositionIfTheFirstItemWasMoved", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "c", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "<set-?>", "d", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", "e", "Landroidx/compose/runtime/MutableIntState;", "getSlotsPerLine$foundation_release", "()I", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine", "Landroidx/compose/ui/unit/Density;", "f", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "", "g", "Z", "isVertical$foundation_release", "()Z", "setVertical$foundation_release", "(Z)V", "isVertical", "i", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNumMeasurePasses$foundation_release", "numMeasurePasses", "j", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "prefetchingEnabled", "Landroidx/compose/ui/layout/Remeasurement;", "n", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement$foundation_release", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "o", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "p", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "q", "Landroidx/compose/runtime/MutableState;", "getPrefetchInfoRetriever$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setPrefetchInfoRetriever$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "r", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "s", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "u", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", SharedPrefsStorage.VERSION_KEY, "getCanScrollForward", "setCanScrollForward", "canScrollForward", "w", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "x", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,468:1\n1182#2:469\n1161#2,2:470\n75#3:472\n108#3,2:473\n81#4:475\n107#4,2:476\n81#4:478\n81#4:479\n107#4,2:480\n81#4:482\n107#4,2:483\n460#5,11:485\n460#5,11:502\n33#6,6:496\n495#7,4:513\n500#7:522\n129#8,5:517\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n194#1:469\n194#1:470,2\n154#1:472\n154#1:473,2\n227#1:475\n227#1:476,2\n240#1:478\n290#1:479\n290#1:480,2\n292#1:482\n292#1:483,2\n361#1:485,11\n388#1:502,11\n366#1:496,6\n436#1:513,4\n436#1:522\n436#1:517,5\n*E\n"})
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final Saver<LazyGridState, ?> f4873y = ListSaverKt.listSaver(a.f4897p0, b.f4898p0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyGridScrollPosition f4874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState<LazyGridLayoutInfo> f4875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableInteractionSource internalInteractionSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float scrollToBeConsumed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntState slotsPerLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Density density;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isVertical;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ScrollableState f4881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int numMeasurePasses;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean prefetchingEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> f4885l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Remeasurement remeasurement;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final LazyGridState$remeasurementModifier$1 f4887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState prefetchInfoRetriever;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyGridItemPlacementAnimator placementAnimator;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final LazyGridAnimateScrollScope f4892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutPinnedItemList pinnedItems;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState canScrollForward;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState canScrollBackward;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutPrefetchState prefetchState;

    /* JADX INFO: compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.f4873y;
        }
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    public static final class a extends Lambda implements Function2<SaverScope, LazyGridState, List<? extends Integer>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4897p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Integer> invoke(SaverScope saverScope, LazyGridState lazyGridState) {
            SaverScope listSaver = saverScope;
            LazyGridState it = lazyGridState;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset())});
        }
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    public static final class b extends Lambda implements Function1<List<? extends Integer>, LazyGridState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f4898p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final LazyGridState invoke(List<? extends Integer> list) {
            List<? extends Integer> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyGridState(it.get(0).intValue(), it.get(1).intValue());
        }
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    public static final class c extends Lambda implements Function1<Integer, List<? extends Pair<? extends Integer, ? extends Constraints>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f4899p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
            num.intValue();
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0, 0}, l = {280, 281}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LazyGridState f4900p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MutatePriority f4901q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function2 f4902r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f4903s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f4905u0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4903s0 = obj;
            this.f4905u0 |= Integer.MIN_VALUE;
            return LazyGridState.this.scroll(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f4907q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f4908r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, int i11, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f4907q0 = i10;
            this.f4908r0 = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LazyGridState.this.new e(this.f4907q0, this.f4908r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((e) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LazyGridState.this.snapToItemIndexInternal$foundation_release(this.f4907q0, this.f4908r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    public static final class f extends Lambda implements Function1<Float, Float> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            return Float.valueOf(-LazyGridState.this.onScroll$foundation_release(-f6.floatValue()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridState() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyGridState.animateScrollToItem(i10, i11, continuation);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyGridState.scrollToItem(i10, i11, continuation);
    }

    public static /* synthetic */ int updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(LazyGridState lazyGridState, LazyGridItemProvider lazyGridItemProvider, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int index = lazyGridState.f4874a.getIndex();
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    i10 = index;
                } catch (Throwable th2) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th3;
            }
        }
        return lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider, i10);
    }

    @Nullable
    public final Object animateScrollToItem(int i10, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.f4892t, i10, i11, continuation);
        return objAnimateScrollToItem == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyGridMeasureResult result) {
        int row;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f4874a.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.f4875b.setValue(result);
        this.canScrollForward.setValue(Boolean.valueOf(result.getCanScrollForward()));
        LazyGridMeasuredLine firstVisibleLine = result.getFirstVisibleLine();
        int i10 = 0;
        this.canScrollBackward.setValue(Boolean.valueOf(((firstVisibleLine == null || firstVisibleLine.getIndex() == 0) && result.getFirstVisibleLineScrollOffset() == 0) ? false : true));
        this.numMeasurePasses++;
        if (this.f4884k == -1 || !(!result.getVisibleItemsInfo().isEmpty())) {
            return;
        }
        if (this.m) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.last((List) result.getVisibleItemsInfo());
            row = (this.isVertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt___CollectionsKt.first((List) result.getVisibleItemsInfo());
            row = (this.isVertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.f4884k != row) {
            this.f4884k = -1;
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.f4885l;
            int size = mutableVector.getSize();
            if (size > 0) {
                LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                do {
                    content[i10].cancel();
                    i10++;
                } while (i10 < size);
            }
            mutableVector.clear();
        }
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.f4881h.dispatchRawDelta(delta);
    }

    @NotNull
    /* JADX INFO: renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    @NotNull
    /* JADX INFO: renamed from: getBeyondBoundsInfo$foundation_release, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final int getFirstVisibleItemIndex() {
        return this.f4874a.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f4874a.getScrollOffset();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    /* JADX INFO: renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.f4875b.getValue();
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.f4874a.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: getNumMeasurePasses$foundation_release, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    @NotNull
    /* JADX INFO: renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    @NotNull
    /* JADX INFO: renamed from: getPlacementAnimator$foundation_release, reason: from getter */
    public final LazyGridItemPlacementAnimator getPlacementAnimator() {
        return this.placementAnimator;
    }

    @NotNull
    public final Function1<Integer, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (Function1) this.prefetchInfoRetriever.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: getRemeasurement$foundation_release, reason: from getter */
    public final Remeasurement getRemeasurement() {
        return this.remeasurement;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.f4887o;
    }

    /* JADX INFO: renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final int getSlotsPerLine$foundation_release() {
        return this.slotsPerLine.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f4881h.isScrollInProgress();
    }

    /* JADX INFO: renamed from: isVertical$foundation_release, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final float onScroll$foundation_release(float distance) {
        int row;
        int index;
        int size;
        if ((distance < 0.0f && !getCanScrollForward()) || (distance > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f6 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f6;
        if (Math.abs(f6) > 0.5f) {
            float f10 = this.scrollToBeConsumed;
            Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
            boolean z10 = this.prefetchingEnabled;
            if (z10) {
                float f11 = f10 - this.scrollToBeConsumed;
                if (z10) {
                    LazyGridLayoutInfo layoutInfo = getLayoutInfo();
                    if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                        boolean z11 = f11 < 0.0f;
                        if (z11) {
                            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo());
                            row = (this.isVertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
                            index = ((LazyGridItemInfo) CollectionsKt___CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
                        } else {
                            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt___CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo());
                            row = (this.isVertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
                            index = ((LazyGridItemInfo) CollectionsKt___CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
                        }
                        if (row != this.f4884k && index >= 0 && index < layoutInfo.getTotalItemsCount()) {
                            boolean z12 = this.m;
                            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.f4885l;
                            if (z12 != z11 && (size = mutableVector.getSize()) > 0) {
                                LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                                int i10 = 0;
                                do {
                                    content[i10].cancel();
                                    i10++;
                                } while (i10 < size);
                            }
                            this.m = z11;
                            this.f4884k = row;
                            mutableVector.clear();
                            List<Pair<Integer, Constraints>> listInvoke = getPrefetchInfoRetriever$foundation_release().invoke(Integer.valueOf(row));
                            int size2 = listInvoke.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                Pair<Integer, Constraints> pair = listInvoke.get(i11);
                                mutableVector.add(this.prefetchState.m416schedulePrefetch0kLqBqw(pair.getFirst().intValue(), pair.getSecond().getF18296a()));
                            }
                        }
                    }
                }
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f12 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f12;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        d dVar;
        LazyGridState lazyGridState;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f4905u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f4905u0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f4903s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f4905u0;
        if (i11 != 0) {
            if (i11 == 1) {
                function2 = dVar.f4902r0;
                mutatePriority = dVar.f4901q0;
                lazyGridState = dVar.f4900p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        dVar.f4900p0 = this;
        dVar.f4901q0 = mutatePriority;
        dVar.f4902r0 = function2;
        dVar.f4905u0 = 1;
        if (this.awaitLayoutModifier.waitForFirstLayout(dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        lazyGridState = this;
        ScrollableState scrollableState = lazyGridState.f4881h;
        dVar.f4900p0 = null;
        dVar.f4901q0 = null;
        dVar.f4902r0 = null;
        dVar.f4905u0 = 2;
        if (scrollableState.scroll(mutatePriority, function2, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollToItem(int i10, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objE = o.e(this, null, new e(i10, i11, null), continuation, 1, null);
        return objE == ek.a.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    public final void setPrefetchInfoRetriever$foundation_release(@NotNull Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.prefetchInfoRetriever.setValue(function1);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    public final void setRemeasurement$foundation_release(@Nullable Remeasurement remeasurement) {
        this.remeasurement = remeasurement;
    }

    public final void setSlotsPerLine$foundation_release(int i10) {
        this.slotsPerLine.setIntValue(i10);
    }

    public final void setVertical$foundation_release(boolean z10) {
        this.isVertical = z10;
    }

    public final void snapToItemIndexInternal$foundation_release(int index, int scrollOffset) {
        this.f4874a.requestPosition(index, scrollOffset);
        this.placementAnimator.reset();
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyGridItemProvider itemProvider, int firstItemIndex) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        return this.f4874a.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1] */
    public LazyGridState(int i10, int i11) {
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i10, i11);
        this.f4874a = lazyGridScrollPosition;
        this.f4875b = SnapshotStateKt.mutableStateOf$default(z.b.f94883a, null, 2, null);
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine = SnapshotIntStateKt.mutableIntStateOf(0);
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.isVertical = true;
        this.f4881h = ScrollableStateKt.ScrollableState(new f());
        this.prefetchingEnabled = true;
        this.f4884k = -1;
        this.f4885l = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.f4887o = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ boolean all(Function1 function1) {
                return f.a(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ boolean any(Function1 function1) {
                return f.b(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                return f.c(this, obj, function2);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                return f.d(this, obj, function2);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement) {
                Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
                this.f4910a.setRemeasurement$foundation_release(remeasurement);
            }

            @Override // androidx.compose.ui.Modifier
            public final /* synthetic */ Modifier then(Modifier modifier) {
                return e.a(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.prefetchInfoRetriever = SnapshotStateKt.mutableStateOf$default(c.f4899p0, null, 2, null);
        this.placementAnimator = new LazyGridItemPlacementAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.f4892t = new LazyGridAnimateScrollScope(this);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyGridState(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
