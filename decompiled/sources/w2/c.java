package w2;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiTextWatcher.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class c implements TextWatcher {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final EditText f94124p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f94125q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public a f94126r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f94127s0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f94128t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f94129u0 = true;

    /* JADX INFO: compiled from: EmojiTextWatcher.java */
    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a extends EmojiCompat.InitCallback implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final WeakReference f94130p0;

        public a(EditText editText) {
            this.f94130p0 = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void onInitialized() {
            Handler handler;
            super.onInitialized();
            EditText editText = (EditText) this.f94130p0.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.b((EditText) this.f94130p0.get(), 1);
        }
    }

    public c(EditText editText, boolean z10) {
        this.f94124p0 = editText;
        this.f94125q0 = z10;
    }

    public static void b(@Nullable EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.get().process(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f94124p0;
        if (editText.isInEditMode() || !this.f94129u0) {
            return;
        }
        if ((this.f94125q0 || EmojiCompat.isConfigured()) && i11 <= i12 && (charSequence instanceof Spannable)) {
            int loadState = EmojiCompat.get().getLoadState();
            if (loadState != 0) {
                if (loadState == 1) {
                    EmojiCompat.get().process((Spannable) charSequence, i10, i10 + i12, this.f94127s0, this.f94128t0);
                    return;
                } else if (loadState != 3) {
                    return;
                }
            }
            EmojiCompat emojiCompat = EmojiCompat.get();
            if (this.f94126r0 == null) {
                this.f94126r0 = new a(editText);
            }
            emojiCompat.registerInitCallback(this.f94126r0);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
