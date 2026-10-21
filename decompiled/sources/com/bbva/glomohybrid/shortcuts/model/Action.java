package com.bbva.glomohybrid.shortcuts.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppShortcutModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/shortcuts/model/Action;", "", "", "component1", "component2", "component3", "action", "targetClass", "targetPackage", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "b", "getTargetClass", "c", "getTargetPackage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String targetClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String targetPackage;

    public Action() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = action.action;
        }
        if ((i10 & 2) != 0) {
            str2 = action.targetClass;
        }
        if ((i10 & 4) != 0) {
            str3 = action.targetPackage;
        }
        return action.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetClass() {
        return this.targetClass;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTargetPackage() {
        return this.targetPackage;
    }

    @NotNull
    public final Action copy(@NotNull String action, @Nullable String targetClass, @Nullable String targetPackage) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new Action(action, targetClass, targetPackage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action action = (Action) other;
        return Intrinsics.areEqual(this.action, action.action) && Intrinsics.areEqual(this.targetClass, action.targetClass) && Intrinsics.areEqual(this.targetPackage, action.targetPackage);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getTargetClass() {
        return this.targetClass;
    }

    @Nullable
    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        String str = this.targetClass;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetPackage;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Action(action=");
        sb2.append(this.action);
        sb2.append(", targetClass=");
        sb2.append(this.targetClass);
        sb2.append(", targetPackage=");
        return d.f(sb2, this.targetPackage, ")");
    }

    public Action(@NotNull String action, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        this.targetClass = str;
        this.targetPackage = str2;
    }

    public /* synthetic */ Action(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "android.intent.action.VIEW" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
