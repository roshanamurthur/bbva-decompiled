package androidx.compose.ui.text.input;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.TextRange;
import com.adobe.marketing.mobile.EventDataKeys;
import com.huawei.hms.feature.model.b;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RecordingInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010V\u001a\u00020\u0002\u0012\u0006\u0010H\u001a\u00020C\u0012\u0006\u0010M\u001a\u00020\b¢\u0006\u0004\bW\u0010XJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u001a\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000eH\u0016J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u000eH\u0016J\u0012\u0010.\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010-H\u0016J\u0012\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/H\u0016J\n\u00103\u001a\u0004\u0018\u000102H\u0016J\u0010\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\u000eH\u0016J\u0010\u00107\u001a\u00020\b2\u0006\u00106\u001a\u00020\bH\u0016J\u0010\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000eH\u0016J\u001c\u0010>\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016J\"\u0010B\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010A\u001a\u0004\u0018\u00010<H\u0016R\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010M\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR*\u0010U\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006Y"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "", "updateInputState", "", "beginBatchEdit", "endBatchEdit", "closeConnection", "", "text", "", "newCursorPosition", "commitText", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setComposingRegion", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "maxChars", "flags", "getTextBeforeCursor", "getTextAfterCursor", "getSelectedText", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "Landroid/os/Handler;", "getHandler", b.f50432b, "clearMetaKeyStates", "enabled", "reportFullscreenMode", "reqModes", "getCursorCapsMode", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "Landroidx/compose/ui/text/input/InputEventCallback2;", "a", "Landroidx/compose/ui/text/input/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "eventCallback", "b", "Z", "getAutoCorrect", "()Z", "autoCorrect", "value", "d", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "mTextFieldValue", "initState", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,403:1\n80#1,5:404\n80#1,5:409\n80#1,5:414\n80#1,5:419\n80#1,5:424\n80#1,5:429\n80#1,5:434\n80#1,5:439\n80#1,5:444\n80#1,5:449\n80#1,5:454\n80#1,5:459\n80#1,5:464\n80#1,5:469\n80#1,5:474\n80#1,5:479\n80#1,5:484\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n139#1:404,5\n175#1:409,5\n180#1:414,5\n186#1:419,5\n194#1:424,5\n205#1:429,5\n211#1:434,5\n217#1:439,5\n223#1:444,5\n259#1:449,5\n295#1:454,5\n321#1:459,5\n344#1:464,5\n354#1:469,5\n366#1:474,5\n386#1:479,5\n395#1:484,5\n*E\n"})
public final class RecordingInputConnection implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputEventCallback2 eventCallback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean autoCorrect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TextFieldValue mTextFieldValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList f18129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18130h;

    public RecordingInputConnection(@NotNull TextFieldValue initState, @NotNull InputEventCallback2 eventCallback, boolean z10) {
        Intrinsics.checkNotNullParameter(initState, "initState");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.eventCallback = eventCallback;
        this.autoCorrect = z10;
        this.mTextFieldValue = initState;
        this.f18129g = new ArrayList();
        this.f18130h = true;
    }

    public final void a(EditCommand editCommand) {
        this.f18125c++;
        try {
            this.f18129g.add(editCommand);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i10 = this.f18125c - 1;
        this.f18125c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f18129g;
            if (!arrayList.isEmpty()) {
                this.eventCallback.onEditCommands(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
                arrayList.clear();
            }
        }
        return this.f18125c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f18130h;
        if (!z10) {
            return z10;
        }
        this.f18125c++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z10 = this.f18130h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f18129g.clear();
        this.f18125c = 0;
        this.f18130h = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo text) {
        boolean z10 = this.f18130h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int flags, @Nullable Bundle opts) {
        Intrinsics.checkNotNullParameter(inputContentInfo, "inputContentInfo");
        boolean z10 = this.f18130h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z10 = this.f18130h;
        return z10 ? this.autoCorrect : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence text, int newCursorPosition) {
        boolean z10 = this.f18130h;
        if (z10) {
            a(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z10 = this.f18130h;
        if (!z10) {
            return z10;
        }
        a(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z10 = this.f18130h;
        if (!z10) {
            return z10;
        }
        a(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f18130h;
        if (!z10) {
            return z10;
        }
        a(new FinishComposingTextCommand());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m3965getMinimpl(this.mTextFieldValue.getSelection()), reqModes);
    }

    @NotNull
    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest request, int flags) {
        boolean z10 = (flags & 1) != 0;
        this.f18128f = z10;
        if (z10) {
            this.f18127e = request != null ? request.token : 0;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getMTextFieldValue$ui_release, reason: from getter */
    public final TextFieldValue getMTextFieldValue() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int flags) {
        if (TextRange.m3961getCollapsedimpl(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, maxChars).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        boolean z10 = this.f18130h;
        if (z10) {
            z10 = false;
            switch (id) {
                case R.id.selectAll:
                    a(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    c(277);
                    break;
                case R.id.copy:
                    c(278);
                    break;
                case R.id.paste:
                    c(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iM4116getDefaulteUduSuo;
        boolean z10 = this.f18130h;
        if (!z10) {
            return z10;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    iM4116getDefaulteUduSuo = ImeAction.INSTANCE.m4118getGoeUduSuo();
                    break;
                case 3:
                    iM4116getDefaulteUduSuo = ImeAction.INSTANCE.m4122getSearcheUduSuo();
                    break;
                case 4:
                    iM4116getDefaulteUduSuo = ImeAction.INSTANCE.m4123getSendeUduSuo();
                    break;
                case 5:
                    iM4116getDefaulteUduSuo = ImeAction.INSTANCE.m4119getNexteUduSuo();
                    break;
                case 6:
                    iM4116getDefaulteUduSuo = ImeAction.INSTANCE.m4117getDoneeUduSuo();
                    break;
                case 7:
                    iM4116getDefaulteUduSuo = ImeAction.INSTANCE.m4121getPreviouseUduSuo();
                    break;
                default:
                    Log.w(RecordingInputConnection_androidKt.TAG, "IME sends unsupported Editor Action: " + editorAction);
                    iM4116getDefaulteUduSuo = ImeAction.INSTANCE.m4116getDefaulteUduSuo();
                    break;
            }
        } else {
            iM4116getDefaulteUduSuo = ImeAction.INSTANCE.m4116getDefaulteUduSuo();
        }
        this.eventCallback.mo4130onImeActionKlQnJC8(iM4116getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String action, @Nullable Bundle data) {
        boolean z10 = this.f18130h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z10 = this.f18130h;
        if (!z10) {
            return z10;
        }
        Log.w(RecordingInputConnection_androidKt.TAG, "requestCursorUpdates is not supported");
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z10 = this.f18130h;
        if (!z10) {
            return z10;
        }
        this.eventCallback.onKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z10 = this.f18130h;
        if (z10) {
            a(new SetComposingRegionCommand(start, end));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence text, int newCursorPosition) {
        boolean z10 = this.f18130h;
        if (z10) {
            a(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    public final void setMTextFieldValue$ui_release(@NotNull TextFieldValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mTextFieldValue = value;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z10 = this.f18130h;
        if (!z10) {
            return z10;
        }
        a(new SetSelectionCommand(start, end));
        return true;
    }

    public final void updateInputState(@NotNull TextFieldValue state, @NotNull InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        if (this.f18130h) {
            setMTextFieldValue$ui_release(state);
            if (this.f18128f) {
                inputMethodManager.updateExtractedText(this.f18127e, InputState_androidKt.toExtractedText(state));
            }
            TextRange composition = state.getComposition();
            int iM3965getMinimpl = composition != null ? TextRange.m3965getMinimpl(composition.getF17768a()) : -1;
            TextRange composition2 = state.getComposition();
            inputMethodManager.updateSelection(TextRange.m3965getMinimpl(state.getSelection()), TextRange.m3964getMaximpl(state.getSelection()), iM3965getMinimpl, composition2 != null ? TextRange.m3964getMaximpl(composition2.getF17768a()) : -1);
        }
    }
}
