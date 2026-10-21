package com.mastercard.mpsdk.mcbp.mcmlite.credentials;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionRange;

/* JADX INFO: loaded from: classes10.dex */
public interface TransactionCredentialsManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Scope {
        private static final /* synthetic */ Scope[] $VALUES;
        public static final Scope CONTACTLESS;
        public static final Scope REMOTE_PAYMENT;

        static {
            Scope scope = new Scope(TransactionType.TRANSACTION_TYPE_CONTACTLESS, 0);
            CONTACTLESS = scope;
            Scope scope2 = new Scope("REMOTE_PAYMENT", 1);
            REMOTE_PAYMENT = scope2;
            $VALUES = new Scope[]{scope, scope2};
        }

        public Scope() {
            throw null;
        }

        public static Scope valueOf(String str) {
            return (Scope) Enum.valueOf(Scope.class, str);
        }

        public static Scope[] values() {
            return (Scope[]) $VALUES.clone();
        }
    }

    boolean areUmdCredentialsSubjectToCvmFor(TransactionRange transactionRange, Scope scope);

    byte[] getAtcForCancelPayment(Scope scope);

    TransactionCredentials getRandomCredentials();

    TransactionCredentials getValidMdCredentialsFor(Scope scope);

    TransactionCredentials getValidUmdAndMdCredentialsFor(Scope scope);

    boolean hasValidCredentialsFor(Scope scope);
}
