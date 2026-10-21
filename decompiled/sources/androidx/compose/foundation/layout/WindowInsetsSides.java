package androidx.compose.foundation.layout;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u0088\u0001\u0017\u0092\u0001\u00020\u000eø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "sides", "plus-gK_yJZ4", "(II)I", "plus", "", "hasAny-bkgdKaI$foundation_layout_release", "(II)Z", "hasAny", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class WindowInsetsSides {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4452b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4453c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4454d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4455e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4456f = m352plusgK_yJZ4(8, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f4457g = m352plusgK_yJZ4(4, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f4458h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f4459i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f4460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f4461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f4462l;
    public static final int m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4463a;

    /* JADX INFO: compiled from: WindowInsets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001f\u0010\n\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001f\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "()V", "AllowLeftInLtr", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "getAllowLeftInLtr-JoeWqyM$foundation_layout_release", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout_release", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout_release", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout_release", "Bottom", "getBottom-JoeWqyM", "End", "getEnd-JoeWqyM", "Horizontal", "getHorizontal-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "Start", "getStart-JoeWqyM", "Top", "getTop-JoeWqyM", "Vertical", "getVertical-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m355getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f4452b;
        }

        /* JADX INFO: renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m356getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f4454d;
        }

        /* JADX INFO: renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m357getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f4453c;
        }

        /* JADX INFO: renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m358getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.f4455e;
        }

        /* JADX INFO: renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m359getBottomJoeWqyM() {
            return WindowInsetsSides.f4459i;
        }

        /* JADX INFO: renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m360getEndJoeWqyM() {
            return WindowInsetsSides.f4457g;
        }

        /* JADX INFO: renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m361getHorizontalJoeWqyM() {
            return WindowInsetsSides.f4462l;
        }

        /* JADX INFO: renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m362getLeftJoeWqyM() {
            return WindowInsetsSides.f4460j;
        }

        /* JADX INFO: renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m363getRightJoeWqyM() {
            return WindowInsetsSides.f4461k;
        }

        /* JADX INFO: renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m364getStartJoeWqyM() {
            return WindowInsetsSides.f4456f;
        }

        /* JADX INFO: renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m365getTopJoeWqyM() {
            return WindowInsetsSides.f4458h;
        }

        /* JADX INFO: renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m366getVerticalJoeWqyM() {
            return WindowInsetsSides.m;
        }
    }

    static {
        int iM352plusgK_yJZ4 = m352plusgK_yJZ4(8, 2);
        f4460j = iM352plusgK_yJZ4;
        int iM352plusgK_yJZ5 = m352plusgK_yJZ4(4, 1);
        f4461k = iM352plusgK_yJZ5;
        f4462l = m352plusgK_yJZ4(iM352plusgK_yJZ4, iM352plusgK_yJZ5);
        m = m352plusgK_yJZ4(16, 32);
    }

    public /* synthetic */ WindowInsetsSides(int i10) {
        this.f4463a = i10;
    }

    public static final void a(String str, StringBuilder sb2) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m347boximpl(int i10) {
        return new WindowInsetsSides(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m348equalsimpl(int i10, Object obj) {
        return (obj instanceof WindowInsetsSides) && i10 == ((WindowInsetsSides) obj).getF4463a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m349equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m350hasAnybkgdKaI$foundation_layout_release(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX INFO: renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m352plusgK_yJZ4(int i10, int i11) {
        return i10 | i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m353toStringimpl(int i10) {
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i11 = f4456f;
        if ((i10 & i11) == i11) {
            a("Start", sb3);
        }
        int i12 = f4460j;
        if ((i10 & i12) == i12) {
            a("Left", sb3);
        }
        int i13 = f4458h;
        if ((i10 & i13) == i13) {
            a("Top", sb3);
        }
        int i14 = f4457g;
        if ((i10 & i14) == i14) {
            a("End", sb3);
        }
        int i15 = f4461k;
        if ((i10 & i15) == i15) {
            a("Right", sb3);
        }
        int i16 = f4459i;
        if ((i10 & i16) == i16) {
            a("Bottom", sb3);
        }
        String string = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        sb2.append(string);
        sb2.append(RootService.CLOSE_BRACKET);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return m348equalsimpl(this.f4463a, obj);
    }

    public int hashCode() {
        return m351hashCodeimpl(this.f4463a);
    }

    @NotNull
    public String toString() {
        return m353toStringimpl(this.f4463a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF4463a() {
        return this.f4463a;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m351hashCodeimpl(int i10) {
        return i10;
    }
}
