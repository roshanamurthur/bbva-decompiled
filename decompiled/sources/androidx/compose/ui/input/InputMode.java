package androidx.compose.ui.input;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InputModeManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/InputMode;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class InputMode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16166b = m3044constructorimpl(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16167c = m3044constructorimpl(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16168a;

    /* JADX INFO: compiled from: InputModeManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/input/InputMode$Companion;", "", "()V", "Keyboard", "Landroidx/compose/ui/input/InputMode;", "getKeyboard-aOaMEAU", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Touch", "getTouch-aOaMEAU", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m3050getKeyboardaOaMEAU() {
            return InputMode.f16167c;
        }

        /* JADX INFO: renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m3051getTouchaOaMEAU() {
            return InputMode.f16166b;
        }
    }

    public /* synthetic */ InputMode(int i10) {
        this.f16168a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputMode m3043boximpl(int i10) {
        return new InputMode(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3045equalsimpl(int i10, Object obj) {
        return (obj instanceof InputMode) && i10 == ((InputMode) obj).getF16168a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3046equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3048toStringimpl(int i10) {
        if (m3046equalsimpl0(i10, f16166b)) {
            return "Touch";
        }
        return m3046equalsimpl0(i10, f16167c) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m3045equalsimpl(this.f16168a, obj);
    }

    public int hashCode() {
        return m3047hashCodeimpl(this.f16168a);
    }

    @NotNull
    public String toString() {
        return m3048toStringimpl(this.f16168a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF16168a() {
        return this.f16168a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3044constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3047hashCodeimpl(int i10) {
        return i10;
    }
}
