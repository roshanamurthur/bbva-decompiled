package androidx.compose.foundation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/MarqueeAnimationMode;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "foundation_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class MarqueeAnimationMode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3414b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3415a;

    public /* synthetic */ MarqueeAnimationMode(int i10) {
        this.f3415a = i10;
    }

    public static final /* synthetic */ int access$getImmediately$cp() {
        return 0;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MarqueeAnimationMode m162boximpl(int i10) {
        return new MarqueeAnimationMode(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m163equalsimpl(int i10, Object obj) {
        return (obj instanceof MarqueeAnimationMode) && i10 == ((MarqueeAnimationMode) obj).getF3415a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m164equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m166toStringimpl(int i10) {
        if (m164equalsimpl0(i10, 0)) {
            return "Immediately";
        }
        if (m164equalsimpl0(i10, f3414b)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i10).toString());
    }

    public boolean equals(Object obj) {
        return m163equalsimpl(this.f3415a, obj);
    }

    public int hashCode() {
        return m165hashCodeimpl(this.f3415a);
    }

    @NotNull
    public String toString() {
        return m166toStringimpl(this.f3415a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF3415a() {
        return this.f3415a;
    }

    /* JADX INFO: compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/MarqueeAnimationMode$Companion;", "", "()V", "Immediately", "Landroidx/compose/foundation/MarqueeAnimationMode;", "getImmediately-ZbEOnfQ$annotations", "getImmediately-ZbEOnfQ", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "WhileFocused", "getWhileFocused-ZbEOnfQ$annotations", "getWhileFocused-ZbEOnfQ", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalFoundationApi
        /* JADX INFO: renamed from: getImmediately-ZbEOnfQ, reason: not valid java name */
        public final int m170getImmediatelyZbEOnfQ() {
            return MarqueeAnimationMode.access$getImmediately$cp();
        }

        @ExperimentalFoundationApi
        /* JADX INFO: renamed from: getWhileFocused-ZbEOnfQ, reason: not valid java name */
        public final int m171getWhileFocusedZbEOnfQ() {
            return MarqueeAnimationMode.f3414b;
        }

        @ExperimentalFoundationApi
        /* JADX INFO: renamed from: getImmediately-ZbEOnfQ$annotations, reason: not valid java name */
        public static /* synthetic */ void m168getImmediatelyZbEOnfQ$annotations() {
        }

        @ExperimentalFoundationApi
        /* JADX INFO: renamed from: getWhileFocused-ZbEOnfQ$annotations, reason: not valid java name */
        public static /* synthetic */ void m169getWhileFocusedZbEOnfQ$annotations() {
        }
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m165hashCodeimpl(int i10) {
        return i10;
    }
}
