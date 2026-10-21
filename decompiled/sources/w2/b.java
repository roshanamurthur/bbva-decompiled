package w2;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiInputFilter.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b implements InputFilter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TextView f94120p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public a f94121q0;

    /* JADX INFO: compiled from: EmojiInputFilter.java */
    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a extends EmojiCompat.InitCallback implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final WeakReference f94122p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final WeakReference f94123q0;

        public a(TextView textView, b bVar) {
            this.f94122p0 = new WeakReference(textView);
            this.f94123q0 = new WeakReference(bVar);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void onInitialized() {
            Handler handler;
            super.onInitialized();
            TextView textView = (TextView) this.f94122p0.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            InputFilter[] filters;
            CharSequence text;
            CharSequence charSequenceProcess;
            TextView textView = (TextView) this.f94122p0.get();
            InputFilter inputFilter = (InputFilter) this.f94123q0.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (!textView.isAttachedToWindow() || text == (charSequenceProcess = EmojiCompat.get().process((text = textView.getText())))) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceProcess);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceProcess);
                    textView.setText(charSequenceProcess);
                    if (charSequenceProcess instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceProcess;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    public b(@NonNull TextView textView) {
        this.f94120p0 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f94120p0;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int loadState = EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            if (loadState == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return EmojiCompat.get().process(charSequence, 0, charSequence.length());
            }
            if (loadState != 3) {
                return charSequence;
            }
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (this.f94121q0 == null) {
            this.f94121q0 = new a(textView, this);
        }
        emojiCompat.registerInitCallback(this.f94121q0);
        return charSequence;
    }
}
