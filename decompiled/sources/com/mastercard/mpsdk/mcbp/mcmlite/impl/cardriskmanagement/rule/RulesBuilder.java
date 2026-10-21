package com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.riskmanager.CvmRiskManagerBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.CardVerificationResults;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.RemotePaymentContext;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.ConditionOfUse;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionRange;
import java.util.ArrayList;
import java.util.List;
import th.a;
import th.b;
import th.c;
import th.d;
import th.e;
import th.f;

/* JADX INFO: loaded from: classes10.dex */
public class RulesBuilder {
    public static ArrayList a(ContactlessContext contactlessContext, TransactionInformation transactionInformation, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(contactlessContext.isConsentGiven()));
        arrayList.add(new c(contactlessContext.isCdCvmEntered(), contactlessContext.getUmdValidity() == CdCvmValidatorInformation.UmdValidity.ALWAYS, contactlessContext.getTransactionCredentialsManager().areUmdCredentialsSubjectToCvmFor(transactionInformation.getTransactionRange(), TransactionCredentialsManager.Scope.CONTACTLESS)));
        arrayList.add(new d(z10));
        return arrayList;
    }

    public static List<Rule> forMagstripe(ComputeCcCommandApdu computeCcCommandApdu, ContactlessContext contactlessContext, TransactionInformation transactionInformation, byte[] bArr, boolean z10) {
        ArrayList arrayListA = a(contactlessContext, transactionInformation, z10);
        arrayListA.add(new b(computeCcCommandApdu.getAuthorizedAmount(), computeCcCommandApdu.getTransactionCurrencyCode(), contactlessContext.getBlAmount(), contactlessContext.getBlCurrency(), contactlessContext.isBlExactAmount()));
        arrayListA.add(new f(transactionInformation.getConditionOfUse() != ConditionOfUse.DOMESTIC ? (bArr[0] & 4) != 4 : (bArr[0] & 2) != 2));
        arrayListA.add(new e(contactlessContext.isCdCvmEnabled(), contactlessContext.isCdCvmEntered(), transactionInformation.getTransactionRange() != TransactionRange.LOW_VALUE && transactionInformation.hasTerminalDelegatedCdCvm(), CvmRiskManagerBuilder.getDefault().isUserSufficientlyAuthenticated(contactlessContext.isCdCvmEntered(), contactlessContext.getLastSuccessfulAuthenticationTimeInMilliseconds(), transactionInformation), transactionInformation));
        return arrayListA;
    }

    public static List<Rule> forMchip(GenerateAcCommandApdu generateAcCommandApdu, ContactlessContext contactlessContext, TransactionInformation transactionInformation, CardVerificationResults cardVerificationResults, byte[] bArr, boolean z10) {
        ArrayList arrayListA = a(contactlessContext, transactionInformation, z10);
        arrayListA.add(new b(generateAcCommandApdu.getAuthorizedAmount(), generateAcCommandApdu.getTransactionCurrencyCode(), contactlessContext.getBlAmount(), contactlessContext.getBlCurrency(), contactlessContext.isBlExactAmount()));
        arrayListA.add(new f(!cardVerificationResults.isCiacDeclineMatchFound(bArr)));
        arrayListA.add(new e(contactlessContext.isCdCvmEnabled(), contactlessContext.isCdCvmEntered(), transactionInformation.getTransactionRange() != TransactionRange.LOW_VALUE && transactionInformation.hasTerminalDelegatedCdCvm(), CvmRiskManagerBuilder.getDefault().isUserSufficientlyAuthenticated(contactlessContext.isCdCvmEntered(), contactlessContext.getLastSuccessfulAuthenticationTimeInMilliseconds(), transactionInformation), transactionInformation));
        return arrayListA;
    }

    public static List<Rule> forRemotePayment(RemotePaymentContext remotePaymentContext, TransactionInformation transactionInformation, CardVerificationResults cardVerificationResults, byte[] bArr, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f(!cardVerificationResults.isCiacDeclineMatchFound(bArr)));
        arrayList.add(new a(remotePaymentContext.isConsentGiven()));
        arrayList.add(new e(remotePaymentContext.isCdCvmEnabled(), remotePaymentContext.isCdCvmEntered(), transactionInformation.getTransactionRange() != TransactionRange.LOW_VALUE, true, transactionInformation));
        arrayList.add(new c(remotePaymentContext.isCdCvmEntered(), remotePaymentContext.getUmdValidity() == CdCvmValidatorInformation.UmdValidity.ALWAYS, remotePaymentContext.getTransactionCredentialsManager().areUmdCredentialsSubjectToCvmFor(transactionInformation.getTransactionRange(), TransactionCredentialsManager.Scope.REMOTE_PAYMENT)));
        arrayList.add(new d(z10));
        return arrayList;
    }
}
