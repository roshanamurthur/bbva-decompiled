package uh;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.riskmanager.CvmRiskManagerBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.PosCardholderInteractionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ComputeCryptographicChecksum;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ContactlessTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.ContactlessLogImpl;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionSummary;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.Tlv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: ComputeCryptographicChecksum.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements TransactionOutcomeBuilderListener<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComputeCryptographicChecksum f93859a;

    public a(ComputeCryptographicChecksum computeCryptographicChecksum) {
        this.f93859a = computeCryptographicChecksum;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] error(List<Reason> list) {
        ComputeCryptographicChecksum computeCryptographicChecksum = this.f93859a;
        computeCryptographicChecksum.getClass();
        boolean zContains = list.contains(Reason.CONTEXT_NOT_MATCHING);
        ContactlessContext contactlessContext = computeCryptographicChecksum.f50816c;
        if (zContains) {
            contactlessContext.getTransactionContext().setResult(TransactionSummary.ERROR_CONTEXT_CONFLICT);
        } else {
            contactlessContext.getTransactionContext().setResult(TransactionSummary.ERROR);
        }
        computeCryptographicChecksum.f50817d = PosCardholderInteractionInformation.forErrorMagstripe(computeCryptographicChecksum.f50816c.isCdCvmEntered(), list);
        return ComputeCryptographicChecksum.a(computeCryptographicChecksum, computeCryptographicChecksum.f50825l.getRandomCredentials());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final byte[] abort(List list) {
        ComputeCryptographicChecksum computeCryptographicChecksum = this.f93859a;
        computeCryptographicChecksum.f50816c.getTransactionContext().setResult(TransactionSummary.ABORT_PERSISTENT_CONTEXT);
        computeCryptographicChecksum.f50817d = PosCardholderInteractionInformation.forAbortMagstripe(computeCryptographicChecksum.f50816c.isCdCvmEntered(), list);
        return ComputeCryptographicChecksum.a(computeCryptographicChecksum, computeCryptographicChecksum.f50825l.getRandomCredentials());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final byte[] approveOnline(List list, TransactionCredentials transactionCredentials) {
        ComputeCryptographicChecksum computeCryptographicChecksum = this.f93859a;
        computeCryptographicChecksum.f50816c.getTransactionContext().setResult(TransactionSummary.AUTHORIZE_ONLINE);
        computeCryptographicChecksum.f50817d = PosCardholderInteractionInformation.forApproveMagstripe(computeCryptographicChecksum.f50816c.isCdCvmEntered(), list);
        CvmRiskManagerBuilder.getDefault().update(computeCryptographicChecksum.f50819f);
        byte[] atc = transactionCredentials.getAtc();
        ContactlessTransactionContext contactlessTransactionContext = computeCryptographicChecksum.f50824k;
        contactlessTransactionContext.setAtc(atc);
        byte[] atc2 = transactionCredentials.getAtc();
        computeCryptographicChecksum.f50818e.indicateOnlineDecision();
        byte[] unpredictableNumber = computeCryptographicChecksum.f50815b.getUnpredictableNumber();
        byte[] pinIvCvc3Track2 = computeCryptographicChecksum.f50822i.getPinIvCvc3Track2();
        byte[] bArr = new byte[8];
        System.arraycopy(pinIvCvc3Track2, 0, bArr, 0, pinIvCvc3Track2.length);
        System.arraycopy(unpredictableNumber, 0, bArr, pinIvCvc3Track2.length, unpredictableNumber.length);
        System.arraycopy(atc2, 0, bArr, pinIvCvc3Track2.length + unpredictableNumber.length, atc2.length);
        byte[] umdSessionKey = transactionCredentials.getUmdSessionKey();
        byte[] mdSessionKey = transactionCredentials.getMdSessionKey();
        try {
            McmLiteCrypto.TransactionCryptograms transactionCryptogramsBuildComputeCcCryptograms = computeCryptographicChecksum.f50814a.buildComputeCcCryptograms(bArr, umdSessionKey, mdSessionKey);
            byte[] umdCryptogram = transactionCryptogramsBuildComputeCcCryptograms.getUmdCryptogram();
            byte[] mdCryptogram = transactionCryptogramsBuildComputeCcCryptograms.getMdCryptogram();
            int iB = ComputeCryptographicChecksum.b(mdCryptogram[0], mdCryptogram[1]) % 1000;
            int iB2 = ComputeCryptographicChecksum.b(umdCryptogram[6], umdCryptogram[7]) % 1000;
            int iB3 = ComputeCryptographicChecksum.b(atc2[0], atc2[1]) % 'd';
            int i10 = ((iB3 / 10) * 1000) + iB;
            int i11 = ((iB3 % 10) * 1000) + iB2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            byte[] bArrArray = byteBufferAllocate.order(byteOrder).putInt(i10).array();
            byte[] bArrArray2 = ByteBuffer.allocate(4).order(byteOrder).putInt(i11).array();
            byte[] bArr2 = {bArrArray2[2], bArrArray2[3], bArrArray[2], bArrArray[3], 0, 0, 0, 0};
            McmLiteUtils.clearByteArray(bArrArray);
            McmLiteUtils.clearByteArray(bArrArray2);
            transactionCredentials.wipe();
            McmLiteUtils.clearByteArray(umdSessionKey);
            McmLiteUtils.clearByteArray(mdSessionKey);
            McmLiteUtils.clearByteArray(umdCryptogram);
            McmLiteUtils.clearByteArray(mdCryptogram);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, 2);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, 2, 4);
            contactlessTransactionContext.setCryptogram(bArr2);
            byte[] bArr3 = {-97, Constants.DIRECTORY_ENTRY};
            byte[] bArr4 = {-97, Constants.CVR_B1b85_0110_TERMINAL};
            byte[] bArrCreate = Tlv.create(bArr3, bArrCopyOfRange);
            byte[] bArrCreate2 = Tlv.create(bArr4, bArrCopyOfRange);
            byte[] bArrCreate3 = Tlv.create(ComputeCryptographicChecksum.ATC_TAG, bArrCopyOfRange2);
            byte[] tlv = computeCryptographicChecksum.f50821h ? computeCryptographicChecksum.f50817d.getTlv() : new byte[0];
            byte[] bArr5 = new byte[bArrCreate.length + bArrCreate2.length + bArrCreate3.length + tlv.length];
            int length = bArrCreate.length;
            System.arraycopy(bArrCreate, 0, bArr5, 0, length);
            int length2 = bArrCreate2.length;
            System.arraycopy(bArrCreate2, 0, bArr5, length, length2);
            int i12 = length + length2;
            int length3 = bArrCreate3.length;
            System.arraycopy(bArrCreate3, 0, bArr5, i12, length3);
            if (tlv.length > 0) {
                System.arraycopy(tlv, 0, bArr5, i12 + length3, tlv.length);
            }
            byte[] bArrCreate4 = Tlv.create(new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2}, bArr5);
            McmLiteUtils.clearByteArray(bArrCreate);
            McmLiteUtils.clearByteArray(bArrCreate2);
            McmLiteUtils.clearByteArray(bArrCreate3);
            McmLiteUtils.clearByteArray(tlv);
            McmLiteUtils.clearByteArray(bArr5);
            try {
                byte[] bArrSuccessfulProcessing = ResponseApduFactory.successfulProcessing(bArrCreate4);
                computeCryptographicChecksum.f50823j.onContactlessTransactionCompleted(ContactlessLogImpl.forMagstripe(computeCryptographicChecksum.f50824k, computeCryptographicChecksum.f50822i, computeCryptographicChecksum.f50820g, computeCryptographicChecksum.f50819f, bArrCopyOfRange, bArrCopyOfRange2));
                McmLiteUtils.clearByteArray(bArrCopyOfRange);
                McmLiteUtils.clearByteArray(bArrCopyOfRange2);
                return bArrSuccessfulProcessing;
            } catch (McmLiteInvalidInput e5) {
                McmLiteUtils.clearByteArray(bArrCreate4);
                throw new ContactlessLogicException(e5.getMessage());
            }
        } catch (GeneralSecurityException e7) {
            throw new ContactlessLogicException(e7.getMessage());
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final byte[] authenticate(List list, TransactionCredentials transactionCredentials) {
        throw new ContactlessLogicException("Authentication is not supported for Magstripe!");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final byte[] decline(List list) {
        if (list.contains(Reason.CONTEXT_NOT_MATCHING)) {
            return error(list);
        }
        ComputeCryptographicChecksum computeCryptographicChecksum = this.f93859a;
        computeCryptographicChecksum.f50816c.getTransactionContext().setResult(TransactionSummary.DECLINE);
        computeCryptographicChecksum.f50817d = PosCardholderInteractionInformation.forDeclineMagstripe(computeCryptographicChecksum.f50816c.isCdCvmEntered(), list);
        return ComputeCryptographicChecksum.a(computeCryptographicChecksum, computeCryptographicChecksum.f50825l.getRandomCredentials());
    }
}
