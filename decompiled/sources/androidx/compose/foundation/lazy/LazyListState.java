package androidx.compose.foundation.lazy;

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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
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

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0098\u00012\u00020\u0001:\u0002\u0098\u0001B\u001e\u0012\t\b\u0002\u0010\u0085\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0087\u0001\u001a\u00020\u0002¢\u0006\u0005\b\u0097\u0001\u0010\tJ%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJD\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0007J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00103\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010@\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010N\u001a\u0004\u0018\u00010I2\b\u0010.\u001a\u0004\u0018\u00010I8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010Z\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010f\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR+\u0010n\u001a\u00020g8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010t\u001a\u00020o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR+\u0010y\u001a\u00020A2\u0006\u0010.\u001a\u00020A8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010E\"\u0004\bx\u0010GR+\u0010}\u001a\u00020A2\u0006\u0010.\u001a\u00020A8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010v\u001a\u0004\b{\u0010E\"\u0004\b|\u0010GR\u001e\u0010\u0083\u0001\u001a\u00020~8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0013\u0010\u0085\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010?R\u0013\u0010\u0087\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010?R\u0015\u0010\u008b\u0001\u001a\u00030\u0088\u00018F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010\u008f\u0001\u001a\u00030\u008c\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0095\u0001\u001a\u00030\u0090\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001*\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0096\u0001\u001a\u00020A8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010E\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0099\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "(II)V", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "distance", "onScroll$foundation_release", "(F)F", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", "updateScrollPositionIfTheFirstItemWasMoved", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "d", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "<set-?>", "e", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Density;", "f", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "h", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "", "i", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/layout/Remeasurement;", "m", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "n", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "o", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "p", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "q", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/ui/unit/Constraints;", "r", "J", "getPremeasureConstraints-msEJaDk$foundation_release", "()J", "setPremeasureConstraints-BRTryo0$foundation_release", "(J)V", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "s", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "t", "Landroidx/compose/runtime/MutableState;", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "u", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", SharedPrefsStorage.VERSION_KEY, "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/LazyListState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,439:1\n81#2:440\n81#2:441\n107#2,2:442\n81#2:444\n107#2,2:445\n495#3,4:447\n500#3:456\n129#4,5:451\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n229#1:440\n279#1:441\n279#1:442,2\n281#1:444\n281#1:445,2\n409#1:447,4\n409#1:456\n409#1:451,5\n*E\n"})
public final class LazyListState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final Saver<LazyListState, ?> f4650w = ListSaverKt.listSaver(a.f4672p0, b.f4673p0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyListScrollPosition f4651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyListAnimateScrollScope f4652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState<LazyListLayoutInfo> f4653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableInteractionSource internalInteractionSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float scrollToBeConsumed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Density density;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ScrollableState f4657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int numMeasurePasses;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean prefetchingEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public LazyLayoutPrefetchState.PrefetchHandle f4661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4662l;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Remeasurement remeasurement;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final LazyListState$remeasurementModifier$1 f4663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyListItemPlacementAnimator placementAnimator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public long premeasureConstraints;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutPinnedItemList pinnedItems;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState canScrollForward;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState canScrollBackward;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutPrefetchState prefetchState;

    /* JADX INFO: compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/LazyListState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.f4650w;
        }
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    public static final class a extends Lambda implements Function2<SaverScope, LazyListState, List<? extends Integer>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4672p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Integer> invoke(SaverScope saverScope, LazyListState lazyListState) {
            SaverScope listSaver = saverScope;
            LazyListState it = lazyListState;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset())});
        }
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    public static final class b extends Lambda implements Function1<List<? extends Integer>, LazyListState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f4673p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final LazyListState invoke(List<? extends Integer> list) {
            List<? extends Integer> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyListState(it.get(0).intValue(), it.get(1).intValue());
        }
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0, 0}, l = {269, BarcodeUtils.ROTATION_270}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LazyListState f4674p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MutatePriority f4675q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function2 f4676r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f4677s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f4679u0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4677s0 = obj;
            this.f4679u0 |= Integer.MIN_VALUE;
            return LazyListState.this.scroll(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f4681q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f4682r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, int i11, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f4681q0 = i10;
            this.f4682r0 = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LazyListState.this.new d(this.f4681q0, this.f4682r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((d) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LazyListState.this.snapToItemIndexInternal$foundation_release(this.f4681q0, this.f4682r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    public static final class e extends Lambda implements Function1<Float, Float> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            return Float.valueOf(-LazyListState.this.onScroll$foundation_release(-f6.floatValue()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyListState() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyListState.animateScrollToItem(i10, i11, continuation);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyListState.scrollToItem(i10, i11, continuation);
    }

    public static /* synthetic */ int updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(LazyListState lazyListState, LazyListItemProvider lazyListItemProvider, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int index = lazyListState.f4651a.getIndex();
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
        return lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider, i10);
    }

    @Nullable
    public final Object animateScrollToItem(int i10, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.f4652b, i10, i11, continuation);
        return objAnimateScrollToItem == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyListMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f4651a.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.f4653c.setValue(result);
        this.canScrollForward.setValue(Boolean.valueOf(result.getCanScrollForward()));
        LazyListMeasuredItem firstVisibleItem = result.getFirstVisibleItem();
        this.canScrollBackward.setValue(Boolean.valueOf(((firstVisibleItem == null || firstVisibleItem.getIndex() == 0) && result.getFirstVisibleItemScrollOffset() == 0) ? false : true));
        this.numMeasurePasses++;
        if (this.f4660j == -1 || !(!result.getVisibleItemsInfo().isEmpty())) {
            return;
        }
        if (this.f4660j != (this.f4662l ? ((LazyListItemInfo) CollectionsKt___CollectionsKt.last((List) result.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) CollectionsKt___CollectionsKt.first((List) result.getVisibleItemsInfo())).getIndex() - 1)) {
            this.f4660j = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.f4661k;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.f4661k = null;
        }
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.f4657g.dispatchRawDelta(delta);
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
        return this.f4651a.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f4651a.getScrollOffset();
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
    public final LazyListLayoutInfo getLayoutInfo() {
        return this.f4653c.getValue();
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.f4651a.getNearestRangeState().getValue();
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
    public final LazyListItemPlacementAnimator getPlacementAnimator() {
        return this.placementAnimator;
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

    /* JADX INFO: renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name and from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    @Nullable
    /* JADX INFO: renamed from: getRemeasurement$foundation_release, reason: from getter */
    public final Remeasurement getRemeasurement() {
        return this.remeasurement;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.f4663n;
    }

    /* JADX INFO: renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f4657g.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float distance) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
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
                    LazyListLayoutInfo layoutInfo = getLayoutInfo();
                    if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                        boolean z11 = f11 < 0.0f;
                        int index = z11 ? ((LazyListItemInfo) CollectionsKt___CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) CollectionsKt___CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
                        if (index != this.f4660j && index >= 0 && index < layoutInfo.getTotalItemsCount()) {
                            if (this.f4662l != z11 && (prefetchHandle = this.f4661k) != null) {
                                prefetchHandle.cancel();
                            }
                            this.f4662l = z11;
                            this.f4660j = index;
                            this.f4661k = this.prefetchState.m416schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
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
        c cVar;
        LazyListState lazyListState;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f4679u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f4679u0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f4677s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f4679u0;
        if (i11 != 0) {
            if (i11 == 1) {
                function2 = cVar.f4676r0;
                mutatePriority = cVar.f4675q0;
                lazyListState = cVar.f4674p0;
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
        cVar.f4674p0 = this;
        cVar.f4675q0 = mutatePriority;
        cVar.f4676r0 = function2;
        cVar.f4679u0 = 1;
        if (this.awaitLayoutModifier.waitForFirstLayout(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        lazyListState = this;
        ScrollableState scrollableState = lazyListState.f4657g;
        cVar.f4674p0 = null;
        cVar.f4675q0 = null;
        cVar.f4676r0 = null;
        cVar.f4679u0 = 2;
        if (scrollableState.scroll(mutatePriority, function2, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollToItem(int i10, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objE = o.e(this, null, new d(i10, i11, null), continuation, 1, null);
        return objE == ek.a.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    /* JADX INFO: renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m373setPremeasureConstraintsBRTryo0$foundation_release(long j10) {
        this.premeasureConstraints = j10;
    }

    public final void snapToItemIndexInternal$foundation_release(int index, int scrollOffset) {
        this.f4651a.requestPosition(index, scrollOffset);
        this.placementAnimator.reset();
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyListItemProvider itemProvider, int firstItemIndex) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        return this.f4651a.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1] */
    public LazyListState(int i10, int i11) {
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i10, i11);
        this.f4651a = lazyListScrollPosition;
        this.f4652b = new LazyListAnimateScrollScope(this);
        this.f4653c = SnapshotStateKt.mutableStateOf$default(y.b.f94686a, null, 2, null);
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.f4657g = ScrollableStateKt.ScrollableState(new e());
        this.prefetchingEnabled = true;
        this.f4660j = -1;
        this.f4663n = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
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
                this.f4684a.remeasurement = remeasurement;
            }

            @Override // androidx.compose.ui.Modifier
            public final /* synthetic */ Modifier then(Modifier modifier) {
                return e.a(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.placementAnimator = new LazyListItemPlacementAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyListState(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
