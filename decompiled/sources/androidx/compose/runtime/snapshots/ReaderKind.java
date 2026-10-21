package androidx.compose.runtime.snapshots;

import androidx.collection.g;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StateObjectImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081@\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u001a\u0092\u0001\u00020\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "reader", "withReadIn-3QSx2Dw", "(II)I", "withReadIn", "", "isReadIn-h_f27i8", "(II)Z", "isReadIn", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMask", "()I", "mask", "constructor-impl", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class ReaderKind {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int mask;

    /* JADX INFO: compiled from: StateObjectImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "()V", "Composition", "Landroidx/compose/runtime/snapshots/ReaderKind;", "getComposition-6f8NoZ8", "()I", "SnapshotFlow", "getSnapshotFlow-6f8NoZ8", "SnapshotStateObserver", "getSnapshotStateObserver-6f8NoZ8", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m2179getComposition6f8NoZ8() {
            return ReaderKind.m2170constructorimpl(1);
        }

        /* JADX INFO: renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m2180getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m2170constructorimpl(4);
        }

        /* JADX INFO: renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m2181getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m2170constructorimpl(2);
        }
    }

    public /* synthetic */ ReaderKind(int i10) {
        this.mask = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m2169boximpl(int i10) {
        return new ReaderKind(i10);
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m2171constructorimpl$default(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m2170constructorimpl(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2172equalsimpl(int i10, Object obj) {
        return (obj instanceof ReaderKind) && i10 == ((ReaderKind) obj).m2178unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2173equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m2175isReadInh_f27i8(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2176toStringimpl(int i10) {
        return g.a("ReaderKind(mask=", i10, RootService.CLOSE_BRACKET);
    }

    /* JADX INFO: renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m2177withReadIn3QSx2Dw(int i10, int i11) {
        return m2170constructorimpl(i10 | i11);
    }

    public boolean equals(Object obj) {
        return m2172equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m2174hashCodeimpl(this.mask);
    }

    public String toString() {
        return m2176toStringimpl(this.mask);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2178unboximpl() {
        return this.mask;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2170constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2174hashCodeimpl(int i10) {
        return i10;
    }
}
