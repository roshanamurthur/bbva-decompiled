package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class CardProfile {
    private String digitizedCardId;
    private int maximumPinTry;
    private MppLiteModule mppLiteModule = null;
    private BusinessLogicModule businessLogicModule = null;
    private byte[] iccKek = null;
    private byte[] kekId = null;

    public BusinessLogicModule getBusinessLogicModule() {
        return this.businessLogicModule;
    }

    public String getDigitizedCardId() {
        return this.digitizedCardId;
    }

    public byte[] getIccKek() {
        return this.iccKek;
    }

    public byte[] getKekId() {
        return this.kekId;
    }

    public int getMaximumPinTry() {
        return this.maximumPinTry;
    }

    public MppLiteModule getMppLiteModule() {
        return this.mppLiteModule;
    }

    public void setBusinessLogicModule(BusinessLogicModule businessLogicModule) {
        this.businessLogicModule = businessLogicModule;
    }

    public void setDigitizedCardId(String str) {
        this.digitizedCardId = str;
    }

    public void setIccKek(byte[] bArr) {
        this.iccKek = bArr;
    }

    public void setKekId(byte[] bArr) {
        this.kekId = bArr;
    }

    public void setMaximumPinTry(int i10) {
        this.maximumPinTry = i10;
    }

    public void setMppLiteModule(MppLiteModule mppLiteModule) {
        this.mppLiteModule = mppLiteModule;
    }
}
