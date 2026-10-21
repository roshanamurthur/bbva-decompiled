package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu;

import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.PaymentApplicationContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.TransactionContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.AidInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.ExpirationDate;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.GenericPubKeyCert;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.ODAData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.QVSDCData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.StaticParams;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.TlvUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.Util;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public class ReadRecordProcess {
    private byte[] calculateSdad(TransactionContext transactionContext, byte[] bArr) {
        byte[] dynamicApplicationDataHash = getDynamicApplicationDataHash(getSdadHashInputData(transactionContext, bArr));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Constants.RSA_SIGNATURE_HEADER);
        arrayList.add(TlvUtils.lengthBytes(transactionContext.getIccDynamicData()));
        arrayList.add(transactionContext.getIccDynamicData());
        arrayList.add(getPadPattern(transactionContext));
        arrayList.add(dynamicApplicationDataHash);
        arrayList.add(new byte[]{-68});
        return signWithRsa(HexUtils.concatenateArrays(arrayList));
    }

    private byte[] getCardAuthenticationRelatedData(TransactionContext transactionContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new byte[]{1});
        arrayList.add(transactionContext.getCardUnpredictableNumber());
        arrayList.add(transactionContext.getCtq());
        return HexUtils.concatenateArrays(arrayList);
    }

    private byte[] getDynamicApplicationDataHash(byte[] bArr) {
        try {
            return HexUtils.sha1(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private byte[] getPadPattern(TransactionContext transactionContext) {
        int length = (HexUtils.byteArrayFromHexString(PaymentApplicationContext.cardProfile.getIccCRTPrivateKey().getModulus()).length - transactionContext.getIccDynamicData().length) - 25;
        if (length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[length];
        Arrays.fill(bArr, (byte) -69);
        return bArr;
    }

    private byte[] getSdadHashInputData(TransactionContext transactionContext, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new byte[]{-107});
        arrayList.add(new byte[]{1});
        arrayList.add(TlvUtils.lengthBytes(transactionContext.getIccDynamicData()));
        arrayList.add(transactionContext.getIccDynamicData());
        arrayList.add(getPadPattern(transactionContext));
        arrayList.add(getSdadTerminalDynamicData(transactionContext, bArr));
        return HexUtils.concatenateArrays(arrayList);
    }

    private byte[] getSdadTerminalDynamicData(TransactionContext transactionContext, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(transactionContext.getDolValues().getValueByTag(Constants.HEX_STR_TAG_TERMINAL_UNPREDICTABLE_NUMBER));
        arrayList.add(transactionContext.getDolValues().getValueByTag("9F02"));
        arrayList.add(transactionContext.getDolValues().getValueByTag("5F2A"));
        arrayList.add(bArr);
        return HexUtils.concatenateArrays(arrayList);
    }

    private byte[] signWithRsa(byte[] bArr) {
        RSAPrivateKey rsaKey = PaymentApplicationContext.getRsaKey();
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/NOPADDING");
            cipher.init(1, rsaKey);
            return cipher.doFinal(bArr);
        } catch (Exception e5) {
            LogTohu.e("ReadRecordProcess", "Error con firma RSA: ", e5);
            throw new RuntimeException(e5);
        }
    }

    public byte[] readRecord0204(TransactionContext transactionContext) {
        ArrayList arrayList = new ArrayList();
        QVSDCData qVSDCData = PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams().getqVSDCData();
        ExpirationDate expirationDate = PaymentApplicationContext.cardProfile.getTokenInfo().getExpirationDate();
        if (expirationDate != null && expirationDate.getYear() != null && expirationDate.getMonth() != null && !expirationDate.getMonth().isEmpty() && !expirationDate.getYear().isEmpty()) {
            arrayList.add(TlvUtils.createTlv(Constants.TAG_APPLICATION_EXPIRATION_DATE, Util.DecToBCDArray(Integer.parseInt(expirationDate.getYear().substring(2) + expirationDate.getMonth() + "01"))));
        }
        arrayList.add(TlvUtils.createTlvFromHexString(Constants.TAG_APPLICATION_PAN, PaymentApplicationContext.getPan()));
        arrayList.add(TlvUtils.createTlvFromHexString(Constants.TAG_APPLICATION_USAGE_CONTROL, qVSDCData.getAuc()));
        byte[] cardAuthenticationRelatedData = getCardAuthenticationRelatedData(transactionContext);
        arrayList.add(TlvUtils.createTlv(Constants.TAG_CARD_AUTH_RELATED_DATA, cardAuthenticationRelatedData));
        String countryCode = qVSDCData.getCountryCode();
        if (countryCode != null && !countryCode.isEmpty()) {
            arrayList.add(TlvUtils.createTlv(Constants.TAG_ISSUER_COUNTRY_CODE, Util.DecToBCDArray(Integer.parseInt(countryCode))));
        }
        arrayList.add(TlvUtils.createTlv(Constants.TAG_SDAD, calculateSdad(transactionContext, cardAuthenticationRelatedData)));
        return TlvUtils.createTlv(Constants.TAG_READ_RECORD, arrayList);
    }

    public byte[] readRecord103() {
        ArrayList arrayList = new ArrayList();
        StaticParams staticParams = PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams();
        arrayList.add(TlvUtils.createTlvFromHexString(Constants.TAG_APPLICATION_USAGE_CONTROL, staticParams.getqVSDCData().getAuc()));
        String ced = staticParams.getqVSDCData().getCed();
        if (ced != null && !ced.isEmpty()) {
            arrayList.add(TlvUtils.createTlvFromHexString(VCPCSProcess.TAG_CUSTOMER_EXCLUSIVE_DATA, ced));
        }
        String countryCode = staticParams.getqVSDCData().getCountryCode();
        if (countryCode != null && !countryCode.isEmpty()) {
            arrayList.add(TlvUtils.createTlvFromHexString(Constants.TAG_ISSUER_COUNTRY_CODE, countryCode));
        }
        String tokenRequestorID = PaymentApplicationContext.cardProfile.getTokenInfo().getTokenRequestorID();
        if (tokenRequestorID != null && !tokenRequestorID.isEmpty()) {
            arrayList.add(TlvUtils.createTlvFromHexString(Constants.TAG_TOKEN_REQUESTOR_ID, tokenRequestorID));
        }
        String paymentAccountReference = PaymentApplicationContext.cardProfile.getPaymentInstrument().getPaymentAccountReference();
        if (paymentAccountReference != null && !paymentAccountReference.isEmpty()) {
            arrayList.add(TlvUtils.createTlv(Constants.TAG_PAYMENT_ACCOUNT_REFERENCE, paymentAccountReference.getBytes()));
        }
        return TlvUtils.createTlv(Constants.TAG_READ_RECORD, arrayList);
    }

    public byte[] readRecord202(AidInfo aidInfo) {
        ArrayList arrayList = new ArrayList();
        ODAData oDAData = aidInfo.getODAData();
        arrayList.add(TlvUtils.createTlvFromHexString(Constants.TAG_CA_PUB_KEY_INDEX, oDAData.getCaPubKeyIndex()));
        GenericPubKeyCert tokenBinPubKeyCert = oDAData.getTokenBinPubKeyCert();
        arrayList.add(TlvUtils.createTlv(Constants.TAG_IPK_PUB_KEY_CERT, HexUtils.byteArrayFromBase64String(tokenBinPubKeyCert.getCertificate())));
        arrayList.add(TlvUtils.createTlvFromHexString(Constants.TAG_IPK_PUB_KEY_EXP, tokenBinPubKeyCert.getExponent()));
        arrayList.add(TlvUtils.createTlv(Constants.TAG_IPK_PUB_KEY_REMAINDER, HexUtils.byteArrayFromBase64String(tokenBinPubKeyCert.getRemainder())));
        return TlvUtils.createTlv(Constants.TAG_RECORD_TEMPLATE, HexUtils.concatenateArrays(arrayList));
    }

    public byte[] readRecord203(AidInfo aidInfo) {
        ArrayList arrayList = new ArrayList();
        GenericPubKeyCert iccPubKeyCert = aidInfo.getODAData().getIccPubKeyCert();
        arrayList.add(TlvUtils.createTlv(Constants.TAG_ICC_PUB_KEY_CERT, HexUtils.byteArrayFromBase64String(iccPubKeyCert.getCertificate())));
        arrayList.add(TlvUtils.createTlvFromHexString(Constants.TAG_ICC_PUB_KEY_EXPONENT, iccPubKeyCert.getExponent()));
        String remainder = iccPubKeyCert.getRemainder();
        if (!remainder.isEmpty()) {
            arrayList.add(TlvUtils.createTlv(Constants.TAG_ICC_PUB_KEY_REMAINDER, HexUtils.byteArrayFromBase64String(remainder)));
        }
        return TlvUtils.createTlv(Constants.TAG_RECORD_TEMPLATE, HexUtils.concatenateArrays(arrayList));
    }
}
