package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* JADX INFO: compiled from: AppCompatEmojiTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f1699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EmojiTextViewHelper f1700b;

    public y(@NonNull TextView textView) {
        this.f1699a = textView;
        this.f1700b = new EmojiTextViewHelper(textView, false);
    }

    public final void a(@Nullable AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1699a.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i10, 0);
        try {
            int i11 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z10) {
        this.f1700b.setAllCaps(z10);
    }

    public final void c(boolean z10) {
        this.f1700b.setEnabled(z10);
    }
}
