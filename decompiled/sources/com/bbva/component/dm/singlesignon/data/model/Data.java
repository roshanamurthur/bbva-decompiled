package com.bbva.component.dm.singlesignon.data.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleSignOnResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/bbva/component/dm/singlesignon/data/model/Data;", "", "seen1", "", "pkcs7", "", "customer", "Lcom/bbva/component/dm/singlesignon/data/model/Customer;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/bbva/component/dm/singlesignon/data/model/Customer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/bbva/component/dm/singlesignon/data/model/Customer;)V", "getCustomer", "()Lcom/bbva/component/dm/singlesignon/data/model/Customer;", "getPkcs7", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class Data {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Customer customer;

    @NotNull
    private final String pkcs7;

    /* JADX INFO: compiled from: SingleSignOnResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/singlesignon/data/model/Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/dm/singlesignon/data/model/Data;", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Data> serializer() {
            return Data$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Data(int i10, String str, Customer customer, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, Data$$serializer.INSTANCE.getDescriptor());
        }
        this.pkcs7 = str;
        this.customer = customer;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, Customer customer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = data.pkcs7;
        }
        if ((i10 & 2) != 0) {
            customer = data.customer;
        }
        return data.copy(str, customer);
    }

    @JvmStatic
    public static final void write$Self(@NotNull Data self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.pkcs7);
        output.encodeSerializableElement(serialDesc, 1, Customer$$serializer.INSTANCE, self.customer);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkcs7() {
        return this.pkcs7;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Customer getCustomer() {
        return this.customer;
    }

    @NotNull
    public final Data copy(@NotNull String pkcs7, @NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(pkcs7, "pkcs7");
        Intrinsics.checkNotNullParameter(customer, "customer");
        return new Data(pkcs7, customer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.pkcs7, data.pkcs7) && Intrinsics.areEqual(this.customer, data.customer);
    }

    @NotNull
    public final Customer getCustomer() {
        return this.customer;
    }

    @NotNull
    public final String getPkcs7() {
        return this.pkcs7;
    }

    public int hashCode() {
        return this.customer.hashCode() + (this.pkcs7.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Data(pkcs7=" + this.pkcs7 + ", customer=" + this.customer + ")";
    }

    public Data(@NotNull String pkcs7, @NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(pkcs7, "pkcs7");
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.pkcs7 = pkcs7;
        this.customer = customer;
    }
}
