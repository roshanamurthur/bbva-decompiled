package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import com.esotericsoftware.asm.Opcodes;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a_\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0014\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0088\u0001\u0010\u001e\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0088\u0001\u0010 \u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b \u0010\u001f\u001a_\u0010#\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\"\u0010\r\u001ag\u0010(\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a9\u0010*\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b)\u0010\u0013\u001a'\u0010,\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b+\u0010\u0016\u001a\u0088\u0001\u0010.\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010-\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b.\u0010\u001f\u001a_\u00100\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b/\u0010\r\u001ag\u00103\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$26\u00101\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b2\u0010'\u001a9\u00105\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b4\u0010\u0013\u001a'\u00107\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b6\u0010\u0016\u001a\u0088\u0001\u00109\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u00108\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b9\u0010\u001f\u001ac\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000f2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0\u000f2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u000fH\u0080Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a]\u0010C\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020\u00112\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0003H\u0080Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\bA\u0010B\u001a\f\u0010E\u001a\u00020>*\u00020DH\u0000\u001a'\u0010G\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\bF\u0010\u0016\u001a!\u0010K\u001a\u00020!*\u00020H2\u0006\u0010%\u001a\u00020$H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010J\"\u001a\u0010P\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u001a\u0010S\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006T"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "", "onTouchSlopReached", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "dragAmount", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitVerticalPointerSlopOrCancellation", "verticalDrag-jO51t88", "verticalDrag", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "onVerticalDrag", "detectVerticalDragGestures", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalTouchSlopOrCancellation", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalDragOrCancellation", "onHorizontalDrag", "detectHorizontalDragGestures", "motionFromChange", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerDirectionConfig", "triggerOnMainAxisSlop", "awaitPointerSlopOrCancellation-wtdNQyU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/PointerDirectionConfig;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Landroidx/compose/foundation/gestures/Orientation;", "toPointerDirectionConfig", "awaitLongPressOrCancellation-rnUCldI", "awaitLongPressOrCancellation", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "a", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getHorizontalPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "HorizontalPointerDirectionConfig", "b", "getVerticalPointerDirectionConfig", "VerticalPointerDirectionConfig", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,873:1\n665#1,11:874\n676#1,4:894\n680#1,58:905\n615#1,4:963\n619#1,2:976\n621#1,8:985\n658#1,18:993\n676#1,4:1020\n680#1,58:1031\n658#1,18:1089\n676#1,4:1116\n680#1,58:1127\n581#1,6:1185\n615#1,4:1191\n619#1,2:1204\n621#1,8:1213\n588#1,10:1221\n615#1,4:1231\n619#1,2:1244\n621#1,8:1253\n658#1,18:1261\n676#1,4:1288\n680#1,58:1299\n658#1,18:1357\n676#1,4:1384\n680#1,58:1395\n581#1,6:1453\n615#1,4:1459\n619#1,2:1472\n621#1,8:1481\n588#1,10:1489\n615#1,4:1499\n619#1,2:1512\n621#1,8:1521\n615#1,4:1529\n619#1,2:1542\n621#1,8:1551\n615#1,4:1559\n619#1,2:1572\n621#1,8:1581\n116#2,2:885\n33#2,6:887\n118#2:893\n33#2,6:898\n118#2:904\n116#2,2:967\n33#2,6:969\n118#2:975\n33#2,6:978\n118#2:984\n116#2,2:1011\n33#2,6:1013\n118#2:1019\n33#2,6:1024\n118#2:1030\n116#2,2:1107\n33#2,6:1109\n118#2:1115\n33#2,6:1120\n118#2:1126\n116#2,2:1195\n33#2,6:1197\n118#2:1203\n33#2,6:1206\n118#2:1212\n116#2,2:1235\n33#2,6:1237\n118#2:1243\n33#2,6:1246\n118#2:1252\n116#2,2:1279\n33#2,6:1281\n118#2:1287\n33#2,6:1292\n118#2:1298\n116#2,2:1375\n33#2,6:1377\n118#2:1383\n33#2,6:1388\n118#2:1394\n116#2,2:1463\n33#2,6:1465\n118#2:1471\n33#2,6:1474\n118#2:1480\n116#2,2:1503\n33#2,6:1505\n118#2:1511\n33#2,6:1514\n118#2:1520\n116#2,2:1533\n33#2,6:1535\n118#2:1541\n33#2,6:1544\n118#2:1550\n116#2,2:1563\n33#2,6:1565\n118#2:1571\n33#2,6:1574\n118#2:1580\n116#2,2:1589\n33#2,6:1591\n118#2:1597\n116#2,2:1598\n33#2,6:1600\n118#2:1606\n116#2,2:1607\n33#2,6:1609\n118#2:1615\n116#2,2:1616\n33#2,6:1618\n118#2:1624\n116#2,2:1625\n33#2,6:1627\n118#2:1633\n116#2,2:1634\n33#2,6:1636\n118#2:1642\n116#2,2:1643\n33#2,6:1645\n118#2:1651\n116#2,2:1652\n33#2,6:1654\n118#2:1660\n116#2,2:1661\n33#2,6:1663\n118#2:1669\n116#2,2:1670\n33#2,6:1672\n118#2:1678\n164#3:1679\n154#3:1680\n81#4:1681\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:874,11\n78#1:894,4\n78#1:905,58\n143#1:963,4\n143#1:976,2\n143#1:985,8\n288#1:993,18\n288#1:1020,4\n288#1:1031,58\n299#1:1089,18\n299#1:1116,4\n299#1:1127,58\n325#1:1185,6\n325#1:1191,4\n325#1:1204,2\n325#1:1213,8\n325#1:1221,10\n355#1:1231,4\n355#1:1244,2\n355#1:1253,8\n439#1:1261,18\n439#1:1288,4\n439#1:1299,58\n450#1:1357,18\n450#1:1384,4\n450#1:1395,58\n473#1:1453,6\n473#1:1459,4\n473#1:1472,2\n473#1:1481,8\n473#1:1489,10\n503#1:1499,4\n503#1:1512,2\n503#1:1521,8\n586#1:1529,4\n586#1:1542,2\n586#1:1551,8\n586#1:1559,4\n586#1:1572,2\n586#1:1581,8\n78#1:885,2\n78#1:887,6\n78#1:893\n78#1:898,6\n78#1:904\n143#1:967,2\n143#1:969,6\n143#1:975\n143#1:978,6\n143#1:984\n288#1:1011,2\n288#1:1013,6\n288#1:1019\n288#1:1024,6\n288#1:1030\n299#1:1107,2\n299#1:1109,6\n299#1:1115\n299#1:1120,6\n299#1:1126\n325#1:1195,2\n325#1:1197,6\n325#1:1203\n325#1:1206,6\n325#1:1212\n355#1:1235,2\n355#1:1237,6\n355#1:1243\n355#1:1246,6\n355#1:1252\n439#1:1279,2\n439#1:1281,6\n439#1:1287\n439#1:1292,6\n439#1:1298\n450#1:1375,2\n450#1:1377,6\n450#1:1383\n450#1:1388,6\n450#1:1394\n473#1:1463,2\n473#1:1465,6\n473#1:1471\n473#1:1474,6\n473#1:1480\n503#1:1503,2\n503#1:1505,6\n503#1:1511\n503#1:1514,6\n503#1:1520\n586#1:1533,2\n586#1:1535,6\n586#1:1541\n586#1:1544,6\n586#1:1550\n586#1:1563,2\n586#1:1565,6\n586#1:1571\n586#1:1574,6\n586#1:1580\n618#1:1589,2\n618#1:1591,6\n618#1:1597\n620#1:1598,2\n620#1:1600,6\n620#1:1606\n675#1:1607,2\n675#1:1609,6\n675#1:1615\n679#1:1616,2\n679#1:1618,6\n679#1:1624\n675#1:1625,2\n675#1:1627,6\n675#1:1633\n679#1:1634,2\n679#1:1636,6\n679#1:1642\n675#1:1643,2\n675#1:1645,6\n675#1:1651\n679#1:1652,2\n679#1:1654,6\n679#1:1660\n801#1:1661,2\n801#1:1663,6\n801#1:1669\n854#1:1670,2\n854#1:1672,6\n854#1:1678\n860#1:1679\n861#1:1680\n862#1:1681\n*E\n"})
public final class DragGestureDetectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DragGestureDetectorKt$HorizontalPointerDirectionConfig$1 f3586a = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: crossAxisDelta-k-4lQ0M, reason: not valid java name */
        public float mo198crossAxisDeltak4lQ0M(long offset) {
            return Offset.m2276getYimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: mainAxisDelta-k-4lQ0M, reason: not valid java name */
        public float mo199mainAxisDeltak4lQ0M(long offset) {
            return Offset.m2275getXimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: offsetFromChanges-dBAh8RU, reason: not valid java name */
        public long mo200offsetFromChangesdBAh8RU(float mainChange, float crossChange) {
            return OffsetKt.Offset(mainChange, crossChange);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final DragGestureDetectorKt$VerticalPointerDirectionConfig$1 f3587b = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: crossAxisDelta-k-4lQ0M */
        public float mo198crossAxisDeltak4lQ0M(long offset) {
            return Offset.m2275getXimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: mainAxisDelta-k-4lQ0M */
        public float mo199mainAxisDeltak4lQ0M(long offset) {
            return Offset.m2276getYimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: offsetFromChanges-dBAh8RU */
        public long mo200offsetFromChangesdBAh8RU(float mainChange, float crossChange) {
            return OffsetKt.Offset(crossChange, mainChange);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f3588c = Dp.m4389constructorimpl((float) 0.125d) / Dp.m4389constructorimpl(18);

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {876}, m = "awaitDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3589p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.LongRef f3590q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3591r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3592s0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3591r0 = obj;
            this.f3592s0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m182awaitDragOrCancellationrnUCldI(null, 0L, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {391, 393, 401}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    public static final class a0 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.FloatRef f3593p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f3594q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3595r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Offset, Unit> f3596s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<PointerInputChange, Float, Unit> f3597t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f3598u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX INFO: compiled from: DragGestureDetector.kt */
        public static final class a extends Lambda implements Function1<PointerInputChange, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function2<PointerInputChange, Float, Unit> f3599p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super PointerInputChange, ? super Float, Unit> function2) {
                super(1);
                this.f3599p0 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(PointerInputChange pointerInputChange) {
                PointerInputChange it = pointerInputChange;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f3599p0.invoke(it, Float.valueOf(Offset.m2276getYimpl(PointerEventKt.positionChange(it))));
                it.consume();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: DragGestureDetector.kt */
        public static final class b extends Lambda implements Function2<PointerInputChange, Float, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f3600p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ref.FloatRef floatRef) {
                super(2);
                this.f3600p0 = floatRef;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(PointerInputChange pointerInputChange, Float f6) {
                PointerInputChange change = pointerInputChange;
                float fFloatValue = f6.floatValue();
                Intrinsics.checkNotNullParameter(change, "change");
                change.consume();
                this.f3600p0.element = fFloatValue;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Continuation continuation, Function0 function0, Function0 function1, Function1 function2, Function2 function3) {
            super(2, continuation);
            this.f3596s0 = function2;
            this.f3597t0 = function3;
            this.f3598u0 = function0;
            this.v0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a0 a0Var = new a0(continuation, this.f3598u0, this.v0, this.f3596s0, this.f3597t0);
            a0Var.f3595r0 = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((a0) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            Ref.FloatRef floatRef;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3594q0;
            if (i10 != 0) {
                if (i10 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f3595r0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 == 2) {
                        floatRef = this.f3593p0;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.f3595r0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            this.f3596s0.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                            Float fBoxFloat = Boxing.boxFloat(floatRef.element);
                            Function2<PointerInputChange, Float, Unit> function2 = this.f3597t0;
                            function2.invoke(pointerInputChange, fBoxFloat);
                            long id = pointerInputChange.getId();
                            a aVar = new a(function2);
                            this.f3595r0 = null;
                            this.f3593p0 = null;
                            this.f3594q0 = 3;
                            obj = DragGestureDetectorKt.m197verticalDragjO51t88(awaitPointerEventScope2, id, aVar, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f3598u0.invoke();
                } else {
                    this.v0.invoke();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f3595r0;
            this.f3595r0 = awaitPointerEventScope3;
            this.f3594q0 = 1;
            Object objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, this, 2, null);
            if (objAwaitFirstDown$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope = awaitPointerEventScope3;
            obj = objAwaitFirstDown$default;
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            long id2 = pointerInputChange2.getId();
            int type = pointerInputChange2.getType();
            b bVar = new b(floatRef2);
            this.f3595r0 = awaitPointerEventScope;
            this.f3593p0 = floatRef2;
            this.f3594q0 = 2;
            obj = DragGestureDetectorKt.m191awaitVerticalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, id2, type, bVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            floatRef = floatRef2;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.f3596s0.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                Float fBoxFloat2 = Boxing.boxFloat(floatRef.element);
                Function2<PointerInputChange, Float, Unit> function3 = this.f3597t0;
                function3.invoke(pointerInputChange, fBoxFloat2);
                long id3 = pointerInputChange.getId();
                a aVar2 = new a(function3);
                this.f3595r0 = null;
                this.f3593p0 = null;
                this.f3594q0 = 3;
                obj = DragGestureDetectorKt.m197verticalDragjO51t88(awaitPointerEventScope2, id3, aVar2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f3598u0.invoke();
                } else {
                    this.v0.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {876}, m = "awaitHorizontalDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3601p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.LongRef f3602q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3603r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3604s0;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3603r0 = obj;
            this.f3604s0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m183awaitHorizontalDragOrCancellationrnUCldI(null, 0L, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {109}, m = "drag-jO51t88", n = {"$this$drag_u2djO51t88", "onDrag"}, s = {"L$0", "L$1"})
    public static final class b0 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3605p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Function1 f3606q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3607r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3608s0;

        public b0() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3607r0 = obj;
            this.f3608s0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m194dragjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {890, 940}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "I$0", "F$0", "F$1", "F$2", "L$0", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2"})
    public static final class c extends ContinuationImpl {
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function2 f3609p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PointerDirectionConfig f3610q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3611r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.LongRef f3612s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public PointerInputChange f3613t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3614u0;
        public float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f3615w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f3616x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ Object f3617y0;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3617y0 = obj;
            this.E0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m184awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {876}, m = "drag-VnAYq1g", n = {"$this$drag_u2dVnAYq1g", "onDrag", "motionFromChange", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2\n*L\n1#1,873:1\n*E\n"})
    public static final class c0 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3618p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Function1 f3619q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function1 f3620r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Function1 f3621s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public AwaitPointerEventScope f3622t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Ref.LongRef f3623u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f3624w0;

        public c0() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v0 = obj;
            this.f3624w0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m193dragVnAYq1g(null, 0L, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {890, 940}, m = "awaitHorizontalTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "I$0", "F$0", "F$1", "F$2", "L$0", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2"})
    public static final class d extends ContinuationImpl {
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function2 f3625p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PointerDirectionConfig f3626q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3627r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.LongRef f3628s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public PointerInputChange f3629t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3630u0;
        public float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f3631w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f3632x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ Object f3633y0;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3633y0 = obj;
            this.E0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m185awaitHorizontalTouchSlopOrCancellationjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0}, l = {882}, m = "horizontalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class d0 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f3634p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AwaitPointerEventScope f3635q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3636r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.LongRef f3637s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f3638t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3639u0;

        public d0() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3638t0 = obj;
            this.f3639u0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m195horizontalDragjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {808}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress"}, s = {"L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PointerInputChange f3640p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.ObjectRef f3641q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3642r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3643s0;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3642r0 = obj;
            this.f3643s0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m186awaitLongPressOrCancellationrnUCldI(null, 0L, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0}, l = {882}, m = "verticalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class e0 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f3644p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AwaitPointerEventScope f3645q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3646r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.LongRef f3647s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f3648t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3649u0;

        public e0() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3648t0 = obj;
            this.f3649u0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m197verticalDragjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {811, 828}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n86#2,2:874\n33#2,6:876\n88#2:882\n101#2,2:883\n33#2,6:885\n103#2:891\n101#2,2:892\n33#2,6:894\n103#2:900\n116#2,2:901\n33#2,6:903\n118#2:909\n116#2,2:910\n33#2,6:912\n118#2:918\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n812#1:874,2\n812#1:876,6\n812#1:882\n818#1:883,2\n818#1:885,6\n818#1:891\n829#1:892,2\n829#1:894,6\n829#1:900\n833#1:901,2\n833#1:903,6\n833#1:909\n843#1:910,2\n843#1:912,6\n843#1:918\n*E\n"})
    public static final class f extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PointerEvent f3650p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f3651q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f3652r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f3653s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<PointerInputChange> f3654t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<PointerInputChange> f3655u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f3654t0 = objectRef;
            this.f3655u0 = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = new f(this.f3654t0, this.f3655u0, continuation);
            fVar.f3653s0 = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((f) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0066  */
        /* JADX WARN: Code duplicated, block: B:21:0x0073 A[LOOP:2: B:17:0x0064->B:21:0x0073, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:71:0x0076 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x0077 A[EDGE_INSN: B:72:0x0077->B:23:0x0077 BREAK  A[LOOP:2: B:17:0x0064->B:21:0x0073], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v11, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b3 -> B:36:0x00b5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {674, 708}, m = "awaitPointerSlopOrCancellation-wtdNQyU", n = {"$this$awaitPointerSlopOrCancellation_u2dwtdNQyU", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "triggerOnMainAxisSlop", "touchSlop", "totalMainPositionChange", "totalCrossPositionChange", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "dragEvent", "triggerOnMainAxisSlop", "touchSlop", "totalMainPositionChange", "totalCrossPositionChange"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "F$0", "F$1", "F$2"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1\n*L\n1#1,873:1\n*E\n"})
    public static final class g extends ContinuationImpl {
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3656p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PointerDirectionConfig f3657q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function2 f3658r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.LongRef f3659s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public PointerInputChange f3660t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f3661u0;
        public float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f3662w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f3663x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ Object f3664y0;

        public g() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3664y0 = obj;
            this.E0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m187awaitPointerSlopOrCancellationwtdNQyU(null, 0L, 0, null, false, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {883, 933}, m = "awaitTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "I$0", "F$0", "F$1", "F$2", "L$0", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2"})
    public static final class h extends ContinuationImpl {
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function2 f3665p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PointerDirectionConfig f3666q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3667r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.LongRef f3668s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public PointerInputChange f3669t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3670u0;
        public float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f3671w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f3672x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ Object f3673y0;

        public h() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3673y0 = obj;
            this.E0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m189awaitTouchSlopOrCancellationjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {876}, m = "awaitVerticalDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3674p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.LongRef f3675q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3676r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3677s0;

        public i() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3676r0 = obj;
            this.f3677s0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m190awaitVerticalDragOrCancellationrnUCldI(null, 0L, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {890, 940}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "I$0", "F$0", "F$1", "F$2", "L$0", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2"})
    public static final class j extends ContinuationImpl {
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function2 f3678p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PointerDirectionConfig f3679q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3680r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.LongRef f3681s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public PointerInputChange f3682t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3683u0;
        public float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f3684w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f3685x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ Object f3686y0;

        public j() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3686y0 = obj;
            this.E0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m191awaitVerticalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {890, 940}, m = "awaitVerticalTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "I$0", "F$0", "F$1", "F$2", "L$0", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2"})
    public static final class k extends ContinuationImpl {
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function2 f3687p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PointerDirectionConfig f3688q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3689r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.LongRef f3690s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public PointerInputChange f3691t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3692u0;
        public float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f3693w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f3694x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public /* synthetic */ Object f3695y0;

        public k() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3695y0 = obj;
            this.E0 |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.m192awaitVerticalTouchSlopOrCancellationjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class l extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f3696p0 = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            offset.getF15533a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class m extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f3697p0 = new m(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class n extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f3698p0 = new n(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {176, 890, 940, Opcodes.INSTANCEOF}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "F$0", "F$1", "F$2"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n658#2,18:874\n676#2,4:901\n680#2,58:912\n116#3,2:892\n33#3,6:894\n118#3:900\n33#3,6:905\n118#3:911\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n180#1:874,18\n180#1:901,4\n180#1:912,58\n180#1:892,2\n180#1:894,6\n180#1:900\n180#1:905,6\n180#1:911\n*E\n"})
    public static final class o extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public int E0;
        public /* synthetic */ Object F0;
        public final /* synthetic */ Function1<Offset, Unit> G0;
        public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> H0;
        public final /* synthetic */ Function0<Unit> I0;
        public final /* synthetic */ Function0<Unit> J0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PointerInputChange f3699p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.LongRef f3700q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3701r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public PointerDirectionConfig f3702s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Ref.LongRef f3703t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public PointerInputChange f3704u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f3705w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f3706x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public float f3707y0;

        /* JADX INFO: compiled from: DragGestureDetector.kt */
        public static final class a extends Lambda implements Function1<PointerInputChange, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> f3708p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
                super(1);
                this.f3708p0 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(PointerInputChange pointerInputChange) {
                PointerInputChange it = pointerInputChange;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f3708p0.invoke(it, Offset.m2264boximpl(PointerEventKt.positionChange(it)));
                it.consume();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Continuation continuation, Function0 function0, Function0 function1, Function1 function2, Function2 function3) {
            super(2, continuation);
            this.G0 = function2;
            this.H0 = function3;
            this.I0 = function0;
            this.J0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o oVar = new o(continuation, this.I0, this.J0, this.G0, this.H0);
            oVar.F0 = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((o) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x010c  */
        /* JADX WARN: Code duplicated, block: B:30:0x0129 A[LOOP:0: B:26:0x010a->B:30:0x0129, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:92:0x013c A[EDGE_INSN: B:92:0x013c->B:32:0x013c BREAK  A[LOOP:0: B:26:0x010a->B:30:0x0129], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v17 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c6 -> B:74:0x0239). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0142 -> B:35:0x0148). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01e4 -> B:63:0x01ea). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0234 -> B:74:0x0239). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 677
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class p extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f3709p0 = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            offset.getF15533a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class q extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f3710p0 = new q(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class r extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f3711p0 = new r(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {235, 236, 241}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n33#2,6:874\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n247#1:874,6\n*E\n"})
    public static final class s extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3712p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3713q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Offset, Unit> f3714r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f3715s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f3716t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> f3717u0;

        /* JADX INFO: compiled from: DragGestureDetector.kt */
        public static final class a extends Lambda implements Function1<PointerInputChange, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> f3718p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
                super(1);
                this.f3718p0 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(PointerInputChange pointerInputChange) {
                PointerInputChange it = pointerInputChange;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f3718p0.invoke(it, Offset.m2264boximpl(PointerEventKt.positionChange(it)));
                it.consume();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Continuation continuation, Function0 function0, Function0 function1, Function1 function2, Function2 function3) {
            super(2, continuation);
            this.f3714r0 = function2;
            this.f3715s0 = function0;
            this.f3716t0 = function1;
            this.f3717u0 = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            s sVar = new s(continuation, this.f3715s0, this.f3716t0, this.f3714r0, this.f3717u0);
            sVar.f3713q0 = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((s) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0064 A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x0088, B:35:0x0090, B:37:0x009f, B:39:0x00ab, B:40:0x00ae, B:41:0x00b1, B:42:0x00b7, B:15:0x002a, B:27:0x0060, B:29:0x0064, B:18:0x0032, B:24:0x004f, B:21:0x0042), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x0087  */
        /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x0088, B:35:0x0090, B:37:0x009f, B:39:0x00ab, B:40:0x00ae, B:41:0x00b1, B:42:0x00b7, B:15:0x002a, B:27:0x0060, B:29:0x0064, B:18:0x0032, B:24:0x004f, B:21:0x0042), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:37:0x009f A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x0088, B:35:0x0090, B:37:0x009f, B:39:0x00ab, B:40:0x00ae, B:41:0x00b1, B:42:0x00b7, B:15:0x002a, B:27:0x0060, B:29:0x0064, B:18:0x0032, B:24:0x004f, B:21:0x0042), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ab A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x0088, B:35:0x0090, B:37:0x009f, B:39:0x00ab, B:40:0x00ae, B:41:0x00b1, B:42:0x00b7, B:15:0x002a, B:27:0x0060, B:29:0x0064, B:18:0x0032, B:24:0x004f, B:21:0x0042), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00b7 A[Catch: CancellationException -> 0x001b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x0088, B:35:0x0090, B:37:0x009f, B:39:0x00ab, B:40:0x00ae, B:41:0x00b1, B:42:0x00b7, B:15:0x002a, B:27:0x0060, B:29:0x0064, B:18:0x0032, B:24:0x004f, B:21:0x0042), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00ae A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            PointerInputChange pointerInputChange;
            AwaitPointerEventScope awaitPointerEventScope2;
            List<PointerInputChange> changes;
            int size;
            int i10;
            PointerInputChange pointerInputChange2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = this.f3712p0;
            Function0<Unit> function0 = this.f3716t0;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f3713q0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i11 == 2) {
                            awaitPointerEventScope = (AwaitPointerEventScope) this.f3713q0;
                            ResultKt.throwOnFailure(obj);
                            pointerInputChange = (PointerInputChange) obj;
                            if (pointerInputChange != null) {
                                this.f3714r0.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                                long id = pointerInputChange.getId();
                                a aVar = new a(this.f3717u0);
                                this.f3713q0 = awaitPointerEventScope;
                                this.f3712p0 = 3;
                                obj = DragGestureDetectorKt.m194dragjO51t88(awaitPointerEventScope, id, aVar, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope2 = awaitPointerEventScope;
                            }
                            return Unit.INSTANCE;
                        }
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.f3713q0;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                        size = changes.size();
                        for (i10 = 0; i10 < size; i10++) {
                            pointerInputChange2 = changes.get(i10);
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                        }
                        this.f3715s0.invoke();
                    } else {
                        function0.invoke();
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.f3713q0;
                this.f3713q0 = awaitPointerEventScope;
                this.f3712p0 = 1;
                obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                long id2 = ((PointerInputChange) obj).getId();
                this.f3713q0 = awaitPointerEventScope;
                this.f3712p0 = 2;
                obj = DragGestureDetectorKt.m186awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                    this.f3714r0.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                    long id3 = pointerInputChange.getId();
                    a aVar2 = new a(this.f3717u0);
                    this.f3713q0 = awaitPointerEventScope;
                    this.f3712p0 = 3;
                    obj = DragGestureDetectorKt.m194dragjO51t88(awaitPointerEventScope, id3, aVar2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    if (((Boolean) obj).booleanValue()) {
                        changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                        size = changes.size();
                        while (i10 < size) {
                            pointerInputChange2 = changes.get(i10);
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                        }
                        this.f3715s0.invoke();
                    } else {
                        function0.invoke();
                    }
                }
                return Unit.INSTANCE;
            } catch (CancellationException e5) {
                function0.invoke();
                throw e5;
            }
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class t extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final t f3719p0 = new t(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            offset.getF15533a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class u extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final u f3720p0 = new u(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class v extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final v f3721p0 = new v(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {539, 541, 552}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    public static final class w extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.FloatRef f3722p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f3723q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3724r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Offset, Unit> f3725s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<PointerInputChange, Float, Unit> f3726t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f3727u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX INFO: compiled from: DragGestureDetector.kt */
        public static final class a extends Lambda implements Function1<PointerInputChange, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function2<PointerInputChange, Float, Unit> f3728p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super PointerInputChange, ? super Float, Unit> function2) {
                super(1);
                this.f3728p0 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(PointerInputChange pointerInputChange) {
                PointerInputChange it = pointerInputChange;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f3728p0.invoke(it, Float.valueOf(Offset.m2275getXimpl(PointerEventKt.positionChange(it))));
                it.consume();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: DragGestureDetector.kt */
        public static final class b extends Lambda implements Function2<PointerInputChange, Float, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f3729p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ref.FloatRef floatRef) {
                super(2);
                this.f3729p0 = floatRef;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(PointerInputChange pointerInputChange, Float f6) {
                PointerInputChange change = pointerInputChange;
                float fFloatValue = f6.floatValue();
                Intrinsics.checkNotNullParameter(change, "change");
                change.consume();
                this.f3729p0.element = fFloatValue;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Continuation continuation, Function0 function0, Function0 function1, Function1 function2, Function2 function3) {
            super(2, continuation);
            this.f3725s0 = function2;
            this.f3726t0 = function3;
            this.f3727u0 = function0;
            this.v0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            w wVar = new w(continuation, this.f3727u0, this.v0, this.f3725s0, this.f3726t0);
            wVar.f3724r0 = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((w) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            Ref.FloatRef floatRef;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3723q0;
            if (i10 != 0) {
                if (i10 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f3724r0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 == 2) {
                        floatRef = this.f3722p0;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.f3724r0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            this.f3725s0.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                            Float fBoxFloat = Boxing.boxFloat(floatRef.element);
                            Function2<PointerInputChange, Float, Unit> function2 = this.f3726t0;
                            function2.invoke(pointerInputChange, fBoxFloat);
                            long id = pointerInputChange.getId();
                            a aVar = new a(function2);
                            this.f3724r0 = null;
                            this.f3722p0 = null;
                            this.f3723q0 = 3;
                            obj = DragGestureDetectorKt.m195horizontalDragjO51t88(awaitPointerEventScope2, id, aVar, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f3727u0.invoke();
                } else {
                    this.v0.invoke();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f3724r0;
            this.f3724r0 = awaitPointerEventScope3;
            this.f3723q0 = 1;
            Object objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, this, 2, null);
            if (objAwaitFirstDown$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope = awaitPointerEventScope3;
            obj = objAwaitFirstDown$default;
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            long id2 = pointerInputChange2.getId();
            int type = pointerInputChange2.getType();
            b bVar = new b(floatRef2);
            this.f3724r0 = awaitPointerEventScope;
            this.f3722p0 = floatRef2;
            this.f3723q0 = 2;
            obj = DragGestureDetectorKt.m184awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, id2, type, bVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            floatRef = floatRef2;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.f3725s0.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                Float fBoxFloat2 = Boxing.boxFloat(floatRef.element);
                Function2<PointerInputChange, Float, Unit> function3 = this.f3726t0;
                function3.invoke(pointerInputChange, fBoxFloat2);
                long id3 = pointerInputChange.getId();
                a aVar2 = new a(function3);
                this.f3724r0 = null;
                this.f3722p0 = null;
                this.f3723q0 = 3;
                obj = DragGestureDetectorKt.m195horizontalDragjO51t88(awaitPointerEventScope2, id3, aVar2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f3727u0.invoke();
                } else {
                    this.v0.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class x extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final x f3730p0 = new x(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            offset.getF15533a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class y extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final y f3731p0 = new y(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    public static final class z extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final z f3732p0 = new z(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final boolean a(PointerEvent pointerEvent, long j10) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i10);
            if (PointerId.m3461equalsimpl0(pointerInputChange.getId(), j10)) {
                break;
            }
            i10++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a A[LOOP:0: B:23:0x0074->B:27:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[EDGE_INSN: B:54:0x008e->B:29:0x008e BREAK  A[LOOP:0: B:23:0x0074->B:27:0x008a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:22:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    public static final java.lang.Object m182awaitDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m182awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a A[LOOP:0: B:23:0x0074->B:27:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x008e A[EDGE_INSN: B:57:0x008e->B:29:0x008e BREAK  A[LOOP:0: B:23:0x0074->B:27:0x008a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:22:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    public static final java.lang.Object m183awaitHorizontalDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m183awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee A[LOOP:0: B:25:0x00d3->B:29:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9 A[EDGE_INSN: B:76:0x00f9->B:31:0x00f9 BREAK  A[LOOP:0: B:25:0x00d3->B:29:0x00ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0132 -> B:50:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0190 -> B:61:0x0198). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01d6 -> B:65:0x01a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    public static final java.lang.Object m184awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m184awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f2 A[LOOP:0: B:25:0x00d7->B:29:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fd A[EDGE_INSN: B:76:0x00fd->B:31:0x00fd BREAK  A[LOOP:0: B:25:0x00d7->B:29:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0136 -> B:50:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0194 -> B:61:0x019c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01da -> B:65:0x01a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final java.lang.Object m185awaitHorizontalTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m185awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Nullable
    /* JADX INFO: renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    public static final Object m186awaitLongPressOrCancellationrnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull Continuation<? super PointerInputChange> continuation) {
        e eVar;
        PointerInputChange pointerInputChange;
        ?? r10;
        Ref.ObjectRef objectRef;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f3643s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f3643s0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f3642r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f3643s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (a(awaitPointerEventScope.getCurrentEvent(), j10)) {
                return null;
            }
            List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
            int size = changes.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i12);
                if (PointerId.m3461equalsimpl0(pointerInputChange.getId(), j10)) {
                    break;
                }
                i12++;
            }
            r10 = pointerInputChange;
            if (r10 == 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef3.element = r10;
            long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
            try {
                f fVar = new f(objectRef3, objectRef2, null);
                eVar.f3640p0 = r10;
                eVar.f3641q0 = objectRef2;
                eVar.f3643s0 = 1;
                if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, fVar, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return null;
            } catch (PointerEventTimeoutCancellationException unused) {
                objectRef = objectRef2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = eVar.f3641q0;
            r10 = eVar.f3640p0;
            try {
                ResultKt.throwOnFailure(obj);
                return null;
            } catch (PointerEventTimeoutCancellationException unused2) {
            }
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) objectRef.element;
        return pointerInputChange2 == null ? r10 : pointerInputChange2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f3 A[LOOP:0: B:25:0x00d8->B:29:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe A[EDGE_INSN: B:79:0x00fe->B:31:0x00fe BREAK  A[LOOP:0: B:25:0x00d8->B:29:0x00f3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0198 -> B:64:0x019c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-wtdNQyU, reason: not valid java name */
    public static final java.lang.Object m187awaitPointerSlopOrCancellationwtdNQyU(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.PointerDirectionConfig r25, boolean r26, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r28) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m187awaitPointerSlopOrCancellationwtdNQyU(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-wtdNQyU$default, reason: not valid java name */
    public static /* synthetic */ Object m188awaitPointerSlopOrCancellationwtdNQyU$default(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, PointerDirectionConfig pointerDirectionConfig, boolean z10, Function2 function2, Continuation continuation, int i11, Object obj) {
        Object obj2;
        PointerInputChange pointerInputChange;
        Object obj3;
        float fAbs;
        long jM2279minusMKHz9U;
        PointerDirectionConfig horizontalPointerDirectionConfig = (i11 & 4) != 0 ? getHorizontalPointerDirectionConfig() : pointerDirectionConfig;
        int i12 = 1;
        boolean z11 = (i11 & 8) != 0 ? true : z10;
        long id = j10;
        PointerEventPass pointerEventPass = null;
        if (a(awaitPointerEventScope.getCurrentEvent(), id)) {
            return null;
        }
        float fM196pointerSlopE8SPZFQ = m196pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i10);
        while (true) {
            float fMo199mainAxisDeltak4lQ0M = 0.0f;
            float fMo198crossAxisDeltak4lQ0M = 0.0f;
            while (true) {
                int i13 = 0;
                InlineMarker.mark(0);
                Object objT = e1.a.t(awaitPointerEventScope, pointerEventPass, continuation, i12, pointerEventPass);
                InlineMarker.mark(i12);
                PointerEvent pointerEvent = (PointerEvent) objT;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        fM196pointerSlopE8SPZFQ = fM196pointerSlopE8SPZFQ;
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes.get(i14);
                    fM196pointerSlopE8SPZFQ = fM196pointerSlopE8SPZFQ;
                    if (PointerId.m3461equalsimpl0(((PointerInputChange) obj2).getId(), id)) {
                        break;
                    }
                    i14++;
                    fM196pointerSlopE8SPZFQ = fM196pointerSlopE8SPZFQ;
                }
                pointerInputChange = (PointerInputChange) obj2;
                if (pointerInputChange == null) {
                    return pointerEventPass;
                }
                if (pointerInputChange.isConsumed()) {
                    return pointerEventPass;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i13 >= size2) {
                            obj3 = pointerEventPass;
                            break;
                        }
                        obj3 = changes2.get(i13);
                        if (((PointerInputChange) obj3).getPressed()) {
                            break;
                        }
                        i13++;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj3;
                    if (pointerInputChange2 == null) {
                        return pointerEventPass;
                    }
                    id = pointerInputChange2.getId();
                    i12 = 1;
                } else {
                    long position = pointerInputChange.getPosition();
                    long previousPosition = pointerInputChange.getPreviousPosition();
                    fMo199mainAxisDeltak4lQ0M += horizontalPointerDirectionConfig.mo199mainAxisDeltak4lQ0M(position) - horizontalPointerDirectionConfig.mo199mainAxisDeltak4lQ0M(previousPosition);
                    fMo198crossAxisDeltak4lQ0M += horizontalPointerDirectionConfig.mo198crossAxisDeltak4lQ0M(position) - horizontalPointerDirectionConfig.mo198crossAxisDeltak4lQ0M(previousPosition);
                    fAbs = z11 ? Math.abs(fMo199mainAxisDeltak4lQ0M) : Offset.m2273getDistanceimpl(horizontalPointerDirectionConfig.mo200offsetFromChangesdBAh8RU(fMo199mainAxisDeltak4lQ0M, fMo198crossAxisDeltak4lQ0M));
                    if (fAbs < fM196pointerSlopE8SPZFQ) {
                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                        InlineMarker.mark(0);
                        awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, continuation);
                        InlineMarker.mark(1);
                        if (pointerInputChange.isConsumed()) {
                            return null;
                        }
                        i12 = 1;
                        pointerEventPass = null;
                    }
                }
            }
            if (z11) {
                jM2279minusMKHz9U = horizontalPointerDirectionConfig.mo200offsetFromChangesdBAh8RU(fMo199mainAxisDeltak4lQ0M - (Math.signum(fMo199mainAxisDeltak4lQ0M) * fM196pointerSlopE8SPZFQ), fMo198crossAxisDeltak4lQ0M);
                fM196pointerSlopE8SPZFQ = fM196pointerSlopE8SPZFQ;
            } else {
                long jMo200offsetFromChangesdBAh8RU = horizontalPointerDirectionConfig.mo200offsetFromChangesdBAh8RU(fMo199mainAxisDeltak4lQ0M, fMo198crossAxisDeltak4lQ0M);
                long jM2270divtuRUvjQ = Offset.m2270divtuRUvjQ(jMo200offsetFromChangesdBAh8RU, fAbs);
                fM196pointerSlopE8SPZFQ = fM196pointerSlopE8SPZFQ;
                jM2279minusMKHz9U = Offset.m2279minusMKHz9U(jMo200offsetFromChangesdBAh8RU, Offset.m2282timestuRUvjQ(jM2270divtuRUvjQ, fM196pointerSlopE8SPZFQ));
            }
            function2.invoke(pointerInputChange, Offset.m2264boximpl(jM2279minusMKHz9U));
            if (pointerInputChange.isConsumed()) {
                return pointerInputChange;
            }
            i12 = 1;
            pointerEventPass = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ef A[LOOP:0: B:25:0x00d4->B:29:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fe A[EDGE_INSN: B:76:0x00fe->B:31:0x00fe BREAK  A[LOOP:0: B:25:0x00d4->B:29:0x00ef], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0136 -> B:50:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0198 -> B:61:0x019c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01d9 -> B:65:0x01a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final java.lang.Object m189awaitTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r23) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m189awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a A[LOOP:0: B:23:0x0074->B:27:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x008e A[EDGE_INSN: B:57:0x008e->B:29:0x008e BREAK  A[LOOP:0: B:23:0x0074->B:27:0x008a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:22:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    public static final java.lang.Object m190awaitVerticalDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m190awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee A[LOOP:0: B:25:0x00d3->B:29:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9 A[EDGE_INSN: B:76:0x00f9->B:31:0x00f9 BREAK  A[LOOP:0: B:25:0x00d3->B:29:0x00ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0132 -> B:50:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0190 -> B:61:0x0198). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01d6 -> B:65:0x01a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    public static final java.lang.Object m191awaitVerticalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m191awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f2 A[LOOP:0: B:25:0x00d7->B:29:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fd A[EDGE_INSN: B:76:0x00fd->B:31:0x00fd BREAK  A[LOOP:0: B:25:0x00d7->B:29:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0136 -> B:50:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0194 -> B:61:0x019c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01da -> B:65:0x01a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final java.lang.Object m192awaitVerticalTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m192awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object detectDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function2, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new o(null, function2, function0, function1, function3), continuation);
        return objAwaitEachGesture == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function2, Function2 function3, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = l.f3696p0;
        }
        Function1 function4 = function1;
        if ((i10 & 2) != 0) {
            function0 = m.f3697p0;
        }
        Function0 function5 = function0;
        if ((i10 & 4) != 0) {
            function2 = n.f3698p0;
        }
        return detectDragGestures(pointerInputScope, function4, function5, function2, function3, continuation);
    }

    @Nullable
    public static final Object detectDragGesturesAfterLongPress(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function2, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new s(null, function0, function2, function1, function3), continuation);
        return objAwaitEachGesture == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function2, Function2 function3, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = p.f3709p0;
        }
        Function1 function4 = function1;
        if ((i10 & 2) != 0) {
            function0 = q.f3710p0;
        }
        Function0 function5 = function0;
        if ((i10 & 4) != 0) {
            function2 = r.f3711p0;
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function4, function5, function2, function3, continuation);
    }

    @Nullable
    public static final Object detectHorizontalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function2, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new w(null, function0, function2, function1, function3), continuation);
        return objAwaitEachGesture == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function2, Function2 function3, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = t.f3719p0;
        }
        Function1 function4 = function1;
        if ((i10 & 2) != 0) {
            function0 = u.f3720p0;
        }
        Function0 function5 = function0;
        if ((i10 & 4) != 0) {
            function2 = v.f3721p0;
        }
        return detectHorizontalDragGestures(pointerInputScope, function4, function5, function2, function3, continuation);
    }

    @Nullable
    public static final Object detectVerticalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function2, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new a0(null, function0, function2, function1, function3), continuation);
        return objAwaitEachGesture == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function2, Function2 function3, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = x.f3730p0;
        }
        Function1 function4 = function1;
        if ((i10 & 2) != 0) {
            function0 = y.f3731p0;
        }
        Function0 function5 = function0;
        if ((i10 & 4) != 0) {
            function2 = z.f3732p0;
        }
        return detectVerticalDragGestures(pointerInputScope, function4, function5, function2, function3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af A[LOOP:0: B:24:0x0094->B:28:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8 A[EDGE_INSN: B:65:0x00b8->B:30:0x00b8 BREAK  A[LOOP:0: B:24:0x0094->B:28:0x00af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: drag-VnAYq1g, reason: not valid java name */
    public static final java.lang.Object m193dragVnAYq1g(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float> r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m193dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0044 -> B:18:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: drag-jO51t88, reason: not valid java name */
    public static final java.lang.Object m194dragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.b0
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$b0 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.b0) r0
            int r1 = r0.f3608s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3608s0 = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$b0 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$b0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3607r0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3608s0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.functions.Function1 r4 = r0.f3606q0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = r0.f3605p0
            kotlin.ResultKt.throwOnFailure(r8)
            r7 = r4
            r4 = r5
            goto L47
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
        L3a:
            r0.f3605p0 = r4
            r0.f3606q0 = r7
            r0.f3608s0 = r3
            java.lang.Object r8 = m182awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L51
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r4
        L51:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L5c
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        L5c:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m194dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return f3586a;
    }

    @NotNull
    public static final PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return f3587b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:0: B:24:0x0086->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a1 A[EDGE_INSN: B:68:0x00a1->B:30:0x00a1 BREAK  A[LOOP:0: B:24:0x0086->B:28:0x009c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0075 -> B:23:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    public static final java.lang.Object m195horizontalDragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m195horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m196pointerSlopE8SPZFQ(@NotNull ViewConfiguration pointerSlop, int i10) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m3532equalsimpl0(i10, PointerType.INSTANCE.m3537getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * f3588c : pointerSlop.getTouchSlop();
    }

    @NotNull
    public static final PointerDirectionConfig toPointerDirectionConfig(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<this>");
        return orientation == Orientation.Vertical ? f3587b : f3586a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:0: B:24:0x0086->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a1 A[EDGE_INSN: B:68:0x00a1->B:30:0x00a1 BREAK  A[LOOP:0: B:24:0x0086->B:28:0x009c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0075 -> B:23:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: verticalDrag-jO51t88, reason: not valid java name */
    public static final java.lang.Object m197verticalDragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m197verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
