package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusDirection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class FocusDirection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15465b = m2207constructorimpl(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15466c = m2207constructorimpl(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15467d = m2207constructorimpl(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15468e = m2207constructorimpl(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15469f = m2207constructorimpl(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f15470g = m2207constructorimpl(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f15471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f15472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f15473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f15474k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15475a;

    static {
        int iM2207constructorimpl = m2207constructorimpl(7);
        f15471h = iM2207constructorimpl;
        int iM2207constructorimpl2 = m2207constructorimpl(8);
        f15472i = iM2207constructorimpl2;
        f15473j = iM2207constructorimpl;
        f15474k = iM2207constructorimpl2;
    }

    public /* synthetic */ FocusDirection(int i10) {
        this.f15475a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m2206boximpl(int i10) {
        return new FocusDirection(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2208equalsimpl(int i10, Object obj) {
        return (obj instanceof FocusDirection) && i10 == ((FocusDirection) obj).getF15475a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2209equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2211toStringimpl(int i10) {
        if (m2209equalsimpl0(i10, f15465b)) {
            return "Next";
        }
        if (m2209equalsimpl0(i10, f15466c)) {
            return "Previous";
        }
        if (m2209equalsimpl0(i10, f15467d)) {
            return "Left";
        }
        if (m2209equalsimpl0(i10, f15468e)) {
            return "Right";
        }
        if (m2209equalsimpl0(i10, f15469f)) {
            return "Up";
        }
        if (m2209equalsimpl0(i10, f15470g)) {
            return "Down";
        }
        if (m2209equalsimpl0(i10, f15471h)) {
            return "Enter";
        }
        return m2209equalsimpl0(i10, f15472i) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m2208equalsimpl(this.f15475a, obj);
    }

    public int hashCode() {
        return m2210hashCodeimpl(this.f15475a);
    }

    @NotNull
    public String toString() {
        return m2211toStringimpl(this.f15475a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF15475a() {
        return this.f15475a;
    }

    /* JADX INFO: compiled from: FocusDirection.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R'\u0010\b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0006R'\u0010\u000b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0006R'\u0010\u000e\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R'\u0010\u0015\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "()V", "Down", "Landroidx/compose/ui/focus/FocusDirection;", "getDown-dhqQ-8s", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Enter", "getEnter-dhqQ-8s$annotations", "getEnter-dhqQ-8s", "Exit", "getExit-dhqQ-8s$annotations", "getExit-dhqQ-8s", "In", "getIn-dhqQ-8s$annotations", "getIn-dhqQ-8s", "Left", "getLeft-dhqQ-8s", "Next", "getNext-dhqQ-8s", "Out", "getOut-dhqQ-8s$annotations", "getOut-dhqQ-8s", "Previous", "getPrevious-dhqQ-8s", "Right", "getRight-dhqQ-8s", "Up", "getUp-dhqQ-8s", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m2217getDowndhqQ8s() {
            return FocusDirection.f15470g;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m2218getEnterdhqQ8s() {
            return FocusDirection.f15471h;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m2219getExitdhqQ8s() {
            return FocusDirection.f15472i;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getIn-dhqQ-8s, reason: not valid java name */
        public final int m2220getIndhqQ8s() {
            return FocusDirection.f15473j;
        }

        /* JADX INFO: renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m2221getLeftdhqQ8s() {
            return FocusDirection.f15467d;
        }

        /* JADX INFO: renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m2222getNextdhqQ8s() {
            return FocusDirection.f15465b;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getOut-dhqQ-8s, reason: not valid java name */
        public final int m2223getOutdhqQ8s() {
            return FocusDirection.f15474k;
        }

        /* JADX INFO: renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m2224getPreviousdhqQ8s() {
            return FocusDirection.f15466c;
        }

        /* JADX INFO: renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m2225getRightdhqQ8s() {
            return FocusDirection.f15468e;
        }

        /* JADX INFO: renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m2226getUpdhqQ8s() {
            return FocusDirection.f15469f;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getEnter-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m2213getEnterdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getExit-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m2214getExitdhqQ8s$annotations() {
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use FocusDirection.Enter instead.", replaceWith = @ReplaceWith(expression = "Enter", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Enter"}))
        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getIn-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m2215getIndhqQ8s$annotations() {
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use FocusDirection.Exit instead.", replaceWith = @ReplaceWith(expression = "Exit", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Exit"}))
        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getOut-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m2216getOutdhqQ8s$annotations() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2207constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2210hashCodeimpl(int i10) {
        return i10;
    }
}
