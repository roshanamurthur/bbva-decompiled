package androidx.compose.material;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0014\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "", "overSlop", "", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,114:1\n53#1,10:115\n63#1,4:134\n67#1,29:145\n116#2,2:125\n33#2,6:127\n118#2:133\n33#2,6:138\n118#2:144\n116#2,2:174\n33#2,6:176\n118#2:182\n116#2,2:183\n33#2,6:185\n118#2:191\n116#2,2:192\n33#2,6:194\n118#2:200\n164#3:201\n154#3:202\n81#4:203\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material/DragGestureDetectorCopyKt\n*L\n40#1:115,10\n40#1:134,4\n40#1:145,29\n40#1:125,2\n40#1:127,6\n40#1:133\n40#1:138,6\n40#1:144\n62#1:174,2\n62#1:176,6\n62#1:182\n66#1:183,2\n66#1:185,6\n66#1:191\n103#1:192,2\n103#1:194,6\n103#1:200\n105#1:201\n106#1:202\n107#1:203\n*E\n"})
public final class DragGestureDetectorCopyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7052a = Dp.m4389constructorimpl((float) 0.125d) / Dp.m4389constructorimpl(18);

    /* JADX INFO: compiled from: DragGestureDetectorCopy.kt */
    @DebugMetadata(c = "androidx.compose.material.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {123, 161}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function2 f7053p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AwaitPointerEventScope f7054q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Ref.LongRef f7055r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public PointerInputChange f7056s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f7057t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f7058u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f7059w0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v0 = obj;
            this.f7059w0 |= Integer.MIN_VALUE;
            return DragGestureDetectorCopyKt.m747awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
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
    public static final java.lang.Object m747awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DragGestureDetectorCopyKt.m747awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m748pointerSlopE8SPZFQ(@NotNull ViewConfiguration pointerSlop, int i10) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m3532equalsimpl0(i10, PointerType.INSTANCE.m3537getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * f7052a : pointerSlop.getTouchSlop();
    }
}
