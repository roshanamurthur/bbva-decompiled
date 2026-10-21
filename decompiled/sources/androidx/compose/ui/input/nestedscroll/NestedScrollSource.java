package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class NestedScrollSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16344b = m3385constructorimpl(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16345c = m3385constructorimpl(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16346d = m3385constructorimpl(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16347a;

    public /* synthetic */ NestedScrollSource(int i10) {
        this.f16347a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m3384boximpl(int i10) {
        return new NestedScrollSource(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3386equalsimpl(int i10, Object obj) {
        return (obj instanceof NestedScrollSource) && i10 == ((NestedScrollSource) obj).getF16347a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3387equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3389toStringimpl(int i10) {
        if (m3387equalsimpl0(i10, f16344b)) {
            return "Drag";
        }
        if (m3387equalsimpl0(i10, f16345c)) {
            return "Fling";
        }
        return m3387equalsimpl0(i10, f16346d) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3386equalsimpl(this.f16347a, obj);
    }

    public int hashCode() {
        return m3388hashCodeimpl(this.f16347a);
    }

    @NotNull
    public String toString() {
        return m3389toStringimpl(this.f16347a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF16347a() {
        return this.f16347a;
    }

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R'\u0010\n\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;", "", "()V", "Drag", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "getDrag-WNlRxjI", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Fling", "getFling-WNlRxjI", "Relocate", "getRelocate-WNlRxjI$annotations", "getRelocate-WNlRxjI", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m3392getDragWNlRxjI() {
            return NestedScrollSource.f16344b;
        }

        /* JADX INFO: renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m3393getFlingWNlRxjI() {
            return NestedScrollSource.f16345c;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m3394getRelocateWNlRxjI() {
            return NestedScrollSource.f16346d;
        }

        @Deprecated(message = "Do not use. Will be removed in the future.")
        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m3391getRelocateWNlRxjI$annotations() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3385constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3388hashCodeimpl(int i10) {
        return i10;
    }
}
