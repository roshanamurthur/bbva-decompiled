package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.RespApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.TlvEditor;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SelectResponseApdu extends RespApdu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DolRequestList f50806b;
    public static final byte[] FCI_TEMPLATE_TAG = {Constants.FCI_TEMPLATE};
    public static final byte[] FCI_PROPRIETARY_TAG = {-91};
    public static final byte[] PDOL_TAG = {-97, 56};
    public static final byte[] SUCCESS_WORD = {-112, 0};

    public SelectResponseApdu(byte[] bArr) {
        super(bArr);
        this.f50806b = null;
    }

    public static SelectResponseApdu of(byte[] bArr, List<DolRequestList.DolItem> list) {
        int length = bArr.length;
        if (length < 3) {
            return null;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        TlvEditor tlvEditorOf = TlvEditor.of(bArr2);
        if (tlvEditorOf == null) {
            return new SelectResponseApdu(bArr);
        }
        if (list != null && !list.isEmpty()) {
            TlvEditor tlvEditorOf2 = TlvEditor.of(tlvEditorOf.getValue(FCI_TEMPLATE_TAG));
            if (tlvEditorOf2 == null) {
                return new SelectResponseApdu(bArr);
            }
            TlvEditor tlvEditorOf3 = TlvEditor.of(tlvEditorOf2.getValue(FCI_PROPRIETARY_TAG));
            if (tlvEditorOf3 == null) {
                return new SelectResponseApdu(bArr);
            }
            DolRequestList dolRequestListOf = DolRequestList.of(tlvEditorOf3.getValue(PDOL_TAG));
            for (DolRequestList.DolItem dolItem : list) {
                dolRequestListOf.addTag(dolItem.getTag(), dolItem.getLength());
            }
            tlvEditorOf3.addTlv(PDOL_TAG, dolRequestListOf.getBytes());
            tlvEditorOf2.addTlv(FCI_PROPRIETARY_TAG, tlvEditorOf3.rebuildByteArray());
            tlvEditorOf.addTlv(FCI_TEMPLATE_TAG, tlvEditorOf2.rebuildByteArray());
        }
        return new SelectResponseApdu(tlvEditorOf);
    }

    public DolRequestList getPdolList() {
        return this.f50806b;
    }

    public SelectResponseApdu(TlvEditor tlvEditor) {
        TlvEditor tlvEditorOf;
        super(tlvEditor.rebuildByteArray(), SUCCESS_WORD);
        TlvEditor tlvEditorOf2 = TlvEditor.of(tlvEditor.getValue(FCI_TEMPLATE_TAG));
        DolRequestList dolRequestListOf = null;
        if (tlvEditorOf2 != null && (tlvEditorOf = TlvEditor.of(tlvEditorOf2.getValue(FCI_PROPRIETARY_TAG))) != null) {
            dolRequestListOf = DolRequestList.of(tlvEditorOf.getValue(PDOL_TAG));
        }
        this.f50806b = dolRequestListOf;
    }
}
