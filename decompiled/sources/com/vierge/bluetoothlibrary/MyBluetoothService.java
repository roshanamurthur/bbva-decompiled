package com.vierge.bluetoothlibrary;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import mx.openpay.library.data.util.EglobalUtils;
import responsebt.ResponseError;
import responsebt.ResponseOk;

/* JADX INFO: loaded from: classes11.dex */
public class MyBluetoothService {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final UUID f67500l = UUID.fromString("d6cda4b2-4903-11e8-842f-0ed5f89f718b");
    public static final UUID m = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f67502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f67503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f67504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f67505e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Activity f67508h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<BluetoothDevice> f67510j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f67507g = true;
    public HashMap<String, String> foundDevices = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Gson f67509i = new GsonBuilder().setPrettyPrinting().create();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f67511k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothAdapter f67501a = BluetoothAdapter.getDefaultAdapter();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67506f = 0;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            boolean zEquals = "android.bluetooth.device.action.FOUND".equals(action);
            MyBluetoothService myBluetoothService = MyBluetoothService.this;
            if (zEquals) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice.getBondState() == 12 || bluetoothDevice.getAddress().equalsIgnoreCase("1F:1F:1F:1F:1F:1F") || bluetoothDevice.getName() == null || !ej.a.a(bluetoothDevice.getName())) {
                    return;
                }
                myBluetoothService.foundDevices.put(bluetoothDevice.getName(), bluetoothDevice.getAddress());
                return;
            }
            if (!"android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                if ("android.bluetooth.adapter.action.DISCOVERY_STARTED".equals(action)) {
                    myBluetoothService.foundDevices = new HashMap<>();
                    Message messageObtainMessage = myBluetoothService.f67502b.obtainMessage(8);
                    Bundle bundle = new Bundle();
                    bundle.putString(BluetoothState.SCAN_STATE, "Scanning starting");
                    messageObtainMessage.setData(bundle);
                    myBluetoothService.f67502b.sendMessage(messageObtainMessage);
                    return;
                }
                return;
            }
            Message messageObtainMessage2 = myBluetoothService.f67502b.obtainMessage(15);
            Bundle bundle2 = new Bundle();
            bundle2.putString(BluetoothState.SCAN_STATE, "Scanning finished");
            messageObtainMessage2.setData(bundle2);
            myBluetoothService.f67502b.sendMessage(messageObtainMessage2);
            if (myBluetoothService.foundDevices.isEmpty()) {
                Message messageObtainMessage3 = myBluetoothService.f67502b.obtainMessage(9);
                new Bundle().putString(BluetoothState.SCAN_STATE, "No devices found");
                myBluetoothService.f67502b.sendMessage(messageObtainMessage3);
            } else {
                Message messageObtainMessage4 = myBluetoothService.f67502b.obtainMessage(7);
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("device_name", myBluetoothService.foundDevices);
                messageObtainMessage4.setData(bundle3);
                myBluetoothService.f67502b.sendMessage(messageObtainMessage4);
            }
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BluetoothServerSocket f67513p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f67514q0 = true;

        public b(boolean z10) {
            BluetoothServerSocket bluetoothServerSocketListenUsingRfcommWithServiceRecord;
            try {
                bluetoothServerSocketListenUsingRfcommWithServiceRecord = z10 ? MyBluetoothService.this.f67501a.listenUsingRfcommWithServiceRecord("Bluetooth Secure", MyBluetoothService.f67500l) : MyBluetoothService.this.f67501a.listenUsingRfcommWithServiceRecord("Bluetooth Secure", MyBluetoothService.m);
            } catch (IOException unused) {
                bluetoothServerSocketListenUsingRfcommWithServiceRecord = null;
            }
            this.f67513p0 = bluetoothServerSocketListenUsingRfcommWithServiceRecord;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("AcceptThreadnull");
            while (MyBluetoothService.this.f67506f != 3 && this.f67514q0) {
                try {
                    BluetoothSocket bluetoothSocketAccept = this.f67513p0.accept();
                    if (bluetoothSocketAccept != null) {
                        synchronized (MyBluetoothService.this) {
                            MyBluetoothService myBluetoothService = MyBluetoothService.this;
                            int i10 = myBluetoothService.f67506f;
                            if (i10 == 0) {
                                try {
                                    bluetoothSocketAccept.close();
                                } catch (IOException unused) {
                                }
                            } else if (i10 == 1 || i10 == 2) {
                                myBluetoothService.connected(bluetoothSocketAccept, bluetoothSocketAccept.getRemoteDevice(), null);
                            } else if (i10 == 3) {
                                bluetoothSocketAccept.close();
                            }
                        }
                    }
                } catch (IOException unused2) {
                    return;
                }
            }
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BluetoothSocket f67516p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BluetoothDevice f67517q0;

        public c(BluetoothDevice bluetoothDevice) {
            BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord;
            this.f67517q0 = bluetoothDevice;
            try {
                bluetoothSocketCreateRfcommSocketToServiceRecord = MyBluetoothService.this.f67507g ? bluetoothDevice.createRfcommSocketToServiceRecord(MyBluetoothService.f67500l) : bluetoothDevice.createRfcommSocketToServiceRecord(MyBluetoothService.m);
            } catch (IOException unused) {
                bluetoothSocketCreateRfcommSocketToServiceRecord = null;
            }
            this.f67516p0 = bluetoothSocketCreateRfcommSocketToServiceRecord;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            MyBluetoothService myBluetoothService;
            MyBluetoothService.this.f67501a.cancelDiscovery();
            try {
                this.f67516p0.connect();
                synchronized (MyBluetoothService.this) {
                    myBluetoothService = MyBluetoothService.this;
                    myBluetoothService.f67504d = null;
                }
                myBluetoothService.connected(this.f67516p0, this.f67517q0, null);
            } catch (IOException e5) {
                try {
                    this.f67516p0.close();
                } catch (IOException unused) {
                }
                MyBluetoothService myBluetoothService2 = MyBluetoothService.this;
                String localizedMessage = e5.getLocalizedMessage();
                myBluetoothService2.startListen(myBluetoothService2.f67507g);
                Handler handler = myBluetoothService2.f67502b;
                Message messageObtainMessage = handler.obtainMessage(11);
                Bundle bundle = new Bundle();
                bundle.putString(BluetoothState.ERROR_DESCRIPTION, "Connection failed. " + localizedMessage);
                messageObtainMessage.setData(bundle);
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    public class d extends Thread {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BluetoothSocket f67519p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final InputStream f67520q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final OutputStream f67521r0;

        public d(BluetoothSocket bluetoothSocket) {
            InputStream inputStream;
            this.f67519p0 = bluetoothSocket;
            OutputStream outputStream = null;
            try {
                inputStream = bluetoothSocket.getInputStream();
                try {
                    outputStream = bluetoothSocket.getOutputStream();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                inputStream = null;
            }
            this.f67520q0 = inputStream;
            this.f67521r0 = outputStream;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            MyBluetoothService myBluetoothService = MyBluetoothService.this;
            InputStream inputStream = this.f67520q0;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            ArrayList arrayList = new ArrayList();
            while (true) {
                try {
                    try {
                        int iAvailable = inputStream.available();
                        if (iAvailable > 0) {
                            byte[] bArr = new byte[iAvailable];
                            int i10 = inputStream.read(bArr, 0, iAvailable);
                            for (int i11 = 0; i11 < iAvailable; i11++) {
                                arrayList.add(Byte.valueOf(bArr[i11]));
                            }
                            short[] sArr = new short[i10];
                            for (int i12 = 0; i12 < iAvailable; i12++) {
                                sArr[i12] = bArr[i12];
                            }
                            if (i10 > 0) {
                                myBluetoothService.f67502b.obtainMessage(2, i10, -1, sArr).sendToTarget();
                            }
                        }
                    } catch (IOException unused) {
                        myBluetoothService.startListen(myBluetoothService.f67507g);
                        Handler handler = myBluetoothService.f67502b;
                        Message messageObtainMessage = handler.obtainMessage(12);
                        Bundle bundle = new Bundle();
                        bundle.putString(BluetoothState.ERROR_DESCRIPTION, "Connection lost");
                        messageObtainMessage.setData(bundle);
                        handler.sendMessage(messageObtainMessage);
                        try {
                            bufferedReader.close();
                            return;
                        } catch (IOException unused2) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                    throw th2;
                }
            }
        }
    }

    public MyBluetoothService(Handler handler) {
        this.f67502b = handler;
    }

    public final synchronized void a(int i10) {
        this.f67506f = i10;
        this.f67502b.obtainMessage(1, i10, -1).sendToTarget();
    }

    public void cancelScanning() {
        BluetoothAdapter bluetoothAdapter = this.f67501a;
        boolean zIsDiscovering = bluetoothAdapter.isDiscovering();
        Handler handler = this.f67502b;
        if (!zIsDiscovering) {
            Message messageObtainMessage = handler.obtainMessage(16);
            Bundle bundle = new Bundle();
            bundle.putString(BluetoothState.SCAN_STATE, "No scan running");
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            return;
        }
        bluetoothAdapter.cancelDiscovery();
        Message messageObtainMessage2 = handler.obtainMessage(8);
        Bundle bundle2 = new Bundle();
        bundle2.putString(BluetoothState.SCAN_STATE, "Discovering cancelled");
        messageObtainMessage2.setData(bundle2);
        handler.sendMessage(messageObtainMessage2);
    }

    public synchronized void connect(BluetoothDevice bluetoothDevice) {
        c cVar;
        if (!BluetoothAdapter.checkBluetoothAddress(bluetoothDevice.getAddress())) {
            Message messageObtainMessage = this.f67502b.obtainMessage(17);
            Bundle bundle = new Bundle();
            bundle.putString(BluetoothState.ERROR_DESCRIPTION, "Invalid MAC Address");
            messageObtainMessage.setData(bundle);
            this.f67502b.sendMessage(messageObtainMessage);
            return;
        }
        if (this.f67506f == 2 && (cVar = this.f67504d) != null) {
            try {
                cVar.f67516p0.close();
            } catch (IOException unused) {
            }
            this.f67504d = null;
        }
        d dVar = this.f67505e;
        if (dVar != null) {
            try {
                dVar.f67519p0.close();
            } catch (IOException unused2) {
            }
            this.f67505e = null;
        }
        c cVar2 = new c(bluetoothDevice);
        this.f67504d = cVar2;
        cVar2.start();
        a(2);
    }

    public synchronized void connected(BluetoothSocket bluetoothSocket, BluetoothDevice bluetoothDevice, String str) {
        try {
            c cVar = this.f67504d;
            if (cVar != null) {
                try {
                    cVar.f67516p0.close();
                } catch (IOException unused) {
                }
                this.f67504d = null;
            }
            d dVar = this.f67505e;
            if (dVar != null) {
                try {
                    dVar.f67519p0.close();
                } catch (IOException unused2) {
                }
                this.f67505e = null;
            }
            b bVar = this.f67503c;
            if (bVar != null) {
                try {
                    bVar.f67513p0.close();
                    bVar.f67513p0 = null;
                } catch (IOException unused3) {
                }
                this.f67503c = null;
            }
            d dVar2 = new d(bluetoothSocket);
            this.f67505e = dVar2;
            dVar2.start();
            Message messageObtainMessage = this.f67502b.obtainMessage(4);
            Bundle bundle = new Bundle();
            bundle.putString("device_name", bluetoothDevice.getName());
            bundle.putString(BluetoothState.DEVICE_ADDRESS, bluetoothDevice.getAddress());
            messageObtainMessage.setData(bundle);
            this.f67502b.sendMessage(messageObtainMessage);
            a(3);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public ArrayList<BluetoothDevice> getListPairedDevices() {
        this.f67510j = new ArrayList<>();
        BluetoothAdapter bluetoothAdapter = this.f67501a;
        if (bluetoothAdapter.isDiscovering()) {
            bluetoothAdapter.cancelDiscovery();
        }
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        if (bondedDevices.size() > 0) {
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                bluetoothDevice.getName().toString();
                if (ej.a.a(bluetoothDevice.getName())) {
                    this.f67510j.add(bluetoothDevice);
                }
            }
        }
        return this.f67510j;
    }

    public String getListPairedDevices2() {
        ResponseError responseError = new ResponseError();
        Gson gson = this.f67509i;
        BluetoothAdapter bluetoothAdapter = this.f67501a;
        if (bluetoothAdapter == null) {
            responseError.setMsg("Device doesn't support Bluetooth");
            responseError.setStatus("99");
            return gson.toJson((JsonElement) responseError.getResponse());
        }
        if (bluetoothAdapter.isDiscovering()) {
            bluetoothAdapter.cancelDiscovery();
        }
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        if (bondedDevices.size() <= 0) {
            responseError.setStatus(EglobalUtils.CARD_REMOVED);
            responseError.setMsg("Not devices found");
            return gson.toJson((JsonElement) responseError.getResponse());
        }
        ResponseOk responseOk = new ResponseOk();
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            bluetoothDevice.getName().toString();
            if (ej.a.a(bluetoothDevice.getName())) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("devicename", bluetoothDevice.getName());
                jsonObject2.addProperty("deviceaddress", bluetoothDevice.getAddress());
                jsonArray.add(jsonObject2);
            }
        }
        if (jsonArray.size() <= 0) {
            responseOk.setStatus(EglobalUtils.CARD_REMOVED);
            responseOk.setMsg("Not devices found");
            return gson.toJson((JsonElement) responseOk.getResponse());
        }
        jsonObject.add("pairedlist", jsonArray);
        responseOk.setMsg("Message was successfull");
        responseOk.setStatus(PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND);
        return gson.toJson((JsonElement) responseOk.getResponse(jsonObject));
    }

    public synchronized int getState() {
        return this.f67506f;
    }

    public String getVersion() {
        try {
            return this.f67508h.getPackageManager().getPackageInfo(this.f67508h.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            e5.toString();
            return CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
        }
    }

    public boolean scanNewDevices() {
        Activity activity = this.f67508h;
        Handler handler = this.f67502b;
        if (activity == null) {
            Message messageObtainMessage = handler.obtainMessage(13);
            Bundle bundle = new Bundle();
            bundle.putString(BluetoothState.ERROR_DESCRIPTION, "No activity defined");
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            return false;
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.FOUND");
        Activity activity2 = this.f67508h;
        a aVar = this.f67511k;
        activity2.registerReceiver(aVar, intentFilter);
        this.f67508h.registerReceiver(aVar, new IntentFilter("android.bluetooth.adapter.action.DISCOVERY_FINISHED"));
        this.f67508h.registerReceiver(aVar, new IntentFilter("android.bluetooth.adapter.action.DISCOVERY_STARTED"));
        BluetoothAdapter bluetoothAdapter = this.f67501a;
        if (bluetoothAdapter.isDiscovering()) {
            Message messageObtainMessage2 = handler.obtainMessage(14);
            Bundle bundle2 = new Bundle();
            bundle2.putString(BluetoothState.SCAN_STATE, "Discovering in progress");
            messageObtainMessage2.setData(bundle2);
            handler.sendMessage(messageObtainMessage2);
            return false;
        }
        bluetoothAdapter.startDiscovery();
        if (Build.VERSION.SDK_INT != 30) {
            return false;
        }
        SystemClock.sleep(500L);
        if (bluetoothAdapter.isDiscovering()) {
            return false;
        }
        Message messageObtainMessage3 = handler.obtainMessage(18);
        Bundle bundle3 = new Bundle();
        bundle3.putString(BluetoothState.ERROR_DESCRIPTION, "Please Start GPS Service to scan BT");
        messageObtainMessage3.setData(bundle3);
        handler.sendMessage(messageObtainMessage3);
        return true;
    }

    public void setMyActivity(Activity activity) {
        this.f67508h = activity;
    }

    public synchronized void startListen(boolean z10) {
        try {
            c cVar = this.f67504d;
            if (cVar != null) {
                try {
                    cVar.f67516p0.close();
                } catch (IOException unused) {
                }
                this.f67504d = null;
            }
            d dVar = this.f67505e;
            if (dVar != null) {
                try {
                    dVar.f67519p0.close();
                } catch (IOException unused2) {
                }
                this.f67505e = null;
            }
            a(1);
            if (this.f67503c == null) {
                b bVar = new b(z10);
                this.f67503c = bVar;
                bVar.start();
                this.f67507g = z10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void stop() {
        try {
            c cVar = this.f67504d;
            if (cVar != null) {
                try {
                    cVar.f67516p0.close();
                } catch (IOException unused) {
                }
                this.f67504d = null;
            }
            d dVar = this.f67505e;
            if (dVar != null) {
                try {
                    dVar.f67519p0.close();
                } catch (IOException unused2) {
                }
                this.f67505e = null;
            }
            b bVar = this.f67503c;
            if (bVar != null) {
                try {
                    bVar.f67513p0.close();
                    bVar.f67513p0 = null;
                } catch (IOException unused3) {
                }
                this.f67503c.f67514q0 = false;
                this.f67503c = null;
            }
            a(0);
            this.f67502b.sendMessage(this.f67502b.obtainMessage(10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void write(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f67506f != 3) {
                    return;
                }
                d dVar = this.f67505e;
                OutputStream outputStream = dVar.f67521r0;
                try {
                    outputStream.write(bArr);
                    outputStream.flush();
                    new String(bArr);
                    MyBluetoothService.this.f67502b.obtainMessage(3, -1, -1, bArr).sendToTarget();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void connect(String str) {
        try {
            connect(this.f67501a.getRemoteDevice(str));
        } catch (Exception e5) {
            Message messageObtainMessage = this.f67502b.obtainMessage(17);
            Bundle bundle = new Bundle();
            bundle.putString(BluetoothState.ERROR_DESCRIPTION, e5.getLocalizedMessage());
            messageObtainMessage.setData(bundle);
            this.f67502b.sendMessage(messageObtainMessage);
        }
    }
}
