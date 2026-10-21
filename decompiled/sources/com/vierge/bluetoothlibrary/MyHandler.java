package com.vierge.bluetoothlibrary;

import android.os.Handler;
import android.os.Message;
import androidx.camera.core.processing.f;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import mx.openpay.library.data.util.EglobalUtils;
import responsebt.ResponseError;
import responsebt.ResponseOk;

/* JADX INFO: loaded from: classes11.dex */
public class MyHandler extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothListener f67523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gson f67524b = new GsonBuilder().setPrettyPrinting().create();

    public MyHandler() {
        new Timer();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        Gson gson = this.f67524b;
        switch (i10) {
            case 1:
                BluetoothListener bluetoothListener = this.f67523a;
                if (bluetoothListener != null) {
                    bluetoothListener.onStateChanged(message.arg1);
                }
                break;
            case 2:
                short[] sArr = (short[]) message.obj;
                Utils.setData(sArr);
                int length = sArr.length;
                byte[] bArr = new byte[length];
                for (int i11 = 0; i11 < sArr.length; i11++) {
                    bArr[i11] = (byte) sArr[i11];
                }
                BluetoothListener bluetoothListener2 = this.f67523a;
                if (bluetoothListener2 != null && length > 0) {
                    bluetoothListener2.onReadMessage(bArr);
                    break;
                }
                break;
            case 3:
                byte[] bArr2 = (byte[]) message.obj;
                new String(bArr2);
                BluetoothListener bluetoothListener3 = this.f67523a;
                if (bluetoothListener3 != null) {
                    bluetoothListener3.onWriteMessage(bArr2);
                }
                break;
            case 4:
                String string = message.getData().getString("device_name");
                BluetoothListener bluetoothListener4 = this.f67523a;
                if (bluetoothListener4 != null) {
                    bluetoothListener4.onDeviceName(string);
                    this.f67523a.onStateChanged(gson.toJson((JsonElement) new ResponseOk(f.d("Connected to : ", string)).setStatus("30").getResponse()));
                }
                break;
            case 5:
                String string2 = message.getData().getString("toast");
                BluetoothListener bluetoothListener5 = this.f67523a;
                if (bluetoothListener5 != null) {
                    bluetoothListener5.onToast(string2);
                }
                break;
            case 7:
                HashMap map = (HashMap) message.getData().getSerializable("device_name");
                JsonObject jsonObject = new JsonObject();
                JsonArray jsonArray = new JsonArray();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("devicename", (String) entry.getKey());
                    jsonObject2.addProperty("deviceaddress", (String) entry.getValue());
                    it.remove();
                    jsonArray.add(jsonObject2);
                }
                jsonObject.add("scanlist", jsonArray);
                if (this.f67523a != null) {
                    ResponseOk responseOk = new ResponseOk();
                    responseOk.setMsg("Message Succesfull");
                    responseOk.setStatus("10");
                    this.f67523a.onStateChanged(gson.toJson((JsonElement) responseOk.getResponse(jsonObject)));
                }
                break;
            case 8:
                String string3 = message.getData().getString(BluetoothState.SCAN_STATE);
                BluetoothListener bluetoothListener6 = this.f67523a;
                if (bluetoothListener6 != null) {
                    bluetoothListener6.onStateChanged(gson.toJson((JsonElement) new ResponseOk(string3).setStatus("19").getResponse()));
                }
                break;
            case 9:
                ResponseOk responseOk2 = new ResponseOk("Not devices found");
                responseOk2.setStatus(EglobalUtils.CARD_REMOVED);
                BluetoothListener bluetoothListener7 = this.f67523a;
                if (bluetoothListener7 != null) {
                    bluetoothListener7.onStateChanged(gson.toJson((JsonElement) responseOk2.getResponse()));
                }
                break;
            case 10:
                BluetoothListener bluetoothListener8 = this.f67523a;
                if (bluetoothListener8 != null) {
                    bluetoothListener8.onStateChanged(gson.toJson((JsonElement) new ResponseOk("Device disconected").setStatus("40").getResponse()));
                }
                break;
            case 11:
                String string4 = message.getData().getString(BluetoothState.ERROR_DESCRIPTION);
                BluetoothListener bluetoothListener9 = this.f67523a;
                if (bluetoothListener9 != null) {
                    bluetoothListener9.onError(gson.toJson((JsonElement) new ResponseError(string4).setStatus("01").getResponse()));
                }
                break;
            case 12:
                String string5 = message.getData().getString(BluetoothState.ERROR_DESCRIPTION);
                BluetoothListener bluetoothListener10 = this.f67523a;
                if (bluetoothListener10 != null) {
                    bluetoothListener10.onError(gson.toJson((JsonElement) new ResponseError(string5).setStatus("04").getResponse()));
                }
                break;
            case 13:
                String string6 = message.getData().getString(BluetoothState.ERROR_DESCRIPTION);
                BluetoothListener bluetoothListener11 = this.f67523a;
                if (bluetoothListener11 != null) {
                    bluetoothListener11.onError(gson.toJson((JsonElement) new ResponseError(string6).setStatus("ZZ").getResponse()));
                }
                break;
            case 14:
                ResponseOk responseOk3 = (ResponseOk) new ResponseOk(message.getData().getString(BluetoothState.SCAN_STATE)).setStatus("00");
                BluetoothListener bluetoothListener12 = this.f67523a;
                if (bluetoothListener12 != null) {
                    bluetoothListener12.onStateChanged(gson.toJson((JsonElement) responseOk3.getResponse()));
                }
                break;
            case 15:
                BluetoothListener bluetoothListener13 = this.f67523a;
                if (bluetoothListener13 != null) {
                    bluetoothListener13.onStateChanged(gson.toJson((JsonElement) new ResponseOk("Scanning finished").setStatus("11").getResponse()));
                }
                break;
            case 16:
                BluetoothListener bluetoothListener14 = this.f67523a;
                if (bluetoothListener14 != null) {
                    bluetoothListener14.onStateChanged(gson.toJson((JsonElement) new ResponseOk("No scan running").setStatus(EglobalUtils.READ_MODE_CONTACTLESS_EMV).getResponse()));
                }
                break;
            case 17:
                String string7 = message.getData().getString(BluetoothState.ERROR_DESCRIPTION);
                BluetoothListener bluetoothListener15 = this.f67523a;
                if (bluetoothListener15 != null) {
                    bluetoothListener15.onError(gson.toJson((JsonElement) new ResponseError(string7).setStatus("02").getResponse()));
                }
                break;
            case 18:
                String string8 = message.getData().getString(BluetoothState.ERROR_DESCRIPTION);
                BluetoothListener bluetoothListener16 = this.f67523a;
                if (bluetoothListener16 != null) {
                    bluetoothListener16.onError(gson.toJson((JsonElement) new ResponseError(string8).setStatus("08").getResponse()));
                }
                break;
        }
    }

    public void setBluetoothListener(BluetoothListener bluetoothListener) {
        this.f67523a = bluetoothListener;
    }
}
