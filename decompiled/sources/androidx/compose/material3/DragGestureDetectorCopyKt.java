package androidx.compose.material3;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DragGestureDetectorCopy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0014\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "", "overSlop", "", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,135:1\n74#1,10:136\n84#1,4:155\n88#1,29:166\n116#2,2:146\n33#2,6:148\n118#2:154\n33#2,6:159\n118#2:165\n116#2,2:195\n33#2,6:197\n118#2:203\n116#2,2:204\n33#2,6:206\n118#2:212\n116#2,2:213\n33#2,6:215\n118#2:221\n164#3:222\n154#3:223\n81#4:224\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n*L\n41#1:136,10\n41#1:155,4\n41#1:166,29\n41#1:146,2\n41#1:148,6\n41#1:154\n41#1:159,6\n41#1:165\n83#1:195,2\n83#1:197,6\n83#1:203\n87#1:204,2\n87#1:206,6\n87#1:212\n124#1:213,2\n124#1:215,6\n124#1:221\n126#1:222\n127#1:223\n128#1:224\n*E\n"})
public final class DragGestureDetectorCopyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10195a = Dp.m4389constructorimpl((float) 0.125d) / Dp.m4389constructorimpl(18);

    /* JADX INFO: compiled from: DragGestureDetectorCopy.kt */
    @DebugMetadata(c = "androidx.compose.material3.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {144, 182}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function2 f10196p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AwaitPointerEventScope f10197q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Ref.LongRef f10198r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public PointerInputChange f10199s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f10200t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f10201u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f10202w0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v0 = obj;
            this.f10202w0 |= Integer.MIN_VALUE;
            return DragGestureDetectorCopyKt.m1084awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa A[LOOP:0: B:38:0x00e3->B:42:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0101 A[EDGE_INSN: B:77:0x0101->B:44:0x0101 BREAK  A[LOOP:0: B:38:0x00e3->B:42:0x00fa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0139 -> B:60:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0179 -> B:68:0x017c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0198 -> B:61:0x0144). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    public static final java.lang.Object m1084awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.m1084awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m1085pointerSlopE8SPZFQ(@NotNull ViewConfiguration pointerSlop, int i10) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m3532equalsimpl0(i10, PointerType.INSTANCE.m3537getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * f10195a : pointerSlop.getTouchSlop();
    }
}
