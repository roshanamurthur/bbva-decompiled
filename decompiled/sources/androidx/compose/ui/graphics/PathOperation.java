package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathOperation.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class PathOperation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15687b = m2751constructorimpl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15688c = m2751constructorimpl(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15689d = m2751constructorimpl(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15690e = m2751constructorimpl(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15691f = m2751constructorimpl(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15692a;

    /* JADX INFO: compiled from: PathOperation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation$Companion;", "", "()V", "Difference", "Landroidx/compose/ui/graphics/PathOperation;", "getDifference-b3I0S0c", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Intersect", "getIntersect-b3I0S0c", "ReverseDifference", "getReverseDifference-b3I0S0c", "Union", "getUnion-b3I0S0c", "Xor", "getXor-b3I0S0c", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m2757getDifferenceb3I0S0c() {
            return PathOperation.f15687b;
        }

        /* JADX INFO: renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m2758getIntersectb3I0S0c() {
            return PathOperation.f15688c;
        }

        /* JADX INFO: renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m2759getReverseDifferenceb3I0S0c() {
            return PathOperation.f15691f;
        }

        /* JADX INFO: renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m2760getUnionb3I0S0c() {
            return PathOperation.f15689d;
        }

        /* JADX INFO: renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m2761getXorb3I0S0c() {
            return PathOperation.f15690e;
        }
    }

    public /* synthetic */ PathOperation(int i10) {
        this.f15692a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m2750boximpl(int i10) {
        return new PathOperation(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2752equalsimpl(int i10, Object obj) {
        return (obj instanceof PathOperation) && i10 == ((PathOperation) obj).getF15692a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2753equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2755toStringimpl(int i10) {
        if (m2753equalsimpl0(i10, f15687b)) {
            return "Difference";
        }
        if (m2753equalsimpl0(i10, f15688c)) {
            return "Intersect";
        }
        if (m2753equalsimpl0(i10, f15689d)) {
            return "Union";
        }
        if (m2753equalsimpl0(i10, f15690e)) {
            return "Xor";
        }
        return m2753equalsimpl0(i10, f15691f) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2752equalsimpl(this.f15692a, obj);
    }

    public int hashCode() {
        return m2754hashCodeimpl(this.f15692a);
    }

    @NotNull
    public String toString() {
        return m2755toStringimpl(this.f15692a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF15692a() {
        return this.f15692a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2751constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2754hashCodeimpl(int i10) {
        return i10;
    }
}
