package vh;

import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.CryptogramInformationData;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.remotepayment.RemoteCryptogram;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import java.util.List;

/* JADX INFO: compiled from: RemoteCryptogram.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements TransactionOutcomeBuilderListener<TransactionOutput> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemoteCryptogram f94068a;

    public a(RemoteCryptogram remoteCryptogram) {
        this.f94068a = remoteCryptogram;
    }

    public final TransactionOutput a() {
        RemoteCryptogram remoteCryptogram = this.f94068a;
        remoteCryptogram.f50873f.indicateAacReturnedInFirstAndAcNotRequestedInSecondGenerateAc();
        CryptogramInformationData cryptogramInformationData = remoteCryptogram.f50877j;
        cryptogramInformationData.indicateDecline();
        return RemoteCryptogram.a(remoteCryptogram, remoteCryptogram.f50872e, cryptogramInformationData.getValue(), remoteCryptogram.f50871d.getRandomCredentials());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final TransactionOutput abort(List list) {
        if (list.contains(Reason.MISSING_CONSENT) || list.contains(Reason.MISSING_CD_CVM)) {
            this.f94068a.f50873f.indicateCvmRequiredNotSatisfied();
        }
        return a();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final TransactionOutput approveOnline(List list, TransactionCredentials transactionCredentials) {
        RemoteCryptogram remoteCryptogram = this.f94068a;
        remoteCryptogram.f50877j.indicateOnlineDecision();
        remoteCryptogram.f50873f.indicateArqcReturnedInFirstAndAcNotRequestedInSecondGenerateAc();
        return RemoteCryptogram.a(remoteCryptogram, remoteCryptogram.f50872e, remoteCryptogram.f50877j.getValue(), transactionCredentials);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final TransactionOutput authenticate(List list, TransactionCredentials transactionCredentials) {
        return a();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final /* bridge */ /* synthetic */ TransactionOutput decline(List list) {
        return a();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final TransactionOutput error(List list) {
        return a();
    }
}
