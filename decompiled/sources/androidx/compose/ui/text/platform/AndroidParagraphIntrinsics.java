package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s1.d;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u00101\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00107\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010=\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006J"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "text", "Landroidx/compose/ui/text/TextStyle;", "b", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "c", "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "d", "getPlaceholders", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "e", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "f", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "g", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "", "h", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "charSequence", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "i", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics$ui_text_release", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "", "l", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTextDirectionHeuristic$ui_text_release", "()I", "textDirectionHeuristic", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "", "getHasStaleResolvedFonts", "()Z", "hasStaleResolvedFonts", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<AnnotatedString.Range<SpanStyle>> spanStyles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Density density;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidTextPaint textPaint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CharSequence charSequence;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutIntrinsics layoutIntrinsics;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public d f18196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f18197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int textDirectionHeuristic;

    /* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
    public static final class a extends Lambda implements Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> {
        public a() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Typeface invoke(FontFamily fontFamily, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis) {
            FontWeight fontWeight2 = fontWeight;
            int iM4065unboximpl = fontStyle.m4065unboximpl();
            int f17996a = fontSynthesis.getF17996a();
            Intrinsics.checkNotNullParameter(fontWeight2, "fontWeight");
            AndroidParagraphIntrinsics androidParagraphIntrinsics = AndroidParagraphIntrinsics.this;
            State<Object> stateMo4038resolveDPcqOEQ = androidParagraphIntrinsics.getFontFamilyResolver().mo4038resolveDPcqOEQ(fontFamily, fontWeight2, iM4065unboximpl, f17996a);
            if (stateMo4038resolveDPcqOEQ instanceof TypefaceResult.Immutable) {
                Object value = stateMo4038resolveDPcqOEQ.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            d dVar = new d(stateMo4038resolveDPcqOEQ, androidParagraphIntrinsics.f18196j);
            androidParagraphIntrinsics.f18196j = dVar;
            Object obj = dVar.f93140c;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List, java.util.List<androidx.compose.ui.text.AnnotatedString$Range<androidx.compose.ui.text.SpanStyle>>] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public AndroidParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(density, "density");
        this.text = text;
        this.style = style;
        this.spanStyles = spanStyles;
        this.placeholders = placeholders;
        this.fontFamilyResolver = fontFamilyResolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        this.f18197k = !AndroidParagraphIntrinsics_androidKt.access$getHasEmojiCompat(style) ? false : EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m4180resolveTextDirectionHeuristics9GRLPo0(style.m3997getTextDirectionmmuk1to(), style.getLocaleList());
        a aVar = new a();
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, style.getTextMotion());
        SpanStyle spanStyleApplySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, style.toSpanStyle(), aVar, density, !((Collection) spanStyles).isEmpty());
        if (spanStyleApplySpanStyle != null) {
            int size = spanStyles.size() + 1;
            spanStyles = new ArrayList<>(size);
            int i10 = 0;
            while (i10 < size) {
                spanStyles.add(i10 == 0 ? new AnnotatedString.Range<>(spanStyleApplySpanStyle, 0, this.text.length()) : this.spanStyles.get(i10 - 1));
                i10++;
            }
        }
        CharSequence charSequenceCreateCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, spanStyles, this.placeholders, this.density, aVar, this.f18197k);
        this.charSequence = charSequenceCreateCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(charSequenceCreateCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    @NotNull
    /* JADX INFO: renamed from: getCharSequence$ui_text_release, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        d dVar = this.f18196j;
        return (dVar != null && dVar.a()) || (!this.f18197k && AndroidParagraphIntrinsics_androidKt.access$getHasEmojiCompat(this.style) && EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue());
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutIntrinsics$ui_text_release, reason: from getter */
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @NotNull
    public final List<AnnotatedString.Range<SpanStyle>> getSpanStyles() {
        return this.spanStyles;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: getTextDirectionHeuristic$ui_text_release, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextPaint$ui_text_release, reason: from getter */
    public final AndroidTextPaint getTextPaint() {
        return this.textPaint;
    }
}
