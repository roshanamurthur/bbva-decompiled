package wh;

import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.state.InvalidState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteStateContext;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;

/* JADX INFO: compiled from: StoppedState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements McmLiteState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteStateContext f94258a;

    public g(McmLiteStateContext mcmLiteStateContext) {
        this.f94258a = mcmLiteStateContext;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void cancelPayment() {
        throw new InvalidState("Invalid State for cancelPayment");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final TransactionOutput createRemoteCryptogram(CryptogramInput cryptogramInput) {
        throw new InvalidState("Invalid State for createRemoteCryptogram");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void initialize(McmLiteProfile mcmLiteProfile) throws McmLiteInvalidInput {
        if (mcmLiteProfile == null) {
            throw new McmLiteInvalidInput("Invalid Input Data");
        }
        this.f94258a.setInitializedState();
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
    }
}
