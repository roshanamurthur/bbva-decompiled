package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0001\u001a\u00020\u00112\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0013\u001aO\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aO\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aU\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u0001\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0013\u001aU\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0001\u001a\u00020!2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020!0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0013\u001a\u007f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b)\u0010*\u001aO\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010+\u001aK\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001aK\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0001\u001a\u00020\u00112\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001aK\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0001\u001a\u00020\u00152\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010/\u001aE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0001\u001a\u00020\u00182\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u00101\u001aE\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0001\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u00102\u001aK\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u0001\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010/\u001aK\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\n2\u0006\u0010\u0001\u001a\u00020!2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020!0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010/\u001au\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%2\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b)\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068²\u0006*\u00106\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%8\nX\u008a\u0084\u0002²\u0006\"\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010$\"\b\b\u0001\u0010&*\u00020%8\nX\u008a\u0084\u0002"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "", "finishedListener", "Landroidx/compose/runtime/State;", "animateFloatAsState", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState", "Landroidx/compose/ui/geometry/Size;", "animateSizeAsState-YLp_XPw", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "Landroidx/compose/ui/geometry/Offset;", "animateOffsetAsState-7362WCg", "animateOffsetAsState", "Landroidx/compose/ui/geometry/Rect;", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffsetAsState-HyPO7BM", "animateIntOffsetAsState", "Landroidx/compose/ui/unit/IntSize;", "animateIntSizeAsState-4goxYXU", "animateIntSizeAsState", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "animateValueAsState", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState-LjSzlW0", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateOffsetAsState-N6fFfp4", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-8f6pmRE", "animateIntSizeAsState-zTRF_AQ", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "animSpec", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n36#2:585\n25#2:592\n25#2:599\n25#2:606\n25#2:613\n25#2:620\n1097#3,6:586\n1097#3,6:593\n1097#3,6:600\n1097#3,6:607\n1097#3,6:614\n1097#3,6:621\n81#4:627\n81#4:628\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585\n394#1:592\n400#1:599\n401#1:606\n414#1:613\n573#1:620\n72#1:586,6\n394#1:593,6\n400#1:600,6\n401#1:607,6\n414#1:614,6\n573#1:621,6\n402#1:627\n403#1:628\n*E\n"})
public final class AnimateAsStateKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<Float> f2855a = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<Dp> f2856b = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m4387boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<Size> f2857c = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2332boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<Offset> f2858d = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2264boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<Rect> f2859e = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<Integer> f2860f = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<IntOffset> f2861g = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<IntSize> f2862h = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m4541boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);

    /* JADX INFO: compiled from: AnimateAsState.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Channel<T> f2863p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f2864q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Channel<T> channel, T t10) {
            super(0);
            this.f2863p0 = channel;
            this.f2864q0 = t10;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f2863p0.mo5953trySendJP2dKIU(this.f2864q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimateAsState.kt */
    @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", i = {0}, l = {419}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ChannelIterator f2865p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f2866q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f2867r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Channel<T> f2868s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Animatable<T, V> f2869t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ State<AnimationSpec<T>> f2870u0;
        public final /* synthetic */ State<Function1<T, Unit>> v0;

        /* JADX INFO: compiled from: AnimateAsState.kt */
        @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {}, l = {AsoResponse.HTTP_ARMADILLO_OTP_NEEDED}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f2871p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ T f2872q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Animatable<T, V> f2873r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ State<AnimationSpec<T>> f2874s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ State<Function1<T, Unit>> f2875t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(T t10, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends Function1<? super T, Unit>> state2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f2872q0 = t10;
                this.f2873r0 = animatable;
                this.f2874s0 = state;
                this.f2875t0 = state2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f2872q0, this.f2873r0, this.f2874s0, this.f2875t0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f2871p0;
                Animatable<T, V> animatable = this.f2873r0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(this.f2872q0, animatable.getTargetValue())) {
                        Animatable<T, V> animatable2 = this.f2873r0;
                        T t10 = this.f2872q0;
                        AnimationSpec animationSpecAccess$animateValueAsState$lambda$6 = AnimateAsStateKt.access$animateValueAsState$lambda$6(this.f2874s0);
                        this.f2871p0 = 1;
                        if (Animatable.animateTo$default(animatable2, t10, animationSpecAccess$animateValueAsState$lambda$6, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1Access$animateValueAsState$lambda$4 = AnimateAsStateKt.access$animateValueAsState$lambda$4(this.f2875t0);
                if (function1Access$animateValueAsState$lambda$4 != null) {
                    function1Access$animateValueAsState$lambda$4.invoke(animatable.getValue());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Channel<T> channel, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends Function1<? super T, Unit>> state2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f2868s0 = channel;
            this.f2869t0 = animatable;
            this.f2870u0 = state;
            this.v0 = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f2868s0, this.f2869t0, this.f2870u0, this.v0, continuation);
            bVar.f2867r0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0041 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x004a  */
        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        /* JADX WARN: Code duplicated, block: B:17:0x005c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:12:0x0042). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0041
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
                int r2 = r0.f2866q0
                r3 = 1
                if (r2 == 0) goto L22
                if (r2 != r3) goto L1a
                kotlinx.coroutines.channels.ChannelIterator r2 = r0.f2865p0
                java.lang.Object r4 = r0.f2867r0
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.ResultKt.throwOnFailure(r18)
                r6 = r18
                r5 = r0
                goto L42
            L1a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L22:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r2 = r0.f2867r0
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.channels.Channel<T> r4 = r0.f2868s0
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r5 = r0
                r16 = r4
                r4 = r2
                r2 = r16
            L35:
                r5.f2867r0 = r4
                r5.f2865p0 = r2
                r5.f2866q0 = r3
                java.lang.Object r6 = r2.hasNext(r5)
                if (r6 != r1) goto L42
                return r1
            L42:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L76
                java.lang.Object r6 = r2.next()
                kotlinx.coroutines.channels.Channel<T> r7 = r5.f2868s0
                java.lang.Object r7 = r7.mo5958tryReceivePtdJZtk()
                java.lang.Object r7 = kotlinx.coroutines.channels.ChannelResult.m5968getOrNullimpl(r7)
                if (r7 != 0) goto L5c
                r9 = r6
                goto L5d
            L5c:
                r9 = r7
            L5d:
                r6 = 0
                r14 = 0
                androidx.compose.animation.core.AnimateAsStateKt$b$a r15 = new androidx.compose.animation.core.AnimateAsStateKt$b$a
                androidx.compose.animation.core.Animatable<T, V> r10 = r5.f2869t0
                androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r11 = r5.f2870u0
                androidx.compose.runtime.State<kotlin.jvm.functions.Function1<T, kotlin.Unit>> r12 = r5.v0
                r13 = 0
                r8 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r11 = 3
                r12 = 0
                r7 = r4
                r8 = r6
                r9 = r14
                r10 = r15
                kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
                goto L35
            L76:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Function1 access$animateValueAsState$lambda$4(State state) {
        return (Function1) state.getValue();
    }

    public static final AnimationSpec access$animateValueAsState$lambda$6(State state) {
        return (AnimationSpec) state.getValue();
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<Dp> m67animateDpAsStateAjpBEmI(float f6, @Nullable AnimationSpec<Dp> animationSpec, @Nullable String str, @Nullable Function1<? super Dp, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1407150062);
        AnimationSpec<Dp> animationSpec2 = (i11 & 2) != 0 ? f2856b : animationSpec;
        String str2 = (i11 & 4) != 0 ? "DpAnimation" : str;
        Function1<? super Dp, Unit> function2 = (i11 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:108)");
        }
        int i12 = i10 << 6;
        State<Dp> stateAnimateValueAsState = animateValueAsState(Dp.m4387boximpl(f6), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), animationSpec2, null, str2, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    /* JADX INFO: renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m68animateDpAsStateKz89ssw(float f6, AnimationSpec animationSpec, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(704104481);
        if ((i11 & 2) != 0) {
            animationSpec = f2856b;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:458)");
        }
        State stateAnimateValueAsState = animateValueAsState(Dp.m4387boximpl(f6), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), animationSpec2, null, null, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Float> animateFloatAsState(float f6, @Nullable AnimationSpec<Float> animationSpec, float f10, @Nullable String str, @Nullable Function1<? super Float, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(668842840);
        int i12 = i11 & 2;
        SpringSpec<Float> springSpec = f2855a;
        AnimationSpec<Float> animationSpec2 = i12 != 0 ? springSpec : animationSpec;
        float f11 = (i11 & 4) != 0 ? 0.01f : f10;
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        Function1<? super Float, Unit> function2 = (i11 & 16) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:62)");
        }
        composer.startReplaceableGroup(841393662);
        if (animationSpec2 == springSpec) {
            Float fValueOf = Float.valueOf(f11);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(fValueOf);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f11), 3, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) objRememberedValue;
        }
        composer.endReplaceableGroup();
        int i13 = i10 << 3;
        State<Float> stateAnimateValueAsState = animateValueAsState(Float.valueOf(f6), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), animationSpec2, Float.valueOf(f11), str2, function2, composer, (i13 & 7168) | (i10 & 14) | (57344 & i13) | (i13 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Integer> animateIntAsState(int i10, @Nullable AnimationSpec<Integer> animationSpec, @Nullable String str, @Nullable Function1<? super Integer, Unit> function1, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(428074472);
        AnimationSpec<Integer> animationSpec2 = (i12 & 2) != 0 ? f2860f : animationSpec;
        String str2 = (i12 & 4) != 0 ? "IntAnimation" : str;
        Function1<? super Integer, Unit> function2 = (i12 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:268)");
        }
        int i13 = i11 << 6;
        State<Integer> stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i10), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec2, null, str2, function2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    /* JADX INFO: renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m69animateIntOffsetAsState8f6pmRE(long j10, AnimationSpec animationSpec, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1010307371);
        AnimationSpec animationSpec2 = (i11 & 2) != 0 ? f2861g : animationSpec;
        Function1 function2 = (i11 & 4) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i10, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:539)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntOffset.m4498boximpl(j10), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), animationSpec2, null, null, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m70animateIntOffsetAsStateHyPO7BM(long j10, @Nullable AnimationSpec<IntOffset> animationSpec, @Nullable String str, @Nullable Function1<? super IntOffset, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-696782904);
        AnimationSpec<IntOffset> animationSpec2 = (i11 & 2) != 0 ? f2861g : animationSpec;
        String str2 = (i11 & 4) != 0 ? "IntOffsetAnimation" : str;
        Function1<? super IntOffset, Unit> function2 = (i11 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i10, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:308)");
        }
        int i12 = i10 << 6;
        State<IntOffset> stateAnimateValueAsState = animateValueAsState(IntOffset.m4498boximpl(j10), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), animationSpec2, null, str2, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m71animateIntSizeAsState4goxYXU(long j10, @Nullable AnimationSpec<IntSize> animationSpec, @Nullable String str, @Nullable Function1<? super IntSize, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(582576328);
        AnimationSpec<IntSize> animationSpec2 = (i11 & 2) != 0 ? f2862h : animationSpec;
        String str2 = (i11 & 4) != 0 ? "IntSizeAnimation" : str;
        Function1<? super IntSize, Unit> function2 = (i11 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i10, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:346)");
        }
        int i12 = i10 << 6;
        State<IntSize> stateAnimateValueAsState = animateValueAsState(IntSize.m4541boximpl(j10), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), animationSpec2, null, str2, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    /* JADX INFO: renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m72animateIntSizeAsStatezTRF_AQ(long j10, AnimationSpec animationSpec, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1749239765);
        AnimationSpec animationSpec2 = (i11 & 2) != 0 ? f2862h : animationSpec;
        Function1 function2 = (i11 & 4) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i10, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:554)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntSize.m4541boximpl(j10), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), animationSpec2, null, null, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m73animateOffsetAsState7362WCg(long j10, @Nullable AnimationSpec<Offset> animationSpec, @Nullable String str, @Nullable Function1<? super Offset, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(357896800);
        AnimationSpec<Offset> animationSpec2 = (i11 & 2) != 0 ? f2858d : animationSpec;
        String str2 = (i11 & 4) != 0 ? "OffsetAnimation" : str;
        Function1<? super Offset, Unit> function2 = (i11 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i10, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:189)");
        }
        int i12 = i10 << 6;
        State<Offset> stateAnimateValueAsState = animateValueAsState(Offset.m2264boximpl(j10), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), animationSpec2, null, str2, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    /* JADX INFO: renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m74animateOffsetAsStateN6fFfp4(long j10, AnimationSpec animationSpec, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-456513133);
        AnimationSpec animationSpec2 = (i11 & 2) != 0 ? f2858d : animationSpec;
        Function1 function2 = (i11 & 4) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i10, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:494)");
        }
        State stateAnimateValueAsState = animateValueAsState(Offset.m2264boximpl(j10), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), animationSpec2, null, null, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Rect> animateRectAsState(@NotNull Rect targetValue, @Nullable AnimationSpec<Rect> animationSpec, @Nullable String str, @Nullable Function1<? super Rect, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        composer.startReplaceableGroup(536062978);
        AnimationSpec<Rect> animationSpec2 = (i11 & 2) != 0 ? f2859e : animationSpec;
        String str2 = (i11 & 4) != 0 ? "RectAnimation" : str;
        Function1<? super Rect, Unit> function2 = (i11 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i10, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:230)");
        }
        int i12 = i10 << 6;
        State<Rect> stateAnimateValueAsState = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.INSTANCE), animationSpec2, null, str2, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    /* JADX INFO: renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m75animateSizeAsStateLjSzlW0(long j10, AnimationSpec animationSpec, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(875212471);
        AnimationSpec animationSpec2 = (i11 & 2) != 0 ? f2857c : animationSpec;
        Function1 function2 = (i11 & 4) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i10, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:476)");
        }
        State stateAnimateValueAsState = animateValueAsState(Size.m2332boximpl(j10), VectorConvertersKt.getVectorConverter(Size.INSTANCE), animationSpec2, null, null, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m76animateSizeAsStateYLp_XPw(long j10, @Nullable AnimationSpec<Size> animationSpec, @Nullable String str, @Nullable Function1<? super Size, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1374633148);
        AnimationSpec<Size> animationSpec2 = (i11 & 2) != 0 ? f2857c : animationSpec;
        String str2 = (i11 & 4) != 0 ? "SizeAnimation" : str;
        Function1<? super Size, Unit> function2 = (i11 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i10, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:149)");
        }
        int i12 = i10 << 6;
        State<Size> stateAnimateValueAsState = animateValueAsState(Size.m2332boximpl(j10), VectorConvertersKt.getVectorConverter(Size.INSTANCE), animationSpec2, null, str2, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Composable
    @NotNull
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(T t10, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable AnimationSpec<T> animationSpec, @Nullable T t11, @Nullable String str, @Nullable Function1<? super T, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        AnimationSpec<T> animationSpecSpring;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        composer.startReplaceableGroup(-1994373980);
        if ((i11 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpecSpring = (AnimationSpec) objRememberedValue;
        } else {
            animationSpecSpring = animationSpec;
        }
        T t12 = (i11 & 8) != 0 ? null : t11;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        Function1<? super T, Unit> function2 = (i11 & 32) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:390)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Animatable(t10, typeConverter, t12, str2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue3;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, composer, (i10 >> 15) & 14);
        if (t12 != null && (animationSpecSpring instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpecSpring;
            if (!Intrinsics.areEqual(springSpec.getVisibilityThreshold(), t12)) {
                animationSpecSpring = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t12);
            }
        }
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpecSpring, composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        Channel channel = (Channel) objRememberedValue4;
        EffectsKt.SideEffect(new a(channel, t10), composer, 0);
        EffectsKt.LaunchedEffect(channel, new b(channel, animatable, stateRememberUpdatedState2, stateRememberUpdatedState, null), composer, 72);
        State<T> stateAsState = (State) mutableState.getValue();
        if (stateAsState == null) {
            stateAsState = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    public static final /* synthetic */ State animateRectAsState(Rect targetValue, AnimationSpec animationSpec, Function1 function1, Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        composer.startReplaceableGroup(-782613967);
        if ((i11 & 2) != 0) {
            animationSpec = f2859e;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i10, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:509)");
        }
        State stateAnimateValueAsState = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.INSTANCE), animationSpec2, null, null, function2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    public static final /* synthetic */ State animateIntAsState(int i10, AnimationSpec animationSpec, Function1 function1, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(-842612981);
        if ((i12 & 2) != 0) {
            animationSpec = f2860f;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:524)");
        }
        State stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i10), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec2, null, null, function2, composer, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    public static final /* synthetic */ State animateFloatAsState(float f6, AnimationSpec animationSpec, float f10, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1091643291);
        if ((i11 & 2) != 0) {
            animationSpec = f2855a;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            f10 = 0.01f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:441)");
        }
        State<Float> stateAnimateFloatAsState = animateFloatAsState(f6, animationSpec2, f11, null, function2, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | ((i10 << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateFloatAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @Composable
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter typeConverter, AnimationSpec animationSpec, Object obj2, Function1 function1, Composer composer, int i10, int i11) {
        AnimationSpec animationSpec2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        composer.startReplaceableGroup(-846382129);
        if ((i11 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) objRememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        Object obj3 = (i11 & 8) != 0 ? null : obj2;
        Function1 function2 = (i11 & 16) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:569)");
        }
        int i12 = i10 & 8;
        State stateAnimateValueAsState = animateValueAsState(obj, typeConverter, animationSpec2, obj3, "ValueAnimation", function2, composer, (i12 << 9) | i12 | 24576 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | ((i10 << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }
}
