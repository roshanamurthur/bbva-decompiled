package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vierge.pinpadsdk.script.NumberOfScript;
import com.vierge.pinpadsdk.script.TypeScript;
import java.util.Map;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes7.dex */
public class Response {
    protected int RESPONSE_ERROR;
    protected int RESPONSE_SUCCESS;
    protected int codResponse;
    protected String hash;
    protected String kcv;
    protected String msg;
    protected String status;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67777a;

        static {
            int[] iArr = new int[STATUS.values().length];
            f67777a = iArr;
            try {
                iArr[STATUS.messageWasSuccessful.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67777a[STATUS.ErrorMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67777a[STATUS.invalidData.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67777a[STATUS.timeout.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67777a[STATUS.contactless.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67777a[STATUS.cardRemoved.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67777a[STATUS.cardNotSuppoted.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67777a[STATUS.invalidApplication.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f67777a[STATUS.cardExpired.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f67777a[STATUS.wrongDate.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f67777a[STATUS.wrongCheckValue.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f67777a[STATUS.wrongKeys.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f67777a[STATUS.wrongCryptoHSM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f67777a[STATUS.encryptionLimitExceeded.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f67777a[STATUS.wrongCommand.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f67777a[STATUS.initializedKeysWrongCommand.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f67777a[STATUS.notInitKeys.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f67777a[STATUS.readCardError.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f67777a[STATUS.cardDoesNotMatchStartAgain.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f67777a[STATUS.incorrectDataForEncryption.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f67777a[STATUS.sdkIntanceMissing.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f67777a[STATUS.errorNetworkConnection.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f67777a[STATUS.errorDeviceStateFailure.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f67777a[STATUS.errorInternal.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f67777a[STATUS.errorUnsupportedAndroidOsVersion.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f67777a[STATUS.errorInitializedInstance.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f67777a[STATUS.paperlessPrinter.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f67777a[STATUS.otherPrinterProblem.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f67777a[STATUS.printerParametersNotConfigured.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f67777a[STATUS.lastTransactionIsNotRegistered.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f67777a[STATUS.printerVoltageIsTooLow.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f67777a[STATUS.printerisbusy.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f67777a[STATUS.theformatofprintdatapacketerror.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f67777a[STATUS.printermalfunctions.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f67777a[STATUS.printeroverheats.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f67777a[STATUS.printingisunfinished.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f67777a[STATUS.cutjamerror.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f67777a[STATUS.coveropenerror.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f67777a[STATUS.theprinterhasnotinstalledfontlibrary.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f67777a[STATUS.datapackageistoolong.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f67777a[STATUS.errornopermission.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f67777a[STATUS.printerdisabled.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f67777a[STATUS.noNFC.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f67777a[STATUS.NFCDisabled.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f67777a[STATUS.NFCEnabled.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f67777a[STATUS.errorNotDefinedCancelFromPinPad.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f67777a[STATUS.fingerRetvalNotOpen.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f67777a[STATUS.fingerRetvalTypeError.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f67777a[STATUS.fingerRetvalDeviceBusy.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f67777a[STATUS.fingerRetvalCapetureError.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
        }
    }

    public Response() {
        this.RESPONSE_SUCCESS = 0;
        this.RESPONSE_ERROR = -1;
        this.hash = "";
        this.kcv = "";
        this.msg = "";
    }

    public JsonObject _mergeResponse(JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObject3 = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            jsonObject3.add(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, JsonElement> entry2 : jsonObject2.entrySet()) {
            jsonObject3.add(entry2.getKey(), entry2.getValue());
        }
        return jsonObject3;
    }

    public String getHash() {
        return this.hash;
    }

    public JsonObject getResponse() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("codResponse", Integer.valueOf(this.codResponse));
        jsonObject.addProperty("status", this.status);
        jsonObject.addProperty(NotificationCompat.CATEGORY_MESSAGE, this.msg);
        return jsonObject;
    }

    public String getkcv() {
        return this.kcv;
    }

    public void setErrorMgs(String str) {
        this.msg = str;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public void setkcv(String str) {
        this.kcv = str;
    }

    public JsonObject getResponse(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("codResponse", Integer.valueOf(this.codResponse));
        jsonObject2.addProperty("status", this.status);
        jsonObject2.addProperty(NotificationCompat.CATEGORY_MESSAGE, this.msg);
        return _mergeResponse(jsonObject2, jsonObject);
    }

    public Response(STATUS status) {
        this.RESPONSE_SUCCESS = 0;
        this.RESPONSE_ERROR = -1;
        this.hash = "";
        this.kcv = "";
        this.msg = "";
        switch (a.f67777a[status.ordinal()]) {
            case 1:
                this.codResponse = 0;
                this.status = "00";
                this.msg = "Message was successful";
                break;
            case 2:
                this.codResponse = -1;
                this.status = "01";
                this.msg = "Error message";
                break;
            case 3:
                this.codResponse = -1;
                this.status = "02";
                this.msg = "Invalid data";
                break;
            case 4:
                this.codResponse = -1;
                this.status = EglobalUtils.KEY_DERIVATION_FAILED_TIMEOUT;
                this.msg = "Time out";
                break;
            case 5:
                this.codResponse = 0;
                this.status = "22";
                this.msg = "Contactless";
                break;
            case 6:
                this.codResponse = -1;
                this.status = EglobalUtils.CARD_REMOVED;
                this.msg = "Card removed";
                break;
            case 7:
                this.codResponse = -1;
                this.status = "25";
                this.msg = "Card not supported";
                break;
            case 8:
                this.codResponse = -1;
                this.status = "26";
                this.msg = "Invalid application";
                break;
            case 9:
                this.codResponse = -1;
                this.status = EglobalUtils.CARD_EXPIRED;
                this.msg = "Card expired";
                break;
            case 10:
                this.codResponse = -1;
                this.status = "30";
                this.msg = "Wrong date";
                break;
            case 11:
                this.codResponse = -1;
                this.status = "51";
                this.msg = "Wrong check value";
                break;
            case 12:
                this.codResponse = -1;
                this.status = "52";
                this.msg = "Wrong keys";
                break;
            case 13:
                this.codResponse = -1;
                this.status = "53";
                this.msg = "Wrong crypto HSM";
                break;
            case 14:
                this.codResponse = -1;
                this.status = "54";
                this.msg = "Encryption limit exceeded";
                break;
            case 15:
                this.codResponse = -1;
                this.status = "60";
                this.msg = "Wrong command";
                break;
            case 16:
                this.codResponse = -1;
                this.status = EglobalUtils.INITIALIZED_KEYS_WRONG_COMMAND;
                this.msg = "Initialized keys. Wrong command";
                break;
            case 17:
                this.codResponse = -1;
                this.status = EglobalUtils.NOT_INIT_KEYS;
                this.msg = "Not init keys";
                break;
            case 18:
                this.codResponse = -1;
                this.status = EglobalUtils.READ_CARD_ERROR;
                this.msg = "Read card error";
                break;
            case 19:
                this.codResponse = -1;
                this.status = "64";
                this.msg = "cardDoesNotMatchStartAgain";
                break;
            case 20:
                this.codResponse = -1;
                this.status = EglobalUtils.DOUBLE_AUTH_MC_CODE;
                this.msg = "incorrectDataForEncryption";
                break;
            case 21:
                this.codResponse = -1;
                this.status = "70";
                this.msg = "Sdk not instantiated";
                break;
            case 22:
                this.codResponse = -1;
                this.status = TypeScript.script71;
                this.msg = "Network Connection error";
                break;
            case 23:
                this.codResponse = -1;
                this.status = "72";
                this.msg = "Error device status failure";
                break;
            case 24:
                this.codResponse = -1;
                this.status = EglobalUtils.INTERNAL_ERROR;
                this.msg = "Internal error";
                break;
            case 25:
                this.codResponse = -1;
                this.status = "74";
                this.msg = "Android OS version not supported error";
                break;
            case 26:
                this.codResponse = -1;
                this.status = "75";
                this.msg = "initialized terminal instance";
                break;
            case 27:
                this.codResponse = -1;
                this.status = "80";
                this.msg = "Paperless printer";
                break;
            case 28:
                this.codResponse = -1;
                this.status = NumberOfScript.scriptFirstPart;
                this.msg = "Other printer problem";
                break;
            case 29:
                this.codResponse = -1;
                this.status = EglobalUtils.INTERCHANGE_PROFILE;
                this.msg = "Printer parameters not configured";
                break;
            case 30:
                this.codResponse = -1;
                this.status = "83";
                this.msg = "Last transaction is not recorded";
                break;
            case 31:
                this.codResponse = -1;
                this.status = EglobalUtils.DEDICATED_FILE_NAME_E_GLOBAL;
                this.msg = "Printer voltage is too low";
                break;
            case 32:
                this.codResponse = -1;
                this.status = "85";
                this.msg = "Printer is busy";
                break;
            case 33:
                this.codResponse = -1;
                this.status = "86";
                this.msg = "The format of print data packet error";
                break;
            case 34:
                this.codResponse = -1;
                this.status = "87";
                this.msg = "Printer malfuntions";
                break;
            case 35:
                this.codResponse = -1;
                this.status = "88";
                this.msg = "Printer overheats";
                break;
            case 36:
                this.codResponse = -1;
                this.status = "89";
                this.msg = "Printing is unfinished";
                break;
            case 37:
                this.codResponse = -1;
                this.status = EglobalUtils.READ_MODE_MAGNETIC_STRIPE;
                this.msg = "Cutjamerror";
                break;
            case 38:
                this.codResponse = -1;
                this.status = "91";
                this.msg = "Cover open error";
                break;
            case 39:
                this.codResponse = -1;
                this.status = "92";
                this.msg = "The printer has not installed font library";
                break;
            case 40:
                this.codResponse = -1;
                this.status = "93";
                this.msg = "data package is too long";
                break;
            case 41:
                this.codResponse = -1;
                this.status = "94";
                this.msg = "Error no permission";
                break;
            case 42:
                this.codResponse = -1;
                this.status = "95";
                this.msg = "Printer disabled";
                break;
            case 43:
                this.codResponse = -1;
                this.status = EglobalUtils.NO_NFC;
                this.msg = "No NFC";
                break;
            case 44:
                this.codResponse = -1;
                this.status = EglobalUtils.NFC_DISABLE;
                this.msg = "NFC Disabled";
                break;
            case 45:
                this.codResponse = -1;
                this.status = "98";
                this.msg = "NFC Enavled";
                break;
            case 46:
                this.codResponse = -1;
                this.status = "99";
                this.msg = "Error no defined. Cancel from Pinpad";
                break;
            case 47:
                this.codResponse = -1;
                this.status = "101";
                this.msg = "fingerRetvalNotOpen";
                break;
            case 48:
                this.codResponse = -1;
                this.status = "102";
                this.msg = "fingerRetvalTypeError";
                break;
            case 49:
                this.codResponse = -1;
                this.status = "103";
                this.msg = "fingerRetvalDeviceBusy";
                break;
            case 50:
                this.codResponse = -1;
                this.status = "104";
                this.msg = "fingerRetvalCapetureError";
                break;
        }
    }
}
