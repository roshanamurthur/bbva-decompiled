package com.viergegroup.sdk.taptophone.vierge.models;

import bk.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Sale' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b8\b\u0086\u0001\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001HBc\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aj\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bG¨\u0006I"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "", "transactionTypeId", "", "transactionTypeName", "", "isoHeader", "isoHeaderResponse", "messageTypeRequest", "messageTypeResponse", "processingCode", "transactionMessageType", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionMessageType;", "mainMerchantTypesAllowed", "", "Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "cardMustBePresented", "", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionMessageType;Ljava/util/List;Z)V", "getCardMustBePresented", "()Z", "setCardMustBePresented", "(Z)V", "getIsoHeader", "()Ljava/lang/String;", "setIsoHeader", "(Ljava/lang/String;)V", "getIsoHeaderResponse", "setIsoHeaderResponse", "getMainMerchantTypesAllowed", "()Ljava/util/List;", "setMainMerchantTypesAllowed", "(Ljava/util/List;)V", "getMessageTypeRequest", "setMessageTypeRequest", "getMessageTypeResponse", "setMessageTypeResponse", "getProcessingCode", "setProcessingCode", "getTransactionMessageType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionMessageType;", "setTransactionMessageType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionMessageType;)V", "getTransactionTypeId", "()I", "setTransactionTypeId", "(I)V", "getTransactionTypeName", "setTransactionTypeName", "Undefined", "Sale", "SaleWithTip", "SalePosTip", "SaleNotShow", "SaleForced", "Cancellation", "Refund", "ClosePosTip", "CheckIn", "CheckOut", "RentalIn", "CarReturn", "Balance", "Deposit", "Consult", "CommunicationTest", "CheckInReaut", "RentalInReaut", "KeyLoad", "Reverse", "LogOn", "EchoTest", "Companion", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/TransactionType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,77:1\n8811#2,2:78\n9071#2,4:80\n8811#2,2:84\n9071#2,4:86\n8811#2,2:90\n9071#2,4:92\n*S KotlinDebug\n*F\n+ 1 TransactionType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/TransactionType\n*L\n42#1:78,2\n42#1:80,4\n52#1:84,2\n52#1:86,4\n57#1:90,2\n57#1:92,4\n*E\n"})
public final class TransactionType {
    private static final /* synthetic */ TransactionType[] $VALUES;
    public static final TransactionType Balance;
    public static final TransactionType Cancellation;
    public static final TransactionType CarReturn;
    public static final TransactionType CheckIn;
    public static final TransactionType CheckInReaut;
    public static final TransactionType CheckOut;
    public static final TransactionType ClosePosTip;
    public static final TransactionType CommunicationTest;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final TransactionType Consult;
    public static final TransactionType Deposit;
    public static final TransactionType EchoTest;
    public static final TransactionType KeyLoad;
    public static final TransactionType LogOn;
    public static final TransactionType Refund;
    public static final TransactionType RentalIn;
    public static final TransactionType RentalInReaut;
    public static final TransactionType Reverse;
    public static final TransactionType Sale;
    public static final TransactionType SaleForced;
    public static final TransactionType SaleNotShow;
    public static final TransactionType SalePosTip;
    public static final TransactionType SaleWithTip;
    public static final TransactionType Undefined = new TransactionType("Undefined", 0, 99, "Undefined", "ISO026000050", "ISO026000045", "", "", "", TransactionMessageType.Undefined, CollectionsKt__CollectionsKt.mutableListOf(MerchantType.Undefined), false, 512, null);

    @NotNull
    private static final Map<String, MerchantType> map;

    @NotNull
    private static final Map<Integer, TransactionType> map3;

    @NotNull
    private static final Map<String, TransactionType> maps;

    @NotNull
    private static List<String> types;
    private boolean cardMustBePresented;

    @NotNull
    private String isoHeader;

    @NotNull
    private String isoHeaderResponse;

    @NotNull
    private List<MerchantType> mainMerchantTypesAllowed;

    @NotNull
    private String messageTypeRequest;

    @NotNull
    private String messageTypeResponse;

    @NotNull
    private String processingCode;

    @NotNull
    private TransactionMessageType transactionMessageType;
    private int transactionTypeId;

    @NotNull
    private String transactionTypeName;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0005J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType$Companion;", "", "()V", "map", "", "", "Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "map3", "", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "maps", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "fromId", "transactionTypeId", "fromMerchantName", "merchantTypeName", "fromTransactionTypeName", "transactionTypeName", "getNames", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTransactionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/TransactionType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,77:1\n13579#2,2:78\n*S KotlinDebug\n*F\n+ 1 TransactionType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/TransactionType$Companion\n*L\n67#1:78,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransactionType fromId(int transactionTypeId) {
            TransactionType transactionType = (TransactionType) TransactionType.map3.get(Integer.valueOf(transactionTypeId));
            return transactionType == null ? TransactionType.Undefined : transactionType;
        }

        @NotNull
        public final MerchantType fromMerchantName(@NotNull String merchantTypeName) {
            Intrinsics.checkNotNullParameter(merchantTypeName, "");
            MerchantType merchantType = (MerchantType) TransactionType.map.get(merchantTypeName);
            return merchantType == null ? MerchantType.Undefined : merchantType;
        }

        @NotNull
        public final TransactionType fromTransactionTypeName(@NotNull String transactionTypeName) {
            Intrinsics.checkNotNullParameter(transactionTypeName, "");
            TransactionType transactionType = (TransactionType) TransactionType.maps.get(transactionTypeName);
            return transactionType == null ? TransactionType.Undefined : transactionType;
        }

        @NotNull
        public final List<String> getNames() {
            if (getTypes().size() == 0) {
                for (TransactionType transactionType : TransactionType.values()) {
                    TransactionType.INSTANCE.getTypes().add(transactionType.name());
                }
            }
            return getTypes();
        }

        @NotNull
        public final List<String> getTypes() {
            return TransactionType.types;
        }

        public final void setTypes(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            TransactionType.types = list;
        }
    }

    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{Undefined, Sale, SaleWithTip, SalePosTip, SaleNotShow, SaleForced, Cancellation, Refund, ClosePosTip, CheckIn, CheckOut, RentalIn, CarReturn, Balance, Deposit, Consult, CommunicationTest, CheckInReaut, RentalInReaut, KeyLoad, Reverse, LogOn, EchoTest};
    }

    static {
        TransactionMessageType transactionMessageType = TransactionMessageType.Financial;
        MerchantType merchantType = MerchantType.Retail;
        MerchantType merchantType2 = MerchantType.Restaurant;
        boolean z10 = false;
        int i10 = 512;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Sale = new TransactionType("Sale", 1, 0, "Sale", "ISO026000050", "ISO026000045", "0200", "0210", "000000", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType, merchantType2), z10, i10, defaultConstructorMarker);
        boolean z11 = false;
        SaleWithTip = new TransactionType("SaleWithTip", 2, 1, "SaleWithTip", "ISO026000050", "ISO026000045", "0200", "0210", "000000", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType2), z11, 512, null);
        SalePosTip = new TransactionType("SalePosTip", 3, 2, "SalePosTip", "ISO026000050", "ISO026000045", "0200", "0210", "000000", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType2), z11, 512, null);
        MerchantType merchantType3 = MerchantType.Hotel;
        MerchantType merchantType4 = MerchantType.CarRental;
        int i11 = 512;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        SaleNotShow = new TransactionType("SaleNotShow", 4, 3, "SaleNotShow", "ISO026000050", "ISO026000045", "0200", "0210", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType3, merchantType4), z11, i11, defaultConstructorMarker2);
        SaleForced = new TransactionType("SaleForced", 5, 4, "SaleForced", "ISO026000050", "ISO026000045", "0220", "0230", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType, merchantType2), z11, i11, defaultConstructorMarker2);
        TransactionMessageType transactionMessageType2 = TransactionMessageType.Advice;
        Cancellation = new TransactionType("Cancellation", 6, 5, "", "ISO026000050", "ISO026000045", "0220", "0230", "020000", transactionMessageType2, CollectionsKt__CollectionsKt.mutableListOf(merchantType, merchantType2, merchantType3, merchantType4), false);
        int i12 = 512;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        Refund = new TransactionType("Refund", 7, 6, "Refund", "ISO026000050", "ISO026000045", "0200", "0210", "200000", transactionMessageType2, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker3);
        ClosePosTip = new TransactionType("ClosePosTip", 8, 7, "ClosePosTip", "ISO026000050", "ISO026000045", "0220", "0230", "000000", transactionMessageType2, CollectionsKt__CollectionsKt.mutableListOf(merchantType), false);
        CheckIn = new TransactionType("CheckIn", 9, 8, "CheckIn", "ISO026000050", "ISO026000045", "0100", "0110", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker3);
        CheckOut = new TransactionType("CheckOut", 10, 9, "CheckOut", "ISO026000050", "ISO026000045", "0100", "0110", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker3);
        RentalIn = new TransactionType("RentalIn", 11, 10, "RentalIn", "ISO026000050", "ISO026000045", "0200", "0210", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker3);
        CarReturn = new TransactionType("CarReturn", 12, 11, "CarReturn", "ISO026000050", "ISO026000045", "0100", "0110", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker3);
        Balance = new TransactionType("Balance", 13, 12, "Balance", "ISO026000050", "ISO026000045", "0100", "0110", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker3);
        Deposit = new TransactionType("Deposit", 14, 13, "Deposit", "ISO026000050", "ISO026000045", "0100", "0110", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker3);
        Consult = new TransactionType("Consult", 15, 14, "Consult", "ISO026000050", "ISO026000045", "0100", "0110", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker3);
        TransactionMessageType transactionMessageType3 = TransactionMessageType.Comm;
        CommunicationTest = new TransactionType("CommunicationTest", 16, 15, "CommunicationTest", "ISO026000045", "ISO026000045", "0800", "0810", "000001", transactionMessageType3, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z10, i10, defaultConstructorMarker);
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        CheckInReaut = new TransactionType("CheckInReaut", 17, 18, "CheckInReaut", "ISO026000050", "ISO026000045", "0100", "0110", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker4);
        RentalInReaut = new TransactionType("RentalInReaut", 18, 19, "RentalInReaut", "ISO026000050", "ISO026000045", "0100", "0110", "000001", transactionMessageType, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, defaultConstructorMarker4);
        KeyLoad = new TransactionType("KeyLoad", 19, 20, "KeyLoad", "ISO026000050", "ISO026000045", "0200", "0210", "000000", TransactionMessageType.KeyLoad, CollectionsKt__CollectionsKt.mutableListOf(merchantType), false, 512, null);
        Reverse = new TransactionType("Reverse", 20, 21, "Reverse", "ISO026000050", "ISO026000045", "0420", "0430", "000000", TransactionMessageType.Reverse, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z10, i10, defaultConstructorMarker);
        LogOn = new TransactionType("LogOn", 21, 22, "LogOn", "ISO006000050", "ISO026000045", "0800", "0810", "", transactionMessageType3, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, null);
        EchoTest = new TransactionType("EchoTest", 22, 23, "EchoTest", "ISO006000050", "ISO026000045", "0800", "0810", "", transactionMessageType3, CollectionsKt__CollectionsKt.mutableListOf(merchantType), z11, i12, null);
        $VALUES = $values();
        INSTANCE = new Companion(null);
        TransactionType[] transactionTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(transactionTypeArrValues.length), 16));
        for (TransactionType transactionType : transactionTypeArrValues) {
            linkedHashMap.put(transactionType.transactionTypeName, transactionType);
        }
        maps = linkedHashMap;
        MerchantType[] merchantTypeArrValues = MerchantType.values();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(merchantTypeArrValues.length), 16));
        for (MerchantType merchantType5 : merchantTypeArrValues) {
            linkedHashMap2.put(merchantType5.getGetInjectedTransactionParameters(), merchantType5);
        }
        map = linkedHashMap2;
        TransactionType[] transactionTypeArrValues2 = values();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(transactionTypeArrValues2.length), 16));
        for (TransactionType transactionType2 : transactionTypeArrValues2) {
            linkedHashMap3.put(Integer.valueOf(transactionType2.transactionTypeId), transactionType2);
        }
        map3 = linkedHashMap3;
        types = new ArrayList();
    }

    private TransactionType(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, TransactionMessageType transactionMessageType, List list, boolean z10) {
        super(str, i10);
        this.transactionTypeId = i11;
        this.transactionTypeName = str2;
        this.isoHeader = str3;
        this.isoHeaderResponse = str4;
        this.messageTypeRequest = str5;
        this.messageTypeResponse = str6;
        this.processingCode = str7;
        this.transactionMessageType = transactionMessageType;
        this.mainMerchantTypesAllowed = list;
        this.cardMustBePresented = z10;
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }

    public final boolean getCardMustBePresented() {
        return this.cardMustBePresented;
    }

    @NotNull
    public final String getIsoHeader() {
        return this.isoHeader;
    }

    @NotNull
    public final String getIsoHeaderResponse() {
        return this.isoHeaderResponse;
    }

    @NotNull
    public final List<MerchantType> getMainMerchantTypesAllowed() {
        return this.mainMerchantTypesAllowed;
    }

    @NotNull
    public final String getMessageTypeRequest() {
        return this.messageTypeRequest;
    }

    @NotNull
    public final String getMessageTypeResponse() {
        return this.messageTypeResponse;
    }

    @NotNull
    public final String getProcessingCode() {
        return this.processingCode;
    }

    @NotNull
    public final TransactionMessageType getTransactionMessageType() {
        return this.transactionMessageType;
    }

    public final int getTransactionTypeId() {
        return this.transactionTypeId;
    }

    @NotNull
    public final String getTransactionTypeName() {
        return this.transactionTypeName;
    }

    public final void setCardMustBePresented(boolean z10) {
        this.cardMustBePresented = z10;
    }

    public final void setIsoHeader(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoHeader = str;
    }

    public final void setIsoHeaderResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoHeaderResponse = str;
    }

    public final void setMainMerchantTypesAllowed(@NotNull List<MerchantType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.mainMerchantTypesAllowed = list;
    }

    public final void setMessageTypeRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.messageTypeRequest = str;
    }

    public final void setMessageTypeResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.messageTypeResponse = str;
    }

    public final void setProcessingCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.processingCode = str;
    }

    public final void setTransactionMessageType(@NotNull TransactionMessageType transactionMessageType) {
        Intrinsics.checkNotNullParameter(transactionMessageType, "");
        this.transactionMessageType = transactionMessageType;
    }

    public final void setTransactionTypeId(int i10) {
        this.transactionTypeId = i10;
    }

    public final void setTransactionTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionTypeName = str;
    }

    public /* synthetic */ TransactionType(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, TransactionMessageType transactionMessageType, List list, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, str2, str3, str4, str5, str6, (i12 & 64) != 0 ? "000000" : str7, (i12 & 128) != 0 ? TransactionMessageType.Financial : transactionMessageType, list, (i12 & 512) != 0 ? true : z10);
    }
}
