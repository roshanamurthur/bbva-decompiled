package androidx.compose.ui.text.font;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FontLoadingStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "value", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class FontLoadingStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17986b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17987c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int value;

    /* JADX INFO: compiled from: FontLoadingStrategy.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;", "", "()V", "Async", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getAsync-PKNRLFQ", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Blocking", "getBlocking-PKNRLFQ", "OptionalLocal", "getOptionalLocal-PKNRLFQ", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m4053getAsyncPKNRLFQ() {
            return FontLoadingStrategy.f17987c;
        }

        /* JADX INFO: renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m4054getBlockingPKNRLFQ() {
            return FontLoadingStrategy.access$getBlocking$cp();
        }

        /* JADX INFO: renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m4055getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.f17986b;
        }
    }

    public /* synthetic */ FontLoadingStrategy(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ int access$getBlocking$cp() {
        return 0;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m4047boximpl(int i10) {
        return new FontLoadingStrategy(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4048equalsimpl(int i10, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i10 == ((FontLoadingStrategy) obj).m4052unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4049equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4051toStringimpl(int i10) {
        if (m4049equalsimpl0(i10, 0)) {
            return "Blocking";
        }
        if (m4049equalsimpl0(i10, f17986b)) {
            return "Optional";
        }
        return m4049equalsimpl0(i10, f17987c) ? "Async" : androidx.collection.g.a("Invalid(value=", i10, RootService.CLOSE_BRACKET);
    }

    public boolean equals(Object obj) {
        return m4048equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4050hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m4051toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4052unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4050hashCodeimpl(int i10) {
        return i10;
    }
}
