package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cB'\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\n¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/window/DialogProperties;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", "Z", "getDismissOnBackPress", "()Z", "dismissOnBackPress", "b", "getDismissOnClickOutside", "dismissOnClickOutside", "Landroidx/compose/ui/window/SecureFlagPolicy;", "c", "Landroidx/compose/ui/window/SecureFlagPolicy;", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "d", "getUsePlatformDefaultWidth", "usePlatformDefaultWidth", "e", "getDecorFitsSystemWindows", "decorFitsSystemWindows", "<init>", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class DialogProperties {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean dismissOnBackPress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean dismissOnClickOutside;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SecureFlagPolicy securePolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean decorFitsSystemWindows;

    public DialogProperties() {
        this(false, false, null, false, false, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) other;
        return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    @NotNull
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return ((((this.securePolicy.hashCode() + ((((this.dismissOnBackPress ? 1231 : 1237) * 31) + (this.dismissOnClickOutside ? 1231 : 1237)) * 31)) * 31) + (this.usePlatformDefaultWidth ? 1231 : 1237)) * 31) + (this.decorFitsSystemWindows ? 1231 : 1237);
    }

    public DialogProperties(boolean z10, boolean z11, @NotNull SecureFlagPolicy securePolicy, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.dismissOnBackPress = z10;
        this.dismissOnClickOutside = z11;
        this.securePolicy = securePolicy;
        this.usePlatformDefaultWidth = z12;
        this.decorFitsSystemWindows = z13;
    }

    public /* synthetic */ DialogProperties(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    public /* synthetic */ DialogProperties(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogProperties(boolean z10, boolean z11, @NotNull SecureFlagPolicy securePolicy) {
        this(z10, z11, securePolicy, true, true);
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
    }
}
