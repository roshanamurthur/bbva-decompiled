package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyboardType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class KeyboardType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18086b = m4147constructorimpl(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18087c = m4147constructorimpl(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18088d = m4147constructorimpl(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18089e = m4147constructorimpl(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18090f = m4147constructorimpl(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18091g = m4147constructorimpl(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18092h = m4147constructorimpl(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18093i = m4147constructorimpl(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18094j = m4147constructorimpl(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18095a;

    public /* synthetic */ KeyboardType(int i10) {
        this.f18095a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m4146boximpl(int i10) {
        return new KeyboardType(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4148equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyboardType) && i10 == ((KeyboardType) obj).getF18095a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4149equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4151toStringimpl(int i10) {
        if (m4149equalsimpl0(i10, f18086b)) {
            return "Text";
        }
        if (m4149equalsimpl0(i10, f18087c)) {
            return "Ascii";
        }
        if (m4149equalsimpl0(i10, f18088d)) {
            return "Number";
        }
        if (m4149equalsimpl0(i10, f18089e)) {
            return "Phone";
        }
        if (m4149equalsimpl0(i10, f18090f)) {
            return "Uri";
        }
        if (m4149equalsimpl0(i10, f18091g)) {
            return "Email";
        }
        if (m4149equalsimpl0(i10, f18092h)) {
            return "Password";
        }
        if (m4149equalsimpl0(i10, f18093i)) {
            return "NumberPassword";
        }
        return m4149equalsimpl0(i10, f18094j) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4148equalsimpl(this.f18095a, obj);
    }

    public int hashCode() {
        return m4150hashCodeimpl(this.f18095a);
    }

    @NotNull
    public String toString() {
        return m4151toStringimpl(this.f18095a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF18095a() {
        return this.f18095a;
    }

    /* JADX INFO: compiled from: KeyboardType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R'\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R'\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R'\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R'\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R'\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "()V", "Ascii", "Landroidx/compose/ui/text/input/KeyboardType;", "getAscii-PjHm6EE$annotations", "getAscii-PjHm6EE", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Decimal", "getDecimal-PjHm6EE$annotations", "getDecimal-PjHm6EE", "Email", "getEmail-PjHm6EE$annotations", "getEmail-PjHm6EE", "Number", "getNumber-PjHm6EE$annotations", "getNumber-PjHm6EE", "NumberPassword", "getNumberPassword-PjHm6EE$annotations", "getNumberPassword-PjHm6EE", "Password", "getPassword-PjHm6EE$annotations", "getPassword-PjHm6EE", "Phone", "getPhone-PjHm6EE$annotations", "getPhone-PjHm6EE", "Text", "getText-PjHm6EE$annotations", "getText-PjHm6EE", "Uri", "getUri-PjHm6EE$annotations", "getUri-PjHm6EE", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m4162getAsciiPjHm6EE() {
            return KeyboardType.f18087c;
        }

        /* JADX INFO: renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m4163getDecimalPjHm6EE() {
            return KeyboardType.f18094j;
        }

        /* JADX INFO: renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m4164getEmailPjHm6EE() {
            return KeyboardType.f18091g;
        }

        /* JADX INFO: renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m4165getNumberPjHm6EE() {
            return KeyboardType.f18088d;
        }

        /* JADX INFO: renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m4166getNumberPasswordPjHm6EE() {
            return KeyboardType.f18093i;
        }

        /* JADX INFO: renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m4167getPasswordPjHm6EE() {
            return KeyboardType.f18092h;
        }

        /* JADX INFO: renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m4168getPhonePjHm6EE() {
            return KeyboardType.f18089e;
        }

        /* JADX INFO: renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m4169getTextPjHm6EE() {
            return KeyboardType.f18086b;
        }

        /* JADX INFO: renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m4170getUriPjHm6EE() {
            return KeyboardType.f18090f;
        }

        @Stable
        /* JADX INFO: renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4153getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4154getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4155getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4156getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4157getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4158getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4159getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4160getTextPjHm6EE$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4161getUriPjHm6EE$annotations() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4147constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4150hashCodeimpl(int i10) {
        return i10;
    }
}
