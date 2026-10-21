package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyboardCapitalization.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class KeyboardCapitalization {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18081b = m4132constructorimpl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18082c = m4132constructorimpl(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18083d = m4132constructorimpl(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18084e = m4132constructorimpl(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18085a;

    public /* synthetic */ KeyboardCapitalization(int i10) {
        this.f18085a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m4131boximpl(int i10) {
        return new KeyboardCapitalization(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4133equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i10 == ((KeyboardCapitalization) obj).getF18085a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4134equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4136toStringimpl(int i10) {
        if (m4134equalsimpl0(i10, f18081b)) {
            return "None";
        }
        if (m4134equalsimpl0(i10, f18082c)) {
            return "Characters";
        }
        if (m4134equalsimpl0(i10, f18083d)) {
            return "Words";
        }
        return m4134equalsimpl0(i10, f18084e) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4133equalsimpl(this.f18085a, obj);
    }

    public int hashCode() {
        return m4135hashCodeimpl(this.f18085a);
    }

    @NotNull
    public String toString() {
        return m4136toStringimpl(this.f18085a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF18085a() {
        return this.f18085a;
    }

    /* JADX INFO: compiled from: KeyboardCapitalization.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;", "", "()V", "Characters", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCharacters-IUNYP9k$annotations", "getCharacters-IUNYP9k", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "None", "getNone-IUNYP9k$annotations", "getNone-IUNYP9k", "Sentences", "getSentences-IUNYP9k$annotations", "getSentences-IUNYP9k", "Words", "getWords-IUNYP9k$annotations", "getWords-IUNYP9k", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m4142getCharactersIUNYP9k() {
            return KeyboardCapitalization.f18082c;
        }

        /* JADX INFO: renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m4143getNoneIUNYP9k() {
            return KeyboardCapitalization.f18081b;
        }

        /* JADX INFO: renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m4144getSentencesIUNYP9k() {
            return KeyboardCapitalization.f18084e;
        }

        /* JADX INFO: renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m4145getWordsIUNYP9k() {
            return KeyboardCapitalization.f18083d;
        }

        @Stable
        /* JADX INFO: renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4138getCharactersIUNYP9k$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4139getNoneIUNYP9k$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4140getSentencesIUNYP9k$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m4141getWordsIUNYP9k$annotations() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4132constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4135hashCodeimpl(int i10) {
        return i10;
    }
}
