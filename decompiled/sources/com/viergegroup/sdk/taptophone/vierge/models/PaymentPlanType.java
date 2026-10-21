package com.viergegroup.sdk.taptophone.vierge.models;

import bk.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType;", "", "", "paymentPlanId", com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPaymentPlanId", "()I", "setPaymentPlanId", "(I)V", "", "paymentPlanName", "Ljava/lang/String;", "getPaymentPlanName", "()Ljava/lang/String;", "setPaymentPlanName", "(Ljava/lang/String;)V", "paymentPlanPROSACode", "getPaymentPlanPROSACode", "setPaymentPlanPROSACode", "paymentPlanBANORTECode", "getPaymentPlanBANORTECode", "setPaymentPlanBANORTECode", "Companion", "Undefined", "SkipPayment", "WithInterests", "WithooutInterests", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentPlanType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentPlanType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,40:1\n8811#2,2:41\n9071#2,4:43\n*S KotlinDebug\n*F\n+ 1 PaymentPlanType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType\n*L\n11#1:41,2\n11#1:43,4\n*E\n"})
public enum PaymentPlanType {
    Undefined(0, "Undefined", "00", "00"),
    SkipPayment(1, "SkipPayment", "03", "03"),
    WithInterests(2, "WithInterests", "05", "05"),
    WithooutInterests(3, "WithooutInterests", EglobalUtils.READ_MODE_CONTACTLESS_EMV, EglobalUtils.READ_MODE_CONTACTLESS_EMV);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static List<String> ExampleApp;

    @NotNull
    private static final Map<String, PaymentPlanType> bOD;

    @NotNull
    private static String values;

    @NotNull
    private String AssetInjection;
    private int getInjectedTransactionParameters;

    @NotNull
    private String inject;

    @NotNull
    private String setInjectedTransactionParameters;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0006\u0010\u0011\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType$Companion;", "", "()V", "map", "", "", "Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType;", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "validpaymentPlansDesc", "fromPaymentPlanName", "paymentPlanName", "getNames", "getValidCardsDescription", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentPlanType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentPlanType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,40:1\n13579#2,2:41\n*S KotlinDebug\n*F\n+ 1 PaymentPlanType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType$Companion\n*L\n29#1:41,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PaymentPlanType fromPaymentPlanName(@NotNull String paymentPlanName) {
            Intrinsics.checkNotNullParameter(paymentPlanName, "");
            PaymentPlanType paymentPlanType = (PaymentPlanType) PaymentPlanType.bOD.get(paymentPlanName);
            return paymentPlanType == null ? PaymentPlanType.Undefined : paymentPlanType;
        }

        @NotNull
        public final List<String> getNames() {
            if (getTypes().size() == 0) {
                for (PaymentPlanType paymentPlanType : PaymentPlanType.values()) {
                    PaymentPlanType.INSTANCE.getTypes().add(paymentPlanType.name());
                }
            }
            return getTypes();
        }

        @NotNull
        public final List<String> getTypes() {
            return PaymentPlanType.ExampleApp;
        }

        @NotNull
        public final String getValidCardsDescription() {
            if (!PaymentPlanType.values.equals("")) {
                return PaymentPlanType.values;
            }
            for (String str : getNames()) {
                PaymentPlanType.values = PaymentPlanType.values + str + ",";
            }
            return PaymentPlanType.values;
        }

        public final void setTypes(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            PaymentPlanType.ExampleApp = list;
        }
    }

    static {
        PaymentPlanType[] paymentPlanTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(paymentPlanTypeArrValues.length), 16));
        for (PaymentPlanType paymentPlanType : paymentPlanTypeArrValues) {
            linkedHashMap.put(paymentPlanType.setInjectedTransactionParameters, paymentPlanType);
        }
        bOD = linkedHashMap;
        values = "";
        ExampleApp = new ArrayList();
    }

    PaymentPlanType(int i10, String str, String str2, String str3) {
        this.getInjectedTransactionParameters = i10;
        this.setInjectedTransactionParameters = str;
        this.AssetInjection = str2;
        this.inject = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: getPaymentPlanBANORTECode, reason: from getter */
    public final String getInject() {
        return this.inject;
    }

    /* JADX INFO: renamed from: getPaymentPlanId, reason: from getter */
    public final int getGetInjectedTransactionParameters() {
        return this.getInjectedTransactionParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: getPaymentPlanName, reason: from getter */
    public final String getSetInjectedTransactionParameters() {
        return this.setInjectedTransactionParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: getPaymentPlanPROSACode, reason: from getter */
    public final String getAssetInjection() {
        return this.AssetInjection;
    }

    public final void setPaymentPlanBANORTECode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inject = str;
    }

    public final void setPaymentPlanId(int i10) {
        this.getInjectedTransactionParameters = i10;
    }

    public final void setPaymentPlanName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.setInjectedTransactionParameters = str;
    }

    public final void setPaymentPlanPROSACode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AssetInjection = str;
    }
}
