package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StrokeCap.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/StrokeCap;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class StrokeCap {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15729b = m2802constructorimpl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15730c = m2802constructorimpl(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15731d = m2802constructorimpl(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15732a;

    /* JADX INFO: compiled from: StrokeCap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/StrokeCap$Companion;", "", "()V", "Butt", "Landroidx/compose/ui/graphics/StrokeCap;", "getButt-KaPHkGw", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Round", "getRound-KaPHkGw", "Square", "getSquare-KaPHkGw", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m2808getButtKaPHkGw() {
            return StrokeCap.f15729b;
        }

        /* JADX INFO: renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m2809getRoundKaPHkGw() {
            return StrokeCap.f15730c;
        }

        /* JADX INFO: renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m2810getSquareKaPHkGw() {
            return StrokeCap.f15731d;
        }
    }

    public /* synthetic */ StrokeCap(int i10) {
        this.f15732a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m2801boximpl(int i10) {
        return new StrokeCap(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2803equalsimpl(int i10, Object obj) {
        return (obj instanceof StrokeCap) && i10 == ((StrokeCap) obj).getF15732a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2804equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2806toStringimpl(int i10) {
        if (m2804equalsimpl0(i10, f15729b)) {
            return "Butt";
        }
        if (m2804equalsimpl0(i10, f15730c)) {
            return "Round";
        }
        return m2804equalsimpl0(i10, f15731d) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2803equalsimpl(this.f15732a, obj);
    }

    public int hashCode() {
        return m2805hashCodeimpl(this.f15732a);
    }

    @NotNull
    public String toString() {
        return m2806toStringimpl(this.f15732a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF15732a() {
        return this.f15732a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2802constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2805hashCodeimpl(int i10) {
        return i10;
    }
}
