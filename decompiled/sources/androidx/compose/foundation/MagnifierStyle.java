package androidx.compose.foundation;

import android.os.Build;
import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B<\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%B>\b\u0017\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010&J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001c\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\"\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\fR\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/MagnifierStyle;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Z", "getUseTextDefault$foundation_release", "()Z", "useTextDefault", "Landroidx/compose/ui/unit/DpSize;", "b", "J", "getSize-MYxV2XQ$foundation_release", "()J", "size", "Landroidx/compose/ui/unit/Dp;", "c", "F", "getCornerRadius-D9Ej5fM$foundation_release", "()F", "cornerRadius", "d", "getElevation-D9Ej5fM$foundation_release", "elevation", "e", "getClippingEnabled$foundation_release", "clippingEnabled", "f", "getFishEyeEnabled$foundation_release", "fishEyeEnabled", "isSupported", "<init>", "(ZJFFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JFFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class MagnifierStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final MagnifierStyle f3406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final MagnifierStyle f3407h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean useTextDefault;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float elevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean clippingEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean fishEyeEnabled;

    static {
        MagnifierStyle magnifierStyle = new MagnifierStyle(0L, 0.0f, 0.0f, false, false, 31, (DefaultConstructorMarker) null);
        f3406g = magnifierStyle;
        f3407h = new MagnifierStyle(true, magnifierStyle.size, magnifierStyle.cornerRadius, magnifierStyle.elevation, magnifierStyle.clippingEnabled, magnifierStyle.fishEyeEnabled, (DefaultConstructorMarker) null);
    }

    public MagnifierStyle(boolean z10, long j10, float f6, float f10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f6;
        this.elevation = f10;
        this.clippingEnabled = z11;
        this.fishEyeEnabled = z12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnifierStyle)) {
            return false;
        }
        MagnifierStyle magnifierStyle = (MagnifierStyle) other;
        return this.useTextDefault == magnifierStyle.useTextDefault && DpSize.m4484equalsimpl0(this.size, magnifierStyle.size) && Dp.m4394equalsimpl0(this.cornerRadius, magnifierStyle.cornerRadius) && Dp.m4394equalsimpl0(this.elevation, magnifierStyle.elevation) && this.clippingEnabled == magnifierStyle.clippingEnabled && this.fishEyeEnabled == magnifierStyle.fishEyeEnabled;
    }

    /* JADX INFO: renamed from: getClippingEnabled$foundation_release, reason: from getter */
    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM$foundation_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM$foundation_release, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: getFishEyeEnabled$foundation_release, reason: from getter */
    public final boolean getFishEyeEnabled() {
        return this.fishEyeEnabled;
    }

    /* JADX INFO: renamed from: getSize-MYxV2XQ$foundation_release, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getUseTextDefault$foundation_release, reason: from getter */
    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public int hashCode() {
        return ((u.a(this.elevation, u.a(this.cornerRadius, (DpSize.m4489hashCodeimpl(this.size) + ((this.useTextDefault ? 1231 : 1237) * 31)) * 31, 31), 31) + (this.clippingEnabled ? 1231 : 1237)) * 31) + (this.fishEyeEnabled ? 1231 : 1237);
    }

    public final boolean isSupported() {
        return Companion.isStyleSupported$foundation_release$default(INSTANCE, this, 0, 2, null);
    }

    @NotNull
    public String toString() {
        if (this.useTextDefault) {
            return "MagnifierStyle.TextDefault";
        }
        StringBuilder sb2 = new StringBuilder("MagnifierStyle(size=");
        sb2.append((Object) DpSize.m4494toStringimpl(this.size));
        sb2.append(", cornerRadius=");
        sb2.append((Object) Dp.m4400toStringimpl(this.cornerRadius));
        sb2.append(", elevation=");
        sb2.append((Object) Dp.m4400toStringimpl(this.elevation));
        sb2.append(", clippingEnabled=");
        sb2.append(this.clippingEnabled);
        sb2.append(", fishEyeEnabled=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.fishEyeEnabled, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ MagnifierStyle(long j10, float f6, float f10, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DpSize.INSTANCE.m4496getUnspecifiedMYxV2XQ() : j10, (i10 & 2) != 0 ? Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM() : f6, (i10 & 4) != 0 ? Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM() : f10, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, null);
    }

    @ExperimentalFoundationApi
    public MagnifierStyle(long j10, float f6, float f10, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(false, j10, f6, f10, z10, z11, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: compiled from: Magnifier.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/MagnifierStyle$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/MagnifierStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/MagnifierStyle;", "TextDefault", "getTextDefault$annotations", "getTextDefault", "isStyleSupported", "", "style", ContextualDataConstants.CD_SDK_VERSION, "", "isStyleSupported$foundation_release", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(Companion companion, MagnifierStyle magnifierStyle, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = Build.VERSION.SDK_INT;
            }
            return companion.isStyleSupported$foundation_release(magnifierStyle, i10);
        }

        @NotNull
        public final MagnifierStyle getDefault() {
            return MagnifierStyle.f3406g;
        }

        @NotNull
        public final MagnifierStyle getTextDefault() {
            return MagnifierStyle.f3407h;
        }

        public final boolean isStyleSupported$foundation_release(@NotNull MagnifierStyle style, int sdkVersion) {
            Intrinsics.checkNotNullParameter(style, "style");
            if (MagnifierKt.isPlatformMagnifierSupported(sdkVersion) && !style.getFishEyeEnabled()) {
                return style.getUseTextDefault() || Intrinsics.areEqual(style, getDefault()) || sdkVersion >= 29;
            }
            return false;
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getDefault$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getTextDefault$annotations() {
        }
    }
}
