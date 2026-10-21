package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LineHeightStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0017\u0019B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "a", "F", "getAlignment-PIaL0Z0", "()F", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTrim-EVpEnUU", "()I", "trim", "<init>", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "Alignment", "Trim", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class LineHeightStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final LineHeightStyle f18240c = new LineHeightStyle(Alignment.INSTANCE.m4275getProportionalPIaL0Z0(), Trim.INSTANCE.m4285getBothEVpEnUU(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int trim;

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "hashCode-impl", "(F)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "", "topRatio", "constructor-impl", "(F)F", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class Alignment {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f18243b = m4267constructorimpl(0.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float f18244c = m4267constructorimpl(0.5f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f18245d = m4267constructorimpl(-1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final float f18246e = m4267constructorimpl(1.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f18247a;

        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m4273getBottomPIaL0Z0() {
                return Alignment.f18246e;
            }

            /* JADX INFO: renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m4274getCenterPIaL0Z0() {
                return Alignment.f18244c;
            }

            /* JADX INFO: renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m4275getProportionalPIaL0Z0() {
                return Alignment.f18245d;
            }

            /* JADX INFO: renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m4276getTopPIaL0Z0() {
                return Alignment.f18243b;
            }
        }

        public /* synthetic */ Alignment(float f6) {
            this.f18247a = f6;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m4266boximpl(float f6) {
            return new Alignment(f6);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static float m4267constructorimpl(float f6) {
            if ((0.0f > f6 || f6 > 1.0f) && f6 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
            }
            return f6;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m4268equalsimpl(float f6, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f6, ((Alignment) obj).getF18247a()) == 0;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4269equalsimpl0(float f6, float f10) {
            return Float.compare(f6, f10) == 0;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m4270hashCodeimpl(float f6) {
            return Float.floatToIntBits(f6);
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m4271toStringimpl(float f6) {
            if (f6 == f18243b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f6 == f18244c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f6 == f18245d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f6 == f18246e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f6 + RootService.CLOSE_BRACKET;
        }

        public boolean equals(Object obj) {
            return m4268equalsimpl(this.f18247a, obj);
        }

        public int hashCode() {
            return m4270hashCodeimpl(this.f18247a);
        }

        @NotNull
        public String toString() {
            return m4271toStringimpl(this.f18247a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ float getF18247a() {
            return this.f18247a;
        }
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LineHeightStyle getDefault() {
            return LineHeightStyle.f18240c;
        }
    }

    public LineHeightStyle(float f6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.alignment = f6;
        this.trim = i10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) other;
        return Alignment.m4269equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m4279equalsimpl0(this.trim, lineHeightStyle.trim);
    }

    /* JADX INFO: renamed from: getAlignment-PIaL0Z0, reason: not valid java name and from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getTrim-EVpEnUU, reason: not valid java name and from getter */
    public final int getTrim() {
        return this.trim;
    }

    public int hashCode() {
        return Trim.m4280hashCodeimpl(this.trim) + (Alignment.m4270hashCodeimpl(this.alignment) * 31);
    }

    @NotNull
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m4271toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m4283toStringimpl(this.trim)) + RootService.CLOSE_BRACKET;
    }

    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u0088\u0001\u0015\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "isTrimFirstLineTop-impl$ui_text_release", "(I)Z", "isTrimFirstLineTop", "isTrimLastLineBottom-impl$ui_text_release", "isTrimLastLineBottom", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class Trim {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18248b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f18249c = 16;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f18250d = 17;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18251a;

        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", "Both", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m4285getBothEVpEnUU() {
                return Trim.f18250d;
            }

            /* JADX INFO: renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m4286getFirstLineTopEVpEnUU() {
                return Trim.f18248b;
            }

            /* JADX INFO: renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m4287getLastLineBottomEVpEnUU() {
                return Trim.f18249c;
            }

            /* JADX INFO: renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m4288getNoneEVpEnUU() {
                return Trim.access$getNone$cp();
            }
        }

        public /* synthetic */ Trim(int i10) {
            this.f18251a = i10;
        }

        public static final /* synthetic */ int access$getNone$cp() {
            return 0;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m4277boximpl(int i10) {
            return new Trim(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m4278equalsimpl(int i10, Object obj) {
            return (obj instanceof Trim) && i10 == ((Trim) obj).getF18251a();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4279equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m4281isTrimFirstLineTopimpl$ui_text_release(int i10) {
            return (i10 & 1) > 0;
        }

        /* JADX INFO: renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m4282isTrimLastLineBottomimpl$ui_text_release(int i10) {
            return (i10 & 16) > 0;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m4283toStringimpl(int i10) {
            if (i10 == f18248b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i10 == f18249c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i10 == f18250d) {
                return "LineHeightStyle.Trim.Both";
            }
            return i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4278equalsimpl(this.f18251a, obj);
        }

        public int hashCode() {
            return m4280hashCodeimpl(this.f18251a);
        }

        @NotNull
        public String toString() {
            return m4283toStringimpl(this.f18251a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getF18251a() {
            return this.f18251a;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m4280hashCodeimpl(int i10) {
            return i10;
        }
    }
}
