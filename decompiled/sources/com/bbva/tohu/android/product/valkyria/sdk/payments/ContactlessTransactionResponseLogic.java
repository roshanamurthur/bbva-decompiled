package com.bbva.tohu.android.product.valkyria.sdk.payments;

import android.annotation.SuppressLint;
import androidx.camera.core.processing.f;
import com.bbva.tohu.android.core.exceptions.DeviceSecurityDisabledException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.BulletStatus;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.PaymentResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.Util;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class ContactlessTransactionResponseLogic {
    private static final String TAG = "ContactlessTransactionResponseLogic";
    public static final String UNKNOWN_VALUE = "UNKNOWN";
    private BroadcastManager broadcastPayment;
    private BroadcastManager broadcastStatusUpdated;
    private DatabaseManager databaseManager;
    private IntentManager intentManager;
    private SerializerService serializerService;
    private UserSharedPreferencesManager userPreferencesManager;

    public ContactlessTransactionResponseLogic(UserSharedPreferencesManager userSharedPreferencesManager, IntentManager intentManager, DatabaseManager databaseManager, BroadcastManager broadcastManager, BroadcastManager broadcastManager2, SerializerService serializerService) {
        this.userPreferencesManager = userSharedPreferencesManager;
        this.intentManager = intentManager;
        this.databaseManager = databaseManager;
        this.broadcastPayment = broadcastManager;
        this.broadcastStatusUpdated = broadcastManager2;
        this.serializerService = serializerService;
    }

    private void launchReplenish(Token token) {
        LogTohu.d(TAG, "Enter in launchReplenish with token: %s", token);
        this.intentManager.replenish(token.getCardUniqueReference(), false);
    }

    private void logPayment(PaymentResponse paymentResponse, String str) {
        if ("OK".equals(str)) {
            LogTohu.e(TAG, "Log Payment : \n OK (Completed) \n Amount ".concat(paymentResponse.getAmount() != null ? String.valueOf(paymentResponse.getAmount()) : ""), new Object[0]);
        } else if ("TOHU_PAYMENT_ABORT".equals(str)) {
            LogTohu.e(TAG, "Log Payment : \n KO (Aborted) \n Amount ".concat(paymentResponse.getAmount() != null ? String.valueOf(paymentResponse.getAmount()) : ""), new Object[0]);
        } else {
            LogTohu.e(TAG, f.d("Log Payment : \n UNKNOWN KO", str), new Object[0]);
        }
    }

    private String serializeAmountInfo(AmountInfo amountInfo) {
        if (amountInfo.getAmount() == null) {
            amountInfo.setAmount("UNKNOWN");
        }
        if (amountInfo.getCurrencyCode() == null) {
            amountInfo.setCurrencyCode("UNKNOWN");
        }
        return this.serializerService.serialize(amountInfo);
    }

    @SuppressLint({"DefaultLocale"})
    private void updateBulletToUsed(PaymentResponse paymentResponse, String str) {
        Short shValueOf = Short.valueOf(ByteBuffer.wrap(paymentResponse.getAtc()).getShort());
        try {
            Bullet bulletByCardUniqueReferenceAndAtc = this.databaseManager.getBulletByCardUniqueReferenceAndAtc(str, shValueOf.toString());
            bulletByCardUniqueReferenceAndAtc.setStatus(BulletStatus.USED);
            bulletByCardUniqueReferenceAndAtc.setTransactionType(TransactionType.TRANSACTION_TYPE_CONTACTLESS);
            bulletByCardUniqueReferenceAndAtc.setUnpredictableNumber(Util.byteArrayToHex(paymentResponse.getCardUnpredicableNumber()));
            this.databaseManager.updateBullet(bulletByCardUniqueReferenceAndAtc);
            LogTohu.d(TAG, "Bullet used with cardUniqueReference: %s and atc: %d", str, shValueOf);
        } catch (NotFoundEntityException e5) {
            LogTohu.e(TAG, String.format("Bullet not found with cardUniqueReference: %s and atc: %d", str, shValueOf), e5);
        }
    }

    private void writePaymentInfoOnLog(PaymentResponse paymentResponse) {
        LogTohu.d(TAG, "Transaction payment response :\nOperation type : %s\nTerminal type : %s\nOperation date : %s\nCardUniqueReference : %s\nAmount : %f \nCurrency : %s ", paymentResponse.getOperationType(), paymentResponse.getTerminalType(), paymentResponse.getOperationDate(), paymentResponse.getCardUniqueReference(), paymentResponse.getAmount(), paymentResponse.getCurrency());
    }

    public void notifyCdcvmDeviceSecurityDisabled(AmountInfo amountInfo) {
        this.broadcastPayment.sendBroadcast(new DeviceSecurityDisabledException(), serializeAmountInfo(amountInfo));
    }

    public void notifyCdcvmDeviceUnlockRequired(AmountInfo amountInfo) {
        this.broadcastPayment.sendBroadcast("TOHU_UNLOCK_DEVICE_REQUIRED", serializeAmountInfo(amountInfo));
    }

    public void notifyCdcvmUserAuthenticationRequired(AmountInfo amountInfo) {
        this.broadcastPayment.sendBroadcast("TOHU_USER_AUTHENTICATION_REQUIRED", serializeAmountInfo(amountInfo));
    }

    public void processResponse(PaymentResponse paymentResponse, String str) {
        String favouriteCard = this.userPreferencesManager.getFavouriteCard();
        paymentResponse.setCardUniqueReference(favouriteCard);
        writePaymentInfoOnLog(paymentResponse);
        updateBulletToUsed(paymentResponse, favouriteCard);
        try {
            Token tokenByCardUniqueReference = this.databaseManager.getTokenByCardUniqueReference(favouriteCard);
            launchReplenish(tokenByCardUniqueReference);
            LogTohu.d(TAG, "Send Broadcast: %s  transactionType: %s", paymentResponse, str);
            this.broadcastPayment.sendBroadcast(str, paymentResponse);
            logPayment(paymentResponse, str);
            if (this.databaseManager.existUsableBulletsByCardUniqueReference(tokenByCardUniqueReference.getCardUniqueReference())) {
                return;
            }
            this.broadcastStatusUpdated.sendBroadcast(PaymentStatus.TEMP_DISABLED, favouriteCard);
        } catch (NotFoundEntityException e5) {
            LogTohu.e(TAG, "Error not found exception", new Object[0]);
            this.broadcastPayment.sendBroadcast(e5.getBroadcastCode(), paymentResponse);
        }
    }
}
