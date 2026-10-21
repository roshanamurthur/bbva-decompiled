package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.o1;
import androidx.collection.h;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import n1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010S\u001a\u00020N\u0012\u0006\u0010X\u001a\u00020\u0004\u0012\u0006\u0010]\u001a\u00020.\u0012\u0006\u0010c\u001a\u00020^ø\u0001\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001B|\b\u0016\u0012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001\u0012\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001\u0012\u0015\u0010\u0095\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u00010l\u0012\u0015\u0010\u0097\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0096\u00010\u0093\u00010l\u0012\u0006\u0010X\u001a\u00020\u0004\u0012\u0006\u0010]\u001a\u00020.\u0012\u0006\u0010c\u001a\u00020^\u0012\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001\u0012\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001ø\u0001\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u009c\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J+\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010$J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b(\u0010$J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0018\u00100\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0016J\u0010\u00101\u001a\u00020.2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u00104\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u00103\u001a\u00020.H\u0016J\u0010\u00106\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u00107\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J9\u0010B\u001a\u00020\u00132\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJK\u0010B\u001a\u00020\u00132\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010F\u001a\u00020EH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJS\u0010B\u001a\u00020\u00132\u0006\u00109\u001a\u0002082\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010F\u001a\u00020EH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MR\u0017\u0010S\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010]\u001a\u00020.8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010c\u001a\u00020^8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010k\u001a\u00020d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\be\u0010f\u0012\u0004\bi\u0010j\u001a\u0004\bg\u0010hR\"\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010v\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010sR\u0014\u0010x\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010sR\u0014\u0010z\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010sR\u0014\u0010|\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010sR\u0014\u0010~\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010sR\u0015\u0010\u0080\u0001\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\\R\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0084\u0001\u0010j\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0087\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010WR\u001f\u0010\u008c\u0001\u001a\u00030\u0088\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u008b\u0001\u0010j\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u009d\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "", "vertical", "", "getLineForVerticalPosition", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "range", "", "array", "arrayStart", "", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "getCursorRect", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "lineIndex", "getLineLeft", "getLineRight", "getLineTop", "getLineAscent$ui_text_release", "(I)F", "getLineAscent", "getLineBaseline$ui_text_release", "getLineBaseline", "getLineDescent$ui_text_release", "getLineDescent", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "", "visibleEnd", "getLineEnd", "isLineEllipsized", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "a", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxLines", "()I", "maxLines", "c", "Z", "getEllipsis", "()Z", "ellipsis", "Landroidx/compose/ui/unit/Constraints;", "d", "J", "getConstraints-msEJaDk", "()J", "constraints", "", "f", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", "", "g", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "getWidth", "()F", "width", "getHeight", "height", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "didExceedMaxLines", "Ljava/util/Locale;", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "textLocale", "getLineCount", "lineCount", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "textPaint", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,619:1\n1#2:620\n13579#3,2:621\n11335#3:623\n11670#3,3:624\n26#4:627\n26#4:628\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n204#1:621,2\n244#1:623\n244#1:624,3\n439#1:627\n443#1:628\n*E\n"})
public final class AndroidParagraph implements Paragraph {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidParagraphIntrinsics paragraphIntrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int maxLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean ellipsis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long constraints;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TextLayout f17576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CharSequence charSequence;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Rect> placeholderRects;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Lazy f17579h;

    /* JADX INFO: compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidParagraph(AndroidParagraphIntrinsics paragraphIntrinsics, int i10, boolean z10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11;
        ShaderBrushSpan[] brushSpans;
        List<Rect> listEmptyList;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float heightPx2;
        float lineBaseline2;
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        this.paragraphIntrinsics = paragraphIntrinsics;
        this.maxLines = i10;
        this.ellipsis = z10;
        this.constraints = j10;
        if (Constraints.m4358getMinHeightimpl(j10) != 0 || Constraints.m4359getMinWidthimpl(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        TextStyle style = paragraphIntrinsics.getStyle();
        this.charSequence = AndroidParagraph_androidKt.access$shouldAttachIndentationFixSpan(style, z10) ? AndroidParagraph_androidKt.access$attachIndentationFixSpan(paragraphIntrinsics.getCharSequence()) : paragraphIntrinsics.getCharSequence();
        int iM3852access$toLayoutAlignAMY3VfE = AndroidParagraph_androidKt.m3852access$toLayoutAlignAMY3VfE(style.m3996getTextAlignbuA522U());
        TextAlign textAlignM3996getTextAlignbuA522U = style.m3996getTextAlignbuA522U();
        boolean zM4292equalsimpl0 = textAlignM3996getTextAlignbuA522U == null ? false : TextAlign.m4292equalsimpl0(textAlignM3996getTextAlignbuA522U.getF18258a(), TextAlign.INSTANCE.m4298getJustifye0LSkKk());
        int iM3854access$toLayoutHyphenationFrequency0_XeFpE = AndroidParagraph_androidKt.m3854access$toLayoutHyphenationFrequency0_XeFpE(style.getParagraphStyle().getHyphens());
        LineBreak lineBreakM3994getLineBreakLgCVezo = style.m3994getLineBreakLgCVezo();
        int iM3853access$toLayoutBreakStrategyu6PBz3U = AndroidParagraph_androidKt.m3853access$toLayoutBreakStrategyu6PBz3U(lineBreakM3994getLineBreakLgCVezo != null ? LineBreak.Strategy.m4234boximpl(LineBreak.m4225getStrategyfcGXIks(lineBreakM3994getLineBreakLgCVezo.getF18227a())) : null);
        LineBreak lineBreakM3994getLineBreakLgCVezo2 = style.m3994getLineBreakLgCVezo();
        int iM3855access$toLayoutLineBreakStyle4a2g8L8 = AndroidParagraph_androidKt.m3855access$toLayoutLineBreakStyle4a2g8L8(lineBreakM3994getLineBreakLgCVezo2 != null ? LineBreak.Strictness.m4244boximpl(LineBreak.m4226getStrictnessusljTpc(lineBreakM3994getLineBreakLgCVezo2.getF18227a())) : null);
        LineBreak lineBreakM3994getLineBreakLgCVezo3 = style.m3994getLineBreakLgCVezo();
        int iM3856access$toLayoutLineBreakWordStylegvcdTPQ = AndroidParagraph_androidKt.m3856access$toLayoutLineBreakWordStylegvcdTPQ(lineBreakM3994getLineBreakLgCVezo3 != null ? LineBreak.WordBreak.m4255boximpl(LineBreak.m4227getWordBreakjp8hJ3c(lineBreakM3994getLineBreakLgCVezo3.getF18227a())) : null);
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        TextLayout textLayoutA = a(iM3852access$toLayoutAlignAMY3VfE, zM4292equalsimpl0 ? 1 : 0, truncateAt, i10, iM3854access$toLayoutHyphenationFrequency0_XeFpE, iM3853access$toLayoutBreakStrategyu6PBz3U, iM3855access$toLayoutLineBreakStyle4a2g8L8, iM3856access$toLayoutLineBreakWordStylegvcdTPQ);
        if (!z10 || textLayoutA.getHeight() <= Constraints.m4356getMaxHeightimpl(j10) || i10 <= 1) {
            this.f17576e = textLayoutA;
        } else {
            int iAccess$numberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.access$numberOfLinesThatFitMaxHeight(textLayoutA, Constraints.m4356getMaxHeightimpl(j10));
            if (iAccess$numberOfLinesThatFitMaxHeight >= 0 && iAccess$numberOfLinesThatFitMaxHeight != i10) {
                textLayoutA = a(iM3852access$toLayoutAlignAMY3VfE, zM4292equalsimpl0 ? 1 : 0, truncateAt, c.coerceAtLeast(iAccess$numberOfLinesThatFitMaxHeight, 1), iM3854access$toLayoutHyphenationFrequency0_XeFpE, iM3853access$toLayoutBreakStrategyu6PBz3U, iM3855access$toLayoutLineBreakStyle4a2g8L8, iM3856access$toLayoutLineBreakWordStylegvcdTPQ);
            }
            this.f17576e = textLayoutA;
        }
        getTextPaint$ui_text_release().m4187setBrush12SF9DM(style.getBrush(), SizeKt.Size(getWidth(), getHeight()), style.getAlpha());
        TextLayout textLayout = this.f17576e;
        if (textLayout.getText() instanceof Spanned) {
            i11 = 0;
            CharSequence text = textLayout.getText();
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
            brushSpans = (ShaderBrushSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
            Intrinsics.checkNotNullExpressionValue(brushSpans, "brushSpans");
            if (brushSpans.length == 0) {
                brushSpans = new ShaderBrushSpan[0];
            }
        } else {
            i11 = 0;
            brushSpans = new ShaderBrushSpan[0];
        }
        int length = brushSpans.length;
        for (int i12 = i11; i12 < length; i12++) {
            brushSpans[i12].m4196setSizeuvyYCjk(SizeKt.Size(getWidth(), getHeight()));
        }
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence).getSpans(i11, charSequence.length(), PlaceholderSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            int length2 = spans.length;
            for (int i13 = i11; i13 < length2; i13++) {
                PlaceholderSpan placeholderSpan = (PlaceholderSpan) spans[i13];
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(placeholderSpan);
                int spanEnd = spanned.getSpanEnd(placeholderSpan);
                int lineForOffset = this.f17576e.getLineForOffset(spanStart);
                int i14 = lineForOffset >= this.maxLines ? 1 : i11;
                int i15 = (this.f17576e.getLineEllipsisCount(lineForOffset) <= 0 || spanEnd <= this.f17576e.getLineEllipsisOffset(lineForOffset)) ? i11 : 1;
                int i16 = spanEnd > this.f17576e.getLineEnd(lineForOffset) ? 1 : i11;
                if (i15 == 0 && i16 == 0 && i14 == 0) {
                    int i17 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                    if (i17 == 1) {
                        horizontalPosition = getHorizontalPosition(spanStart, true);
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                    }
                    float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                    TextLayout textLayout2 = this.f17576e;
                    switch (placeholderSpan.getVerticalAlign()) {
                        case 0:
                            lineBaseline = textLayout2.getLineBaseline(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 1:
                            lineTop = textLayout2.getLineTop(lineForOffset);
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 2:
                            lineBaseline = textLayout2.getLineBottom(lineForOffset);
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 3:
                            lineTop = ((textLayout2.getLineBottom(lineForOffset) + textLayout2.getLineTop(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 4:
                            heightPx2 = placeholderSpan.getFontMetrics().ascent;
                            lineBaseline2 = textLayout2.getLineBaseline(lineForOffset);
                            lineTop = lineBaseline2 + heightPx2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 5:
                            lineBaseline = textLayout2.getLineBaseline(lineForOffset) + placeholderSpan.getFontMetrics().descent;
                            heightPx = placeholderSpan.getHeightPx();
                            lineTop = lineBaseline - heightPx;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                            heightPx2 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                            lineBaseline2 = textLayout2.getLineBaseline(lineForOffset);
                            lineTop = lineBaseline2 + heightPx2;
                            rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                } else {
                    rect = null;
                }
                arrayList.add(rect);
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this.placeholderRects = listEmptyList;
        this.f17579h = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a(this));
    }

    public final TextLayout a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        CharSequence charSequence = this.charSequence;
        float width = getWidth();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.paragraphIntrinsics;
        return new TextLayout(charSequence, width, textPaint$ui_text_release, i10, truncateAt, androidParagraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(androidParagraphIntrinsics.getStyle()), true, i12, i14, i15, i16, i13, i11, null, null, androidParagraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    public final void b(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f17576e.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final void m3845fillBoundingBoxes8ffj60Q(long range, @NotNull float[] array, int arrayStart) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f17576e.fillBoundingBoxes(TextRange.m3965getMinimpl(range), TextRange.m3964getMaximpl(range), array, arrayStart);
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getBidiRunDirection(int offset) {
        return this.f17576e.isRtlCharAt(offset) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getBoundingBox(int offset) {
        RectF boundingBox = this.f17576e.getBoundingBox(offset);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @NotNull
    /* JADX INFO: renamed from: getCharSequence$ui_text_release, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getCursorRect(int offset) {
        CharSequence charSequence = this.charSequence;
        if (offset < 0 || offset > charSequence.length()) {
            StringBuilder sbC = o1.c("offset(", offset, ") is out of bounds (0,");
            sbC.append(charSequence.length());
            throw new AssertionError(sbC.toString());
        }
        TextLayout textLayout = this.f17576e;
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(textLayout, offset, false, 2, null);
        int lineForOffset = textLayout.getLineForOffset(offset);
        return new Rect(primaryHorizontal$default, textLayout.getLineTop(lineForOffset), primaryHorizontal$default, textLayout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.f17576e.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.f17576e.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        TextLayout textLayout = this.f17576e;
        return usePrimaryDirection ? TextLayout.getPrimaryHorizontal$default(textLayout, offset, false, 2, null) : TextLayout.getSecondaryHorizontal$default(textLayout, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int lineIndex) {
        return this.f17576e.getLineAscent(lineIndex);
    }

    public final float getLineBaseline$ui_text_release(int lineIndex) {
        return this.f17576e.getLineBaseline(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int lineIndex) {
        return this.f17576e.getLineBottom(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.f17576e.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int lineIndex) {
        return this.f17576e.getLineDescent(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int lineIndex, boolean visibleEnd) {
        TextLayout textLayout = this.f17576e;
        return visibleEnd ? textLayout.getLineVisibleEnd(lineIndex) : textLayout.getLineEnd(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int offset) {
        return this.f17576e.getLineForOffset(offset);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float vertical) {
        return this.f17576e.getLineForVertical((int) vertical);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int lineIndex) {
        return this.f17576e.getLineHeight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int lineIndex) {
        return this.f17576e.getLineLeft(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int lineIndex) {
        return this.f17576e.getLineRight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int lineIndex) {
        return this.f17576e.getLineStart(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int lineIndex) {
        return this.f17576e.getLineTop(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int lineIndex) {
        return this.f17576e.getLineWidth(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo3847getOffsetForPositionk4lQ0M(long position) {
        int iM2276getYimpl = (int) Offset.m2276getYimpl(position);
        TextLayout textLayout = this.f17576e;
        return textLayout.getOffsetForHorizontal(textLayout.getLineForVertical(iM2276getYimpl), Offset.m2275getXimpl(position));
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getParagraphDirection(int offset) {
        TextLayout textLayout = this.f17576e;
        return textLayout.getParagraphDirection(textLayout.getLineForOffset(offset)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @NotNull
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Path getPathForRange(int start, int end) {
        CharSequence charSequence = this.charSequence;
        if (start >= 0 && start <= end && end <= charSequence.length()) {
            android.graphics.Path path = new android.graphics.Path();
            this.f17576e.getSelectionPath(start, end, path);
            return AndroidPath_androidKt.asComposePath(path);
        }
        StringBuilder sbE = h.e("Start(", start, ") or End(", end, ") is out of Range(0..");
        sbE.append(charSequence.length());
        sbE.append("), or start > end!");
        throw new AssertionError(sbE.toString());
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @NotNull
    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.paragraphIntrinsics.getTextPaint().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    @NotNull
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m4357getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo3848getWordBoundaryjx7JFs(int offset) {
        Lazy lazy = this.f17579h;
        return TextRangeKt.TextRange(((WordBoundary) lazy.getValue()).getWordStart(offset), ((WordBoundary) lazy.getValue()).getWordEnd(offset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int lineIndex) {
        return this.f17576e.isLineEllipsized(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public void mo3849paintLG529CI(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iM4185getBlendMode0nO6VwU = getTextPaint$ui_text_release().m4185getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4188setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m4186setBlendModes9anfk8(blendMode);
        b(canvas);
        getTextPaint$ui_text_release().m4186setBlendModes9anfk8(iM4185getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo3850paintRPmYEkk(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4188setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        b(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo3851painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        int iM4185getBlendMode0nO6VwU = getTextPaint$ui_text_release().m4185getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4187setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), alpha);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m4186setBlendModes9anfk8(blendMode);
        b(canvas);
        getTextPaint$ui_text_release().m4186setBlendModes9anfk8(iM4185getBlendMode0nO6VwU);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph(String text, TextStyle style, List spanStyles, List placeholders, int i10, boolean z10, long j10, FontFamily.Resolver fontFamilyResolver, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density), i10, z10, j10, null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(density, "density");
    }
}
