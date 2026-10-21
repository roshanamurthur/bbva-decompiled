package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0086\u0001\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\"\u0012\b\b\u0002\u0010-\u001a\u00020(\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010.\u0012\u0006\u00105\u001a\u000204\u0012\b\b\u0002\u00107\u001a\u000206\u0012\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020908\u0012\u0006\u0010<\u001a\u00020;ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u00103\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006?"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "process", "Landroidx/compose/foundation/text/TextFieldState;", "a", "Landroidx/compose/foundation/text/TextFieldState;", "getState", "()Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "b", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/ui/text/input/TextFieldValue;", "c", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "value", "d", "Z", "getEditable", "()Z", "editable", "e", "getSingleLine", "singleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "f", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/ui/text/input/OffsetMapping;", "g", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "h", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyCombiner", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextFieldKeyInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextFieldState state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextFieldSelectionManager selectionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextFieldValue value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean editable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean singleLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextPreparedSelectionState preparedSelectionState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OffsetMapping offsetMapping;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UndoManager undoManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final DeadKeyCombiner f6006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final KeyMapping f6007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Function1<TextFieldValue, Unit> f6008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6009l;

    /* JADX INFO: compiled from: TextFieldKeyInput.kt */
    public static final class a extends Lambda implements Function1<TextFieldValue, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6010p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextFieldValue textFieldValue) {
            TextFieldValue it = textFieldValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public TextFieldKeyInput() {
        throw null;
    }

    public TextFieldKeyInput(TextFieldState state, TextFieldSelectionManager selectionManager, TextFieldValue value, boolean z10, boolean z11, TextPreparedSelectionState preparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner keyCombiner, KeyMapping keyMapping, Function1 onValueChange, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectionManager, "selectionManager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(preparedSelectionState, "preparedSelectionState");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(keyCombiner, "keyCombiner");
        Intrinsics.checkNotNullParameter(keyMapping, "keyMapping");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        this.state = state;
        this.selectionManager = selectionManager;
        this.value = value;
        this.editable = z10;
        this.singleLine = z11;
        this.preparedSelectionState = preparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.f6006i = keyCombiner;
        this.f6007j = keyMapping;
        this.f6008k = onValueChange;
        this.f6009l = i10;
    }

    public static final void access$apply(TextFieldKeyInput textFieldKeyInput, EditCommand editCommand) throws IOException {
        textFieldKeyInput.getClass();
        List listListOf = bk.d.listOf(editCommand);
        EditProcessor processor = textFieldKeyInput.state.getProcessor();
        List<? extends EditCommand> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listListOf);
        mutableList.add(0, new FinishComposingTextCommand());
        textFieldKeyInput.f6008k.invoke(processor.apply(mutableList));
    }

    public final boolean getEditable() {
        return this.editable;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    @NotNull
    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @NotNull
    public final TextFieldState getState() {
        return this.state;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    @NotNull
    public final TextFieldValue getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m548processZmokQxo(@NotNull KeyEvent event) {
        final KeyCommand keyCommandMo501mapZmokQxo;
        Integer numM499consumeZmokQxo;
        Intrinsics.checkNotNullParameter(event, "event");
        CommitTextCommand commitTextCommand = null;
        if (TextFieldKeyInput_androidKt.m551isTypedEventZmokQxo(event) && (numM499consumeZmokQxo = this.f6006i.m499consumeZmokQxo(event)) != null) {
            String string = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), numM499consumeZmokQxo.intValue()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().appendCo…ntX(codePoint).toString()");
            commitTextCommand = new CommitTextCommand(string, 1);
        }
        Function1<TextFieldValue, Unit> function1 = this.f6008k;
        TextFieldState textFieldState = this.state;
        TextPreparedSelectionState textPreparedSelectionState = this.preparedSelectionState;
        boolean z10 = this.editable;
        if (commitTextCommand != null) {
            if (!z10) {
                return false;
            }
            List listListOf = bk.d.listOf(commitTextCommand);
            EditProcessor processor = textFieldState.getProcessor();
            List<? extends EditCommand> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listListOf);
            mutableList.add(0, new FinishComposingTextCommand());
            function1.invoke(processor.apply(mutableList));
            textPreparedSelectionState.resetCachedX();
            return true;
        }
        if (!KeyEventType.m3359equalsimpl0(KeyEvent_androidKt.m3367getTypeZmokQxo(event), KeyEventType.INSTANCE.m3363getKeyDownCS__XNY()) || (keyCommandMo501mapZmokQxo = this.f6007j.mo501mapZmokQxo(event)) == null || (keyCommandMo501mapZmokQxo.getEditsText() && !z10)) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Function1<TextFieldPreparedSelection, Unit> function2 = new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            /* JADX INFO: compiled from: TextFieldKeyInput.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    try {
                        iArr[KeyCommand.COPY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KeyCommand.PASTE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[KeyCommand.CUT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[KeyCommand.UP.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[KeyCommand.DOWN.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[KeyCommand.LINE_START.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[KeyCommand.LINE_END.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[KeyCommand.HOME.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[KeyCommand.END.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[KeyCommand.TAB.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[KeyCommand.DESELECT.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[KeyCommand.UNDO.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[KeyCommand.REDO.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                TextFieldValue textFieldValueUndo;
                TextFieldValue textFieldValueRedo;
                TextFieldPreparedSelection commandExecutionContext = textFieldPreparedSelection;
                Intrinsics.checkNotNullParameter(commandExecutionContext, "$this$commandExecutionContext");
                int i10 = WhenMappings.$EnumSwitchMapping$0[keyCommandMo501mapZmokQxo.ordinal()];
                TextFieldKeyInput textFieldKeyInput = this;
                switch (i10) {
                    case 1:
                        textFieldKeyInput.getSelectionManager().copy$foundation_release(false);
                        break;
                    case 2:
                        textFieldKeyInput.getSelectionManager().paste$foundation_release();
                        break;
                    case 3:
                        textFieldKeyInput.getSelectionManager().cut$foundation_release();
                        break;
                    case 4:
                        commandExecutionContext.collapseLeftOr(s.f6270p0);
                        break;
                    case 5:
                        commandExecutionContext.collapseRightOr(t.f6490p0);
                        break;
                    case 6:
                        commandExecutionContext.moveCursorLeftByWord();
                        break;
                    case 7:
                        commandExecutionContext.moveCursorRightByWord();
                        break;
                    case 8:
                        commandExecutionContext.moveCursorPrevByParagraph();
                        break;
                    case 9:
                        commandExecutionContext.moveCursorNextByParagraph();
                        break;
                    case 10:
                        commandExecutionContext.moveCursorUpByLine();
                        break;
                    case 11:
                        commandExecutionContext.moveCursorDownByLine();
                        break;
                    case 12:
                        commandExecutionContext.moveCursorUpByPage();
                        break;
                    case 13:
                        commandExecutionContext.moveCursorDownByPage();
                        break;
                    case 14:
                        commandExecutionContext.moveCursorToLineStart();
                        break;
                    case 15:
                        commandExecutionContext.moveCursorToLineEnd();
                        break;
                    case 16:
                        commandExecutionContext.moveCursorToLineLeftSide();
                        break;
                    case 17:
                        commandExecutionContext.moveCursorToLineRightSide();
                        break;
                    case 18:
                        commandExecutionContext.moveCursorToHome();
                        break;
                    case 19:
                        commandExecutionContext.moveCursorToEnd();
                        break;
                    case 20:
                        List<EditCommand> listDeleteIfSelectedOr = commandExecutionContext.deleteIfSelectedOr(u.f6491p0);
                        if (listDeleteIfSelectedOr != null) {
                            TextFieldKeyInput.access$apply(textFieldKeyInput, listDeleteIfSelectedOr);
                        }
                        break;
                    case 21:
                        List<EditCommand> listDeleteIfSelectedOr2 = commandExecutionContext.deleteIfSelectedOr(v.f6492p0);
                        if (listDeleteIfSelectedOr2 != null) {
                            TextFieldKeyInput.access$apply(textFieldKeyInput, listDeleteIfSelectedOr2);
                        }
                        break;
                    case 22:
                        List<EditCommand> listDeleteIfSelectedOr3 = commandExecutionContext.deleteIfSelectedOr(w.f6493p0);
                        if (listDeleteIfSelectedOr3 != null) {
                            TextFieldKeyInput.access$apply(textFieldKeyInput, listDeleteIfSelectedOr3);
                        }
                        break;
                    case 23:
                        List<EditCommand> listDeleteIfSelectedOr4 = commandExecutionContext.deleteIfSelectedOr(x.f6494p0);
                        if (listDeleteIfSelectedOr4 != null) {
                            TextFieldKeyInput.access$apply(textFieldKeyInput, listDeleteIfSelectedOr4);
                        }
                        break;
                    case 24:
                        List<EditCommand> listDeleteIfSelectedOr5 = commandExecutionContext.deleteIfSelectedOr(y.f6495p0);
                        if (listDeleteIfSelectedOr5 != null) {
                            TextFieldKeyInput.access$apply(textFieldKeyInput, listDeleteIfSelectedOr5);
                        }
                        break;
                    case 25:
                        List<EditCommand> listDeleteIfSelectedOr6 = commandExecutionContext.deleteIfSelectedOr(z.f6496p0);
                        if (listDeleteIfSelectedOr6 != null) {
                            TextFieldKeyInput.access$apply(textFieldKeyInput, listDeleteIfSelectedOr6);
                        }
                        break;
                    case 26:
                        if (!textFieldKeyInput.getSingleLine()) {
                            TextFieldKeyInput.access$apply(textFieldKeyInput, new CommitTextCommand(RootService.LINE_BREAK, 1));
                        } else {
                            textFieldKeyInput.getState().getOnImeActionPerformed().invoke(ImeAction.m4101boximpl(textFieldKeyInput.f6009l));
                        }
                        break;
                    case 27:
                        if (!textFieldKeyInput.getSingleLine()) {
                            TextFieldKeyInput.access$apply(textFieldKeyInput, new CommitTextCommand("\t", 1));
                        } else {
                            booleanRef.element = false;
                        }
                        break;
                    case 28:
                        commandExecutionContext.selectAll();
                        break;
                    case 29:
                        commandExecutionContext.moveCursorLeft().selectMovement();
                        break;
                    case 30:
                        commandExecutionContext.moveCursorRight().selectMovement();
                        break;
                    case 31:
                        commandExecutionContext.moveCursorLeftByWord().selectMovement();
                        break;
                    case 32:
                        commandExecutionContext.moveCursorRightByWord().selectMovement();
                        break;
                    case 33:
                        commandExecutionContext.moveCursorPrevByParagraph().selectMovement();
                        break;
                    case 34:
                        commandExecutionContext.moveCursorNextByParagraph().selectMovement();
                        break;
                    case 35:
                        commandExecutionContext.moveCursorToLineStart().selectMovement();
                        break;
                    case 36:
                        commandExecutionContext.moveCursorToLineEnd().selectMovement();
                        break;
                    case 37:
                        commandExecutionContext.moveCursorToLineLeftSide().selectMovement();
                        break;
                    case 38:
                        commandExecutionContext.moveCursorToLineRightSide().selectMovement();
                        break;
                    case 39:
                        commandExecutionContext.moveCursorUpByLine().selectMovement();
                        break;
                    case 40:
                        commandExecutionContext.moveCursorDownByLine().selectMovement();
                        break;
                    case 41:
                        commandExecutionContext.moveCursorUpByPage().selectMovement();
                        break;
                    case 42:
                        commandExecutionContext.moveCursorDownByPage().selectMovement();
                        break;
                    case 43:
                        commandExecutionContext.moveCursorToHome().selectMovement();
                        break;
                    case 44:
                        commandExecutionContext.moveCursorToEnd().selectMovement();
                        break;
                    case 45:
                        commandExecutionContext.deselect();
                        break;
                    case 46:
                        UndoManager undoManager = textFieldKeyInput.getUndoManager();
                        if (undoManager != null) {
                            undoManager.makeSnapshot(commandExecutionContext.getValue());
                        }
                        UndoManager undoManager2 = textFieldKeyInput.getUndoManager();
                        if (undoManager2 != null && (textFieldValueUndo = undoManager2.undo()) != null) {
                            textFieldKeyInput.f6008k.invoke(textFieldValueUndo);
                        }
                        break;
                    case 47:
                        UndoManager undoManager3 = textFieldKeyInput.getUndoManager();
                        if (undoManager3 != null && (textFieldValueRedo = undoManager3.redo()) != null) {
                            textFieldKeyInput.f6008k.invoke(textFieldValueRedo);
                        }
                        break;
                    case 48:
                        KeyEventHelpers_androidKt.showCharacterPalette();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
        TextFieldValue textFieldValue = this.value;
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(textFieldValue, this.offsetMapping, layoutResult, textPreparedSelectionState);
        function2.invoke(textFieldPreparedSelection);
        if (!TextRange.m3960equalsimpl0(textFieldPreparedSelection.getSelection(), textFieldValue.getSelection()) || !Intrinsics.areEqual(textFieldPreparedSelection.getAnnotatedString(), textFieldValue.getAnnotatedString())) {
            function1.invoke(textFieldPreparedSelection.getValue());
        }
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return booleanRef.element;
    }

    public static final void access$apply(TextFieldKeyInput textFieldKeyInput, List list) throws IOException {
        EditProcessor processor = textFieldKeyInput.state.getProcessor();
        List<? extends EditCommand> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, new FinishComposingTextCommand());
        textFieldKeyInput.f6008k.invoke(processor.apply(mutableList));
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, (i11 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, textPreparedSelectionState, (i11 & 64) != 0 ? OffsetMapping.INSTANCE.getIdentity() : offsetMapping, (i11 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i11 & 512) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i11 & 1024) != 0 ? a.f6010p0 : function1, i10, null);
    }
}
