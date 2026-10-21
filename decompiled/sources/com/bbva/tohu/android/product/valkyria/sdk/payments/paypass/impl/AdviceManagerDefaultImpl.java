package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.AdviceManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionRange;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class AdviceManagerDefaultImpl implements AdviceManager {
    private static final String TAG = "AdviceManagerDefaultImpl";
    private CdCvmValidatorInformation cdCvmValidator;
    private UserSharedPreferencesManager preferencesManager;
    private boolean supportsCdcvm;

    public AdviceManagerDefaultImpl(boolean z10, CdCvmValidatorInformation cdCvmValidatorInformation, UserSharedPreferencesManager userSharedPreferencesManager) {
        this.supportsCdcvm = z10;
        this.cdCvmValidator = cdCvmValidatorInformation;
        this.preferencesManager = userSharedPreferencesManager;
    }

    private Advice getAdviceForLvt() {
        Advice advice;
        String str = TAG;
        LogTohu.d(str, "supportsCdcvm: " + this.supportsCdcvm, new Object[0]);
        LogTohu.d(str, "isCdcvmForLvt: " + this.preferencesManager.isCdcvmForLvt(), new Object[0]);
        if (this.supportsCdcvm && this.preferencesManager.isCdcvmForLvt()) {
            LogTohu.d(str, "isAuthenticated: " + this.cdCvmValidator.isAuthenticated(), new Object[0]);
            if (this.cdCvmValidator.isAuthenticated()) {
                advice = new Advice(Assessment.AGREE, new ArrayList());
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Reason.INSUFFICIENT_CD_CVM);
                advice = new Advice(Assessment.ABORT, arrayList);
            }
        } else {
            advice = new Advice(Assessment.AGREE, new ArrayList());
        }
        advice.toString();
        return advice;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.AdviceManager
    public Advice adviseTransactionOutcome(Advice advice, TransactionInformation transactionInformation, TerminalInformation terminalInformation) {
        if (TransactionRange.LOW_VALUE.equals(transactionInformation.getTransactionRange())) {
            return getAdviceForLvt();
        }
        Objects.toString(advice);
        return advice;
    }
}
