package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getAction", "()Lkotlin/jvm/functions/Function0;", "action", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class CustomAccessibilityAction {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Boolean> action;

    public CustomAccessibilityAction(@NotNull String label, @NotNull Function0<Boolean> action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.label = label;
        this.action = action;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) other;
        return Intrinsics.areEqual(this.label, customAccessibilityAction.label) && Intrinsics.areEqual(this.action, customAccessibilityAction.action);
    }

    @NotNull
    public final Function0<Boolean> getAction() {
        return this.action;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.label.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + RootService.CLOSE_BRACKET;
    }
}
