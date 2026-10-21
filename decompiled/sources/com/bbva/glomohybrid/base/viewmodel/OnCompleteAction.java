package com.bbva.glomohybrid.base.viewmodel;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003J!\u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/OnCompleteAction;", "", "", "", "component1", "actionsPerformed", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/Map;", "getActionsPerformed", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class OnCompleteAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> actionsPerformed;

    public OnCompleteAction(@NotNull Map<String, ? extends Object> actionsPerformed) {
        Intrinsics.checkNotNullParameter(actionsPerformed, "actionsPerformed");
        this.actionsPerformed = actionsPerformed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnCompleteAction copy$default(OnCompleteAction onCompleteAction, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = onCompleteAction.actionsPerformed;
        }
        return onCompleteAction.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.actionsPerformed;
    }

    @NotNull
    public final OnCompleteAction copy(@NotNull Map<String, ? extends Object> actionsPerformed) {
        Intrinsics.checkNotNullParameter(actionsPerformed, "actionsPerformed");
        return new OnCompleteAction(actionsPerformed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnCompleteAction) && Intrinsics.areEqual(this.actionsPerformed, ((OnCompleteAction) other).actionsPerformed);
    }

    @NotNull
    public final Map<String, Object> getActionsPerformed() {
        return this.actionsPerformed;
    }

    public int hashCode() {
        return this.actionsPerformed.hashCode();
    }

    @NotNull
    public String toString() {
        return "OnCompleteAction(actionsPerformed=" + this.actionsPerformed + ")";
    }
}
