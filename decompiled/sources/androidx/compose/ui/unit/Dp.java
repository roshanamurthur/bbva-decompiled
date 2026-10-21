package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u0012\u0012\u0006\u0010&\u001a\u00020\u000bø\u0001\u0001¢\u0006\u0004\b'\u0010\tJ\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0004J!\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000eH\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0004J!\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0004J!\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000eH\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010!\u001a\u00020\u001e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0088\u0001&\u0092\u0001\u00020\u000bø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "other", "plus-5rwHm24", "(FF)F", "plus", "minus-5rwHm24", "minus", "unaryMinus-D9Ej5fM", "(F)F", "unaryMinus", "", "div-u2uoSUM", "div", "", "(FI)F", "div-0680j_4", "times-u2uoSUM", "times", "compareTo-0680j_4", "(FF)I", "compareTo", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "hashCode-impl", "(F)I", GenerateActivationFormCommand.HASH_CODE, "", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "p0", "F", "getValue", "()F", "value", "constructor-impl", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,557:1\n137#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n101#1:558\n*E\n"})
public final class Dp implements Comparable<Dp> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final float f18297q0 = m4389constructorimpl(0.0f);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final float f18298r0 = m4389constructorimpl(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final float f18299s0 = m4389constructorimpl(Float.NaN);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final float value;

    public /* synthetic */ Dp(float f6) {
        this.value = f6;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m4387boximpl(float f6) {
        return new Dp(f6);
    }

    @Stable
    /* JADX INFO: renamed from: div-0680j_4, reason: not valid java name */
    public static final float m4390div0680j_4(float f6, float f10) {
        return f6 / f10;
    }

    @Stable
    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m4391divu2uoSUM(float f6, float f10) {
        return m4389constructorimpl(f6 / f10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4393equalsimpl(float f6, Object obj) {
        return (obj instanceof Dp) && Float.compare(f6, ((Dp) obj).m4403unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4394equalsimpl0(float f6, float f10) {
        return Float.compare(f6, f10) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4395hashCodeimpl(float f6) {
        return Float.floatToIntBits(f6);
    }

    @Stable
    /* JADX INFO: renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m4396minus5rwHm24(float f6, float f10) {
        return m4389constructorimpl(f6 - f10);
    }

    @Stable
    /* JADX INFO: renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m4397plus5rwHm24(float f6, float f10) {
        return m4389constructorimpl(f6 + f10);
    }

    @Stable
    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m4398timesu2uoSUM(float f6, float f10) {
        return m4389constructorimpl(f6 * f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4400toStringimpl(float f6) {
        if (Float.isNaN(f6)) {
            return "Dp.Unspecified";
        }
        return f6 + ".dp";
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m4401unaryMinusD9Ej5fM(float f6) {
        return m4389constructorimpl(-f6);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m4402compareTo0680j_4(dp.m4403unboximpl());
    }

    @Stable
    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m4402compareTo0680j_4(float f6) {
        return m4388compareTo0680j_4(this.value, f6);
    }

    public boolean equals(Object obj) {
        return m4393equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4395hashCodeimpl(this.value);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4400toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m4403unboximpl() {
        return this.value;
    }

    @Stable
    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m4388compareTo0680j_4(float f6, float f10) {
        return Float.compare(f6, f10);
    }

    @Stable
    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m4392divu2uoSUM(float f6, int i10) {
        return m4389constructorimpl(f6 / i10);
    }

    @Stable
    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m4399timesu2uoSUM(float f6, int i10) {
        return m4389constructorimpl(f6 * i10);
    }

    /* JADX INFO: compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m4407getHairlineD9Ej5fM() {
            return Dp.f18297q0;
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m4408getInfinityD9Ej5fM() {
            return Dp.f18298r0;
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m4409getUnspecifiedD9Ej5fM() {
            return Dp.f18299s0;
        }

        @Stable
        /* JADX INFO: renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m4404getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m4405getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m4406getUnspecifiedD9Ej5fM$annotations() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float m4389constructorimpl(float f6) {
        return f6;
    }
}
