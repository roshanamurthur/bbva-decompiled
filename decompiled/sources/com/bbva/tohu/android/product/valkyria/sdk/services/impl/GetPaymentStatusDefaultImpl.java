package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.services.GetPaymentStatusService;

/* JADX INFO: loaded from: classes6.dex */
public class GetPaymentStatusDefaultImpl implements GetPaymentStatusService {
    private static final String TAG = "com.bbva.tohu.android.product.valkyria.sdk.services.impl.GetPaymentStatusDefaultImpl";
    private DatabaseManager databaseManager;
    private Token token;

    public GetPaymentStatusDefaultImpl(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    private Boolean tokenExists(String str) {
        try {
            this.token = this.databaseManager.getTokenByCardUniqueReference(str);
            return Boolean.TRUE;
        } catch (NotFoundEntityException unused) {
            LogTohu.d(TAG, "The token was not found for cardUniqueReference: %s", str);
            return Boolean.FALSE;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.GetPaymentStatusService
    public String getPaymentStatus(String str) {
        if (!tokenExists(str).booleanValue()) {
            return PaymentStatus.NOT_ENABLED;
        }
        if (this.token.getState().equals("SUSPENDED")) {
            return "SUSPENDED";
        }
        if (this.token.getState().equals("ACTIVE")) {
            return this.databaseManager.existUsableBulletsByCardUniqueReference(this.token.getCardUniqueReference()) ? PaymentStatus.ENABLED : PaymentStatus.TEMP_DISABLED;
        }
        return PaymentStatus.NOT_ENABLED;
    }
}
