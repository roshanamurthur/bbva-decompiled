package com.vierge.bluetoothlibrary;

/* JADX INFO: loaded from: classes11.dex */
public interface BluetoothListener {
    @Deprecated
    void onDeviceName(String str);

    void onError(String str);

    @Deprecated
    void onNewDeviceFound(String str, String str2);

    void onReadMessage(String str);

    void onReadMessage(byte[] bArr);

    @Deprecated
    void onStateChanged(int i10);

    void onStateChanged(String str);

    @Deprecated
    void onToast(String str);

    void onWriteMessage(String str);

    void onWriteMessage(byte[] bArr);
}
