package wh;

import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.cardprofile.DsrpIncompatibleProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.state.InvalidState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteStateContext;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;

/* JADX INFO: compiled from: InitializedState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements McmLiteState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteCrypto f94253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final McmLiteStateContext f94254b;

    public e(McmLiteCrypto mcmLiteCrypto, McmLiteStateContext mcmLiteStateContext) {
        this.f94253a = mcmLiteCrypto;
        this.f94254b = mcmLiteStateContext;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void cancelPayment() {
        throw new InvalidState("Invalid state for cancelPayment");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final TransactionOutput createRemoteCryptogram(CryptogramInput cryptogramInput) {
        throw new InvalidState("Invalid state for createRemoteCryptogram");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void initialize(McmLiteProfile mcmLiteProfile) {
        throw new InvalidState("Invalid state to initialize the MCM Lite");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final byte[] processApdu(byte[] bArr) {
        return ResponseApduFactory.conditionsOfUseNotSatisfied();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void startContactLessPayment(ContactlessTransactionListener contactlessTransactionListener, BusinessLogicTransactionInformation businessLogicTransactionInformation) throws McmLiteInvalidInput {
        McmLiteCrypto mcmLiteCrypto = this.f94253a;
        McmLiteStateContext mcmLiteStateContext = this.f94254b;
        mcmLiteStateContext.setState(new b(mcmLiteCrypto, mcmLiteStateContext, contactlessTransactionListener, businessLogicTransactionInformation));
        contactlessTransactionListener.onContactlessReady();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void startRemotePayment() throws DsrpIncompatibleProfile {
        McmLiteStateContext mcmLiteStateContext = this.f94254b;
        if (mcmLiteStateContext.getProfile().getRemotePaymentData() == null) {
            throw new DsrpIncompatibleProfile("The profile does not support DSRP");
        }
        mcmLiteStateContext.setState(new f(this.f94253a, mcmLiteStateContext));
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void stop() {
        this.f94254b.getProfile();
        cancelPayment();
        throw null;
    }
}
