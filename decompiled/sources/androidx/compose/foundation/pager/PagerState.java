package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0004¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¢\u0006\u0002\b\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R4\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00107\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010'\"\u0004\b5\u00106R$\u0010:\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R$\u0010=\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010 \u001a\u0004\b<\u0010\"R\"\u0010E\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010\"R\u001b\u0010Z\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010\"R\u001b\u0010]\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u0010U\u001a\u0004\b\\\u0010'R\u001a\u0010c\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010i\u001a\u00020d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010o\u001a\u00020j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR/\u0010v\u001a\u0004\u0018\u00010p2\b\u0010*\u001a\u0004\u0018\u00010p8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010,\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010|\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R.\u0010\u0082\u0001\u001a\u00020}8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0014\n\u0004\b~\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010.\"\u0005\b\u0081\u0001\u00100R \u0010\u0088\u0001\u001a\u00030\u0083\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R/\u0010\u008c\u0001\u001a\u00020>2\u0006\u0010*\u001a\u00020>8F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010,\u001a\u0005\b\u008a\u0001\u0010B\"\u0005\b\u008b\u0001\u0010DR/\u0010\u0090\u0001\u001a\u00020>2\u0006\u0010*\u001a\u00020>8F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010,\u001a\u0005\b\u008e\u0001\u0010B\"\u0005\b\u008f\u0001\u0010DR\u0016\u0010\u0092\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\"R\u0016\u0010\u0094\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\"R\u0016\u0010\u0096\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\"R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010\u009c\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\"R\u0016\u0010\u009e\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\"R\u0015\u0010¢\u0001\u001a\u00030\u009f\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0013\u0010¤\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\"R!\u0010ª\u0001\u001a\u00030¥\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¦\u0001\u0010§\u0001*\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010«\u0001\u001a\u00020>8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010B\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006®\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "page", "", "pageOffsetFraction", "", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "applyMeasureResult", "getOffsetFractionForPage", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getInitialPage", "()I", "initialPage", "b", "F", "getInitialPageOffsetFraction", "()F", "initialPageOffsetFraction", "Landroidx/compose/ui/geometry/Offset;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getUpDownDifference-F1C5BW0$foundation_release", "()J", "setUpDownDifference-k-4lQ0M$foundation_release", "(J)V", "upDownDifference", "d", "Landroidx/compose/runtime/MutableFloatState;", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset", "f", "getScrollToBeConsumed$foundation_release", "scrollToBeConsumed", "h", "getNumMeasurePasses$foundation_release", "numMeasurePasses", "", "i", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/unit/Density;", "n", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "o", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "r", "Landroidx/compose/runtime/State;", "getSettledPage", "settledPage", "s", "getTargetPage", "targetPage", "t", "getCurrentPageOffsetFraction", "currentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "u", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", SharedPrefsStorage.VERSION_KEY, "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "w", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/ui/layout/Remeasurement;", "x", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "y", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/unit/Constraints;", "z", "J", "getPremeasureConstraints-msEJaDk$foundation_release", "setPremeasureConstraints-BRTryo0$foundation_release", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedPages", "B", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "C", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "getPageCount", "pageCount", "getFirstVisiblePage$foundation_release", "firstVisiblePage", "getFirstVisiblePageOffset$foundation_release", "firstVisiblePageOffset", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getLayoutInfo$foundation_release", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutInfo", "getPageSpacing$foundation_release", "pageSpacing", "getPageSize$foundation_release", "pageSize", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "getCurrentPage", "currentPage", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "<init>", "(IF)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,684:1\n81#2:685\n107#2,2:686\n81#2:697\n81#2:698\n81#2:699\n81#2:700\n107#2,2:701\n81#2:703\n81#2:712\n107#2,2:713\n81#2:715\n107#2,2:716\n75#3:688\n108#3,2:689\n75#4:691\n108#4,2:692\n75#4:694\n108#4,2:695\n681#5,4:704\n681#5,4:708\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n187#1:685\n187#1:686,2\n306#1:697\n323#1:698\n357#1:699\n385#1:700\n385#1:701,2\n407#1:703\n513#1:712\n513#1:713,2\n515#1:715\n515#1:716,2\n188#1:688\n188#1:689,2\n294#1:691\n294#1:692,2\n296#1:694\n296#1:695,2\n473#1:704,4\n489#1:708,4\n*E\n"})
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final LazyLayoutPinnedItemList pinnedPages;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final MutableState canScrollForward;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final MutableState canScrollBackward;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int initialPage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float initialPageOffsetFraction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState upDownDifference;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableFloatState snapRemainingScrollOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PagerScrollPosition f5490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float scrollToBeConsumed;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ScrollableState f5492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int numMeasurePasses;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean prefetchingEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public LazyLayoutPrefetchState.PrefetchHandle f5496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5497l;

    @NotNull
    public final MutableState<PagerLayoutInfo> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Density density;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableInteractionSource internalInteractionSource;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableIntState f5500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableIntState f5501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State settledPage;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State targetPage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State currentPageOffsetFraction;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutPrefetchState prefetchState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState remeasurement;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final PagerState$remeasurementModifier$1 f5509y;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public long premeasureConstraints;

    /* JADX INFO: compiled from: PagerState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {453, 478, 490}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction", "this", "animationSpec", "pageOffsetFraction", "targetPage", "preJumpPosition", "this"}, s = {"L$0", "L$1", "I$0", "F$0", "L$0", "L$1", "F$0", "I$0", "I$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PagerState f5511p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AnimationSpec f5512q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f5513r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f5514s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f5515t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f5516u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f5517w0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f5516u0 = obj;
            this.f5517w0 |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    @SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$currentPageOffsetFraction$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,684:1\n116#2,2:685\n33#2,6:687\n118#2:693\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$currentPageOffsetFraction$2\n*L\n359#1:685,2\n359#1:687,6\n359#1:693\n*E\n"})
    public static final class b extends Lambda implements Function0<Float> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            PageInfo pageInfo;
            PagerState pagerState = PagerState.this;
            List<PageInfo> visiblePagesInfo = pagerState.getLayoutInfo$foundation_release().getVisiblePagesInfo();
            int size = visiblePagesInfo.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    pageInfo = null;
                    break;
                }
                pageInfo = visiblePagesInfo.get(i10);
                if (pageInfo.getIndex() == pagerState.getCurrentPage()) {
                    break;
                }
                i10++;
            }
            PageInfo pageInfo2 = pageInfo;
            int offset = pageInfo2 != null ? pageInfo2.getOffset() : 0;
            float fAccess$getPageAvailableSpace = PagerState.access$getPageAvailableSpace(pagerState);
            return Float.valueOf(fAccess$getPageAvailableSpace == 0.0f ? pagerState.getInitialPageOffsetFraction() : kotlin.ranges.c.coerceIn((-offset) / fAccess$getPageAvailableSpace, -0.5f, 0.5f));
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0}, l = {502, 503}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PagerState f5519p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MutatePriority f5520q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function2 f5521r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f5522s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f5524u0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f5522s0 = obj;
            this.f5524u0 |= Integer.MIN_VALUE;
            return PagerState.a(PagerState.this, null, null, this);
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,684:1\n681#2,4:685\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n*L\n420#1:685,4\n*E\n"})
    public static final class d extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f5525p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f5527r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f5528s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6, int i10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f5527r0 = f6;
            this.f5528s0 = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PagerState.this.new d(this.f5527r0, this.f5528s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((d) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f5525p0;
            PagerState pagerState = PagerState.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f5525p0 = 1;
                if (PagerState.access$awaitScrollDependencies(pagerState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            float f6 = this.f5527r0;
            double d2 = f6;
            if (!(-0.5d <= d2 && d2 <= 0.5d)) {
                throw new IllegalArgumentException(("pageOffsetFraction " + f6 + " is not within the range -0.5 to 0.5").toString());
            }
            pagerState.f5490e.requestPosition(PagerState.access$coerceInPageRange(pagerState, this.f5528s0), mk.c.roundToInt(PagerState.access$getPageAvailableSpace(pagerState) * f6));
            Remeasurement remeasurement$foundation_release = pagerState.getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class e extends Lambda implements Function1<Float, Float> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            return Float.valueOf(-PagerState.access$performScroll(PagerState.this, -f6.floatValue()));
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class f extends Lambda implements Function0<Integer> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            PagerState pagerState = PagerState.this;
            return Integer.valueOf(pagerState.isScrollInProgress() ? PagerState.access$getSettledPageState(pagerState) : pagerState.getCurrentPage());
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class g extends Lambda implements Function0<Integer> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            int currentPage;
            int iRoundToInt;
            int currentPage2;
            PagerState pagerState = PagerState.this;
            if (!pagerState.isScrollInProgress()) {
                currentPage2 = pagerState.getCurrentPage();
            } else if (PagerState.access$getAnimationTargetPage(pagerState) != -1) {
                currentPage2 = PagerState.access$getAnimationTargetPage(pagerState);
            } else {
                if (pagerState.getSnapRemainingScrollOffset$foundation_release() != 0.0f) {
                    float snapRemainingScrollOffset$foundation_release = pagerState.getSnapRemainingScrollOffset$foundation_release() / PagerState.access$getPageAvailableSpace(pagerState);
                    currentPage = pagerState.getCurrentPage();
                    iRoundToInt = mk.c.roundToInt(snapRemainingScrollOffset$foundation_release);
                } else if (Math.abs(pagerState.getCurrentPageOffsetFraction()) >= Math.abs(PagerState.access$getPositionThresholdFraction(pagerState))) {
                    iRoundToInt = pagerState.getCurrentPage();
                    currentPage = (int) Math.signum(pagerState.getCurrentPageOffsetFraction());
                } else {
                    currentPage2 = pagerState.getCurrentPage();
                }
                currentPage2 = iRoundToInt + currentPage;
            }
            return Integer.valueOf(PagerState.access$coerceInPageRange(pagerState, currentPage2));
        }
    }

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(PagerState pagerState, MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f5524u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f5524u0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = pagerState.new c(continuation);
            }
        } else {
            cVar = pagerState.new c(continuation);
        }
        Object obj = cVar.f5522s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f5524u0;
        if (i11 != 0) {
            if (i11 == 1) {
                function2 = cVar.f5521r0;
                mutatePriority = cVar.f5520q0;
                pagerState = cVar.f5519p0;
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
        cVar.f5519p0 = pagerState;
        cVar.f5520q0 = mutatePriority;
        cVar.f5521r0 = function2;
        cVar.f5524u0 = 1;
        Object objWaitForFirstLayout = pagerState.awaitLayoutModifier.waitForFirstLayout(cVar);
        if (objWaitForFirstLayout != ek.a.getCOROUTINE_SUSPENDED()) {
            objWaitForFirstLayout = Unit.INSTANCE;
        }
        if (objWaitForFirstLayout == coroutine_suspended) {
            return coroutine_suspended;
        }
        ScrollableState scrollableState = pagerState.f5492g;
        cVar.f5519p0 = null;
        cVar.f5520q0 = null;
        cVar.f5521r0 = null;
        cVar.f5524u0 = 2;
        if (scrollableState.scroll(mutatePriority, function2, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public static final Object access$awaitScrollDependencies(PagerState pagerState, Continuation continuation) {
        Object objWaitForFirstLayout = pagerState.awaitLayoutModifier.waitForFirstLayout(continuation);
        return objWaitForFirstLayout == ek.a.getCOROUTINE_SUSPENDED() ? objWaitForFirstLayout : Unit.INSTANCE;
    }

    public static final int access$coerceInPageRange(PagerState pagerState, int i10) {
        if (pagerState.getPageCount() > 0) {
            return kotlin.ranges.c.coerceIn(i10, 0, pagerState.getPageCount() - 1);
        }
        return 0;
    }

    public static final int access$getAnimationTargetPage(PagerState pagerState) {
        return pagerState.f5500p.getIntValue();
    }

    public static final int access$getPageAvailableSpace(PagerState pagerState) {
        return pagerState.getPageSpacing$foundation_release() + pagerState.getPageSize$foundation_release();
    }

    public static final float access$getPositionThresholdFraction(PagerState pagerState) {
        return Math.min(pagerState.density.mo415toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), pagerState.getPageSize$foundation_release() / 2.0f) / pagerState.getPageSize$foundation_release();
    }

    public static final int access$getSettledPageState(PagerState pagerState) {
        return pagerState.f5501q.getIntValue();
    }

    public static final float access$performScroll(PagerState pagerState, float f6) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if ((f6 < 0.0f && !pagerState.getCanScrollForward()) || (f6 > 0.0f && !pagerState.getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(pagerState.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + pagerState.scrollToBeConsumed).toString());
        }
        float f10 = pagerState.scrollToBeConsumed + f6;
        pagerState.scrollToBeConsumed = f10;
        if (Math.abs(f10) > 0.5f) {
            float f11 = pagerState.scrollToBeConsumed;
            Remeasurement remeasurement$foundation_release = pagerState.getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            boolean z10 = pagerState.prefetchingEnabled;
            if (z10) {
                float f12 = f11 - pagerState.scrollToBeConsumed;
                if (z10) {
                    PagerLayoutInfo layoutInfo$foundation_release = pagerState.getLayoutInfo$foundation_release();
                    if (!layoutInfo$foundation_release.getVisiblePagesInfo().isEmpty()) {
                        boolean z11 = f12 < 0.0f;
                        int index = z11 ? ((PageInfo) CollectionsKt___CollectionsKt.last((List) layoutInfo$foundation_release.getVisiblePagesInfo())).getIndex() + 1 : ((PageInfo) CollectionsKt___CollectionsKt.first((List) layoutInfo$foundation_release.getVisiblePagesInfo())).getIndex() - 1;
                        if (index != pagerState.f5495j && index >= 0 && index < layoutInfo$foundation_release.getPagesCount()) {
                            if (pagerState.f5497l != z11 && (prefetchHandle = pagerState.f5496k) != null) {
                                prefetchHandle.cancel();
                            }
                            pagerState.f5497l = z11;
                            pagerState.f5495j = index;
                            pagerState.f5496k = pagerState.prefetchState.m416schedulePrefetch0kLqBqw(index, pagerState.premeasureConstraints);
                        }
                    }
                }
            }
        }
        if (Math.abs(pagerState.scrollToBeConsumed) <= 0.5f) {
            return f6;
        }
        float f13 = f6 - pagerState.scrollToBeConsumed;
        pagerState.scrollToBeConsumed = 0.0f;
        return f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i10, float f6, AnimationSpec animationSpec, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i11 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return pagerState.animateScrollToPage(i10, f6, animationSpec, continuation);
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i10, float f6, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i11 & 2) != 0) {
            f6 = 0.0f;
        }
        return pagerState.scrollToPage(i10, f6, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object animateScrollToPage(int i10, float f6, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        AnimationSpec<Float> animationSpec2;
        PagerState pagerState;
        int currentPage;
        int iCoerceIn;
        PagerState pagerState2;
        int iCoerceAtLeast;
        float f10;
        AnimationSpec<Float> animationSpec3;
        PagerState pagerState3;
        int i11;
        int pageSpacing$foundation_release;
        int pageSpacing$foundation_release2;
        PageInfo closestPageToSnapPosition;
        float fCalculateDistanceToDesiredSnapPosition;
        float pageSpacing$foundation_release3;
        int i12 = i10;
        float f11 = f6;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f5517w0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f5517w0 = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f5516u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i14 = aVar.f5517w0;
        if (i14 != 0) {
            if (i14 == 1) {
                float f12 = aVar.f5515t0;
                int i15 = aVar.f5513r0;
                AnimationSpec<Float> animationSpec4 = aVar.f5512q0;
                PagerState pagerState4 = aVar.f5511p0;
                ResultKt.throwOnFailure(obj);
                animationSpec2 = animationSpec4;
                pagerState = pagerState4;
                f11 = f12;
                i12 = i15;
            } else if (i14 == 2) {
                iCoerceAtLeast = aVar.f5514s0;
                i11 = aVar.f5513r0;
                f10 = aVar.f5515t0;
                animationSpec3 = aVar.f5512q0;
                pagerState3 = aVar.f5511p0;
                ResultKt.throwOnFailure(obj);
                iCoerceIn = i11;
                f11 = f10;
                animationSpec2 = animationSpec3;
                currentPage = iCoerceAtLeast;
                pagerState2 = pagerState3;
                pageSpacing$foundation_release = (pagerState2.getPageSpacing$foundation_release() + pagerState2.getPageSize$foundation_release()) * iCoerceIn;
                pageSpacing$foundation_release2 = (pagerState2.getPageSpacing$foundation_release() + pagerState2.getPageSize$foundation_release()) * currentPage;
                closestPageToSnapPosition = pagerState2.getLayoutInfo$foundation_release().getClosestPageToSnapPosition();
                if (closestPageToSnapPosition != null) {
                    fCalculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(pagerState2.density, PagerLayoutInfoKt.getMainAxisViewportSize(pagerState2.getLayoutInfo$foundation_release()), pagerState2.getLayoutInfo$foundation_release().getBeforeContentPadding(), pagerState2.getLayoutInfo$foundation_release().getAfterContentPadding(), pagerState2.getLayoutInfo$foundation_release().getPageSize(), closestPageToSnapPosition.getOffset(), closestPageToSnapPosition.getIndex(), PagerStateKt.getSnapAlignmentStartToStart());
                } else {
                    fCalculateDistanceToDesiredSnapPosition = 0.0f;
                }
                pageSpacing$foundation_release3 = (f11 * (pagerState2.getPageSpacing$foundation_release() + pagerState2.getPageSize$foundation_release())) + fCalculateDistanceToDesiredSnapPosition;
                aVar.f5511p0 = pagerState2;
                aVar.f5512q0 = null;
                aVar.f5517w0 = 3;
                if (ScrollExtensionsKt.animateScrollBy(pagerState2, (pageSpacing$foundation_release - pageSpacing$foundation_release2) + pageSpacing$foundation_release3, animationSpec2, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagerState2 = aVar.f5511p0;
                ResultKt.throwOnFailure(obj);
            }
            pagerState2.f5500p.setIntValue(-1);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (i12 == getCurrentPage() && getCurrentPageOffsetFraction() == f11) {
            return Unit.INSTANCE;
        }
        aVar.f5511p0 = this;
        animationSpec2 = animationSpec;
        aVar.f5512q0 = animationSpec2;
        aVar.f5513r0 = i12;
        aVar.f5515t0 = f11;
        aVar.f5517w0 = 1;
        Object objWaitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(aVar);
        if (objWaitForFirstLayout != ek.a.getCOROUTINE_SUSPENDED()) {
            objWaitForFirstLayout = Unit.INSTANCE;
        }
        if (objWaitForFirstLayout == coroutine_suspended) {
            return coroutine_suspended;
        }
        pagerState = this;
        double d2 = f11;
        if (-0.5d > d2 || d2 > 0.5d) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5").toString());
        }
        currentPage = pagerState.getCurrentPage();
        iCoerceIn = pagerState.getPageCount() > 0 ? kotlin.ranges.c.coerceIn(i12, 0, pagerState.getPageCount() - 1) : 0;
        pagerState.f5500p.setIntValue(iCoerceIn);
        int index = ((PageInfo) CollectionsKt___CollectionsKt.first((List) pagerState.m.getValue().getVisiblePagesInfo())).getIndex();
        int index2 = ((PageInfo) CollectionsKt___CollectionsKt.last((List) pagerState.m.getValue().getVisiblePagesInfo())).getIndex();
        if (((i12 <= pagerState.getCurrentPage() || i12 <= index2) && (i12 >= pagerState.getCurrentPage() || i12 >= index)) || Math.abs(i12 - pagerState.getCurrentPage()) < 3) {
            pagerState2 = pagerState;
        } else {
            iCoerceAtLeast = i12 > pagerState.getCurrentPage() ? kotlin.ranges.c.coerceAtLeast(i12 - pagerState.m.getValue().getVisiblePagesInfo().size(), currentPage) : kotlin.ranges.c.coerceAtMost(pagerState.m.getValue().getVisiblePagesInfo().size(), currentPage) + i12;
            aVar.f5511p0 = pagerState;
            aVar.f5512q0 = animationSpec2;
            aVar.f5515t0 = f11;
            aVar.f5513r0 = iCoerceIn;
            aVar.f5514s0 = iCoerceAtLeast;
            aVar.f5517w0 = 2;
            if (scrollToPage$default(pagerState, iCoerceAtLeast, 0.0f, aVar, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            f10 = f11;
            animationSpec3 = animationSpec2;
            pagerState3 = pagerState;
            i11 = iCoerceIn;
            iCoerceIn = i11;
            f11 = f10;
            animationSpec2 = animationSpec3;
            currentPage = iCoerceAtLeast;
            pagerState2 = pagerState3;
        }
        pageSpacing$foundation_release = (pagerState2.getPageSpacing$foundation_release() + pagerState2.getPageSize$foundation_release()) * iCoerceIn;
        pageSpacing$foundation_release2 = (pagerState2.getPageSpacing$foundation_release() + pagerState2.getPageSize$foundation_release()) * currentPage;
        closestPageToSnapPosition = pagerState2.getLayoutInfo$foundation_release().getClosestPageToSnapPosition();
        if (closestPageToSnapPosition != null) {
            fCalculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(pagerState2.density, PagerLayoutInfoKt.getMainAxisViewportSize(pagerState2.getLayoutInfo$foundation_release()), pagerState2.getLayoutInfo$foundation_release().getBeforeContentPadding(), pagerState2.getLayoutInfo$foundation_release().getAfterContentPadding(), pagerState2.getLayoutInfo$foundation_release().getPageSize(), closestPageToSnapPosition.getOffset(), closestPageToSnapPosition.getIndex(), PagerStateKt.getSnapAlignmentStartToStart());
        } else {
            fCalculateDistanceToDesiredSnapPosition = 0.0f;
        }
        pageSpacing$foundation_release3 = (f11 * (pagerState2.getPageSpacing$foundation_release() + pagerState2.getPageSize$foundation_release())) + fCalculateDistanceToDesiredSnapPosition;
        aVar.f5511p0 = pagerState2;
        aVar.f5512q0 = null;
        aVar.f5517w0 = 3;
        if (ScrollExtensionsKt.animateScrollBy(pagerState2, (pageSpacing$foundation_release - pageSpacing$foundation_release2) + pageSpacing$foundation_release3, animationSpec2, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        pagerState2.f5500p.setIntValue(-1);
        return Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(@NotNull PagerMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f5490e.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.m.setValue(result);
        this.canScrollForward.setValue(Boolean.valueOf(result.getCanScrollForward()));
        MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        this.canScrollBackward.setValue(Boolean.valueOf(((firstVisiblePage == null || firstVisiblePage.getIndex() == 0) && result.getFirstVisiblePageOffset() == 0) ? false : true));
        this.numMeasurePasses++;
        if (this.f5495j != -1 && (!result.getVisiblePagesInfo().isEmpty())) {
            if (this.f5495j != (this.f5497l ? ((PageInfo) CollectionsKt___CollectionsKt.last((List) result.getVisiblePagesInfo())).getIndex() + 1 : ((PageInfo) CollectionsKt___CollectionsKt.first((List) result.getVisiblePagesInfo())).getIndex() - 1)) {
                this.f5495j = -1;
                LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.f5496k;
                if (prefetchHandle != null) {
                    prefetchHandle.cancel();
                }
                this.f5496k = null;
            }
        }
        if (isScrollInProgress()) {
            return;
        }
        this.f5501q.setIntValue(getCurrentPage());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.f5492g.dispatchRawDelta(delta);
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
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.f5490e.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.currentPageOffsetFraction.getValue()).floatValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.f5490e.getFirstVisiblePage();
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.f5490e.getScrollOffset();
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final float getInitialPageOffsetFraction() {
        return this.initialPageOffsetFraction;
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
    public final PagerLayoutInfo getLayoutInfo$foundation_release() {
        return this.m.getValue();
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.f5490e.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: getNumMeasurePasses$foundation_release, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    public final float getOffsetFractionForPage(int page) {
        if (page < 0 || page > getPageCount()) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("page ", page, " is not within the range 0 to pageCount").toString());
        }
        return getCurrentPageOffsetFraction() + (getCurrentPage() - page);
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return this.m.getValue().getPageSize();
    }

    public final int getPageSpacing$foundation_release() {
        return this.m.getValue().getPageSpacing();
    }

    @NotNull
    /* JADX INFO: renamed from: getPinnedPages$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedPages() {
        return this.pinnedPages;
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
    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.f5509y;
    }

    /* JADX INFO: renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return this.snapRemainingScrollOffset.getFloatValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m454getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference.getValue()).getF15533a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f5492g.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return a(this, mutatePriority, function2, continuation);
    }

    @Nullable
    public final Object scrollToPage(int i10, float f6, @NotNull Continuation<? super Unit> continuation) {
        Object objE = o.e(this, null, new d(f6, i10, null), continuation, 1, null);
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
    public final void m455setPremeasureConstraintsBRTryo0$foundation_release(long j10) {
        this.premeasureConstraints = j10;
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f6) {
        this.snapRemainingScrollOffset.setFloatValue(f6);
    }

    /* JADX INFO: renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m456setUpDownDifferencek4lQ0M$foundation_release(long j10) {
        this.upDownDifference.setValue(Offset.m2264boximpl(j10));
    }

    /* JADX WARN: Type inference failed for: r9v15, types: [androidx.compose.foundation.pager.PagerState$remeasurementModifier$1] */
    public PagerState(int i10, float f6) {
        this.initialPage = i10;
        this.initialPageOffsetFraction = f6;
        double d2 = f6;
        if (-0.5d > d2 || d2 > 0.5d) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f6 + " is not within the range -0.5 to 0.5").toString());
        }
        this.upDownDifference = SnapshotStateKt.mutableStateOf$default(Offset.m2264boximpl(Offset.INSTANCE.m2291getZeroF1C5BW0()), null, 2, null);
        this.snapRemainingScrollOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i10, 0);
        this.f5490e = pagerScrollPosition;
        this.f5492g = ScrollableStateKt.ScrollableState(new e());
        this.prefetchingEnabled = true;
        this.f5495j = -1;
        this.m = SnapshotStateKt.mutableStateOf$default(PagerStateKt.getEmptyLayoutInfo(), null, 2, null);
        this.density = PagerStateKt.f5537c;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.f5500p = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f5501q = SnapshotIntStateKt.mutableIntStateOf(i10);
        this.settledPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new f());
        this.targetPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new g());
        this.currentPageOffsetFraction = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new b());
        this.prefetchState = new LazyLayoutPrefetchState();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f5509y = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ boolean all(Function1 function1) {
                return u0.f.a(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ boolean any(Function1 function1) {
                return u0.f.b(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                return u0.f.c(this, obj, function2);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                return u0.f.d(this, obj, function2);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement) {
                Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
                this.f5532a.remeasurement.setValue(remeasurement);
            }

            @Override // androidx.compose.ui.Modifier
            public final /* synthetic */ Modifier then(Modifier modifier) {
                return u0.e.a(this, modifier);
            }
        };
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public /* synthetic */ PagerState(int i10, float f6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f6);
    }
}
