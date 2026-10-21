package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
interface BluetoothService extends PeripheralService {
    void registerForDevice(String str, PeripheralService.Callback callback);

    void startScan();

    void stopScan();
}
