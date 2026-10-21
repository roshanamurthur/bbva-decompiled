package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextMotion.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u001c\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "linearity", "", "subpixelTextPositioning", "copy-JdDtMQo$ui_text_release", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "copy", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLinearity-4e0Vf04$ui_text_release", "()I", "b", "Z", "getSubpixelTextPositioning$ui_text_release", "()Z", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "Linearity", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextMotion {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TextMotion f18276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final TextMotion f18277d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int linearity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean subpixelTextPositioning;

    /* JADX INFO: compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "()V", "Animated", "Landroidx/compose/ui/text/style/TextMotion;", "getAnimated", "()Landroidx/compose/ui/text/style/TextMotion;", "Static", "getStatic", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextMotion getAnimated() {
            return TextMotion.f18277d;
        }

        @NotNull
        public final TextMotion getStatic() {
            return TextMotion.f18276c;
        }
    }

    static {
        Linearity.Companion companion = Linearity.INSTANCE;
        f18276c = new TextMotion(companion.m4330getFontHinting4e0Vf04(), false, null);
        f18277d = new TextMotion(companion.m4331getLinear4e0Vf04(), true, null);
    }

    public TextMotion(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this.linearity = i10;
        this.subpixelTextPositioning = z10;
    }

    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m4321copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = textMotion.linearity;
        }
        if ((i11 & 2) != 0) {
            z10 = textMotion.subpixelTextPositioning;
        }
        return textMotion.m4322copyJdDtMQo$ui_text_release(i10, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final TextMotion m4322copyJdDtMQo$ui_text_release(int linearity, boolean subpixelTextPositioning) {
        return new TextMotion(linearity, subpixelTextPositioning, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) other;
        return Linearity.m4326equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    /* JADX INFO: renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name and from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    /* JADX INFO: renamed from: getSubpixelTextPositioning$ui_text_release, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m4327hashCodeimpl(this.linearity) * 31) + (this.subpixelTextPositioning ? 1231 : 1237);
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this, f18276c)) {
            return "TextMotion.Static";
        }
        return Intrinsics.areEqual(this, f18277d) ? "TextMotion.Animated" : "Invalid";
    }

    /* JADX INFO: compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class Linearity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18280b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f18281c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f18282d = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18283a;

        /* JADX INFO: compiled from: TextMotion.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "()V", "FontHinting", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "getFontHinting-4e0Vf04", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Linear", "getLinear-4e0Vf04", "None", "getNone-4e0Vf04", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m4330getFontHinting4e0Vf04() {
                return Linearity.f18281c;
            }

            /* JADX INFO: renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m4331getLinear4e0Vf04() {
                return Linearity.f18280b;
            }

            /* JADX INFO: renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m4332getNone4e0Vf04() {
                return Linearity.f18282d;
            }
        }

        public /* synthetic */ Linearity(int i10) {
            this.f18283a = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m4324boximpl(int i10) {
            return new Linearity(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m4325equalsimpl(int i10, Object obj) {
            return (obj instanceof Linearity) && i10 == ((Linearity) obj).getF18283a();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4326equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m4328toStringimpl(int i10) {
            if (m4326equalsimpl0(i10, f18280b)) {
                return "Linearity.Linear";
            }
            if (m4326equalsimpl0(i10, f18281c)) {
                return "Linearity.FontHinting";
            }
            return m4326equalsimpl0(i10, f18282d) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4325equalsimpl(this.f18283a, obj);
        }

        public int hashCode() {
            return m4327hashCodeimpl(this.f18283a);
        }

        @NotNull
        public String toString() {
            return m4328toStringimpl(this.f18283a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getF18283a() {
            return this.f18283a;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m4327hashCodeimpl(int i10) {
            return i10;
        }
    }
}
