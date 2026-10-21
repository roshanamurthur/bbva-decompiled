package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000102¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\rJ \u0010\"\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J \u0010'\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010\rJ\u000f\u0010+\u001a\u00020\u000bH\u0000¢\u0006\u0004\b*\u0010\rJ\u001b\u0010.\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u000f\u00101\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100R\u0019\u00107\u001a\u0004\u0018\u0001028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R.\u0010H\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u000b0@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010P\u001a\u0004\u0018\u00010I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR+\u0010X\u001a\u00020A2\u0006\u0010Q\u001a\u00020A8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010h\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010p\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010x\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR%\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR/\u0010\u0084\u0001\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010S\u001a\u0005\b\u0082\u0001\u00100\"\u0005\b\u0083\u0001\u0010\u0018R7\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0085\u00012\t\u0010Q\u001a\u0005\u0018\u00010\u0085\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0086\u0001\u0010S\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R=\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010Q\u001a\u0004\u0018\u00010\u00118F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0016\n\u0005\b\u008c\u0001\u0010S\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u0010\u0014R\u001e\u0010\u0094\u0001\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010\tR \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u009d\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "cursorDragObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver", "", "enterSelectionMode$foundation_release", "()V", "enterSelectionMode", "exitSelectionMode$foundation_release", "exitSelectionMode", "Landroidx/compose/ui/geometry/Offset;", "position", "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "cancelSelection", "copy$foundation_release", "(Z)V", "copy", "paste$foundation_release", "paste", "cut$foundation_release", "cut", "selectAll$foundation_release", "selectAll", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "Landroidx/compose/ui/unit/Density;", "density", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "isTextChanged$foundation_release", "()Z", "isTextChanged", "Landroidx/compose/foundation/text/UndoManager;", "a", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/ui/text/input/OffsetMapping;", "b", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "offsetMapping", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "c", "Lkotlin/jvm/functions/Function1;", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "Landroidx/compose/foundation/text/TextFieldState;", "d", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "state", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value", "Landroidx/compose/ui/text/input/VisualTransformation;", "f", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "visualTransformation", "Landroidx/compose/ui/platform/ClipboardManager;", "g", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/TextToolbar;", "h", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "textToolbar", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "i", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/FocusRequester;", "j", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", "k", "getEditable", "setEditable", "editable", "Landroidx/compose/foundation/text/Handle;", "o", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "p", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "r", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "touchSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "s", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n81#2:907\n107#2,2:908\n81#2:910\n107#2,2:911\n81#2:913\n107#2,2:914\n81#2:916\n107#2,2:917\n1#3:919\n154#4:920\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n86#1:907\n86#1:908,2\n117#1:910\n117#1:911,2\n147#1:913\n147#1:914,2\n150#1:916\n150#1:917,2\n737#1:920\n*E\n"})
public final class TextFieldSelectionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UndoManager undoManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public OffsetMapping offsetMapping;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super TextFieldValue, Unit> onValueChange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextFieldState state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState value;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public VisualTransformation visualTransformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ClipboardManager clipboardManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextToolbar textToolbar;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public HapticFeedback hapticFeedBack;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public FocusRequester focusRequester;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState editable;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6420l;

    @Nullable
    public Integer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState draggingHandle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState currentDragPosition;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public TextFieldValue f6424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final TextFieldSelectionManager$touchSelectionObserver$1 f6425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final TextFieldSelectionManager$mouseSelectionObserver$1 f6426s;

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class a extends Lambda implements Function1<TextFieldValue, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6427p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextFieldValue textFieldValue) {
            TextFieldValue it = textFieldValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            TextFieldSelectionManager.copy$foundation_release$default(textFieldSelectionManager, false, 1, null);
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.cut$foundation_release();
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.paste$foundation_release();
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TextFieldSelectionManager.this.selectAll$foundation_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static TextFieldValue a(AnnotatedString annotatedString, long j10) {
        return new TextFieldValue(annotatedString, j10, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: access$createTextFieldValue-FDrldGo, reason: not valid java name */
    public static final /* synthetic */ TextFieldValue m640access$createTextFieldValueFDrldGo(TextFieldSelectionManager textFieldSelectionManager, AnnotatedString annotatedString, long j10) {
        textFieldSelectionManager.getClass();
        return a(annotatedString, j10);
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        textFieldSelectionManager.copy$foundation_release(z10);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m642deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m644deselect_kEHs6E$foundation_release(offset);
    }

    public final void b(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    public final void c(TextFieldValue textFieldValue, int i10, int i11, boolean z10, SelectionAdjustment selectionAdjustment) {
        TextLayoutResultProxy layoutResult;
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m3967getStartimpl(textFieldValue.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m3962getEndimpl(textFieldValue.getSelection())));
        TextFieldState textFieldState = this.state;
        long jM639getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m639getTextFieldSelectionbb3KNj8((textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) ? null : layoutResult.getValue(), i10, i11, TextRange.m3961getCollapsedimpl(jTextRange) ? null : TextRange.m3955boximpl(jTextRange), z10, selectionAdjustment);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m3967getStartimpl(jM639getTextFieldSelectionbb3KNj8)), this.offsetMapping.transformedToOriginal(TextRange.m3962getEndimpl(jM639getTextFieldSelectionbb3KNj8)));
        if (TextRange.m3960equalsimpl0(jTextRange2, textFieldValue.getSelection())) {
            return;
        }
        HapticFeedback hapticFeedback = this.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo3031performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3040getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(a(textFieldValue.getAnnotatedString(), jTextRange2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m643contextMenuOpenAdjustmentk4lQ0M(long position) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) {
            return;
        }
        int iM559getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m559getOffsetForPosition3MmeM6k$default(layoutResult, position, false, 2, null);
        if (TextRange.m3958containsimpl(getValue$foundation_release().getSelection(), iM559getOffsetForPosition3MmeM6k$default)) {
            return;
        }
        c(getValue$foundation_release(), iM559getOffsetForPosition3MmeM6k$default, iM559getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord());
    }

    public final void copy$foundation_release(boolean cancelSelection) {
        if (TextRange.m3961getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (cancelSelection) {
            int iM3964getMaximpl = TextRange.m3964getMaximpl(getValue$foundation_release().getSelection());
            this.onValueChange.invoke(a(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iM3964getMaximpl, iM3964getMaximpl)));
            b(HandleState.None);
        }
    }

    @NotNull
    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo538onDownk4lQ0M(long point) {
                Handle handle = Handle.Cursor;
                TextFieldSelectionManager textFieldSelectionManager = this.f6430a;
                textFieldSelectionManager.draggingHandle.setValue(handle);
                textFieldSelectionManager.currentDragPosition.setValue(Offset.m2264boximpl(SelectionHandlesKt.m616getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m647getHandlePositiontuRUvjQ$foundation_release(true))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo539onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                TextFieldSelectionManager textFieldSelectionManager = this.f6430a;
                textFieldSelectionManager.f6421n = Offset.m2280plusMKHz9U(textFieldSelectionManager.f6421n, delta);
                TextFieldState state = textFieldSelectionManager.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
                    return;
                }
                textFieldSelectionManager.currentDragPosition.setValue(Offset.m2264boximpl(Offset.m2280plusMKHz9U(textFieldSelectionManager.f6420l, textFieldSelectionManager.f6421n)));
                OffsetMapping offsetMapping = textFieldSelectionManager.getOffsetMapping();
                Offset offsetM645getCurrentDragPosition_m7T9E = textFieldSelectionManager.m645getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM645getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping.transformedToOriginal(value.m3940getOffsetForPositionk4lQ0M(offsetM645getCurrentDragPosition_m7T9E.getF15533a()));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m3960equalsimpl0(jTextRange, textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    return;
                }
                HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.mo3031performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3040getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager.getOnValueChange$foundation_release().invoke(TextFieldSelectionManager.m640access$createTextFieldValueFDrldGo(textFieldSelectionManager, textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo540onStartk4lQ0M(long startPoint) {
                TextFieldSelectionManager textFieldSelectionManager = this.f6430a;
                textFieldSelectionManager.f6420l = SelectionHandlesKt.m616getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m647getHandlePositiontuRUvjQ$foundation_release(true));
                textFieldSelectionManager.currentDragPosition.setValue(Offset.m2264boximpl(textFieldSelectionManager.f6420l));
                textFieldSelectionManager.f6421n = Offset.INSTANCE.m2291getZeroF1C5BW0();
                textFieldSelectionManager.draggingHandle.setValue(Handle.Cursor);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager textFieldSelectionManager = this.f6430a;
                textFieldSelectionManager.draggingHandle.setValue(null);
                textFieldSelectionManager.currentDragPosition.setValue(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager textFieldSelectionManager = this.f6430a;
                textFieldSelectionManager.draggingHandle.setValue(null);
                textFieldSelectionManager.currentDragPosition.setValue(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }
        };
    }

    public final void cut$foundation_release() {
        if (TextRange.m3961getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM3965getMinimpl = TextRange.m3965getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(a(annotatedStringPlus, TextRangeKt.TextRange(iM3965getMinimpl, iM3965getMinimpl)));
        b(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m644deselect_kEHs6E$foundation_release(@Nullable Offset position) {
        if (!TextRange.m3961getCollapsedimpl(getValue$foundation_release().getSelection())) {
            TextFieldState textFieldState = this.state;
            TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
            this.onValueChange.invoke(TextFieldValue.m4171copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange((position == null || layoutResult == null) ? TextRange.m3964getMaximpl(getValue$foundation_release().getSelection()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m559getOffsetForPosition3MmeM6k$default(layoutResult, position.getF15533a(), false, 2, null))), (TextRange) null, 5, (Object) null));
        }
        b((position == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        hideSelectionToolbar$foundation_release();
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && !textFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.f6424q = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        b(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        b(HandleState.None);
    }

    @Nullable
    /* JADX INFO: renamed from: getClipboardManager$foundation_release, reason: from getter */
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m645getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* JADX INFO: renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m646getCursorPositiontuRUvjQ$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m3967getStartimpl(getValue$foundation_release().getSelection()));
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(kotlin.ranges.c.coerceIn(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset((density.mo415toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2) + cursorRect.getLeft(), cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    @Nullable
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m647getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        long selection = getValue$foundation_release().getSelection();
        int iM3967getStartimpl = isStartHandle ? TextRange.m3967getStartimpl(selection) : TextRange.m3962getEndimpl(selection);
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult.getValue(), this.offsetMapping.originalToTransformed(iM3967getStartimpl), isStartHandle, TextRange.m3966getReversedimpl(getValue$foundation_release().getSelection()));
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @NotNull
    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.f6426s;
    }

    @NotNull
    /* JADX INFO: renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    @Nullable
    /* JADX INFO: renamed from: getState$foundation_release, reason: from getter */
    public final TextFieldState getState() {
        return this.state;
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @NotNull
    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.f6425r;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getVisualTransformation$foundation_release, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    @NotNull
    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo538onDownk4lQ0M(long point) {
                boolean z10 = isStartHandle;
                Handle handle = z10 ? Handle.SelectionStart : Handle.SelectionEnd;
                TextFieldSelectionManager textFieldSelectionManager = this.f6433a;
                textFieldSelectionManager.draggingHandle.setValue(handle);
                textFieldSelectionManager.currentDragPosition.setValue(Offset.m2264boximpl(SelectionHandlesKt.m616getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m647getHandlePositiontuRUvjQ$foundation_release(z10))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo539onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                int iOriginalToTransformed;
                int iM3940getOffsetForPositionk4lQ0M;
                TextFieldSelectionManager textFieldSelectionManager = this.f6433a;
                textFieldSelectionManager.f6421n = Offset.m2280plusMKHz9U(textFieldSelectionManager.f6421n, delta);
                TextFieldState state = textFieldSelectionManager.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    boolean z10 = isStartHandle;
                    textFieldSelectionManager.currentDragPosition.setValue(Offset.m2264boximpl(Offset.m2280plusMKHz9U(textFieldSelectionManager.f6420l, textFieldSelectionManager.f6421n)));
                    if (z10) {
                        Offset offsetM645getCurrentDragPosition_m7T9E = textFieldSelectionManager.m645getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(offsetM645getCurrentDragPosition_m7T9E);
                        iOriginalToTransformed = value.m3940getOffsetForPositionk4lQ0M(offsetM645getCurrentDragPosition_m7T9E.getF15533a());
                    } else {
                        iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3967getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    }
                    int i10 = iOriginalToTransformed;
                    if (z10) {
                        iM3940getOffsetForPositionk4lQ0M = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3962getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    } else {
                        Offset offsetM645getCurrentDragPosition_m7T9E2 = textFieldSelectionManager.m645getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(offsetM645getCurrentDragPosition_m7T9E2);
                        iM3940getOffsetForPositionk4lQ0M = value.m3940getOffsetForPositionk4lQ0M(offsetM645getCurrentDragPosition_m7T9E2.getF15533a());
                    }
                    textFieldSelectionManager.c(textFieldSelectionManager.getValue$foundation_release(), i10, iM3940getOffsetForPositionk4lQ0M, z10, SelectionAdjustment.INSTANCE.getCharacter());
                }
                TextFieldState state2 = textFieldSelectionManager.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo540onStartk4lQ0M(long startPoint) {
                TextFieldSelectionManager textFieldSelectionManager = this.f6433a;
                boolean z10 = isStartHandle;
                textFieldSelectionManager.f6420l = SelectionHandlesKt.m616getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m647getHandlePositiontuRUvjQ$foundation_release(z10));
                textFieldSelectionManager.currentDragPosition.setValue(Offset.m2264boximpl(textFieldSelectionManager.f6420l));
                textFieldSelectionManager.f6421n = Offset.INSTANCE.m2291getZeroF1C5BW0();
                textFieldSelectionManager.draggingHandle.setValue(z10 ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldState state = textFieldSelectionManager.getState();
                if (state == null) {
                    return;
                }
                state.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager textFieldSelectionManager = this.f6433a;
                textFieldSelectionManager.draggingHandle.setValue(null);
                textFieldSelectionManager.currentDragPosition.setValue(null);
                TextFieldState state = textFieldSelectionManager.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = textFieldSelectionManager.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    textFieldSelectionManager.showSelectionToolbar$foundation_release();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager textFieldSelectionManager = this.f6433a;
                textFieldSelectionManager.draggingHandle.setValue(null);
                textFieldSelectionManager.currentDragPosition.setValue(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.f6424q.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int length = text.length() + TextRange.m3965getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(a(annotatedStringPlus, TextRangeKt.TextRange(length, length)));
        b(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueA = a(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueA);
        this.f6424q = TextFieldValue.m4171copy3r_uNRQ$default(this.f6424q, (AnnotatedString) null, textFieldValueA.getSelection(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return;
        }
        textFieldState.setShowFloatingToolbar(true);
    }

    public final void setClipboardManager$foundation_release(@Nullable ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setEditable(boolean z10) {
        this.editable.setValue(Boolean.valueOf(z10));
    }

    public final void setFocusRequester(@Nullable FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(@NotNull OffsetMapping offsetMapping) {
        Intrinsics.checkNotNullParameter(offsetMapping, "<set-?>");
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(@NotNull Function1<? super TextFieldValue, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChange = function1;
    }

    public final void setState$foundation_release(@Nullable TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(@NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
        this.value.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(@NotNull VisualTransformation visualTransformation) {
        Intrinsics.checkNotNullParameter(visualTransformation, "<set-?>");
        this.visualTransformation = visualTransformation;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    public final void showSelectionToolbar$foundation_release() {
        Rect zero;
        float fM2276getYimpl;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        ClipboardManager clipboardManager;
        boolean z10 = this.visualTransformation instanceof PasswordVisualTransformation;
        b bVar = (TextRange.m3961getCollapsedimpl(getValue$foundation_release().getSelection()) || z10) ? null : new b();
        c cVar = (TextRange.m3961getCollapsedimpl(getValue$foundation_release().getSelection()) || !getEditable() || z10) ? null : new c();
        d dVar = (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) ? new d() : null;
        e eVar = TextRange.m3963getLengthimpl(getValue$foundation_release().getSelection()) != getValue$foundation_release().getText().length() ? new e() : null;
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar != null) {
            TextFieldState textFieldState = this.state;
            if (textFieldState == null) {
                cVar = cVar;
                eVar = eVar;
                zero = Rect.INSTANCE.getZero();
            } else {
                TextFieldState textFieldState2 = textFieldState.getIsLayoutResultStale() ^ true ? textFieldState : null;
                if (textFieldState2 != null) {
                    int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m3967getStartimpl(getValue$foundation_release().getSelection()));
                    int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m3962getEndimpl(getValue$foundation_release().getSelection()));
                    TextFieldState textFieldState3 = this.state;
                    long jM2291getZeroF1C5BW0 = (textFieldState3 == null || (layoutCoordinates4 = textFieldState3.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m2291getZeroF1C5BW0() : layoutCoordinates4.mo3583localToRootMKHz9U(m647getHandlePositiontuRUvjQ$foundation_release(true));
                    TextFieldState textFieldState4 = this.state;
                    long jM2291getZeroF1C5BW1 = (textFieldState4 == null || (layoutCoordinates3 = textFieldState4.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m2291getZeroF1C5BW0() : layoutCoordinates3.mo3583localToRootMKHz9U(m647getHandlePositiontuRUvjQ$foundation_release(false));
                    TextFieldState textFieldState5 = this.state;
                    float fM2276getYimpl2 = 0.0f;
                    if (textFieldState5 == null || (layoutCoordinates2 = textFieldState5.getLayoutCoordinates()) == null) {
                        cVar = cVar;
                        eVar = eVar;
                        fM2276getYimpl = 0.0f;
                    } else {
                        TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                        fM2276getYimpl = Offset.m2276getYimpl(layoutCoordinates2.mo3583localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                    }
                    TextFieldState textFieldState6 = this.state;
                    if (textFieldState6 != null && (layoutCoordinates = textFieldState6.getLayoutCoordinates()) != null) {
                        TextLayoutResultProxy layoutResult2 = textFieldState2.getLayoutResult();
                        fM2276getYimpl2 = Offset.m2276getYimpl(layoutCoordinates.mo3583localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                    }
                    zero = new Rect(Math.min(Offset.m2275getXimpl(jM2291getZeroF1C5BW0), Offset.m2275getXimpl(jM2291getZeroF1C5BW1)), Math.min(fM2276getYimpl, fM2276getYimpl2), Math.max(Offset.m2275getXimpl(jM2291getZeroF1C5BW0), Offset.m2275getXimpl(jM2291getZeroF1C5BW1)), (textFieldState2.getTextDelegate().getDensity().getDensity() * Dp.m4389constructorimpl(25)) + Math.max(Offset.m2276getYimpl(jM2291getZeroF1C5BW0), Offset.m2276getYimpl(jM2291getZeroF1C5BW1)));
                } else {
                    cVar = cVar;
                    eVar = eVar;
                    zero = Rect.INSTANCE.getZero();
                }
            }
            textToolbar.showMenu(zero, bVar, dVar, cVar, eVar);
        }
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1] */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1] */
    public TextFieldSelectionManager(@Nullable UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = a.f6427p0;
        this.value = SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        this.editable = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.f6420l = companion.m2291getZeroF1C5BW0();
        this.f6421n = companion.m2291getZeroF1C5BW0();
        this.draggingHandle = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f6424q = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.f6425r = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo539onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                TextFieldSelectionManager textFieldSelectionManager = this.f6436a;
                if (textFieldSelectionManager.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                textFieldSelectionManager.f6421n = Offset.m2280plusMKHz9U(textFieldSelectionManager.f6421n, delta);
                TextFieldState state = textFieldSelectionManager.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null) {
                    textFieldSelectionManager.currentDragPosition.setValue(Offset.m2264boximpl(Offset.m2280plusMKHz9U(textFieldSelectionManager.f6420l, textFieldSelectionManager.f6421n)));
                    Integer num = textFieldSelectionManager.m;
                    int iIntValue = num != null ? num.intValue() : layoutResult.m560getOffsetForPosition3MmeM6k(textFieldSelectionManager.f6420l, false);
                    Offset offsetM645getCurrentDragPosition_m7T9E = textFieldSelectionManager.m645getCurrentDragPosition_m7T9E();
                    Intrinsics.checkNotNull(offsetM645getCurrentDragPosition_m7T9E);
                    textFieldSelectionManager.c(textFieldSelectionManager.getValue$foundation_release(), iIntValue, layoutResult.m560getOffsetForPosition3MmeM6k(offsetM645getCurrentDragPosition_m7T9E.getF15533a(), false), false, SelectionAdjustment.INSTANCE.getWord());
                }
                TextFieldState state2 = textFieldSelectionManager.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo540onStartk4lQ0M(long startPoint) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                TextLayoutResultProxy layoutResult3;
                TextFieldSelectionManager textFieldSelectionManager = this.f6436a;
                if (textFieldSelectionManager.getDraggingHandle() != null) {
                    return;
                }
                textFieldSelectionManager.draggingHandle.setValue(Handle.SelectionEnd);
                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                TextFieldState state2 = textFieldSelectionManager.getState();
                if ((state2 == null || (layoutResult3 = state2.getLayoutResult()) == null || !layoutResult3.m561isPositionOnTextk4lQ0M(startPoint)) && (state = textFieldSelectionManager.getState()) != null && (layoutResult = state.getLayoutResult()) != null) {
                    int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult, layoutResult.getLineForVerticalPosition(Offset.m2276getYimpl(startPoint)), false, 2, null));
                    HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo3031performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m3040getTextHandleMove5zf0vsI());
                    }
                    TextFieldValue textFieldValueM640access$createTextFieldValueFDrldGo = TextFieldSelectionManager.m640access$createTextFieldValueFDrldGo(textFieldSelectionManager, textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                    textFieldSelectionManager.enterSelectionMode$foundation_release();
                    textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM640access$createTextFieldValueFDrldGo);
                    return;
                }
                if (textFieldSelectionManager.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                textFieldSelectionManager.enterSelectionMode$foundation_release();
                TextFieldState state3 = textFieldSelectionManager.getState();
                if (state3 != null && (layoutResult2 = state3.getLayoutResult()) != null) {
                    int iM559getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m559getOffsetForPosition3MmeM6k$default(layoutResult2, startPoint, false, 2, null);
                    textFieldSelectionManager.c(textFieldSelectionManager.getValue$foundation_release(), iM559getOffsetForPosition3MmeM6k$default, iM559getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord());
                    textFieldSelectionManager.m = Integer.valueOf(iM559getOffsetForPosition3MmeM6k$default);
                }
                textFieldSelectionManager.f6420l = startPoint;
                textFieldSelectionManager.currentDragPosition.setValue(Offset.m2264boximpl(textFieldSelectionManager.f6420l));
                textFieldSelectionManager.f6421n = Offset.INSTANCE.m2291getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager textFieldSelectionManager = this.f6436a;
                textFieldSelectionManager.draggingHandle.setValue(null);
                textFieldSelectionManager.currentDragPosition.setValue(null);
                TextFieldState state = textFieldSelectionManager.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = textFieldSelectionManager.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    textFieldSelectionManager.showSelectionToolbar$foundation_release();
                }
                textFieldSelectionManager.m = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo538onDownk4lQ0M(long point) {
            }
        };
        this.f6426s = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onDrag-3MmeM6k */
            public boolean mo589onDrag3MmeM6k(long dragPosition, @NotNull SelectionAdjustment adjustment) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                TextFieldSelectionManager textFieldSelectionManager = this.f6435a;
                if (textFieldSelectionManager.getValue$foundation_release().getText().length() == 0 || (state = textFieldSelectionManager.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                int iM560getOffsetForPosition3MmeM6k = layoutResult.m560getOffsetForPosition3MmeM6k(dragPosition, false);
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                Integer num = textFieldSelectionManager.m;
                Intrinsics.checkNotNull(num);
                textFieldSelectionManager.c(value$foundation_release, num.intValue(), iM560getOffsetForPosition3MmeM6k, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtend-k-4lQ0M */
            public boolean mo590onExtendk4lQ0M(long downPosition) {
                TextLayoutResultProxy layoutResult;
                TextFieldSelectionManager textFieldSelectionManager = this.f6435a;
                TextFieldState state = textFieldSelectionManager.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                textFieldSelectionManager.c(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3967getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())), TextLayoutResultProxy.m559getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null), false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo591onExtendDragk4lQ0M(long dragPosition) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                TextFieldSelectionManager textFieldSelectionManager = this.f6435a;
                if (textFieldSelectionManager.getValue$foundation_release().getText().length() == 0 || (state = textFieldSelectionManager.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                textFieldSelectionManager.c(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3967getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())), layoutResult.m560getOffsetForPosition3MmeM6k(dragPosition, false), false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onStart-3MmeM6k */
            public boolean mo592onStart3MmeM6k(long downPosition, @NotNull SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                TextFieldSelectionManager textFieldSelectionManager = this.f6435a;
                FocusRequester focusRequester = textFieldSelectionManager.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                textFieldSelectionManager.f6420l = downPosition;
                TextFieldState state = textFieldSelectionManager.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                textFieldSelectionManager.m = Integer.valueOf(TextLayoutResultProxy.m559getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null));
                int iM559getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m559getOffsetForPosition3MmeM6k$default(layoutResult, textFieldSelectionManager.f6420l, false, 2, null);
                textFieldSelectionManager.c(textFieldSelectionManager.getValue$foundation_release(), iM559getOffsetForPosition3MmeM6k$default, iM559getOffsetForPosition3MmeM6k$default, false, adjustment);
                return true;
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : undoManager);
    }
}
