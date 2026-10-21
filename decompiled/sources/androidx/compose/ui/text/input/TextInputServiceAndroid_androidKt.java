package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¨\u0006\n"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "", "update", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class TextInputServiceAndroid_androidKt {
    public static final void access$updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    @NotNull
    public static final Executor asExecutor(@NotNull final Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "<this>");
        return new Executor() { // from class: q1.e
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                Choreographer this_asExecutor = choreographer;
                Intrinsics.checkNotNullParameter(this_asExecutor, "$this_asExecutor");
                this_asExecutor.postFrameCallback(new Choreographer.FrameCallback() { // from class: q1.f
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j10) {
                        runnable.run();
                    }
                });
            }
        };
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i10 = 6;
        if (ImeAction.m4104equalsimpl0(imeAction, companion.m4116getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4120getNoneeUduSuo())) {
            i10 = 1;
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4118getGoeUduSuo())) {
            i10 = 2;
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4119getNexteUduSuo())) {
            i10 = 5;
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4121getPreviouseUduSuo())) {
            i10 = 7;
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4122getSearcheUduSuo())) {
            i10 = 3;
        } else if (ImeAction.m4104equalsimpl0(imeAction, companion.m4123getSendeUduSuo())) {
            i10 = 4;
        } else if (!ImeAction.m4104equalsimpl0(imeAction, companion.m4117getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i10;
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4169getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4162getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4165getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4168getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4170getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4164getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4167getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4166getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m4149equalsimpl0(keyboardType, companion2.m4163getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine()) {
            int i11 = editorInfo.inputType;
            if ((i11 & 1) == 1) {
                editorInfo.inputType = i11 | 131072;
                if (ImeAction.m4104equalsimpl0(imeOptions.getImeAction(), companion.m4116getDefaulteUduSuo())) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m4134equalsimpl0(capitalization, companion3.m4142getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m4134equalsimpl0(capitalization, companion3.m4145getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m4134equalsimpl0(capitalization, companion3.m4144getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m3967getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m3962getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }
}
