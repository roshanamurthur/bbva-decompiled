package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import androidx.annotation.NonNull;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionRange;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionCredentialsManagerVintegrisImpl implements TransactionCredentialsManager {
    private SingleKey singleKey;

    /* JADX INFO: renamed from: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.TransactionCredentialsManagerVintegrisImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$mastercard$mpsdk$mcbp$mcmlite$credentials$TransactionCredentialsManager$Scope;

        static {
            int[] iArr = new int[TransactionCredentialsManager.Scope.values().length];
            $SwitchMap$com$mastercard$mpsdk$mcbp$mcmlite$credentials$TransactionCredentialsManager$Scope = iArr;
            try {
                iArr[TransactionCredentialsManager.Scope.CONTACTLESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mastercard$mpsdk$mcbp$mcmlite$credentials$TransactionCredentialsManager$Scope[TransactionCredentialsManager.Scope.REMOTE_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TransactionCredentialsManagerVintegrisImpl(SingleKey singleKey) {
        this.singleKey = singleKey;
    }

    @NonNull
    private TransactionCredentials createTransactionCredentials(TransactionCredentialsManager.Scope scope) {
        byte[] sessionKeyRemotePaymentUmd;
        byte[] sessionKeyRemotePaymentMd;
        if (scope == TransactionCredentialsManager.Scope.CONTACTLESS) {
            sessionKeyRemotePaymentUmd = this.singleKey.getSessionKeyContactlessUmd();
            sessionKeyRemotePaymentMd = this.singleKey.getSessionKeyContactlessMd();
        } else {
            sessionKeyRemotePaymentUmd = this.singleKey.getSessionKeyRemotePaymentUmd();
            sessionKeyRemotePaymentMd = this.singleKey.getSessionKeyRemotePaymentMd();
        }
        return new TransactionCredentialsDefaultImpl(sessionKeyRemotePaymentMd, sessionKeyRemotePaymentUmd, this.singleKey.getIdn(), this.singleKey.getAtc());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager
    public boolean areUmdCredentialsSubjectToCvmFor(TransactionRange transactionRange, TransactionCredentialsManager.Scope scope) {
        return false;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager
    public byte[] getAtcForCancelPayment(TransactionCredentialsManager.Scope scope) {
        return this.singleKey.getAtc();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager
    public TransactionCredentials getRandomCredentials() {
        return new TransactionCredentialsDefaultImpl("MD_RANDOM_CREDENTIAL".getBytes(), "UMD_RANDOM_CREDENTIAL".getBytes(), new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0});
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager
    public TransactionCredentials getValidMdCredentialsFor(TransactionCredentialsManager.Scope scope) {
        return createTransactionCredentials(scope);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager
    public TransactionCredentials getValidUmdAndMdCredentialsFor(TransactionCredentialsManager.Scope scope) {
        return createTransactionCredentials(scope);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager
    public boolean hasValidCredentialsFor(TransactionCredentialsManager.Scope scope) {
        int i10 = AnonymousClass1.$SwitchMap$com$mastercard$mpsdk$mcbp$mcmlite$credentials$TransactionCredentialsManager$Scope[scope.ordinal()];
        return i10 == 1 || i10 == 2;
    }
}
