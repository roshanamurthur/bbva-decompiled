package androidx.compose.ui.text;

import androidx.collection.g;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmojiSupportMatch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class EmojiSupportMatch {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17607b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17608a;

    /* JADX INFO: compiled from: EmojiSupportMatch.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/EmojiSupportMatch;", "getDefault-_3YsG6Y", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "None", "getNone-_3YsG6Y", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m3864getDefault_3YsG6Y() {
            return EmojiSupportMatch.access$getDefault$cp();
        }

        /* JADX INFO: renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m3865getNone_3YsG6Y() {
            return EmojiSupportMatch.f17607b;
        }
    }

    public /* synthetic */ EmojiSupportMatch(int i10) {
        this.f17608a = i10;
    }

    public static final /* synthetic */ int access$getDefault$cp() {
        return 0;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m3858boximpl(int i10) {
        return new EmojiSupportMatch(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3859equalsimpl(int i10, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i10 == ((EmojiSupportMatch) obj).getF17608a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3860equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3862toStringimpl(int i10) {
        if (i10 == 0) {
            return "EmojiSupportMatch.Default";
        }
        return i10 == f17607b ? "EmojiSupportMatch.None" : g.a("Invalid(value=", i10, RootService.CLOSE_BRACKET);
    }

    public boolean equals(Object obj) {
        return m3859equalsimpl(this.f17608a, obj);
    }

    public int hashCode() {
        return m3861hashCodeimpl(this.f17608a);
    }

    @NotNull
    public String toString() {
        return m3862toStringimpl(this.f17608a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF17608a() {
        return this.f17608a;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3861hashCodeimpl(int i10) {
        return i10;
    }
}
