package wh;

import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.state.InvalidState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.remotepayment.RemoteCryptogram;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteStateContext;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.RemotePaymentContext;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;

/* JADX INFO: compiled from: RpReadyState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements McmLiteState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteCrypto f94255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final McmLiteStateContext f94256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemotePaymentContext f94257c;

    public f(McmLiteCrypto mcmLiteCrypto, McmLiteStateContext mcmLiteStateContext) {
        this.f94255a = mcmLiteCrypto;
        this.f94256b = mcmLiteStateContext;
        this.f94257c = new RemotePaymentContext(mcmLiteStateContext.getTransactionCredentialsManager(), mcmLiteStateContext.getCdCvmValidatorInformation(), mcmLiteStateContext.getConsentManager(), mcmLiteStateContext.getAdviceManager());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void cancelPayment() {
        McmLiteCrypto mcmLiteCrypto = this.f94255a;
        McmLiteStateContext mcmLiteStateContext = this.f94256b;
        mcmLiteStateContext.setState(new e(mcmLiteCrypto, mcmLiteStateContext));
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final TransactionOutput createRemoteCryptogram(CryptogramInput cryptogramInput) throws McmLiteInvalidInput {
        if (cryptogramInput == null) {
            cancelPayment();
            throw new McmLiteInvalidInput("Invalid Input Data");
        }
        try {
            return new RemoteCryptogram(this.f94255a, this.f94256b.getProfile(), cryptogramInput, this.f94257c).build();
        } catch (ContactlessLogicException e5) {
            e5.printStackTrace();
            return null;
        } finally {
            cancelPayment();
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void initialize(McmLiteProfile mcmLiteProfile) {
        throw new InvalidState("Invalid State for initialize");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final byte[] processApdu(byte[] bArr) {
        return ResponseApduFactory.conditionsOfUseNotSatisfied();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void startContactLessPayment(ContactlessTransactionListener contactlessTransactionListener, BusinessLogicTransactionInformation businessLogicTransactionInformation) {
        throw new InvalidState("Invalid State for startContactLessPayment");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void startRemotePayment() {
        throw new InvalidState("Invalid State for startRemotePayment");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void stop() {
        cancelPayment();
        McmLiteStateContext mcmLiteStateContext = this.f94256b;
        McmLiteProfile profile = mcmLiteStateContext.getProfile();
        if (profile != null) {
            profile.wipe();
        }
        mcmLiteStateContext.setStoppedState();
    }
}
