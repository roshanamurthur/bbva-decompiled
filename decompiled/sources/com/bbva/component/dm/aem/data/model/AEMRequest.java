package com.bbva.component.dm.aem.data.model;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AEMRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/aem/data/model/AEMRequest;", "", "", "component1", "component2", "host", "path", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "b", "getPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AEMRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    public AEMRequest(@NotNull String host, @NotNull String path) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        this.host = host;
        this.path = path;
    }

    public static /* synthetic */ AEMRequest copy$default(AEMRequest aEMRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aEMRequest.host;
        }
        if ((i10 & 2) != 0) {
            str2 = aEMRequest.path;
        }
        return aEMRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final AEMRequest copy(@NotNull String host, @NotNull String path) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        return new AEMRequest(host, path);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AEMRequest)) {
            return false;
        }
        AEMRequest aEMRequest = (AEMRequest) other;
        return Intrinsics.areEqual(this.host, aEMRequest.host) && Intrinsics.areEqual(this.path, aEMRequest.path);
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode() + (this.host.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AEMRequest(host=");
        sb2.append(this.host);
        sb2.append(", path=");
        return y2.b(sb2, this.path, RootService.CLOSE_BRACKET);
    }
}
