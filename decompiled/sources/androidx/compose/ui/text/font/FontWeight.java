package androidx.compose.ui.text.font;

import androidx.appcompat.widget.g0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.sonic.StatusCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontWeight.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "other", "", "compareTo", "", "", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWeight", "()I", "weight", "<init>", "(I)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class FontWeight implements Comparable<FontWeight> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final FontWeight E0;

    @NotNull
    public static final FontWeight F0;

    @NotNull
    public static final FontWeight G0;

    @NotNull
    public static final FontWeight H0;

    @NotNull
    public static final FontWeight I0;

    @NotNull
    public static final FontWeight J0;

    @NotNull
    public static final FontWeight K0;

    @NotNull
    public static final FontWeight L0;

    @NotNull
    public static final FontWeight M0;

    @NotNull
    public static final List<FontWeight> N0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final FontWeight f18006q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final FontWeight f18007r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final FontWeight f18008s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final FontWeight f18009t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final FontWeight f18010u0;

    @NotNull
    public static final FontWeight v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final FontWeight f18011w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final FontWeight f18012x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final FontWeight f18013y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int weight;

    static {
        FontWeight fontWeight = new FontWeight(100);
        f18006q0 = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        f18007r0 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        f18008s0 = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        f18009t0 = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        f18010u0 = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        v0 = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f18011w0 = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(StatusCode.SUCCESS);
        f18012x0 = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(TypedValues.Custom.TYPE_INT);
        f18013y0 = fontWeight9;
        E0 = fontWeight;
        F0 = fontWeight2;
        G0 = fontWeight3;
        H0 = fontWeight4;
        I0 = fontWeight5;
        J0 = fontWeight6;
        K0 = fontWeight7;
        L0 = fontWeight8;
        M0 = fontWeight9;
        N0 = CollectionsKt__CollectionsKt.listOf((Object[]) new FontWeight[]{fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9});
    }

    public FontWeight(int i10) {
        this.weight = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(g0.c("Font weight can be in range [1, 1000]. Current value: ", i10).toString());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof FontWeight) {
            return this.weight == ((FontWeight) other).weight;
        }
        return false;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.weight;
    }

    @NotNull
    public String toString() {
        return androidx.activity.a.d(new StringBuilder("FontWeight(weight="), this.weight, RootService.CLOSE_BRACKET);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull FontWeight other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.weight, other.weight);
    }

    /* JADX INFO: compiled from: FontWeight.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007R\u001c\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0007R\u001c\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0007R\u001c\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0007R\u001c\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0007R\u001c\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0007R\u001c\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0007R\u001c\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0007R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "()V", "Black", "Landroidx/compose/ui/text/font/FontWeight;", "getBlack$annotations", "getBlack", "()Landroidx/compose/ui/text/font/FontWeight;", "Bold", "getBold$annotations", "getBold", "ExtraBold", "getExtraBold$annotations", "getExtraBold", "ExtraLight", "getExtraLight$annotations", "getExtraLight", "Light", "getLight$annotations", "getLight", "Medium", "getMedium$annotations", "getMedium", "Normal", "getNormal$annotations", "getNormal", "SemiBold", "getSemiBold$annotations", "getSemiBold", "Thin", "getThin$annotations", "getThin", "W100", "getW100$annotations", "getW100", "W200", "getW200$annotations", "getW200", "W300", "getW300$annotations", "getW300", "W400", "getW400$annotations", "getW400", "W500", "getW500$annotations", "getW500", "W600", "getW600$annotations", "getW600", "W700", "getW700$annotations", "getW700", "W800", "getW800$annotations", "getW800", "W900", "getW900$annotations", "getW900", "values", "", "getValues$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FontWeight getBlack() {
            return FontWeight.M0;
        }

        @NotNull
        public final FontWeight getBold() {
            return FontWeight.K0;
        }

        @NotNull
        public final FontWeight getExtraBold() {
            return FontWeight.L0;
        }

        @NotNull
        public final FontWeight getExtraLight() {
            return FontWeight.F0;
        }

        @NotNull
        public final FontWeight getLight() {
            return FontWeight.G0;
        }

        @NotNull
        public final FontWeight getMedium() {
            return FontWeight.I0;
        }

        @NotNull
        public final FontWeight getNormal() {
            return FontWeight.H0;
        }

        @NotNull
        public final FontWeight getSemiBold() {
            return FontWeight.J0;
        }

        @NotNull
        public final FontWeight getThin() {
            return FontWeight.E0;
        }

        @NotNull
        public final List<FontWeight> getValues$ui_text_release() {
            return FontWeight.N0;
        }

        @NotNull
        public final FontWeight getW100() {
            return FontWeight.f18006q0;
        }

        @NotNull
        public final FontWeight getW200() {
            return FontWeight.f18007r0;
        }

        @NotNull
        public final FontWeight getW300() {
            return FontWeight.f18008s0;
        }

        @NotNull
        public final FontWeight getW400() {
            return FontWeight.f18009t0;
        }

        @NotNull
        public final FontWeight getW500() {
            return FontWeight.f18010u0;
        }

        @NotNull
        public final FontWeight getW600() {
            return FontWeight.v0;
        }

        @NotNull
        public final FontWeight getW700() {
            return FontWeight.f18011w0;
        }

        @NotNull
        public final FontWeight getW800() {
            return FontWeight.f18012x0;
        }

        @NotNull
        public final FontWeight getW900() {
            return FontWeight.f18013y0;
        }

        @Stable
        public static /* synthetic */ void getBlack$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getMedium$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNormal$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSemiBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getThin$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW100$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW200$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW300$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW400$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW500$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW600$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW700$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW800$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW900$annotations() {
        }
    }
}
