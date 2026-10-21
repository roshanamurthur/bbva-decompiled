package uh;

import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.riskmanager.CvmRiskManagerBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.CardVerificationResults;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.PosCardholderInteractionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.GenerateApplicationCryptogram;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionSummary;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import java.util.List;

/* JADX INFO: compiled from: GenerateApplicationCryptogram.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements TransactionOutcomeBuilderListener<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GenerateApplicationCryptogram f93860a;

    public b(GenerateApplicationCryptogram generateApplicationCryptogram) {
        this.f93860a = generateApplicationCryptogram;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] error(List<Reason> list) {
        boolean zContains = list.contains(Reason.CONTEXT_NOT_MATCHING);
        GenerateApplicationCryptogram generateApplicationCryptogram = this.f93860a;
        if (zContains) {
            generateApplicationCryptogram.f50844c.getTransactionContext().setResult(TransactionSummary.ERROR_CONTEXT_CONFLICT);
            generateApplicationCryptogram.f50848g = PosCardholderInteractionInformation.forErrorMchip(list);
        } else {
            generateApplicationCryptogram.f50844c.getTransactionContext().setResult(TransactionSummary.ERROR);
        }
        return GenerateApplicationCryptogram.b(generateApplicationCryptogram, generateApplicationCryptogram.f50852k.getRandomCredentials());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final byte[] abort(List list) {
        GenerateApplicationCryptogram generateApplicationCryptogram = this.f93860a;
        generateApplicationCryptogram.f50844c.getTransactionContext().setResult(TransactionSummary.ABORT_PERSISTENT_CONTEXT);
        generateApplicationCryptogram.f50847f.indicateCvmRequiredNotSatisfied();
        generateApplicationCryptogram.f50848g = PosCardholderInteractionInformation.forAbortMchip(list);
        return GenerateApplicationCryptogram.b(generateApplicationCryptogram, generateApplicationCryptogram.f50852k.getRandomCredentials());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final byte[] approveOnline(List list, TransactionCredentials transactionCredentials) {
        GenerateApplicationCryptogram generateApplicationCryptogram = this.f93860a;
        generateApplicationCryptogram.f50844c.getTransactionContext().setResult(TransactionSummary.AUTHORIZE_ONLINE);
        generateApplicationCryptogram.f50848g = PosCardholderInteractionInformation.forApproveMchip();
        CardVerificationResults cardVerificationResults = generateApplicationCryptogram.f50847f;
        cardVerificationResults.setFlagsForApproval();
        CvmRiskManagerBuilder.getDefault().update(generateApplicationCryptogram.f50854n);
        generateApplicationCryptogram.f50853l.setAtc(transactionCredentials.getAtc());
        cardVerificationResults.indicateArqcReturnedInFirstAndAcNotRequestedInSecondGenerateAc();
        generateApplicationCryptogram.f50849h.indicateOnlineDecision();
        if (generateApplicationCryptogram.f50843b.isCombinedDdaAcGenerationRequested()) {
            cardVerificationResults.indicateCombinedDdaAcGenerationReturnedInFirstGenerateAc();
        }
        return generateApplicationCryptogram.a(transactionCredentials);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final byte[] authenticate(List list, TransactionCredentials transactionCredentials) {
        GenerateApplicationCryptogram generateApplicationCryptogram = this.f93860a;
        generateApplicationCryptogram.f50844c.getTransactionContext().setResult(TransactionSummary.AUTHENTICATE_ONLINE);
        generateApplicationCryptogram.f50848g = PosCardholderInteractionInformation.forAuthenticateMchip();
        generateApplicationCryptogram.f50847f.setFlagsForApproval();
        return GenerateApplicationCryptogram.b(generateApplicationCryptogram, transactionCredentials);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilderListener
    public final byte[] decline(List list) {
        if (list.contains(Reason.CONTEXT_NOT_MATCHING)) {
            return error(list);
        }
        GenerateApplicationCryptogram generateApplicationCryptogram = this.f93860a;
        generateApplicationCryptogram.f50844c.getTransactionContext().setResult(TransactionSummary.DECLINE);
        generateApplicationCryptogram.f50848g = PosCardholderInteractionInformation.forDeclineMchip();
        return GenerateApplicationCryptogram.b(generateApplicationCryptogram, generateApplicationCryptogram.f50852k.getRandomCredentials());
    }
}
