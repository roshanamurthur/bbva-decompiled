package com.vierge.bluetoothlibrary;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import ej.a;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class BtDevices {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothAdapter f67498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<BluetoothDevice> f67499b = new ArrayList<>();

    public ArrayList<BluetoothDevice> getListPairedDevices() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f67498a = defaultAdapter;
        if (defaultAdapter.isDiscovering()) {
            this.f67498a.cancelDiscovery();
        }
        Set<BluetoothDevice> bondedDevices = this.f67498a.getBondedDevices();
        bondedDevices.toString();
        int size = bondedDevices.size();
        ArrayList<BluetoothDevice> arrayList = this.f67499b;
        if (size > 0) {
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                bluetoothDevice.getName().toString();
                if (a.a(bluetoothDevice.getName())) {
                    arrayList.add(bluetoothDevice);
                }
            }
        }
        return arrayList;
    }
}
