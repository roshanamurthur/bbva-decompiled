package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.PaymentApplicationContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.ExpirationDate;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.Track2DataNotDec;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.Util;

/* JADX INFO: loaded from: classes6.dex */
public class GetProcessingOptionsProcess {
    public byte[] generateTrack2EquivalentData() {
        String strF = u.f(f.d("", Util.padHexStringWithFs(PaymentApplicationContext.getPan())), "D");
        ExpirationDate expirationDate = PaymentApplicationContext.cardProfile.getTokenInfo().getExpirationDate();
        String strF2 = u.f(strF, expirationDate.getYear().substring(2).concat(expirationDate.getMonth()));
        Track2DataNotDec track2DataNotDec = PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams().getTrack2DataNotDec();
        HexUtils.byteArrayFromHexString(track2DataNotDec.getSvcCode());
        String string = strF2 + track2DataNotDec.getSvcCode();
        if (track2DataNotDec.getPinVerField() != null && !track2DataNotDec.getPinVerField().isEmpty()) {
            StringBuilder sbD = c.d(string);
            sbD.append(track2DataNotDec.getPinVerField());
            string = sbD.toString();
        }
        StringBuilder sbD2 = c.d(string);
        sbD2.append(track2DataNotDec.getTrack2DiscData());
        String string2 = sbD2.toString();
        if (string2.length() % 2 != 0) {
            string2 = string2.concat("F");
        }
        return HexUtils.byteArrayFromHexString(string2);
    }
}
