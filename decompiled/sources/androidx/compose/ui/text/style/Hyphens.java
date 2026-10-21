package androidx.compose.ui.text.style;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Hyphens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/Hyphens;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class Hyphens {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18221b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18222c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18223a;

    /* JADX INFO: compiled from: Hyphens.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/Hyphens$Companion;", "", "()V", "Auto", "Landroidx/compose/ui/text/style/Hyphens;", "getAuto-vmbZdU8", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "None", "getNone-vmbZdU8", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m4217getAutovmbZdU8() {
            return Hyphens.f18222c;
        }

        /* JADX INFO: renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m4218getNonevmbZdU8() {
            return Hyphens.f18221b;
        }
    }

    public /* synthetic */ Hyphens(int i10) {
        this.f18223a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m4211boximpl(int i10) {
        return new Hyphens(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4212equalsimpl(int i10, Object obj) {
        return (obj instanceof Hyphens) && i10 == ((Hyphens) obj).getF18223a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4213equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4215toStringimpl(int i10) {
        if (m4213equalsimpl0(i10, f18221b)) {
            return "Hyphens.None";
        }
        return m4213equalsimpl0(i10, f18222c) ? "Hyphens.Auto" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4212equalsimpl(this.f18223a, obj);
    }

    public int hashCode() {
        return m4214hashCodeimpl(this.f18223a);
    }

    @NotNull
    public String toString() {
        return m4215toStringimpl(this.f18223a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF18223a() {
        return this.f18223a;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4214hashCodeimpl(int i10) {
        return i10;
    }
}
