package t1;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function3<SpanStyle, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Spannable f93438p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> f93439q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Spannable spannable, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        super(3);
        this.f93438p0 = spannable;
        this.f93439q0 = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
        SpanStyle spanStyle2 = spanStyle;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(spanStyle2, "spanStyle");
        FontFamily fontFamily = spanStyle2.getFontFamily();
        FontWeight fontWeight = spanStyle2.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontStyle fontStyle = spanStyle2.getFontStyle();
        FontStyle fontStyleM4059boximpl = FontStyle.m4059boximpl(fontStyle != null ? fontStyle.m4065unboximpl() : FontStyle.INSTANCE.m4067getNormal_LCdwA());
        FontSynthesis fontSynthesis = spanStyle2.getFontSynthesis();
        this.f93438p0.setSpan(new TypefaceSpan(this.f93439q0.invoke(fontFamily, fontWeight, fontStyleM4059boximpl, FontSynthesis.m4068boximpl(fontSynthesis != null ? fontSynthesis.getF17996a() : FontSynthesis.INSTANCE.m4077getAllGVVA2EU()))), iIntValue, iIntValue2, 33);
        return Unit.INSTANCE;
    }
}
