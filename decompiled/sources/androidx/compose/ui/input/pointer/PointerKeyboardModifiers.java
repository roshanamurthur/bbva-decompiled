package androidx.compose.ui.input.pointer;

import androidx.collection.g;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0010\u001a\u00060\u0006j\u0002`\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00060\u0006j\u0002`\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "packedValue", "constructor-impl", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class PointerKeyboardModifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16455a;

    public /* synthetic */ PointerKeyboardModifiers(int i10) {
        this.f16455a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m3523boximpl(int i10) {
        return new PointerKeyboardModifiers(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3525equalsimpl(int i10, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i10 == ((PointerKeyboardModifiers) obj).getF16455a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3526equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3528toStringimpl(int i10) {
        return g.a("PointerKeyboardModifiers(packedValue=", i10, RootService.CLOSE_BRACKET);
    }

    public boolean equals(Object obj) {
        return m3525equalsimpl(this.f16455a, obj);
    }

    public int hashCode() {
        return m3527hashCodeimpl(this.f16455a);
    }

    public String toString() {
        return m3528toStringimpl(this.f16455a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF16455a() {
        return this.f16455a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3524constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3527hashCodeimpl(int i10) {
        return i10;
    }
}
