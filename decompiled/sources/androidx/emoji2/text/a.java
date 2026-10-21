package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;

/* JADX INFO: compiled from: DefaultGlyphChecker.java */
/* JADX INFO: loaded from: classes2.dex */
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a implements EmojiCompat.GlyphChecker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f21310b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f21311a;

    public a() {
        TextPaint textPaint = new TextPaint();
        this.f21311a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public final boolean hasGlyph(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        ThreadLocal<StringBuilder> threadLocal = f21310b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb2 = threadLocal.get();
        sb2.setLength(0);
        while (i10 < i11) {
            sb2.append(charSequence.charAt(i10));
            i10++;
        }
        return PaintCompat.hasGlyph(this.f21311a, sb2.toString());
    }
}
