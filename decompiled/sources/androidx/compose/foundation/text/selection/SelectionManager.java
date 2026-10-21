package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import bk.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0014\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u0006\u0010!\u001a\u00020\u0019J\u000e\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"J9\u0010-\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J?\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u001b\u00106\u001a\u00020\u00192\u0006\u00103\u001a\u00020&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105R\"\u0010=\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R0\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00190>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010M\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010]\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR+\u0010k\u001a\u00020\"2\u0006\u0010f\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010:\"\u0004\bj\u0010<R.\u0010r\u001a\u0004\u0018\u00010\b2\b\u0010l\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010\n\"\u0004\bp\u0010qR4\u0010w\u001a\u00020&2\u0006\u0010f\u001a\u00020&8@@BX\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bs\u0010h\u001a\u0004\bt\u0010u\"\u0004\bv\u00105R4\u0010{\u001a\u00020&2\u0006\u0010f\u001a\u00020&8@@BX\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bx\u0010h\u001a\u0004\by\u0010u\"\u0004\bz\u00105R9\u0010.\u001a\u0004\u0018\u00010&2\b\u0010f\u001a\u0004\u0018\u00010&8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0013\n\u0004\b|\u0010h\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R<\u0010/\u001a\u0004\u0018\u00010&2\b\u0010f\u001a\u0004\u0018\u00010&8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0016\n\u0005\b\u0081\u0001\u0010h\u001a\u0005\b\u0082\u0001\u0010~\"\u0006\b\u0083\u0001\u0010\u0080\u0001R7\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0084\u00012\t\u0010f\u001a\u0005\u0018\u00010\u0084\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010h\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R=\u0010\u008e\u0001\u001a\u0004\u0018\u00010&2\b\u0010f\u001a\u0004\u0018\u00010&8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0016\n\u0005\b\u008b\u0001\u0010h\u001a\u0005\b\u008c\u0001\u0010~\"\u0006\b\u008d\u0001\u0010\u0080\u0001R-\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010l\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u0097\u0001\u001a\u00030\u0094\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u009c\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable$foundation_release", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates$foundation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates", "", "selectableId", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "", "selectAll$foundation_release", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "selectAll", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText", "", "copy$foundation_release", "()V", "copy", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "onRelease", "", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "Landroidx/compose/ui/geometry/Offset;", "newPosition", "previousPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "updateSelection-RHHTvR4$foundation_release", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelection", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "updateSelection-3R_-tFg$foundation_release", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "position", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "c", "Z", "getTouchMode", "()Z", "setTouchMode", "(Z)V", "touchMode", "Lkotlin/Function1;", "d", "Lkotlin/jvm/functions/Function1;", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "onSelectionChange", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "e", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hapticFeedBack", "Landroidx/compose/ui/platform/ClipboardManager;", "f", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/TextToolbar;", "g", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "textToolbar", "Landroidx/compose/ui/focus/FocusRequester;", "h", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", "<set-?>", "i", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "setHasFocus", "hasFocus", "value", "k", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "containerLayoutCoordinates", "l", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "dragBeginPosition", "m", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance", "n", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "o", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "Landroidx/compose/foundation/text/Handle;", "p", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "q", "getCurrentDragPosition-_m7T9-E", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "selection", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,914:1\n81#2:915\n107#2,2:916\n81#2:918\n107#2,2:919\n81#2:921\n107#2,2:922\n81#2:924\n107#2,2:925\n81#2:927\n107#2,2:928\n81#2:930\n107#2,2:931\n81#2:933\n107#2,2:934\n1#3:936\n59#4,3:937\n62#4,2:944\n64#4:947\n59#4,3:948\n62#4,2:955\n64#4:958\n33#5,4:940\n38#5:946\n33#5,4:951\n38#5:957\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n112#1:915\n112#1:916,2\n161#1:918\n161#1:919,2\n168#1:921\n168#1:922,2\n177#1:924\n177#1:925,2\n186#1:927\n186#1:928,2\n193#1:930\n193#1:931,2\n200#1:933\n200#1:934,2\n368#1:937,3\n368#1:944,2\n368#1:947\n752#1:948,3\n752#1:955,2\n752#1:958\n368#1:940,4\n368#1:946\n752#1:951,4\n752#1:957\n*E\n"})
public final class SelectionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SelectionRegistrarImpl f6353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState<Selection> f6354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean touchMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super Selection, Unit> onSelectionChange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public HapticFeedback hapticFeedBack;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ClipboardManager clipboardManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextToolbar textToolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester focusRequester;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState hasFocus;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Offset f6362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LayoutCoordinates containerLayoutCoordinates;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState dragBeginPosition;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableState dragTotalDistance;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState startHandlePosition;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState endHandlePosition;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState draggingHandle;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState currentDragPosition;

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class a extends Lambda implements Function1<Long, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            Selection selection;
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            long jLongValue = l6.longValue();
            SelectionManager selectionManager = SelectionManager.this;
            Selection selection2 = selectionManager.getSelection();
            if ((selection2 != null && (start = selection2.getStart()) != null && jLongValue == start.getSelectableId()) || ((selection = selectionManager.getSelection()) != null && (end = selection.getEnd()) != null && jLongValue == end.getSelectableId())) {
                selectionManager.a();
                SelectionManager.access$updateSelectionToolbarPosition(selectionManager);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class b extends Lambda implements Function3<LayoutCoordinates, Offset, SelectionAdjustment, Unit> {
        public b() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
            LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
            long f15533a = offset.getF15533a();
            SelectionAdjustment selectionMode = selectionAdjustment;
            Intrinsics.checkNotNullParameter(layoutCoordinates2, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            SelectionManager selectionManager = SelectionManager.this;
            Offset offsetM617access$convertToContainerCoordinatesQ7Q5hAU = SelectionManager.m617access$convertToContainerCoordinatesQ7Q5hAU(selectionManager, layoutCoordinates2, f15533a);
            if (offsetM617access$convertToContainerCoordinatesQ7Q5hAU != null) {
                long f15533a2 = offsetM617access$convertToContainerCoordinatesQ7Q5hAU.getF15533a();
                selectionManager.m630updateSelection3R_tFg$foundation_release(f15533a2, f15533a2, null, false, selectionMode);
                selectionManager.getFocusRequester().requestFocus();
                selectionManager.hideSelectionToolbar$foundation_release();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class c extends Lambda implements Function1<Long, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            long jLongValue = l6.longValue();
            SelectionManager selectionManager = SelectionManager.this;
            Pair<Selection, Map<Long, Selection>> pairSelectAll$foundation_release = selectionManager.selectAll$foundation_release(jLongValue, selectionManager.getSelection());
            Selection selectionComponent1 = pairSelectAll$foundation_release.component1();
            Map<Long, Selection> mapComponent2 = pairSelectAll$foundation_release.component2();
            if (!Intrinsics.areEqual(selectionComponent1, selectionManager.getSelection())) {
                selectionManager.f6353a.setSubselections(mapComponent2);
                selectionManager.getOnSelectionChange().invoke(selectionComponent1);
            }
            selectionManager.getFocusRequester().requestFocus();
            selectionManager.hideSelectionToolbar$foundation_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class d extends Lambda implements Function5<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> {
        public d() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public final Boolean invoke(LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool, SelectionAdjustment selectionAdjustment) {
            LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
            long f15533a = offset.getF15533a();
            long f15533a2 = offset2.getF15533a();
            boolean zBooleanValue = bool.booleanValue();
            SelectionAdjustment selectionMode = selectionAdjustment;
            Intrinsics.checkNotNullParameter(layoutCoordinates2, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            SelectionManager selectionManager = SelectionManager.this;
            return Boolean.valueOf(selectionManager.m631updateSelectionRHHTvR4$foundation_release(SelectionManager.m617access$convertToContainerCoordinatesQ7Q5hAU(selectionManager, layoutCoordinates2, f15533a), SelectionManager.m617access$convertToContainerCoordinatesQ7Q5hAU(selectionManager, layoutCoordinates2, f15533a2), zBooleanValue, selectionMode));
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SelectionManager selectionManager = SelectionManager.this;
            selectionManager.showSelectionToolbar$foundation_release();
            SelectionManager.access$setDraggingHandle(selectionManager, null);
            SelectionManager.m618access$setCurrentDragPosition_kEHs6E(selectionManager, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class f extends Lambda implements Function1<Long, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            Long lValueOf = Long.valueOf(l6.longValue());
            SelectionManager selectionManager = SelectionManager.this;
            if (selectionManager.f6353a.getSubselections().containsKey(lValueOf)) {
                selectionManager.onRelease();
                selectionManager.setSelection(null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class g extends Lambda implements Function1<Long, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            Selection selection;
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            long jLongValue = l6.longValue();
            SelectionManager selectionManager = SelectionManager.this;
            Selection selection2 = selectionManager.getSelection();
            if ((selection2 != null && (start = selection2.getStart()) != null && jLongValue == start.getSelectableId()) || ((selection = selectionManager.getSelection()) != null && (end = selection.getEnd()) != null && jLongValue == end.getSelectableId())) {
                SelectionManager.m622access$setStartHandlePosition_kEHs6E(selectionManager, null);
                SelectionManager.m621access$setEndHandlePosition_kEHs6E(selectionManager, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class h extends Lambda implements Function0<Unit> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SelectionManager.this.onRelease();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class i extends Lambda implements Function1<LayoutCoordinates, Unit> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            SelectionManager.this.setContainerLayoutCoordinates(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class j extends Lambda implements Function1<FocusState, Unit> {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FocusState focusState) {
            FocusState focusState2 = focusState;
            Intrinsics.checkNotNullParameter(focusState2, "focusState");
            boolean zIsFocused = focusState2.isFocused();
            SelectionManager selectionManager = SelectionManager.this;
            if (!zIsFocused && selectionManager.getHasFocus()) {
                selectionManager.onRelease();
            }
            selectionManager.setHasFocus(focusState2.isFocused());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class k extends Lambda implements Function1<KeyEvent, Boolean> {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(KeyEvent keyEvent) {
            boolean z10;
            android.view.KeyEvent it = keyEvent.m3355unboximpl();
            Intrinsics.checkNotNullParameter(it, "it");
            if (SelectionManager_androidKt.m634isCopyKeyEventZmokQxo(it)) {
                SelectionManager.this.copy$foundation_release();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class l extends Lambda implements Function1<Selection, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f6382p0 = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionManager.kt */
    public static final class m extends Lambda implements Function0<Unit> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SelectionManager selectionManager = SelectionManager.this;
            selectionManager.copy$foundation_release();
            selectionManager.onRelease();
            return Unit.INSTANCE;
        }
    }

    public SelectionManager(@NotNull SelectionRegistrarImpl selectionRegistrar) {
        Intrinsics.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        this.f6353a = selectionRegistrar;
        this.f6354b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.touchMode = true;
        this.onSelectionChange = l.f6382p0;
        this.focusRequester = new FocusRequester();
        this.hasFocus = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = SnapshotStateKt.mutableStateOf$default(Offset.m2264boximpl(companion.m2291getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance = SnapshotStateKt.mutableStateOf$default(Offset.m2264boximpl(companion.m2291getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrar.setOnPositionChangeCallback$foundation_release(new a());
        selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new b());
        selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new c());
        selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new d());
        selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new e());
        selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new f());
        selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new g());
    }

    /* JADX INFO: renamed from: access$convertToContainerCoordinates-Q7Q5hAU, reason: not valid java name */
    public static final Offset m617access$convertToContainerCoordinatesQ7Q5hAU(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates, long j10) {
        LayoutCoordinates layoutCoordinates2 = selectionManager.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return Offset.m2264boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo3582localPositionOfR5De75A(layoutCoordinates, j10));
    }

    public static final Object access$detectNonConsumingTap(SelectionManager selectionManager, PointerInputScope pointerInputScope, Function1 function1, Continuation continuation) {
        selectionManager.getClass();
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new g0.f(function1, null), continuation);
        return objAwaitEachGesture == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: access$setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public static final void m618access$setCurrentDragPosition_kEHs6E(SelectionManager selectionManager, Offset offset) {
        selectionManager.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: renamed from: access$setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public static final void m619access$setDragBeginPositionk4lQ0M(SelectionManager selectionManager, long j10) {
        selectionManager.dragBeginPosition.setValue(Offset.m2264boximpl(j10));
    }

    /* JADX INFO: renamed from: access$setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public static final void m620access$setDragTotalDistancek4lQ0M(SelectionManager selectionManager, long j10) {
        selectionManager.dragTotalDistance.setValue(Offset.m2264boximpl(j10));
    }

    public static final void access$setDraggingHandle(SelectionManager selectionManager, Handle handle) {
        selectionManager.draggingHandle.setValue(handle);
    }

    /* JADX INFO: renamed from: access$setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public static final void m621access$setEndHandlePosition_kEHs6E(SelectionManager selectionManager, Offset offset) {
        selectionManager.endHandlePosition.setValue(offset);
    }

    /* JADX INFO: renamed from: access$setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public static final void m622access$setStartHandlePosition_kEHs6E(SelectionManager selectionManager, Offset offset) {
        selectionManager.startHandlePosition.setValue(offset);
    }

    public static final void access$updateSelectionToolbarPosition(SelectionManager selectionManager) {
        if (selectionManager.getHasFocus()) {
            TextToolbar textToolbar = selectionManager.textToolbar;
            if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Shown) {
                selectionManager.showSelectionToolbar$foundation_release();
            }
        }
    }

    public final void a() {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Selectable anchorSelectable$foundation_release = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation_release(start);
        Selectable anchorSelectable$foundation_release2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation_release(end);
        LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation_release != null ? anchorSelectable$foundation_release.getLayoutCoordinates() : null;
        LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation_release2 != null ? anchorSelectable$foundation_release2.getLayoutCoordinates() : null;
        MutableState mutableState = this.endHandlePosition;
        MutableState mutableState2 = this.startHandlePosition;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || layoutCoordinates2 == null || layoutCoordinates3 == null) {
            mutableState2.setValue(null);
            mutableState.setValue(null);
            return;
        }
        long jMo3582localPositionOfR5De75A = layoutCoordinates.mo3582localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release.mo602getHandlePositiondBAh8RU(selection, true));
        long jMo3582localPositionOfR5De75A2 = layoutCoordinates.mo3582localPositionOfR5De75A(layoutCoordinates3, anchorSelectable$foundation_release2.mo602getHandlePositiondBAh8RU(selection, false));
        Rect rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        Offset offsetM2264boximpl = Offset.m2264boximpl(jMo3582localPositionOfR5De75A);
        offsetM2264boximpl.getF15533a();
        if (!SelectionManagerKt.m633containsInclusiveUv8p0NA(rectVisibleBounds, jMo3582localPositionOfR5De75A) && getDraggingHandle() != Handle.SelectionStart) {
            offsetM2264boximpl = null;
        }
        mutableState2.setValue(offsetM2264boximpl);
        Offset offsetM2264boximpl2 = Offset.m2264boximpl(jMo3582localPositionOfR5De75A2);
        offsetM2264boximpl2.getF15533a();
        mutableState.setValue((SelectionManagerKt.m633containsInclusiveUv8p0NA(rectVisibleBounds, jMo3582localPositionOfR5De75A2) || getDraggingHandle() == Handle.SelectionEnd) ? offsetM2264boximpl2 : null);
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m624contextMenuOpenAdjustmentk4lQ0M(long position) {
        Selection selection = getSelection();
        if (selection == null || TextRange.m3961getCollapsedimpl(selection.m609toTextRanged9O1mEE())) {
            m630updateSelection3R_tFg$foundation_release(position, position, null, true, SelectionAdjustment.INSTANCE.getWord());
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
            return;
        }
        clipboardManager.setText(selectedText$foundation_release);
    }

    @Nullable
    public final Selectable getAnchorSelectable$foundation_release(@NotNull Selection.AnchorInfo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return this.f6353a.getSelectableMap$foundation_release().get(Long.valueOf(anchor.getSelectableId()));
    }

    @Nullable
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Nullable
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m625getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m626getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition.getValue()).getF15533a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m627getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance.getValue()).getF15533a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m628getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition.getValue();
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @NotNull
    public final Modifier getModifier() {
        Modifier modifierSelectionMagnifier = Modifier.INSTANCE;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifierSelectionMagnifier, Unit.INSTANCE, new g0.g(this, new h(), null)) : modifierSelectionMagnifier, new i()), this.focusRequester), new j()), false, null, 3, null), new k());
        if (getDraggingHandle() != null) {
            modifierSelectionMagnifier = SelectionManager_androidKt.selectionMagnifier(modifierSelectionMagnifier, this);
        }
        return modifierOnKeyEvent.then(modifierSelectionMagnifier);
    }

    @NotNull
    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    @Nullable
    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString annotatedStringPlus;
        List<Selectable> listSort = this.f6353a.sort(requireContainerCoordinates$foundation_release());
        Selection selection = getSelection();
        AnnotatedString annotatedString = null;
        if (selection == null) {
            return null;
        }
        int size = listSort.size();
        for (int i10 = 0; i10 < size; i10++) {
            Selectable selectable = listSort.get(i10);
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                AnnotatedString currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                if (annotatedString != null && (annotatedStringPlus = annotatedString.plus(currentSelectedText)) != null) {
                    currentSelectedText = annotatedStringPlus;
                }
                if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                    return currentSelectedText;
                }
                annotatedString = currentSelectedText;
            }
        }
        return annotatedString;
    }

    @Nullable
    public final Selection getSelection() {
        return this.f6354b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m629getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition.getValue();
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTouchMode() {
        return this.touchMode;
    }

    @NotNull
    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager.handleDragObserver.1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.showSelectionToolbar$foundation_release();
                SelectionManager.access$setDraggingHandle(selectionManager, null);
                SelectionManager.m618access$setCurrentDragPosition_kEHs6E(selectionManager, null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo538onDownk4lQ0M(long point) {
                LayoutCoordinates layoutCoordinates;
                SelectionManager selectionManager = SelectionManager.this;
                Selection selection = selectionManager.getSelection();
                if (selection == null) {
                    return;
                }
                boolean z10 = isStartHandle;
                Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(z10 ? selection.getStart() : selection.getEnd());
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                SelectionManager.m618access$setCurrentDragPosition_kEHs6E(selectionManager, Offset.m2264boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo3582localPositionOfR5De75A(layoutCoordinates, SelectionHandlesKt.m616getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.mo602getHandlePositiondBAh8RU(selection, z10)))));
                SelectionManager.access$setDraggingHandle(selectionManager, z10 ? Handle.SelectionStart : Handle.SelectionEnd);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo539onDragk4lQ0M(long delta) {
                SelectionManager selectionManager = SelectionManager.this;
                SelectionManager.m620access$setDragTotalDistancek4lQ0M(selectionManager, Offset.m2280plusMKHz9U(selectionManager.m627getDragTotalDistanceF1C5BW0$foundation_release(), delta));
                long jM2280plusMKHz9U = Offset.m2280plusMKHz9U(selectionManager.m626getDragBeginPositionF1C5BW0$foundation_release(), selectionManager.m627getDragTotalDistanceF1C5BW0$foundation_release());
                if (selectionManager.m631updateSelectionRHHTvR4$foundation_release(Offset.m2264boximpl(jM2280plusMKHz9U), Offset.m2264boximpl(selectionManager.m626getDragBeginPositionF1C5BW0$foundation_release()), isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                    SelectionManager.m619access$setDragBeginPositionk4lQ0M(selectionManager, jM2280plusMKHz9U);
                    SelectionManager.m620access$setDragTotalDistancek4lQ0M(selectionManager, Offset.INSTANCE.m2291getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo540onStartk4lQ0M(long startPoint) {
                LayoutCoordinates layoutCoordinates;
                long jMo602getHandlePositiondBAh8RU;
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.hideSelectionToolbar$foundation_release();
                Selection selection = selectionManager.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = selectionManager.f6353a.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = selectionManager.f6353a.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                boolean z10 = isStartHandle;
                if (z10) {
                    layoutCoordinates = selectable != null ? selectable.getLayoutCoordinates() : null;
                    Intrinsics.checkNotNull(layoutCoordinates);
                } else {
                    layoutCoordinates = selectable2 != null ? selectable2.getLayoutCoordinates() : null;
                    Intrinsics.checkNotNull(layoutCoordinates);
                }
                if (z10) {
                    Intrinsics.checkNotNull(selectable);
                    jMo602getHandlePositiondBAh8RU = selectable.mo602getHandlePositiondBAh8RU(selection, true);
                } else {
                    Intrinsics.checkNotNull(selectable2);
                    jMo602getHandlePositiondBAh8RU = selectable2.mo602getHandlePositiondBAh8RU(selection, false);
                }
                SelectionManager.m619access$setDragBeginPositionk4lQ0M(selectionManager, selectionManager.requireContainerCoordinates$foundation_release().mo3582localPositionOfR5De75A(layoutCoordinates, SelectionHandlesKt.m616getAdjustedCoordinatesk4lQ0M(jMo602getHandlePositiondBAh8RU)));
                SelectionManager.m620access$setDragTotalDistancek4lQ0M(selectionManager, Offset.INSTANCE.m2291getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.showSelectionToolbar$foundation_release();
                SelectionManager.access$setDraggingHandle(selectionManager, null);
                SelectionManager.m618access$setCurrentDragPosition_kEHs6E(selectionManager, null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                SelectionManager selectionManager = SelectionManager.this;
                SelectionManager.access$setDraggingHandle(selectionManager, null);
                SelectionManager.m618access$setCurrentDragPosition_kEHs6E(selectionManager, null);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
                return;
            }
            textToolbar.hide();
        }
    }

    public final void onRelease() {
        this.f6353a.setSubselections(q.emptyMap());
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3031performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3040getTextHandleMove5zf0vsI());
            }
        }
    }

    @NotNull
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    public final Pair<Selection, Map<Long, Selection>> selectAll$foundation_release(long selectableId, @Nullable Selection previousSelection) {
        HapticFeedback hapticFeedback;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> listSort = this.f6353a.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        Selection selectionMerge = null;
        for (int i10 = 0; i10 < size; i10++) {
            Selectable selectable = listSort.get(i10);
            Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectAllSelection);
            }
            selectionMerge = SelectionManagerKt.merge(selectionMerge, selectAllSelection);
        }
        if (!Intrinsics.areEqual(selectionMerge, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo3031performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3040getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selectionMerge, linkedHashMap);
    }

    public final void setClipboardManager(@Nullable ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setContainerLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset offsetM2264boximpl = layoutCoordinates != null ? Offset.m2264boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (Intrinsics.areEqual(this.f6362j, offsetM2264boximpl)) {
            return;
        }
        this.f6362j = offsetM2264boximpl;
        a();
        if (getHasFocus()) {
            TextToolbar textToolbar = this.textToolbar;
            if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    public final void setFocusRequester(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z10) {
        this.hasFocus.setValue(Boolean.valueOf(z10));
    }

    public final void setOnSelectionChange(@NotNull Function1<? super Selection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSelectionChange = function1;
    }

    public final void setSelection(@Nullable Selection selection) {
        this.f6354b.setValue(selection);
        if (selection != null) {
            a();
        }
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setTouchMode(boolean z10) {
        this.touchMode = z10;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        Rect zero;
        Rect rect;
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        if (!getHasFocus() || getSelection() == null || (textToolbar = this.textToolbar) == null) {
            return;
        }
        Selection selection = getSelection();
        if (selection == null) {
            rect = Rect.INSTANCE.getZero();
            textToolbar = textToolbar;
        } else {
            Selectable anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
            Selectable anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
            if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                zero = Rect.INSTANCE.getZero();
            } else if (anchorSelectable$foundation_release2 == null || (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) == null) {
                zero = Rect.INSTANCE.getZero();
            } else {
                LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
                if (layoutCoordinates3 == null || !layoutCoordinates3.isAttached()) {
                    zero = Rect.INSTANCE.getZero();
                } else {
                    long jMo3582localPositionOfR5De75A = layoutCoordinates3.mo3582localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo602getHandlePositiondBAh8RU(selection, true));
                    long jMo3582localPositionOfR5De75A2 = layoutCoordinates3.mo3582localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo602getHandlePositiondBAh8RU(selection, false));
                    long jMo3583localToRootMKHz9U = layoutCoordinates3.mo3583localToRootMKHz9U(jMo3582localPositionOfR5De75A);
                    long jMo3583localToRootMKHz9U2 = layoutCoordinates3.mo3583localToRootMKHz9U(jMo3582localPositionOfR5De75A2);
                    textToolbar = textToolbar;
                    rect = new Rect(Math.min(Offset.m2275getXimpl(jMo3583localToRootMKHz9U), Offset.m2275getXimpl(jMo3583localToRootMKHz9U2)), Math.min(Offset.m2276getYimpl(layoutCoordinates3.mo3583localToRootMKHz9U(layoutCoordinates3.mo3582localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m2276getYimpl(layoutCoordinates3.mo3583localToRootMKHz9U(layoutCoordinates3.mo3582localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m2275getXimpl(jMo3583localToRootMKHz9U), Offset.m2275getXimpl(jMo3583localToRootMKHz9U2)), Math.max(Offset.m2276getYimpl(jMo3583localToRootMKHz9U), Offset.m2276getYimpl(jMo3583localToRootMKHz9U2)) + ((float) (((double) SelectionHandlesKt.getHandleHeight()) * 4.0d)));
                }
            }
            rect = zero;
        }
        c1.a(textToolbar, rect, new m(), null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: updateSelection-3R_-tFg$foundation_release, reason: not valid java name */
    public final boolean m630updateSelection3R_tFg$foundation_release(long startHandlePosition, long endHandlePosition, @Nullable Offset previousHandlePosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        this.draggingHandle.setValue(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
        this.currentDragPosition.setValue(isStartHandle ? Offset.m2264boximpl(startHandlePosition) : Offset.m2264boximpl(endHandlePosition));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LayoutCoordinates layoutCoordinatesRequireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        SelectionRegistrarImpl selectionRegistrarImpl = this.f6353a;
        List<Selectable> listSort = selectionRegistrarImpl.sort(layoutCoordinatesRequireContainerCoordinates$foundation_release);
        int size = listSort.size();
        Selection selectionMerge = null;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            Selectable selectable = listSort.get(i10);
            int i11 = i10;
            Selection selection = selectionMerge;
            Pair<Selection, Boolean> pairMo604updateSelectionqCDeeow = selectable.mo604updateSelectionqCDeeow(startHandlePosition, endHandlePosition, previousHandlePosition, isStartHandle, requireContainerCoordinates$foundation_release(), adjustment, selectionRegistrarImpl.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection selectionComponent1 = pairMo604updateSelectionqCDeeow.component1();
            z10 = z10 || pairMo604updateSelectionqCDeeow.component2().booleanValue();
            if (selectionComponent1 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectionComponent1);
            }
            selectionMerge = SelectionManagerKt.merge(selection, selectionComponent1);
            i10 = i11 + 1;
        }
        Selection selection2 = selectionMerge;
        if (!Intrinsics.areEqual(selection2, getSelection())) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3031performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3040getTextHandleMove5zf0vsI());
            }
            selectionRegistrarImpl.setSubselections(linkedHashMap);
            this.onSelectionChange.invoke(selection2);
        }
        return z10;
    }

    /* JADX INFO: renamed from: updateSelection-RHHTvR4$foundation_release, reason: not valid java name */
    public final boolean m631updateSelectionRHHTvR4$foundation_release(@Nullable Offset newPosition, @Nullable Offset previousPosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment) {
        Selection selection;
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (newPosition == null || (selection = getSelection()) == null) {
            return false;
        }
        Selectable selectable = this.f6353a.getSelectableMap$foundation_release().get(Long.valueOf(isStartHandle ? selection.getEnd().getSelectableId() : selection.getStart().getSelectableId()));
        Offset offsetM2264boximpl = null;
        if (selectable != null) {
            LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
            Intrinsics.checkNotNull(layoutCoordinates);
            long jM616getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m616getAdjustedCoordinatesk4lQ0M(selectable.mo602getHandlePositiondBAh8RU(selection, !isStartHandle));
            LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
            if (layoutCoordinates2 != null && layoutCoordinates2.isAttached()) {
                offsetM2264boximpl = Offset.m2264boximpl(requireContainerCoordinates$foundation_release().mo3582localPositionOfR5De75A(layoutCoordinates, jM616getAdjustedCoordinatesk4lQ0M));
            }
        }
        if (offsetM2264boximpl == null) {
            return false;
        }
        long f15533a = offsetM2264boximpl.getF15533a();
        long f15533a2 = isStartHandle ? newPosition.getF15533a() : f15533a;
        if (!isStartHandle) {
            f15533a = newPosition.getF15533a();
        }
        return m630updateSelection3R_tFg$foundation_release(f15533a2, f15533a, previousPosition, isStartHandle, adjustment);
    }
}
