package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.ContactlessPayment;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.Record;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ContactlessPaymentDataDefaultImpl implements ContactlessPaymentData {
    private AlternateContactlessPaymentData alternateContactlessPaymentData;
    private ContactlessPayment contactlessPaymentData;
    private IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents;
    private Record[] records;

    public ContactlessPaymentDataDefaultImpl(ContactlessPayment contactlessPayment, byte[] bArr) {
        this.contactlessPaymentData = contactlessPayment;
        loadRecords(contactlessPayment.getRecords());
        this.alternateContactlessPaymentData = new AlternateContactlessPaymentDataDefaultImpl(contactlessPayment.getAlternateContactlessPayment());
        this.iccPrivateKeyCrtComponents = new IccPrivateKeyCrtComponentsDefaultImpl(contactlessPayment.getIccPrivateKeyCrtComponents(), bArr);
    }

    private void loadRecords(com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.Record[] recordArr) {
        ArrayList arrayList = new ArrayList();
        for (com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.Record record : recordArr) {
            arrayList.add(new RecordDefaultImpl(record));
        }
        Record[] recordArr2 = new Record[arrayList.size()];
        this.records = recordArr2;
        this.records = (Record[]) arrayList.toArray(recordArr2);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getAid() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getAid());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public AlternateContactlessPaymentData getAlternateContactlessPaymentData() {
        return this.alternateContactlessPaymentData;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public int getCdol1RelatedDataLength() {
        return Integer.parseInt(this.contactlessPaymentData.getCdol1RelatedDataLength(), 16);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getCiacDecline() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getCiacDecline());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getCiacDeclineOnPpms() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getCiacDeclineOnPpms());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getCvrMaskAnd() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getCvrMaskAnd());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getGpoResponse() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getGpoResponse());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public IccPrivateKeyCrtComponents getIccPrivateKeyCrtComponents() {
        return this.iccPrivateKeyCrtComponents;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getIssuerApplicationData() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getIssuerApplicationData());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getPaymentFci() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getPaymentFci());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getPinIvCvc3Track2() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getPinIvCvc3Track2());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public byte[] getPpseFci() {
        return McmLiteUtils.byteArrayFromHexString(this.contactlessPaymentData.getPpseFci());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public Record[] getRecords() {
        return this.records;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public boolean isAlternateAidMchipDataValid() {
        return this.alternateContactlessPaymentData != null;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public boolean isMagstripeDataValid() {
        return false;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public boolean isPrimaryAidMchipDataValid() {
        return true;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public void wipe() {
    }
}
