package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\b\u0007\u0018\u00002\u00020\u0001Bt\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cø\u0001\u0001¢\u0006\u0004\bU\u0010VB:\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bø\u0001\u0001¢\u0006\u0004\bU\u0010WBR\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0001¢\u0006\u0004\bU\u0010XBj\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018ø\u0001\u0001¢\u0006\u0004\bU\u0010YJ\u0014\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\u0002JC\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015Js\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ}\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020$H\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR#\u0010N\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR#\u0010Q\u001a\u00020\u00168\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010MR#\u0010T\u001a\u00020\u00188\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bS\u0010M\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "other", "merge", "plus", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "b", "Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "c", "J", "getLineHeight-XSAIIZE", "()J", "d", "Landroidx/compose/ui/text/style/TextIndent;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "e", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "f", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "g", "Landroidx/compose/ui/text/style/LineBreak;", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "h", "Landroidx/compose/ui/text/style/Hyphens;", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "i", "Landroidx/compose/ui/text/style/TextMotion;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "j", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTextAlignOrDefault-e0LSkKk$ui_text_release", "()I", "textAlignOrDefault", "k", "getLineBreakOrDefault-rAG3T2k$ui_text_release", "lineBreakOrDefault", "l", "getHyphensOrDefault-vmbZdU8$ui_text_release", "hyphensOrDefault", "<init>", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class ParagraphStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextAlign textAlign;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextDirection textDirection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long lineHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextIndent textIndent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PlatformParagraphStyle platformStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LineHeightStyle lineHeightStyle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LineBreak lineBreak;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Hyphens hyphens;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextMotion textMotion;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int textAlignOrDefault;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int lineBreakOrDefault;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int hyphensOrDefault;

    public ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this.textAlign = textAlign;
        this.textDirection = textDirection;
        this.lineHeight = j10;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = lineBreak;
        this.hyphens = hyphens;
        this.textMotion = textMotion;
        this.textAlignOrDefault = textAlign != null ? textAlign.getF18258a() : TextAlign.INSTANCE.m4301getStarte0LSkKk();
        this.lineBreakOrDefault = lineBreak != null ? lineBreak.getF18227a() : LineBreak.INSTANCE.m4233getSimplerAG3T2k();
        this.hyphensOrDefault = hyphens != null ? hyphens.getF18223a() : Hyphens.INSTANCE.m4218getNonevmbZdU8();
        if (TextUnit.m4567equalsimpl0(j10, TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE()) || TextUnit.m4570getValueimpl(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m4570getValueimpl(j10) + RootService.CLOSE_BRACKET).toString());
    }

    /* JADX INFO: renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m3880copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = paragraphStyle.textAlign;
        }
        if ((i10 & 2) != 0) {
            textDirection = paragraphStyle.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m3884copyElsmlbk(textAlign, textDirection2, j11, textIndent);
    }

    /* JADX INFO: renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m3883copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = paragraphStyle.textAlign;
        }
        if ((i10 & 2) != 0) {
            textDirection = paragraphStyle.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        if ((i10 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i10 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m3887copyxPh5V4g(textAlign, textDirection2, j11, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m3884copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-NH1kkwU, reason: not valid java name */
    public final ParagraphStyle m3885copyNH1kkwU(@Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformParagraphStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, @Nullable LineBreak lineBreak, @Nullable Hyphens hyphens, @Nullable TextMotion textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m3886copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m3887copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return Intrinsics.areEqual(this.textAlign, paragraphStyle.textAlign) && Intrinsics.areEqual(this.textDirection, paragraphStyle.textDirection) && TextUnit.m4567equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) && Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && Intrinsics.areEqual(this.lineBreak, paragraphStyle.lineBreak) && Intrinsics.areEqual(this.hyphens, paragraphStyle.hyphens) && Intrinsics.areEqual(this.textMotion, paragraphStyle.textMotion);
    }

    @Nullable
    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name and from getter */
    public final Hyphens getHyphens() {
        return this.hyphens;
    }

    /* JADX INFO: renamed from: getHyphensOrDefault-vmbZdU8$ui_text_release, reason: not valid java name and from getter */
    public final int getHyphensOrDefault() {
        return this.hyphensOrDefault;
    }

    @Nullable
    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name and from getter */
    public final LineBreak getLineBreak() {
        return this.lineBreak;
    }

    /* JADX INFO: renamed from: getLineBreakOrDefault-rAG3T2k$ui_text_release, reason: not valid java name and from getter */
    public final int getLineBreakOrDefault() {
        return this.lineBreakOrDefault;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    @Nullable
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    @Nullable
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name and from getter */
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: getTextAlignOrDefault-e0LSkKk$ui_text_release, reason: not valid java name and from getter */
    public final int getTextAlignOrDefault() {
        return this.textAlignOrDefault;
    }

    @Nullable
    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name and from getter */
    public final TextDirection getTextDirection() {
        return this.textDirection;
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    @Nullable
    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        TextAlign textAlign = this.textAlign;
        int iM4293hashCodeimpl = (textAlign != null ? TextAlign.m4293hashCodeimpl(textAlign.getF18258a()) : 0) * 31;
        TextDirection textDirection = this.textDirection;
        int iM4571hashCodeimpl = (TextUnit.m4571hashCodeimpl(this.lineHeight) + ((iM4293hashCodeimpl + (textDirection != null ? TextDirection.m4306hashCodeimpl(textDirection.getF18268a()) : 0)) * 31)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iM4571hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31;
        LineBreak lineBreak = this.lineBreak;
        int iM4228hashCodeimpl = (iHashCode3 + (lineBreak != null ? LineBreak.m4228hashCodeimpl(lineBreak.getF18227a()) : 0)) * 31;
        Hyphens hyphens = this.hyphens;
        int iM4214hashCodeimpl = (iM4228hashCodeimpl + (hyphens != null ? Hyphens.m4214hashCodeimpl(hyphens.getF18223a()) : 0)) * 31;
        TextMotion textMotion = this.textMotion;
        return iM4214hashCodeimpl + (textMotion != null ? textMotion.hashCode() : 0);
    }

    @Stable
    @NotNull
    public final ParagraphStyle merge(@Nullable ParagraphStyle other) {
        return other == null ? this : ParagraphStyleKt.m3896fastMergeHtYhynw(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    @Stable
    @NotNull
    public final ParagraphStyle plus(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @NotNull
    public String toString() {
        return "ParagraphStyle(textAlign=" + this.textAlign + ", textDirection=" + this.textDirection + ", lineHeight=" + ((Object) TextUnit.m4577toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + this.lineBreak + ", hyphens=" + this.hyphens + ", textMotion=" + this.textMotion + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) != 0 ? null : hyphens, (i10 & 256) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j10, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) == 0 ? lineHeightStyle : null, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) == 0 ? hyphens : null, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, (TextMotion) null, (DefaultConstructorMarker) null);
    }
}
