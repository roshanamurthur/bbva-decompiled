package com.bbva.tohu.android.product.valkyria.sdk.response;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class CurrentDeviceInfo {
    String cardUniqueReference;
    Boolean isFavourite;
    String state;
    Boolean storageInDevice;

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public Boolean getFavourite() {
        return this.isFavourite;
    }

    public String getState() {
        return this.state;
    }

    public Boolean getStorageInDevice() {
        return this.storageInDevice;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setFavourite(Boolean bool) {
        this.isFavourite = bool;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setStorageInDevice(Boolean bool) {
        this.storageInDevice = bool;
    }

    public String toString() {
        return "CurrentDeviceInfo{cardUniqueReference='" + this.cardUniqueReference + "', state='" + this.state + "', storageInDevice=" + this.storageInDevice + ", isFavourite=" + this.isFavourite + AbstractJsonLexerKt.END_OBJ;
    }
}
