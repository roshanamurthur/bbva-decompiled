package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.room.RoomMasterTable;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.component.request.header.standin.StandInHeaderInterceptor;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ReadRecord;
import com.sun.mail.imap.IMAPStore;
import com.vierge.pinpadsdk.script.NumberOfScript;
import com.vierge.pinpadsdk.script.TypeScript;
import com.viergegroup.sdk.taptophone.DeviceNfcStatus;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.message.MessageResponse;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.message.MessageSend;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.message.MessageUtils;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.response.Response;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.response.ResponseError;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.response.STATUS;
import com.viergegroup.sdk.taptophone.vierge.database.DBUtils;
import com.viergegroup.sdk.taptophone.vierge.models.BackendViergeResponseData;
import com.viergegroup.sdk.taptophone.vierge.models.CalculateHashResponse;
import com.viergegroup.sdk.taptophone.vierge.models.MessageLectureType;
import com.viergegroup.sdk.taptophone.vierge.models.SearchTxnResponseOpenPay;
import com.viergegroup.sdk.taptophone.vierge.models.SendTransactionResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public class PinPadSdk {
    private static Map<String, String> MapTagsCopy = null;
    public static boolean debug2 = false;
    private static SdkTapOnPhoneVierge sdkTapOnPhoneVierge;
    private static PinPadSdk selfInstance;
    private static List<String> tags = new ArrayList();
    static List<String> tlvList1Required;
    ICallbackListeners callback;
    Thread myTimer;
    private MessageResponse receivedMessage;
    public boolean debug = false;
    private Integer operationNumber = 0;
    private final String version = "PinPad Android Library - Version 1.0.32E (14/03/2025)";
    private final String versionNumber = "1.0.32E";
    String serialNumberTest = "";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    BroadcastReceiver batteryReceiver = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            float intExtra = (intent.getIntExtra("level", -1) / intent.getIntExtra(ImageScaleTypeHandler.ID, -1)) * 100.0f;
            PinPadSdk pinPadSdk = PinPadSdk.this;
            context.unregisterReceiver(pinPadSdk.batteryReceiver);
            String strValueOf = String.valueOf(intExtra);
            JsonObject response = new Response(STATUS.messageWasSuccessful).getResponse();
            response.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Q8);
            response.addProperty("app_ver", pinPadSdk.getVersionNumber());
            response.addProperty("serial", pinPadSdk.serialNumberTest);
            response.addProperty("modelo", PinPadSdk.getModelDevice());
            response.addProperty("batery_check", strValueOf);
            pinPadSdk._broadcastResponse(response);
        }
    }

    public class b implements ResponseSaleDataOpenPay {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String[] f67618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ PinPadSdk f67619b;

        @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ResponseSaleDataOpenPay
        public final void responseSaleTransaction(SearchTxnResponseOpenPay searchTxnResponseOpenPay) {
            Response response;
            searchTxnResponseOpenPay.getErrorMessage();
            int errorCode = searchTxnResponseOpenPay.getErrorCode();
            PinPadSdk pinPadSdk = this.f67619b;
            if (errorCode == 0) {
                if (searchTxnResponseOpenPay.getTransactionDto() != null) {
                    JsonObject jsonObjectBuildObjectC51OkResponse = pinPadSdk.buildObjectC51OkResponse(searchTxnResponseOpenPay, this.f67618a[1]);
                    PinPadSdk.tlvList1Required.clear();
                    pinPadSdk._broadcastResponse(jsonObjectBuildObjectC51OkResponse);
                    return;
                }
                response = new Response(STATUS.errorInternal);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("DECLINADA OFFLINE")) {
                response = new Response(STATUS.errorNotDefinedCancelFromPinPad);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("TIEMPO DE ESPERA PARA EL PROCESAMIENTO DE TARJETA DISCOVERY EXCEDIDO")) {
                response = new Response(STATUS.timeout);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("LA TRANSACCIÓN FUE TERMINADA")) {
                response = new Response(STATUS.errorNotDefinedCancelFromPinPad);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("FALLO DEL ESTADO DEL DISPOSITIVO")) {
                response = new Response(STATUS.errorDeviceStateFailure);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("DECLINADA ONLINE")) {
                response = new Response(STATUS.notInitKeys);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("ERROR EN EL PROCESAMIENTO DE LA TRANSACCIÓN")) {
                response = new Response(STATUS.readCardError);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("ERROR DE CONEXIÓN DE RED")) {
                response = new Response(STATUS.errorNetworkConnection);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("LA TERMINAL NO EXISTE")) {
                response = new Response(STATUS.sdkIntanceMissing);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("TIEMPO DE ESPERA PARA LA AUTORIZACIÓN EXCEDIDO")) {
                response = new Response(STATUS.errorNetworkConnection);
            } else if (searchTxnResponseOpenPay.getErrorMessage().equals("ERROR EN EL PROCESAMIENTO DE LA TARJETA")) {
                response = new Response(STATUS.readCardError);
            } else {
                response = searchTxnResponseOpenPay.getErrorMessage().equals("APLICACIÓN DE TARJETA NO DISPONIBLE") ? new Response(STATUS.cardNotSuppoted) : new Response(STATUS.ErrorMessage);
            }
            pinPadSdk._broadcastResponse(pinPadSdk.buildObjectC51ErrorResponse(response));
        }
    }

    public class c implements ProcessMessageLectureCard {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ PinPadSdk f67620a;

        @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ProcessMessageLectureCard
        public final void processMessageFromLectureCard(MessageLectureType messageLectureType) {
            this.f67620a.callback.listenerStatusMessageFromLectureCard(messageLectureType);
        }
    }

    public class d implements ResponseRequestKeyLoadConfirmOpenPay {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ PinPadSdk f67621a;

        @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ResponseRequestKeyLoadConfirmOpenPay
        public final void responseKeyLoadConfirm(SendTransactionResponse sendTransactionResponse) {
            String.valueOf(sendTransactionResponse.getErrorCode());
            int errorCode = sendTransactionResponse.getErrorCode();
            PinPadSdk pinPadSdk = this.f67621a;
            if (errorCode == 0) {
                pinPadSdk._broadcastResponse(pinPadSdk.buildObjectZ11OkResponse(new Response(STATUS.messageWasSuccessful)));
                return;
            }
            if (sendTransactionResponse.getErrorCode() == 2310) {
                pinPadSdk._broadcastResponse(pinPadSdk.buildObjectZ11Error(new Response(STATUS.wrongCheckValue)));
            } else {
                if (sendTransactionResponse.getErrorCode() == 2309) {
                    pinPadSdk._broadcastResponse(pinPadSdk.buildObjectZ11Error(new Response(STATUS.wrongCryptoHSM)));
                    return;
                }
                Response response = new Response(STATUS.ErrorMessage);
                response.setErrorMgs(sendTransactionResponse.getErrorMessage());
                pinPadSdk._broadcastResponse(pinPadSdk.buildObjectZ11Error(response));
            }
        }
    }

    public class e implements ResponseResquestKeyLoadOpenPay {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ PinPadSdk f67622a;

        @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ResponseResquestKeyLoadOpenPay
        public final void responseKeyLoad(SendTransactionResponse sendTransactionResponse) {
            int errorCode = sendTransactionResponse.getErrorCode();
            PinPadSdk pinPadSdk = this.f67622a;
            if (errorCode != 0) {
                pinPadSdk._broadcastResponse(pinPadSdk.buildObjectZ10Error(new Response(STATUS.ErrorMessage)));
                return;
            }
            String tokenEW = sendTransactionResponse.getTransactionResponse().getTokenEW();
            String strBuildTokenES = pinPadSdk.buildTokenES("1");
            pinPadSdk._broadcastResponse(strBuildTokenES.equals("Error") ? pinPadSdk.buildObjectZ10Error(new Response(STATUS.errorInternal)) : pinPadSdk.buildObjetZ10OkResponse(tokenEW, strBuildTokenES, new Response(STATUS.messageWasSuccessful)));
        }
    }

    public class f implements ResponseRequestCalculateHash {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String[] f67623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ PinPadSdk f67624b;

        @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ResponseRequestCalculateHash
        public final void responseCalculateHash(CalculateHashResponse calculateHashResponse) {
            int errorCode = calculateHashResponse.getErrorCode();
            PinPadSdk pinPadSdk = this.f67624b;
            if (errorCode != 0) {
                pinPadSdk._broadcastResponse(pinPadSdk.buildErrorZ13Error(new Response(STATUS.ErrorMessage)));
                return;
            }
            Response response = new Response(STATUS.messageWasSuccessful);
            response.setHash(calculateHashResponse.getHash());
            response.setkcv(calculateHashResponse.getkcv());
            pinPadSdk._broadcastResponse(pinPadSdk.buildZ13Response(response, this.f67623a[0]));
        }
    }

    public class g implements ResponseRequestKeyLoadConfirmOpenPay {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ PinPadSdk f67625a;

        @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ResponseRequestKeyLoadConfirmOpenPay
        public final void responseKeyLoadConfirm(SendTransactionResponse sendTransactionResponse) {
            int errorCode = sendTransactionResponse.getErrorCode();
            PinPadSdk pinPadSdk = this.f67625a;
            if (errorCode == 0) {
                pinPadSdk._broadcastResponse(pinPadSdk.buildZ12Response(new Response(STATUS.messageWasSuccessful)));
            } else {
                pinPadSdk._broadcastResponse(pinPadSdk.buildErrorZ12Error(new Response(STATUS.ErrorMessage)));
            }
        }
    }

    public PinPadSdk() {
    }

    private String DecimalToHex(int i10) {
        return padLeft2(Integer.toHexString(i10).toUpperCase(), 2);
    }

    private void _broadcastResponseError(int i10) {
        _broadcastResponse(this.gson.toJsonTree(((ResponseError) new ResponseError(MessageUtils.getMessageStatusDescription(i10)).setStatus(MessageUtils.getMessageStatusCode(i10))).getResponse()).getAsJsonObject());
    }

    private void _logDataReceive(short[] sArr) {
        ICallbackListeners iCallbackListeners;
        if (!this.debug || (iCallbackListeners = this.callback) == null) {
            return;
        }
        iCallbackListeners.listenerLogDataReceive(sArr);
    }

    private void _logDataSend(byte[] bArr) {
        if (!this.debug || this.callback == null) {
            return;
        }
        short[] sArr = new short[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                sArr[i10] = (short) (b10 & 255);
            } else {
                sArr[i10] = b10;
            }
        }
        this.callback.listenerLogDataSend(sArr);
    }

    private void _logDataSession(String str) {
        if (this.callback != null) {
            String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
            StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
            sb2.append(str2);
            sb2.append(Constant.BRACKET_CLOSE.concat(str));
            this.callback.listenerLogSession(sb2.toString());
        }
    }

    private void _procesaMensajeCompuesto() {
        String code = this.receivedMessage.getCode();
        if (this.receivedMessage.isFinished() || code.equalsIgnoreCase(CommandConstants.COMMAND_C51) || code.equalsIgnoreCase(CommandConstants.COMMAND_C54) || code.equalsIgnoreCase("C55") || code.equalsIgnoreCase("C56") || code.equalsIgnoreCase(CommandConstants.COMMAND_Q8) || code.equalsIgnoreCase("Q9") || code.equalsIgnoreCase(CommandConstants.COMMAND_Z12) || code.equalsIgnoreCase(CommandConstants.COMMAND_Z13)) {
            return;
        }
        if (code.equalsIgnoreCase("SEQ1") || code.equalsIgnoreCase("SEQ2") || !(code.equalsIgnoreCase(CommandConstants.COMMAND_Z10) || code.equalsIgnoreCase(CommandConstants.COMMAND_Z11) || code.equalsIgnoreCase("C50"))) {
            MessageResponse messageResponse = this.receivedMessage;
            _logDataReceive(messageResponse.getShortArray(messageResponse.getList()));
        }
    }

    private String asciiToHex(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            String hexString = Integer.toHexString(str.charAt(i10));
            if (hexString.length() < 2) {
                hexString = "0".concat(hexString);
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    private String buildE1List(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(concatTag(EglobalUtils.DEDICATED_FILE_NAME, map));
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(sb2.toString());
        sbD.append(concatTag(EglobalUtils.APPLICATION_PREFERRED_NAME, map));
        StringBuilder sbD2 = androidx.camera.core.impl.utils.c.d(sbD.toString());
        sbD2.append(concatTag("50", map));
        StringBuilder sbD3 = androidx.camera.core.impl.utils.c.d(sbD2.toString());
        sbD3.append(concatTag("5F30", map));
        StringBuilder sbD4 = androidx.camera.core.impl.utils.c.d(sbD3.toString());
        sbD4.append(concatTag(EglobalUtils.SEQUENCE_COUNTER, map));
        StringBuilder sbD5 = androidx.camera.core.impl.utils.c.d(sbD4.toString());
        sbD5.append(concatTag(EglobalUtils.CARD_HOLDER_VERIFICATION, map));
        StringBuilder sbD6 = androidx.camera.core.impl.utils.c.d(sbD5.toString());
        sbD6.append(concatTag("C2", map));
        StringBuilder sbD7 = androidx.camera.core.impl.utils.c.d(sbD6.toString());
        sbD7.append(concatTag("95", map));
        StringBuilder sbD8 = androidx.camera.core.impl.utils.c.d(sbD7.toString());
        sbD8.append(concatTag(EglobalUtils.CRYPTO_INFO, map));
        StringBuilder sbD9 = androidx.camera.core.impl.utils.c.d(sbD8.toString());
        sbD9.append(concatTag(EglobalUtils.CRYPTOGRAM, map));
        StringBuilder sbD10 = androidx.camera.core.impl.utils.c.d(sbD9.toString());
        sbD10.append(concatTag("9B", map));
        StringBuilder sbD11 = androidx.camera.core.impl.utils.c.d(sbD10.toString());
        sbD11.append(concatTag("9F39", map));
        StringBuilder sbD12 = androidx.camera.core.impl.utils.c.d(sbD11.toString());
        sbD12.append(concatTag("8A", map));
        StringBuilder sbD13 = androidx.camera.core.impl.utils.c.d(sbD12.toString());
        sbD13.append(concatTag("99", map));
        StringBuilder sbD14 = androidx.camera.core.impl.utils.c.d(sbD13.toString());
        sbD14.append(concatTag(EglobalUtils.FORM_FACTOR_INDICATOR, map));
        String string = sbD14.toString();
        "List: ".concat(String.valueOf(string));
        return string;
    }

    private String buildE2C54() {
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(concatTag2(EglobalUtils.CRYPTOGRAM));
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(sb2.toString());
        sbD.append(concatTag2(EglobalUtils.CRYPTO_INFO));
        StringBuilder sbD2 = androidx.camera.core.impl.utils.c.d(sbD.toString());
        sbD2.append(concatTag2(EglobalUtils.TRANSACTION_COUNTER));
        StringBuilder sbD3 = androidx.camera.core.impl.utils.c.d(sbD2.toString());
        sbD3.append(concatTag2("95"));
        StringBuilder sbD4 = androidx.camera.core.impl.utils.c.d(sbD3.toString());
        sbD4.append(concatTag2(EglobalUtils.ISSUER_APPLICATION_DATA));
        StringBuilder sbD5 = androidx.camera.core.impl.utils.c.d(sbD4.toString());
        sbD5.append(concatTag2("9F37"));
        StringBuilder sbD6 = androidx.camera.core.impl.utils.c.d(sbD5.toString());
        sbD6.append(concatTag2("9B"));
        StringBuilder sbD7 = androidx.camera.core.impl.utils.c.d(sbD6.toString());
        sbD7.append(concatTag2("8A"));
        String string = sbD7.toString();
        "E2: ".concat(String.valueOf(string));
        return string;
    }

    private String buildE2List(Map<String, String> map, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        "amount: ".concat(String.valueOf(str));
        double amount = getAmount(str);
        "Monto Double: ".concat(String.valueOf(amount));
        try {
            Integer.parseInt(str2.substring(0, 6));
        } catch (NumberFormatException unused) {
        }
        String typeCard = getTypeCard(map);
        "tipe card: ".concat(String.valueOf(typeCard));
        for (String str3 : tlvList1Required) {
            "tag: ".concat(String.valueOf(str3));
            sb2.append(str3);
            if (str3.equals("9F03") || str3.equals("9f03")) {
                sb2.append("06000000000000");
            } else {
                if (str3.equals(EglobalUtils.SEQUENCE_NUMBER) || str3.equals("9f41")) {
                    String string = this.operationNumber.toString();
                    sb2.append("04");
                    sb2.append(padLeft2(string, 8));
                } else if (str3.equals(EglobalUtils.INTERFACE_DEVICE) || str3.equals("9f1e")) {
                    String strAsciiToHex = asciiToHex(this.serialNumberTest);
                    "valueSerialNumber: ".concat(String.valueOf(strAsciiToHex));
                    sb2.append("08");
                    sb2.append(strAsciiToHex);
                } else if (str3.equals(EglobalUtils.TRANSACTION_CATEGORY_CODE) || str3.equals("9f53")) {
                    sb2.append("0152");
                } else if ((str3.equals("9f33") || str3.equals(EglobalUtils.CAPABILITIES)) && typeCard.contains("A000000003")) {
                    if (amount > 1000.0d) {
                        sb2.append("03002808");
                    } else {
                        sb2.append("03000808");
                    }
                } else if (map.containsKey(str3)) {
                    String str4 = map.get(str3);
                    if (str4 != null) {
                        int length = str4.length();
                        "tag: ".concat(String.valueOf(length));
                        String strDecimalToHex = DecimalToHex(length / 2);
                        "tag: ".concat(String.valueOf(strDecimalToHex));
                        sb2.append(strDecimalToHex);
                        sb2.append(str4);
                    }
                } else if ((str3.equals(EglobalUtils.VERSION_NUMBER) || str3.equals("9f09")) && typeCard.contains("A000000003")) {
                    sb2.append("02008C");
                } else {
                    sb2.append("00");
                }
                "List tag: ".concat(String.valueOf(sb2));
            }
        }
        "List tag: ".concat(String.valueOf(sb2));
        return sb2.toString();
    }

    private JsonObject buildErrorC54Error(Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_C54);
        return response2;
    }

    private void buildErrorCommandUnknown() {
        _broadcastResponse(new Response(STATUS.wrongCommand).getResponse());
    }

    private JsonObject buildObjectC54Ok(Response response) {
        JsonObject response2 = response.getResponse();
        String strBuildE2C54 = buildE2C54();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_C54);
        response2.addProperty("E2", strBuildE2C54);
        return response2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    private String buildTokenCZ(String str, String str2, String str3) {
        int i10;
        String string;
        try {
            i10 = Integer.parseInt(str3.substring(0, 6));
        } catch (NumberFormatException unused) {
            i10 = 0;
        }
        if (str.isEmpty()) {
            str = "    ";
        }
        if (str2.isEmpty()) {
            string = "        ";
        } else if (i10 >= 400000 && i10 <= 499999) {
            string = str2.substring(0, 8);
        } else if ((i10 < 222100 || i10 > 272099) && (i10 < 500000 || i10 > 599999)) {
            string = "        ";
        } else {
            "country code: ".concat(String.valueOf(str2.substring(0, 4)));
            String strSubstring = str2.substring(4, 8);
            "uniqueIdentifier: ".concat(String.valueOf(strSubstring));
            boolean z10 = (stringToBCD(strSubstring)[0] & 128) != 0;
            "is set MSB: ".concat(String.valueOf(z10));
            if (z10) {
                string = "        ";
            } else {
                String strSubstring2 = str2.substring(8, 12);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strSubstring2);
                sb2.append("0000");
                string = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder("! CZ00040 ");
        sb3.append(str);
        sb3.append(string);
        sb3.append("                            ");
        String string2 = sb3.toString();
        "Token: ".concat(String.valueOf(string2));
        return string2;
    }

    private boolean checkAmount(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 >= 0 && i10 <= 99999999;
        } catch (NumberFormatException e5) {
            e5.getMessage();
            return false;
        }
    }

    private boolean checkTlvDataFormat(String str) {
        if (tags.size() == 0) {
            initializeTags();
        }
        tags.size();
        tlvList1Required = new ArrayList();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < str.length()) {
            "index: ".concat(String.valueOf(i10));
            int i11 = i10 + 2;
            if (i11 <= str.length()) {
                String strSubstring = str.substring(i10, i11);
                "tag: ".concat(String.valueOf(strSubstring));
                if (tags.contains(strSubstring)) {
                    tlvList1Required.add(strSubstring);
                } else {
                    i11 = i10 + 4;
                    if (i11 <= str.length()) {
                        String strSubstring2 = str.substring(i10, i11);
                        "tag: ".concat(String.valueOf(strSubstring2));
                        if (tags.contains(strSubstring2)) {
                            tlvList1Required.add(strSubstring2);
                        }
                    }
                }
                i10 = i11;
                "index: ".concat(String.valueOf(i10));
            }
            "result validation".concat(String.valueOf(z10));
            return z10;
        }
        z10 = true;
        "result validation".concat(String.valueOf(z10));
        return z10;
    }

    private String concatTag(String str, Map<String, String> map) {
        String string;
        if (map.containsKey(str)) {
            String str2 = map.get(str);
            String strDecimalToHex = DecimalToHex(str2.length() / 2);
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(str);
            sb2.append(strDecimalToHex);
            sb2.append(str2);
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("");
            sb3.append(str);
            sb3.append("00");
            string = sb3.toString();
        }
        "tag value: ".concat(String.valueOf(string));
        return string;
    }

    private String concatTag2(String str) {
        String string;
        if (MapTagsCopy.containsKey(str)) {
            String str2 = MapTagsCopy.get(str);
            String strDecimalToHex = DecimalToHex(str2.length() / 2);
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(str);
            sb2.append(strDecimalToHex);
            sb2.append(str2);
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("");
            sb3.append(str);
            sb3.append("00");
            string = sb3.toString();
        }
        "tag value: ".concat(String.valueOf(string));
        return string;
    }

    private void executeCommand72() {
        sdkTapOnPhoneVierge.deactiveSession();
        JsonObject response = new Response(STATUS.messageWasSuccessful).getResponse();
        response.addProperty(IMAPStore.ID_COMMAND, "72");
        _broadcastResponse(response);
    }

    private void executeCommandC51(String[] strArr) {
        DBUtils.getDevServerFlag();
        Integer numberOperation = DBUtils.getNumberOperation();
        this.operationNumber = numberOperation;
        if (numberOperation.intValue() + 1 > 99999999) {
            this.operationNumber = 0;
        }
        DBUtils.updateNumberOperation(Integer.valueOf(this.operationNumber.intValue() + 1));
        if (sdkTapOnPhoneVierge.checkNfcStatus() == DeviceNfcStatus.NFC_DISABLED) {
            _broadcastResponse(buildObjectC51ErrorResponse(new Response(STATUS.NFCDisabled)));
            return;
        }
        if (sdkTapOnPhoneVierge.checkNfcStatus() == DeviceNfcStatus.NO_NFC) {
            _broadcastResponse(buildObjectC51ErrorResponse(new Response(STATUS.noNFC)));
            return;
        }
        if (!SdkTapOnPhoneVierge.isInitializeApp) {
            _broadcastResponse(buildObjectC51ErrorResponse(new Response(STATUS.sdkIntanceMissing)));
            return;
        }
        if (strArr.length != 9) {
            _broadcastResponse(buildObjectC51ErrorResponse(new Response(STATUS.invalidData)));
            return;
        }
        strArr[3] = strArr[3].toUpperCase();
        strArr[4] = strArr[4].toUpperCase().trim();
        strArr[5] = strArr[5].toUpperCase().trim();
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        String str5 = strArr[4];
        String str6 = strArr[6];
        String str7 = strArr[7];
        String str8 = strArr[8];
        if (!validParameters(strArr).equals("NoError")) {
            Response response = new Response(STATUS.invalidData);
            response.setErrorMgs("Invalid data");
            _broadcastResponse(buildObjectC51ErrorResponse(response));
            return;
        }
        Boolean devServerFlag = DBUtils.getDevServerFlag();
        "Valor de la DB devServerFlag: ".concat(String.valueOf(devServerFlag));
        String str9 = devServerFlag.booleanValue() ? "OpenPayDev" : "OpenPayProd";
        SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = sdkTapOnPhoneVierge;
        String str10 = strArr[1];
        String str11 = this.serialNumberTest;
        String str12 = strArr[4];
        String str13 = strArr[5];
        String str14 = strArr[7];
        String str15 = strArr[8];
        b bVar = new b();
        bVar.f67619b = this;
        bVar.f67618a = strArr;
        c cVar = new c();
        cVar.f67620a = this;
        sdkTapOnPhoneVierge2.sendSaleOpenPay("Retail", str10, str9, str11, str12, str13, str14, str15, bVar, cVar);
    }

    private void executeCommandC54(String[] strArr) {
        if (strArr == null || strArr.length != 5) {
            _broadcastResponse(buildErrorC54Error(new Response(STATUS.invalidData)));
        } else if (validParametersC54(strArr)) {
            _broadcastResponse(buildObjectC54Ok(new Response(STATUS.messageWasSuccessful)));
        } else {
            Map<String, String> map = MapTagsCopy;
            _broadcastResponse(buildErrorC54Error((map == null || map.isEmpty()) ? new Response(STATUS.wrongCommand) : new Response(STATUS.invalidData)));
        }
    }

    private void executeCommandI51() {
        if (sdkTapOnPhoneVierge.checkNfcStatus() == DeviceNfcStatus.NFC_DISABLED) {
            JsonObject response = new Response(STATUS.NFCDisabled).getResponse();
            response.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_I51);
            _broadcastResponse(response);
            return;
        }
        if (sdkTapOnPhoneVierge.checkNfcStatus() == DeviceNfcStatus.NO_NFC) {
            JsonObject response2 = new Response(STATUS.noNFC).getResponse();
            response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_I51);
            _broadcastResponse(response2);
            return;
        }
        SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = sdkTapOnPhoneVierge;
        if (sdkTapOnPhoneVierge2 == null) {
            JsonObject response3 = new Response(STATUS.sdkIntanceMissing).getResponse();
            response3.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_I51);
            _broadcastResponse(response3);
        } else {
            if (!SdkTapOnPhoneVierge.isInitializeApp) {
                sdkTapOnPhoneVierge2.initializeTerminal((Application) SdkTapOnPhoneVierge.getContext(), new fa.a(this));
                return;
            }
            JsonObject response4 = new Response(STATUS.errorInitializedInstance).getResponse();
            response4.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_I51);
            _broadcastResponse(response4);
        }
    }

    private void executeCommandQ8() {
        SdkTapOnPhoneVierge.getContext().registerReceiver(this.batteryReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private void executeCommandZ10(String str, String str2, String str3, String[] strArr) {
        if (strArr.length != 1) {
            _broadcastResponse(buildObjectZ10Error(new Response(STATUS.invalidData)));
            return;
        }
        String strTrim = strArr[0].toUpperCase().trim();
        if (!strTrim.equals("A000OPFT48") && !strTrim.equals("BCMER001")) {
            _broadcastResponse(buildObjectZ10Error(new Response(STATUS.wrongKeys)));
            return;
        }
        SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = sdkTapOnPhoneVierge;
        e eVar = new e();
        eVar.f67622a = this;
        sdkTapOnPhoneVierge2.requestLoadKeyOpenPay(str2, str, str3, strTrim, eVar);
    }

    private void executeCommandZ11(String str, String str2, String str3, String[] strArr) {
        if (strArr.length != 2) {
            _broadcastResponse(buildObjectZ11Error(new Response(STATUS.invalidData)));
            return;
        }
        String strTrim = strArr[0].toUpperCase().trim();
        String str4 = strArr[1];
        if (!strTrim.equals("A000OPFT48") && !strTrim.equals("BCMER001")) {
            _broadcastResponse(buildObjectZ11Error(new Response(STATUS.wrongKeys)));
            return;
        }
        if (str4.isEmpty()) {
            _broadcastResponse(buildObjectZ11Error(new Response(STATUS.invalidData)));
            return;
        }
        SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = sdkTapOnPhoneVierge;
        d dVar = new d();
        dVar.f67621a = this;
        sdkTapOnPhoneVierge2.requestKeyLoadConfirmOpenPay(str2, str, str3, strTrim, str4, dVar);
    }

    private void executeCommandZ12(String str, String str2, String[] strArr) {
        if (strArr == null || strArr.length != 4) {
            _broadcastResponse(buildErrorZ12Error(new Response(STATUS.invalidData)));
            return;
        }
        SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = sdkTapOnPhoneVierge;
        String str3 = strArr[0];
        String str4 = strArr[1];
        String str5 = strArr[3];
        g gVar = new g();
        gVar.f67625a = this;
        sdkTapOnPhoneVierge2.executeZ12Command("Retail", str, str2, str3, str4, str5, gVar);
    }

    private void executeCommandZ13(String str, String str2, String[] strArr) {
        if (strArr == null || strArr.length != 1) {
            _broadcastResponse(buildErrorZ13Error(new Response(STATUS.invalidData)));
            return;
        }
        SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = sdkTapOnPhoneVierge;
        String str3 = strArr[0];
        f fVar = new f();
        fVar.f67624b = this;
        fVar.f67623a = strArr;
        sdkTapOnPhoneVierge2.executeZ13Command(str, str2, str3, fVar);
    }

    public static String generateSerialNumber() {
        String string = Settings.Secure.getString(SdkTapOnPhoneVierge.getContext().getContentResolver(), "android_id");
        "AndroidID : ".concat(String.valueOf(string));
        String strSubstring = "";
        if (string == null || string.isEmpty()) {
            String modelDevice = getModelDevice();
            String strSubstring2 = modelDevice.length() > 6 ? modelDevice.replaceAll("[^a-zA-Z0-9]", "").substring(0, 6) : padLeft2(modelDevice, 6);
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(strSubstring2);
            String string2 = sb2.toString();
            "model: ".concat(String.valueOf(strSubstring2));
            "serialNumber: ".concat("");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(String.valueOf(getScreenHeight(SdkTapOnPhoneVierge.getContext())));
            sb3.append(String.valueOf(getScreenWidth(SdkTapOnPhoneVierge.getContext())));
            String string3 = sb3.toString();
            "dimensScreen: ".concat(String.valueOf(string3));
            String strSubstring3 = string3.length() > 6 ? string3.substring(0, 6) : padLeft2(string3, 6);
            "dimensScreen: ".concat(String.valueOf(strSubstring3));
            "serialNumber: ".concat(String.valueOf(string2));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string2);
            sb4.append(strSubstring3);
            String string4 = sb4.toString();
            String strReplace = new SimpleDateFormat("HH:mm:ss:SSS").format(new Date()).replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, "");
            String strSubstring4 = strReplace.length() > 8 ? strReplace.substring(0, 8) : padLeft2(strReplace, 8);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string4);
            sb5.append(strSubstring4);
            String string5 = sb5.toString();
            "horaActualConMilisegundos: ".concat(String.valueOf(strSubstring4));
            "serialNumberByCharacteristicPhone: ".concat(String.valueOf(string5));
            strSubstring = string5.substring(-8);
            "serialNumber: ".concat(String.valueOf(strSubstring));
        } else if (string.length() >= 8) {
            strSubstring = string.substring(string.length() - 8);
        }
        "final serial number: ".concat(String.valueOf(strSubstring));
        return strSubstring;
    }

    private double getAmount(String str) {
        double dCharAt = 0.0d;
        for (int i10 = 0; i10 < str.length(); i10++) {
            dCharAt = (dCharAt * 10.0d) + ((double) (str.charAt(i10) - '0'));
        }
        return dCharAt / 100.0d;
    }

    public static String getModelDevice() {
        return Build.MODEL;
    }

    public static int getScreenHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int getScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static PinPadSdk getSelfInstance(Context context, ICallbackListeners iCallbackListeners) {
        if (selfInstance == null) {
            selfInstance = new PinPadSdk(context, iCallbackListeners);
        }
        return selfInstance;
    }

    private String getTypeCard(Map<String, String> map) {
        String str = map.get(EglobalUtils.DEDICATED_FILE_NAME);
        return str == null ? "" : str;
    }

    private String hexToString(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < str.length()) {
            int i11 = i10 + 2;
            sb2.append((char) Integer.parseInt(str.substring(i10, i11), 16));
            i10 = i11;
        }
        return sb2.toString();
    }

    private static void initializeTags() {
        tags.add(EglobalUtils.KEY_DERIVATION_FAILED_TIMEOUT);
        tags.add("41");
        tags.add(RoomMasterTable.DEFAULT_ID);
        tags.add("43");
        tags.add("44");
        tags.add("45");
        tags.add("46");
        tags.add("47");
        tags.add("48");
        tags.add("4D");
        tags.add(EglobalUtils.DEDICATED_FILE_NAME);
        tags.add("50");
        tags.add("51");
        tags.add("52");
        tags.add("53");
        tags.add("56");
        tags.add("57");
        tags.add("57");
        tags.add(StandInHeaderInterceptor.AUTHTYPE58);
        tags.add("59");
        tags.add("5A");
        tags.add("5B");
        tags.add("5C");
        tags.add("5D");
        tags.add("5E");
        tags.add("5F20");
        tags.add("5F21");
        tags.add("5F22");
        tags.add("5F23");
        tags.add("5F24");
        tags.add("5F25");
        tags.add("5F26");
        tags.add("5F27");
        tags.add("5F28");
        tags.add("5F29");
        tags.add("5F2A");
        tags.add("5F2B");
        tags.add("5F2C");
        tags.add("5F2D");
        tags.add("5F2E");
        tags.add("5F2F");
        tags.add("5F30");
        tags.add("5F32");
        tags.add("5F33");
        tags.add(EglobalUtils.SEQUENCE_COUNTER);
        tags.add("5F35");
        tags.add("5F36");
        tags.add("5F36");
        tags.add("5F37");
        tags.add("5F38");
        tags.add("5F39");
        tags.add("5F3A");
        tags.add("5F3B");
        tags.add("5F3C");
        tags.add("5F3D");
        tags.add("5F40");
        tags.add("5F41");
        tags.add("5F42");
        tags.add("5F43");
        tags.add("5F44");
        tags.add("5F45");
        tags.add("5F46");
        tags.add("5F47");
        tags.add("5F48");
        tags.add("5F49");
        tags.add("5F4A");
        tags.add("5F4B");
        tags.add("5F4C");
        tags.add("5F4D");
        tags.add("5F4E");
        tags.add("5F50");
        tags.add("5F53");
        tags.add("5F54");
        tags.add("5F55");
        tags.add("5F56");
        tags.add("5F57");
        tags.add("60");
        tags.add("6080");
        tags.add("6081");
        tags.add("6082");
        tags.add("6083");
        tags.add("6084");
        tags.add("6085");
        tags.add("60A0");
        tags.add(EglobalUtils.INITIALIZED_KEYS_WRONG_COMMAND);
        tags.add(EglobalUtils.NOT_INIT_KEYS);
        tags.add("6280");
        tags.add("6281");
        tags.add("6282");
        tags.add("6283");
        tags.add("6284");
        tags.add("6285");
        tags.add("6286");
        tags.add("6287");
        tags.add("6288");
        tags.add("628A");
        tags.add("628B");
        tags.add("628C");
        tags.add("628D");
        tags.add("62A0");
        tags.add("62A1");
        tags.add("62A2");
        tags.add("62A5");
        tags.add("62AB");
        tags.add("62AC");
        tags.add(EglobalUtils.READ_CARD_ERROR);
        tags.add("64");
        tags.add(EglobalUtils.DOUBLE_AUTH_MC_CODE);
        tags.add("66");
        tags.add("67");
        tags.add(AsoResponse.ERROR_CODE_TSEC_TIME_OUT);
        tags.add("6A");
        tags.add("6A80");
        tags.add("6A81");
        tags.add("6A82");
        tags.add("6A83");
        tags.add("6A84");
        tags.add("6B");
        tags.add("6B06");
        tags.add("6B80");
        tags.add("6BA0");
        tags.add("6C");
        tags.add("6D");
        tags.add("6E");
        tags.add("6F");
        tags.add("6FA5");
        tags.add("70");
        tags.add(TypeScript.script71);
        tags.add("7186");
        tags.add("72");
        tags.add(EglobalUtils.INTERNAL_ERROR);
        tags.add("77");
        tags.add("78");
        tags.add("79");
        tags.add("7A");
        tags.add("7A80");
        tags.add("7A81");
        tags.add("7A82");
        tags.add("7A83");
        tags.add("7A84");
        tags.add("7A85");
        tags.add("7A86");
        tags.add("7A87");
        tags.add("7A88");
        tags.add("7A89");
        tags.add("7A8A");
        tags.add("7A8B");
        tags.add("7A8C");
        tags.add("7A8D");
        tags.add("7A8E");
        tags.add("7A93");
        tags.add("7B");
        tags.add("7B80");
        tags.add("7B8A");
        tags.add("7BAC");
        tags.add("7BA4");
        tags.add("7BAA");
        tags.add("7BB4");
        tags.add("7BB6");
        tags.add("7BB8");
        tags.add("7D");
        tags.add("7D80");
        tags.add("7D81");
        tags.add("7D82");
        tags.add("7D83");
        tags.add("7D84");
        tags.add("7D85");
        tags.add("7D86");
        tags.add("7D87");
        tags.add("7D8E");
        tags.add("7D90");
        tags.add("7D91");
        tags.add("7D92");
        tags.add("7D93");
        tags.add("7D94");
        tags.add("7D95");
        tags.add("7D96");
        tags.add("7D97");
        tags.add("7D99");
        tags.add("7D9A");
        tags.add("7D9B");
        tags.add("7D9C");
        tags.add("7D9D");
        tags.add("7D9E");
        tags.add("7DA0");
        tags.add("7DA1");
        tags.add("7DA2");
        tags.add("7DA4");
        tags.add("7DA5");
        tags.add("7DA8");
        tags.add("7DAA");
        tags.add("7DAB");
        tags.add("7DAC");
        tags.add("7DAD");
        tags.add("7DAE");
        tags.add("7DAF");
        tags.add("7DB0");
        tags.add("7DB1");
        tags.add("7DB2");
        tags.add("7DB3");
        tags.add("7DB4");
        tags.add("7DB5");
        tags.add("7DB6");
        tags.add("7DB7");
        tags.add("7DB8");
        tags.add("7DB9");
        tags.add("7DBA");
        tags.add("7DBB");
        tags.add("7DBC");
        tags.add("7DBD");
        tags.add("7DBE");
        tags.add("7E");
        tags.add("7F20");
        tags.add("7F21");
        tags.add("7F2E");
        tags.add("7F49");
        tags.add("7F4C");
        tags.add("7F4E");
        tags.add("7F60");
        tags.add("80");
        tags.add(NumberOfScript.scriptFirstPart);
        tags.add(EglobalUtils.INTERCHANGE_PROFILE);
        tags.add("83");
        tags.add(EglobalUtils.DEDICATED_FILE_NAME_E_GLOBAL);
        tags.add("86");
        tags.add("87");
        tags.add("88");
        tags.add("89");
        tags.add("8A");
        tags.add(ReadRecord.CDOL_TAG);
        tags.add("8D");
        tags.add("8E");
        tags.add("8F");
        tags.add(EglobalUtils.READ_MODE_MAGNETIC_STRIPE);
        tags.add("91");
        tags.add("92");
        tags.add("93");
        tags.add("94");
        tags.add("95");
        tags.add(EglobalUtils.NFC_DISABLE);
        tags.add("98");
        tags.add("99");
        tags.add("9A");
        tags.add("9B");
        tags.add("9C");
        tags.add("9D");
        tags.add("9F01");
        tags.add("9F02");
        tags.add("9F03");
        tags.add("9F04");
        tags.add("9F05");
        tags.add("9F06");
        tags.add("9F07");
        tags.add("9F08");
        tags.add(EglobalUtils.VERSION_NUMBER);
        tags.add("9F0B");
        tags.add("9F0D");
        tags.add("9F0E");
        tags.add("9F0F");
        tags.add(EglobalUtils.ISSUER_APPLICATION_DATA);
        tags.add("9F11");
        tags.add(EglobalUtils.APPLICATION_PREFERRED_NAME);
        tags.add("9F13");
        tags.add("9F14");
        tags.add(ComputeCcCommandApdu.MERCHANT_CATEGORY_CODE_TAG);
        tags.add("9F16");
        tags.add("9F17");
        tags.add("9F18");
        tags.add("9F19");
        tags.add("9F1A");
        tags.add("9F1B");
        tags.add("9F1C");
        tags.add("9F1D");
        tags.add(EglobalUtils.INTERFACE_DEVICE);
        tags.add("9F1F");
        tags.add("9F20");
        tags.add("9F21");
        tags.add("9F22");
        tags.add("9F23");
        tags.add("9F24");
        tags.add(EglobalUtils.CRYPTOGRAM);
        tags.add(EglobalUtils.CRYPTO_INFO);
        tags.add("9F29");
        tags.add("9F2A");
        tags.add("9F2D");
        tags.add("9F2E");
        tags.add("9F2F");
        tags.add("9F32");
        tags.add(EglobalUtils.CAPABILITIES);
        tags.add(EglobalUtils.CARD_HOLDER_VERIFICATION);
        tags.add("9F35");
        tags.add(EglobalUtils.TRANSACTION_COUNTER);
        tags.add("9F37");
        tags.add("9F38");
        tags.add("9F39");
        tags.add("9F3A");
        tags.add("9F3B");
        tags.add("9F3C");
        tags.add("9F3D");
        tags.add("9F40");
        tags.add(EglobalUtils.SEQUENCE_NUMBER);
        tags.add("9F42");
        tags.add("9F43");
        tags.add("9F44");
        tags.add("9F45");
        tags.add("9F46");
        tags.add("9F47");
        tags.add("9F48");
        tags.add("9F49");
        tags.add("9F4A");
        tags.add("9F4B");
        tags.add("9F4C");
        tags.add("9F4D");
        tags.add("9F4E");
        tags.add("9F4F");
        tags.add("9F50");
        tags.add("9F51");
        tags.add("9F52");
        tags.add(EglobalUtils.TRANSACTION_CATEGORY_CODE);
        tags.add("9F54");
        tags.add("9F55");
        tags.add("9F56");
        tags.add("9F57");
        tags.add("9F58");
        tags.add("9F59");
        tags.add("9F5A");
        tags.add(EglobalUtils.ISSUER_SCRIPT_RESULT);
        tags.add("9F5C");
        tags.add("9F5D");
        tags.add("9F5E");
        tags.add("9F5F");
        tags.add("9F60");
        tags.add("9F61");
        tags.add("9F62");
        tags.add("9F63");
        tags.add("9F64");
        tags.add("9F65");
        tags.add("9F66");
        tags.add("9F67");
        tags.add("9F68");
        tags.add("9F69");
        tags.add(ComputeCcCommandApdu.UNPREDICTABLE_NUMBER_TAG);
        tags.add("9F6B");
        tags.add("9F6C");
        tags.add("9F6D");
        tags.add(EglobalUtils.FORM_FACTOR_INDICATOR);
        tags.add("9F6F");
        tags.add("9F70");
        tags.add("9F71");
        tags.add("9F72");
        tags.add("9F73");
        tags.add("9F74");
        tags.add("9F75");
        tags.add("9F76");
        tags.add("9F77");
        tags.add("9F78");
        tags.add("9F79");
        tags.add("9F7A");
        tags.add("9F7B");
        tags.add("9F7C");
        tags.add("9F7D");
        tags.add("9F7E");
        tags.add("9F7F");
        tags.add("A5");
        tags.add("BF0C");
        tags.add("BF50");
        tags.add("BF60");
        tags.add("C3");
        tags.add(LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BRANCH);
        tags.add("C5");
        tags.add("C6");
        tags.add("C7");
        tags.add("C8");
        tags.add("C9");
        tags.add("CA");
        tags.add("CB");
        tags.add("CD");
        tags.add("CE");
        tags.add("CF");
        tags.add("D1");
        tags.add("D2");
        tags.add("D3");
        tags.add("D5");
        tags.add("D6");
        tags.add("D7");
        tags.add("D8");
        tags.add("D9");
        tags.add("DA");
        tags.add("DB");
        tags.add("DC");
        tags.add("DD");
        tags.add("DF01");
        tags.add("DF02");
        tags.add("DF03");
        tags.add("DF04");
        tags.add("DF05");
        tags.add("DF06");
        tags.add("DF07");
        tags.add("DF08");
        tags.add("DF09");
        tags.add("DF0B");
        tags.add("DF0C");
        tags.add("DF0D");
        tags.add("DF0E");
        tags.add("DF0F");
        tags.add("DF12");
        tags.add("DF13");
        tags.add("DF14");
        tags.add("DF15");
        tags.add("DF16");
        tags.add("DF17");
        tags.add("DF18");
        tags.add("DF20");
        tags.add("DF21");
        tags.add("DF22");
        tags.add("DF23");
        tags.add("DF24");
        tags.add("DF25");
        tags.add("DF26");
        tags.add("DF40");
        tags.add("DF41");
        tags.add("DF42");
        tags.add("DF43");
        tags.add("DF44");
        tags.add("DF47");
        tags.add("DF48");
        tags.add("DF49");
        tags.add("DF4A");
        tags.add("DF4B");
        tags.add("DF51");
        tags.add("DF52");
        tags.add("DF53");
        tags.add("DF54");
        tags.add("DF55");
        tags.add("DF56");
        tags.add("DF57");
        tags.add("DF60");
        tags.add("DF61");
        tags.add("DF62");
        tags.add("DF63");
        tags.add("DF64");
        tags.add("DF65");
        tags.add("DF6B");
        tags.add("DF79");
        tags.add("FF60");
        tags.add("FF62");
        tags.add("FF63");
    }

    private boolean isAmex(int i10) {
        return (i10 >= 340000 && i10 <= 349999) || (i10 >= 370000 && i10 <= 379999);
    }

    public static boolean isApplicationInitAllowed() {
        return SdkTapOnPhoneVierge.isApplicationInitAllowed();
    }

    private boolean isValidCombinationKeysIds(String str, String str2) {
        boolean z10 = true;
        boolean z11 = (str.isEmpty() && str2.isEmpty()) ? false : true;
        if (!str.isEmpty() && !str.equals(CommandConstants.C51_KEY_NAME1) && !str.equals("A000OPFT48") && !str.equals("BCMER001") && !str.equals("OPENPRIVAD") && !str.equals("DOUBLEENCR")) {
            z11 = false;
        }
        if (!str2.isEmpty() && !str2.equals(CommandConstants.C51_KEY_NAME1) && !str2.equals("A000OPFT48") && !str2.equals("BCMER001") && !str2.equals("OPENPRIVAD") && !str2.equals("DOUBLEENCR")) {
            z11 = false;
        }
        boolean z12 = str.equals("A000OPFT48") || str.equals("BCMER001");
        if (!str2.equals("A000OPFT48") && !str2.equals("BCMER001")) {
            z10 = false;
        }
        boolean zEquals = str.equals("DOUBLEENCR");
        boolean zEquals2 = str2.equals("DOUBLEENCR");
        if (z12 && zEquals2) {
            return false;
        }
        if (zEquals && z10) {
            return false;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeCommandI51$0(BackendViergeResponseData backendViergeResponseData) {
        Response response;
        if (backendViergeResponseData.getF67869a() == 0) {
            response = new Response(STATUS.messageWasSuccessful);
        } else {
            backendViergeResponseData.getF67869a();
            backendViergeResponseData.getF67873b();
            if (backendViergeResponseData.getF67873b().equals("ERROR EN CONEXIÓN DE RED")) {
                response = new Response(STATUS.errorNetworkConnection);
            } else if (backendViergeResponseData.getF67873b().equals("FALLO DEL ESTADO DEL DISPOSITIVO")) {
                response = new Response(STATUS.errorDeviceStateFailure);
            } else {
                response = backendViergeResponseData.getF67873b().equals("VERSION DEL SISTEMA OPERATIVO ANDROID NO SOPORTADO") ? new Response(STATUS.errorUnsupportedAndroidOsVersion) : new Response(STATUS.errorInternal);
            }
        }
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_I51);
        _broadcastResponse(response2);
    }

    private static String padLeft2(String str, int i10) {
        StringBuilder sb2 = new StringBuilder("%");
        sb2.append(i10);
        sb2.append("s");
        return String.format(sb2.toString(), str).replace(' ', '0');
    }

    private String padLeftSpaces(String str, int i10) {
        StringBuilder sb2 = new StringBuilder("%");
        sb2.append(i10);
        sb2.append("s");
        return String.format(sb2.toString(), str).replace(' ', ' ');
    }

    private String padRightSpaces(String str, int i10) {
        StringBuilder sb2 = new StringBuilder("%-");
        sb2.append(i10);
        sb2.append("s");
        return String.format(sb2.toString(), str).replace(' ', ' ');
    }

    public static byte[] stringToBCD(String str) {
        if (str.length() % 2 != 0) {
            str = "0".concat(str);
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < str.length(); i10 += 2) {
            bArr[i10 / 2] = (byte) ((((byte) (str.charAt(i10) - '0')) << 4) | ((byte) (str.charAt(i10 + 1) - '0')));
        }
        return bArr;
    }

    private String validParameters(String[] strArr) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        String str5 = strArr[4];
        String str6 = strArr[5];
        String str7 = strArr[6];
        String str8 = strArr[7];
        String str9 = strArr[8];
        String upperCase = str5.toUpperCase();
        String upperCase2 = strArr[5].toUpperCase();
        String str10 = strArr[6];
        String str11 = strArr[7];
        String str12 = strArr[8];
        if (str2.isEmpty()) {
            return "Amount is empty";
        }
        if (!checkAmount(str2)) {
            return "Amount out of range";
        }
        tags.size();
        if (!checkTlvDataFormat(str4.toUpperCase())) {
            return "invalid format in tag list";
        }
        if (!isValidCombinationKeysIds(upperCase, upperCase2)) {
            return "";
        }
        if (str11.length() > 100) {
            return "OrderID out of range";
        }
        return str12.length() > 45 ? "MerchantID out of range" : "NoError";
    }

    private boolean validParametersC54(String[] strArr) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        String str5 = strArr[4];
        boolean z10 = (str == null || str.isEmpty()) ? false : true;
        Map<String, String> map = MapTagsCopy;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return z10;
    }

    public void _broadcastResponse(JsonObject jsonObject) {
        String string = jsonObject.toString();
        "objeto respuesta: ".concat(String.valueOf(string));
        ICallbackListeners iCallbackListeners = this.callback;
        if (iCallbackListeners != null) {
            iCallbackListeners.listenerResponseCommand(string);
        }
    }

    public JsonObject buildErrorZ12Error(Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z12);
        return response2;
    }

    public JsonObject buildErrorZ13Error(Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z13);
        return response2;
    }

    public JsonObject buildObjectC51ErrorResponse(Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_C51);
        return response2;
    }

    public JsonObject buildObjectC51OkResponse(SearchTxnResponseOpenPay searchTxnResponseOpenPay, String str) {
        "amount: ".concat(String.valueOf(str));
        String cardNumber = searchTxnResponseOpenPay.getTransactionDto().getCardNumber();
        String strSubstring = cardNumber != null ? cardNumber.substring(Math.max(0, cardNumber.length() - 6)) : "";
        String str2 = searchTxnResponseOpenPay.getTransactionDto().getEmvTagsMap().get("5F20");
        String strHexToString = str2 != null ? hexToString(str2) : "";
        String cardBin = searchTxnResponseOpenPay.getTransactionDto().getCardBin();
        String tokenOpenPay = searchTxnResponseOpenPay.getTransactionDto().getTokenOpenPay();
        String cvv = searchTxnResponseOpenPay.getTransactionDto().getCvv();
        String pointOfServiceEntryModeCode = searchTxnResponseOpenPay.getTransactionDto().getPointOfServiceEntryModeCode();
        Map<String, String> emvTagsMap = searchTxnResponseOpenPay.getTransactionDto().getEmvTagsMap();
        String strBuildE1List = buildE1List(emvTagsMap);
        String strBuildE2List = buildE2List(emvTagsMap, str, cardBin);
        Map<String, String> map = MapTagsCopy;
        if (map != null && map.size() > 0) {
            MapTagsCopy.clear();
        }
        MapTagsCopy = emvTagsMap;
        JsonObject response = new Response(STATUS.contactless).getResponse();
        response.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_C51);
        response.addProperty("res_proc", "00");
        response.addProperty(GoogleTapAndPay.KEY_PAN, strSubstring);
        response.addProperty("cardholder", strHexToString);
        response.addProperty("cardbin", cardBin);
        response.addProperty("track3", "");
        response.addProperty(EglobalUtils.TRACK2, tokenOpenPay);
        response.addProperty("track1", "");
        response.addProperty("ccv", cvv);
        response.addProperty("read_mode", pointOfServiceEntryModeCode.substring(0, Math.max(0, pointOfServiceEntryModeCode.length() - 1)));
        response.addProperty("e1", strBuildE1List);
        response.addProperty("e2", strBuildE2List);
        response.addProperty("serial", this.serialNumberTest);
        response.addProperty("version", getVersionNumber());
        response.addProperty("pinstatus", "00");
        response.addProperty("modelo", getModelDevice());
        response.addProperty("tokenES", buildTokenES(searchTxnResponseOpenPay.getTransactionDto().getFlagRequestNewKey()));
        String tokenEZ = searchTxnResponseOpenPay.getTransactionDto().getTokenEZ();
        String str3 = "! EZ00000 ";
        if (tokenEZ == null || tokenEZ.isEmpty()) {
            tokenEZ = "! EZ00000 ";
        }
        response.addProperty("tokenEZ", tokenEZ);
        response.addProperty("tokenEY", "! EY00000 ");
        String tokenEZ2 = searchTxnResponseOpenPay.getTransactionDto().getTokenEZ2();
        if (tokenEZ2 != null && !tokenEZ2.isEmpty()) {
            str3 = tokenEZ2;
        }
        String strBuildTokenCZ = buildTokenCZ(searchTxnResponseOpenPay.getTransactionDto().getEmvTagsMap().get(EglobalUtils.TRANSACTION_COUNTER) != null ? searchTxnResponseOpenPay.getTransactionDto().getEmvTagsMap().get(EglobalUtils.TRANSACTION_COUNTER) : "", searchTxnResponseOpenPay.getTransactionDto().getEmvTagsMap().get(EglobalUtils.FORM_FACTOR_INDICATOR) != null ? searchTxnResponseOpenPay.getTransactionDto().getEmvTagsMap().get(EglobalUtils.FORM_FACTOR_INDICATOR) : "", cardBin);
        response.addProperty("tokenEZ2", str3);
        response.addProperty("tokenEY2", "! EY00000 ");
        response.addProperty("tokenCZ", strBuildTokenCZ);
        response.addProperty("keyStatus", searchTxnResponseOpenPay.getTransactionDto().getFlagRequestNewKey());
        return response;
    }

    public JsonObject buildObjectZ10Error(Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z10);
        return response2;
    }

    public JsonObject buildObjectZ11Error(Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z11);
        return response2;
    }

    public JsonObject buildObjectZ11OkResponse(Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z11);
        return response2;
    }

    public JsonObject buildObjetZ10OkResponse(String str, String str2, Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z10);
        response2.addProperty("tokenew", str);
        response2.addProperty("tokenes", str2);
        response2.addProperty("app_ver", getVersionNumber());
        response2.addProperty("serial", this.serialNumberTest);
        response2.addProperty("modelo", getModelDevice());
        return response2;
    }

    public String buildTokenES(String str) {
        StringBuilder sb2 = new StringBuilder("VGMTTPv");
        sb2.append(getVersionNumber().replace(Constant.DOT_STRING, PushConstants.GE_PARAMS_SEPARATOR));
        String strPadRightSpaces = padRightSpaces(sb2.toString(), 20);
        String strPadLeft2 = padLeft2(this.serialNumberTest, 20);
        StringBuilder sb3 = new StringBuilder("! ES00060 ");
        sb3.append(strPadRightSpaces);
        sb3.append(strPadLeft2);
        sb3.append("5000000000000000000");
        sb3.append(str);
        String string = sb3.toString();
        string.length();
        return string.length() != 70 ? "Error" : string;
    }

    public JsonObject buildZ12Response(Response response) {
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z12);
        return response2;
    }

    public JsonObject buildZ13Response(Response response, String str) {
        String hash = response.getHash();
        String str2 = response.getkcv();
        if (hash == null) {
            hash = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        JsonObject response2 = response.getResponse();
        response2.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z13);
        if (str.equalsIgnoreCase("Openpublic") || str.equalsIgnoreCase("Openprivad")) {
            response2.addProperty("hashrsapub", hash);
            response2.addProperty("hashrsapri", str2);
        } else {
            response2.addProperty("hash_rsa", hash);
            response2.addProperty("working_kcv", str2);
        }
        return response2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:77:0x0155  */
    public void executeCommand(String str, String[] strArr, boolean z10) {
        byte b10;
        String str2;
        Boolean devServerFlag = DBUtils.getDevServerFlag();
        "Valor Devflag de la base de datos: ".concat(String.valueOf(devServerFlag));
        if (this.debug) {
            "[AndroidLibrary.executeCommand()] Ejecutando comando : ".concat(String.valueOf(str));
        }
        _logDataSession("[AndroidLibrary.executeCommand()] Ejecutando comando : ".concat(String.valueOf(str)));
        if (z10) {
            MessageResponse messageResponse = new MessageResponse();
            this.receivedMessage = messageResponse;
            messageResponse.setDebug(false);
            this.receivedMessage.setCommandString(str);
        }
        new JsonObject();
        this.receivedMessage.setTypeMessage(2);
        new MessageSend();
        if (this.serialNumberTest.isEmpty()) {
            String serialNumber = DBUtils.getSerialNumber();
            if (serialNumber.isEmpty()) {
                String strGenerateSerialNumber = generateSerialNumber();
                this.serialNumberTest = strGenerateSerialNumber;
                DBUtils.updateSerialNumber(strGenerateSerialNumber);
            } else {
                this.serialNumberTest = serialNumber;
            }
        }
        switch (str.hashCode()) {
            case 1755:
                if (!str.equals("72")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 2567:
                if (!str.equals(CommandConstants.COMMAND_Q8)) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 2568:
                if (!str.equals("Q9")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 2840:
                if (!str.equals(CommandConstants.COMMAND_Z2)) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 2841:
                if (!str.equals("Z3")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 64617:
                if (!str.equals(CommandConstants.COMMAND_ACK)) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case 66078:
                if (!str.equals("C50")) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case 66079:
                if (!str.equals(CommandConstants.COMMAND_C51)) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 66082:
                if (!str.equals(CommandConstants.COMMAND_C54)) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 66083:
                if (!str.equals("C55")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 66084:
                if (!str.equals("C56")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 68842:
                if (!str.equals("EOT")) {
                    b10 = -1;
                } else {
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                }
                break;
            case 71845:
                if (!str.equals(CommandConstants.COMMAND_I51)) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 77048:
                if (!str.equals("NAK")) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case 88057:
                if (!str.equals(CommandConstants.COMMAND_Z10)) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 88058:
                if (!str.equals(CommandConstants.COMMAND_Z11)) {
                    b10 = -1;
                } else {
                    b10 = 18;
                }
                break;
            case 88059:
                if (!str.equals(CommandConstants.COMMAND_Z12)) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 88060:
                if (!str.equals(CommandConstants.COMMAND_Z13)) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 2541522:
                if (!str.equals("SEQ1")) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case 2541523:
                if (!str.equals("SEQ2")) {
                    b10 = -1;
                } else {
                    b10 = 16;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 2) {
            executeCommandQ8();
            return;
        }
        if (b10 == 4) {
            executeCommand72();
            return;
        }
        if (b10 == 5) {
            Boolean bool = (strArr.length == 0 || (str2 = strArr[0]) == null || !str2.equalsIgnoreCase("true")) ? Boolean.FALSE : Boolean.TRUE;
            DBUtils.updateDevServerFlag(bool);
            executeCommandI51();
            return;
        }
        if (b10 == 6) {
            String.valueOf(strArr.length);
            executeCommandC51(strArr);
            return;
        }
        if (b10 == 7) {
            executeCommandC54(strArr);
            return;
        }
        if (b10 == 10) {
            "devServerFlag: ".concat(String.valueOf(devServerFlag));
            if (devServerFlag.booleanValue()) {
                executeCommandZ12("OpenPayDev", this.serialNumberTest, strArr);
                return;
            } else {
                executeCommandZ12("OpenPayProd", this.serialNumberTest, strArr);
                return;
            }
        }
        if (b10 == 11) {
            "devServerFlag: ".concat(String.valueOf(devServerFlag));
            if (devServerFlag.booleanValue()) {
                executeCommandZ13("OpenPayDev", this.serialNumberTest, strArr);
                return;
            } else {
                executeCommandZ13("OpenPayProd", this.serialNumberTest, strArr);
                return;
            }
        }
        if (b10 == 17) {
            "devServerFlag: ".concat(String.valueOf(devServerFlag));
            if (devServerFlag.booleanValue()) {
                executeCommandZ10("OpenPayDev", "Retail", this.serialNumberTest, strArr);
                return;
            } else {
                executeCommandZ10("OpenPayProd", "Retail", this.serialNumberTest, strArr);
                return;
            }
        }
        if (b10 != 18) {
            buildErrorCommandUnknown();
            return;
        }
        "devServerFlag: ".concat(String.valueOf(devServerFlag));
        if (devServerFlag.booleanValue()) {
            executeCommandZ11("OpenPayDev", "Retail", this.serialNumberTest, strArr);
        } else {
            executeCommandZ11("OpenPayProd", "Retail", this.serialNumberTest, strArr);
        }
    }

    public String getVersion() {
        return "PinPad Android Library - Version 1.0.32E (14/03/2025)";
    }

    public String getVersionNumber() {
        return "1.0.32E";
    }

    public void listenerSerialResponse(short[] sArr) {
        if (this.receivedMessage == null) {
            return;
        }
        Thread thread = this.myTimer;
        if (thread != null) {
            thread.interrupt();
            this.myTimer = null;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
        }
        if (this.receivedMessage.getType() != 1) {
            if (this.debug) {
                this.receivedMessage.getCode();
            }
            _procesaMensajeCompuesto();
            return;
        }
        if (this.debug) {
            this.receivedMessage.getCode();
        }
        MessageResponse messageResponse = this.receivedMessage;
        _logDataReceive(messageResponse.getShortArray(messageResponse.getList()));
        if (this.receivedMessage.isOK()) {
            return;
        }
        _broadcastResponseError(99);
    }

    public PinPadSdk(Context context, ICallbackListeners iCallbackListeners) {
        this.callback = iCallbackListeners;
        sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.getSelfInstance(context);
    }
}
