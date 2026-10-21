package androidx.compose.ui.node;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\"\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\f¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0018\u0092\u0001\u00020\u0004ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/NodeKind;", ExifInterface.GPS_DIRECTION_TRUE, "", "other", "", "or-H91voCI", "(II)I", "or", "or-impl", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMask", "()I", "mask", "constructor-impl", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class NodeKind<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int mask;

    public /* synthetic */ NodeKind(int i10) {
        this.mask = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m3724boximpl(int i10) {
        return new NodeKind(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3726equalsimpl(int i10, Object obj) {
        return (obj instanceof NodeKind) && i10 == ((NodeKind) obj).m3732unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3727equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: or-H91voCI, reason: not valid java name */
    public static final int m3729orH91voCI(int i10, int i11) {
        return i10 | i11;
    }

    /* JADX INFO: renamed from: or-impl, reason: not valid java name */
    public static final int m3730orimpl(int i10, int i11) {
        return i10 | i11;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3731toStringimpl(int i10) {
        return androidx.collection.g.a("NodeKind(mask=", i10, RootService.CLOSE_BRACKET);
    }

    public boolean equals(Object obj) {
        return m3726equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m3728hashCodeimpl(this.mask);
    }

    public String toString() {
        return m3731toStringimpl(this.mask);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3732unboximpl() {
        return this.mask;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m3725constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3728hashCodeimpl(int i10) {
        return i10;
    }
}
