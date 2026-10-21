package androidx.compose.ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlaceholderSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B7\u0012\u0006\u0010&\u001a\u00020\u000e\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u000e\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J4\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017JR\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R$\u0010%\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018¨\u0006."}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/Paint;", "paint", "", "text", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "", "draw", "u0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getVerticalAlign", "()I", "verticalAlign", "<set-?>", "v0", "Landroid/graphics/Paint$FontMetricsInt;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "w0", "getWidthPx", "widthPx", "x0", "getHeightPx", "heightPx", "width", "widthUnit", "height", "heightUnit", "pxPerSp", "<init>", "(FIFIFI)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceholderSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f17850p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f17851q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f17852r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f17853s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final float f17854t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public final int verticalAlign;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public Paint.FontMetricsInt fontMetrics;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public int widthPx;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public int heightPx;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f17858y0;

    public PlaceholderSpan(float f6, int i10, float f10, int i11, float f11, int i12) {
        this.f17850p0 = f6;
        this.f17851q0 = i10;
        this.f17852r0 = f10;
        this.f17853s0 = i11;
        this.f17854t0 = f11;
        this.verticalAlign = i12;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence text, int start, int end, float x4, int top, int y7, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @NotNull
    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (this.f17858y0) {
            return this.heightPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@NotNull Paint paint, @Nullable CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        float f6;
        int iCeilToInt;
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f17858y0 = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(fontMetricsInt, "paint.fontMetricsInt");
        this.fontMetrics = fontMetricsInt;
        if (getFontMetrics().descent <= getFontMetrics().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        float f10 = this.f17854t0;
        float f11 = this.f17850p0;
        int i10 = this.f17851q0;
        if (i10 == 0) {
            f6 = f11 * f10;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f6 = f11 * textSize;
        }
        this.widthPx = PlaceholderSpanKt.ceilToInt(f6);
        float f12 = this.f17852r0;
        int i11 = this.f17853s0;
        if (i11 == 0) {
            iCeilToInt = PlaceholderSpanKt.ceilToInt(f12 * f10);
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iCeilToInt = PlaceholderSpanKt.ceilToInt(f12 * textSize);
        }
        this.heightPx = iCeilToInt;
        if (fm != null) {
            fm.ascent = getFontMetrics().ascent;
            fm.descent = getFontMetrics().descent;
            fm.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm.ascent > (-getHeightPx())) {
                        fm.ascent = -getHeightPx();
                    }
                    break;
                case 1:
                case 4:
                    if (getHeightPx() + fm.ascent > fm.descent) {
                        fm.descent = getHeightPx() + fm.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fm.ascent > fm.descent - getHeightPx()) {
                        fm.ascent = fm.descent - getHeightPx();
                    }
                    break;
                case 3:
                case 6:
                    if (fm.descent - fm.ascent < getHeightPx()) {
                        int heightPx = fm.ascent - ((getHeightPx() - (fm.descent - fm.ascent)) / 2);
                        fm.ascent = heightPx;
                        fm.descent = getHeightPx() + heightPx;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fm.top = Math.min(getFontMetrics().top, fm.ascent);
            fm.bottom = Math.max(getFontMetrics().bottom, fm.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (this.f17858y0) {
            return this.widthPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
}
