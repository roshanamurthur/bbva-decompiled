package com.mastercard.mpsdk.mcbp.mcmlite;

import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.cardprofile.DsrpIncompatibleProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;

/* JADX INFO: loaded from: classes10.dex */
public interface McmLite {
    void cancelPayment() throws ContactlessLogicException;

    TransactionOutput createRemoteCryptogram(CryptogramInput cryptogramInput);

    String getVersion();

    byte[] processApdu(byte[] bArr);

    void startContactLessPayment(ContactlessTransactionListener contactlessTransactionListener, BusinessLogicTransactionInformation businessLogicTransactionInformation) throws McmLiteInvalidInput, ContactlessLogicException;

    void startRemotePayment() throws DsrpIncompatibleProfile;

    void stop();
}
