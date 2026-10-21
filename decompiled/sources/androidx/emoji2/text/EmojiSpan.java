package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
public abstract class EmojiSpan extends ReplacementSpan {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final TypefaceEmojiRasterizer f21276q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint.FontMetricsInt f21275p0 = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public short f21277r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public short f21278s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f21279t0 = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public EmojiSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.checkNotNull(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.f21276q0 = typefaceEmojiRasterizer;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final int getHeight() {
        return this.f21278s0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final int getId() {
        return getTypefaceRasterizer().getId();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f21275p0;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        TypefaceEmojiRasterizer typefaceEmojiRasterizer = this.f21276q0;
        this.f21279t0 = fAbs / typefaceEmojiRasterizer.getHeight();
        this.f21278s0 = (short) (typefaceEmojiRasterizer.getHeight() * this.f21279t0);
        short width = (short) (typefaceEmojiRasterizer.getWidth() * this.f21279t0);
        this.f21277r0 = width;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return width;
    }

    @NonNull
    public final TypefaceEmojiRasterizer getTypefaceRasterizer() {
        return this.f21276q0;
    }
}
