package androidx.compose.foundation.lazy.staggeredgrid;

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
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
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
import androidx.compose.ui.unit.IntOffset;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.o;
import u0.e;
import u0.f;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 ·\u00012\u00020\u0001:\u0002·\u0001B!\b\u0016\u0012\t\b\u0002\u0010³\u0001\u001a\u00020\r\u0012\t\b\u0002\u0010´\u0001\u001a\u00020\r¢\u0006\u0006\bµ\u0001\u0010¶\u0001JD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0015\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001a\u00102\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00108\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R+\u0010A\u001a\u0002092\u0006\u0010:\u001a\u0002098V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010E\u001a\u0002092\u0006\u0010:\u001a\u0002098V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R(\u0010K\u001a\u0004\u0018\u00010F2\b\u0010:\u001a\u0004\u0018\u00010F8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010Q\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010W\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010]\u001a\u00020X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010b\u001a\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010>\"\u0004\ba\u0010@R\u001a\u0010h\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR$\u0010m\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\"\u0010s\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010(\"\u0004\bq\u0010rR\"\u0010w\u001a\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010_\u001a\u0004\bu\u0010>\"\u0004\bv\u0010@R$\u0010\u007f\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R,\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0095\u0001\u001a\u00030\u0090\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u009b\u0001\u001a\u00030\u0096\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010¡\u0001\u001a\u00030\u009c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0015\u0010¥\u0001\u001a\u00030¢\u00018F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010§\u0001\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010(R\u0015\u0010«\u0001\u001a\u00030¨\u00018F¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R!\u0010±\u0001\u001a\u00030¬\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u00ad\u0001\u0010®\u0001*\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010²\u0001\u001a\u0002098VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¸\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateScrollToItem", "snapToItemInternal$foundation_release", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "snapToItemInternal", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", "updateScrollPositionIfTheFirstItemWasMoved", "", "delta", "dispatchRawDelta", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", "applyMeasureResult", "a", "Landroidx/compose/runtime/State;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "b", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "c", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "e", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "", "<set-?>", "f", "Landroidx/compose/runtime/MutableState;", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "canScrollForward", "g", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/layout/Remeasurement;", "i", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "j", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "k", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "l", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "m", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "prefetchingEnabled", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "p", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", "q", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMeasurePassCount$foundation_release", "setMeasurePassCount$foundation_release", "(I)V", "measurePassCount", "r", "isVertical$foundation_release", "setVertical$foundation_release", "isVertical", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "s", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getSlots$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "setSlots$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "t", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "setSpanProvider$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V", "spanProvider", "Landroidx/compose/ui/unit/Density;", "w", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "x", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "mutableInteractionSource", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "y", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "z", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfo", "getLaneCount$foundation_release", "laneCount", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "<init>", "(II)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,504:1\n81#2:505\n81#2:506\n81#2:507\n107#2,2:508\n81#2:510\n107#2,2:511\n81#2:513\n495#3,4:514\n500#3:523\n129#4,5:518\n1855#5,2:524\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n103#1:505\n117#1:506\n154#1:507\n154#1:508,2\n156#1:510\n156#1:511,2\n227#1:513\n339#1:514,4\n339#1:523\n339#1:518,5\n435#1:524,2\n*E\n"})
public final class LazyStaggeredGridState implements ScrollableState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State firstVisibleItemIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State firstVisibleItemScrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridScrollPosition scrollPosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState<LazyStaggeredGridLayoutInfo> f5289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridLaneInfo laneInfo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState canScrollForward;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState canScrollBackward;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final LazyStaggeredGridAnimateScrollScope f5293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Remeasurement remeasurement;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final LazyStaggeredGridState$remeasurementModifier$1 f5295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean prefetchingEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutPrefetchState prefetchState;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ScrollableState f5299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float scrollToBeConsumed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int measurePassCount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean isVertical;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LazyStaggeredGridSlots slots;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LazyStaggeredGridSpanProvider spanProvider;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f5306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Density density;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableInteractionSource mutableInteractionSource;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutPinnedItemList pinnedItems;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridItemPlacementAnimator placementAnimator;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Saver<LazyStaggeredGridState, Object> A = ListSaverKt.listSaver(a.f5311p0, b.f5312p0);

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.A;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    public static final class a extends Lambda implements Function2<SaverScope, LazyStaggeredGridState, List<? extends int[]>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f5311p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends int[]> invoke(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
            SaverScope listSaver = saverScope;
            LazyStaggeredGridState state = lazyStaggeredGridState;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(state, "state");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new int[][]{state.getScrollPosition().getIndices(), state.getScrollPosition().getOffsets()});
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    public static final class b extends Lambda implements Function1<List<? extends int[]>, LazyStaggeredGridState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f5312p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final LazyStaggeredGridState invoke(List<? extends int[]> list) {
            List<? extends int[]> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyStaggeredGridState(it.get(0), it.get(1), null);
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    public static final class c extends Lambda implements Function0<Integer> {
        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Integer num;
            int[] indices = LazyStaggeredGridState.this.getScrollPosition().getIndices();
            if (indices.length == 0) {
                num = null;
            } else {
                int i10 = indices[0];
                if (i10 == -1) {
                    i10 = 0;
                }
                Integer numValueOf = Integer.valueOf(i10);
                ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(indices)).iterator();
                while (it.hasNext()) {
                    int i11 = indices[it.nextInt()];
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    Integer numValueOf2 = Integer.valueOf(i11);
                    if (numValueOf.compareTo(numValueOf2) > 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            }
            return Integer.valueOf(num != null ? num.intValue() : 0);
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    public static final class d extends Lambda implements Function0<Integer> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            LazyStaggeredGridState lazyStaggeredGridState = LazyStaggeredGridState.this;
            int[] offsets = lazyStaggeredGridState.getScrollPosition().getOffsets();
            int firstVisibleItemIndex = lazyStaggeredGridState.getFirstVisibleItemIndex();
            int[] indices = lazyStaggeredGridState.getScrollPosition().getIndices();
            int length = offsets.length;
            int iMin = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (indices[i10] == firstVisibleItemIndex) {
                    iMin = Math.min(iMin, offsets[i10]);
                }
            }
            return Integer.valueOf(iMin != Integer.MAX_VALUE ? iMin : 0);
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", i = {0, 0, 0}, l = {241, 242}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LazyStaggeredGridState f5315p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MutatePriority f5316q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function2 f5317r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f5318s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f5320u0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f5318s0 = obj;
            this.f5320u0 |= Integer.MIN_VALUE;
            return LazyStaggeredGridState.this.scroll(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    public /* synthetic */ class f extends FunctionReferenceImpl implements Function2<Integer, Integer, int[]> {
        public f(Object obj) {
            super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final int[] invoke(Integer num, Integer num2) {
            return LazyStaggeredGridState.access$fillNearestIndices((LazyStaggeredGridState) this.receiver, num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f5321p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f5323r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f5324s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, int i11, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f5323r0 = i10;
            this.f5324s0 = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = LazyStaggeredGridState.this.new g(this.f5323r0, this.f5324s0, continuation);
            gVar.f5321p0 = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((g) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LazyStaggeredGridState.this.snapToItemInternal$foundation_release((ScrollScope) this.f5321p0, this.f5323r0, this.f5324s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    public static final class h extends Lambda implements Function1<Float, Float> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            return Float.valueOf(-LazyStaggeredGridState.access$onScroll(LazyStaggeredGridState.this, -f6.floatValue()));
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2);
    }

    public static final int[] access$fillNearestIndices(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11) {
        lazyStaggeredGridState.getClass();
        int[] iArr = new int[i11];
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = lazyStaggeredGridState.spanProvider;
        if (lazyStaggeredGridSpanProvider == null || !lazyStaggeredGridSpanProvider.isFullSpan(i10)) {
            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lazyStaggeredGridState.laneInfo;
            lazyStaggeredGridLaneInfo.ensureValidIndex(i10 + i11);
            int lane = lazyStaggeredGridLaneInfo.getLane(i10);
            int iMin = lane == -1 ? 0 : Math.min(lane, i11);
            int iFindPreviousItemIndex = i10;
            for (int i12 = iMin - 1; -1 < i12; i12--) {
                iFindPreviousItemIndex = lazyStaggeredGridLaneInfo.findPreviousItemIndex(iFindPreviousItemIndex, i12);
                iArr[i12] = iFindPreviousItemIndex;
                if (iFindPreviousItemIndex == -1) {
                    ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, i12, 2, (Object) null);
                    break;
                }
            }
            iArr[iMin] = i10;
            for (int i13 = iMin + 1; i13 < i11; i13++) {
                i10 = lazyStaggeredGridLaneInfo.findNextItemIndex(i10, i13);
                iArr[i13] = i10;
            }
        } else {
            ArraysKt___ArraysJvmKt.fill$default(iArr, i10, 0, 0, 6, (Object) null);
        }
        return iArr;
    }

    public static final float access$onScroll(LazyStaggeredGridState lazyStaggeredGridState, float f6) {
        LinkedHashMap linkedHashMap;
        int i10;
        if (f6 < 0.0f && !lazyStaggeredGridState.getCanScrollForward()) {
            return 0.0f;
        }
        if (f6 > 0.0f && !lazyStaggeredGridState.getCanScrollBackward()) {
            return 0.0f;
        }
        if (Math.abs(lazyStaggeredGridState.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + lazyStaggeredGridState.scrollToBeConsumed).toString());
        }
        float f10 = lazyStaggeredGridState.scrollToBeConsumed + f6;
        lazyStaggeredGridState.scrollToBeConsumed = f10;
        if (Math.abs(f10) > 0.5f) {
            float f11 = lazyStaggeredGridState.scrollToBeConsumed;
            Remeasurement remeasurement = lazyStaggeredGridState.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
            if (lazyStaggeredGridState.prefetchingEnabled) {
                float f12 = f11 - lazyStaggeredGridState.scrollToBeConsumed;
                LazyStaggeredGridLayoutInfo value = lazyStaggeredGridState.f5289d.getValue();
                if (!value.getVisibleItemsInfo().isEmpty()) {
                    boolean z10 = f12 < 0.0f;
                    int index = z10 ? ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List) value.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.first((List) value.getVisibleItemsInfo())).getIndex();
                    if (index != lazyStaggeredGridState.f5305u) {
                        lazyStaggeredGridState.f5305u = index;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int laneCount$foundation_release = lazyStaggeredGridState.getLaneCount$foundation_release();
                        int i11 = 0;
                        while (true) {
                            linkedHashMap = lazyStaggeredGridState.f5306v;
                            if (i11 >= laneCount$foundation_release) {
                                break;
                            }
                            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lazyStaggeredGridState.laneInfo;
                            index = z10 ? lazyStaggeredGridLaneInfo.findNextItemIndex(index, i11) : lazyStaggeredGridLaneInfo.findPreviousItemIndex(index, i11);
                            if (index < 0 || index >= value.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                                break;
                            }
                            linkedHashSet.add(Integer.valueOf(index));
                            if (!linkedHashMap.containsKey(Integer.valueOf(index))) {
                                LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = lazyStaggeredGridState.spanProvider;
                                boolean z11 = lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(index);
                                int i12 = z11 ? 0 : i11;
                                int laneCount$foundation_release2 = z11 ? lazyStaggeredGridState.getLaneCount$foundation_release() : 1;
                                LazyStaggeredGridSlots lazyStaggeredGridSlots = lazyStaggeredGridState.slots;
                                if (lazyStaggeredGridSlots == null) {
                                    i10 = 0;
                                } else if (laneCount$foundation_release2 == 1) {
                                    i10 = lazyStaggeredGridSlots.getSizes()[i12];
                                } else {
                                    int i13 = lazyStaggeredGridSlots.getPositions()[i12];
                                    int i14 = (i12 + laneCount$foundation_release2) - 1;
                                    i10 = (lazyStaggeredGridSlots.getPositions()[i14] + lazyStaggeredGridSlots.getSizes()[i14]) - i13;
                                }
                                linkedHashMap.put(Integer.valueOf(index), lazyStaggeredGridState.prefetchState.m416schedulePrefetch0kLqBqw(index, lazyStaggeredGridState.isVertical ? Constraints.INSTANCE.m4367fixedWidthOenEA2s(i10) : Constraints.INSTANCE.m4366fixedHeightOenEA2s(i10)));
                            }
                            i11++;
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (!linkedHashSet.contains(entry.getKey())) {
                                ((LazyLayoutPrefetchState.PrefetchHandle) entry.getValue()).cancel();
                                it.remove();
                            }
                        }
                    }
                }
            }
        }
        if (Math.abs(lazyStaggeredGridState.scrollToBeConsumed) <= 0.5f) {
            return f6;
        }
        float f13 = f6 - lazyStaggeredGridState.scrollToBeConsumed;
        lazyStaggeredGridState.scrollToBeConsumed = 0.0f;
        return f13;
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i10, i11, continuation);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i10, i11, continuation);
    }

    public static /* synthetic */ int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(LazyStaggeredGridState lazyStaggeredGridState, LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int[] indices = lazyStaggeredGridState.scrollPosition.getIndices();
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    iArr = indices;
                } catch (Throwable th2) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th3;
            }
        }
        return lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyLayoutItemProvider, iArr);
    }

    @Nullable
    public final Object animateScrollToItem(int i10, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.f5293h, i10, i11, continuation);
        return objAnimateScrollToItem == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyStaggeredGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.canScrollBackward.setValue(Boolean.valueOf(result.getCanScrollBackward()));
        this.canScrollForward.setValue(Boolean.valueOf(result.getCanScrollForward()));
        this.f5289d.setValue(result);
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = result.getVisibleItemsInfo();
        if (this.f5305u != -1 && (!visibleItemsInfo.isEmpty())) {
            int index = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.first((List) visibleItemsInfo)).getIndex();
            int index2 = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List) visibleItemsInfo)).getIndex();
            int i10 = this.f5305u;
            if (index > i10 || i10 > index2) {
                this.f5305u = -1;
                LinkedHashMap linkedHashMap = this.f5306v;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
                }
                linkedHashMap.clear();
            }
        }
        this.scrollPosition.updateFromMeasureResult(result);
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.f5299o.dispatchRawDelta(delta);
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
        return ((Number) this.firstVisibleItemIndex.getValue()).intValue();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return ((Number) this.firstVisibleItemScrollOffset.getValue()).intValue();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final int getLaneCount$foundation_release() {
        int[] sizes;
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.slots;
        if (lazyStaggeredGridSlots == null || (sizes = lazyStaggeredGridSlots.getSizes()) == null) {
            return 0;
        }
        return sizes.length;
    }

    @NotNull
    /* JADX INFO: renamed from: getLaneInfo$foundation_release, reason: from getter */
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    @NotNull
    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.f5289d.getValue();
    }

    /* JADX INFO: renamed from: getMeasurePassCount$foundation_release, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    @NotNull
    /* JADX INFO: renamed from: getMutableInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    @NotNull
    /* JADX INFO: renamed from: getPlacementAnimator$foundation_release, reason: from getter */
    public final LazyStaggeredGridItemPlacementAnimator getPlacementAnimator() {
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

    @Nullable
    /* JADX INFO: renamed from: getRemeasurement$foundation_release, reason: from getter */
    public final Remeasurement getRemeasurement() {
        return this.remeasurement;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.f5295j;
    }

    @NotNull
    /* JADX INFO: renamed from: getScrollPosition$foundation_release, reason: from getter */
    public final LazyStaggeredGridScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    /* JADX INFO: renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    @Nullable
    /* JADX INFO: renamed from: getSlots$foundation_release, reason: from getter */
    public final LazyStaggeredGridSlots getSlots() {
        return this.slots;
    }

    @Nullable
    /* JADX INFO: renamed from: getSpanProvider$foundation_release, reason: from getter */
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f5299o.isScrollInProgress();
    }

    /* JADX INFO: renamed from: isVertical$foundation_release, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        e eVar;
        LazyStaggeredGridState lazyStaggeredGridState;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f5320u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f5320u0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f5318s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f5320u0;
        if (i11 != 0) {
            if (i11 == 1) {
                function2 = eVar.f5317r0;
                mutatePriority = eVar.f5316q0;
                lazyStaggeredGridState = eVar.f5315p0;
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
        eVar.f5315p0 = this;
        eVar.f5316q0 = mutatePriority;
        eVar.f5317r0 = function2;
        eVar.f5320u0 = 1;
        if (this.awaitLayoutModifier.waitForFirstLayout(eVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        lazyStaggeredGridState = this;
        ScrollableState scrollableState = lazyStaggeredGridState.f5299o;
        eVar.f5315p0 = null;
        eVar.f5316q0 = null;
        eVar.f5317r0 = null;
        eVar.f5320u0 = 2;
        if (scrollableState.scroll(mutatePriority, function2, eVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollToItem(int i10, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objE = o.e(this, null, new g(i10, i11, null), continuation, 1, null);
        return objE == ek.a.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    public final void setMeasurePassCount$foundation_release(int i10) {
        this.measurePassCount = i10;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    public final void setSlots$foundation_release(@Nullable LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.slots = lazyStaggeredGridSlots;
    }

    public final void setSpanProvider$foundation_release(@Nullable LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.spanProvider = lazyStaggeredGridSpanProvider;
    }

    public final void setVertical$foundation_release(boolean z10) {
        this.isVertical = z10;
    }

    public final void snapToItemInternal$foundation_release(@NotNull ScrollScope scrollScope, int i10, int i11) {
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i10);
        if (lazyStaggeredGridItemInfoFindVisibleItem != null) {
            boolean z10 = this.isVertical;
            long j10 = lazyStaggeredGridItemInfoFindVisibleItem.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
            scrollScope.scrollBy((z10 ? IntOffset.m4508getYimpl(j10) : IntOffset.m4507getXimpl(j10)) + i11);
        } else {
            this.scrollPosition.requestPosition(i10, i11);
            Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
        }
    }

    @NotNull
    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyLayoutItemProvider itemProvider, @NotNull int[] firstItemIndex) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(firstItemIndex, "firstItemIndex");
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1] */
    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.firstVisibleItemIndex = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new c());
        this.firstVisibleItemScrollOffset = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new d());
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new f(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.f5289d = SnapshotStateKt.mutableStateOf$default(EmptyLazyStaggeredGridLayoutInfo.INSTANCE, null, 2, null);
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f5293h = new LazyStaggeredGridAnimateScrollScope(this);
        this.f5295j = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
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
                this.f5326a.remeasurement = remeasurement;
            }

            @Override // androidx.compose.ui.Modifier
            public final /* synthetic */ Modifier then(Modifier modifier) {
                return e.a(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState();
        this.f5299o = ScrollableStateKt.ScrollableState(new h());
        this.f5305u = -1;
        this.f5306v = new LinkedHashMap();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.placementAnimator = new LazyStaggeredGridItemPlacementAnimator();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
    }

    public /* synthetic */ LazyStaggeredGridState(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public LazyStaggeredGridState(int i10, int i11) {
        this(new int[]{i10}, new int[]{i11});
    }
}
