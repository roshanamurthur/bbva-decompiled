package com.viergegroup.sdk.taptophone.webApi;

/* JADX INFO: loaded from: classes7.dex */
public class LogRequestDto {
    public String hostType;
    public String logData;
    public String rrn;
    public String terminalSerialNumber;

    public String getHostType() {
        return this.hostType;
    }

    public String getLogData() {
        return this.logData;
    }

    public String getRrn() {
        return this.rrn;
    }

    public String getTerminalSerialNumber() {
        return this.terminalSerialNumber;
    }

    public void setHostType(String str) {
        this.hostType = str;
    }

    public void setLogData(String str) {
        this.logData = str;
    }

    public void setRrn(String str) {
        this.rrn = str;
    }

    public void setTerminalSerialNumber(String str) {
        this.terminalSerialNumber = String.format("%20s", str).replace(' ', '0');
    }
}
