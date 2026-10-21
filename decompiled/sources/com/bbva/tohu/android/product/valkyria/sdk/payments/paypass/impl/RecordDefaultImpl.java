package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.mastercard.mpsdk.mcbp.mcmlite.profile.Record;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes6.dex */
public class RecordDefaultImpl implements Record {
    private byte recordNumber;
    private byte[] recordValue;
    private byte sfi;

    public RecordDefaultImpl(byte b10, byte b11, byte[] bArr) {
        this.recordNumber = b10;
        this.sfi = (byte) (b11 >> 3);
        this.recordValue = bArr;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.Record
    public byte getRecordNumber() {
        return this.recordNumber;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.Record
    public byte[] getRecordValue() {
        return this.recordValue;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.Record
    public byte getSfi() {
        return this.sfi;
    }

    public RecordDefaultImpl(com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.Record record) {
        this.recordNumber = (byte) record.getRecordNumber();
        this.sfi = (byte) (McmLiteUtils.byteArrayFromHexString(record.getSfi())[0] >> 3);
        this.recordValue = McmLiteUtils.byteArrayFromHexString(record.getRecordValue());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.Record
    public void wipe() {
    }
}
