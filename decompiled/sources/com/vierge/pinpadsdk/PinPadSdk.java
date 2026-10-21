package com.vierge.pinpadsdk;

import android.os.Environment;
import androidx.camera.core.processing.f;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sun.mail.imap.IMAPStore;
import com.vierge.pinpadsdk.error.ERROR_CODE;
import com.vierge.pinpadsdk.error.Error;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import com.vierge.pinpadsdk.message.openpay.MessageResponseOpenPlay;
import com.vierge.pinpadsdk.message.openpay.MessageSendOpenPay;
import com.vierge.pinpadsdk.params.ExceptionParam;
import com.vierge.pinpadsdk.params.Param;
import com.vierge.pinpadsdk.q7Protocol.IQ7ProtocolResults;
import com.vierge.pinpadsdk.q7Protocol.IQ7ProtocolSend;
import com.vierge.pinpadsdk.q7Protocol.Q7Protocol;
import com.vierge.pinpadsdk.response.ResponseError;
import com.vierge.pinpadsdk.response.ResponseOk;
import com.vierge.pinpadsdk.script.ScriptProtocol;
import com.vierge.pinpadsdk.script.ScriptProtocolInterface;
import com.vierge.pinpadsdk.utils.Categories;
import com.vierge.pinpadsdk.utils.Logs;
import com.vierge.pinpadsdk.utils.Utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes6.dex */
public class PinPadSdk implements IQ7ProtocolResults {
    public static String keyName;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q7Protocol f67525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScriptProtocol f67526b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f67530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ICallbackListeners f67531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f67532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f67533i;
    protected MessageResponseOpenPlay receivedMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f67527c = EglobalUtils.CONNECTION_TYPE_BLUETOOTH;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JsonObject f67528d = null;
    public boolean debug = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Gson f67529e = new GsonBuilder().setPrettyPrinting().create();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f67534j = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String name = Thread.currentThread().getName();
                Logs.write(name + " Tengo que esperar por 10 segundos ... ");
                Thread.sleep(10000L);
                Logs.write(name + " Ya termine los 10 segundos.");
                PinPadSdk pinPadSdk = PinPadSdk.this;
                String str = pinPadSdk.f67532h;
                pinPadSdk.n("Timeout en la recepción del mensaje");
                pinPadSdk.e(6, str);
                Thread thread = pinPadSdk.f67530f;
                if (thread != null) {
                    thread.interrupt();
                    pinPadSdk.f67530f = null;
                }
            } catch (InterruptedException e5) {
                Logs.write("InterruptedException : " + e5.getLocalizedMessage());
            }
        }
    }

    public final void a(int i10) {
        ICallbackListeners iCallbackListeners = this.f67531g;
        if (iCallbackListeners != null) {
            iCallbackListeners.listenerSendNewCommand(i10);
        }
    }

    public final void b(ERROR_CODE error_code, Param param, String str) {
        String description = Error.getDescription(error_code, param);
        this.f67531g.listenerError(this.f67529e.toJson(new Error(description, error_code, str)));
    }

    public final void c(ERROR_CODE error_code, String str) {
        String description = Error.getDescription(error_code);
        this.f67531g.listenerError(this.f67529e.toJson(new Error(description, error_code, str)));
    }

    public void cancelTimer() {
        Thread thread = this.f67530f;
        if (thread != null) {
            thread.interrupt();
            this.f67530f = null;
        }
    }

    public final void d(String str) {
        ICallbackListeners iCallbackListeners = this.f67531g;
        if (iCallbackListeners != null) {
            iCallbackListeners.listenerResponseCommand(str);
        }
    }

    public final void e(int i10, String str) {
        JsonObject response = ((ResponseError) new ResponseError(MessageUtils.getMessageStatusDescription(i10)).setStatus(MessageUtils.getMessageStatusCode(i10))).getResponse();
        response.addProperty(IMAPStore.ID_COMMAND, str);
        d(this.f67529e.toJson((JsonElement) response));
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public byte[] executeCommand(String str, String[] strArr, boolean z10) {
        byte[] sendMessageZ2;
        String str2;
        Logs.write("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Logs.write("Ejecutando comando : " + str);
        n("Ejecutando comando : " + str);
        if (z10) {
            MessageResponseOpenPlay messageResponseOpenPlay = new MessageResponseOpenPlay();
            this.receivedMessage = messageResponseOpenPlay;
            messageResponseOpenPlay.setCommandString(str);
            this.receivedMessage.isNewCommand = z10;
        }
        byte b10 = 2;
        this.receivedMessage.setTypeMessage(2);
        MessageSendOpenPay messageSendOpenPay = new MessageSendOpenPay();
        Object[] objArr = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z11 = false;
        this.f67533i = false;
        try {
            switch (str.hashCode()) {
                case 1755:
                    b10 = !str.equals("72") ? (byte) -1 : (byte) 4;
                    break;
                case 2566:
                    b10 = !str.equals(CommandConstants.COMMAND_Q7) ? (byte) -1 : (byte) 8;
                    break;
                case 2567:
                    if (!str.equals(CommandConstants.COMMAND_Q8)) {
                        b10 = -1;
                    }
                    break;
                case 2568:
                    b10 = !str.equals("Q9") ? (byte) -1 : (byte) 3;
                    break;
                case 2840:
                    b10 = !str.equals(CommandConstants.COMMAND_Z2) ? (byte) -1 : (byte) 0;
                    break;
                case 2841:
                    b10 = !str.equals("Z3") ? (byte) -1 : (byte) 1;
                    break;
                case 64617:
                    b10 = !str.equals(CommandConstants.COMMAND_ACK) ? (byte) -1 : (byte) 15;
                    break;
                case 65956:
                    b10 = !str.equals("C12") ? (byte) -1 : (byte) 7;
                    break;
                case 65990:
                    b10 = !str.equals(CommandConstants.COMMAND_C25) ? (byte) -1 : (byte) 6;
                    break;
                case 66078:
                    b10 = !str.equals("C50") ? (byte) -1 : (byte) 22;
                    break;
                case 66079:
                    b10 = !str.equals(CommandConstants.COMMAND_C51) ? (byte) -1 : (byte) 5;
                    break;
                case 66082:
                    b10 = !str.equals(CommandConstants.COMMAND_C54) ? (byte) -1 : (byte) 9;
                    break;
                case 66083:
                    b10 = !str.equals("C55") ? (byte) -1 : (byte) 10;
                    break;
                case 66084:
                    b10 = !str.equals("C56") ? (byte) -1 : (byte) 11;
                    break;
                case 68842:
                    b10 = !str.equals("EOT") ? (byte) -1 : (byte) 17;
                    break;
                case 77048:
                    b10 = !str.equals("NAK") ? (byte) -1 : (byte) 16;
                    break;
                case 88057:
                    b10 = !str.equals(CommandConstants.COMMAND_Z10) ? (byte) -1 : (byte) 20;
                    break;
                case 88058:
                    b10 = !str.equals(CommandConstants.COMMAND_Z11) ? (byte) -1 : MessageUtils.MESSAGE_21_NAK;
                    break;
                case 88059:
                    b10 = !str.equals(CommandConstants.COMMAND_Z12) ? (byte) -1 : (byte) 12;
                    break;
                case 88060:
                    b10 = !str.equals(CommandConstants.COMMAND_Z13) ? (byte) -1 : (byte) 13;
                    break;
                case 88061:
                    b10 = !str.equals(CommandConstants.COMMAND_Z14) ? (byte) -1 : Constants.CVR_B1b41_1110_ONLINE_PIN;
                    break;
                case 2541522:
                    b10 = !str.equals("SEQ1") ? (byte) -1 : MessageUtils.MESSAGE_18_DC2;
                    break;
                case 2541523:
                    b10 = !str.equals("SEQ2") ? (byte) -1 : (byte) 19;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    String str3 = strArr[0];
                    String str4 = str3 != null ? str3 : "";
                    this.receivedMessage.setTypeMessage(1);
                    sendMessageZ2 = messageSendOpenPay.getSendMessageZ2(str4);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11 && this.f67530f == null) {
                        Thread thread = new Thread(this.f67534j, "timer");
                        this.f67530f = thread;
                        thread.start();
                    }
                    return sendMessageZ2;
                case 1:
                    String str5 = strArr[0];
                    String str6 = (str5 == null && str5.isEmpty()) ? "No Data" : strArr[0];
                    this.receivedMessage.setTypeMessage(1);
                    sendMessageZ2 = messageSendOpenPay.getSendMessageZ3(str6);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread2 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread2;
                        thread2.start();
                    }
                    return sendMessageZ2;
                case 2:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageQ8();
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread3 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread3;
                        thread3.start();
                    }
                    return sendMessageZ2;
                case 3:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageQ9(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread4 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread4;
                        thread4.start();
                    }
                    return sendMessageZ2;
                case 4:
                    this.receivedMessage.setTypeMessage(1);
                    sendMessageZ2 = messageSendOpenPay.getSendMessage72();
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread5 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread5;
                        thread5.start();
                    }
                    return sendMessageZ2;
                case 5:
                    this.f67533i = true;
                    sendMessageZ2 = messageSendOpenPay.getSendMessageC51(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread6 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread6;
                        thread6.start();
                    }
                    return sendMessageZ2;
                case 6:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageC25(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread7 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread7;
                        thread7.start();
                    }
                    return sendMessageZ2;
                case 7:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageC12(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread8 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread8;
                        thread8.start();
                    }
                    return sendMessageZ2;
                case 8:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageQ7(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread9 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread9;
                        thread9.start();
                    }
                    return sendMessageZ2;
                case 9:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageC54(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread10 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread10;
                        thread10.start();
                    }
                    return sendMessageZ2;
                case 10:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageC55(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread11 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread11;
                        thread11.start();
                    }
                    return sendMessageZ2;
                case 11:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageC56(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread12 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread12;
                        thread12.start();
                    }
                    return sendMessageZ2;
                case 12:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageZ12(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread13 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread13;
                        thread13.start();
                    }
                    return sendMessageZ2;
                case 13:
                    keyName = strArr[0];
                    sendMessageZ2 = messageSendOpenPay.getSendMessageZ13(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread14 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread14;
                        thread14.start();
                    }
                    return sendMessageZ2;
                case 14:
                    Param param = new Param(strArr[0], "KeyName");
                    String str7 = strArr[0];
                    int iHashCode = str7.hashCode();
                    if (iHashCode != 1661825500) {
                        if (iHashCode != 1664378163 || !str7.equals(CommandConstants.C51_KEY_NAME1)) {
                            objArr = -1;
                        }
                    } else if (str7.equals("OPENPRIVAD")) {
                        objArr = 1;
                    } else {
                        objArr = -1;
                    }
                    if (objArr != 0) {
                        if (objArr == 1 && strArr[1].length() != 3298) {
                            b(ERROR_CODE.InvalidParameterLength, param, CommandConstants.COMMAND_Z14);
                            return null;
                        }
                    } else if (strArr[1].length() != 796) {
                        b(ERROR_CODE.InvalidParameterLength, param, CommandConstants.COMMAND_Z14);
                        return null;
                    }
                    sendMessageZ2 = messageSendOpenPay.getSendMessageZ14(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread15 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread15;
                        thread15.start();
                    }
                    return sendMessageZ2;
                case 15:
                    Logs.write("Execute Enviando ACK");
                    this.receivedMessage.setTypeMessage(1);
                    byte[] sendMessageACK = messageSendOpenPay.getSendMessageACK();
                    if (strArr != null && (str2 = strArr[0]) != null) {
                        z11 = Boolean.parseBoolean(str2);
                    }
                    sendMessageZ2 = sendMessageACK;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread16 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread16;
                        thread16.start();
                    }
                    return sendMessageZ2;
                case 16:
                    this.receivedMessage.setTypeMessage(1);
                    sendMessageZ2 = messageSendOpenPay.getSendMessageNAK();
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread17 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread17;
                        thread17.start();
                    }
                    return sendMessageZ2;
                case 17:
                    this.receivedMessage.setTypeMessage(1);
                    sendMessageZ2 = messageSendOpenPay.getSendMessageEOT();
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread18 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread18;
                        thread18.start();
                    }
                    return sendMessageZ2;
                case 18:
                    this.receivedMessage.setNextCommand("SEQ2");
                    sendMessageZ2 = messageSendOpenPay.getSendMessage72();
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread19 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread19;
                        thread19.start();
                    }
                    return sendMessageZ2;
                case 19:
                    this.receivedMessage.setNextCommand("Z3");
                    String str8 = strArr[0];
                    sendMessageZ2 = messageSendOpenPay.getSendMessageZ2((str8 == null && str8.isEmpty()) ? "No Data" : strArr[0]);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread110 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread110;
                        thread110.start();
                    }
                    return sendMessageZ2;
                case 20:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageZ10(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread111 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread111;
                        thread111.start();
                    }
                    return sendMessageZ2;
                case 21:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageZ11(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread112 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread112;
                        thread112.start();
                    }
                    return sendMessageZ2;
                case 22:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageC50(strArr);
                    z11 = true;
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread113 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread113;
                        thread113.start();
                    }
                    return sendMessageZ2;
                default:
                    sendMessageZ2 = messageSendOpenPay.getSendMessageEOT();
                    m(sendMessageZ2);
                    this.f67532h = str;
                    if (z11) {
                        Thread thread114 = new Thread(this.f67534j, "timer");
                        this.f67530f = thread114;
                        thread114.start();
                    }
                    return sendMessageZ2;
            }
        } catch (ExceptionParam e5) {
            Logs.write(e5.getMessage());
            b(e5.getError_code(), e5.getParam(), str);
            return null;
        } catch (Exception e7) {
            Logs.write(e7.getMessage());
            c(ERROR_CODE.ParameterError, str);
            return null;
        }
    }

    public final void f(String str) {
        JsonObject response = ((ResponseError) new ResponseError(MessageUtils.getMessageStatusDescription(this.receivedMessage.getStateInt())).setStatus(MessageUtils.getMessageStatusCode(this.receivedMessage.getStateInt()))).getResponse();
        response.addProperty(IMAPStore.ID_COMMAND, str);
        d(this.f67529e.toJson((JsonElement) response));
    }

    public final void g(String str, String str2) {
        JsonObject response = ((ResponseError) new ResponseError(str).setStatus(MessageUtils.getMessageStatusCode(this.receivedMessage.getStateInt()))).getResponse();
        response.addProperty(IMAPStore.ID_COMMAND, str2);
        d(this.f67529e.toJson((JsonElement) response));
    }

    public String getVersion() {
        return "PinPad Android Library - Version 1.2.2 (27/07/2024)";
    }

    public final void h(JsonObject jsonObject, String str) {
        JsonObject response = ((ResponseOk) new ResponseOk(Utils.getAppTextDescription(Utils.RESPONSE_OK)).setStatus(MessageUtils.getMessageStatusCode(this.receivedMessage.getStateInt()))).getResponse(jsonObject);
        response.addProperty(IMAPStore.ID_COMMAND, str);
        d(this.f67529e.toJson((JsonElement) response));
    }

    public final void i(String str) {
        JsonObject response = ((ResponseOk) new ResponseOk(Utils.getAppTextDescription(Utils.RESPONSE_OK)).setStatus(MessageUtils.getMessageStatusCode(0))).getResponse();
        response.addProperty(IMAPStore.ID_COMMAND, str);
        d(this.f67529e.toJson((JsonElement) response));
    }

    @Override // com.vierge.pinpadsdk.q7Protocol.IQ7ProtocolResults
    public void iq7rFailureAnOtherState(int i10) {
        e(i10, CommandConstants.COMMAND_Q7);
    }

    @Override // com.vierge.pinpadsdk.q7Protocol.IQ7ProtocolResults
    public void iq7rFailureEOT() {
        e(99, CommandConstants.COMMAND_Q7);
    }

    @Override // com.vierge.pinpadsdk.q7Protocol.IQ7ProtocolResults
    public void iq7rFailureTimeOut() {
        e(6, CommandConstants.COMMAND_Q7);
    }

    @Override // com.vierge.pinpadsdk.q7Protocol.IQ7ProtocolResults
    public void iq7rSucess() {
        j(new JsonObject(), CommandConstants.COMMAND_Q7);
    }

    public final void j(JsonObject jsonObject, String str) {
        JsonObject response = ((ResponseOk) new ResponseOk(Utils.getAppTextDescription(Utils.RESPONSE_OK)).setStatus(MessageUtils.getMessageStatusCode(0))).getResponse(jsonObject);
        response.addProperty(IMAPStore.ID_COMMAND, str);
        d(this.f67529e.toJson((JsonElement) response));
    }

    public final void k(boolean z10) {
        int i10;
        String str;
        new MessageSendOpenPay();
        if (z10) {
            Logs.write("Enviando ACK");
            i10 = Utils.COMMAND_STRING_ACK;
            str = CommandConstants.COMMAND_ACK;
        } else {
            Logs.write("Enviando NAK");
            i10 = Utils.COMMAND_STRING_NAK;
            str = "NAK";
        }
        a(i10);
        n("Enviando acuse ".concat(str));
        Logs.write("Enviando acuse ".concat(str));
    }

    public final void l(short[] sArr) {
        ICallbackListeners iCallbackListeners;
        if (!this.debug || (iCallbackListeners = this.f67531g) == null) {
            return;
        }
        iCallbackListeners.listenerLogDataReceive(sArr);
    }

    public void listenerSerialResponse(short[] sArr) {
        Q7Protocol q7Protocol = this.f67525a;
        if (q7Protocol == null || !q7Protocol.inputData(sArr)) {
            Logs.write(" ", sArr, Categories.debug);
            MessageResponseOpenPlay messageResponseOpenPlay = this.receivedMessage;
            if (messageResponseOpenPlay == null) {
                return;
            }
            messageResponseOpenPlay.setData(sArr);
            cancelTimer();
            if (this.receivedMessage.getType() == 1) {
                String code = this.receivedMessage.getCode();
                Logs.write("Procesando mensaje simple: " + code);
                this.receivedMessage.setFinished(true);
                MessageResponseOpenPlay messageResponseOpenPlay2 = this.receivedMessage;
                l(messageResponseOpenPlay2.getShortArray(messageResponseOpenPlay2.getList()));
                if (!this.receivedMessage.isOK()) {
                    e(99, "");
                    m(new MessageSendOpenPay().getSendMessageEOT());
                    a(Utils.COMMAND_STRING_EOT);
                    n("Enviando EOT ");
                    Logs.write("Enviando EOT ");
                    return;
                }
                if (code == CommandConstants.COMMAND_Z2) {
                    i(CommandConstants.COMMAND_Z2);
                    return;
                }
                if (code == "72" && this.receivedMessage.isNewCommand) {
                    i("72");
                    return;
                }
                if (code == CommandConstants.COMMAND_ACK && this.receivedMessage.isNewCommand) {
                    i(CommandConstants.COMMAND_ACK);
                    return;
                } else {
                    if (code == "C12" && this.receivedMessage.isNewCommand && this.f67526b.isSendOkResponse()) {
                        h(this.f67528d, CommandConstants.COMMAND_C25);
                        return;
                    }
                    return;
                }
            }
            Logs.write("Procesando mensaje compuesto .....  " + this.receivedMessage.getCode());
            String code2 = this.receivedMessage.getCode();
            Logs.write("MessageName: " + code2);
            if (this.receivedMessage.isFinished()) {
                Logs.write("Ya termine el " + code2 + " ...........");
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_C51)) {
                Logs.write("Paso 1");
                if (!this.receivedMessage.isAcknowledgeType()) {
                    Logs.write(" ACK or NAK NOT Received.");
                } else if (!this.receivedMessage.isPositiveAcknowledge()) {
                    Logs.write(" Mensaje terminado x error en el acuse.");
                    this.receivedMessage.setFinished(true);
                    this.receivedMessage.setTypeMessage(1);
                    a(Utils.COMMAND_STRING_NAK);
                    f(CommandConstants.COMMAND_C51);
                    return;
                }
                Logs.write("Paso 2");
                if (this.f67533i) {
                    k(true);
                    this.f67533i = false;
                    this.receivedMessage.setTypeMessage(2);
                }
                Logs.write("Paso 2.5");
                int iIsEndOfMessage2 = this.receivedMessage.isEndOfMessage2();
                Logs.write("isEndOfMessage2" + iIsEndOfMessage2);
                if (iIsEndOfMessage2 == 0) {
                    this.receivedMessage.cleanAcknowledge();
                    this.receivedMessage.printData();
                    if (!this.receivedMessage.isValidMessage()) {
                        Logs.write(" Mensaje terminado x error : LRC Invalido.");
                        this.receivedMessage.setFinished(true);
                        this.receivedMessage.setTypeMessage(1);
                        a(Utils.COMMAND_STRING_72);
                        g("Mensaje terminado x error : LRC Invalido.", CommandConstants.COMMAND_C51);
                        return;
                    }
                    this.receivedMessage.setCommandString("C53");
                    int messageCode = this.receivedMessage.getMessageCode();
                    if (messageCode == -1) {
                        this.receivedMessage.setCommandString(CommandConstants.COMMAND_C54);
                        messageCode = this.receivedMessage.getMessageCode();
                    }
                    Logs.write(String.format("Estado: %d", Integer.valueOf(messageCode)));
                    if (messageCode != 0) {
                        if (messageCode == 99) {
                            wait(500);
                            a(Utils.COMMAND_STRING_72);
                        } else if (messageCode != 21 && messageCode != 22) {
                            Logs.write(" La respuesta NO fue exitosa.");
                            this.receivedMessage.setFinished(true);
                            e(messageCode, CommandConstants.COMMAND_C51);
                            wait(500);
                            a(Utils.COMMAND_STRING_72);
                        }
                    }
                    Logs.write(" Mensaje terminado");
                    this.receivedMessage.setFinished(true);
                    if (messageCode == 0 || messageCode == 21 || messageCode == 22 || messageCode == 99) {
                        this.receivedMessage.setCommandString(CommandConstants.COMMAND_C51);
                        this.f67528d = this.receivedMessage.responseToJson();
                        Logs.write(" " + this.f67528d);
                        if (this.f67528d.toString().contains("serial")) {
                            h(this.f67528d, CommandConstants.COMMAND_C51);
                        } else {
                            e(messageCode, CommandConstants.COMMAND_C51);
                        }
                    }
                } else {
                    if (iIsEndOfMessage2 == 2) {
                        Logs.write(" Mensaje terminado x error : Longitud Invalida.");
                        this.receivedMessage.setFinished(true);
                        this.receivedMessage.setTypeMessage(1);
                        a(Utils.COMMAND_STRING_72);
                        g("Mensaje terminado x error : Long Invalida.", CommandConstants.COMMAND_C51);
                        return;
                    }
                    Logs.write(" El mensaje no ha terminado.");
                }
                Logs.write("Paso 3");
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_C25)) {
                Logs.write("Paso 1");
                if (!this.receivedMessage.isAcknowledgeType()) {
                    Logs.write("ACK or NAK NOT Received.");
                } else if (!this.receivedMessage.isPositiveAcknowledge()) {
                    Logs.write("Mensaje terminado x error en el acuse.");
                    this.receivedMessage.setFinished(true);
                    this.receivedMessage.setTypeMessage(1);
                    a(Utils.COMMAND_STRING_NAK);
                    f(CommandConstants.COMMAND_C25);
                    return;
                }
                Logs.write("Paso 2");
                if (this.receivedMessage.isEndOfMessage()) {
                    this.receivedMessage.cleanAcknowledge();
                    this.receivedMessage.printData();
                    if (!this.receivedMessage.isValidMessage()) {
                        Logs.write("Mensaje terminado x error : LRC Invalido.");
                        this.receivedMessage.setFinished(true);
                        this.receivedMessage.setTypeMessage(1);
                        a(Utils.COMMAND_STRING_NAK);
                        f(CommandConstants.COMMAND_C25);
                        g("Mensaje terminado x error : LRC Invalido.", CommandConstants.COMMAND_C25);
                        return;
                    }
                    int messageCode2 = this.receivedMessage.getMessageCode();
                    if (messageCode2 != 0) {
                        ScriptProtocol scriptProtocol = this.f67526b;
                        if (scriptProtocol != null) {
                            scriptProtocol.input(2);
                        }
                        Logs.write("La respuesta NO fue exitosa. ");
                        this.receivedMessage.setFinished(true);
                        a(Utils.COMMAND_STRING_ACK);
                        e(messageCode2, CommandConstants.COMMAND_C25);
                        wait(500);
                        a(Utils.COMMAND_STRING_72);
                    } else {
                        k(true);
                    }
                    Logs.write("Mensaje terminado");
                    this.receivedMessage.setFinished(true);
                    if (messageCode2 == 0) {
                        this.f67528d = this.receivedMessage.responseToJson();
                        Logs.write("" + this.f67528d);
                        ScriptProtocol scriptProtocol2 = this.f67526b;
                        if (scriptProtocol2 != null) {
                            scriptProtocol2.input(1);
                        } else {
                            h(this.f67528d, CommandConstants.COMMAND_C25);
                        }
                    } else {
                        ScriptProtocol scriptProtocol3 = this.f67526b;
                        if (scriptProtocol3 != null) {
                            scriptProtocol3.input(2);
                        }
                    }
                } else {
                    Logs.write("El mensaje no ha terminado.");
                }
                Logs.write("Paso 3");
                ScriptProtocol scriptProtocol4 = this.f67526b;
                if (scriptProtocol4 != null) {
                    scriptProtocol4.runNextCommand();
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase("C12")) {
                Logs.write("Paso 1 C12");
                if (!this.receivedMessage.isAcknowledgeType()) {
                    Logs.write("ACK or NAK NOT Received.");
                } else if (!this.receivedMessage.isPositiveAcknowledge()) {
                    Logs.write("Mensaje terminado x error en el acuse.");
                    this.receivedMessage.setFinished(true);
                    this.receivedMessage.setTypeMessage(1);
                    a(Utils.COMMAND_STRING_NAK);
                    f(CommandConstants.COMMAND_C25);
                    return;
                }
                Logs.write("Paso 2 C12");
                if (this.receivedMessage.isEndOfMessage()) {
                    this.receivedMessage.cleanAcknowledge();
                    this.receivedMessage.printData();
                    if (!this.receivedMessage.isValidMessage()) {
                        Logs.write("Mensaje terminado x error : LRC Invalido");
                        this.receivedMessage.setFinished(true);
                        this.receivedMessage.setTypeMessage(1);
                        a(Utils.COMMAND_STRING_NAK);
                        ScriptProtocol scriptProtocol5 = this.f67526b;
                        if (scriptProtocol5 != null) {
                            scriptProtocol5.input(4);
                        }
                        g("Mensaje terminado x error : LRC Invalido.", CommandConstants.COMMAND_C25);
                        return;
                    }
                    int messageCode3 = this.receivedMessage.getMessageCode();
                    if (messageCode3 != 0) {
                        ScriptProtocol scriptProtocol6 = this.f67526b;
                        if (scriptProtocol6 != null) {
                            scriptProtocol6.input(4);
                        }
                        Logs.write("La respuesta NO fue exitosa. ");
                        this.receivedMessage.setFinished(true);
                        a(Utils.COMMAND_STRING_ACK);
                        e(messageCode3, CommandConstants.COMMAND_C25);
                        wait(500);
                        a(Utils.COMMAND_STRING_72);
                    } else {
                        wait(1000);
                        ScriptProtocol scriptProtocol7 = this.f67526b;
                        if (scriptProtocol7 != null) {
                            scriptProtocol7.input(3);
                        }
                        k(true);
                    }
                    Logs.write("Mensaje terminado C12");
                    this.receivedMessage.setFinished(true);
                    if (messageCode3 == 0) {
                        this.f67528d = this.receivedMessage.responseToJson();
                        Logs.write("" + this.f67528d);
                        ScriptProtocol scriptProtocol8 = this.f67526b;
                        if (scriptProtocol8 != null) {
                            scriptProtocol8.input(3);
                            this.f67526b.isSendOkResponse();
                        }
                    } else {
                        ScriptProtocol scriptProtocol9 = this.f67526b;
                        if (scriptProtocol9 != null) {
                            scriptProtocol9.input(4);
                        }
                    }
                } else {
                    Logs.write("El mensaje no ha terminado. ");
                }
                Logs.write("Paso 3 C12");
                ScriptProtocol scriptProtocol10 = this.f67526b;
                if (scriptProtocol10 != null) {
                    scriptProtocol10.runNextCommand();
                    return;
                }
                return;
            }
            boolean zEqualsIgnoreCase = code2.equalsIgnoreCase(CommandConstants.COMMAND_C54);
            Gson gson = this.f67529e;
            if (zEqualsIgnoreCase) {
                if (this.receivedMessage.isEndOfMessage()) {
                    k(true);
                    MessageResponseOpenPlay messageResponseOpenPlay3 = this.receivedMessage;
                    l(messageResponseOpenPlay3.getShortArray(messageResponseOpenPlay3.getList()));
                    int iFindMessageState = this.receivedMessage.findMessageState();
                    String messageDescription = MessageUtils.getMessageDescription(iFindMessageState);
                    if (iFindMessageState != 0) {
                        Logs.write("[AndroidLibrary._procesaRespuestaC54()] La respuesta NO fue exitosa.");
                        g(messageDescription, CommandConstants.COMMAND_C54);
                    } else {
                        Logs.write("[AndroidLibrary._procesaRespuestaC54()] La respuesta fue exitosa. Enviar el acuse");
                    }
                    Logs.write("[AndroidLibrary._procesaRespuestaC54()] Mensaje terminado c54");
                    this.receivedMessage.setFinished(true);
                    if (iFindMessageState != 0) {
                        this.f67527c.equalsIgnoreCase("bt");
                        return;
                    }
                    JsonObject jsonObjectResponseToJson = this.receivedMessage.responseToJson();
                    n("[AndroidLibrary._procesaRespuestaC54()] " + gson.toJson((JsonElement) jsonObjectResponseToJson));
                    h(jsonObjectResponseToJson, CommandConstants.COMMAND_C54);
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase("C55")) {
                if (this.receivedMessage.isEndOfMessage()) {
                    Logs.write("Mensaje terminado C55");
                    this.receivedMessage.setFinished(true);
                    MessageResponseOpenPlay messageResponseOpenPlay4 = this.receivedMessage;
                    l(messageResponseOpenPlay4.getShortArray(messageResponseOpenPlay4.getList()));
                    int iFindMessageState2 = this.receivedMessage.findMessageState();
                    String messageDescription2 = MessageUtils.getMessageDescription(iFindMessageState2);
                    if (iFindMessageState2 == 0) {
                        Logs.write("La respuesta fue exitosa. Enviar el acuse");
                        k(true);
                        n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                        h(this.receivedMessage.responseToJson(), "C55");
                        return;
                    }
                    if (iFindMessageState2 == 62 || iFindMessageState2 == 99) {
                        Logs.write("" + messageDescription2);
                        k(true);
                        g(messageDescription2, "C55");
                        return;
                    }
                    Logs.write("La respuesta NO fue exitosa: " + messageDescription2);
                    k(true);
                    g(messageDescription2, "C55");
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase("C56")) {
                if (this.receivedMessage.isEndOfMessage()) {
                    Logs.write("Mensaje terminado C56");
                    this.receivedMessage.setFinished(true);
                    MessageResponseOpenPlay messageResponseOpenPlay5 = this.receivedMessage;
                    l(messageResponseOpenPlay5.getShortArray(messageResponseOpenPlay5.getList()));
                    int iFindMessageState3 = this.receivedMessage.findMessageState();
                    String messageDescription3 = MessageUtils.getMessageDescription(iFindMessageState3);
                    if (iFindMessageState3 == 0) {
                        Logs.write("La respuesta fue exitosa. Enviar el acuse");
                        k(true);
                        n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                        h(this.receivedMessage.responseToJson(), "C56");
                        return;
                    }
                    if (iFindMessageState3 != 60) {
                        Logs.write("La respuesta NO fue exitosa.");
                        k(true);
                        f("C56");
                        return;
                    }
                    Logs.write("Comando erroneo.");
                    k(true);
                    if (this.f67527c.equalsIgnoreCase("bt")) {
                        m(new MessageSendOpenPay().getSendMessageEOT());
                        a(Utils.COMMAND_STRING_EOT);
                        n("Enviando EOT ");
                        Logs.write("Enviando EOT ");
                    }
                    g(messageDescription3, "C56");
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_Q7)) {
                Logs.write("Paso 1");
                if (!this.receivedMessage.isAcknowledgeType()) {
                    Logs.write("ACK or NAK NOT Received.");
                } else if (!this.receivedMessage.isPositiveAcknowledge()) {
                    Logs.write("Mensaje terminado x error en el acuse.");
                    this.receivedMessage.setFinished(true);
                    this.receivedMessage.setTypeMessage(1);
                    a(Utils.COMMAND_STRING_NAK);
                    f(CommandConstants.COMMAND_Q7);
                    return;
                }
                Logs.write("Paso 2");
                if (this.receivedMessage.isEndOfMessage()) {
                    this.receivedMessage.cleanAcknowledge();
                    this.receivedMessage.printData();
                    if (!this.receivedMessage.isValidMessage()) {
                        Logs.write("Mensaje terminado x error : LRC Invalido.");
                        this.receivedMessage.setFinished(true);
                        this.receivedMessage.setTypeMessage(1);
                        a(Utils.COMMAND_STRING_NAK);
                        f(CommandConstants.COMMAND_Q7);
                        g("Mensaje terminado x error : LRC Invalido.", CommandConstants.COMMAND_Q7);
                        return;
                    }
                    int messageCode4 = this.receivedMessage.getMessageCode();
                    if (messageCode4 != 0) {
                        Logs.write("La respuesta NO fue exitosa. ");
                        this.receivedMessage.setFinished(true);
                        a(Utils.COMMAND_STRING_ACK);
                        e(messageCode4, CommandConstants.COMMAND_Q7);
                        wait(500);
                        a(Utils.COMMAND_STRING_72);
                    } else {
                        boolean z10 = this.receivedMessage.isNewCommand;
                        k(true);
                    }
                    Logs.write("Mensaje terminado");
                    this.receivedMessage.setFinished(true);
                    if (messageCode4 == 0) {
                        this.f67528d = this.receivedMessage.responseToJson();
                        Logs.write("Respuesta Json:" + this.f67528d);
                        h(this.f67528d, CommandConstants.COMMAND_Q7);
                    }
                } else {
                    Logs.write("El mensaje no ha terminado.");
                }
                Logs.write("Paso 3");
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_Q8)) {
                if (!this.receivedMessage.isAcknowledgeType()) {
                    Logs.write("ACK or NAK NOT Received.");
                } else {
                    if (!this.receivedMessage.isPositiveAcknowledge()) {
                        Logs.write("[AndroidLibrary._procesaRespuestaQ8()] Mensaje terminado x error en el acuse.");
                        this.receivedMessage.setFinished(true);
                        this.receivedMessage.setTypeMessage(1);
                        k(false);
                        f(CommandConstants.COMMAND_Q8);
                        return;
                    }
                    Logs.write("[AndroidLibrary._procesaRespuestaQ8()] El acuse es bueno. Podemos continuar.");
                    this.receivedMessage.cleanAcknowledge();
                }
                if (this.receivedMessage.isEndOfMessage()) {
                    Logs.write("El mensaje ha llegado a su fin.");
                    this.receivedMessage.setFinished(true);
                    MessageResponseOpenPlay messageResponseOpenPlay6 = this.receivedMessage;
                    l(messageResponseOpenPlay6.getShortArray(messageResponseOpenPlay6.getList()));
                    if (!this.receivedMessage.isValidMessage()) {
                        Logs.write("Mensaje terminado x error : LRC Invalido.");
                        this.receivedMessage.setFinished(true);
                        this.receivedMessage.setTypeMessage(1);
                        k(false);
                        g("Invalid LRC.", CommandConstants.COMMAND_Q8);
                        n("Mensaje terminado x error : LRC Invalido.");
                        return;
                    }
                    k(true);
                    n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                    Logs.write("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                    j(this.receivedMessage.responseToJson(), CommandConstants.COMMAND_Q8);
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase("Q9")) {
                if (!this.receivedMessage.isAcknowledgeType()) {
                    Logs.write("ACK or NAK NOT Received.");
                } else {
                    if (!this.receivedMessage.isPositiveAcknowledge()) {
                        Logs.write("Mensaje terminado x error en el acuse.");
                        this.receivedMessage.setFinished(true);
                        k(false);
                        f("Q9");
                        return;
                    }
                    Logs.write("El acuse es bueno. Podemos continuar.");
                    this.receivedMessage.cleanAcknowledge();
                }
                if (this.receivedMessage.isEndOfMessage()) {
                    Logs.write("El mensaje ha llegado a su fin");
                    this.receivedMessage.setFinished(true);
                    MessageResponseOpenPlay messageResponseOpenPlay7 = this.receivedMessage;
                    l(messageResponseOpenPlay7.getShortArray(messageResponseOpenPlay7.getList()));
                    if (!this.receivedMessage.isValidMessage()) {
                        Logs.write("Mensaje terminado x error : LRC Invalido.");
                        k(true);
                        g("Mensaje terminado x error : LRC Invalido.", "Q9");
                        return;
                    }
                    int messageCode5 = this.receivedMessage.getMessageCode();
                    String messageDescription4 = MessageUtils.getMessageDescription(messageCode5);
                    if (messageCode5 != 0) {
                        Logs.write("La respuesta NO fue exitosa.");
                        this.receivedMessage.setFinished(true);
                        a(Utils.COMMAND_STRING_ACK);
                        g(messageDescription4, "Q9");
                        return;
                    }
                    Logs.write("La respuesta fue exitosa. Enviar el acuse");
                    a(Utils.COMMAND_STRING_ACK);
                    n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                    h(this.receivedMessage.responseToJson(), "Q9");
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_Z12)) {
                if (this.receivedMessage.isEndOfMessage()) {
                    Logs.write("Mensaje terminado Z12");
                    this.receivedMessage.setFinished(true);
                    MessageResponseOpenPlay messageResponseOpenPlay8 = this.receivedMessage;
                    l(messageResponseOpenPlay8.getShortArray(messageResponseOpenPlay8.getList()));
                    int messageCode6 = this.receivedMessage.getMessageCode();
                    String messageStatusDescription = MessageUtils.getMessageStatusDescription(messageCode6);
                    if (messageCode6 == 0) {
                        Logs.write("La respuesta fue exitosa. Enviar el acuse");
                        k(true);
                        n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                        h(this.receivedMessage.responseToJson(), CommandConstants.COMMAND_Z12);
                        return;
                    }
                    if (messageCode6 != 2 && messageCode6 != 62 && messageCode6 != 99) {
                        Logs.write("La respuesta NO fue exitosa.");
                        g(messageStatusDescription, CommandConstants.COMMAND_Z12);
                        k(true);
                        return;
                    } else {
                        Logs.write("" + messageStatusDescription);
                        k(true);
                        g(messageStatusDescription, CommandConstants.COMMAND_Z12);
                        return;
                    }
                }
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_Z13)) {
                if (this.receivedMessage.isEndOfMessage()) {
                    MessageResponseOpenPlay messageResponseOpenPlay9 = this.receivedMessage;
                    l(messageResponseOpenPlay9.getShortArray(messageResponseOpenPlay9.getList()));
                    int messageCode7 = this.receivedMessage.getMessageCode();
                    String messageStatusDescription2 = MessageUtils.getMessageStatusDescription(messageCode7);
                    if (messageCode7 == 0) {
                        Logs.write("La respuesta fue exitosa. Enviar el acuse");
                        k(true);
                        n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                        h(this.receivedMessage.responseToJson(), CommandConstants.COMMAND_Z13);
                        return;
                    }
                    if (messageCode7 != 52) {
                        if (messageCode7 != 99) {
                            Logs.write("La respuesta NO fue exitosa.");
                            k(true);
                            g(messageStatusDescription2, CommandConstants.COMMAND_Z13);
                            return;
                        }
                        wait(100);
                    }
                    Logs.write("" + messageStatusDescription2);
                    k(true);
                    JsonObject response = ((ResponseError) new ResponseError(MessageUtils.getMessageStatusDescription(messageCode7)).setStatus(MessageUtils.getMessageStatusCode(messageCode7))).getResponse(this.receivedMessage.responseToJson());
                    response.addProperty(IMAPStore.ID_COMMAND, CommandConstants.COMMAND_Z13);
                    d(gson.toJson((JsonElement) response));
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_Z14)) {
                if (this.receivedMessage.isEndOfMessage()) {
                    this.receivedMessage.setFinished(true);
                    MessageResponseOpenPlay messageResponseOpenPlay10 = this.receivedMessage;
                    l(messageResponseOpenPlay10.getShortArray(messageResponseOpenPlay10.getList()));
                    int messageCode8 = this.receivedMessage.getMessageCode();
                    String messageStatusDescription3 = MessageUtils.getMessageStatusDescription(messageCode8);
                    if (messageCode8 != 0) {
                        Logs.write("" + messageStatusDescription3);
                        k(true);
                        g(messageStatusDescription3, CommandConstants.COMMAND_Z14);
                        return;
                    }
                    k(true);
                    n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                    h(this.receivedMessage.responseToJson(), CommandConstants.COMMAND_Z14);
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase("SEQ1")) {
                MessageResponseOpenPlay messageResponseOpenPlay11 = this.receivedMessage;
                l(messageResponseOpenPlay11.getShortArray(messageResponseOpenPlay11.getList()));
                o();
                return;
            }
            if (code2.equalsIgnoreCase("SEQ2")) {
                MessageResponseOpenPlay messageResponseOpenPlay12 = this.receivedMessage;
                l(messageResponseOpenPlay12.getShortArray(messageResponseOpenPlay12.getList()));
                o();
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_Z10)) {
                if (this.receivedMessage.isEndOfMessage()) {
                    Logs.write("Mensaje terminado Z10");
                    this.receivedMessage.setFinished(true);
                    MessageResponseOpenPlay messageResponseOpenPlay13 = this.receivedMessage;
                    l(messageResponseOpenPlay13.getShortArray(messageResponseOpenPlay13.getList()));
                    int messageCode9 = this.receivedMessage.getMessageCode();
                    String messageDescription5 = MessageUtils.getMessageDescription(messageCode9);
                    if (messageCode9 == 0) {
                        Logs.write("La respuesta fue exitosa. Enviar el acuse");
                        k(true);
                        n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                        h(this.receivedMessage.responseToJson(), CommandConstants.COMMAND_Z10);
                        return;
                    }
                    if (messageCode9 == 52 || messageCode9 == 99) {
                        Logs.write("" + messageDescription5);
                        k(true);
                        g(messageDescription5, CommandConstants.COMMAND_Z10);
                        return;
                    }
                    Logs.write("" + messageDescription5);
                    k(true);
                    g(messageDescription5, CommandConstants.COMMAND_Z10);
                    return;
                }
                return;
            }
            if (code2.equalsIgnoreCase(CommandConstants.COMMAND_Z11)) {
                if (this.receivedMessage.isEndOfMessage()) {
                    Logs.write("Mensaje terminado Z11 ");
                    this.receivedMessage.setFinished(true);
                    this.receivedMessage.printData();
                    MessageResponseOpenPlay messageResponseOpenPlay14 = this.receivedMessage;
                    l(messageResponseOpenPlay14.getShortArray(messageResponseOpenPlay14.getList()));
                    int messageCode10 = this.receivedMessage.getMessageCode();
                    String messageStatusDescription4 = MessageUtils.getMessageStatusDescription(messageCode10);
                    if (messageCode10 != 0) {
                        Logs.write("" + messageStatusDescription4);
                        k(true);
                        g(messageStatusDescription4, CommandConstants.COMMAND_Z11);
                        return;
                    }
                    Logs.write("La respuesta fue exitosa. Enviar el acuse");
                    k(true);
                    n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                    h(this.receivedMessage.responseToJson(), CommandConstants.COMMAND_Z11);
                    return;
                }
                return;
            }
            if (!code2.equalsIgnoreCase("C50")) {
                MessageResponseOpenPlay messageResponseOpenPlay15 = this.receivedMessage;
                l(messageResponseOpenPlay15.getShortArray(messageResponseOpenPlay15.getList()));
                f("");
                return;
            }
            if (this.receivedMessage.isEndOfMessage2() == 0) {
                k(true);
                Logs.write("Mensaje terminado C50 ");
                this.receivedMessage.setFinished(true);
                this.receivedMessage.printData();
                MessageResponseOpenPlay messageResponseOpenPlay16 = this.receivedMessage;
                l(messageResponseOpenPlay16.getShortArray(messageResponseOpenPlay16.getList()));
                int messageCode11 = this.receivedMessage.getMessageCode();
                String messageDescription6 = MessageUtils.getMessageDescription(messageCode11);
                if (messageCode11 == 0) {
                    Logs.write("La respuesta fue exitosa. Enviar el acuse");
                    n("" + gson.toJson((JsonElement) this.receivedMessage.responseToJson()));
                    h(this.receivedMessage.responseToJson(), "C50");
                    return;
                }
                if (messageCode11 != 99) {
                    Logs.write("La respuesta NO fue exitosa.");
                    g(messageDescription6, "C50");
                } else {
                    Logs.write("Falla sin determinar. Cancelar desde pinpad");
                    g(messageDescription6, "C50");
                }
            }
        }
    }

    public final void m(byte[] bArr) {
        if (!this.debug || this.f67531g == null) {
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
        this.f67531g.listenerLogDataSend(sArr);
    }

    public final void n(String str) {
        if (this.f67531g != null) {
            this.f67531g.listenerLogSession(Constant.BRACKET_OPEN + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + Constant.BRACKET_CLOSE.concat(str));
        }
    }

    public final void o() {
        if (!this.receivedMessage.isAcknowledgeType()) {
            g("ACK or NAK NOT Received", "72");
            Logs.write("ACK or NAK NOT Received.");
        } else {
            if (this.receivedMessage.isPositiveAcknowledge()) {
                Logs.write("El acuse es bueno.");
                i("72");
                return;
            }
            Logs.write("Mensaje terminado x error en el acuse.");
            this.receivedMessage.setFinished(true);
            this.receivedMessage.setTypeMessage(1);
            k(false);
            f("72");
        }
    }

    public void runScripts(ScriptProtocolInterface scriptProtocolInterface, String str, String str2) {
        if (str.compareTo("") == 0 && str2.compareTo("") == 0) {
            c(ERROR_CODE.ErrorBothScriptsCannotBeEmpty, CommandConstants.COMMAND_C25);
            return;
        }
        ScriptProtocol scriptProtocol = new ScriptProtocol(scriptProtocolInterface, this, str, str2);
        this.f67526b = scriptProtocol;
        scriptProtocol.input(0);
        this.f67526b.runNextCommand();
    }

    public void runSendFile(IQ7ProtocolSend iQ7ProtocolSend, String str) {
        File file = new File(Environment.getExternalStorageDirectory(), f.d("/", str));
        if (file.isDirectory()) {
            c(ERROR_CODE.ErrorWhileReadingFile, CommandConstants.COMMAND_Q7);
            return;
        }
        if (!file.exists()) {
            c(ERROR_CODE.ErrorWhileReadingFile, CommandConstants.COMMAND_Q7);
            return;
        }
        Q7Protocol q7Protocol = new Q7Protocol(this, iQ7ProtocolSend, str);
        this.f67525a = q7Protocol;
        try {
            q7Protocol.readData();
            this.f67525a.star();
        } catch (IOException e5) {
            String message = e5.getMessage();
            ERROR_CODE error_code = ERROR_CODE.ErrorWhileReadingFile;
            this.f67531g.listenerError(this.f67529e.toJson(new Error(message, error_code, CommandConstants.COMMAND_Q7)));
        }
    }

    public void setConnectionType(String str) {
        this.f67527c = str;
    }

    public void setDebug(boolean z10, List<Categories> list) {
        if (this.debug) {
            Logs.categories = new HashSet(Logs.categories);
        }
        this.debug = z10;
    }

    public void setLogListener(ICallbackListeners iCallbackListeners) {
        this.f67531g = iCallbackListeners;
    }

    public void wait(int i10) {
        try {
            Thread.sleep(i10);
        } catch (InterruptedException e5) {
            System.out.println(e5.getMessage());
        }
    }
}
