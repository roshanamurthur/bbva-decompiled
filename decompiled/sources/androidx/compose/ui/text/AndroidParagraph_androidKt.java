package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidParagraph_androidKt {
    public static final CharSequence access$attachIndentationFixSpan(CharSequence charSequence) {
        int length = charSequence.length();
        CharSequence charSequence2 = charSequence;
        if (length != 0) {
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
            charSequence2 = spannableString;
        }
        return charSequence2;
    }

    public static final int access$numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i10) {
        int lineCount = textLayout.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (textLayout.getLineBottom(i11) > i10) {
                return i11;
            }
        }
        return textLayout.getLineCount();
    }

    public static final boolean access$shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z10) {
        if (!z10 || TextUnit.m4567equalsimpl0(textStyle.m3993getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m4567equalsimpl0(textStyle.m3993getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE()) || textStyle.m3996getTextAlignbuA522U() == null) {
            return false;
        }
        TextAlign textAlignM3996getTextAlignbuA522U = textStyle.m3996getTextAlignbuA522U();
        TextAlign.Companion companion = TextAlign.INSTANCE;
        int iM4301getStarte0LSkKk = companion.m4301getStarte0LSkKk();
        if (textAlignM3996getTextAlignbuA522U != null && TextAlign.m4292equalsimpl0(textAlignM3996getTextAlignbuA522U.getF18258a(), iM4301getStarte0LSkKk)) {
            return false;
        }
        TextAlign textAlignM3996getTextAlignbuA522U2 = textStyle.m3996getTextAlignbuA522U();
        return textAlignM3996getTextAlignbuA522U2 == null || !TextAlign.m4292equalsimpl0(textAlignM3996getTextAlignbuA522U2.getF18258a(), companion.m4298getJustifye0LSkKk());
    }

    /* JADX INFO: renamed from: access$toLayoutAlign-AMY3VfE, reason: not valid java name */
    public static final int m3852access$toLayoutAlignAMY3VfE(TextAlign textAlign) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        int iM4299getLefte0LSkKk = companion.m4299getLefte0LSkKk();
        if (textAlign != null && TextAlign.m4292equalsimpl0(textAlign.getF18258a(), iM4299getLefte0LSkKk)) {
            return 3;
        }
        int iM4300getRighte0LSkKk = companion.m4300getRighte0LSkKk();
        if (textAlign != null && TextAlign.m4292equalsimpl0(textAlign.getF18258a(), iM4300getRighte0LSkKk)) {
            return 4;
        }
        int iM4296getCentere0LSkKk = companion.m4296getCentere0LSkKk();
        if (textAlign != null && TextAlign.m4292equalsimpl0(textAlign.getF18258a(), iM4296getCentere0LSkKk)) {
            return 2;
        }
        int iM4301getStarte0LSkKk = companion.m4301getStarte0LSkKk();
        if (textAlign == null || !TextAlign.m4292equalsimpl0(textAlign.getF18258a(), iM4301getStarte0LSkKk)) {
            int iM4297getEnde0LSkKk = companion.m4297getEnde0LSkKk();
            if (textAlign != null && TextAlign.m4292equalsimpl0(textAlign.getF18258a(), iM4297getEnde0LSkKk)) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: access$toLayoutBreakStrategy-u6PBz3U, reason: not valid java name */
    public static final int m3853access$toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy strategy) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.INSTANCE;
        int iM4243getSimplefcGXIks = companion.m4243getSimplefcGXIks();
        if (strategy != null && LineBreak.Strategy.m4237equalsimpl0(strategy.getF18231a(), iM4243getSimplefcGXIks)) {
            return 0;
        }
        int iM4242getHighQualityfcGXIks = companion.m4242getHighQualityfcGXIks();
        if (strategy != null && LineBreak.Strategy.m4237equalsimpl0(strategy.getF18231a(), iM4242getHighQualityfcGXIks)) {
            return 1;
        }
        return (strategy != null && LineBreak.Strategy.m4237equalsimpl0(strategy.getF18231a(), companion.m4241getBalancedfcGXIks())) ? 2 : 0;
    }

    /* JADX INFO: renamed from: access$toLayoutHyphenationFrequency-0_XeFpE, reason: not valid java name */
    public static final int m3854access$toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        Hyphens.Companion companion = Hyphens.INSTANCE;
        int iM4217getAutovmbZdU8 = companion.m4217getAutovmbZdU8();
        if (hyphens != null && Hyphens.m4213equalsimpl0(hyphens.getF18223a(), iM4217getAutovmbZdU8)) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        int iM4218getNonevmbZdU8 = companion.m4218getNonevmbZdU8();
        if (hyphens != null) {
            Hyphens.m4213equalsimpl0(hyphens.getF18223a(), iM4218getNonevmbZdU8);
        }
        return 0;
    }

    /* JADX INFO: renamed from: access$toLayoutLineBreakStyle-4a2g8L8, reason: not valid java name */
    public static final int m3855access$toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness strictness) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.INSTANCE;
        int iM4251getDefaultusljTpc = companion.m4251getDefaultusljTpc();
        if (strictness != null && LineBreak.Strictness.m4247equalsimpl0(strictness.getF18236a(), iM4251getDefaultusljTpc)) {
            return 0;
        }
        int iM4252getLooseusljTpc = companion.m4252getLooseusljTpc();
        if (strictness != null && LineBreak.Strictness.m4247equalsimpl0(strictness.getF18236a(), iM4252getLooseusljTpc)) {
            return 1;
        }
        int iM4253getNormalusljTpc = companion.m4253getNormalusljTpc();
        if (strictness != null && LineBreak.Strictness.m4247equalsimpl0(strictness.getF18236a(), iM4253getNormalusljTpc)) {
            return 2;
        }
        return (strictness != null && LineBreak.Strictness.m4247equalsimpl0(strictness.getF18236a(), companion.m4254getStrictusljTpc())) ? 3 : 0;
    }

    /* JADX INFO: renamed from: access$toLayoutLineBreakWordStyle-gvcdTPQ, reason: not valid java name */
    public static final int m3856access$toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak wordBreak) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.INSTANCE;
        int iM4262getDefaultjp8hJ3c = companion.m4262getDefaultjp8hJ3c();
        if (wordBreak != null && LineBreak.WordBreak.m4258equalsimpl0(wordBreak.getF18239a(), iM4262getDefaultjp8hJ3c)) {
            return 0;
        }
        return (wordBreak != null && LineBreak.WordBreak.m4258equalsimpl0(wordBreak.getF18239a(), companion.m4263getPhrasejp8hJ3c())) ? 1 : 0;
    }
}
