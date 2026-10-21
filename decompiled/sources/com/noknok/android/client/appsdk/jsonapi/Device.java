package com.noknok.android.client.appsdk.jsonapi;

import android.os.Build;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.appsdk.common.DeviceIDUtil;
import com.noknok.android.client.appsdk.common.Fido2Helper;
import com.noknok.android.client.utils.ActivityProxy;

/* JADX INFO: loaded from: classes11.dex */
public class Device {

    @Expose
    public String id;

    @Expose
    public String info;

    @Expose
    public String manufacturer;

    @Expose
    public String model;

    @Expose
    public String os;

    @Expose
    public boolean supportsPlatformAuthenticator;

    @Expose
    public String type;

    public Device(String str) {
        this.id = str;
        this.type = "android";
    }

    public Device(ActivityProxy activityProxy) {
        this(new DeviceIDUtil(activityProxy.getApplicationContext()).getDeviceId());
        StringBuilder sb2 = new StringBuilder();
        String str = Build.MANUFACTURER;
        sb2.append(str);
        sb2.append(" ");
        sb2.append(Build.DEVICE);
        this.info = sb2.toString();
        this.manufacturer = str;
        this.model = Build.MODEL;
        this.os = this.type + " " + Build.VERSION.RELEASE;
        if (activityProxy.hasActivity()) {
            this.supportsPlatformAuthenticator = Fido2Helper.isPlatformAuthenticatorSupported(activityProxy);
        }
    }
}
