package androidx.compose.animation.core;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0015ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c\u0088\u0001\u001a\u0092\u0001\u00020\u0015ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/animation/core/Motion;", "", "", "value", "velocity", "copy-XB9eQnU", "(JFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "a", "J", "getPackedValue", "()J", "packedValue", "getValue-impl", "(J)F", "getVelocity-impl", "constructor-impl", "(J)J", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,243:1\n34#2:244\n41#2:245\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n47#1:244\n49#1:245\n*E\n"})
public final class Motion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long packedValue;

    public /* synthetic */ Motion(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m82boximpl(long j10) {
        return new Motion(j10);
    }

    /* JADX INFO: renamed from: copy-XB9eQnU, reason: not valid java name */
    public static final long m84copyXB9eQnU(long j10, float f6, float f10) {
        return SpringSimulationKt.Motion(f6, f10);
    }

    /* JADX INFO: renamed from: copy-XB9eQnU$default, reason: not valid java name */
    public static /* synthetic */ long m85copyXB9eQnU$default(long j10, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m88getValueimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m89getVelocityimpl(j10);
        }
        return m84copyXB9eQnU(j10, f6, f10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m86equalsimpl(long j10, Object obj) {
        return (obj instanceof Motion) && j10 == ((Motion) obj).m92unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m87equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m88getValueimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m89getVelocityimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m90hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m91toStringimpl(long j10) {
        return "Motion(packedValue=" + j10 + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m86equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m90hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m91toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m92unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m83constructorimpl(long j10) {
        return j10;
    }
}
