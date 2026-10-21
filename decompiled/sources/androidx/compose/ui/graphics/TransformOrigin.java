package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TransformOrigin.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000  2\u00020\u0001:\u0001 B\u0014\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0004\u0088\u0001\u001d\u0092\u0001\u00020\u001cø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin;", "", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "pivotFractionX", "pivotFractionY", "copy-zey9I6w", "(JFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getPivotFractionX-impl", "getPivotFractionY-impl", "", "packedValue", "constructor-impl", "(J)J", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,83:1\n34#2:84\n41#2:85\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:85\n*E\n"})
public final class TransformOrigin {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15745b = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15746a;

    /* JADX INFO: compiled from: TransformOrigin.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin$Companion;", "", "()V", "Center", "Landroidx/compose/ui/graphics/TransformOrigin;", "getCenter-SzJe1aQ", "()J", "J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m2845getCenterSzJe1aQ() {
            return TransformOrigin.f15745b;
        }
    }

    public /* synthetic */ TransformOrigin(long j10) {
        this.f15746a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m2832boximpl(long j10) {
        return new TransformOrigin(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m2833component1impl(long j10) {
        return m2840getPivotFractionXimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m2834component2impl(long j10) {
        return m2841getPivotFractionYimpl(j10);
    }

    /* JADX INFO: renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m2836copyzey9I6w(long j10, float f6, float f10) {
        return TransformOriginKt.TransformOrigin(f6, f10);
    }

    /* JADX INFO: renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m2837copyzey9I6w$default(long j10, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m2840getPivotFractionXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m2841getPivotFractionYimpl(j10);
        }
        return m2836copyzey9I6w(j10, f6, f10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2838equalsimpl(long j10, Object obj) {
        return (obj instanceof TransformOrigin) && j10 == ((TransformOrigin) obj).getF15746a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2839equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m2840getPivotFractionXimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m2841getPivotFractionYimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2842hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2843toStringimpl(long j10) {
        return "TransformOrigin(packedValue=" + j10 + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m2838equalsimpl(this.f15746a, obj);
    }

    public int hashCode() {
        return m2842hashCodeimpl(this.f15746a);
    }

    public String toString() {
        return m2843toStringimpl(this.f15746a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF15746a() {
        return this.f15746a;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2835constructorimpl(long j10) {
        return j10;
    }
}
