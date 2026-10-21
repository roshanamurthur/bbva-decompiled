package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpanKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o1.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010e\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020\u0004\u0012\u0006\u0010h\u001a\u00020g\u0012\b\b\u0002\u0010i\u001a\u00020\u0002\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j\u0012\b\b\u0002\u0010l\u001a\u00020\u0002\u0012\b\b\u0002\u0010m\u001a\u00020\u0004\u0012\b\b\u0003\u0010n\u001a\u00020\u0004\u0012\b\b\u0002\u00108\u001a\u00020\u0012\u0012\b\b\u0002\u0010;\u001a\u00020\u0012\u0012\b\b\u0002\u0010o\u001a\u00020\u0002\u0012\b\b\u0002\u0010p\u001a\u00020\u0002\u0012\b\b\u0002\u0010q\u001a\u00020\u0002\u0012\b\b\u0002\u0010r\u001a\u00020\u0002\u0012\b\b\u0002\u0010s\u001a\u00020\u0002\u0012\b\b\u0002\u0010t\u001a\u00020\u0002\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010u\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010u\u0012\b\b\u0002\u0010A\u001a\u00020<¢\u0006\u0004\bx\u0010yJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002J\u0016\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0012J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u001e\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J&\u0010,\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002J\u000e\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u00101\u001a\u00020%2\u0006\u00100\u001a\u00020/J\u000f\u00104\u001a\u00020\u0012H\u0000¢\u0006\u0004\b2\u00103R\u0017\u00108\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00103R\u0017\u0010;\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00103R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010D\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u00103R \u0010L\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR\u0017\u0010Q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010U\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bR\u0010N\u0012\u0004\bT\u0010K\u001a\u0004\bS\u0010PR \u0010Y\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bV\u0010N\u0012\u0004\bX\u0010K\u001a\u0004\bW\u0010PR\u0011\u0010\\\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010^\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b]\u0010[R\u0011\u0010b\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bc\u0010P¨\u0006z"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "lineIndex", "", "getLineLeft", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "getLineEnd", "getLineVisibleEnd", "", "isLineEllipsized", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "getPrimaryHorizontal", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroid/graphics/Path;", "dest", "", "getSelectionPath", "startOffset", "endOffset", "", "array", "arrayStart", "fillBoundingBoxes", "Landroid/graphics/RectF;", "getBoundingBox", "Landroid/graphics/Canvas;", "canvas", "paint", "isFallbackLinespacingApplied$ui_text_release", "()Z", "isFallbackLinespacingApplied", "a", "Z", "getIncludePadding", "includePadding", "b", "getFallbackLineSpacing", "fallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "c", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "d", "getDidExceedMaxLines", "didExceedMaxLines", "Landroid/text/Layout;", "e", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", PluginUtils.IDENTIFIER_LAYOUT, "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLineCount", "()I", "lineCount", "g", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", "h", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "charSequence", "width", "Landroid/text/TextPaint;", "textPaint", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1033:1\n1#2:1034\n*E\n"})
public final class TextLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean includePadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean fallbackLineSpacing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutIntrinsics layoutIntrinsics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Layout layout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int lineCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int topPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int bottomPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f17812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f17813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Paint.FontMetricsInt f17815l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Rect f17816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f17817o;

    /* JADX INFO: compiled from: TextLayout.kt */
    public static final class a extends Lambda implements Function0<LayoutHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutHelper invoke() {
            return new LayoutHelper(TextLayout.this.getLayout());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public TextLayout(@NotNull CharSequence charSequence, float f6, @NotNull TextPaint textPaint, int i10, @Nullable TextUtils.TruncateAt truncateAt, int i11, float f10, @Px float f11, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull LayoutIntrinsics layoutIntrinsics) {
        boolean z12;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutCreate;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics, "layoutIntrinsics");
        this.includePadding = z10;
        this.fallbackLineSpacing = z11;
        this.layoutIntrinsics = layoutIntrinsics;
        this.f17816n = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayoutKt.getTextDirectionHeuristic(i11);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d2 = f6;
            int iCeil = (int) Math.ceil(d2);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f6 || z14) {
                z12 = true;
                this.f17814k = false;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                layoutCreate = StaticLayoutFactory.INSTANCE.create(charSequence, 0, charSequence.length(), textPaint, iCeil, textDirectionHeuristic2, alignment, i12, truncateAt, (int) Math.ceil(d2), f10, f11, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                this.f17814k = true;
                z12 = true;
                layoutCreate = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z10, z11, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristic2;
                z13 = false;
            }
            this.layout = layoutCreate;
            Trace.endSection();
            int iMin = Math.min(layoutCreate.getLineCount(), i12);
            this.lineCount = iMin;
            int i18 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i12 && (layoutCreate.getEllipsisCount(i18) > 0 || layoutCreate.getLineEnd(i18) != charSequence.length())) ? z12 : z13;
            long jAccess$getVerticalPaddings = TextLayoutKt.access$getVerticalPaddings(this);
            LineHeightStyleSpan[] lineHeightStyleSpanArrAccess$getLineHeightSpans = TextLayoutKt.access$getLineHeightSpans(this);
            long jAccess$getLineHeightPaddings = TextLayoutKt.access$getLineHeightPaddings(this, lineHeightStyleSpanArrAccess$getLineHeightSpans);
            this.topPadding = Math.max(VerticalPaddings.m4005getTopPaddingimpl(jAccess$getVerticalPaddings), VerticalPaddings.m4005getTopPaddingimpl(jAccess$getLineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m4004getBottomPaddingimpl(jAccess$getVerticalPaddings), VerticalPaddings.m4004getBottomPaddingimpl(jAccess$getLineHeightPaddings));
            Paint.FontMetricsInt fontMetricsIntAccess$getLastLineMetrics = TextLayoutKt.access$getLastLineMetrics(this, textPaint, textDirectionHeuristic, lineHeightStyleSpanArrAccess$getLineHeightSpans);
            this.m = fontMetricsIntAccess$getLastLineMetrics != null ? fontMetricsIntAccess$getLastLineMetrics.bottom - ((int) getLineHeight(i18)) : z13;
            this.f17815l = fontMetricsIntAccess$getLastLineMetrics;
            this.f17812i = IndentationFixSpanKt.getEllipsizedLeftPadding$default(layoutCreate, i18, null, 2, null);
            this.f17813j = IndentationFixSpanKt.getEllipsizedRightPadding$default(layoutCreate, i18, null, 2, null);
            this.f17817o = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayout.getPrimaryHorizontal(i10, z10);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayout.getSecondaryHorizontal(i10, z10);
    }

    public final float a(int i10) {
        if (i10 == this.lineCount - 1) {
            return this.f17812i + this.f17813j;
        }
        return 0.0f;
    }

    public final void fillBoundingBoxes(int startOffset, int endOffset, @NotNull float[] array, int arrayStart) {
        boolean z10;
        float fA;
        float fA2;
        TextLayout textLayout = this;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = getText().length();
        if (startOffset < 0) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (startOffset >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (endOffset <= startOffset) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (endOffset > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (array.length - arrayStart < (endOffset - startOffset) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int lineForOffset = getLineForOffset(startOffset);
        int lineForOffset2 = textLayout.getLineForOffset(endOffset - 1);
        c cVar = new c(textLayout);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i10 = lineForOffset;
        int i11 = arrayStart;
        while (true) {
            int lineStart = textLayout.getLineStart(i10);
            int lineEnd = textLayout.getLineEnd(i10);
            int iMax = Math.max(startOffset, lineStart);
            int iMin = Math.min(endOffset, lineEnd);
            float lineTop = textLayout.getLineTop(i10);
            float lineBottom = textLayout.getLineBottom(i10);
            boolean z11 = false;
            boolean z12 = textLayout.getParagraphDirection(i10) == 1;
            boolean z13 = !z12;
            while (iMax < iMin) {
                boolean zIsRtlCharAt = textLayout.isRtlCharAt(iMax);
                if (!z12 || zIsRtlCharAt) {
                    if (z12 && zIsRtlCharAt) {
                        float fA3 = cVar.a(false, false, false, iMax);
                        fA = cVar.a(true, true, false, iMax + 1);
                        z10 = false;
                        fA2 = fA3;
                    } else if (z13 && zIsRtlCharAt) {
                        float fA4 = cVar.a(false, false, true, iMax);
                        fA = cVar.a(true, true, true, iMax + 1);
                        fA2 = fA4;
                    } else {
                        z10 = false;
                        fA = cVar.a(false, false, false, iMax);
                        fA2 = cVar.a(true, true, false, iMax + 1);
                    }
                    array[i11] = fA;
                    array[i11 + 1] = lineTop;
                    array[i11 + 2] = fA2;
                    array[i11 + 3] = lineBottom;
                    i11 += 4;
                    iMax++;
                    z11 = z10;
                    textLayout = this;
                } else {
                    fA = cVar.a(z11, z11, true, iMax);
                    fA2 = cVar.a(true, true, true, iMax + 1);
                }
                z10 = false;
                array[i11] = fA;
                array[i11 + 1] = lineTop;
                array[i11 + 2] = fA2;
                array[i11 + 3] = lineBottom;
                i11 += 4;
                iMax++;
                z11 = z10;
                textLayout = this;
            }
            if (i10 == lineForOffset2) {
                return;
            }
            i10++;
            textLayout = this;
        }
    }

    /* JADX INFO: renamed from: getBottomPadding$ui_text_release, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final RectF getBoundingBox(int offset) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(offset);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z10 = getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(offset, false);
                primaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            } else if (zIsRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(offset, false);
                primaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(offset, false);
                secondaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            }
            float f6 = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f6;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(offset, false);
            secondaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        boolean z10 = this.didExceedMaxLines;
        Layout layout = this.layout;
        return (z10 ? layout.getLineBottom(this.lineCount - 1) : layout.getHeight()) + this.topPadding + this.bottomPadding + this.m;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.f17815l) == null) ? this.layout.getLineAscent(line) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.topPadding + ((line != this.lineCount + (-1) || (fontMetricsInt = this.f17815l) == null) ? this.layout.getLineBaseline(line) : getLineTop(line) - fontMetricsInt.ascent);
    }

    public final float getLineBottom(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        int i10 = this.lineCount;
        int i11 = i10 - 1;
        Layout layout = this.layout;
        if (line != i11 || (fontMetricsInt = this.f17815l) == null) {
            return this.topPadding + layout.getLineBottom(line) + (line == i10 + (-1) ? this.bottomPadding : 0);
        }
        return layout.getLineBottom(line - 1) + fontMetricsInt.bottom;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.f17815l) == null) ? this.layout.getLineDescent(line) : fontMetricsInt.descent;
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        Layout layout = this.layout;
        return layout.getEllipsisStart(lineIndex) == 0 ? layout.getLineEnd(lineIndex) : layout.getText().length();
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float getLineHeight(int lineIndex) {
        return getLineBottom(lineIndex) - getLineTop(lineIndex);
    }

    public final float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.f17812i : 0.0f);
    }

    public final float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.f17813j : 0.0f);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float getLineTop(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        Layout layout = this.layout;
        if (layout.getEllipsisStart(lineIndex) == 0) {
            return layout.getLineVisibleEnd(lineIndex);
        }
        return layout.getEllipsisStart(lineIndex) + layout.getLineStart(lineIndex);
    }

    public final float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, (a(line) * (-1)) + horizontal);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float getPrimaryHorizontal(int offset, boolean upstream) {
        return a(getLineForOffset(offset)) + ((LayoutHelper) this.f17817o.getValue()).getHorizontalPosition(offset, true, upstream);
    }

    public final float getSecondaryHorizontal(int offset, boolean upstream) {
        return a(getLineForOffset(offset)) + ((LayoutHelper) this.f17817o.getValue()).getHorizontalPosition(offset, false, upstream);
    }

    public final void getSelectionPath(int start, int end, @NotNull Path dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.layout.getSelectionPath(start, end, dest);
        int i10 = this.topPadding;
        if (i10 == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, i10);
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = this.layout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    /* JADX INFO: renamed from: getTopPadding$ui_text_release, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        boolean z10 = this.f17814k;
        Layout layout = this.layout;
        if (z10) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return TextLayoutKt.isLineEllipsized(this.layout, lineIndex);
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void paint(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (canvas.getClipBounds(this.f17816n)) {
            int i10 = this.topPadding;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayoutKt.f17819a;
            textAndroidCanvas.setCanvas(canvas);
            this.layout.draw(textAndroidCanvas);
            if (i10 != 0) {
                canvas.translate(0.0f, (-1) * i10);
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f6, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f10, float f11, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        this(charSequence, f6, textPaint, i19, truncateAt2, i20, (i18 & 64) != 0 ? 1.0f : f10, (i18 & 128) != 0 ? 0.0f : f11, (i18 & 256) != 0 ? false : z10, (i18 & 512) != 0 ? true : z11, (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12, (i18 & 2048) != 0 ? 0 : i13, (i18 & 4096) != 0 ? 0 : i14, (i18 & 8192) != 0 ? 0 : i15, (i18 & 16384) != 0 ? 0 : i16, (32768 & i18) != 0 ? 0 : i17, (65536 & i18) != 0 ? null : iArr, (131072 & i18) != 0 ? null : iArr2, (i18 & 262144) != 0 ? new LayoutIntrinsics(charSequence, textPaint, i20) : layoutIntrinsics);
    }
}
