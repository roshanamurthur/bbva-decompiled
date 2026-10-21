package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\rø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u000f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "", "string", "<init>", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class DecodeHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Parcel f17187a;

    public DecodeHelper(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.f17187a = parcelObtain;
        byte[] bArrDecode = Base64.decode(string, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m3787decodeColor0d7_KjU() {
        return Color.m2504constructorimpl(ULong.m5595constructorimpl(this.f17187a.readLong()));
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m3788decodeFontStyle_LCdwA() {
        byte b10 = this.f17187a.readByte();
        if (b10 == 0) {
            return FontStyle.INSTANCE.m4067getNormal_LCdwA();
        }
        return b10 == 1 ? FontStyle.INSTANCE.m4066getItalic_LCdwA() : FontStyle.INSTANCE.m4067getNormal_LCdwA();
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m3789decodeFontSynthesisGVVA2EU() {
        byte b10 = this.f17187a.readByte();
        if (b10 == 0) {
            return FontSynthesis.INSTANCE.m4078getNoneGVVA2EU();
        }
        if (b10 == 1) {
            return FontSynthesis.INSTANCE.m4077getAllGVVA2EU();
        }
        if (b10 == 3) {
            return FontSynthesis.INSTANCE.m4079getStyleGVVA2EU();
        }
        return b10 == 2 ? FontSynthesis.INSTANCE.m4080getWeightGVVA2EU() : FontSynthesis.INSTANCE.m4078getNoneGVVA2EU();
    }

    @NotNull
    public final FontWeight decodeFontWeight() {
        return new FontWeight(this.f17187a.readInt());
    }

    @NotNull
    public final SpanStyle decodeSpanStyle() {
        TextDecoration underline;
        Color.Companion companion = Color.INSTANCE;
        long jM2544getUnspecified0d7_KjU = companion.m2544getUnspecified0d7_KjU();
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        long jM4581getUnspecifiedXSAIIZE = companion2.m4581getUnspecifiedXSAIIZE();
        LocaleList localeList = null;
        FontWeight fontWeightDecodeFontWeight = null;
        FontStyle fontStyleM4059boximpl = null;
        FontSynthesis fontSynthesisM4068boximpl = null;
        String string = null;
        BaselineShift baselineShiftM4197boximpl = null;
        TextGeometricTransform textGeometricTransform = null;
        TextDecoration textDecoration = null;
        Shadow shadow = null;
        long jM4581getUnspecifiedXSAIIZE2 = companion2.m4581getUnspecifiedXSAIIZE();
        long jM2544getUnspecified0d7_KjU2 = companion.m2544getUnspecified0d7_KjU();
        long jM3787decodeColor0d7_KjU = jM2544getUnspecified0d7_KjU;
        long jM3790decodeTextUnitXSAIIZE = jM4581getUnspecifiedXSAIIZE;
        while (true) {
            Parcel parcel = this.f17187a;
            if (parcel.dataAvail() > 1) {
                byte b10 = parcel.readByte();
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 != 4) {
                                if (b10 != 5) {
                                    if (b10 != 6) {
                                        if (b10 != 7) {
                                            if (b10 != 8) {
                                                if (b10 != 9) {
                                                    if (b10 != 10) {
                                                        if (b10 != 11) {
                                                            if (b10 == 12) {
                                                                if (parcel.dataAvail() < 20) {
                                                                    break;
                                                                }
                                                                shadow = new Shadow(m3787decodeColor0d7_KjU(), OffsetKt.Offset(parcel.readFloat(), parcel.readFloat()), parcel.readFloat(), null);
                                                            } else {
                                                                continue;
                                                            }
                                                        } else {
                                                            if (parcel.dataAvail() < 4) {
                                                                break;
                                                            }
                                                            int i10 = parcel.readInt();
                                                            TextDecoration.Companion companion3 = TextDecoration.INSTANCE;
                                                            boolean z10 = (companion3.getLineThrough().getMask() & i10) != 0;
                                                            boolean z11 = (i10 & companion3.getUnderline().getMask()) != 0;
                                                            if (z10 && z11) {
                                                                underline = companion3.combine(CollectionsKt__CollectionsKt.listOf((Object[]) new TextDecoration[]{companion3.getLineThrough(), companion3.getUnderline()}));
                                                            } else if (z10) {
                                                                underline = companion3.getLineThrough();
                                                            } else {
                                                                underline = z11 ? companion3.getUnderline() : companion3.getNone();
                                                            }
                                                            textDecoration = underline;
                                                        }
                                                    } else {
                                                        if (parcel.dataAvail() < 8) {
                                                            break;
                                                        }
                                                        jM2544getUnspecified0d7_KjU2 = m3787decodeColor0d7_KjU();
                                                    }
                                                } else {
                                                    if (parcel.dataAvail() < 8) {
                                                        break;
                                                    }
                                                    textGeometricTransform = new TextGeometricTransform(parcel.readFloat(), parcel.readFloat());
                                                }
                                            } else {
                                                if (parcel.dataAvail() < 4) {
                                                    break;
                                                }
                                                baselineShiftM4197boximpl = BaselineShift.m4197boximpl(BaselineShift.m4198constructorimpl(parcel.readFloat()));
                                            }
                                        } else {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            }
                                            jM4581getUnspecifiedXSAIIZE2 = m3790decodeTextUnitXSAIIZE();
                                        }
                                    } else {
                                        string = parcel.readString();
                                    }
                                } else {
                                    if (parcel.dataAvail() < 1) {
                                        break;
                                    }
                                    fontSynthesisM4068boximpl = FontSynthesis.m4068boximpl(m3789decodeFontSynthesisGVVA2EU());
                                }
                            } else {
                                if (parcel.dataAvail() < 1) {
                                    break;
                                }
                                fontStyleM4059boximpl = FontStyle.m4059boximpl(m3788decodeFontStyle_LCdwA());
                            }
                        } else {
                            if (parcel.dataAvail() < 4) {
                                break;
                            }
                            fontWeightDecodeFontWeight = decodeFontWeight();
                        }
                    } else {
                        if (parcel.dataAvail() < 5) {
                            break;
                        }
                        jM3790decodeTextUnitXSAIIZE = m3790decodeTextUnitXSAIIZE();
                    }
                } else {
                    if (parcel.dataAvail() < 8) {
                        break;
                    }
                    jM3787decodeColor0d7_KjU = m3787decodeColor0d7_KjU();
                }
            } else {
                break;
            }
        }
        return new SpanStyle(jM3787decodeColor0d7_KjU, jM3790decodeTextUnitXSAIIZE, fontWeightDecodeFontWeight, fontStyleM4059boximpl, fontSynthesisM4068boximpl, (FontFamily) null, string, jM4581getUnspecifiedXSAIIZE2, baselineShiftM4197boximpl, textGeometricTransform, localeList, jM2544getUnspecified0d7_KjU2, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, 49152, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m3790decodeTextUnitXSAIIZE() {
        long jM4602getEmUIouoOA;
        Parcel parcel = this.f17187a;
        byte b10 = parcel.readByte();
        if (b10 == 1) {
            jM4602getEmUIouoOA = TextUnitType.INSTANCE.m4603getSpUIouoOA();
        } else {
            jM4602getEmUIouoOA = b10 == 2 ? TextUnitType.INSTANCE.m4602getEmUIouoOA() : TextUnitType.INSTANCE.m4604getUnspecifiedUIouoOA();
        }
        return TextUnitType.m4598equalsimpl0(jM4602getEmUIouoOA, TextUnitType.INSTANCE.m4604getUnspecifiedUIouoOA()) ? TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE() : TextUnitKt.m4582TextUnitanM5pPY(parcel.readFloat(), jM4602getEmUIouoOA);
    }
}
