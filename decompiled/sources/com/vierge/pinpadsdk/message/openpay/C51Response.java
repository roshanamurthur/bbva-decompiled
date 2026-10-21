package com.vierge.pinpadsdk.message.openpay;

import androidx.camera.camera2.internal.compat.u;
import com.vierge.pinpadsdk.message.base.SeparatorLengthValue;

/* JADX INFO: loaded from: classes6.dex */
public class C51Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67542a = "Error Cardholder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67543b = "Error Track III";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f67544c = "Error Read Mode";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f67545d = "Error PIN Satus";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f67546e = "Error Card Bin";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f67547f = "Error Track II";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f67548g = "Error Version";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f67549h = "Error Serial";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f67550i = "Error TrackI";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f67551j = "Error model";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f67552k = "Error PAN";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f67553l = "Error CVV";
    public String m = "Error E2";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f67554n = "Error E1";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f67555o = "Error Token ES";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f67556p = "Error Token R1";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f67557q = "Error Token EZ";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f67558r = "Error Token EY";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f67559s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f67560t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f67561u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f67562v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f67563w = "Error Status";

    public String getCardBin() {
        return this.f67546e;
    }

    public String getCardholder() {
        return this.f67542a;
    }

    public String getCvv() {
        return this.f67553l;
    }

    public String getE1() {
        return this.f67554n;
    }

    public String getE2() {
        return this.m;
    }

    public String getKeyStatus() {
        return this.f67561u;
    }

    public String getModel() {
        return this.f67551j;
    }

    public String getPan() {
        return this.f67552k;
    }

    public String getPinStatus() {
        return this.f67545d;
    }

    public String getReadMode() {
        return this.f67544c;
    }

    public String getSerial() {
        return this.f67549h;
    }

    public String getStatus() {
        return this.f67563w;
    }

    public String getTokenCZ() {
        return this.f67562v;
    }

    public String getTokenES() {
        return this.f67555o;
    }

    public String getTokenEY() {
        return this.f67558r;
    }

    public String getTokenEY2() {
        return this.f67560t;
    }

    public String getTokenEZ() {
        return this.f67557q;
    }

    public String getTokenEZ2() {
        return this.f67559s;
    }

    public String getTokenR1() {
        return this.f67556p;
    }

    public String getTrackI() {
        return this.f67550i;
    }

    public String getTrackII() {
        return this.f67547f;
    }

    public String getTrackIII() {
        return this.f67543b;
    }

    public String getVersion() {
        return this.f67548g;
    }

    public void setCVV(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67553l = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67553l);
            this.f67553l = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setCardBin(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67546e = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67546e);
            this.f67546e = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setCardholder(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67542a = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67542a);
            this.f67542a = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setE1(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67554n = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67554n);
            this.f67554n = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setE2(SeparatorLengthValue separatorLengthValue, String str) {
        this.m = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.m);
            this.m = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setKeyStatus(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67561u = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67561u);
            this.f67561u = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setModel(String str) {
        this.f67551j = str;
    }

    public void setPan(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67552k = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67552k);
            this.f67552k = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setPinStatus(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67545d = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67545d);
            this.f67545d = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setReadMode(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67544c = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67544c);
            this.f67544c = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setSerial(String str) {
        this.f67549h = str;
    }

    public void setStatus(String str) {
        this.f67563w = str;
    }

    public void setTokenCZ(String str) {
        this.f67562v = str;
    }

    public void setTokenES(String str) {
        this.f67555o = str;
    }

    public void setTokenEY(String str) {
        this.f67558r = str;
    }

    public void setTokenEY2(String str) {
        this.f67560t = str;
    }

    public void setTokenEZ(String str) {
        this.f67557q = str;
    }

    public void setTokenEZ2(String str) {
        this.f67559s = str;
    }

    public void setTokenR1(String str) {
        this.f67556p = str;
    }

    public void setTrackI(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67550i = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67550i);
            this.f67550i = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setTrackII(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67547f = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67547f);
            this.f67547f = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setTrackIII(SeparatorLengthValue separatorLengthValue, String str) {
        this.f67543b = "";
        for (int i10 = 0; i10 < separatorLengthValue.getRawValue().size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f67543b);
            this.f67543b = u.h(str, new Object[]{separatorLengthValue.getRawValue().get(i10)}, sb2);
        }
    }

    public void setVersion(String str) {
        this.f67548g = str;
    }

    public void setKeyStatus(String str) {
        this.f67561u = str;
    }
}
