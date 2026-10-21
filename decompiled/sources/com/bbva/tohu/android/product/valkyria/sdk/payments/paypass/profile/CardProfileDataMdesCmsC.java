package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.AlternateContactlessPayment;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.CardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.CardRiskManagement;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.ContactlessPayment;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.IccPrivateKeyCrtComponents;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.MppLiteModule;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.Record;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.RemotePayment;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.AlternateContactlessPaymentData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.CardRiskManagementData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.Records;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import flexjson.JSON;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

/* JADX INFO: loaded from: classes6.dex */
public class CardProfileDataMdesCmsC {

    @JSON(name = "cardProfile")
    private CardProfileMdesCmsC cardProfile;

    @JSON(name = "iccKek")
    private String iccKek;

    @JSON(name = "kekId")
    private String kekId;

    private String convertByteArrayToHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return McmLiteUtils.byteArrayToHexString(bArr);
    }

    public static CardProfileDataMdesCmsC valueOf(String str) {
        CardProfileDataMdesCmsC cardProfileDataMdesCmsC = (CardProfileDataMdesCmsC) new JSONDeserializer().deserialize(str, CardProfileDataMdesCmsC.class);
        if (cardProfileDataMdesCmsC.cardProfile == null) {
            return null;
        }
        return cardProfileDataMdesCmsC;
    }

    public CardProfileMdesCmsC getCardProfile() {
        return this.cardProfile;
    }

    public String getIccKek() {
        return this.iccKek;
    }

    public String getKekId() {
        return this.kekId;
    }

    public CardProfile mapCardProfileDataMdesToPojo() {
        CardProfile cardProfile = new CardProfile();
        cardProfile.setIccKek(McmLiteUtils.byteArrayFromHexString(getIccKek()));
        cardProfile.setDigitizedCardId(getCardProfile().getDigitizedCardId());
        MppLiteModule mppLiteModule = new MppLiteModule();
        cardProfile.setMppLiteModule(mppLiteModule);
        CardRiskManagement cardRiskManagement = new CardRiskManagement();
        mppLiteModule.setCardRiskManagement(cardRiskManagement);
        CardRiskManagementData cardRiskManagementData = getCardProfile().getMppLiteModule().getCardRiskManagementData();
        if (cardRiskManagementData != null) {
            cardRiskManagement.setAdditionalCheckTable(convertByteArrayToHexString(cardRiskManagementData.getAdditionalCheckTable()));
            cardRiskManagement.setCrmCountryCode(convertByteArrayToHexString(cardRiskManagementData.getCrmCountryCode()));
        }
        ContactlessPayment contactlessPayment = new ContactlessPayment();
        ContactlessPaymentData contactlessPaymentData = getCardProfile().getMppLiteModule().getContactlessPaymentData();
        if (contactlessPaymentData != null) {
            contactlessPayment.setAid(convertByteArrayToHexString(contactlessPaymentData.getAid()));
            contactlessPayment.setCdol1RelatedDataLength(convertByteArrayToHexString(contactlessPaymentData.getCdol1RelatedDataLength()));
            contactlessPayment.setCiacDecline(convertByteArrayToHexString(contactlessPaymentData.getCiacDecline()));
            contactlessPayment.setCiacDeclineOnPpms(convertByteArrayToHexString(contactlessPaymentData.getCiacDeclineOnPpms()));
            contactlessPayment.setCvrMaskAnd(convertByteArrayToHexString(contactlessPaymentData.getCvrMaskAnd()));
            contactlessPayment.setGpoResponse(convertByteArrayToHexString(contactlessPaymentData.getGpoResponse()));
            contactlessPayment.setIssuerApplicationData(convertByteArrayToHexString(contactlessPaymentData.getIssuerApplicationData()));
            contactlessPayment.setPaymentFci(convertByteArrayToHexString(contactlessPaymentData.getPaymentFci()));
            contactlessPayment.setPinIvCvc3Track2(convertByteArrayToHexString(contactlessPaymentData.getPinIvCvc3Track2()));
            contactlessPayment.setPpseFci(convertByteArrayToHexString(contactlessPaymentData.getPpseFci()));
        }
        AlternateContactlessPayment alternateContactlessPayment = new AlternateContactlessPayment();
        contactlessPayment.setAlternateContactlessPayment(alternateContactlessPayment);
        AlternateContactlessPaymentData alternateContactlessPaymentData = contactlessPaymentData.getAlternateContactlessPaymentData();
        if (alternateContactlessPaymentData != null) {
            alternateContactlessPayment.setPaymentFci(convertByteArrayToHexString(alternateContactlessPaymentData.getPaymentFci()));
            alternateContactlessPayment.setAid(convertByteArrayToHexString(alternateContactlessPaymentData.getAid()));
            alternateContactlessPayment.setCiacDecline(convertByteArrayToHexString(alternateContactlessPaymentData.getCiacDecline()));
            alternateContactlessPayment.setGpoResponse(convertByteArrayToHexString(alternateContactlessPaymentData.getGpoResponse()));
            alternateContactlessPayment.setCvrMaskAnd(convertByteArrayToHexString(alternateContactlessPaymentData.getCvrMaskAnd()));
        }
        IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents = new IccPrivateKeyCrtComponents();
        com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents2 = contactlessPaymentData.getIccPrivateKeyCrtComponents();
        iccPrivateKeyCrtComponents.setDpValue(convertByteArrayToHexString(iccPrivateKeyCrtComponents2.getDp()));
        iccPrivateKeyCrtComponents.setDqValue(convertByteArrayToHexString(iccPrivateKeyCrtComponents2.getDq()));
        iccPrivateKeyCrtComponents.setpValue(convertByteArrayToHexString(iccPrivateKeyCrtComponents2.getP()));
        iccPrivateKeyCrtComponents.setqValue(convertByteArrayToHexString(iccPrivateKeyCrtComponents2.getQ()));
        iccPrivateKeyCrtComponents.setuValue(convertByteArrayToHexString(iccPrivateKeyCrtComponents2.getU()));
        contactlessPayment.setIccPrivateKeyCrtComponents(iccPrivateKeyCrtComponents);
        Records[] records = contactlessPaymentData.getRecords();
        Record[] recordArr = new Record[records.length];
        int length = records.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Records records2 = records[i10];
            Record record = new Record();
            record.setRecordNumber(records2.getRecordNumber());
            record.setRecordValue(convertByteArrayToHexString(records2.getRecordValue()));
            record.setSfi(convertByteArrayToHexString(new byte[]{records2.getSfi()}));
            recordArr[i11] = record;
            i10++;
            i11++;
        }
        contactlessPayment.setRecords(recordArr);
        mppLiteModule.setContactlessPaymentData(contactlessPayment);
        RemotePayment remotePayment = new RemotePayment();
        RemotePaymentData remotePaymentData = getCardProfile().getMppLiteModule().getRemotePaymentData();
        if (remotePaymentData != null) {
            remotePayment.setAip(convertByteArrayToHexString(remotePaymentData.getAip()));
            remotePayment.setApplicationExpiryDate(convertByteArrayToHexString(remotePaymentData.getApplicationExpiryDate()));
            remotePayment.setCiacDecline(convertByteArrayToHexString(remotePaymentData.getCiacDecline()));
            remotePayment.setCvrMaskAnd(convertByteArrayToHexString(remotePaymentData.getCvrMaskAnd()));
            remotePayment.setIssuerApplicationData(convertByteArrayToHexString(remotePaymentData.getIssuerApplicationData()));
            remotePayment.setPan(convertByteArrayToHexString(remotePaymentData.getPan()));
            remotePayment.setPanSequenceNumber(convertByteArrayToHexString(remotePaymentData.getPanSequenceNumber()));
            remotePayment.setTrack2Equivalent(convertByteArrayToHexString(remotePaymentData.getTrack2Equivalent()));
        }
        mppLiteModule.setRemotePaymentData(remotePayment);
        return cardProfile;
    }

    public void setCardProfile(CardProfileMdesCmsC cardProfileMdesCmsC) {
        this.cardProfile = cardProfileMdesCmsC;
    }

    public void setIccKek(String str) {
        this.iccKek = str;
    }

    public void setKekId(String str) {
        this.kekId = str;
    }

    public String toJson() {
        return new JSONSerializer().serialize(this);
    }
}
