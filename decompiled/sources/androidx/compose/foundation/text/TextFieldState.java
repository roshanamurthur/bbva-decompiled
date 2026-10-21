package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010!\u001a\u00020\u001a\u0012\u0006\u0010'\u001a\u00020\"¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001Jo\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u0010=\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R4\u0010D\u001a\u00020>2\u0006\u00106\u001a\u00020>8F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b?\u00108\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR+\u0010Y\u001a\u00020S2\u0006\u00106\u001a\u00020S8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u00108\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010^\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010:\"\u0004\b]\u0010<R+\u0010b\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u00108\u001a\u0004\b`\u0010:\"\u0004\ba\u0010<R+\u0010f\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bc\u00108\u001a\u0004\bd\u0010:\"\u0004\be\u0010<R+\u0010j\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bg\u00108\u001a\u0004\bh\u0010:\"\u0004\bi\u0010<R$\u0010l\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010[\u001a\u0004\bl\u0010:R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR&\u0010t\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u000f0\r8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\br\u0010n\u001a\u0004\bs\u0010pR\u0017\u0010z\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR*\u0010\u0081\u0001\u001a\u0004\u0018\u00010{2\b\u0010|\u001a\u0004\u0018\u00010{8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "Landroidx/compose/ui/text/AnnotatedString;", "untransformedText", "visualText", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "softWrap", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "update", "Landroidx/compose/foundation/text/TextDelegate;", "a", "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "textDelegate", "Landroidx/compose/runtime/RecomposeScope;", "b", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "Landroidx/compose/ui/text/input/EditProcessor;", "c", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/TextInputSession;", "d", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "inputSession", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/unit/Dp;", "f", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/LayoutCoordinates;", "g", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "i", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/foundation/text/HandleState;", "j", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "k", "Z", "getShowFloatingToolbar", "setShowFloatingToolbar", "showFloatingToolbar", "l", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart", "m", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd", "n", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "o", "isLayoutResultStale", "r", "Lkotlin/jvm/functions/Function1;", "getOnValueChange", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "s", "getOnImeActionPerformed", "onImeActionPerformed", "Landroidx/compose/ui/graphics/Paint;", "t", "Landroidx/compose/ui/graphics/Paint;", "getSelectionPaint", "()Landroidx/compose/ui/graphics/Paint;", "selectionPaint", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "value", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResult", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1143:1\n154#2:1144\n81#3:1145\n107#3,2:1146\n81#3:1148\n107#3,2:1149\n81#3:1151\n107#3,2:1152\n81#3:1154\n107#3,2:1155\n81#3:1157\n107#3,2:1158\n81#3:1160\n107#3,2:1161\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n809#1:1144\n804#1:1145\n804#1:1146,2\n809#1:1148\n809#1:1149,2\n860#1:1151\n860#1:1152,2\n871#1:1154\n871#1:1155,2\n877#1:1157\n877#1:1158,2\n883#1:1160\n883#1:1161,2\n*E\n"})
public final class TextFieldState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TextDelegate textDelegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RecomposeScope recomposeScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EditProcessor processor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextInputSession inputSession;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState hasFocus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState minHeightForSingleLineField;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LayoutCoordinates layoutCoordinates;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final MutableState<TextLayoutResultProxy> f6054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public AnnotatedString untransformedText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState handleState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean showFloatingToolbar;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState showSelectionHandleStart;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableState showSelectionHandleEnd;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState showCursorHandle;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean isLayoutResultStale;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final KeyboardActionRunner f6061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public Function1<? super TextFieldValue, Unit> f6062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final b f6063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final a f6064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint selectionPaint;

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class a extends Lambda implements Function1<ImeAction, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ImeAction imeAction) {
            TextFieldState.this.f6061p.m503runActionKlQnJC8(imeAction.getF18070a());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class b extends Lambda implements Function1<TextFieldValue, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextFieldValue textFieldValue) {
            TextFieldValue it = textFieldValue;
            Intrinsics.checkNotNullParameter(it, "it");
            String text = it.getText();
            TextFieldState textFieldState = TextFieldState.this;
            AnnotatedString untransformedText = textFieldState.getUntransformedText();
            if (!Intrinsics.areEqual(text, untransformedText != null ? untransformedText.getText() : null)) {
                textFieldState.setHandleState(HandleState.None);
            }
            textFieldState.f6062q.invoke(it);
            textFieldState.getRecomposeScope().invalidate();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class c extends Lambda implements Function1<TextFieldValue, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f6068p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextFieldValue textFieldValue) {
            TextFieldValue it = textFieldValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public TextFieldState(@NotNull TextDelegate textDelegate, @NotNull RecomposeScope recomposeScope) {
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(recomposeScope, "recomposeScope");
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.processor = new EditProcessor();
        Boolean bool = Boolean.FALSE;
        this.hasFocus = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.minHeightForSingleLineField = SnapshotStateKt.mutableStateOf$default(Dp.m4387boximpl(Dp.m4389constructorimpl(0)), null, 2, null);
        this.f6054h = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState = SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.showSelectionHandleStart = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.f6061p = new KeyboardActionRunner();
        this.f6062q = c.f6068p0;
        this.f6063r = new b();
        this.f6064s = new a();
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HandleState getHandleState() {
        return (HandleState) this.handleState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @Nullable
    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @Nullable
    public final TextLayoutResultProxy getLayoutResult() {
        return this.f6054h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m555getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField.getValue()).m4403unboximpl();
    }

    @NotNull
    public final Function1<ImeAction, Unit> getOnImeActionPerformed() {
        return this.f6064s;
    }

    @NotNull
    public final Function1<TextFieldValue, Unit> getOnValueChange() {
        return this.f6063r;
    }

    @NotNull
    public final EditProcessor getProcessor() {
        return this.processor;
    }

    @NotNull
    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    @NotNull
    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    public final boolean getShowFloatingToolbar() {
        return this.showFloatingToolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    @NotNull
    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    @Nullable
    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    /* JADX INFO: renamed from: isLayoutResultStale, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setHandleState(@NotNull HandleState handleState) {
        Intrinsics.checkNotNullParameter(handleState, "<set-?>");
        this.handleState.setValue(handleState);
    }

    public final void setHasFocus(boolean z10) {
        this.hasFocus.setValue(Boolean.valueOf(z10));
    }

    public final void setInputSession(@Nullable TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(@Nullable TextLayoutResultProxy textLayoutResultProxy) {
        this.f6054h.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* JADX INFO: renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m556setMinHeightForSingleLineField0680j_4(float f6) {
        this.minHeightForSingleLineField.setValue(Dp.m4387boximpl(f6));
    }

    public final void setShowCursorHandle(boolean z10) {
        this.showCursorHandle.setValue(Boolean.valueOf(z10));
    }

    public final void setShowFloatingToolbar(boolean z10) {
        this.showFloatingToolbar = z10;
    }

    public final void setShowSelectionHandleEnd(boolean z10) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z10));
    }

    public final void setShowSelectionHandleStart(boolean z10) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z10));
    }

    public final void setTextDelegate(@NotNull TextDelegate textDelegate) {
        Intrinsics.checkNotNullParameter(textDelegate, "<set-?>");
        this.textDelegate = textDelegate;
    }

    public final void setUntransformedText(@Nullable AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* JADX INFO: renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m557updatefnh65Uc(@NotNull AnnotatedString untransformedText, @NotNull AnnotatedString visualText, @NotNull TextStyle textStyle, boolean softWrap, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, @NotNull KeyboardActions keyboardActions, @NotNull FocusManager focusManager, long selectionBackgroundColor) {
        Intrinsics.checkNotNullParameter(untransformedText, "untransformedText");
        Intrinsics.checkNotNullParameter(visualText, "visualText");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        this.f6062q = onValueChange;
        this.selectionPaint.mo2396setColor8_81llA(selectionBackgroundColor);
        KeyboardActionRunner keyboardActionRunner = this.f6061p;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        keyboardActionRunner.setInputSession(this.inputSession);
        this.untransformedText = untransformedText;
        TextDelegate textDelegateM536updateTextDelegaterm0N8CA = TextDelegateKt.m536updateTextDelegaterm0N8CA(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, (448 & 32) != 0 ? true : softWrap, (448 & 64) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : 0, (448 & 128) != 0 ? Integer.MAX_VALUE : 0, (448 & 256) != 0 ? 1 : 0, CollectionsKt__CollectionsKt.emptyList());
        if (this.textDelegate != textDelegateM536updateTextDelegaterm0N8CA) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = textDelegateM536updateTextDelegaterm0N8CA;
    }
}
