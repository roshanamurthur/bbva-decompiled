package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.SharedPreferencesClearingException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.TransactionCredential;
import com.bbva.tohu.android.product.valkyria.sdk.services.IAmNotService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class IAmNotServiceDefaultImpl implements IAmNotService {
    private CryptoKeyManager cryptoKeyManager;
    private DatabaseManager databaseManager;
    private UserSharedPreferencesManager userPreferencesManager;

    public IAmNotServiceDefaultImpl(DatabaseManager databaseManager, CryptoKeyManager cryptoKeyManager, UserSharedPreferencesManager userSharedPreferencesManager) {
        this.databaseManager = databaseManager;
        this.cryptoKeyManager = cryptoKeyManager;
        this.userPreferencesManager = userSharedPreferencesManager;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.IAmNotService
    public void doIAmNot() throws TohuSdkException {
        try {
            String str = MobilePayment.TAG;
            LogTohu.i(str, "Get all transaction credentials", new Object[0]);
            List<TransactionCredential> allTransactionCredentials = this.databaseManager.getAllTransactionCredentials();
            LogTohu.i(str, "Remove transaction credentials, size:" + allTransactionCredentials.size(), new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (TransactionCredential transactionCredential : allTransactionCredentials) {
                if (transactionCredential != null) {
                    this.cryptoKeyManager.removeEntryInPaymentStorage(transactionCredential.getTransactionCredentialId());
                    String cardUniqueReference = transactionCredential.getBullet().getToken().getCardUniqueReference();
                    if (arrayList.contains(cardUniqueReference)) {
                        continue;
                    } else {
                        this.cryptoKeyManager.removeEntryInSecureStorage(cardUniqueReference);
                        arrayList.add(cardUniqueReference);
                        LogTohu.i(MobilePayment.TAG, "Remove card profile:" + cardUniqueReference, new Object[0]);
                    }
                }
            }
            String str2 = MobilePayment.TAG;
            LogTohu.i(str2, "Removing BBDD", new Object[0]);
            this.databaseManager.deleteAll();
            LogTohu.i(str2, "Removing shared preferences", new Object[0]);
            boolean zDeleteAll = this.userPreferencesManager.deleteAll();
            LogTohu.i(str2, "Removed shared preferences, result:" + zDeleteAll, new Object[0]);
            if (!zDeleteAll) {
                throw new SharedPreferencesClearingException();
            }
            this.cryptoKeyManager.clearInstance();
        } catch (Throwable th2) {
            String str3 = MobilePayment.TAG;
            LogTohu.i(str3, "Removing BBDD", new Object[0]);
            this.databaseManager.deleteAll();
            LogTohu.i(str3, "Removing shared preferences", new Object[0]);
            boolean zDeleteAll2 = this.userPreferencesManager.deleteAll();
            LogTohu.i(str3, "Removed shared preferences, result:" + zDeleteAll2, new Object[0]);
            if (!zDeleteAll2) {
                throw new SharedPreferencesClearingException();
            }
            this.cryptoKeyManager.clearInstance();
            throw th2;
        }
    }
}
