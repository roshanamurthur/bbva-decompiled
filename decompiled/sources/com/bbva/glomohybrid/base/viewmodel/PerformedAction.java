package com.bbva.glomohybrid.base.viewmodel;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/PerformedAction;", "", "", "component1", "component2", "action", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class PerformedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object value;

    public PerformedAction(@Nullable String str, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.action = str;
        this.value = value;
    }

    public static /* synthetic */ PerformedAction copy$default(PerformedAction performedAction, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = performedAction.action;
        }
        if ((i10 & 2) != 0) {
            obj = performedAction.value;
        }
        return performedAction.copy(str, obj);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @NotNull
    public final PerformedAction copy(@Nullable String action, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new PerformedAction(action, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformedAction)) {
            return false;
        }
        PerformedAction performedAction = (PerformedAction) other;
        return Intrinsics.areEqual(this.action, performedAction.action) && Intrinsics.areEqual(this.value, performedAction.value);
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.action;
        return this.value.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "PerformedAction(action=" + this.action + ", value=" + this.value + ")";
    }

    public /* synthetic */ PerformedAction(String str, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, obj);
    }
}
