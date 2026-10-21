package com.bbva.sl.ar.android.secsdk.fido.model;

import ad.d;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class FidoDeviceInfo {

    @NonNull
    private String brand;

    @NonNull
    private String id;

    @NonNull
    private String model;

    @NonNull
    private String name;

    @NonNull
    private String os;

    @NonNull
    private String type;

    @Deprecated
    public FidoDeviceInfo(@NonNull String str, @NonNull String str2) {
        this.name = str;
        this.id = str2;
        this.brand = "";
        this.model = "";
        this.os = "";
        this.type = "";
    }

    @NonNull
    public String getBrand() {
        return this.brand;
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @NonNull
    public String getModel() {
        return this.model;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String getOs() {
        return this.os;
    }

    @NonNull
    public String getType() {
        return this.type;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FidoDeviceInfo{name='");
        sb2.append(this.name);
        sb2.append("', id='");
        sb2.append(this.id);
        sb2.append("', brand='");
        sb2.append(this.brand);
        sb2.append("', model='");
        sb2.append(this.model);
        sb2.append("', os='");
        sb2.append(this.os);
        sb2.append("', type='");
        return d.f(sb2, this.type, "'}");
    }

    public FidoDeviceInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6) {
        this.name = str;
        this.id = str2;
        this.brand = str3;
        this.model = str4;
        this.os = str5;
        this.type = str6;
    }
}
