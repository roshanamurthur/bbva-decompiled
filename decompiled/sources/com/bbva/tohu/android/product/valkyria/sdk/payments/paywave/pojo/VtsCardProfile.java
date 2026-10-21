package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import flexjson.JSONDeserializer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VtsCardProfile {
    private ODAData ODAData;
    private ChannelSecurityContext channelSecurityContext;
    private String decTokenInfo;
    private String encryptionMetaData;
    private IccCrtPrivateKey iccCRTPrivateKey;
    private String iccPrivateKey;
    private PaymentInstrument paymentInstrument;
    private List<StepUpRequest> stepUpRequest;
    private String token;
    private TokenInfo tokenInfo;
    private String vPanEnrollmentID;
    private String vProvisionedTokenID;

    public static VtsCardProfile valueOf(String str) {
        return (VtsCardProfile) new JSONDeserializer().deserialize(str, VtsCardProfile.class);
    }

    public ChannelSecurityContext getChannelSecurityContext() {
        return this.channelSecurityContext;
    }

    public String getDecTokenInfo() {
        return this.decTokenInfo;
    }

    public String getEncryptionMetaData() {
        return this.encryptionMetaData;
    }

    public IccCrtPrivateKey getIccCRTPrivateKey() {
        return this.iccCRTPrivateKey;
    }

    public String getIccPrivateKey() {
        return this.iccPrivateKey;
    }

    public ODAData getODAData() {
        return this.ODAData;
    }

    public PaymentInstrument getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public List<StepUpRequest> getStepUpRequest() {
        return this.stepUpRequest;
    }

    public String getToken() {
        return this.token;
    }

    public TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public String getvPanEnrollmentID() {
        return this.vPanEnrollmentID;
    }

    public String getvProvisionedTokenID() {
        return this.vProvisionedTokenID;
    }

    public void setChannelSecurityContext(ChannelSecurityContext channelSecurityContext) {
        this.channelSecurityContext = channelSecurityContext;
    }

    public void setDecTokenInfo(String str) {
        this.decTokenInfo = str;
    }

    public void setEncryptionMetaData(String str) {
        this.encryptionMetaData = str;
    }

    public void setIccCRTPrivateKey(IccCrtPrivateKey iccCrtPrivateKey) {
        this.iccCRTPrivateKey = iccCrtPrivateKey;
    }

    public void setIccPrivateKey(String str) {
        this.iccPrivateKey = str;
    }

    public void setODAData(ODAData oDAData) {
        this.ODAData = oDAData;
    }

    public void setPaymentInstrument(PaymentInstrument paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public void setStepUpRequest(List<StepUpRequest> list) {
        this.stepUpRequest = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTokenInfo(TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
    }

    public void setvPanEnrollmentID(String str) {
        this.vPanEnrollmentID = str;
    }

    public void setvProvisionedTokenID(String str) {
        this.vProvisionedTokenID = str;
    }
}
