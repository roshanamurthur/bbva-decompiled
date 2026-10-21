package com.viergegroup.sdk.taptophone.webApi;

import bk.p;
import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\bG\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bO¨\u0006P"}, d2 = {"Lcom/viergegroup/sdk/taptophone/webApi/ErrorCatalog;", "", "", "errorId", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getErrorId", "()I", "setErrorId", "(I)V", "", "errorTypeName", "Ljava/lang/String;", "getErrorTypeName", "()Ljava/lang/String;", "setErrorTypeName", "(Ljava/lang/String;)V", "errorLogsName", "getErrorLogsName", "setErrorLogsName", "Companion", "Undefined", "Approved", "HostUnreachable", "ReferToCardIsuer", "ReferToCardIsuerSpecialCondition", "InvalidMerchant", "PickUp", "DoNotHonor", "Error", "PickUpCardSpecialCondition", "HonourWithIdentification", "RequestInPrrogress", "ApprovedForPartialAmount", "ApprovedVIP", "InvalidTransaction", "InvalidCardNumber", "NoSuchIssuer", "ApprovedUpdateTrack3", "CustomerCancellation", "CustomerDispute", "ReenterTransaction", "InvalidResponse", "NoActionTaken", "SuspectedMalfunction", "UnacceptableTransactionFee", "FileUpdateNotSupportedByReceiver", "UnableToLocateRecordOnFile", "DuplicateFileUpdateRecord", "FileUpdateFieldEditError", "Track2BadFormat", "HostErrorFromProsa", "HostErrorFromProsaAuthorizatorUnreachable", "KeyLoadIsNecessary", "RsaFailed", "HostIsNotAvailable", "InvalidIso8583", "FieldIsMandatory", "InvalidFormatField", "InvalidTokenFormant", "RSADOesntExists", "Track2IsMandatory", "KeyLoadIsNecesary", "InvalidScriptExpression", "SystemTraceNumberIsNecesary", "Responce", "HostIsInactive", "HostIsUnknown", "HostError", "HostTimeOut", "HostDisconnected", "HostResponseInvalidFormat", "HostConnectionError", "EMVDataFormatError", "UnHandledException", "OriginalTransactionDoesntExist", "AdviceTransactionCantGenerateAdviceTransaction", "OriginalTransactionWasCancelled", "OriginalTransactionWasRefunded", "IsoIsBadFormedOrIsNull", "TransactionDoesntExist", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nErrorCatalog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorCatalog.kt\ncom/viergegroup/sdk/taptophone/webApi/ErrorCatalog\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,80:1\n8811#2,2:81\n9071#2,4:83\n*S KotlinDebug\n*F\n+ 1 ErrorCatalog.kt\ncom/viergegroup/sdk/taptophone/webApi/ErrorCatalog\n*L\n76#1:81,2\n76#1:83,4\n*E\n"})
public enum ErrorCatalog {
    Undefined("Undefined", "", "Undefined Error Code"),
    Approved("Approved", "00", "Approved"),
    HostUnreachable("HostUnreachable", "91", " HOST IS UNRECHEABLE\n"),
    ReferToCardIsuer("ReferToCardIsuer", "01", "Refer to card issuer, CARD ISSUER ERROR\n"),
    ReferToCardIsuerSpecialCondition("ReferToCardIsuerSpecialCondition", "02", "Refer to card issuer's special conditions\n"),
    InvalidMerchant("InvalidMerchant", "03", "Invalid merchant\n"),
    PickUp("PickUp", "04", "Pick-up\n"),
    DoNotHonor("DoNotHonor", "05", "Do not honor\n"),
    Error("Error", EglobalUtils.KEY_DERIVATION_FAILED_TIMEOUT, "Error\n"),
    PickUpCardSpecialCondition("PickUpCardSpecialCondition", EglobalUtils.READ_MODE_CONTACTLESS_EMV, "Pick-up card, special condition\n"),
    HonourWithIdentification("HonourWithIdentification", "08", "Honour with identification\n"),
    RequestInPrrogress("RequestInPrrogress", EglobalUtils.KEY_DERIVATION_FAILED_TIMEOUT, "Request in progress\n"),
    ApprovedForPartialAmount("ApprovedForPartialAmount", "10", "Approved for partial amount\n"),
    ApprovedVIP("ApprovedVIP", "11", "Approved  VIP\n"),
    InvalidTransaction("InvalidTransaction", "12", "Invalid Transaction or Card\n"),
    InvalidCardNumber("InvalidCardNumber", "13", "Invalid card number (no such number)\n"),
    NoSuchIssuer("NoSuchIssuer", "15", "No such issuer\n"),
    ApprovedUpdateTrack3("ApprovedUpdateTrack3", "16", "Approved, update track 3\n"),
    CustomerCancellation("CustomerCancellation", "17", "Customer cancellation\n"),
    CustomerDispute("CustomerDispute", "18", "Customer dispute\n"),
    ReenterTransaction("ReenterTransaction", "19", "Re-enter transaction\n"),
    InvalidResponse("InvalidResponse", PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND, "Invalid response\n"),
    NoActionTaken("NoActionTaken", "21", "No action taken\n"),
    SuspectedMalfunction("SuspectedMalfunction", "22", "Suspected malfunction\n"),
    UnacceptableTransactionFee("UnacceptableTransactionFee", EglobalUtils.CARD_REMOVED, "Unacceptable transaction fee\n"),
    FileUpdateNotSupportedByReceiver("FileUpdateNotSupportedByReceiver", "24", "File update not supported by receiver\n"),
    UnableToLocateRecordOnFile("UnableToLocateRecordOnFile", "25", "Unable to locate record on file\n"),
    DuplicateFileUpdateRecord("DuplicateFileUpdateRecord", "26", "Duplicate file update record, old record replaced\n"),
    FileUpdateFieldEditError("FileUpdateFieldEditError", "27", "File update field edit error\n"),
    Track2BadFormat("Track2BadFormat", "30", "Track2 Bad Format\n"),
    HostErrorFromProsa("HostErrorFromProsa", "Q1", "Proabably Prosa Authorizator is Not Running\n"),
    HostErrorFromProsaAuthorizatorUnreachable("HostErrorFromProsaAuthorizatorUnreachable", "T2", "HostError From Prosa - NOT SURE: Authorizator Unreachable\n"),
    KeyLoadIsNecessary("KeyLoadIsNecessary", "70", "Key Load Is Necessary\n"),
    RsaFailed("RsaFailed", "72", " Key Load Failed  ( Incorrect RSA )\n"),
    HostIsNotAvailable("HostIsNotAvailable", "R9", " Host Is Not Available\n"),
    InvalidIso8583("InvalidIso8583", "X1", "INVALID Iso Format\n"),
    FieldIsMandatory("FieldIsMandatory", "X2", "Field Is Mandatory\n"),
    InvalidFormatField("InvalidFormatField", "X3", "Invalid Field Format\n"),
    InvalidTokenFormant("InvalidTokenFormant", "X4", "Invalid Token Formant\n"),
    RSADOesntExists("RSADOesntExists", "Y1", "RSA Doesnt Exists\n"),
    Track2IsMandatory("Track2IsMandatory", "Y2", "Track2 Is Mandatory\n"),
    KeyLoadIsNecesary("KeyLoadIsNecesary", "Y3", "KeyLoad is necesary\n"),
    InvalidScriptExpression("InvalidScriptExpression", "Y4", "Invalid Script Expression\n"),
    SystemTraceNumberIsNecesary("SystemTraceNumberIsNecesary", "Y5", "System Trace Number Is Necesary\n"),
    Responce("Responce", "Y6", "Empty Responce (0 Bytes Received From Host)\n"),
    HostIsInactive("HostIsInactive", "H1", " HOST IS INACTIVE\n"),
    HostIsUnknown("HostIsUnknown", "H2", " HOST Is NOT VALID\n"),
    HostError("HostError", "H3", "HOST DIDN'T Answer Correctly\n"),
    HostTimeOut("HostTimeOut", AsoResponse.ERROR_CODE_TSEC_TIME_OUT, "HostTime Out\n"),
    HostDisconnected("HostDisconnected", AsoResponse.ERROR_CODE_TSEC_TIME_OUT, "Host Disconnected\n"),
    HostResponseInvalidFormat("HostResponseInvalidFormat", "H6", "Host Response Message Invalid Format\n"),
    HostConnectionError("HostConnectionError", "H7", "Host Connection Error\n"),
    EMVDataFormatError("EMVDataFormatError", "F1", "EMV Data Format Error\n"),
    UnHandledException("UnHandledException", "UE", "Unhandled Exception\n"),
    OriginalTransactionDoesntExist("OriginalTransactionDoesntExist", "OT", "Original Transaction Doesnt Exist\n"),
    AdviceTransactionCantGenerateAdviceTransaction("AdviceTransactionCantGenerateAdviceTransaction", "AD", "Advice Transaction Cant Generate Advice Transaction\n"),
    OriginalTransactionWasCancelled("OriginalTransactionWasCancelled", ComponentDTO.CROSS_COMPONENT, "Original Transaction Was Cancelled\n"),
    OriginalTransactionWasRefunded("OriginalTransactionWasRefunded", "RC", "Original Transaction Was Refunded\n"),
    IsoIsBadFormedOrIsNull("IsoIsBadFormedOrIsNull", "NU", "Iso Is BadFormed Or Is Null\n"),
    TransactionDoesntExist("TransactionDoesntExist", "NA", " Transaction Doesnt Exist\n");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<Integer, ErrorCatalog> getInjectedTransactionParameters;

    @NotNull
    private String AssetInjection;
    private int bOD;

    @NotNull
    private String setInjectedTransactionParameters;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/viergegroup/sdk/taptophone/webApi/ErrorCatalog$Companion;", "", "()V", "map", "", "", "Lcom/viergegroup/sdk/taptophone/webApi/ErrorCatalog;", "fromErrorId", "errorId", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ErrorCatalog fromErrorId(int errorId) {
            return (ErrorCatalog) ErrorCatalog.getInjectedTransactionParameters.get(Integer.valueOf(errorId));
        }
    }

    static {
        ErrorCatalog[] errorCatalogArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(errorCatalogArrValues.length), 16));
        for (ErrorCatalog errorCatalog : errorCatalogArrValues) {
            linkedHashMap.put(Integer.valueOf(errorCatalog.bOD), errorCatalog);
        }
        getInjectedTransactionParameters = linkedHashMap;
    }

    ErrorCatalog(String str, String str2, String str3) {
        this.bOD = i;
        this.AssetInjection = str2;
        this.setInjectedTransactionParameters = str3;
    }

    /* JADX INFO: renamed from: getErrorId, reason: from getter */
    public final int getBOD() {
        return this.bOD;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorLogsName, reason: from getter */
    public final String getSetInjectedTransactionParameters() {
        return this.setInjectedTransactionParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorTypeName, reason: from getter */
    public final String getAssetInjection() {
        return this.AssetInjection;
    }

    public final void setErrorId(int i10) {
        this.bOD = i10;
    }

    public final void setErrorLogsName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.setInjectedTransactionParameters = str;
    }

    public final void setErrorTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AssetInjection = str;
    }
}
