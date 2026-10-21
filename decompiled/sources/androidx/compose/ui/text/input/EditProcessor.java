package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EditProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\f\u001a\u00020\u0002R$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "reset", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "apply", "toTextFieldValue", "<set-?>", "a", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "Landroidx/compose/ui/text/input/EditingBuffer;", "b", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n33#2,6:174\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:174,6\n*E\n"})
public final class EditProcessor {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.INSTANCE.m3972getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.getSelection(), (DefaultConstructorMarker) null);

    public static final String access$toStringForLog(EditProcessor editProcessor, EditCommand editCommand) {
        editProcessor.getClass();
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb2.append(commitTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(commitTextCommand.getNewCursorPosition());
            sb2.append(RootService.CLOSE_BRACKET);
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb3.append(setComposingTextCommand.getText().length());
            sb3.append(", newCursorPosition=");
            sb3.append(setComposingTextCommand.getNewCursorPosition());
            sb3.append(RootService.CLOSE_BRACKET);
            return sb3.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return editCommand.toString();
        }
        String simpleName = Reflection.getOrCreateKotlinClass(editCommand.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "{anonymous EditCommand}";
        }
        return "Unknown EditCommand: ".concat(simpleName);
    }

    @NotNull
    public final TextFieldValue apply(@NotNull List<? extends EditCommand> editCommands) throws IOException {
        EditCommand editCommand;
        Exception e5;
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        EditCommand editCommand2 = null;
        try {
            int size = editCommands.size();
            int i10 = 0;
            while (i10 < size) {
                editCommand = editCommands.get(i10);
                try {
                    editCommand.applyTo(this.mBuffer);
                    i10++;
                    editCommand2 = editCommand;
                } catch (Exception e7) {
                    e5 = e7;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m4098getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m3970toStringimpl(this.mBuffer.m4099getSelectiond9O1mEE$ui_text_release())) + "):");
                    Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                    sb2.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                    CollectionsKt___CollectionsKt.joinTo(editCommands, sb2, (112 & 2) != 0 ? ", " : RootService.LINE_BREAK, (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new q1.a(this, editCommand));
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(string, e5);
                }
            }
            TextFieldValue textFieldValue = new TextFieldValue(this.mBuffer.toAnnotatedString$ui_text_release(), this.mBuffer.m4099getSelectiond9O1mEE$ui_text_release(), this.mBuffer.m4098getCompositionMzsxiRA$ui_text_release(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e10) {
            editCommand = editCommand2;
            e5 = e10;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getMBuffer$ui_text_release, reason: from getter */
    public final EditingBuffer getMBuffer() {
        return this.mBuffer;
    }

    @NotNull
    /* JADX INFO: renamed from: getMBufferState$ui_text_release, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    public final void reset(@NotNull TextFieldValue value, @Nullable TextInputSession textInputSession) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z10 = true;
        boolean z11 = !Intrinsics.areEqual(value.getComposition(), this.mBuffer.m4098getCompositionMzsxiRA$ui_text_release());
        boolean z12 = false;
        if (!Intrinsics.areEqual(this.mBufferState.getAnnotatedString(), value.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(value.getAnnotatedString(), value.getSelection(), (DefaultConstructorMarker) null);
        } else if (TextRange.m3960equalsimpl0(this.mBufferState.getSelection(), value.getSelection())) {
            z10 = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m3965getMinimpl(value.getSelection()), TextRange.m3964getMaximpl(value.getSelection()));
            z12 = true;
            z10 = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m3961getCollapsedimpl(value.getComposition().getF17768a())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m3965getMinimpl(value.getComposition().getF17768a()), TextRange.m3964getMaximpl(value.getComposition().getF17768a()));
        }
        if (z10 || (!z12 && z11)) {
            this.mBuffer.commitComposition$ui_text_release();
            value = TextFieldValue.m4171copy3r_uNRQ$default(value, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue, value);
        }
    }

    @NotNull
    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
