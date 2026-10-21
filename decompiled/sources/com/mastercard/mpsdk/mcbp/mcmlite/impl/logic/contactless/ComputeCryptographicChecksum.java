package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.ConditionsOfUseNotSatisfied;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.CardRiskManager;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.PosCardholderInteractionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.RulesBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.ContactlessLogImpl;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionOutcomeBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionSummary;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.PersistentTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformationBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformationBuilder;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.Tlv;
import uh.a;

/* JADX INFO: loaded from: classes10.dex */
public class ComputeCryptographicChecksum {
    public static final byte[] ATC_TAG = {-97, 54};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteCrypto f50814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComputeCcCommandApdu f50815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactlessContext f50816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PosCardholderInteractionInformation f50817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CryptogramInformationData f50818e = new CryptogramInformationData();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TransactionInformation f50819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TerminalInformation f50820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ContactlessPaymentData f50822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ContactlessTransactionListener f50823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ContactlessTransactionContext f50824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TransactionCredentialsManager f50825l;

    public ComputeCryptographicChecksum(McmLiteCrypto mcmLiteCrypto, ComputeCcCommandApdu computeCcCommandApdu, ContactlessContext contactlessContext) {
        this.f50814a = mcmLiteCrypto;
        this.f50815b = computeCcCommandApdu;
        this.f50816c = contactlessContext;
        McmLiteProfile cardProfile = contactlessContext.getCardProfile();
        if (cardProfile == null) {
            throw new ContactlessLogicException("Invalid Card Profile object");
        }
        ContactlessPaymentData contactlessPaymentData = cardProfile.getContactlessPaymentData();
        this.f50822i = contactlessPaymentData;
        CardRiskManagementData cardRiskManagementData = cardProfile.getCardRiskManagementData();
        if (contactlessPaymentData == null || cardRiskManagementData == null) {
            throw new ContactlessLogicException("Invalid Card Profile data");
        }
        contactlessContext.getTransactionContext().setUdolData(computeCcCommandApdu.getUdol());
        this.f50823j = contactlessContext.getTransactionListener();
        ContactlessTransactionContext transactionContext = contactlessContext.getTransactionContext();
        this.f50824k = transactionContext;
        this.f50825l = contactlessContext.getTransactionCredentialsManager();
        TerminalInformation terminalInformationForMagstripe = TerminalInformationBuilder.forMagstripe(computeCcCommandApdu, transactionContext.getPdolValues(), transactionContext.getUdolValues());
        this.f50820g = terminalInformationForMagstripe;
        this.f50819f = TransactionInformationBuilder.forMagstripe(ContactlessUtils.readApplicationLabel(transactionContext.isAlternateAid() ? contactlessPaymentData.getAlternateContactlessPaymentData().getPaymentFci() : contactlessPaymentData.getPaymentFci()), cardRiskManagementData.getCrmCountryCode(), computeCcCommandApdu, transactionContext.getUdolValues());
        this.f50821h = terminalInformationForMagstripe.getPersistentTransactionContext() == PersistentTransactionContext.YES;
    }

    public static byte[] a(ComputeCryptographicChecksum computeCryptographicChecksum, TransactionCredentials transactionCredentials) {
        byte[] bArrSecurityStatusNotSatisfied;
        computeCryptographicChecksum.getClass();
        computeCryptographicChecksum.f50824k.setAtc(transactionCredentials.getAtc());
        if (computeCryptographicChecksum.f50821h) {
            byte[] bArrCreate = Tlv.create(ATC_TAG, transactionCredentials.getAtc());
            byte[] tlv = computeCryptographicChecksum.f50817d.getTlv();
            byte[] bArr = new byte[bArrCreate.length + tlv.length];
            System.arraycopy(bArrCreate, 0, bArr, 0, bArrCreate.length);
            System.arraycopy(tlv, 0, bArr, bArrCreate.length, tlv.length);
            byte[] bArrCreate2 = Tlv.create(new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2}, bArr);
            try {
                try {
                    byte[] bArrSuccessfulProcessing = ResponseApduFactory.successfulProcessing(bArrCreate2);
                    McmLiteUtils.clearByteArray(bArrCreate);
                    McmLiteUtils.clearByteArray(tlv);
                    McmLiteUtils.clearByteArray(bArr);
                    McmLiteUtils.clearByteArray(bArrCreate2);
                    bArrSecurityStatusNotSatisfied = bArrSuccessfulProcessing;
                } catch (McmLiteInvalidInput e5) {
                    throw new ContactlessLogicException(e5.getMessage());
                }
            } catch (Throwable th2) {
                McmLiteUtils.clearByteArray(bArrCreate);
                McmLiteUtils.clearByteArray(tlv);
                McmLiteUtils.clearByteArray(bArr);
                McmLiteUtils.clearByteArray(bArrCreate2);
                throw th2;
            }
        } else {
            computeCryptographicChecksum.f50816c.getTransactionContext().setResult(TransactionSummary.ABORT_UNKNOWN_CONTEXT);
            bArrSecurityStatusNotSatisfied = ResponseApduFactory.securityStatusNotSatisfied();
        }
        computeCryptographicChecksum.f50823j.onContactlessTransactionCompleted(ContactlessLogImpl.forMagstripe(computeCryptographicChecksum.f50824k, computeCryptographicChecksum.f50822i, computeCryptographicChecksum.f50820g, computeCryptographicChecksum.f50819f, null, null));
        return bArrSecurityStatusNotSatisfied;
    }

    public static char b(byte b10, byte b11) {
        return (char) ((((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 4) << 12) + ((b10 & 15) << 8) + (((b11 & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 4) << 4) + (b11 & 15));
    }

    public static ComputeCryptographicChecksum of(McmLiteCrypto mcmLiteCrypto, ComputeCcCommandApdu computeCcCommandApdu, ContactlessContext contactlessContext) {
        if (computeCcCommandApdu == null || contactlessContext == null) {
            throw new ContactlessLogicException("Invalid data to initialize the ComputeCC");
        }
        return new ComputeCryptographicChecksum(mcmLiteCrypto, computeCcCommandApdu, contactlessContext);
    }

    public byte[] response() {
        ContactlessPaymentData contactlessPaymentData = this.f50822i;
        if (!contactlessPaymentData.isMagstripeDataValid()) {
            throw new ConditionsOfUseNotSatisfied("Magstripe data not found in profile");
        }
        ComputeCcCommandApdu computeCcCommandApdu = this.f50815b;
        if (McmLiteUtils.isTerminalOffline(computeCcCommandApdu.getTerminalType())) {
            throw new ConditionsOfUseNotSatisfied("The Terminal is offline");
        }
        byte[] authorizedAmount = computeCcCommandApdu.getAuthorizedAmount();
        ContactlessTransactionContext contactlessTransactionContext = this.f50824k;
        contactlessTransactionContext.setAmount(authorizedAmount);
        contactlessTransactionContext.setCurrencyCode(computeCcCommandApdu.getTransactionCurrencyCode());
        contactlessTransactionContext.setTrxDate(computeCcCommandApdu.getTransactionDate());
        contactlessTransactionContext.setTrxType(new byte[]{computeCcCommandApdu.getTransactionType()});
        contactlessTransactionContext.setUnpredictableNumber(computeCcCommandApdu.getUnpredictableNumber());
        byte[] ciacDeclineOnPpms = contactlessPaymentData.getCiacDeclineOnPpms();
        boolean zHasValidCredentialsFor = this.f50825l.hasValidCredentialsFor(TransactionCredentialsManager.Scope.CONTACTLESS);
        ContactlessContext contactlessContext = this.f50816c;
        TransactionInformation transactionInformation = this.f50819f;
        return (byte[]) new TransactionOutcomeBuilder(contactlessContext.getWalletAdvice(CardRiskManager.getMasterCardAdvice(RulesBuilder.forMagstripe(computeCcCommandApdu, contactlessContext, transactionInformation, ciacDeclineOnPpms, zHasValidCredentialsFor)), transactionInformation, this.f50820g), this.f50819f, this.f50820g, this.f50825l, contactlessContext.isCdCvmEntered(), contactlessContext.getUmdValidity(), new a(this)).buildResponse();
    }
}
