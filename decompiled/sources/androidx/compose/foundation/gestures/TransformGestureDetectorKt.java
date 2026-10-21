package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.motion.widget.Key;
import com.bbva.google.pay.GoogleTapAndPay;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransformGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0086\u0001\u0010\u000e\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012`\u0010\r\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0003H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\n\u0010\u0011\u001a\u00020\t*\u00020\u0010\u001a\n\u0010\u0012\u001a\u00020\t*\u00020\u0010\u001a\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0016\u001a\u00020\t*\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0001\u001a\u001e\u0010\u0017\u001a\u00020\u0004*\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "panZoomLock", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "centroid", GoogleTapAndPay.KEY_PAN, "", "zoom", Key.ROTATION, "", "onGesture", "detectTransformGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "calculateRotation", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "useCurrent", "calculateCentroidSize", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
public final class TransformGestureDetectorKt {

    /* JADX INFO: compiled from: TransformGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {59, 61}, m = "invokeSuspend", n = {"$this$awaitEachGesture", Key.ROTATION, "zoom", GoogleTapAndPay.KEY_PAN, "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", Key.ROTATION, "zoom", GoogleTapAndPay.KEY_PAN, "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    @SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n101#2,2:256\n33#2,6:258\n103#2:264\n33#2,6:265\n101#2,2:271\n33#2,6:273\n103#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n62#1:256,2\n62#1:258,6\n62#1:264\n96#1:265,6\n103#1:271,2\n103#1:273,6\n103#1:279\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f3947p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public float f3948q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f3949r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f3950s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f3951t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3952u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public /* synthetic */ Object f3953w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f3954x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> f3955y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3954x0 = z10;
            this.f3955y0 = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f3954x0, this.f3955y0, continuation);
            aVar.f3953w0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00af  */
        /* JADX WARN: Code duplicated, block: B:23:0x00bd A[LOOP:0: B:19:0x00ad->B:23:0x00bd, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:78:0x00c0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00bb A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009f -> B:18:0x00a2). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 451
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final float a(long j10) {
        if (Offset.m2275getXimpl(j10) == 0.0f && Offset.m2276getYimpl(j10) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(@NotNull PointerEvent pointerEvent, boolean z10) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jM2291getZeroF1C5BW0 = Offset.INSTANCE.m2291getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM2291getZeroF1C5BW0 = Offset.m2280plusMKHz9U(jM2291getZeroF1C5BW0, z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i10++;
            }
        }
        return i10 == 0 ? Offset.INSTANCE.m2290getUnspecifiedF1C5BW0() : Offset.m2270divtuRUvjQ(jM2291getZeroF1C5BW0, i10);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroid(pointerEvent, z10);
    }

    public static final float calculateCentroidSize(@NotNull PointerEvent pointerEvent, boolean z10) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, z10);
        float fM2273getDistanceimpl = 0.0f;
        if (Offset.m2272equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m2290getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                i10++;
                fM2273getDistanceimpl = Offset.m2273getDistanceimpl(Offset.m2279minusMKHz9U(z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid)) + fM2273getDistanceimpl;
            }
        }
        return fM2273getDistanceimpl / i10;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroidSize(pointerEvent, z10);
    }

    public static final long calculatePan(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m2272equalsimpl0(jCalculateCentroid, companion.m2290getUnspecifiedF1C5BW0()) ? companion.m2291getZeroF1C5BW0() : Offset.m2279minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i10);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f6 = 0.0f;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size2; i13++) {
            PointerInputChange pointerInputChange2 = changes2.get(i13);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM2279minusMKHz9U = Offset.m2279minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM2279minusMKHz9U2 = Offset.m2279minusMKHz9U(position, jCalculateCentroid);
                float fA = a(jM2279minusMKHz9U2) - a(jM2279minusMKHz9U);
                float fM2273getDistanceimpl = Offset.m2273getDistanceimpl(Offset.m2280plusMKHz9U(jM2279minusMKHz9U2, jM2279minusMKHz9U)) / 2.0f;
                if (fA > 180.0f) {
                    fA -= 360.0f;
                } else if (fA < -180.0f) {
                    fA += 360.0f;
                }
                f10 += fA * fM2273getDistanceimpl;
                f6 += fM2273getDistanceimpl;
            }
        }
        if (f6 == 0.0f) {
            return 0.0f;
        }
        return f10 / f6;
    }

    public static final float calculateZoom(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    @Nullable
    public static final Object detectTransformGestures(@NotNull PointerInputScope pointerInputScope, boolean z10, @NotNull Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new a(z10, function4, null), continuation);
        return objAwaitEachGesture == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z10, Function4 function4, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return detectTransformGestures(pointerInputScope, z10, function4, continuation);
    }
}
