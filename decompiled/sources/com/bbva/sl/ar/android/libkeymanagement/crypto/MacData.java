package com.bbva.sl.ar.android.libkeymanagement.crypto;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class MacData {
    private String derivationComplement;
    private Map<String, String> derivationId;
    private String mac;

    public MacData(Map<String, String> map, String str, String str2) {
        this.derivationId = map;
        this.derivationComplement = str;
        this.mac = str2;
    }

    public String getDerivationComplement() {
        return this.derivationComplement;
    }

    public Map<String, String> getDerivationId() {
        return this.derivationId;
    }

    public String getMac() {
        return this.mac;
    }

    public void setDerivationComplement(String str) {
        this.derivationComplement = str;
    }

    public void setDerivationId(Map<String, String> map) {
        this.derivationId = map;
    }

    public void setMac(String str) {
        this.mac = str;
    }
}
