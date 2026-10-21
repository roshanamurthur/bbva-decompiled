package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.ConditionsOfUseNotSatisfied;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidLc;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.CardRiskManager;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.CardVerificationResults;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.PosCardholderInteractionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.RulesBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.AdditionalCheckTable;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.ContactlessLogImpl;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.CryptogramOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformationBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.ConditionOfUse;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformationBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.security.GeneralSecurityException;
import uh.b;

/* JADX INFO: loaded from: classes10.dex */
public final class GenerateApplicationCryptogram {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteCrypto f50842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GenerateAcCommandApdu f50843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactlessContext f50844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContactlessPaymentData f50845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CardRiskManagementData f50846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CardVerificationResults f50847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PosCardholderInteractionInformation f50848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CryptogramInformationData f50849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f50850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f50851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TransactionCredentialsManager f50852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ContactlessTransactionContext f50853l;
    public final ContactlessTransactionListener m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TransactionInformation f50854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TerminalInformation f50855o;

    public GenerateApplicationCryptogram(McmLiteCrypto mcmLiteCrypto, GenerateAcCommandApdu generateAcCommandApdu, ContactlessContext contactlessContext) {
        byte[] paymentFci;
        this.f50842a = mcmLiteCrypto;
        this.f50843b = generateAcCommandApdu;
        this.f50844c = contactlessContext;
        McmLiteProfile cardProfile = contactlessContext.getCardProfile();
        if (cardProfile == null) {
            throw new ContactlessLogicException("Invalid Card Profile for Generate AC");
        }
        ContactlessPaymentData contactlessPaymentData = cardProfile.getContactlessPaymentData();
        this.f50845d = contactlessPaymentData;
        CardRiskManagementData cardRiskManagementData = cardProfile.getCardRiskManagementData();
        this.f50846e = cardRiskManagementData;
        if (contactlessPaymentData == null || cardRiskManagementData == null) {
            throw new ContactlessLogicException("Invalid Card Profile for Generate AC");
        }
        ContactlessTransactionContext transactionContext = contactlessContext.getTransactionContext();
        this.f50853l = transactionContext;
        if (transactionContext.isAlternateAid()) {
            AlternateContactlessPaymentData alternateContactlessPaymentData = contactlessPaymentData.getAlternateContactlessPaymentData();
            this.f50850i = alternateContactlessPaymentData.getCiacDecline();
            this.f50851j = alternateContactlessPaymentData.getCvrMaskAnd();
            paymentFci = alternateContactlessPaymentData.getPaymentFci();
        } else {
            this.f50850i = contactlessPaymentData.getCiacDecline();
            this.f50851j = contactlessPaymentData.getCvrMaskAnd();
            paymentFci = contactlessPaymentData.getPaymentFci();
        }
        byte[] applicationLabel = ContactlessUtils.readApplicationLabel(paymentFci);
        this.f50847f = CardVerificationResults.withIssuerApplicationData(contactlessPaymentData.getIssuerApplicationData());
        this.f50849h = new CryptogramInformationData();
        this.f50852k = contactlessContext.getTransactionCredentialsManager();
        this.m = contactlessContext.getTransactionListener();
        this.f50854n = TransactionInformationBuilder.forMchip(applicationLabel, cardRiskManagementData.getCrmCountryCode(), generateAcCommandApdu, transactionContext.getPdolValues());
        contactlessContext.getTransactionContext().setCdolData(generateAcCommandApdu.getCdol());
        this.f50855o = TerminalInformationBuilder.forMchip(generateAcCommandApdu, transactionContext.getPdolValues(), transactionContext.getCdolValues());
    }

    public static byte[] b(GenerateApplicationCryptogram generateApplicationCryptogram, TransactionCredentials transactionCredentials) {
        generateApplicationCryptogram.getClass();
        generateApplicationCryptogram.f50853l.setAtc(transactionCredentials.getAtc());
        CardVerificationResults cardVerificationResults = generateApplicationCryptogram.f50847f;
        cardVerificationResults.indicateAacReturnedInFirstAndAcNotRequestedInSecondGenerateAc();
        generateApplicationCryptogram.f50849h.indicateDecline();
        GenerateAcCommandApdu generateAcCommandApdu = generateApplicationCryptogram.f50843b;
        if (generateAcCommandApdu.isAacRequested() && generateAcCommandApdu.isCombinedDdaAcGenerationRequested() && generateApplicationCryptogram.f50844c.isCdCvmEntered()) {
            cardVerificationResults.indicateCombinedDdaAcGenerationReturnedInFirstGenerateAc();
        }
        return generateApplicationCryptogram.a(transactionCredentials);
    }

    public static GenerateApplicationCryptogram of(McmLiteCrypto mcmLiteCrypto, GenerateAcCommandApdu generateAcCommandApdu, ContactlessContext contactlessContext) {
        if (generateAcCommandApdu == null || contactlessContext == null) {
            throw new ContactlessLogicException("Invalid Parameters to process the Generate AC");
        }
        return new GenerateApplicationCryptogram(mcmLiteCrypto, generateAcCommandApdu, contactlessContext);
    }

    public final byte[] a(TransactionCredentials transactionCredentials) {
        byte[] bytes;
        CardVerificationResults cardVerificationResults = this.f50847f;
        cardVerificationResults.applyMaskAnd(this.f50851j);
        byte[] atc = transactionCredentials.getAtc();
        byte[] bArr = new byte[39];
        GenerateAcCommandApdu generateAcCommandApdu = this.f50843b;
        byte[] cdol = generateAcCommandApdu.getCdol();
        ContactlessTransactionContext contactlessTransactionContext = this.f50853l;
        byte[] aip = contactlessTransactionContext.getAip();
        System.arraycopy(cdol, 0, bArr, 0, 29);
        System.arraycopy(aip, 0, bArr, 29, 2);
        System.arraycopy(atc, 0, bArr, 31, 2);
        System.arraycopy(cardVerificationResults.getBytes(), 0, bArr, 33, 6);
        byte[] umdSessionKey = transactionCredentials.getUmdSessionKey();
        byte[] mdSessionKey = transactionCredentials.getMdSessionKey();
        try {
            try {
                McmLiteCrypto.TransactionCryptograms transactionCryptogramsBuildGenerateAcCryptograms = this.f50842a.buildGenerateAcCryptograms(bArr, umdSessionKey, mdSessionKey);
                McmLiteUtils.clearByteArray(umdSessionKey);
                McmLiteUtils.clearByteArray(mdSessionKey);
                byte[] umdCryptogram = transactionCryptogramsBuildGenerateAcCryptograms.getUmdCryptogram();
                byte[] mdCryptogram = transactionCryptogramsBuildGenerateAcCryptograms.getMdCryptogram();
                this.f50844c.getTransactionContext().setCryptogram(umdCryptogram);
                ContactlessPaymentData contactlessPaymentData = this.f50845d;
                byte[] issuerApplicationData = contactlessPaymentData.getIssuerApplicationData();
                byte[] bArr2 = new byte[issuerApplicationData.length];
                System.arraycopy(issuerApplicationData, 0, bArr2, 0, issuerApplicationData.length);
                System.arraycopy(cardVerificationResults.getBytes(), 0, bArr2, 2, 6);
                if (McmLiteUtils.isZero(generateAcCommandApdu.getIccDynamicNumber())) {
                    System.arraycopy(generateAcCommandApdu.getDataAuthenticationCode(), 0, bArr2, 8, 2);
                } else {
                    System.arraycopy(generateAcCommandApdu.getIccDynamicNumber(), 0, bArr2, 8, 2);
                }
                System.arraycopy(mdCryptogram, 0, bArr2, 11, 5);
                CryptogramOutput cryptogramOutput = new CryptogramOutput(transactionCredentials.getAtc(), bArr2, umdCryptogram, this.f50849h.getValue());
                boolean zIsCombinedDdaAcGenerationReturnedInFirstGenerateAc = cardVerificationResults.isCombinedDdaAcGenerationReturnedInFirstGenerateAc();
                TerminalInformation terminalInformation = this.f50855o;
                TransactionInformation transactionInformation = this.f50854n;
                ContactlessTransactionListener contactlessTransactionListener = this.m;
                if (zIsCombinedDdaAcGenerationReturnedInFirstGenerateAc) {
                    byte[] idn = transactionCredentials.getIdn();
                    IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents = contactlessPaymentData.getIccPrivateKeyCrtComponents();
                    GenerateAcResponseApdu generateAcResponseApduWithCda = GenerateAcResponseApdu.withCda(this.f50842a, this.f50843b, this.f50853l, this.f50848g, cryptogramOutput, idn, iccPrivateKeyCrtComponents);
                    iccPrivateKeyCrtComponents.wipe();
                    contactlessTransactionListener.onContactlessTransactionCompleted(ContactlessLogImpl.forMchip(contactlessTransactionContext, terminalInformation, transactionInformation));
                    bytes = generateAcResponseApduWithCda.getBytes();
                } else {
                    bytes = GenerateAcResponseApdu.withoutCda(generateAcCommandApdu, contactlessTransactionContext, this.f50848g, cryptogramOutput).getBytes();
                    contactlessTransactionListener.onContactlessTransactionCompleted(ContactlessLogImpl.forMchip(contactlessTransactionContext, terminalInformation, transactionInformation));
                }
                cryptogramOutput.wipe();
                transactionCredentials.wipe();
                McmLiteUtils.clearByteArray(umdCryptogram);
                McmLiteUtils.clearByteArray(mdCryptogram);
                return bytes;
            } catch (GeneralSecurityException e5) {
                throw new ContactlessLogicException(e5.getMessage());
            }
        } catch (Throwable th2) {
            McmLiteUtils.clearByteArray(umdSessionKey);
            McmLiteUtils.clearByteArray(mdSessionKey);
            throw th2;
        }
    }

    public byte[] response() {
        ContactlessTransactionContext contactlessTransactionContext = this.f50853l;
        boolean zIsAlternateAid = contactlessTransactionContext.isAlternateAid();
        ContactlessPaymentData contactlessPaymentData = this.f50845d;
        if (!(zIsAlternateAid ? contactlessPaymentData.isAlternateAidMchipDataValid() : contactlessPaymentData.isPrimaryAidMchipDataValid())) {
            throw new ConditionsOfUseNotSatisfied("MCHIP profile data is not available");
        }
        int cdol1RelatedDataLength = contactlessPaymentData.getCdol1RelatedDataLength();
        GenerateAcCommandApdu generateAcCommandApdu = this.f50843b;
        if (cdol1RelatedDataLength != generateAcCommandApdu.getCdol().length) {
            throw new InvalidLc("CDOL and CDOL1 Related Data Length do not match");
        }
        if (McmLiteUtils.isTerminalOffline(generateAcCommandApdu.getTerminalType())) {
            throw new ConditionsOfUseNotSatisfied("The Terminal is offline");
        }
        contactlessTransactionContext.setAmount(generateAcCommandApdu.getAuthorizedAmount());
        contactlessTransactionContext.setCurrencyCode(generateAcCommandApdu.getTransactionCurrencyCode());
        contactlessTransactionContext.setTrxDate(generateAcCommandApdu.getTransactionDate());
        contactlessTransactionContext.setTrxType(generateAcCommandApdu.getTransactionType());
        contactlessTransactionContext.setUnpredictableNumber(generateAcCommandApdu.getUnpredictableNumber());
        TransactionInformation transactionInformation = this.f50854n;
        ConditionOfUse conditionOfUse = transactionInformation.getConditionOfUse();
        ConditionOfUse conditionOfUse2 = ConditionOfUse.DOMESTIC;
        CardVerificationResults cardVerificationResults = this.f50847f;
        if (conditionOfUse == conditionOfUse2) {
            cardVerificationResults.indicateDomesticTransaction();
        } else {
            cardVerificationResults.indicatedInternationalTransaction();
        }
        AdditionalCheckTable.Result resultProcess = AdditionalCheckTable.process(generateAcCommandApdu.getCdol(), this.f50851j, this.f50850i, this.f50846e.getAdditionalCheckTable());
        if (resultProcess == AdditionalCheckTable.Result.MATCH_FOUND) {
            cardVerificationResults.indicateMatchFoundInAdditionalCheckTable();
        } else if (resultProcess == AdditionalCheckTable.Result.MATCH_NOT_FOUND) {
            cardVerificationResults.indicateMatchNotFoundInAdditionalCheckTable();
        }
        ContactlessContext contactlessContext = this.f50844c;
        if (contactlessContext.isCdCvmEntered()) {
            cardVerificationResults.indicateCdCvmPerformed();
        } else {
            cardVerificationResults.indicateCdCvmNotPerformed();
        }
        Advice masterCardAdvice = CardRiskManager.getMasterCardAdvice(RulesBuilder.forMchip(this.f50843b, this.f50844c, this.f50854n, this.f50847f, this.f50850i, this.f50852k.hasValidCredentialsFor(TransactionCredentialsManager.Scope.CONTACTLESS)));
        if (masterCardAdvice.getReasons().contains(Reason.MISSING_CD_CVM)) {
            cardVerificationResults.indicateTerminalErroneouslyConsiderOfflinePinOk();
        }
        return (byte[]) new TransactionOutcomeBuilder(contactlessContext.getWalletAdvice(masterCardAdvice, transactionInformation, this.f50855o), this.f50854n, this.f50855o, this.f50852k, contactlessContext.isCdCvmEntered(), contactlessContext.getUmdValidity(), new b(this)).buildResponse();
    }
}
