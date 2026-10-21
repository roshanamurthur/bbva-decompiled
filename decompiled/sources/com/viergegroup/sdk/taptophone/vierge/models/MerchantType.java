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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "", "", "merchantTypeId", com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMerchantTypeId", "()I", "setMerchantTypeId", "(I)V", "", "merchantTypeName", "Ljava/lang/String;", "getMerchantTypeName", "()Ljava/lang/String;", "setMerchantTypeName", "(Ljava/lang/String;)V", "merchantTypeCode", "getMerchantTypeCode", "setMerchantTypeCode", "Companion", "Undefined", "Retail", "Restaurant", "Comm", "Hotel", "CarRental", "Office", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/MerchantType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n8811#2,2:50\n9071#2,4:52\n8811#2,2:56\n9071#2,4:58\n8811#2,2:62\n9071#2,4:64\n*S KotlinDebug\n*F\n+ 1 MerchantType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/MerchantType\n*L\n15#1:50,2\n15#1:52,4\n21#1:56,2\n21#1:58,4\n33#1:62,2\n33#1:64,4\n*E\n"})
public enum MerchantType {
    Undefined("Undefined", "Undefined", ""),
    Retail("Retail", "Retail", "5422"),
    Restaurant("Restaurant", "Restaurant", "5812"),
    Comm("Comm", "Comm", "0000"),
    Hotel("Hotel", "Hotel", "5399"),
    CarRental("CarRental", "CarRental", "5390"),
    Office("Office", "Office", "5428");


    @NotNull
    private static final Map<String, MerchantType> AssetInjection;

    @NotNull
    private static final Map<Integer, MerchantType> BuildConfig;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static List<String> DeviceNfcStatus;

    @NotNull
    private static final Map<String, MerchantType> setInjectedTransactionParameters;
    private int bOD;

    @NotNull
    private String getInjectedTransactionParameters;

    @NotNull
    private String inject;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0005J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType$Companion;", "", "()V", "map", "", "", "Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "map2", "map3", "", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "fromId", "hostId", "fromMerchantCode", "code", "fromMerchantName", "merchantTypeName", "getNames", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMerchantType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/MerchantType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n13579#2,2:50\n*S KotlinDebug\n*F\n+ 1 MerchantType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/MerchantType$Companion\n*L\n40#1:50,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MerchantType fromId(int hostId) {
            MerchantType merchantType = (MerchantType) MerchantType.BuildConfig.get(Integer.valueOf(hostId));
            return merchantType == null ? MerchantType.Undefined : merchantType;
        }

        @NotNull
        public final MerchantType fromMerchantCode(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "");
            MerchantType merchantType = (MerchantType) MerchantType.setInjectedTransactionParameters.get(code);
            return merchantType == null ? MerchantType.Undefined : merchantType;
        }

        @NotNull
        public final MerchantType fromMerchantName(@NotNull String merchantTypeName) {
            Intrinsics.checkNotNullParameter(merchantTypeName, "");
            MerchantType merchantType = (MerchantType) MerchantType.AssetInjection.get(merchantTypeName);
            return merchantType == null ? MerchantType.Undefined : merchantType;
        }

        @NotNull
        public final List<String> getNames() {
            if (getTypes().size() == 0) {
                for (MerchantType merchantType : MerchantType.values()) {
                    MerchantType.INSTANCE.getTypes().add(merchantType.name());
                }
            }
            return getTypes();
        }

        @NotNull
        public final List<String> getTypes() {
            return MerchantType.DeviceNfcStatus;
        }

        public final void setTypes(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            MerchantType.DeviceNfcStatus = list;
        }
    }

    static {
        MerchantType[] merchantTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(merchantTypeArrValues.length), 16));
        for (MerchantType merchantType : merchantTypeArrValues) {
            linkedHashMap.put(merchantType.getInjectedTransactionParameters, merchantType);
        }
        AssetInjection = linkedHashMap;
        MerchantType[] merchantTypeArrValues2 = values();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(merchantTypeArrValues2.length), 16));
        for (MerchantType merchantType2 : merchantTypeArrValues2) {
            linkedHashMap2.put(merchantType2.inject, merchantType2);
        }
        setInjectedTransactionParameters = linkedHashMap2;
        DeviceNfcStatus = new ArrayList();
        MerchantType[] merchantTypeArrValues3 = values();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(merchantTypeArrValues3.length), 16));
        for (MerchantType merchantType3 : merchantTypeArrValues3) {
            linkedHashMap3.put(Integer.valueOf(merchantType3.bOD), merchantType3);
        }
        BuildConfig = linkedHashMap3;
    }

    MerchantType(String str, String str2, String str3) {
        this.bOD = i;
        this.getInjectedTransactionParameters = str2;
        this.inject = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: getMerchantTypeCode, reason: from getter */
    public final String getInject() {
        return this.inject;
    }

    /* JADX INFO: renamed from: getMerchantTypeId, reason: from getter */
    public final int getBOD() {
        return this.bOD;
    }

    @NotNull
    /* JADX INFO: renamed from: getMerchantTypeName, reason: from getter */
    public final String getGetInjectedTransactionParameters() {
        return this.getInjectedTransactionParameters;
    }

    public final void setMerchantTypeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inject = str;
    }

    public final void setMerchantTypeId(int i10) {
        this.bOD = i10;
    }

    public final void setMerchantTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getInjectedTransactionParameters = str;
    }
}
