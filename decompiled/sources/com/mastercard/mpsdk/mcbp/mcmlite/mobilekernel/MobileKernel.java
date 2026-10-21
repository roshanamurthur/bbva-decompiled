package com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.McmLite;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.CryptogramOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.Date;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.Tlv;
import com.nulabinc.zxcvbn.Guess;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MobileKernel {
    private static final /* synthetic */ MobileKernel[] $VALUES;
    public static final MobileKernel INSTANCE;
    static McmLite sMcmLite;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50964a;

        static {
            int[] iArr = new int[CryptogramType.values().length];
            f50964a = iArr;
            try {
                iArr[CryptogramType.DE55.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50964a[CryptogramType.UCAF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        MobileKernel mobileKernel = new MobileKernel("INSTANCE", 0);
        INSTANCE = mobileKernel;
        $VALUES = new MobileKernel[]{mobileKernel};
    }

    public MobileKernel() {
        throw null;
    }

    public static DsrpOutputData a(DsrpInputData dsrpInputData, CryptogramInput cryptogramInput, TransactionOutput transactionOutput) {
        byte[] bArrConcatenateArrays;
        String strReplaceAll = McmLiteUtils.byteArrayToHexString(transactionOutput.getPan()).replaceAll("F", "");
        String strReplaceAll2 = McmLiteUtils.byteArrayToHexString(transactionOutput.getTrack2EquivalentData()).replaceAll("F", "");
        if (dsrpInputData.getCryptogramType() == CryptogramType.UCAF) {
            byte b10 = (byte) (transactionOutput.getPanSequenceNumber()[0] & 15);
            CryptogramOutput cryptogramOutput = transactionOutput.getCryptogramOutput();
            byte[] bArr = new byte[4];
            McmLiteUtils.writeInt(bArr, 0, dsrpInputData.getUnpredictableNumber());
            byte[] bArrCopyOfRange = Arrays.copyOfRange(cryptogramOutput.getIssuerApplicationData(), 0, 2);
            LinkedList linkedList = new LinkedList();
            linkedList.add(new byte[]{b10});
            linkedList.add(Arrays.copyOfRange(cryptogramOutput.getIssuerApplicationData(), 11, 15));
            linkedList.add(Arrays.copyOfRange(cryptogramOutput.getCryptogram(), 4, 8));
            linkedList.add(Arrays.copyOfRange(cryptogramOutput.getAtc(), 0, 2));
            linkedList.add(bArr);
            linkedList.add(transactionOutput.getAip());
            linkedList.add(bArrCopyOfRange);
            byte[] bArrConcatenateArrays2 = McmLiteUtils.concatenateArrays(linkedList);
            String strByteArrayToBase64String = McmLiteUtils.byteArrayToBase64String(bArrConcatenateArrays2);
            McmLiteUtils.clearArraysList(linkedList);
            McmLiteUtils.clearByteArray(bArrConcatenateArrays2);
            bArrConcatenateArrays = strByteArrayToBase64String.getBytes();
        } else {
            LinkedList linkedList2 = new LinkedList();
            byte[] bArr2 = transactionOutput.isCvmEntered() ? new byte[]{1, 0, 2} : new byte[]{63, 0, 2};
            linkedList2.add(Tlv.create(new byte[]{-97, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH}, transactionOutput.getCryptogramOutput().getCryptogram()));
            linkedList2.add(Tlv.create(new byte[]{-97, 16}, transactionOutput.getCryptogramOutput().getIssuerApplicationData()));
            linkedList2.add(Tlv.create(new byte[]{-97, 54}, transactionOutput.getCryptogramOutput().getAtc()));
            linkedList2.add(Tlv.create(new byte[]{-107}, cryptogramInput.getTvr()));
            linkedList2.add(Tlv.create(new byte[]{-97, 39}, new byte[]{transactionOutput.getCryptogramOutput().getCid()}));
            linkedList2.add(Tlv.create(new byte[]{-97, 52}, bArr2));
            linkedList2.add(Tlv.create(new byte[]{-97, 55}, cryptogramInput.getUnpredictableNumber()));
            linkedList2.add(Tlv.create(new byte[]{-97, 2}, cryptogramInput.getAmountAuthorized()));
            linkedList2.add(Tlv.create(new byte[]{-97, 3}, cryptogramInput.getAmountOther()));
            linkedList2.add(Tlv.create(new byte[]{Constants.STATE_ERROR, 42}, cryptogramInput.getTransactionCurrencyCode()));
            linkedList2.add(Tlv.create(new byte[]{-102}, cryptogramInput.getTransactionDate()));
            linkedList2.add(Tlv.create(new byte[]{-100}, cryptogramInput.getTransactionType()));
            linkedList2.add(Tlv.create(new byte[]{90}, transactionOutput.getPan()));
            linkedList2.add(Tlv.create(new byte[]{Constants.STATE_ERROR, 52}, transactionOutput.getPanSequenceNumber()));
            linkedList2.add(Tlv.create(new byte[]{Constants.STATE_ERROR, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE}, transactionOutput.getExpiryDate()));
            linkedList2.add(Tlv.create(new byte[]{-97, MessageUtils.MESSAGE_26_SUB}, cryptogramInput.getTerminalCountryCode()));
            linkedList2.add(Tlv.create(new byte[]{-126}, transactionOutput.getAip()));
            bArrConcatenateArrays = McmLiteUtils.concatenateArrays(linkedList2);
        }
        byte[] bArr3 = bArrConcatenateArrays;
        int i10 = McmLiteUtils.readInt(transactionOutput.getCryptogramOutput().getAtc(), 0);
        byte b11 = transactionOutput.getPanSequenceNumber()[0];
        byte[] expiryDate = transactionOutput.getExpiryDate();
        return new DsrpOutputData(strReplaceAll, b11, new Date(McmLiteUtils.bcdByteToInt(expiryDate[0]), McmLiteUtils.bcdByteToInt(expiryDate[1]), expiryDate.length == 3 ? McmLiteUtils.bcdByteToInt(expiryDate[2]) : 1), transactionOutput.getCryptogramOutput().getCryptogram(), bArr3, 0, dsrpInputData.getTransactionAmount(), dsrpInputData.getCurrencyCode(), i10, dsrpInputData.getUnpredictableNumber(), dsrpInputData.getCryptogramType(), strReplaceAll2);
    }

    public static RemotePaymentResultCode b(TransactionOutput transactionOutput, CryptogramType cryptogramType) throws McmLiteInvalidInput {
        if (transactionOutput == null) {
            return RemotePaymentResultCode.ERROR_UNEXPECTED_DATA;
        }
        if (transactionOutput.getCryptogramOutput().getCid() != -128) {
            return RemotePaymentResultCode.DECLINED;
        }
        byte b10 = transactionOutput.getPanSequenceNumber()[0];
        if (b10 > 99 && cryptogramType == CryptogramType.DE55) {
            return RemotePaymentResultCode.ERROR_INVALID_INPUT;
        }
        if (b10 > 9 && cryptogramType == CryptogramType.UCAF) {
            return RemotePaymentResultCode.ERROR_INVALID_INPUT;
        }
        byte[] expiryDate = transactionOutput.getExpiryDate();
        byte b11 = expiryDate[0];
        int i10 = (((b11 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) * 10) + (b11 & 15) + Guess.REFERENCE_YEAR;
        byte b12 = expiryDate[1];
        int i11 = (((b12 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) * 10) + (b12 & 15);
        byte b13 = expiryDate[2];
        return !new Date(i10, i11, (((b13 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) * 10) + (b13 & 15)).isValid() ? RemotePaymentResultCode.ERROR_INVALID_INPUT : RemotePaymentResultCode.OK;
    }

    public static synchronized DsrpResult generateDsrpData(DsrpInputData dsrpInputData, McmLite mcmLite) throws GeneralSecurityException, McmLiteInvalidInput {
        char currencyCode;
        byte transactionType;
        char countryCode;
        CryptogramInput cryptogramInputForDe55;
        sMcmLite = mcmLite;
        if (dsrpInputData != null && mcmLite != null) {
            long transactionAmount = dsrpInputData.getTransactionAmount();
            if (transactionAmount >= 0 && transactionAmount <= BusinessLogicTransactionInformation.MAX_AMOUNT) {
                long otherAmount = dsrpInputData.getOtherAmount();
                if (otherAmount >= 0 && otherAmount <= BusinessLogicTransactionInformation.MAX_AMOUNT && (currencyCode = dsrpInputData.getCurrencyCode()) >= 0 && currencyCode <= 999 && (transactionType = dsrpInputData.getTransactionType()) >= 0 && transactionType <= 99 && (countryCode = dsrpInputData.getCountryCode()) >= 0 && countryCode <= 999 && dsrpInputData.getUnpredictableNumber() != 0 && dsrpInputData.getTransactionDate() != null && dsrpInputData.getTransactionDate().isValid()) {
                    byte[] bArr = new byte[4];
                    McmLiteUtils.writeInt(bArr, 0, dsrpInputData.getUnpredictableNumber());
                    int i10 = a.f50964a[dsrpInputData.getCryptogramType().ordinal()];
                    if (i10 == 1) {
                        cryptogramInputForDe55 = CryptogramInput.forDe55(McmLiteUtils.longToBcd(dsrpInputData.getTransactionAmount(), 6), McmLiteUtils.longToBinaryByteArray(dsrpInputData.getOtherAmount(), 6), McmLiteUtils.longToBcd(dsrpInputData.getCountryCode(), 2), McmLiteUtils.longToBcd(dsrpInputData.getCurrencyCode(), 2), getDateAsByteArray(dsrpInputData.getTransactionDate()), bArr, dsrpInputData.getTransactionType());
                    } else {
                        if (i10 != 2) {
                            sMcmLite.cancelPayment();
                            return new DsrpResult(RemotePaymentResultCode.ERROR_INVALID_INPUT, null);
                        }
                        cryptogramInputForDe55 = CryptogramInput.forUcaf(bArr);
                    }
                    TransactionOutput transactionOutputCreateRemoteCryptogram = sMcmLite.createRemoteCryptogram(cryptogramInputForDe55);
                    RemotePaymentResultCode remotePaymentResultCodeB = b(transactionOutputCreateRemoteCryptogram, cryptogramInputForDe55.getCryptogramType());
                    RemotePaymentResultCode remotePaymentResultCode = RemotePaymentResultCode.OK;
                    return remotePaymentResultCodeB != remotePaymentResultCode ? new DsrpResult(remotePaymentResultCodeB, null) : new DsrpResult(remotePaymentResultCode, a(dsrpInputData, cryptogramInputForDe55, transactionOutputCreateRemoteCryptogram));
                }
            }
        }
        sMcmLite.cancelPayment();
        return new DsrpResult(RemotePaymentResultCode.ERROR_INVALID_INPUT, null);
    }

    public static byte[] getDateAsByteArray(Date date) {
        StringBuilder sbD = c.d(date.getYear() < 2010 ? "0" : "");
        sbD.append(date.getYear() % Guess.REFERENCE_YEAR);
        String string = sbD.toString();
        if (date.getMonth() < 10) {
            string = u.f(string, "0");
        }
        StringBuilder sbE = f.e(string, "");
        sbE.append(date.getMonth());
        String string2 = sbE.toString();
        if (date.getDay() < 10) {
            string2 = u.f(string2, "0");
        }
        StringBuilder sbD2 = c.d(string2);
        sbD2.append(date.getDay());
        return McmLiteUtils.byteArrayFromHexString(sbD2.toString());
    }

    public static MobileKernel valueOf(String str) {
        return (MobileKernel) Enum.valueOf(MobileKernel.class, str);
    }

    public static MobileKernel[] values() {
        return (MobileKernel[]) $VALUES.clone();
    }
}
