package com.bbva.push.firebase.model;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/push/firebase/model/Configuration;", "", "", "component1", "component2", "isAutoInitEnabled", "isNotificationDelegationEnabled", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "b", "<init>", "(ZZ)V", "firebase-push_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Configuration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isAutoInitEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isNotificationDelegationEnabled;

    public Configuration(boolean z10, boolean z11) {
        this.isAutoInitEnabled = z10;
        this.isNotificationDelegationEnabled = z11;
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = configuration.isAutoInitEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = configuration.isNotificationDelegationEnabled;
        }
        return configuration.copy(z10, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAutoInitEnabled() {
        return this.isAutoInitEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsNotificationDelegationEnabled() {
        return this.isNotificationDelegationEnabled;
    }

    @NotNull
    public final Configuration copy(boolean isAutoInitEnabled, boolean isNotificationDelegationEnabled) {
        return new Configuration(isAutoInitEnabled, isNotificationDelegationEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return this.isAutoInitEnabled == configuration.isAutoInitEnabled && this.isNotificationDelegationEnabled == configuration.isNotificationDelegationEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        boolean z10 = this.isAutoInitEnabled;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.isNotificationDelegationEnabled;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isAutoInitEnabled() {
        return this.isAutoInitEnabled;
    }

    public final boolean isNotificationDelegationEnabled() {
        return this.isNotificationDelegationEnabled;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(isAutoInitEnabled=");
        sb2.append(this.isAutoInitEnabled);
        sb2.append(", isNotificationDelegationEnabled=");
        return a.d(sb2, this.isNotificationDelegationEnabled, RootService.CLOSE_BRACKET);
    }
}
