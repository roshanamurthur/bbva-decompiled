package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/LandingHeaderConfiguration;", "", "", "component1", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "component2", "shortcuts", "message", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getShortcuts", "()Ljava/lang/String;", "b", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "getMessage", "()Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "<init>", "(Ljava/lang/String;Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingHeaderConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String shortcuts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final VisualMessageConfiguration message;

    /* JADX WARN: Multi-variable type inference failed */
    public LandingHeaderConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LandingHeaderConfiguration copy$default(LandingHeaderConfiguration landingHeaderConfiguration, String str, VisualMessageConfiguration visualMessageConfiguration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingHeaderConfiguration.shortcuts;
        }
        if ((i10 & 2) != 0) {
            visualMessageConfiguration = landingHeaderConfiguration.message;
        }
        return landingHeaderConfiguration.copy(str, visualMessageConfiguration);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShortcuts() {
        return this.shortcuts;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VisualMessageConfiguration getMessage() {
        return this.message;
    }

    @NotNull
    public final LandingHeaderConfiguration copy(@Nullable String shortcuts, @Nullable VisualMessageConfiguration message) {
        return new LandingHeaderConfiguration(shortcuts, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingHeaderConfiguration)) {
            return false;
        }
        LandingHeaderConfiguration landingHeaderConfiguration = (LandingHeaderConfiguration) other;
        return Intrinsics.areEqual(this.shortcuts, landingHeaderConfiguration.shortcuts) && Intrinsics.areEqual(this.message, landingHeaderConfiguration.message);
    }

    @Nullable
    public final VisualMessageConfiguration getMessage() {
        return this.message;
    }

    @Nullable
    public final String getShortcuts() {
        return this.shortcuts;
    }

    public int hashCode() {
        String str = this.shortcuts;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        VisualMessageConfiguration visualMessageConfiguration = this.message;
        return iHashCode + (visualMessageConfiguration != null ? visualMessageConfiguration.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LandingHeaderConfiguration(shortcuts=" + this.shortcuts + ", message=" + this.message + ")";
    }

    public LandingHeaderConfiguration(@Nullable String str, @Nullable VisualMessageConfiguration visualMessageConfiguration) {
        this.shortcuts = str;
        this.message = visualMessageConfiguration;
    }

    public /* synthetic */ LandingHeaderConfiguration(String str, VisualMessageConfiguration visualMessageConfiguration, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : visualMessageConfiguration);
    }
}
