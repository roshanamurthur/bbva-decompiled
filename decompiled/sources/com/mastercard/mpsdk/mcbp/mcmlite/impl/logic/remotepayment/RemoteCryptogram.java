package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.remotepayment;

import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.cardprofile.McmLiteInvalidDigitizedCardProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.CardRiskManager;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.CardVerificationResults;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.RulesBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.AdditionalCheckTable;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.CryptogramInformationData;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.CryptogramOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.RemotePaymentContext;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformationBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformationBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.LinkedList;
import vh.a;

/* JADX INFO: loaded from: classes10.dex */
public final class RemoteCryptogram {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteCrypto f50868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemotePaymentData f50869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardRiskManagementData f50870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TransactionCredentialsManager f50871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CryptogramInput f50872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CardVerificationResults f50873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RemotePaymentContext f50874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TransactionInformation f50875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TerminalInformation f50876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CryptogramInformationData f50877j;

    public RemoteCryptogram(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, CryptogramInput cryptogramInput, RemotePaymentContext remotePaymentContext) throws McmLiteInvalidDigitizedCardProfile {
        this.f50868a = mcmLiteCrypto;
        RemotePaymentData remotePaymentData = mcmLiteProfile.getRemotePaymentData();
        this.f50869b = remotePaymentData;
        if (remotePaymentData == null) {
            throw new McmLiteInvalidDigitizedCardProfile("Remote payment data not found");
        }
        CardRiskManagementData cardRiskManagementData = mcmLiteProfile.getCardRiskManagementData();
        this.f50870c = cardRiskManagementData;
        if (cardRiskManagementData == null) {
            throw new McmLiteInvalidDigitizedCardProfile("Card Risk Management data not found");
        }
        this.f50872e = cryptogramInput;
        this.f50874g = remotePaymentContext;
        this.f50871d = remotePaymentContext.getTransactionCredentialsManager();
        this.f50873f = CardVerificationResults.withIssuerApplicationData(remotePaymentData.getIssuerApplicationData());
        this.f50875h = TransactionInformationBuilder.forRemotePayment(cardRiskManagementData.getCrmCountryCode(), cryptogramInput);
        this.f50877j = new CryptogramInformationData();
        this.f50876i = TerminalInformationBuilder.forRemotePayment(cryptogramInput);
    }

    public static TransactionOutput a(RemoteCryptogram remoteCryptogram, CryptogramInput cryptogramInput, byte b10, TransactionCredentials transactionCredentials) {
        remoteCryptogram.getClass();
        byte[] atc = transactionCredentials.getAtc();
        RemotePaymentData remotePaymentData = remoteCryptogram.f50869b;
        byte[] cvrMaskAnd = remotePaymentData.getCvrMaskAnd();
        CardVerificationResults cardVerificationResults = remoteCryptogram.f50873f;
        cardVerificationResults.applyMaskAnd(cvrMaskAnd);
        LinkedList linkedList = new LinkedList();
        linkedList.add(b(cryptogramInput));
        linkedList.add(remotePaymentData.getAip());
        linkedList.add(atc);
        linkedList.add(cardVerificationResults.getBytes());
        try {
            McmLiteCrypto.TransactionCryptograms transactionCryptogramsBuildGenerateAcCryptograms = remoteCryptogram.f50868a.buildGenerateAcCryptograms(McmLiteUtils.concatenateArrays(linkedList), transactionCredentials.getUmdSessionKey(), transactionCredentials.getMdSessionKey());
            byte[] umdCryptogram = transactionCryptogramsBuildGenerateAcCryptograms.getUmdCryptogram();
            byte[] mdCryptogram = transactionCryptogramsBuildGenerateAcCryptograms.getMdCryptogram();
            byte[] issuerApplicationData = remotePaymentData.getIssuerApplicationData();
            byte[] bArr = new byte[issuerApplicationData.length];
            byte[] bytes = cardVerificationResults.getBytes();
            System.arraycopy(issuerApplicationData, 0, bArr, 0, issuerApplicationData.length);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            bArr[8] = 0;
            bArr[9] = 0;
            System.arraycopy(mdCryptogram, 0, bArr, 11, 5);
            CryptogramOutput cryptogramOutput = new CryptogramOutput(atc, bArr, umdCryptogram, b10);
            transactionCredentials.wipe();
            return new TransactionOutput(remotePaymentData.getTrack2EquivalentData(), remotePaymentData.getPan(), remotePaymentData.getPanSequenceNumber(), remotePaymentData.getAip(), remotePaymentData.getApplicationExpiryDate(), remoteCryptogram.f50874g.isCdCvmEntered(), cryptogramOutput);
        } catch (GeneralSecurityException e5) {
            throw new InternalError(e5.getMessage());
        }
    }

    public static byte[] b(CryptogramInput cryptogramInput) {
        LinkedList linkedList = new LinkedList();
        if (cryptogramInput.getAmountAuthorized() == null) {
            linkedList.add(new byte[6]);
        } else {
            linkedList.add(cryptogramInput.getAmountAuthorized());
        }
        if (cryptogramInput.getAmountOther() == null) {
            linkedList.add(new byte[6]);
        } else {
            linkedList.add(cryptogramInput.getAmountOther());
        }
        if (cryptogramInput.getTerminalCountryCode() == null) {
            linkedList.add(new byte[2]);
        } else {
            linkedList.add(cryptogramInput.getTerminalCountryCode());
        }
        if (cryptogramInput.getTvr() == null) {
            linkedList.add(new byte[5]);
        } else {
            linkedList.add(cryptogramInput.getTvr());
        }
        if (cryptogramInput.getTransactionCurrencyCode() == null) {
            linkedList.add(new byte[2]);
        } else {
            linkedList.add(cryptogramInput.getTransactionCurrencyCode());
        }
        if (cryptogramInput.getTransactionDate() == null) {
            linkedList.add(new byte[3]);
        } else {
            linkedList.add(cryptogramInput.getTransactionDate());
        }
        if (cryptogramInput.getTransactionType() == null) {
            linkedList.add(new byte[1]);
        } else {
            linkedList.add(cryptogramInput.getTransactionType());
        }
        if (cryptogramInput.getUnpredictableNumber() == null) {
            linkedList.add(new byte[4]);
        } else {
            linkedList.add(cryptogramInput.getUnpredictableNumber());
        }
        return McmLiteUtils.concatenateArrays(linkedList);
    }

    public final TransactionOutput build() {
        CryptogramInput cryptogramInput = this.f50872e;
        byte[] terminalCountryCode = cryptogramInput.getTerminalCountryCode();
        CardRiskManagementData cardRiskManagementData = this.f50870c;
        byte[] crmCountryCode = cardRiskManagementData.getCrmCountryCode();
        CardVerificationResults cardVerificationResults = this.f50873f;
        if (terminalCountryCode == null || !Arrays.equals(terminalCountryCode, crmCountryCode)) {
            cardVerificationResults.indicatedInternationalTransaction();
        } else {
            cardVerificationResults.indicateDomesticTransaction();
        }
        byte[] bArrB = b(cryptogramInput);
        RemotePaymentData remotePaymentData = this.f50869b;
        AdditionalCheckTable.Result resultProcess = AdditionalCheckTable.process(bArrB, remotePaymentData.getCvrMaskAnd(), remotePaymentData.getCiacDecline(), cardRiskManagementData.getAdditionalCheckTable());
        if (resultProcess == AdditionalCheckTable.Result.MATCH_FOUND) {
            cardVerificationResults.indicateMatchFoundInAdditionalCheckTable();
        } else if (resultProcess == AdditionalCheckTable.Result.MATCH_NOT_FOUND) {
            cardVerificationResults.indicateMatchNotFoundInAdditionalCheckTable();
        }
        RemotePaymentContext remotePaymentContext = this.f50874g;
        if (remotePaymentContext.isCdCvmEntered()) {
            cardVerificationResults.indicateCdCvmPerformed();
        } else {
            cardVerificationResults.indicateCdCvmNotPerformed();
        }
        byte[] ciacDecline = remotePaymentData.getCiacDecline();
        boolean zHasValidCredentialsFor = this.f50871d.hasValidCredentialsFor(TransactionCredentialsManager.Scope.REMOTE_PAYMENT);
        TransactionInformation transactionInformation = this.f50875h;
        return (TransactionOutput) new TransactionOutcomeBuilder(remotePaymentContext.getWalletAdvice(CardRiskManager.getMasterCardAdvice(RulesBuilder.forRemotePayment(remotePaymentContext, transactionInformation, cardVerificationResults, ciacDecline, zHasValidCredentialsFor)), transactionInformation, this.f50876i), this.f50875h, this.f50876i, this.f50871d, remotePaymentContext.isCdCvmEntered(), remotePaymentContext.getUmdValidity(), new a(this)).buildResponse();
    }
}
