package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImeAction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class ImeAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18062b = m4102constructorimpl(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18063c = m4102constructorimpl(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18064d = m4102constructorimpl(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18065e = m4102constructorimpl(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18066f = m4102constructorimpl(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18067g = m4102constructorimpl(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18068h = m4102constructorimpl(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18069i = m4102constructorimpl(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18070a;

    public /* synthetic */ ImeAction(int i10) {
        this.f18070a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m4101boximpl(int i10) {
        return new ImeAction(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4103equalsimpl(int i10, Object obj) {
        return (obj instanceof ImeAction) && i10 == ((ImeAction) obj).getF18070a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4104equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4106toStringimpl(int i10) {
        if (m4104equalsimpl0(i10, f18063c)) {
            return "None";
        }
        if (m4104equalsimpl0(i10, f18062b)) {
            return "Default";
        }
        if (m4104equalsimpl0(i10, f18064d)) {
            return "Go";
        }
        if (m4104equalsimpl0(i10, f18065e)) {
            return "Search";
        }
        if (m4104equalsimpl0(i10, f18066f)) {
            return "Send";
        }
        if (m4104equalsimpl0(i10, f18067g)) {
            return "Previous";
        }
        if (m4104equalsimpl0(i10, f18068h)) {
            return "Next";
        }
        return m4104equalsimpl0(i10, f18069i) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4103equalsimpl(this.f18070a, obj);
    }

    public int hashCode() {
        return m4105hashCodeimpl(this.f18070a);
    }

    @NotNull
    public String toString() {
        return m4106toStringimpl(this.f18070a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF18070a() {
        return this.f18070a;
    }

    /* JADX INFO: compiled from: ImeAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R'\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R'\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R'\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R'\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/input/ImeAction;", "getDefault-eUduSuo$annotations", "getDefault-eUduSuo", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Done", "getDone-eUduSuo$annotations", "getDone-eUduSuo", "Go", "getGo-eUduSuo$annotations", "getGo-eUduSuo", "Next", "getNext-eUduSuo$annotations", "getNext-eUduSuo", "None", "getNone-eUduSuo$annotations", "getNone-eUduSuo", "Previous", "getPrevious-eUduSuo$annotations", "getPrevious-eUduSuo", "Search", "getSearch-eUduSuo$annotations", "getSearch-eUduSuo", "Send", "getSend-eUduSuo$annotations", "getSend-eUduSuo", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m4116getDefaulteUduSuo() {
            return ImeAction.f18062b;
        }

        /* JADX INFO: renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m4117getDoneeUduSuo() {
            return ImeAction.f18069i;
        }

        /* JADX INFO: renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m4118getGoeUduSuo() {
            return ImeAction.f18064d;
        }

        /* JADX INFO: renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m4119getNexteUduSuo() {
            return ImeAction.f18068h;
        }

        /* JADX INFO: renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m4120getNoneeUduSuo() {
            return ImeAction.f18063c;
        }

        /* JADX INFO: renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m4121getPreviouseUduSuo() {
            return ImeAction.f18067g;
        }

        /* JADX INFO: renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m4122getSearcheUduSuo() {
            return ImeAction.f18065e;
        }

        /* JADX INFO: renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m4123getSendeUduSuo() {
            return ImeAction.f18066f;
        }

        @Stable
        /* JADX INFO: renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4108getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4109getDoneeUduSuo$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4110getGoeUduSuo$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4111getNexteUduSuo$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4112getNoneeUduSuo$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4113getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4114getSearcheUduSuo$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m4115getSendeUduSuo$annotations() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4102constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4105hashCodeimpl(int i10) {
        return i10;
    }
}
