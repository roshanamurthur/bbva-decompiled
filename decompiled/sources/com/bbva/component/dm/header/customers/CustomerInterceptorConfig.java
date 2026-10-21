package com.bbva.component.dm.header.customers;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerInterceptorConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J3\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/dm/header/customers/CustomerInterceptorConfig;", "", "", "component1", "", "component2", "component3", "authHeaderName", "whiteList", "cleanList", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAuthHeaderName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getWhiteList", "()Ljava/util/List;", "c", "getCleanList", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component-dm-header-customers_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class CustomerInterceptorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authHeaderName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> whiteList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> cleanList;

    public CustomerInterceptorConfig(@NotNull String authHeaderName, @NotNull List<String> whiteList, @NotNull List<String> cleanList) {
        Intrinsics.checkNotNullParameter(authHeaderName, "authHeaderName");
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Intrinsics.checkNotNullParameter(cleanList, "cleanList");
        this.authHeaderName = authHeaderName;
        this.whiteList = whiteList;
        this.cleanList = cleanList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerInterceptorConfig copy$default(CustomerInterceptorConfig customerInterceptorConfig, String str, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerInterceptorConfig.authHeaderName;
        }
        if ((i10 & 2) != 0) {
            list = customerInterceptorConfig.whiteList;
        }
        if ((i10 & 4) != 0) {
            list2 = customerInterceptorConfig.cleanList;
        }
        return customerInterceptorConfig.copy(str, list, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthHeaderName() {
        return this.authHeaderName;
    }

    @NotNull
    public final List<String> component2() {
        return this.whiteList;
    }

    @NotNull
    public final List<String> component3() {
        return this.cleanList;
    }

    @NotNull
    public final CustomerInterceptorConfig copy(@NotNull String authHeaderName, @NotNull List<String> whiteList, @NotNull List<String> cleanList) {
        Intrinsics.checkNotNullParameter(authHeaderName, "authHeaderName");
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Intrinsics.checkNotNullParameter(cleanList, "cleanList");
        return new CustomerInterceptorConfig(authHeaderName, whiteList, cleanList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerInterceptorConfig)) {
            return false;
        }
        CustomerInterceptorConfig customerInterceptorConfig = (CustomerInterceptorConfig) other;
        return Intrinsics.areEqual(this.authHeaderName, customerInterceptorConfig.authHeaderName) && Intrinsics.areEqual(this.whiteList, customerInterceptorConfig.whiteList) && Intrinsics.areEqual(this.cleanList, customerInterceptorConfig.cleanList);
    }

    @NotNull
    public final String getAuthHeaderName() {
        return this.authHeaderName;
    }

    @NotNull
    public final List<String> getCleanList() {
        return this.cleanList;
    }

    @NotNull
    public final List<String> getWhiteList() {
        return this.whiteList;
    }

    public int hashCode() {
        return this.cleanList.hashCode() + a.a(this.whiteList, this.authHeaderName.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CustomerInterceptorConfig(authHeaderName=");
        sb2.append(this.authHeaderName);
        sb2.append(", whiteList=");
        sb2.append(this.whiteList);
        sb2.append(", cleanList=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.cleanList, ")");
    }
}
