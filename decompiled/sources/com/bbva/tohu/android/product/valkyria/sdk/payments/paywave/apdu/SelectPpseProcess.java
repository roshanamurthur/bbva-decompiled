package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu;

import androidx.annotation.NonNull;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.AidInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.VtsCardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.TlvUtils;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SelectPpseProcess {
    @NonNull
    private List<byte[]> generateFciDiscretionaryData(VtsCardProfile vtsCardProfile) {
        String kernelIdentifier = vtsCardProfile.getTokenInfo().getHceData().getStaticParams().getKernelIdentifier();
        byte[] bArrCreateTlv = (kernelIdentifier == null || kernelIdentifier.isEmpty()) ? null : TlvUtils.createTlv(new byte[]{-97, 42}, HexUtils.byteArrayFromHexString(kernelIdentifier));
        List<AidInfo> aidInfo = vtsCardProfile.getTokenInfo().getHceData().getStaticParams().getAidInfo();
        ArrayList arrayList = new ArrayList();
        for (AidInfo aidInfo2 : aidInfo) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(TlvUtils.createTlv(new byte[]{79}, HexUtils.byteArrayFromHexString(aidInfo2.getAid())));
            if (aidInfo2.getApplicationLabel() != null && !aidInfo2.getApplicationLabel().isEmpty()) {
                arrayList2.add(TlvUtils.createTlv(new byte[]{Constants.CVR_B1b85_0101_MOBILE_APP}, HexUtils.byteArrayFromHexString(aidInfo2.getApplicationLabel())));
            }
            arrayList2.add(TlvUtils.createTlv(new byte[]{-121}, HexUtils.byteArrayFromHexString(aidInfo2.getPriority())));
            if (aidInfo2.getAsrpd() != null && !aidInfo2.getAsrpd().isEmpty()) {
                arrayList2.add(TlvUtils.createTlv(new byte[]{-97, 10}, HexUtils.byteArrayFromHexString(aidInfo2.getAsrpd())));
            }
            if (bArrCreateTlv != null) {
                arrayList2.add(bArrCreateTlv);
            }
            arrayList.add(TlvUtils.createTlv(new byte[]{Constants.DIRECTORY_ENTRY}, arrayList2));
        }
        return arrayList;
    }

    private byte[] generateFciTemplate(List<byte[]> list) {
        byte[] bArrCreateTlv = TlvUtils.createTlv(new byte[]{ByteSourceJsonBootstrapper.UTF8_BOM_3, 12}, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(TlvUtils.createTlv(new byte[]{-124}, "2PAY.SYS.DDF01".getBytes()));
        arrayList.add(TlvUtils.createTlv(new byte[]{-91}, bArrCreateTlv));
        return TlvUtils.createTlv(new byte[]{Constants.FCI_TEMPLATE}, arrayList);
    }

    public byte[] generateEmptyPpseFci() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new byte[0]);
        return generateFciTemplate(arrayList);
    }

    public byte[] generatePpseFci(VtsCardProfile vtsCardProfile) {
        return generateFciTemplate(generateFciDiscretionaryData(vtsCardProfile));
    }
}
