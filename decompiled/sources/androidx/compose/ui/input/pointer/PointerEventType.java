package androidx.compose.ui.input.pointer;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class PointerEventType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16380b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16381c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16382d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16383e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16384f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16385g = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16386a;

    /* JADX INFO: compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType$Companion;", "", "()V", "Enter", "Landroidx/compose/ui/input/pointer/PointerEventType;", "getEnter-7fucELk", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Exit", "getExit-7fucELk", "Move", "getMove-7fucELk", "Press", "getPress-7fucELk", "Release", "getRelease-7fucELk", "Scroll", "getScroll-7fucELk", "Unknown", "getUnknown-7fucELk", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m3432getEnter7fucELk() {
            return PointerEventType.f16383e;
        }

        /* JADX INFO: renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m3433getExit7fucELk() {
            return PointerEventType.f16384f;
        }

        /* JADX INFO: renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m3434getMove7fucELk() {
            return PointerEventType.f16382d;
        }

        /* JADX INFO: renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m3435getPress7fucELk() {
            return PointerEventType.f16380b;
        }

        /* JADX INFO: renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m3436getRelease7fucELk() {
            return PointerEventType.f16381c;
        }

        /* JADX INFO: renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m3437getScroll7fucELk() {
            return PointerEventType.f16385g;
        }

        /* JADX INFO: renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m3438getUnknown7fucELk() {
            return PointerEventType.access$getUnknown$cp();
        }
    }

    public /* synthetic */ PointerEventType(int i10) {
        this.f16386a = i10;
    }

    public static final /* synthetic */ int access$getUnknown$cp() {
        return 0;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m3426boximpl(int i10) {
        return new PointerEventType(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3427equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerEventType) && i10 == ((PointerEventType) obj).getF16386a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3428equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3430toStringimpl(int i10) {
        if (m3428equalsimpl0(i10, f16380b)) {
            return "Press";
        }
        if (m3428equalsimpl0(i10, f16381c)) {
            return "Release";
        }
        if (m3428equalsimpl0(i10, f16382d)) {
            return "Move";
        }
        if (m3428equalsimpl0(i10, f16383e)) {
            return "Enter";
        }
        if (m3428equalsimpl0(i10, f16384f)) {
            return "Exit";
        }
        return m3428equalsimpl0(i10, f16385g) ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m3427equalsimpl(this.f16386a, obj);
    }

    public int hashCode() {
        return m3429hashCodeimpl(this.f16386a);
    }

    @NotNull
    public String toString() {
        return m3430toStringimpl(this.f16386a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF16386a() {
        return this.f16386a;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3429hashCodeimpl(int i10) {
        return i10;
    }
}
