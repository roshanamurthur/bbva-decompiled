package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TypefaceEmojiSpan extends EmojiSpan {

    @Nullable
    public static TextPaint v0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public TextPaint f21309u0;

    public TypefaceEmojiSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, float f6, int i12, int i13, int i14, @NonNull Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f21309u0;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f21309u0 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f6, i12, f6 + this.f21277r0, i14, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            float f10 = i12;
            float f11 = f6 + this.f21277r0;
            float f12 = i14;
            if (v0 == null) {
                TextPaint textPaint4 = new TextPaint();
                v0 = textPaint4;
                textPaint4.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
                v0.setStyle(Paint.Style.FILL);
            }
            canvas.drawRect(f6, f10, f11, f12, v0);
        }
        TypefaceEmojiRasterizer typefaceRasterizer = getTypefaceRasterizer();
        float f13 = i13;
        if (textPaint3 != null) {
            paint2 = textPaint3;
        }
        typefaceRasterizer.draw(canvas, f6, f13, paint2);
    }
}
