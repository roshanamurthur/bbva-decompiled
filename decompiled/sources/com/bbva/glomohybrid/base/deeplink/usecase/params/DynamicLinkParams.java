package com.bbva.glomohybrid.base.deeplink.usecase.params;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DynamicLinkParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/usecase/params/DynamicLinkParams;", "", "", "component1", "component2", "component3", "id", "data", "origin", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getData", "c", "getOrigin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DynamicLinkParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String origin;

    public DynamicLinkParams(@NotNull String id, @NotNull String data, @Nullable String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = id;
        this.data = data;
        this.origin = str;
    }

    public static /* synthetic */ DynamicLinkParams copy$default(DynamicLinkParams dynamicLinkParams, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dynamicLinkParams.id;
        }
        if ((i10 & 2) != 0) {
            str2 = dynamicLinkParams.data;
        }
        if ((i10 & 4) != 0) {
            str3 = dynamicLinkParams.origin;
        }
        return dynamicLinkParams.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final DynamicLinkParams copy(@NotNull String id, @NotNull String data, @Nullable String origin) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        return new DynamicLinkParams(id, data, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicLinkParams)) {
            return false;
        }
        DynamicLinkParams dynamicLinkParams = (DynamicLinkParams) other;
        return Intrinsics.areEqual(this.id, dynamicLinkParams.id) && Intrinsics.areEqual(this.data, dynamicLinkParams.data) && Intrinsics.areEqual(this.origin, dynamicLinkParams.origin);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        int iC = n1.c(this.data, this.id.hashCode() * 31, 31);
        String str = this.origin;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicLinkParams(id=");
        sb2.append(this.id);
        sb2.append(", data=");
        sb2.append(this.data);
        sb2.append(", origin=");
        return d.f(sb2, this.origin, ")");
    }
}
