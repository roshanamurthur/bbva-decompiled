package com.bbva.plugin.appsflyer.models;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/appsflyer/models/CustomerDTO;", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "", "(Ljava/lang/String;)V", "getCustomerId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "appsflyer-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CustomerDTO {

    @NotNull
    private final String customerId;

    public CustomerDTO(@NotNull String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        this.customerId = customerId;
    }

    public static /* synthetic */ CustomerDTO copy$default(CustomerDTO customerDTO, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerDTO.customerId;
        }
        return customerDTO.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final CustomerDTO copy(@NotNull String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        return new CustomerDTO(customerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomerDTO) && Intrinsics.areEqual(this.customerId, ((CustomerDTO) other).customerId);
    }

    @NotNull
    public final String getCustomerId() {
        return this.customerId;
    }

    public int hashCode() {
        return this.customerId.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("CustomerDTO(customerId=", this.customerId, ")");
    }
}
