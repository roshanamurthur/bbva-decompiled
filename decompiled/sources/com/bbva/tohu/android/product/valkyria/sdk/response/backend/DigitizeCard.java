package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class DigitizeCard {
    private String cardUniqueReference;
    private String status;
    private String taskId;

    public DigitizeCard(String str, String str2, String str3) {
        this.cardUniqueReference = str;
        this.status = str2;
        this.taskId = str3;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DigitizeCard{cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', status='");
        sb2.append(this.status);
        sb2.append("', taskId='");
        return d.f(sb2, this.taskId, "'}");
    }
}
