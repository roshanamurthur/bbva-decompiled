package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* JADX INFO: compiled from: AppCompatEmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final EditText f1695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EmojiEditTextHelper f1696b;

    public x(@NonNull EditText editText) {
        this.f1695a = editText;
        this.f1696b = new EmojiEditTextHelper(editText, false);
    }

    @Nullable
    public final KeyListener a(@Nullable KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? this.f1696b.getKeyListener(keyListener) : keyListener;
    }

    public final void b(@Nullable AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1695a.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i10, 0);
        try {
            int i11 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            this.f1696b.setEnabled(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
