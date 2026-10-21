package com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto;

import ad.d;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;

/* JADX INFO: loaded from: classes6.dex */
public class BulletDto {
    private String cur;
    private String id;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f36932s;
    private String timestamp;
    private String tt;

    public BulletDto(Bullet bullet) {
        this.id = bullet.getBulletId();
        this.cur = bullet.getToken().getCardUniqueReference();
        this.f36932s = bullet.getStatus();
        this.tt = bullet.getTransactionType();
        this.timestamp = bullet.getTimestamp();
    }

    public String getCur() {
        return this.cur;
    }

    public String getId() {
        return this.id;
    }

    public String getS() {
        return this.f36932s;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getTt() {
        return this.tt;
    }

    public void setCur(String str) {
        this.cur = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setS(String str) {
        this.f36932s = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setTt(String str) {
        this.tt = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BulletDto{id='");
        sb2.append(this.id);
        sb2.append("', cur='");
        sb2.append(this.cur);
        sb2.append("', s='");
        sb2.append(this.f36932s);
        sb2.append("', tt='");
        sb2.append(this.tt);
        sb2.append("', timestamp='");
        return d.f(sb2, this.timestamp, "'}");
    }
}
