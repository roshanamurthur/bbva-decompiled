package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.annotation.FloatRange;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LineHeightStyleSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\b\u001a\u00020\u0014\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0001\u0010'\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J)\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010&\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "", "text", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "spanStartVertical", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", "startIndex", "endIndex", "", "trimFirstLineTop", "copy$ui_text_release", "(IIZ)Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "copy", "", "a", "F", "getLineHeight", "()F", "e", "Z", "getTrimLastLineBottom", "()Z", "trimLastLineBottom", "<set-?>", "k", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFirstAscentDiff", "()I", "firstAscentDiff", "l", "getLastDescentDiff", "lastDescentDiff", "topRatio", "<init>", "(FIIZZF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float lineHeight;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean trimLastLineBottom;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f17843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17844g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17845h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17846i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17847j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int firstAscentDiff;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int lastDescentDiff;

    public LineHeightStyleSpan(float f6, int i10, int i11, boolean z10, boolean z11, @FloatRange(from = -1.0d, to = 1.0d) float f10) {
        this.lineHeight = f6;
        this.f17839b = i10;
        this.f17840c = i11;
        this.f17841d = z10;
        this.trimLastLineBottom = z11;
        this.f17843f = f10;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = lineHeightStyleSpan.f17841d;
        }
        return lineHeightStyleSpan.copy$ui_text_release(i10, i11, z10);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int start, int end, int spanStartVertical, int lineHeight, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = start == this.f17839b;
        boolean z11 = end == this.f17840c;
        boolean z12 = this.trimLastLineBottom;
        boolean z13 = this.f17841d;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f17844g == Integer.MIN_VALUE) {
            int iLineHeight = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
            int iCeil = (int) Math.ceil(this.lineHeight);
            int i10 = iCeil - iLineHeight;
            float fAbs = this.f17843f;
            if (fAbs == -1.0f) {
                fAbs = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
            }
            int iCeil2 = (int) (i10 <= 0 ? Math.ceil(i10 * fAbs) : Math.ceil((1.0f - fAbs) * i10));
            int i11 = fontMetricsInt.descent;
            int i12 = iCeil2 + i11;
            this.f17846i = i12;
            int i13 = i12 - iCeil;
            this.f17845h = i13;
            if (z13) {
                i13 = fontMetricsInt.ascent;
            }
            this.f17844g = i13;
            if (z12) {
                i12 = i11;
            }
            this.f17847j = i12;
            this.firstAscentDiff = fontMetricsInt.ascent - i13;
            this.lastDescentDiff = i12 - i11;
        }
        fontMetricsInt.ascent = z10 ? this.f17844g : this.f17845h;
        fontMetricsInt.descent = z11 ? this.f17847j : this.f17846i;
    }

    @NotNull
    public final LineHeightStyleSpan copy$ui_text_release(int startIndex, int endIndex, boolean trimFirstLineTop) {
        return new LineHeightStyleSpan(this.lineHeight, startIndex, endIndex, trimFirstLineTop, this.trimLastLineBottom, this.f17843f);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}
