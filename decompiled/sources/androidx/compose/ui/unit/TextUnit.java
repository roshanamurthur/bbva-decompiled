package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010.\u001a\u00020\u001eø\u0001\u0002¢\u0006\u0004\b/\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\fH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\bJ!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\fH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8@X\u0081\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0003R\u001a\u0010%\u001a\u00020#8Fø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010\u0003R\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010-\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001.\u0092\u0001\u00020\u001eø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "unaryMinus-XSAIIZE", "(J)J", "unaryMinus", "", "other", "div-kPz2Gy4", "(JF)J", "div", "", "(JD)J", "", "(JI)J", "times-kPz2Gy4", "times", "compareTo--R2X_6o", "(JJ)I", "compareTo", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "getRawType-impl", "getRawType$annotations", "()V", "rawType", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "type", "isSp-impl", "(J)Z", "isSp", "isEm-impl", "isEm", "getValue-impl", "(J)F", "value", "packedValue", "constructor-impl", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class TextUnit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final TextUnitType[] f18320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f18321c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18322a;

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        f18320b = new TextUnitType[]{TextUnitType.m4595boximpl(companion.m4604getUnspecifiedUIouoOA()), TextUnitType.m4595boximpl(companion.m4603getSpUIouoOA()), TextUnitType.m4595boximpl(companion.m4602getEmUIouoOA())};
        f18321c = TextUnitKt.pack(0L, Float.NaN);
    }

    public /* synthetic */ TextUnit(long j10) {
        this.f18322a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m4560boximpl(long j10) {
        return new TextUnit(j10);
    }

    /* JADX INFO: renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m4561compareToR2X_6o(long j10, long j11) {
        TextUnitKt.m4584checkArithmeticNB67dxo(j10, j11);
        return Float.compare(m4570getValueimpl(j10), m4570getValueimpl(j11));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m4564divkPz2Gy4(long j10, float f6) {
        TextUnitKt.m4583checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4568getRawTypeimpl(j10), m4570getValueimpl(j10) / f6);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4566equalsimpl(long j10, Object obj) {
        return (obj instanceof TextUnit) && j10 == ((TextUnit) obj).getF18322a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4567equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getRawType-impl, reason: not valid java name */
    public static final long m4568getRawTypeimpl(long j10) {
        return j10 & 1095216660480L;
    }

    /* JADX INFO: renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m4569getTypeUIouoOA(long j10) {
        return f18320b[(int) (m4568getRawTypeimpl(j10) >>> 32)].getF18326a();
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m4570getValueimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4571hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m4572isEmimpl(long j10) {
        return m4568getRawTypeimpl(j10) == SvgConstantsKt.SPECIFIED_VIEWPORT_FILL;
    }

    /* JADX INFO: renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m4573isSpimpl(long j10) {
        return m4568getRawTypeimpl(j10) == SvgConstantsKt.SPECIFIED_SOLID_OPACITY;
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m4575timeskPz2Gy4(long j10, float f6) {
        TextUnitKt.m4583checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4568getRawTypeimpl(j10), m4570getValueimpl(j10) * f6);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4577toStringimpl(long j10) {
        long jM4569getTypeUIouoOA = m4569getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4604getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4603getSpUIouoOA())) {
            return m4570getValueimpl(j10) + ".sp";
        }
        if (!TextUnitType.m4598equalsimpl0(jM4569getTypeUIouoOA, companion.m4602getEmUIouoOA())) {
            return "Invalid";
        }
        return m4570getValueimpl(j10) + ".em";
    }

    /* JADX INFO: renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m4578unaryMinusXSAIIZE(long j10) {
        TextUnitKt.m4583checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4568getRawTypeimpl(j10), -m4570getValueimpl(j10));
    }

    public boolean equals(Object obj) {
        return m4566equalsimpl(this.f18322a, obj);
    }

    public int hashCode() {
        return m4571hashCodeimpl(this.f18322a);
    }

    @NotNull
    public String toString() {
        return m4577toStringimpl(this.f18322a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF18322a() {
        return this.f18322a;
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m4563divkPz2Gy4(long j10, double d2) {
        TextUnitKt.m4583checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4568getRawTypeimpl(j10), (float) (((double) m4570getValueimpl(j10)) / d2));
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m4574timeskPz2Gy4(long j10, double d2) {
        TextUnitKt.m4583checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4568getRawTypeimpl(j10), (float) (((double) m4570getValueimpl(j10)) * d2));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m4565divkPz2Gy4(long j10, int i10) {
        TextUnitKt.m4583checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4568getRawTypeimpl(j10), m4570getValueimpl(j10) / i10);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m4576timeskPz2Gy4(long j10, int i10) {
        TextUnitKt.m4583checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4568getRawTypeimpl(j10), m4570getValueimpl(j10) * i10);
    }

    /* JADX INFO: compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.f18320b;
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m4581getUnspecifiedXSAIIZE() {
            return TextUnit.f18321c;
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4580getUnspecifiedXSAIIZE$annotations() {
        }
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4562constructorimpl(long j10) {
        return j10;
    }
}
