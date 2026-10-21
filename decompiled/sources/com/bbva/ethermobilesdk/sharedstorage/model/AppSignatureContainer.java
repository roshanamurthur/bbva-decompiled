package com.bbva.ethermobilesdk.sharedstorage.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppSignature.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignatureContainer;", "", "", "Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignature;", "component1", "apps", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getApps", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AppSignatureContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apps")
    @NotNull
    private final List<AppSignature> apps;

    public AppSignatureContainer(@NotNull List<AppSignature> apps) {
        Intrinsics.checkNotNullParameter(apps, "apps");
        this.apps = apps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppSignatureContainer copy$default(AppSignatureContainer appSignatureContainer, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = appSignatureContainer.apps;
        }
        return appSignatureContainer.copy(list);
    }

    @NotNull
    public final List<AppSignature> component1() {
        return this.apps;
    }

    @NotNull
    public final AppSignatureContainer copy(@NotNull List<AppSignature> apps) {
        Intrinsics.checkNotNullParameter(apps, "apps");
        return new AppSignatureContainer(apps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppSignatureContainer) && Intrinsics.areEqual(this.apps, ((AppSignatureContainer) other).apps);
    }

    @NotNull
    public final List<AppSignature> getApps() {
        return this.apps;
    }

    public int hashCode() {
        return this.apps.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppSignatureContainer(apps=" + this.apps + ")";
    }
}
