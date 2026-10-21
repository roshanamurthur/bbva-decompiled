package com.bbva.tohu.android.product.valkyria.sdk.beans;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PaymentBullet {
    private String bulletId;
    private List<PaymentKey> extraParams;
    private List<PaymentKey> keys;

    public PaymentBullet(String str, List<PaymentKey> list) {
        this.bulletId = str;
        this.keys = list;
    }

    public String getBulletId() {
        return this.bulletId;
    }

    public List<PaymentKey> getExtraParams() {
        return this.extraParams;
    }

    public List<PaymentKey> getKeys() {
        return this.keys;
    }

    public void setBulletId(String str) {
        this.bulletId = str;
    }

    public void setExtraParams(List<PaymentKey> list) {
        this.extraParams = list;
    }

    public void setKeys(List<PaymentKey> list) {
        this.keys = list;
    }

    public String toString() {
        return " bulletId=" + this.bulletId;
    }

    public PaymentBullet() {
    }
}
