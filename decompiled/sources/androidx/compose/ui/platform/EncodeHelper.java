package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "", "reset", "", "encodedString", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "encode", "Landroidx/compose/ui/graphics/Color;", "color", "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "", "byte", "", "int", "", TypedValues.Custom.S_FLOAT, "Lkotlin/ULong;", "uLong", "encode-VKZWuLQ", "string", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class EncodeHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Parcel f17221a;

    public EncodeHelper() {
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.f17221a = parcelObtain;
    }

    public final void encode(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        long jM3927getColor0d7_KjU = spanStyle.m3927getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m2509equalsimpl0(jM3927getColor0d7_KjU, companion.m2544getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m3801encode8_81llA(spanStyle.m3927getColor0d7_KjU());
        }
        long fontSize = spanStyle.getFontSize();
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        if (!TextUnit.m4567equalsimpl0(fontSize, companion2.m4581getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m3798encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int iM4065unboximpl = fontStyle.m4065unboximpl();
            encode((byte) 4);
            m3803encodenzbMABs(iM4065unboximpl);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int f17996a = fontSynthesis.getF17996a();
            encode((byte) 5);
            m3800encode6p3vJLY(f17996a);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m4567equalsimpl0(spanStyle.getLetterSpacing(), companion2.m4581getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m3798encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float fM4203unboximpl = baselineShift.m4203unboximpl();
            encode((byte) 8);
            m3799encode4Dl_Bck(fM4203unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m2509equalsimpl0(spanStyle.getBackground(), companion.m2544getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m3801encode8_81llA(spanStyle.getBackground());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m3798encodeR2X_6o(long textUnit) {
        long jM4569getTypeUIouoOA = TextUnit.m4569getTypeUIouoOA(textUnit);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        byte b10 = 0;
        if (!TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4604getUnspecifiedUIouoOA())) {
            if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4603getSpUIouoOA())) {
                b10 = 1;
            } else if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4602getEmUIouoOA())) {
                b10 = 2;
            }
        }
        encode(b10);
        if (TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(textUnit), companion.m4604getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m4570getValueimpl(textUnit));
    }

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m3799encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m3800encode6p3vJLY(int fontSynthesis) {
        FontSynthesis.Companion companion = FontSynthesis.INSTANCE;
        byte b10 = 0;
        if (!FontSynthesis.m4071equalsimpl0(fontSynthesis, companion.m4078getNoneGVVA2EU())) {
            if (FontSynthesis.m4071equalsimpl0(fontSynthesis, companion.m4077getAllGVVA2EU())) {
                b10 = 1;
            } else if (FontSynthesis.m4071equalsimpl0(fontSynthesis, companion.m4080getWeightGVVA2EU())) {
                b10 = 2;
            } else if (FontSynthesis.m4071equalsimpl0(fontSynthesis, companion.m4079getStyleGVVA2EU())) {
                b10 = 3;
            }
        }
        encode(b10);
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m3801encode8_81llA(long color) {
        m3802encodeVKZWuLQ(color);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m3802encodeVKZWuLQ(long uLong) {
        this.f17221a.writeLong(uLong);
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m3803encodenzbMABs(int fontStyle) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        byte b10 = 0;
        if (!FontStyle.m4062equalsimpl0(fontStyle, companion.m4067getNormal_LCdwA()) && FontStyle.m4062equalsimpl0(fontStyle, companion.m4066getItalic_LCdwA())) {
            b10 = 1;
        }
        encode(b10);
    }

    @NotNull
    public final String encodedString() {
        String strEncodeToString = Base64.encodeToString(this.f17221a.marshall(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return strEncodeToString;
    }

    public final void reset() {
        this.f17221a.recycle();
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.f17221a = parcelObtain;
    }

    public final void encode(@NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(@NotNull TextGeometricTransform textGeometricTransform) {
        Intrinsics.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(@NotNull TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(@NotNull Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        m3801encode8_81llA(shadow.getColor());
        encode(Offset.m2275getXimpl(shadow.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()));
        encode(Offset.m2276getYimpl(shadow.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b10) {
        this.f17221a.writeByte(b10);
    }

    public final void encode(int i10) {
        this.f17221a.writeInt(i10);
    }

    public final void encode(float f6) {
        this.f17221a.writeFloat(f6);
    }

    public final void encode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f17221a.writeString(string);
    }
}
