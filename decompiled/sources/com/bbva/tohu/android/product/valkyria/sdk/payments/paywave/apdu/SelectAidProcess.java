package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu;

import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.PaymentApplicationContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.TransactionContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.exceptions.AidNotFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.AidInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.VtsCardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.TlvUtils;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class SelectAidProcess {
    private static final String TAG = "SelectAidProcess";

    private AidInfo getSelectedAidFromReader(String str, VtsCardProfile vtsCardProfile, boolean z10) throws AidNotFoundException {
        LogTohu.d(TAG, "Requested AID: %s\n++++++++ EXISTING AIDs +++++++++++++++++++++++++++++\n%s\n++++++++++++++++++++++++++++++++++++++++++++++++++++", str, vtsCardProfile.getTokenInfo().getHceData().getStaticParams().getAidInfo());
        for (AidInfo aidInfo : vtsCardProfile.getTokenInfo().getHceData().getStaticParams().getAidInfo()) {
            if (aidInfo.getAid().equals(str)) {
                return aidInfo;
            }
        }
        for (AidInfo aidInfo2 : vtsCardProfile.getTokenInfo().getHceData().getStaticParams().getAidInfo()) {
            String aid = aidInfo2.getAid();
            if (aid.startsWith(str)) {
                String str2 = TAG;
                LogTohu.d(str2, "Found partial match: requested AID: %s, found: %s", str, aid);
                if (!z10) {
                    PaymentApplicationContext.returnedPartialAids.add(aid);
                    return aidInfo2;
                }
                LogTohu.d(str2, "Requested next match", new Object[0]);
                if (!PaymentApplicationContext.returnedPartialAids.contains(aid)) {
                    LogTohu.d(str2, "%s is the next match", aid);
                    PaymentApplicationContext.returnedPartialAids.add(aid);
                    return aidInfo2;
                }
            }
        }
        throw new AidNotFoundException();
    }

    public byte[] generateFciTemplate(TransactionContext transactionContext, VtsCardProfile vtsCardProfile, boolean z10) throws AidNotFoundException {
        ArrayList arrayList = new ArrayList();
        AidInfo selectedAidFromReader = getSelectedAidFromReader(transactionContext.getSelectedAID(), vtsCardProfile, z10);
        transactionContext.setSelectedAidInfo(selectedAidFromReader);
        if (selectedAidFromReader.getAsrpd() != null && !selectedAidFromReader.getAsrpd().isEmpty()) {
            arrayList.add(TlvUtils.createTlv(new byte[]{-97, 10}, HexUtils.byteArrayFromHexString(selectedAidFromReader.getAsrpd())));
        }
        arrayList.add(TlvUtils.createTlv(new byte[]{-97, 90}, HexUtils.byteArrayFromHexString(vtsCardProfile.getTokenInfo().getAppPrgrmID())));
        byte[] bArrCreateTlv = TlvUtils.createTlv(new byte[]{ByteSourceJsonBootstrapper.UTF8_BOM_3, 12}, arrayList);
        byte[] bArrByteArrayFromHexString = HexUtils.byteArrayFromHexString(vtsCardProfile.getTokenInfo().getHceData().getStaticParams().getPdol());
        byte[] bArrCreateTlv2 = TlvUtils.createTlv(new byte[]{-97, 56}, bArrByteArrayFromHexString);
        transactionContext.getDolRequestList().createDolRequestList(bArrByteArrayFromHexString);
        byte[] bArrCreateTlv3 = TlvUtils.createTlv(new byte[]{Constants.CVR_B1b85_0101_MOBILE_APP}, HexUtils.byteArrayFromHexString(selectedAidFromReader.getApplicationLabel()));
        String lang = vtsCardProfile.getTokenInfo().getLang();
        byte[] bArrCreateTlv4 = (lang == null || lang.isEmpty()) ? null : TlvUtils.createTlv(new byte[]{Constants.STATE_ERROR, 45}, HexUtils.byteArrayFromHexString(lang));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bArrCreateTlv3);
        if (bArrCreateTlv4 != null) {
            arrayList2.add(bArrCreateTlv4);
        }
        arrayList2.add(bArrCreateTlv2);
        arrayList2.add(bArrCreateTlv);
        byte[] bArrCreateTlv5 = TlvUtils.createTlv(new byte[]{-91}, arrayList2);
        byte[] bArrCreateTlv6 = TlvUtils.createTlv(new byte[]{-124}, HexUtils.byteArrayFromHexString(selectedAidFromReader.getAid()));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(bArrCreateTlv6);
        arrayList3.add(bArrCreateTlv5);
        return TlvUtils.createTlv(new byte[]{Constants.FCI_TEMPLATE}, arrayList3);
    }
}
