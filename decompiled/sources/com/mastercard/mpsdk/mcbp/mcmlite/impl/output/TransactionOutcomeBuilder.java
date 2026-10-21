package com.mastercard.mpsdk.mcbp.mcmlite.impl.output;

import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.credentials.McmLiteInvalidSingleUseKey;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalTechnology;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.Purpose;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TransactionOutcomeBuilder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Advice f50896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionInformation f50897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TerminalInformation f50898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TransactionCredentialsManager f50899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TransactionOutcomeBuilderListener<T> f50900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50901f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f50903b;

        static {
            int[] iArr = new int[TerminalTechnology.values().length];
            f50903b = iArr;
            try {
                iArr[TerminalTechnology.CONTACTLESS_EMV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50903b[TerminalTechnology.CONTACTLESS_MAGSTRIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50903b[TerminalTechnology.REMOTE_DSRP_EMV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50903b[TerminalTechnology.REMOTE_DSRP_UCAF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Assessment.values().length];
            f50902a = iArr2;
            try {
                iArr2[Assessment.AGREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50902a[Assessment.ABORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50902a[Assessment.DECLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50902a[Assessment.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public TransactionOutcomeBuilder(Advice advice, TransactionInformation transactionInformation, TerminalInformation terminalInformation, TransactionCredentialsManager transactionCredentialsManager, boolean z10, CdCvmValidatorInformation.UmdValidity umdValidity, TransactionOutcomeBuilderListener<T> transactionOutcomeBuilderListener) {
        this.f50896a = advice;
        this.f50897b = transactionInformation;
        this.f50898c = terminalInformation;
        this.f50899d = transactionCredentialsManager;
        boolean z11 = false;
        if (advice.getAssessment() == Assessment.AGREE && umdValidity != CdCvmValidatorInformation.UmdValidity.NEVER && (umdValidity == CdCvmValidatorInformation.UmdValidity.ALWAYS || (z10 && !McmLiteUtils.isLackOfCdCvmIndicatedIn(advice.getReasons())))) {
            z11 = true;
        }
        this.f50901f = z11;
        if (transactionOutcomeBuilderListener == null) {
            throw new ContactlessLogicException("Invalid action manager listener");
        }
        this.f50900e = transactionOutcomeBuilderListener;
    }

    public final TransactionCredentials a() throws McmLiteInvalidSingleUseKey {
        TransactionCredentialsManager.Scope scope;
        int i10 = a.f50903b[this.f50898c.getTerminalTechnology().ordinal()];
        if (i10 == 1 || i10 == 2) {
            scope = TransactionCredentialsManager.Scope.CONTACTLESS;
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new ContactlessLogicException("Unsupported Terminal Technology");
            }
            scope = TransactionCredentialsManager.Scope.REMOTE_PAYMENT;
        }
        boolean z10 = this.f50901f;
        TransactionCredentialsManager transactionCredentialsManager = this.f50899d;
        TransactionCredentials validUmdAndMdCredentialsFor = z10 ? transactionCredentialsManager.getValidUmdAndMdCredentialsFor(scope) : transactionCredentialsManager.getValidMdCredentialsFor(scope);
        if (validUmdAndMdCredentialsFor != null) {
            return validUmdAndMdCredentialsFor;
        }
        throw new McmLiteInvalidSingleUseKey("Unable to access valid credentials");
    }

    public final T buildResponse() {
        int[] iArr = a.f50902a;
        Advice advice = this.f50896a;
        int i10 = iArr[advice.getAssessment().ordinal()];
        TransactionOutcomeBuilderListener<T> transactionOutcomeBuilderListener = this.f50900e;
        if (i10 == 1) {
            Purpose purpose = this.f50897b.getPurpose();
            try {
                TransactionCredentials transactionCredentialsA = a();
                return purpose == Purpose.AUTHENTICATE ? transactionOutcomeBuilderListener.authenticate(advice.getReasons(), transactionCredentialsA) : transactionOutcomeBuilderListener.approveOnline(advice.getReasons(), transactionCredentialsA);
            } catch (McmLiteInvalidSingleUseKey unused) {
                return transactionOutcomeBuilderListener.decline(advice.getReasons());
            }
        }
        if (i10 != 2) {
            return i10 != 3 ? transactionOutcomeBuilderListener.error(advice.getReasons()) : transactionOutcomeBuilderListener.decline(advice.getReasons());
        }
        List<Reason> reasons = advice.getReasons();
        boolean zContains = reasons.contains(Reason.MISSING_CONSENT);
        boolean zIsLackOfCdCvmIndicatedIn = McmLiteUtils.isLackOfCdCvmIndicatedIn(reasons);
        if (!zContains && !zIsLackOfCdCvmIndicatedIn) {
            transactionOutcomeBuilderListener.decline(advice.getReasons());
        }
        return transactionOutcomeBuilderListener.abort(reasons);
    }
}
