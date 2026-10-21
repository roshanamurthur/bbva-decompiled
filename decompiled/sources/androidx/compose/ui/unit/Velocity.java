package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Velocity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u0014\b\u0000\u0012\u0006\u00100\u001a\u00020/ø\u0001\u0002¢\u0006\u0004\b1\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u0018J!\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010%\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010)\u001a\u00020&2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u0004\u0088\u00010\u0092\u0001\u00020/ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "x", "y", "copy-OhffZ5M", "(JFF)J", "copy", "unaryMinus-9UxMQ8M", "(J)J", "unaryMinus", "other", "minus-AH228Gc", "(JJ)J", "minus", "plus-AH228Gc", "plus", "operand", "times-adjELrA", "(JF)J", "times", "div-adjELrA", "div", "rem-adjELrA", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "", "packedValue", "constructor-impl", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n34#2:145\n41#2:146\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n45#1:145\n52#1:146\n*E\n"})
public final class Velocity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18327b = VelocityKt.Velocity(0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18328a;

    public /* synthetic */ Velocity(long j10) {
        this.f18328a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m4605boximpl(long j10) {
        return new Velocity(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m4606component1impl(long j10) {
        return m4614getXimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m4607component2impl(long j10) {
        return m4615getYimpl(j10);
    }

    /* JADX INFO: renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m4609copyOhffZ5M(long j10, float f6, float f10) {
        return VelocityKt.Velocity(f6, f10);
    }

    /* JADX INFO: renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m4610copyOhffZ5M$default(long j10, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m4614getXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m4615getYimpl(j10);
        }
        return m4609copyOhffZ5M(j10, f6, f10);
    }

    @Stable
    /* JADX INFO: renamed from: div-adjELrA, reason: not valid java name */
    public static final long m4611divadjELrA(long j10, float f6) {
        return VelocityKt.Velocity(m4614getXimpl(j10) / f6, m4615getYimpl(j10) / f6);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4612equalsimpl(long j10, Object obj) {
        return (obj instanceof Velocity) && j10 == ((Velocity) obj).getF18328a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4613equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m4614getXimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m4615getYimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4616hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Stable
    /* JADX INFO: renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m4617minusAH228Gc(long j10, long j11) {
        return VelocityKt.Velocity(m4614getXimpl(j10) - m4614getXimpl(j11), m4615getYimpl(j10) - m4615getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m4618plusAH228Gc(long j10, long j11) {
        return VelocityKt.Velocity(m4614getXimpl(j11) + m4614getXimpl(j10), m4615getYimpl(j11) + m4615getYimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m4619remadjELrA(long j10, float f6) {
        return VelocityKt.Velocity(m4614getXimpl(j10) % f6, m4615getYimpl(j10) % f6);
    }

    @Stable
    /* JADX INFO: renamed from: times-adjELrA, reason: not valid java name */
    public static final long m4620timesadjELrA(long j10, float f6) {
        return VelocityKt.Velocity(m4614getXimpl(j10) * f6, m4615getYimpl(j10) * f6);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4621toStringimpl(long j10) {
        return "(" + m4614getXimpl(j10) + ", " + m4615getYimpl(j10) + ") px/sec";
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m4622unaryMinus9UxMQ8M(long j10) {
        return VelocityKt.Velocity(-m4614getXimpl(j10), -m4615getYimpl(j10));
    }

    public boolean equals(Object obj) {
        return m4612equalsimpl(this.f18328a, obj);
    }

    public int hashCode() {
        return m4616hashCodeimpl(this.f18328a);
    }

    @NotNull
    public String toString() {
        return m4621toStringimpl(this.f18328a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF18328a() {
        return this.f18328a;
    }

    /* JADX INFO: compiled from: Velocity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/Velocity$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/Velocity;", "getZero-9UxMQ8M$annotations", "getZero-9UxMQ8M", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m4625getZero9UxMQ8M() {
            return Velocity.f18327b;
        }

        @Stable
        /* JADX INFO: renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m4624getZero9UxMQ8M$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4608constructorimpl(long j10) {
        return j10;
    }
}
