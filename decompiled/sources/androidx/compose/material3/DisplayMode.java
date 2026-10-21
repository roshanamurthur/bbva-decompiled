package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/DisplayMode;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
public final class DisplayMode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10186b = m1074constructorimpl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10187c = m1074constructorimpl(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10188a;

    /* JADX INFO: compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material3/DisplayMode$Companion;", "", "()V", "Input", "Landroidx/compose/material3/DisplayMode;", "getInput-jFl-4v0", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Picker", "getPicker-jFl-4v0", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getInput-jFl-4v0, reason: not valid java name */
        public final int m1080getInputjFl4v0() {
            return DisplayMode.f10187c;
        }

        /* JADX INFO: renamed from: getPicker-jFl-4v0, reason: not valid java name */
        public final int m1081getPickerjFl4v0() {
            return DisplayMode.f10186b;
        }
    }

    public /* synthetic */ DisplayMode(int i10) {
        this.f10188a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DisplayMode m1073boximpl(int i10) {
        return new DisplayMode(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1075equalsimpl(int i10, Object obj) {
        return (obj instanceof DisplayMode) && i10 == ((DisplayMode) obj).getF10188a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1076equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1078toStringimpl(int i10) {
        if (m1076equalsimpl0(i10, f10186b)) {
            return "Picker";
        }
        return m1076equalsimpl0(i10, f10187c) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1075equalsimpl(this.f10188a, obj);
    }

    public int hashCode() {
        return m1077hashCodeimpl(this.f10188a);
    }

    @NotNull
    public String toString() {
        return m1078toStringimpl(this.f10188a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF10188a() {
        return this.f10188a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1074constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1077hashCodeimpl(int i10) {
        return i10;
    }
}
