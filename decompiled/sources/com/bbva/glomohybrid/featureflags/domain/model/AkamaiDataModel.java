package com.bbva.glomohybrid.featureflags.domain.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlags.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/model/AkamaiDataModel;", "", "url", "", "method", "users", "android", "", "isActive", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getAndroid", "()Ljava/util/List;", "()Z", "getMethod", "()Ljava/lang/String;", "getUrl", "getUsers", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AkamaiDataModel {

    @NotNull
    private final List<String> android;
    private final boolean isActive;

    @NotNull
    private final String method;

    @NotNull
    private final String url;

    @NotNull
    private final String users;

    public AkamaiDataModel(@NotNull String url, @NotNull String method, @NotNull String users, @NotNull List<String> android2, boolean z10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(android2, "android");
        this.url = url;
        this.method = method;
        this.users = users;
        this.android = android2;
        this.isActive = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AkamaiDataModel copy$default(AkamaiDataModel akamaiDataModel, String str, String str2, String str3, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = akamaiDataModel.url;
        }
        if ((i10 & 2) != 0) {
            str2 = akamaiDataModel.method;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = akamaiDataModel.users;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            list = akamaiDataModel.android;
        }
        List list2 = list;
        if ((i10 & 16) != 0) {
            z10 = akamaiDataModel.isActive;
        }
        return akamaiDataModel.copy(str, str4, str5, list2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsers() {
        return this.users;
    }

    @NotNull
    public final List<String> component4() {
        return this.android;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final AkamaiDataModel copy(@NotNull String url, @NotNull String method, @NotNull String users, @NotNull List<String> android2, boolean isActive) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(android2, "android");
        return new AkamaiDataModel(url, method, users, android2, isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AkamaiDataModel)) {
            return false;
        }
        AkamaiDataModel akamaiDataModel = (AkamaiDataModel) other;
        return Intrinsics.areEqual(this.url, akamaiDataModel.url) && Intrinsics.areEqual(this.method, akamaiDataModel.method) && Intrinsics.areEqual(this.users, akamaiDataModel.users) && Intrinsics.areEqual(this.android, akamaiDataModel.android) && this.isActive == akamaiDataModel.isActive;
    }

    @NotNull
    public final List<String> getAndroid() {
        return this.android;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUsers() {
        return this.users;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iA = a.a(this.android, n1.c(this.users, n1.c(this.method, this.url.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.isActive;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.method;
        String str3 = this.users;
        List<String> list = this.android;
        boolean z10 = this.isActive;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("AkamaiDataModel(url=", str, ", method=", str2, ", users=");
        sbC.append(str3);
        sbC.append(", android=");
        sbC.append(list);
        sbC.append(", isActive=");
        return i.c(sbC, z10, ")");
    }

    public /* synthetic */ AkamaiDataModel(String str, String str2, String str3, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, z10);
    }
}
