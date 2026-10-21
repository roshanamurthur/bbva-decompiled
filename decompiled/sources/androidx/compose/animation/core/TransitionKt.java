package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a3\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00040\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000b\u001a\u0088\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001c0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001f0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020!0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020#0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020%0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020'0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a©\u0001\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00040\r\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010)*\u00020**\b\u0012\u0004\u0012\u0002H\u000f0\u00032\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H)0,2*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\u00040\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010-\u001a_\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u000f0\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010/\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002H\u00040\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u00101\u001aA\u00102\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u000f0\u00032\u0006\u00103\u001a\u0002H\u00042\u0006\u0010\u0005\u001a\u0002H\u00042\u0006\u00104\u001a\u00020\u0007H\u0001¢\u0006\u0002\u00105\u001aa\u00106\u001a\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H)07R\b\u0012\u0004\u0012\u0002H\u000f0\u0003\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010)*\u00020**\b\u0012\u0004\u0012\u0002H\u000f0\u00032\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H)0,2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u00108\u001am\u00109\u001a\b\u0012\u0004\u0012\u0002H\u00040\r\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010)*\u00020**\b\u0012\u0004\u0012\u0002H\u000f0\u00032\u0006\u0010:\u001a\u0002H\u00042\u0006\u0010;\u001a\u0002H\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H)0,2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010=\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"AnimationDebugDurationScale", "", "updateTransition", "Landroidx/compose/animation/core/Transition;", ExifInterface.GPS_DIRECTION_TRUE, "targetState", "label", "", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "transitionState", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "animateDp", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", ExifInterface.LATITUDE_SOUTH, "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "", "animateInt", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateValue", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createChildTransition", "transformToChildState", "parentState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createTransitionAnimation", "initialValue", "targetValue", "animationSpec", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1156:1\n858#1,5:1229\n858#1,5:1234\n858#1,5:1239\n858#1,5:1244\n858#1,5:1249\n858#1,5:1254\n858#1,5:1259\n858#1,5:1264\n25#2:1157\n36#2:1164\n36#2:1171\n36#2:1178\n36#2:1185\n36#2:1192\n36#2:1199\n50#2:1206\n49#2:1207\n36#2:1214\n50#2:1221\n49#2:1222\n1097#3,6:1158\n1097#3,6:1165\n1097#3,6:1172\n1097#3,6:1179\n1097#3,6:1186\n1097#3,6:1193\n1097#3,6:1200\n1097#3,6:1208\n1097#3,6:1215\n1097#3,6:1223\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n940#1:1229,5\n971#1:1234,5\n1002#1:1239,5\n1033#1:1244,5\n1064#1:1249,5\n1095#1:1254,5\n1125#1:1259,5\n1155#1:1264,5\n72#1:1157\n74#1:1164\n155#1:1171\n159#1:1178\n754#1:1185\n787#1:1192\n800#1:1199\n804#1:1206\n804#1:1207\n874#1:1214\n897#1:1221\n897#1:1222\n72#1:1158,6\n74#1:1165,6\n155#1:1172,6\n159#1:1179,6\n754#1:1186,6\n787#1:1193,6\n800#1:1200,6\n804#1:1208,6\n874#1:1215,6\n897#1:1223,6\n*E\n"})
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;

    /* JADX INFO: compiled from: Transition.kt */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1156:1\n63#2,5:1157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n*L\n806#1:1157,5\n*E\n"})
    public static final class a extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<S> f3135p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Transition<T> f3136q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Transition<S> transition, Transition<T> transition2) {
            super(1);
            this.f3135p0 = transition;
            this.f3136q0 = transition2;
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
        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final Transition<S> transition = this.f3135p0;
            final Transition<T> transition2 = this.f3136q0;
            transition.addTransition$animation_core_release(transition2);
            return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    transition.removeTransition$animation_core_release(transition2);
                }
            };
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1156:1\n63#2,5:1157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n756#1:1157,5\n*E\n"})
    public static final class b extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<S> f3137p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Transition<S>.DeferredAnimation<T, V> f3138q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Transition<S> transition, Transition<S>.DeferredAnimation<T, V> deferredAnimation) {
            super(1);
            this.f3137p0 = transition;
            this.f3138q0 = deferredAnimation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final Transition<S> transition = this.f3137p0;
            final Transition<S>.DeferredAnimation<T, V> deferredAnimation = this.f3138q0;
            return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    transition.removeAnimation$animation_core_release(deferredAnimation);
                }
            };
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1156:1\n63#2,5:1157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n*L\n899#1:1157,5\n*E\n"})
    public static final class c extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<S> f3139p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Transition<S>.TransitionAnimationState<T, V> f3140q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Transition<S> transition, Transition<S>.TransitionAnimationState<T, V> transitionAnimationState) {
            super(1);
            this.f3139p0 = transition;
            this.f3140q0 = transitionAnimationState;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final Transition<S> transition = this.f3139p0;
            final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState = this.f3140q0;
            transition.addAnimation$animation_core_release(transitionAnimationState);
            return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    transition.removeAnimation$animation_core_release(transitionAnimationState);
                }
            };
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1156:1\n63#2,5:1157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n75#1:1157,5\n*E\n"})
    public static final class d extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<T> f3147p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Transition<T> transition) {
            super(1);
            this.f3147p0 = transition;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final Transition<T> transition = this.f3147p0;
            return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    transition.onTransitionEnd$animation_core_release();
                }
            };
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1156:1\n63#2,5:1157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$2$1\n*L\n160#1:1157,5\n*E\n"})
    public static final class e extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<T> f3148p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Transition<T> transition) {
            super(1);
            this.f3148p0 = transition;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final Transition<T> transition = this.f3148p0;
            return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    transition.onTransitionEnd$animation_core_release();
                }
            };
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Dp> animateDp(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Dp> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(184732935);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Dp>>() { // from class: androidx.compose.animation.core.TransitionKt.animateDp.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Dp> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final SpringSpec<Dp> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-575880366);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-575880366, i12, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:964)");
                    }
                    SpringSpec<Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m4387boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.INSTANCE);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<Dp> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Float> animateFloat(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Float> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-1338768149);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>>() { // from class: androidx.compose.animation.core.TransitionKt.animateFloat.1
                @Composable
                @NotNull
                public final SpringSpec<Float> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-522164544);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-522164544, i12, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:935)");
                    }
                    SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<Float> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Integer> animateInt(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Integer> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(1318902782);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>>() { // from class: androidx.compose.animation.core.TransitionKt.animateInt.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Integer> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final SpringSpec<Integer> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-785273069);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-785273069, i12, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:1088)");
                    }
                    SpringSpec<Integer> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<Integer> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<IntOffset> animateIntOffset(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, IntOffset> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(776131825);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntOffset.1
                @Composable
                @NotNull
                public final SpringSpec<IntOffset> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-1953479610);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1953479610, i12, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1059)");
                    }
                    SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4498boximpl(IntOffsetKt.IntOffset(1, 1)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<IntOffset> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<IntSize> animateIntSize(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, IntSize> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-2104123233);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntSize.1
                @Composable
                @NotNull
                public final SpringSpec<IntSize> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(967893300);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(967893300, i12, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1120)");
                    }
                    SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m4541boximpl(IntSizeKt.IntSize(1, 1)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<IntSize> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Offset> animateOffset(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Offset> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(2078477582);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateOffset.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final SpringSpec<Offset> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(1623385561);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1623385561, i12, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:995)");
                    }
                    SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2264boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.INSTANCE);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<Offset> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Rect> animateRect(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Rect> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(1496278239);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>>() { // from class: androidx.compose.animation.core.TransitionKt.animateRect.1
                @Composable
                @NotNull
                public final SpringSpec<Rect> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(691336298);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(691336298, i12, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1150)");
                    }
                    SpringSpec<Rect> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.INSTANCE);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<Rect> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Size> animateSize(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Size> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-802210820);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>>() { // from class: androidx.compose.animation.core.TransitionKt.animateSize.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Size> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final SpringSpec<Size> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-1607152761);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1607152761, i12, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:1026)");
                    }
                    SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2332boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.INSTANCE);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<Size> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S, T, V extends AnimationVector> State<T> animateValue(@NotNull Transition<S> transition, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, ? extends T> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-142660079);
        if ((i11 & 2) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<T>>() { // from class: androidx.compose.animation.core.TransitionKt.animateValue.1
                @Composable
                @NotNull
                public final SpringSpec<T> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-895531546);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-895531546, i12, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:852)");
                    }
                    SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i11 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i12 = (i10 >> 9) & 112;
        State<T> stateCreateTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i10 >> 3) & 112)), typeConverter, str, composer, (i10 & 14) | (57344 & (i10 << 9)) | ((i10 << 6) & 458752));
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    @ExperimentalTransitionApi
    @Composable
    public static final <S, T> Transition<T> createChildTransition(@NotNull Transition<S> transition, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, ? extends T> transformToChildState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(transformToChildState, "transformToChildState");
        composer.startReplaceableGroup(1215497572);
        if ((i11 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i12 = i10 & 14;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        if (transition.isSeeking()) {
            objRememberedValue = transition.getCurrentState();
        }
        int i13 = (i10 >> 3) & 112;
        Transition<T> transitionCreateChildTransitionInternal = createChildTransitionInternal(transition, transformToChildState.invoke(objRememberedValue, composer, Integer.valueOf(i13)), transformToChildState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), str2, composer, i12 | ((i10 << 6) & 7168));
        composer.endReplaceableGroup();
        return transitionCreateChildTransitionInternal;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final <S, T> Transition<T> createChildTransitionInternal(@NotNull Transition<S> transition, T t10, T t11, @NotNull String childLabel, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(childLabel, "childLabel");
        composer.startReplaceableGroup(-198307638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:794)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition(new MutableTransitionState(t10), transition.getLabel() + " > " + childLabel);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition2 = (Transition) objRememberedValue;
        composer.startReplaceableGroup(511388516);
        boolean zChanged2 = composer.changed(transition) | composer.changed(transition2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new a(transition, transition2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t10, t11, transition.getLastSeekedTimeNanos());
        } else {
            transition2.updateTarget$animation_core_release(t11, composer, ((i10 >> 3) & 8) | ((i10 >> 6) & 14));
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition2;
    }

    @Composable
    @InternalAnimationApi
    @NotNull
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(@NotNull Transition<S> transition, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable String str, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        composer.startReplaceableGroup(-1714122528);
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:749)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition.DeferredAnimation(transition, typeConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) objRememberedValue;
        EffectsKt.DisposableEffect(deferredAnimation, new b(transition, deferredAnimation), composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return deferredAnimation;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(@NotNull Transition<S> transition, T t10, T t11, @NotNull FiniteAnimationSpec<T> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, @NotNull String label, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        composer.startReplaceableGroup(-304821198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:866)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition.TransitionAnimationState(transition, t10, AnimationStateKt.createZeroVectorFrom(typeConverter, t11), typeConverter, label);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) objRememberedValue;
        if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t10, t11, animationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core_release(t11, animationSpec);
        }
        composer.startReplaceableGroup(511388516);
        boolean zChanged2 = composer.changed(transition) | composer.changed(transitionAnimationState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new c(transition, transitionAnimationState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transitionAnimationState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }

    @Composable
    @NotNull
    public static final <T> Transition<T> updateTransition(T t10, @Nullable String str, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(2029166765);
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:67)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Transition(t10, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(t10, composer, (i10 & 8) | 48 | (i10 & 14));
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new d(transition);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    @Composable
    @NotNull
    public static final <T> Transition<T> updateTransition(@NotNull MutableTransitionState<T> transitionState, @Nullable String str, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        composer.startReplaceableGroup(882913843);
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:150)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transitionState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition((MutableTransitionState) transitionState, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(transition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new e(transition);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }
}
