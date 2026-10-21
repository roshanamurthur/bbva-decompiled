package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class EmojiInputConnection extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f21400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmojiCompatDeleteHelper f21401b;

    public static class EmojiCompatDeleteHelper {
        public boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, boolean z10) {
            return EmojiCompat.handleDeleteSurroundingText(inputConnection, editable, i10, i11, z10);
        }

        public void updateEditorInfoAttrs(@NonNull EditorInfo editorInfo) {
            if (EmojiCompat.isConfigured()) {
                EmojiCompat.get().updateEditorInfo(editorInfo);
            }
        }
    }

    public EmojiInputConnection(@NonNull EditText editText, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        EmojiCompatDeleteHelper emojiCompatDeleteHelper = new EmojiCompatDeleteHelper();
        super(inputConnection, false);
        this.f21400a = editText;
        this.f21401b = emojiCompatDeleteHelper;
        emojiCompatDeleteHelper.updateEditorInfoAttrs(editorInfo);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        return this.f21401b.handleDeleteSurroundingText(this, this.f21400a.getEditableText(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f21401b.handleDeleteSurroundingText(this, this.f21400a.getEditableText(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
