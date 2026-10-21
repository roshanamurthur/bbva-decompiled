package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolRequestList;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ReadRecordCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteUncheckedException;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.Record;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.TlvEditor;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ReadRecord {
    public static final String CDOL_TAG = "8C";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f50856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f50857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<DolRequestList.DolItem> f50858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f50859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContactlessContext f50860e;
    public static final byte[] UDOL_TAG = {-97, 105};
    public static final byte[] RECORD_TAG = {Constants.CVR_B1b85_0111_VERIFIED_CLOUD};

    public ReadRecord(ReadRecordCommandApdu readRecordCommandApdu, ContactlessContext contactlessContext) {
        byte[] bArrRecordNotFound;
        this.f50860e = contactlessContext;
        this.f50856a = readRecordCommandApdu.getRecordNumber();
        this.f50857b = readRecordCommandApdu.getSfiNumber();
        this.f50858c = contactlessContext.getAdditionalUdolList();
        Record[] records = contactlessContext.getCardProfile().getContactlessPaymentData().getRecords();
        if (records == null) {
            bArrRecordNotFound = ResponseApduFactory.recordNotFound();
        } else {
            for (Record record : records) {
                byte recordNumber = record.getRecordNumber();
                byte b10 = this.f50856a;
                if (recordNumber == b10) {
                    byte sfi = record.getSfi();
                    byte b11 = this.f50857b;
                    if (sfi == b11) {
                        try {
                            byte[] recordValue = record.getRecordValue();
                            if (b10 == 1 && b11 == 1) {
                                bArrRecordNotFound = ResponseApduFactory.successfulProcessing(a(recordValue));
                            } else {
                                TlvEditor tlvEditorOf = TlvEditor.of(recordValue);
                                if (tlvEditorOf == null) {
                                    throw new McmLiteUncheckedException("Invalid Record profile data");
                                }
                                TlvEditor tlvEditorOf2 = TlvEditor.of(tlvEditorOf.getValue(RECORD_TAG));
                                if (tlvEditorOf2 == null) {
                                    throw new McmLiteUncheckedException("Invalid Record profile data");
                                }
                                byte[] value = tlvEditorOf2.getValue(CDOL_TAG);
                                DolRequestList dolRequestListOf = value == null ? null : DolRequestList.of(value);
                                if (dolRequestListOf != null) {
                                    this.f50860e.getTransactionContext().setCdolList(dolRequestListOf);
                                }
                                bArrRecordNotFound = ResponseApduFactory.successfulProcessing(recordValue);
                            }
                        } catch (McmLiteInvalidInput unused) {
                            throw new ContactlessLogicException("Invalid Record format");
                        }
                    }
                }
            }
            bArrRecordNotFound = ResponseApduFactory.recordNotFound();
        }
        this.f50859d = bArrRecordNotFound;
    }

    public static ReadRecord of(ReadRecordCommandApdu readRecordCommandApdu, ContactlessContext contactlessContext) {
        return new ReadRecord(readRecordCommandApdu, contactlessContext);
    }

    public final byte[] a(byte[] bArr) {
        TlvEditor tlvEditorOf = TlvEditor.of(bArr);
        if (tlvEditorOf == null) {
            throw new ContactlessLogicException("Invalid Record 1 SFI 1 profile data");
        }
        TlvEditor tlvEditorOf2 = TlvEditor.of(tlvEditorOf.getValue(RECORD_TAG));
        if (tlvEditorOf2 == null) {
            throw new ContactlessLogicException("Invalid Record 1 SFI 1 profile data");
        }
        DolRequestList dolRequestListOf = DolRequestList.of(tlvEditorOf2.getValue(UDOL_TAG));
        ContactlessContext contactlessContext = this.f50860e;
        List<DolRequestList.DolItem> list = this.f50858c;
        if (list == null) {
            contactlessContext.getTransactionContext().setUdolList(dolRequestListOf);
            return bArr;
        }
        for (DolRequestList.DolItem dolItem : list) {
            dolRequestListOf.addTag(dolItem.getTag(), dolItem.getLength());
        }
        contactlessContext.getTransactionContext().setUdolList(dolRequestListOf);
        tlvEditorOf2.addTlv(UDOL_TAG, dolRequestListOf.getBytes());
        tlvEditorOf.addTlv(RECORD_TAG, tlvEditorOf2.rebuildByteArray());
        return tlvEditorOf.rebuildByteArray();
    }

    public byte[] getResponse() {
        return this.f50859d;
    }
}
