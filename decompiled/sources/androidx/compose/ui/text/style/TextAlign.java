package androidx.compose.ui.text.style;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextAlign.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class TextAlign {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18252b = m4290constructorimpl(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18253c = m4290constructorimpl(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18254d = m4290constructorimpl(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18255e = m4290constructorimpl(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18256f = m4290constructorimpl(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18257g = m4290constructorimpl(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18258a;

    /* JADX INFO: compiled from: TextAlign.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013ø\u0001\u0000R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign$Companion;", "", "()V", "Center", "Landroidx/compose/ui/text/style/TextAlign;", "getCenter-e0LSkKk", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "End", "getEnd-e0LSkKk", "Justify", "getJustify-e0LSkKk", "Left", "getLeft-e0LSkKk", "Right", "getRight-e0LSkKk", "Start", "getStart-e0LSkKk", "values", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m4296getCentere0LSkKk() {
            return TextAlign.f18254d;
        }

        /* JADX INFO: renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m4297getEnde0LSkKk() {
            return TextAlign.f18257g;
        }

        /* JADX INFO: renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m4298getJustifye0LSkKk() {
            return TextAlign.f18255e;
        }

        /* JADX INFO: renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m4299getLefte0LSkKk() {
            return TextAlign.f18252b;
        }

        /* JADX INFO: renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m4300getRighte0LSkKk() {
            return TextAlign.f18253c;
        }

        /* JADX INFO: renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m4301getStarte0LSkKk() {
            return TextAlign.f18256f;
        }

        @NotNull
        public final List<TextAlign> values() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new TextAlign[]{TextAlign.m4289boximpl(m4299getLefte0LSkKk()), TextAlign.m4289boximpl(m4300getRighte0LSkKk()), TextAlign.m4289boximpl(m4296getCentere0LSkKk()), TextAlign.m4289boximpl(m4298getJustifye0LSkKk()), TextAlign.m4289boximpl(m4301getStarte0LSkKk()), TextAlign.m4289boximpl(m4297getEnde0LSkKk())});
        }
    }

    public /* synthetic */ TextAlign(int i10) {
        this.f18258a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m4289boximpl(int i10) {
        return new TextAlign(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4291equalsimpl(int i10, Object obj) {
        return (obj instanceof TextAlign) && i10 == ((TextAlign) obj).getF18258a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4292equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4294toStringimpl(int i10) {
        if (m4292equalsimpl0(i10, f18252b)) {
            return "Left";
        }
        if (m4292equalsimpl0(i10, f18253c)) {
            return "Right";
        }
        if (m4292equalsimpl0(i10, f18254d)) {
            return "Center";
        }
        if (m4292equalsimpl0(i10, f18255e)) {
            return "Justify";
        }
        if (m4292equalsimpl0(i10, f18256f)) {
            return "Start";
        }
        return m4292equalsimpl0(i10, f18257g) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4291equalsimpl(this.f18258a, obj);
    }

    public int hashCode() {
        return m4293hashCodeimpl(this.f18258a);
    }

    @NotNull
    public String toString() {
        return m4294toStringimpl(this.f18258a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF18258a() {
        return this.f18258a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4290constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4293hashCodeimpl(int i10) {
        return i10;
    }
}
