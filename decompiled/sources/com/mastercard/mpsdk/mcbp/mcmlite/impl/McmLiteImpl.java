package com.mastercard.mpsdk.mcbp.mcmlite.impl;

import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.McmLite;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.Iso7816;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolRequestList;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.cardprofile.DsrpIncompatibleProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.state.InvalidState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteStateContext;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.AdviceManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.ConsentManager;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import mx.openpay.library.data.util.EglobalUtils;
import sh.a;

/* JADX INFO: loaded from: classes10.dex */
public final class McmLiteImpl implements McmLite {
    public static final String VERSION = "1.1.0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteStateContext f50810a;

    public McmLiteImpl(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager, List<DolRequestList.DolItem> list, List<DolRequestList.DolItem> list2, boolean z10) {
        McmLiteCrypto mcmLiteCrypto2 = mcmLiteCrypto == null ? a.INSTANCE : mcmLiteCrypto;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DolRequestList.DolItem("9F7E", 1));
        arrayList.add(new DolRequestList.DolItem("9F1D", 8));
        if (list != null) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new DolRequestList.DolItem(EglobalUtils.CAPABILITIES, 3));
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        McmLiteStateContext mcmLiteStateContext = new McmLiteStateContext(mcmLiteCrypto2, mcmLiteProfile, transactionCredentialsManager, cdCvmValidatorInformation, consentManager, adviceManager, arrayList, arrayList2, z10);
        this.f50810a = mcmLiteStateContext;
        mcmLiteStateContext.setInitializedState();
    }

    public static McmLite buildMcmLiteForMcbp1Plus(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager, List<DolRequestList.DolItem> list, List<DolRequestList.DolItem> list2, boolean z10) {
        return new McmLiteImpl(mcmLiteCrypto, mcmLiteProfile, transactionCredentialsManager, cdCvmValidatorInformation, consentManager, adviceManager, list, list2, z10);
    }

    public static McmLite buildMcmLiteV1(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager) {
        if (mcmLiteCrypto == null) {
            mcmLiteCrypto = a.INSTANCE;
        }
        return new McmLiteImpl(mcmLiteCrypto, mcmLiteProfile, transactionCredentialsManager, cdCvmValidatorInformation, consentManager, adviceManager);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.McmLite
    public final void cancelPayment() throws ContactlessLogicException {
        try {
            this.f50810a.getState().cancelPayment();
        } catch (InvalidState e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.McmLite
    public final TransactionOutput createRemoteCryptogram(CryptogramInput cryptogramInput) {
        try {
            return this.f50810a.getState().createRemoteCryptogram(cryptogramInput);
        } catch (McmLiteInvalidInput | GeneralSecurityException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.McmLite
    public String getVersion() {
        return "1.1.0";
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.McmLite
    public final byte[] processApdu(byte[] bArr) {
        try {
            return this.f50810a.getState().processApdu(bArr);
        } catch (RuntimeException e5) {
            e5.printStackTrace();
            return ResponseApduFactory.of(Iso7816.SW_UNKNOWN);
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.McmLite
    public final void startContactLessPayment(ContactlessTransactionListener contactlessTransactionListener, BusinessLogicTransactionInformation businessLogicTransactionInformation) throws McmLiteInvalidInput, ContactlessLogicException {
        this.f50810a.getState().startContactLessPayment(contactlessTransactionListener, businessLogicTransactionInformation);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.McmLite
    public final void startRemotePayment() throws DsrpIncompatibleProfile {
        this.f50810a.getState().startRemotePayment();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.McmLite
    public final void stop() {
        this.f50810a.getState().stop();
    }

    public McmLiteImpl(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager) {
        McmLiteStateContext mcmLiteStateContext = new McmLiteStateContext(mcmLiteCrypto, mcmLiteProfile, transactionCredentialsManager, cdCvmValidatorInformation, consentManager, adviceManager, null, null, true);
        this.f50810a = mcmLiteStateContext;
        mcmLiteStateContext.setInitializedState();
    }
}
