package com.bbva.ethermobilesdk.naturalauthentication;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NaturalAuthenticationConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthenticationConfig;", "", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager;", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "networkManager", "tenant", "selectionTimeout", "copy", "(Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthenticationConfig;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager;", "getNetworkManager", "()Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager;", "b", "Ljava/lang/String;", "getTenant", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getSelectionTimeout", "<init>", "(Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager;Ljava/lang/String;Ljava/lang/Integer;)V", "naturalauthentication_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class NaturalAuthenticationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FidoNetworkManager networkManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tenant;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer selectionTimeout;

    public NaturalAuthenticationConfig(@NotNull FidoNetworkManager networkManager, @NotNull String tenant, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(networkManager, "networkManager");
        Intrinsics.checkNotNullParameter(tenant, "tenant");
        this.networkManager = networkManager;
        this.tenant = tenant;
        this.selectionTimeout = num;
    }

    public static /* synthetic */ NaturalAuthenticationConfig copy$default(NaturalAuthenticationConfig naturalAuthenticationConfig, FidoNetworkManager fidoNetworkManager, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fidoNetworkManager = naturalAuthenticationConfig.networkManager;
        }
        if ((i10 & 2) != 0) {
            str = naturalAuthenticationConfig.tenant;
        }
        if ((i10 & 4) != 0) {
            num = naturalAuthenticationConfig.selectionTimeout;
        }
        return naturalAuthenticationConfig.copy(fidoNetworkManager, str, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FidoNetworkManager getNetworkManager() {
        return this.networkManager;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTenant() {
        return this.tenant;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSelectionTimeout() {
        return this.selectionTimeout;
    }

    @NotNull
    public final NaturalAuthenticationConfig copy(@NotNull FidoNetworkManager networkManager, @NotNull String tenant, @Nullable Integer selectionTimeout) {
        Intrinsics.checkNotNullParameter(networkManager, "networkManager");
        Intrinsics.checkNotNullParameter(tenant, "tenant");
        return new NaturalAuthenticationConfig(networkManager, tenant, selectionTimeout);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaturalAuthenticationConfig)) {
            return false;
        }
        NaturalAuthenticationConfig naturalAuthenticationConfig = (NaturalAuthenticationConfig) other;
        return Intrinsics.areEqual(this.networkManager, naturalAuthenticationConfig.networkManager) && Intrinsics.areEqual(this.tenant, naturalAuthenticationConfig.tenant) && Intrinsics.areEqual(this.selectionTimeout, naturalAuthenticationConfig.selectionTimeout);
    }

    @NotNull
    public final FidoNetworkManager getNetworkManager() {
        return this.networkManager;
    }

    @Nullable
    public final Integer getSelectionTimeout() {
        return this.selectionTimeout;
    }

    @NotNull
    public final String getTenant() {
        return this.tenant;
    }

    public int hashCode() {
        int iC = n1.c(this.tenant, this.networkManager.hashCode() * 31, 31);
        Integer num = this.selectionTimeout;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "NaturalAuthenticationConfig(networkManager=" + this.networkManager + ", tenant=" + this.tenant + ", selectionTimeout=" + this.selectionTimeout + ")";
    }

    public /* synthetic */ NaturalAuthenticationConfig(FidoNetworkManager fidoNetworkManager, String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fidoNetworkManager, str, (i10 & 4) != 0 ? 30 : num);
    }
}
