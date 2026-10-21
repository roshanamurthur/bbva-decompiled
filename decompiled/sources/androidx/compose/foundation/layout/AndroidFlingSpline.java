package androidx.compose.foundation.layout;

import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,724:1\n25#2,3:725\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n700#1:725,3\n*E\n"})
public final class AndroidFlingSpline {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final float[] f4154a = new float[101];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final float[] f4155b = new float[101];

    static {
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < 100; i10++) {
            float f19 = i10 / 100;
            float f20 = 1.0f;
            while (true) {
                f6 = ((f20 - f17) / 2.0f) + f17;
                f10 = 1.0f - f6;
                f11 = f6 * 3.0f * f10;
                f12 = f6 * f6 * f6;
                float fA = q.a(f6, 0.35000002f, f10 * 0.175f, f11) + f12;
                if (Math.abs(fA - f19) < 1.0E-5d) {
                    break;
                } else if (fA > f19) {
                    f20 = f6;
                } else {
                    f17 = f6;
                }
            }
            float f21 = 0.5f;
            f4154a[i10] = (((f10 * 0.5f) + f6) * f11) + f12;
            float f22 = 1.0f;
            while (true) {
                f13 = ((f22 - f18) / 2.0f) + f18;
                f14 = 1.0f - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float fA2 = q.a(f14, f21, f13, f15) + f16;
                if (Math.abs(fA2 - f19) >= 1.0E-5d) {
                    if (fA2 > f19) {
                        f22 = f13;
                    } else {
                        f18 = f13;
                    }
                    f21 = 0.5f;
                }
            }
            f4155b[i10] = (((f13 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
        }
        f4155b[100] = 1.0f;
        f4154a[100] = 1.0f;
    }

    public static long a(float f6) {
        float fA;
        float f10;
        float f11 = 100;
        int i10 = (int) (f11 * f6);
        if (i10 < 100) {
            float f12 = i10 / f11;
            int i11 = i10 + 1;
            float f13 = i11 / f11;
            float[] fArr = f4154a;
            float f14 = fArr[i10];
            f10 = (fArr[i11] - f14) / (f13 - f12);
            fA = androidx.datastore.preferences.protobuf.e.a(f6, f12, f10, f14);
        } else {
            fA = 1.0f;
            f10 = 0.0f;
        }
        return FlingResult.m238constructorimpl((((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(fA) << 32));
    }

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u0016\u0092\u0001\u00020\u0015ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "getDistanceCoefficient-impl", "(J)F", "distanceCoefficient", "getVelocityCoefficient-impl", "velocityCoefficient", "", "packedValue", "constructor-impl", "(J)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,724:1\n34#2:725\n41#2:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n717#1:725\n722#1:726\n*E\n"})
    public static final class FlingResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4156a;

        public /* synthetic */ FlingResult(long j10) {
            this.f4156a = j10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m237boximpl(long j10) {
            return new FlingResult(j10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m239equalsimpl(long j10, Object obj) {
            return (obj instanceof FlingResult) && j10 == ((FlingResult) obj).getF4156a();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m240equalsimpl0(long j10, long j11) {
            return j10 == j11;
        }

        /* JADX INFO: renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m241getDistanceCoefficientimpl(long j10) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }

        /* JADX INFO: renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m242getVelocityCoefficientimpl(long j10) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m243hashCodeimpl(long j10) {
            return (int) (j10 ^ (j10 >>> 32));
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m244toStringimpl(long j10) {
            return "FlingResult(packedValue=" + j10 + RootService.CLOSE_BRACKET;
        }

        public boolean equals(Object obj) {
            return m239equalsimpl(this.f4156a, obj);
        }

        public int hashCode() {
            return m243hashCodeimpl(this.f4156a);
        }

        public String toString() {
            return m244toStringimpl(this.f4156a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getF4156a() {
            return this.f4156a;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m238constructorimpl(long j10) {
            return j10;
        }
    }
}
