package androidx.compose.ui.input.pointer;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerType;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class PointerType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16456b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16457c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16458d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16459e = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16460a;

    /* JADX INFO: compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerType$Companion;", "", "()V", "Eraser", "Landroidx/compose/ui/input/pointer/PointerType;", "getEraser-T8wyACA", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Mouse", "getMouse-T8wyACA", "Stylus", "getStylus-T8wyACA", "Touch", "getTouch-T8wyACA", "Unknown", "getUnknown-T8wyACA", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m3536getEraserT8wyACA() {
            return PointerType.f16459e;
        }

        /* JADX INFO: renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m3537getMouseT8wyACA() {
            return PointerType.f16457c;
        }

        /* JADX INFO: renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m3538getStylusT8wyACA() {
            return PointerType.f16458d;
        }

        /* JADX INFO: renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m3539getTouchT8wyACA() {
            return PointerType.f16456b;
        }

        /* JADX INFO: renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m3540getUnknownT8wyACA() {
            return PointerType.access$getUnknown$cp();
        }
    }

    public /* synthetic */ PointerType(int i10) {
        this.f16460a = i10;
    }

    public static final /* synthetic */ int access$getUnknown$cp() {
        return 0;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m3530boximpl(int i10) {
        return new PointerType(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3531equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerType) && i10 == ((PointerType) obj).getF16460a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3532equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3534toStringimpl(int i10) {
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            return "Mouse";
        }
        if (i10 != 3) {
            return i10 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public boolean equals(Object obj) {
        return m3531equalsimpl(this.f16460a, obj);
    }

    public int hashCode() {
        return m3533hashCodeimpl(this.f16460a);
    }

    @NotNull
    public String toString() {
        return m3534toStringimpl(this.f16460a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF16460a() {
        return this.f16460a;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3533hashCodeimpl(int i10) {
        return i10;
    }
}
