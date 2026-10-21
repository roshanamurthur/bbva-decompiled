package androidx.compose.ui.input.key;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/key/KeyEventType;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class KeyEventType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16311b = m3357constructorimpl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16312c = m3357constructorimpl(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16313d = m3357constructorimpl(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16314a;

    /* JADX INFO: compiled from: KeyEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/input/key/KeyEventType$Companion;", "", "()V", "KeyDown", "Landroidx/compose/ui/input/key/KeyEventType;", "getKeyDown-CS__XNY", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "KeyUp", "getKeyUp-CS__XNY", "Unknown", "getUnknown-CS__XNY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m3363getKeyDownCS__XNY() {
            return KeyEventType.f16313d;
        }

        /* JADX INFO: renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m3364getKeyUpCS__XNY() {
            return KeyEventType.f16312c;
        }

        /* JADX INFO: renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m3365getUnknownCS__XNY() {
            return KeyEventType.f16311b;
        }
    }

    public /* synthetic */ KeyEventType(int i10) {
        this.f16314a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m3356boximpl(int i10) {
        return new KeyEventType(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3358equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyEventType) && i10 == ((KeyEventType) obj).getF16314a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3359equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3361toStringimpl(int i10) {
        if (m3359equalsimpl0(i10, f16312c)) {
            return "KeyUp";
        }
        if (m3359equalsimpl0(i10, f16313d)) {
            return "KeyDown";
        }
        return m3359equalsimpl0(i10, f16311b) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3358equalsimpl(this.f16314a, obj);
    }

    public int hashCode() {
        return m3360hashCodeimpl(this.f16314a);
    }

    @NotNull
    public String toString() {
        return m3361toStringimpl(this.f16314a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF16314a() {
        return this.f16314a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3357constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3360hashCodeimpl(int i10) {
        return i10;
    }
}
