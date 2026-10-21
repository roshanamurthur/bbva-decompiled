package com.mastercard.mpsdk.mcbp.mcmlite.impl.state;

import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.cardprofile.DsrpIncompatibleProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public interface McmLiteState {
    void cancelPayment();

    TransactionOutput createRemoteCryptogram(CryptogramInput cryptogramInput) throws GeneralSecurityException, McmLiteInvalidInput;

    void initialize(McmLiteProfile mcmLiteProfile) throws McmLiteInvalidInput;

    byte[] processApdu(byte[] bArr);

    void startContactLessPayment(ContactlessTransactionListener contactlessTransactionListener, BusinessLogicTransactionInformation businessLogicTransactionInformation) throws McmLiteInvalidInput;

    void startRemotePayment() throws DsrpIncompatibleProfile;

    void stop();
}
