package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"textFieldKeyInput", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "editable", "", "singleLine", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "textFieldKeyInput-2WJ9YEU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldKeyInputKt {

    /* JADX INFO: compiled from: TextFieldKeyInput.kt */
    public static final class a extends Lambda implements Function1<TextFieldValue, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6014p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextFieldValue textFieldValue) {
            TextFieldValue it = textFieldValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldKeyInput.kt */
    @SourceDebugExtension({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,263:1\n25#2:264\n25#2:271\n1097#3,6:265\n1097#3,6:272\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n*L\n246#1:264\n247#1:271\n246#1:265,6\n247#1:272,6\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f6015p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f6016q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f6017r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f6018s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f6019t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ OffsetMapping f6020u0;
        public final /* synthetic */ UndoManager v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function1<TextFieldValue, Unit> f6021w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f6022x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, OffsetMapping offsetMapping, UndoManager undoManager, Function1<? super TextFieldValue, Unit> function1, int i10) {
            super(3);
            this.f6015p0 = textFieldState;
            this.f6016q0 = textFieldSelectionManager;
            this.f6017r0 = textFieldValue;
            this.f6018s0 = z10;
            this.f6019t0 = z11;
            this.f6020u0 = offsetMapping;
            this.v0 = undoManager;
            this.f6021w0 = function1;
            this.f6022x0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 2057323757);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2057323757, iA, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:244)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new TextPreparedSelectionState();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) objRememberedValue;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new DeadKeyCombiner();
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.INSTANCE, new a0(new TextFieldKeyInput(this.f6015p0, this.f6016q0, this.f6017r0, this.f6018s0, this.f6019t0, textPreparedSelectionState, this.f6020u0, this.v0, (DeadKeyCombiner) objRememberedValue2, null, this.f6021w0, this.f6022x0, 512, null)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierOnKeyEvent;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final Modifier m549textFieldKeyInput2WJ9YEU(@NotNull Modifier textFieldKeyInput, @NotNull TextFieldState state, @NotNull TextFieldSelectionManager manager, @NotNull TextFieldValue value, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, boolean z10, boolean z11, @NotNull OffsetMapping offsetMapping, @NotNull UndoManager undoManager, int i10) {
        Intrinsics.checkNotNullParameter(textFieldKeyInput, "$this$textFieldKeyInput");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(undoManager, "undoManager");
        return ComposedModifierKt.composed$default(textFieldKeyInput, null, new b(state, manager, value, z10, z11, offsetMapping, undoManager, onValueChange, i10), 1, null);
    }
}
