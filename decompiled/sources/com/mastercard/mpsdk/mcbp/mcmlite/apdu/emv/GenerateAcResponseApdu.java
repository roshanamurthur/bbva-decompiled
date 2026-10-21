package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import androidx.emoji2.text.flatbuffer.a;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.RespApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.PosCardholderInteractionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ContactlessTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.CryptogramOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.Tlv;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes10.dex */
public class GenerateAcResponseApdu extends RespApdu {
    public static final byte DAD_HASH_ALGORITHM_INDICATOR = 1;
    public static final byte DAD_SIGNED_DATA_FORMAT = 5;
    public static final byte DDA_HEADER = 106;
    public static final byte DDA_TRAILER = -68;
    public static final byte PADDING_BYTE = -69;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final McmLiteCrypto f50799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IccPrivateKeyCrtComponents f50800c;
    public static final byte[] GENERATE_AC_RESPONSE_TAG = {Constants.RESP_MSG_TEMPLATE_FORMAT_2};
    public static final byte[] CID_TAG = {-97, 39};
    public static final byte[] ATC_TAG = {-97, 54};
    public static final byte DAD_ICC_DYNAMIC_DATA_LENGTH = 38;
    public static final byte[] APPLICATION_CRYPTOGRAM_TAG = {-97, DAD_ICC_DYNAMIC_DATA_LENGTH};
    public static final byte[] ISSUER_APPLICATION_DATA_TAG = {-97, 16};
    public static final byte[] SIGNED_DYNAMIC_APPLICATION_DATA_TAG = {-97, 75};

    public GenerateAcResponseApdu(McmLiteCrypto mcmLiteCrypto, GenerateAcCommandApdu generateAcCommandApdu, ContactlessTransactionContext contactlessTransactionContext, PosCardholderInteractionInformation posCardholderInteractionInformation, CryptogramOutput cryptogramOutput, byte[] bArr, IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents) {
        this.f50799b = mcmLiteCrypto;
        this.f50800c = iccPrivateKeyCrtComponents;
        try {
            int iInitRsaPrivateKey = mcmLiteCrypto.initRsaPrivateKey(iccPrivateKeyCrtComponents.getP(), iccPrivateKeyCrtComponents.getQ(), iccPrivateKeyCrtComponents.getDp(), iccPrivateKeyCrtComponents.getDq(), iccPrivateKeyCrtComponents.getU());
            LinkedList linkedList = new LinkedList();
            byte[] bArr2 = CID_TAG;
            linkedList.add(Tlv.create(bArr2, new byte[]{cryptogramOutput.getCid()}));
            byte[] bArr3 = ATC_TAG;
            linkedList.add(Tlv.create(bArr3, cryptogramOutput.getAtc()));
            byte[] bArr4 = SIGNED_DYNAMIC_APPLICATION_DATA_TAG;
            byte[] bArr5 = {5, 1, DAD_ICC_DYNAMIC_DATA_LENGTH};
            byte[] bArrCopyOfRange = bArr.length == 16 ? Arrays.copyOfRange(bArr, 8, 16) : Arrays.copyOfRange(bArr, 0, 8);
            byte[] bArr6 = new byte[iInitRsaPrivateKey - 63];
            Arrays.fill(bArr6, (byte) -69);
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(bArr5);
            linkedList2.add(new byte[]{(byte) bArrCopyOfRange.length});
            linkedList2.add(bArrCopyOfRange);
            linkedList2.add(McmLiteUtils.copyValue(new byte[]{cryptogramOutput.getCid()}));
            linkedList2.add(McmLiteUtils.copyValue(contactlessTransactionContext.getCryptogram()));
            LinkedList linkedList3 = new LinkedList();
            if (contactlessTransactionContext.getPdolData() != null) {
                linkedList3.add(contactlessTransactionContext.getPdolData());
            }
            linkedList3.add(generateAcCommandApdu.getCdol());
            linkedList3.add(Tlv.create(bArr2, new byte[]{cryptogramOutput.getCid()}));
            linkedList3.add(Tlv.create(bArr3, cryptogramOutput.getAtc()));
            byte[] bArr7 = ISSUER_APPLICATION_DATA_TAG;
            linkedList3.add(Tlv.create(bArr7, cryptogramOutput.getIssuerApplicationData()));
            if (posCardholderInteractionInformation != null) {
                linkedList3.add(posCardholderInteractionInformation.getTlv());
            }
            byte[] bArrConcatenateArrays = McmLiteUtils.concatenateArrays(linkedList3);
            try {
                try {
                    byte[] bArrSha1 = McmLiteUtils.sha1(bArrConcatenateArrays);
                    McmLiteUtils.clearArraysList(linkedList3);
                    McmLiteUtils.clearByteArray(bArrConcatenateArrays);
                    linkedList2.add(bArrSha1);
                    linkedList2.add(bArr6);
                    linkedList2.add(McmLiteUtils.copyValue(generateAcCommandApdu.getUnpredictableNumber()));
                    byte[] bArrConcatenateArrays2 = McmLiteUtils.concatenateArrays(linkedList2);
                    McmLiteUtils.clearArraysList(linkedList2);
                    McmLiteUtils.clearByteArray(bArrCopyOfRange);
                    McmLiteUtils.clearByteArray(bArr);
                    try {
                        byte[] bArrSha2 = McmLiteUtils.sha1(bArrConcatenateArrays2);
                        LinkedList linkedList4 = new LinkedList();
                        int length = (iInitRsaPrivateKey - bArrSha2.length) - 2;
                        byte[] bArr8 = new byte[length];
                        System.arraycopy(bArrConcatenateArrays2, 0, bArr8, 0, length);
                        linkedList4.add(new byte[]{DDA_HEADER});
                        linkedList4.add(bArr8);
                        linkedList4.add(bArrSha2);
                        linkedList4.add(new byte[]{-68});
                        byte[] bArrConcatenateArrays3 = McmLiteUtils.concatenateArrays(linkedList4);
                        try {
                            try {
                                byte[] bArrRsa = mcmLiteCrypto.rsa(bArrConcatenateArrays3);
                                McmLiteUtils.clearByteArray(bArrConcatenateArrays2);
                                McmLiteUtils.clearByteArray(bArrSha2);
                                McmLiteUtils.clearByteArray(bArrConcatenateArrays3);
                                McmLiteUtils.clearArraysList(linkedList4);
                                linkedList.add(Tlv.create(bArr4, bArrRsa));
                                linkedList.add(Tlv.create(bArr7, cryptogramOutput.getIssuerApplicationData()));
                                if (posCardholderInteractionInformation != null) {
                                    linkedList.add(posCardholderInteractionInformation.getTlv());
                                }
                                byte[] bArrCreate = Tlv.create(GENERATE_AC_RESPONSE_TAG, McmLiteUtils.concatenateArrays(linkedList));
                                McmLiteUtils.clearArraysList(linkedList);
                                setValueAndSuccess(bArrCreate);
                                McmLiteUtils.clearByteArray(bArrCreate);
                            } catch (GeneralSecurityException e5) {
                                throw new ContactlessLogicException("Crypto Error: " + e5.getMessage());
                            }
                        } catch (Throwable th2) {
                            McmLiteUtils.clearByteArray(bArrConcatenateArrays2);
                            McmLiteUtils.clearByteArray(bArrSha2);
                            McmLiteUtils.clearByteArray(bArrConcatenateArrays3);
                            McmLiteUtils.clearArraysList(linkedList4);
                            throw th2;
                        }
                    } catch (NoSuchAlgorithmException e7) {
                        throw new ContactlessLogicException(e7.getMessage());
                    }
                } catch (NoSuchAlgorithmException e10) {
                    throw new ContactlessLogicException(e10.getMessage());
                }
            } catch (Throwable th3) {
                McmLiteUtils.clearArraysList(linkedList3);
                McmLiteUtils.clearByteArray(bArrConcatenateArrays);
                throw th3;
            }
        } catch (GeneralSecurityException e11) {
            throw new ContactlessLogicException(a.d(e11, new StringBuilder("Unable to initialize the private key: ")));
        }
    }

    public static GenerateAcResponseApdu withCda(McmLiteCrypto mcmLiteCrypto, GenerateAcCommandApdu generateAcCommandApdu, ContactlessTransactionContext contactlessTransactionContext, PosCardholderInteractionInformation posCardholderInteractionInformation, CryptogramOutput cryptogramOutput, byte[] bArr, IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents) {
        return new GenerateAcResponseApdu(mcmLiteCrypto, generateAcCommandApdu, contactlessTransactionContext, posCardholderInteractionInformation, cryptogramOutput, bArr, iccPrivateKeyCrtComponents);
    }

    public static GenerateAcResponseApdu withoutCda(GenerateAcCommandApdu generateAcCommandApdu, ContactlessTransactionContext contactlessTransactionContext, PosCardholderInteractionInformation posCardholderInteractionInformation, CryptogramOutput cryptogramOutput) {
        return new GenerateAcResponseApdu(generateAcCommandApdu, contactlessTransactionContext, posCardholderInteractionInformation, cryptogramOutput);
    }

    public GenerateAcResponseApdu(GenerateAcCommandApdu generateAcCommandApdu, ContactlessTransactionContext contactlessTransactionContext, PosCardholderInteractionInformation posCardholderInteractionInformation, CryptogramOutput cryptogramOutput) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(Tlv.create(CID_TAG, new byte[]{cryptogramOutput.getCid()}));
        linkedList.add(Tlv.create(ATC_TAG, cryptogramOutput.getAtc()));
        linkedList.add(Tlv.create(APPLICATION_CRYPTOGRAM_TAG, cryptogramOutput.getCryptogram()));
        linkedList.add(Tlv.create(ISSUER_APPLICATION_DATA_TAG, cryptogramOutput.getIssuerApplicationData()));
        if (posCardholderInteractionInformation != null) {
            linkedList.add(posCardholderInteractionInformation.getTlv());
        }
        byte[] bArrCreate = Tlv.create(GENERATE_AC_RESPONSE_TAG, McmLiteUtils.concatenateArrays(linkedList));
        McmLiteUtils.clearArraysList(linkedList);
        setValueAndSuccess(bArrCreate);
        McmLiteUtils.clearByteArray(bArrCreate);
    }
}
