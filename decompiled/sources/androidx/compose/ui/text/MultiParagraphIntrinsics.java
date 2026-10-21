package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import com.noknok.android.passportsdksvc.PassportSDKIntentActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B=\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b'\u0010+R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000eR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "b", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "placeholders", "", "c", "Lkotlin/Lazy;", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "d", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "e", "getInfoList$ui_text_release", PassportSDKIntentActivity.INFO_LIST, "", "getHasStaleResolvedFonts", "()Z", "hasStaleResolvedFonts", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n803#2:153\n804#2,5:162\n151#3,3:154\n33#3,4:157\n154#3:161\n155#3:167\n38#3:168\n156#3:169\n101#3,2:170\n33#3,6:172\n103#3:178\n1#4:179\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n95#1:153\n95#1:162,5\n95#1:154,3\n95#1:157,4\n95#1:161\n95#1:167\n95#1:168\n95#1:169\n120#1:170,2\n120#1:172,6\n120#1:178\n*E\n"})
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnnotatedString annotatedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy minIntrinsicWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy maxIntrinsicWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f17625e;

    /* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
    @SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n171#2,13:153\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n*L\n81#1:153,13\n*E\n"})
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo;
            ParagraphIntrinsics intrinsics;
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = MultiParagraphIntrinsics.this.getInfoList$ui_text_release();
            if (infoList$ui_text_release.isEmpty()) {
                paragraphIntrinsicInfo = null;
            } else {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
                float maxIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(infoList$ui_text_release);
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i10);
                        float maxIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMaxIntrinsicWidth();
                        if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                            paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                            maxIntrinsicWidth = maxIntrinsicWidth2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
            return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMaxIntrinsicWidth());
        }
    }

    /* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
    @SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n171#2,13:153\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n*L\n75#1:153,13\n*E\n"})
    public static final class b extends Lambda implements Function0<Float> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo;
            ParagraphIntrinsics intrinsics;
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = MultiParagraphIntrinsics.this.getInfoList$ui_text_release();
            if (infoList$ui_text_release.isEmpty()) {
                paragraphIntrinsicInfo = null;
            } else {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
                float minIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(infoList$ui_text_release);
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i10);
                        float minIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMinIntrinsicWidth();
                        if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                            paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                            minIntrinsicWidth = minIntrinsicWidth2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
            return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMinIntrinsicWidth());
        }
    }

    public MultiParagraphIntrinsics(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
        AnnotatedString annotatedString2 = annotatedString;
        Intrinsics.checkNotNullParameter(annotatedString2, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.annotatedString = annotatedString2;
        this.placeholders = placeholders;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.minIntrinsicWidth = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b());
        this.maxIntrinsicWidth = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a());
        ParagraphStyle paragraphStyle = style.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString2, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        int i10 = 0;
        while (i10 < size) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i10);
            AnnotatedString annotatedStringAccess$substringWithoutParagraphStyles = AnnotatedStringKt.access$substringWithoutParagraphStyles(annotatedString2, range.getStart(), range.getEnd());
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(annotatedStringAccess$substringWithoutParagraphStyles.getText(), style.merge(access$resolveTextDirection(this, range.getItem(), paragraphStyle)), annotatedStringAccess$substringWithoutParagraphStyles.getSpanStyles(), (List<AnnotatedString.Range<Placeholder>>) MultiParagraphIntrinsicsKt.access$getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd()), density, fontFamilyResolver), range.getStart(), range.getEnd()));
            i10++;
            annotatedString2 = annotatedString;
        }
        this.f17625e = arrayList;
    }

    public static final ParagraphStyle access$resolveTextDirection(MultiParagraphIntrinsics multiParagraphIntrinsics, ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        multiParagraphIntrinsics.getClass();
        TextDirection textDirection = paragraphStyle.getTextDirection();
        if (textDirection == null) {
            return paragraphStyle.m3885copyNH1kkwU((509 & 1) != 0 ? paragraphStyle.textAlign : null, (509 & 2) != 0 ? paragraphStyle.textDirection : paragraphStyle2.getTextDirection(), (509 & 4) != 0 ? paragraphStyle.lineHeight : 0L, (509 & 8) != 0 ? paragraphStyle.textIndent : null, (509 & 16) != 0 ? paragraphStyle.platformStyle : null, (509 & 32) != 0 ? paragraphStyle.lineHeightStyle : null, (509 & 64) != 0 ? paragraphStyle.lineBreak : null, (509 & 128) != 0 ? paragraphStyle.hyphens : null, (509 & 256) != 0 ? paragraphStyle.textMotion : null);
        }
        textDirection.getF18268a();
        return paragraphStyle;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        ArrayList arrayList = this.f17625e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((ParagraphIntrinsicInfo) arrayList.get(i10)).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text_release() {
        return this.f17625e;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @ReplaceWith(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public MultiParagraphIntrinsics(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        this(annotatedString, style, placeholders, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
    }
}
