package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/semantics/Role;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class Role {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17484b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17485c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17486d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f17487e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17488f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17489g = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17490a;

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/Role$Companion;", "", "()V", "Button", "Landroidx/compose/ui/semantics/Role;", "getButton-o7Vup1c", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Checkbox", "getCheckbox-o7Vup1c", "DropdownList", "getDropdownList-o7Vup1c", "Image", "getImage-o7Vup1c", "RadioButton", "getRadioButton-o7Vup1c", "Switch", "getSwitch-o7Vup1c", "Tab", "getTab-o7Vup1c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m3831getButtono7Vup1c() {
            return Role.access$getButton$cp();
        }

        /* JADX INFO: renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m3832getCheckboxo7Vup1c() {
            return Role.f17484b;
        }

        /* JADX INFO: renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m3833getDropdownListo7Vup1c() {
            return Role.f17489g;
        }

        /* JADX INFO: renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m3834getImageo7Vup1c() {
            return Role.f17488f;
        }

        /* JADX INFO: renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m3835getRadioButtono7Vup1c() {
            return Role.f17486d;
        }

        /* JADX INFO: renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m3836getSwitcho7Vup1c() {
            return Role.f17485c;
        }

        /* JADX INFO: renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m3837getTabo7Vup1c() {
            return Role.f17487e;
        }
    }

    public /* synthetic */ Role(int i10) {
        this.f17490a = i10;
    }

    public static final /* synthetic */ int access$getButton$cp() {
        return 0;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m3825boximpl(int i10) {
        return new Role(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3826equalsimpl(int i10, Object obj) {
        return (obj instanceof Role) && i10 == ((Role) obj).getF17490a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3827equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3829toStringimpl(int i10) {
        if (m3827equalsimpl0(i10, 0)) {
            return "Button";
        }
        if (m3827equalsimpl0(i10, f17484b)) {
            return "Checkbox";
        }
        if (m3827equalsimpl0(i10, f17485c)) {
            return "Switch";
        }
        if (m3827equalsimpl0(i10, f17486d)) {
            return "RadioButton";
        }
        if (m3827equalsimpl0(i10, f17487e)) {
            return "Tab";
        }
        if (m3827equalsimpl0(i10, f17488f)) {
            return "Image";
        }
        return m3827equalsimpl0(i10, f17489g) ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m3826equalsimpl(this.f17490a, obj);
    }

    public int hashCode() {
        return m3828hashCodeimpl(this.f17490a);
    }

    @NotNull
    public String toString() {
        return m3829toStringimpl(this.f17490a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF17490a() {
        return this.f17490a;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3828hashCodeimpl(int i10) {
        return i10;
    }
}
