package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class Update {
    private String Account_Params_Index;
    private String CDCVM_Verified;
    private String CDCVM_Verify_Entity_Type;
    private String Expiration_TS;
    private String LUK;
    private String No_of_Txn;
    private String ReadyPayState;

    public String getAccount_Params_Index() {
        return this.Account_Params_Index;
    }

    public String getCDCVM_Verified() {
        return this.CDCVM_Verified;
    }

    public String getCDCVM_Verify_Entity_Type() {
        return this.CDCVM_Verify_Entity_Type;
    }

    public String getExpiration_TS() {
        return this.Expiration_TS;
    }

    public String getLUK() {
        return this.LUK;
    }

    public String getNo_of_Txn() {
        return this.No_of_Txn;
    }

    public String getReadyPayState() {
        return this.ReadyPayState;
    }

    public void setAccount_Params_Index(String str) {
        this.Account_Params_Index = str;
    }

    public void setCDCVM_Verified(String str) {
        this.CDCVM_Verified = str;
    }

    public void setCDCVM_Verify_Entity_Type(String str) {
        this.CDCVM_Verify_Entity_Type = str;
    }

    public void setExpiration_TS(String str) {
        this.Expiration_TS = str;
    }

    public void setLUK(String str) {
        this.LUK = str;
    }

    public void setNo_of_Txn(String str) {
        this.No_of_Txn = str;
    }

    public void setReadyPayState(String str) {
        this.ReadyPayState = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Update{No_of_Txn='");
        sb2.append(this.No_of_Txn);
        sb2.append("', Expiration_TS='");
        sb2.append(this.Expiration_TS);
        sb2.append("', LUK='");
        sb2.append(this.LUK);
        sb2.append("', Account_Params_Index='");
        sb2.append(this.Account_Params_Index);
        sb2.append("', ReadyPayState='");
        return d.f(sb2, this.ReadyPayState, "'}");
    }
}
