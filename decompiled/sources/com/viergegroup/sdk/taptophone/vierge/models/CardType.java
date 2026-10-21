package com.viergegroup.sdk.taptophone.vierge.models;

import bk.p;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/CardType;", "", "", "cardTypeId", com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCardTypeId", "()I", "setCardTypeId", "(I)V", "", "cardTypeName", "Ljava/lang/String;", "getCardTypeName", "()Ljava/lang/String;", "setCardTypeName", "(Ljava/lang/String;)V", "Companion", "Undefined", ProviderType.PROVIDER_ID_VISA, ProviderType.PROVIDER_ID_MASTERCARD, "AMEX", "DISCOVER", "JBC", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/CardType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,42:1\n8811#2,2:43\n9071#2,4:45\n*S KotlinDebug\n*F\n+ 1 CardType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/CardType\n*L\n15#1:43,2\n15#1:45,4\n*E\n"})
public enum CardType {
    Undefined(-1, "Undefined"),
    VISA(1, ProviderType.PROVIDER_ID_VISA),
    MASTERCARD(2, ProviderType.PROVIDER_ID_MASTERCARD),
    AMEX(3, "AMEX"),
    DISCOVER(4, "DISCOVER"),
    JBC(5, "JBC");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static List<String> bOD;

    @NotNull
    private static final Map<String, CardType> getInjectedTransactionParameters;

    @NotNull
    private static String setInjectedTransactionParameters;

    @NotNull
    private String AssetInjection;
    private int inject;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0005J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0006\u0010\u0011\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/CardType$Companion;", "", "()V", "map", "", "", "Lcom/viergegroup/sdk/taptophone/vierge/models/CardType;", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "validCardTypesDesc", "fromMerchantName", "cardTypeName", "getNames", "getValidCardsDescription", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/CardType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,42:1\n13579#2,2:43\n*S KotlinDebug\n*F\n+ 1 CardType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/CardType$Companion\n*L\n31#1:43,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CardType fromMerchantName(@NotNull String cardTypeName) {
            Intrinsics.checkNotNullParameter(cardTypeName, "");
            return (CardType) CardType.getInjectedTransactionParameters.get(cardTypeName);
        }

        @NotNull
        public final List<String> getNames() {
            if (getTypes().size() == 0) {
                for (CardType cardType : CardType.values()) {
                    CardType.INSTANCE.getTypes().add(cardType.name());
                }
            }
            return getTypes();
        }

        @NotNull
        public final List<String> getTypes() {
            return CardType.bOD;
        }

        @NotNull
        public final String getValidCardsDescription() {
            if (!CardType.setInjectedTransactionParameters.equals("")) {
                return CardType.setInjectedTransactionParameters;
            }
            for (String str : getNames()) {
                CardType.setInjectedTransactionParameters = CardType.setInjectedTransactionParameters + str + ",";
            }
            return CardType.setInjectedTransactionParameters;
        }

        public final void setTypes(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            CardType.bOD = list;
        }
    }

    static {
        CardType[] cardTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(cardTypeArrValues.length), 16));
        for (CardType cardType : cardTypeArrValues) {
            linkedHashMap.put(cardType.AssetInjection, cardType);
        }
        getInjectedTransactionParameters = linkedHashMap;
        setInjectedTransactionParameters = "";
        bOD = new ArrayList();
    }

    CardType(int i10, String str) {
        this.inject = i10;
        this.AssetInjection = str;
    }

    /* JADX INFO: renamed from: getCardTypeId, reason: from getter */
    public final int getInject() {
        return this.inject;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardTypeName, reason: from getter */
    public final String getAssetInjection() {
        return this.AssetInjection;
    }

    public final void setCardTypeId(int i10) {
        this.inject = i10;
    }

    public final void setCardTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AssetInjection = str;
    }
}
