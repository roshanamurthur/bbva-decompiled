package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "b", "Lkotlin/Function;", "getAction", "()Lkotlin/Function;", "action", "<init>", "(Ljava/lang/String;Lkotlin/Function;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AccessibilityAction<T extends Function<? extends Boolean>> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final T action;

    public AccessibilityAction(@Nullable String str, @Nullable T t10) {
        this.label = str;
        this.action = t10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) other;
        return Intrinsics.areEqual(this.label, accessibilityAction.label) && Intrinsics.areEqual(this.action, accessibilityAction.action);
    }

    @Nullable
    public final T getAction() {
        return this.action;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.action;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + RootService.CLOSE_BRACKET;
    }
}
