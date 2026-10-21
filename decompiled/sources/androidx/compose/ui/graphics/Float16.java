package androidx.compose.ui.graphics;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081@\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001TB\u0014\b\u0016\u0012\u0006\u0010P\u001a\u00020\u0012ø\u0001\u0001¢\u0006\u0004\bQ\u0010RB\u0014\b\u0016\u0012\u0006\u0010P\u001a\u00020\u0016ø\u0001\u0001¢\u0006\u0004\bQ\u0010SB\u0012\u0012\u0006\u0010J\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\bQ\u0010\bJ\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001b\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0016\u0010+\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\bJ\u0016\u0010-\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010\bJ\u0016\u0010/\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010\bJ\u0016\u00101\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010\bJ\u0016\u00103\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\bJ\r\u00107\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00109\u001a\u000204¢\u0006\u0004\b8\u00106J\r\u0010;\u001a\u000204¢\u0006\u0004\b:\u00106J\r\u0010=\u001a\u000204¢\u0006\u0004\b<\u00106J\r\u0010?\u001a\u00020\u001e¢\u0006\u0004\b>\u0010 J\u0010\u0010A\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b@\u0010\fJ\u001a\u0010E\u001a\u0002042\b\u0010\"\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bC\u0010DR\u0017\u0010J\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010&\u001a\u00020\u00008Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bK\u0010\bR\u0011\u0010M\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bL\u0010\fR\u0011\u0010O\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bN\u0010\f\u0088\u0001J\u0092\u0001\u00020\u0006ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "", "toByte-impl", "(S)B", "toByte", "", "toShort-impl", "(S)S", "toShort", "", "toInt-impl", "(S)I", "toInt", "", "toLong-impl", "(S)J", "toLong", "", "toFloat-impl", "(S)F", "toFloat", "", "toDouble-impl", "(S)D", "toDouble", "toBits-impl", "toBits", "toRawBits-impl", "toRawBits", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "other", "compareTo-41bOqos", "(SS)I", "compareTo", "sign", "withSign-qCeQghg", "(SS)S", "withSign", "absoluteValue-slo4al4", "absoluteValue", "round-slo4al4", "round", "ceil-slo4al4", "ceil", "floor-slo4al4", "floor", "trunc-slo4al4", "trunc", "", "isNaN-impl", "(S)Z", "isNaN", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "isNormalized-impl", "isNormalized", "toHexString-impl", "toHexString", "hashCode-impl", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(SLjava/lang/Object;)Z", "equals", "p0", ExifInterface.LATITUDE_SOUTH, "getHalfValue", "()S", "halfValue", "getSign-slo4al4", "getExponent-impl", "exponent", "getSignificand-impl", "significand", "value", "constructor-impl", "(F)S", "(D)S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class Float16 implements Comparable<Float16> {
    public static final float H0;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final short halfValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final short f15634q0 = m2609constructorimpl((short) 5120);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final short f15635r0 = m2609constructorimpl((short) -1025);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final short f15636s0 = m2609constructorimpl((short) 31743);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final short f15637t0 = m2609constructorimpl((short) 1024);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final short f15638u0 = m2609constructorimpl((short) 1);
    public static final short v0 = m2609constructorimpl((short) 32256);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final short f15639w0 = m2609constructorimpl((short) -1024);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final short f15640x0 = m2609constructorimpl(ShortCompanionObject.MIN_VALUE);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final short f15641y0 = m2609constructorimpl((short) 31744);
    public static final short E0 = m2609constructorimpl((short) 0);
    public static final short F0 = m2608constructorimpl(1.0f);
    public static final short G0 = m2608constructorimpl(-1.0f);

    /* JADX INFO: compiled from: Float16.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001bR\u0014\u0010(\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001bR\u0014\u0010)\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u0014\u0010*\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0014\u0010+\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u0014\u0010,\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0014\u0010-\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u0014\u0010.\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u001bR\u001d\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u001d\u00100\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0014\u00101\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "Landroidx/compose/ui/graphics/Float16;", "Epsilon", ExifInterface.LATITUDE_SOUTH, "getEpsilon-slo4al4", "()S", "LowestValue", "getLowestValue-slo4al4", "MaxValue", "getMaxValue-slo4al4", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "", "FP16_COMBINED", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "", "FP32_DENORMAL_FLOAT", "F", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "MaxExponent", "MinExponent", "NegativeOne", "One", "Size", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final short access$floatToHalf(Companion companion, float f6) {
            int i10;
            companion.getClass();
            int iFloatToRawIntBits = Float.floatToRawIntBits(f6);
            int i11 = iFloatToRawIntBits >>> 31;
            int i12 = (iFloatToRawIntBits >>> 23) & 255;
            int i13 = 8388607 & iFloatToRawIntBits;
            int i14 = 31;
            int i15 = 0;
            if (i12 != 255) {
                int i16 = i12 - 112;
                if (i16 >= 31) {
                    i14 = 49;
                } else {
                    if (i16 > 0) {
                        i15 = i13 >> 13;
                        if ((iFloatToRawIntBits & 4096) != 0) {
                            i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                        } else {
                            i14 = i16;
                        }
                        return (short) i10;
                    }
                    if (i16 >= -10) {
                        int i17 = (8388608 | i13) >> (1 - i16);
                        if ((i17 & 4096) != 0) {
                            i17 += 8192;
                        }
                        i14 = 0;
                        i15 = i17 >> 13;
                    } else {
                        i14 = 0;
                    }
                }
            } else if (i13 != 0) {
                i15 = 512;
            }
            i10 = (i11 << 15) | (i14 << 10) | i15;
            return (short) i10;
        }

        public static final int access$toCompareValue(Companion companion, short s4) {
            companion.getClass();
            return (s4 & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s4 & UShort.MAX_VALUE) : s4 & UShort.MAX_VALUE;
        }

        /* JADX INFO: renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m2636getEpsilonslo4al4() {
            return Float16.f15634q0;
        }

        /* JADX INFO: renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m2637getLowestValueslo4al4() {
            return Float16.f15635r0;
        }

        /* JADX INFO: renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m2638getMaxValueslo4al4() {
            return Float16.f15636s0;
        }

        /* JADX INFO: renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m2639getMinNormalslo4al4() {
            return Float16.f15637t0;
        }

        /* JADX INFO: renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m2640getMinValueslo4al4() {
            return Float16.f15638u0;
        }

        /* JADX INFO: renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m2641getNaNslo4al4() {
            return Float16.v0;
        }

        /* JADX INFO: renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m2642getNegativeInfinityslo4al4() {
            return Float16.f15639w0;
        }

        /* JADX INFO: renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m2643getNegativeZeroslo4al4() {
            return Float16.f15640x0;
        }

        /* JADX INFO: renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m2644getPositiveInfinityslo4al4() {
            return Float16.f15641y0;
        }

        /* JADX INFO: renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m2645getPositiveZeroslo4al4() {
            return Float16.E0;
        }
    }

    static {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        H0 = Float.intBitsToFloat(1056964608);
    }

    public /* synthetic */ Float16(short s4) {
        this.halfValue = s4;
    }

    /* JADX INFO: renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m2603absoluteValueslo4al4(short s4) {
        return m2609constructorimpl((short) (s4 & ShortCompanionObject.MAX_VALUE));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m2604boximpl(short s4) {
        return new Float16(s4);
    }

    /* JADX INFO: renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m2605ceilslo4al4(short s4) {
        int i10 = 65535 & s4;
        int i11 = s4 & ShortCompanionObject.MAX_VALUE;
        if (i11 < 15360) {
            i10 = ((-((~(i10 >> 15)) & (i11 == 0 ? 0 : 1))) & 15360) | (s4 & ShortCompanionObject.MIN_VALUE);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + (((i10 >> 15) - 1) & i12)) & (~i12);
        }
        return m2609constructorimpl((short) i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m2609constructorimpl(short s4) {
        return s4;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2610equalsimpl(short s4, Object obj) {
        return (obj instanceof Float16) && s4 == ((Float16) obj).m2635unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2611equalsimpl0(short s4, short s7) {
        return s4 == s7;
    }

    /* JADX INFO: renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m2612floorslo4al4(short s4) {
        int i10 = s4 & UShort.MAX_VALUE;
        int i11 = s4 & ShortCompanionObject.MAX_VALUE;
        if (i11 < 15360) {
            i10 = (s4 & ShortCompanionObject.MIN_VALUE) | ((i10 <= 32768 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + ((-(i10 >> 15)) & i12)) & (~i12);
        }
        return m2609constructorimpl((short) i10);
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m2613getExponentimpl(short s4) {
        return ((s4 >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m2614getSignslo4al4(short s4) {
        if (m2619isNaNimpl(s4)) {
            return v0;
        }
        if (m2606compareTo41bOqos(s4, f15640x0) < 0) {
            return G0;
        }
        return m2606compareTo41bOqos(s4, E0) > 0 ? F0 : s4;
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m2615getSignificandimpl(short s4) {
        return s4 & 1023;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m2617isFiniteimpl(short s4) {
        return (s4 & ShortCompanionObject.MAX_VALUE) != 31744;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m2618isInfiniteimpl(short s4) {
        return (s4 & ShortCompanionObject.MAX_VALUE) == 31744;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m2619isNaNimpl(short s4) {
        return (s4 & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m2620isNormalizedimpl(short s4) {
        int i10 = s4 & 31744;
        return (i10 == 0 || i10 == 31744) ? false : true;
    }

    /* JADX INFO: renamed from: round-slo4al4, reason: not valid java name */
    public static final short m2621roundslo4al4(short s4) {
        int i10 = s4 & UShort.MAX_VALUE;
        int i11 = s4 & ShortCompanionObject.MAX_VALUE;
        if (i11 < 15360) {
            i10 = (s4 & ShortCompanionObject.MIN_VALUE) | ((i11 < 14336 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = i11 >> 10;
            i10 = (i10 + (1 << (24 - i12))) & (~((1 << (25 - i12)) - 1));
        }
        return m2609constructorimpl((short) i10);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m2622toBitsimpl(short s4) {
        return m2619isNaNimpl(s4) ? v0 : s4 & UShort.MAX_VALUE;
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m2623toByteimpl(short s4) {
        return (byte) m2625toFloatimpl(s4);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m2624toDoubleimpl(short s4) {
        return m2625toFloatimpl(s4);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m2625toFloatimpl(short s4) {
        int i10;
        int i11;
        int i12;
        int i13 = Short.MIN_VALUE & s4;
        int i14 = ((65535 & s4) >>> 10) & 31;
        int i15 = s4 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - H0;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        int i18 = (i12 << 23) | (i13 << 16) | i11;
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i18);
    }

    @NotNull
    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m2626toHexStringimpl(short s4) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 65535 & s4;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = s4 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb2.append('-');
            }
            if (i12 != 0) {
                sb2.append("0x1.");
                String string = Integer.toString(i13, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").replaceFirst(string, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                String string2 = Integer.toString(i13, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").replaceFirst(string2, ""));
                sb2.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb2.append('-');
            }
            sb2.append("Infinity");
        } else {
            sb2.append("NaN");
        }
        String string3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "o.toString()");
        return string3;
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m2627toIntimpl(short s4) {
        return (int) m2625toFloatimpl(s4);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m2628toLongimpl(short s4) {
        return (long) m2625toFloatimpl(s4);
    }

    /* JADX INFO: renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m2629toRawBitsimpl(short s4) {
        return s4 & UShort.MAX_VALUE;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m2630toShortimpl(short s4) {
        return (short) m2625toFloatimpl(s4);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2631toStringimpl(short s4) {
        return String.valueOf(m2625toFloatimpl(s4));
    }

    /* JADX INFO: renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m2632truncslo4al4(short s4) {
        int i10 = 65535 & s4;
        int i11 = s4 & ShortCompanionObject.MAX_VALUE;
        if (i11 < 15360) {
            i10 = Short.MIN_VALUE & s4;
        } else if (i11 < 25600) {
            i10 &= ~((1 << (25 - (i11 >> 10))) - 1);
        }
        return m2609constructorimpl((short) i10);
    }

    /* JADX INFO: renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m2633withSignqCeQghg(short s4, short s7) {
        return m2609constructorimpl((short) ((s4 & ShortCompanionObject.MAX_VALUE) | (s7 & ShortCompanionObject.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m2634compareTo41bOqos(float16.m2635unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m2634compareTo41bOqos(short s4) {
        return m2606compareTo41bOqos(this.halfValue, s4);
    }

    public boolean equals(Object obj) {
        return m2610equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m2616hashCodeimpl(this.halfValue);
    }

    @NotNull
    public String toString() {
        return m2631toStringimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m2635unboximpl() {
        return this.halfValue;
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m2606compareTo41bOqos(short s4, short s7) {
        if (m2619isNaNimpl(s4)) {
            return !m2619isNaNimpl(s7) ? 1 : 0;
        }
        if (m2619isNaNimpl(s7)) {
            return -1;
        }
        Companion companion = INSTANCE;
        return Intrinsics.compare(Companion.access$toCompareValue(companion, s4), Companion.access$toCompareValue(companion, s7));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m2608constructorimpl(float f6) {
        return m2609constructorimpl(Companion.access$floatToHalf(INSTANCE, f6));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m2607constructorimpl(double d2) {
        return m2608constructorimpl((float) d2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2616hashCodeimpl(short s4) {
        return s4;
    }
}
