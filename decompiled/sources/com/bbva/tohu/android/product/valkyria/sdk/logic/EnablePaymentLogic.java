package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.content.Context;
import android.os.ResultReceiver;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.DetectedRootedDeviceException;
import com.bbva.tohu.android.core.exceptions.DeviceNoElegibleException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.builders.CallbackDataBuilder;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.DigitizeCard;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class EnablePaymentLogic {
    private static final String TAG = "EnablePaymentLogic";
    private final BroadcastManager broadcastManager;
    private final DatabaseManager databaseManager;
    private final DigitizeLogic digitizeLogic;
    private final IntentManager intentManager;
    private final NotifyProvisionResultLogic notifyProvisionResultLogic;
    private final ReplenishControllerLogic replenishControllerLogic;
    private final ReplenishLogic replenishLogic;

    public class ListsOfCards {
        public List<DigitizeCard> inProgress = new ArrayList();
        public List<Card> toDigitize = new ArrayList();

        public ListsOfCards() {
        }
    }

    public EnablePaymentLogic(DigitizeLogic digitizeLogic, ReplenishLogic replenishLogic, ReplenishControllerLogic replenishControllerLogic, NotifyProvisionResultLogic notifyProvisionResultLogic, DatabaseManager databaseManager, BroadcastManager broadcastManager, IntentManager intentManager) {
        this.notifyProvisionResultLogic = notifyProvisionResultLogic;
        this.databaseManager = databaseManager;
        this.broadcastManager = broadcastManager;
        this.digitizeLogic = digitizeLogic;
        this.replenishLogic = replenishLogic;
        this.replenishControllerLogic = replenishControllerLogic;
        this.intentManager = intentManager;
    }

    private void callbackErrorForEachCard(List<Card> list, TohuSdkException tohuSdkException, CallbackManager callbackManager) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            callbackManager.sendTohuException(tohuSdkException, CallbackDataBuilder.aMap().withCardUniqueRef(list.get(i10).getCardUniqueReference()).build());
        }
    }

    private void checkBulletsAndReplenishIfNeeded(Token token, Context context) {
        if (!this.replenishLogic.needReplenish(this.databaseManager.getUsableBulletsByCardUniqueReference(token.getCardUniqueReference()))) {
            this.broadcastManager.sendBroadcast("TOHU_STATUS_UPDATED", new UpdateCardResponse(token.getCardUniqueReference(), PaymentStatus.ENABLED));
        } else {
            LogTohu.d(TAG, "Replenish will be called, bullets under threshold", new Object[0]);
            doReplenish(token.getCardUniqueReference(), true, context);
        }
    }

    private List<DigitizeCard> digitizeCards(List<Card> list, String str, CallbackManager callbackManager) {
        if (!list.isEmpty()) {
            try {
                return this.digitizeLogic.doDigitize(list, str);
            } catch (CryptoInitException e5) {
                e = e5;
                callbackManager.sendTohuException(e, null);
                return new ArrayList();
            } catch (DetectedRootedDeviceException unused) {
                sendNotEligibleCallbackResponse(callbackManager);
                ManagerFactory.getBroadCastSystemNotification().sendBroadcast("TOHU_DETECTED_ROOTED_DEVICE");
            } catch (DeviceNoElegibleException unused2) {
                sendNotEligibleCallbackResponse(callbackManager);
            } catch (LoginNeededException e7) {
                e = e7;
                callbackManager.sendTohuException(e, null);
                return new ArrayList();
            } catch (NetworkNotPresentException e10) {
                callbackManager.sendTohuException(e10, null);
            } catch (TohuSdkException e11) {
                callbackErrorForEachCard(list, e11, callbackManager);
            }
        }
        return new ArrayList();
    }

    private void doReplenish(String str, boolean z10, Context context) {
        this.replenishControllerLogic.replenish(str, z10, context);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    private ListsOfCards filterCardsToDigitize(List<Card> list, CallbackManager callbackManager, Context context) throws CryptoInitException {
        byte b10;
        ListsOfCards listsOfCards = new ListsOfCards();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Card card = list.get(i10);
            try {
                Token tokenByCardUniqueReference = this.databaseManager.getTokenByCardUniqueReference(card.getCardUniqueReference());
                try {
                    String state = tokenByCardUniqueReference.getState();
                    int iHashCode = state.hashCode();
                    if (iHashCode != 807292011) {
                        if (iHashCode == 1925346054 && state.equals("ACTIVE")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (state.equals("INACTIVE")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        notifyProvisionResult(tokenByCardUniqueReference, context);
                    } else if (b10 != 1) {
                        String.format("Token state %s unexpected", tokenByCardUniqueReference.getState());
                    } else {
                        checkBulletsAndReplenishIfNeeded(tokenByCardUniqueReference, context);
                    }
                    listsOfCards.inProgress.add(new DigitizeCard(card.getCardUniqueReference(), "IN_PROGRESS", null));
                } catch (CryptoInitException e5) {
                    e5.toString();
                    throw e5;
                } catch (TohuSdkException e7) {
                    callbackManager.sendTohuException(e7, CallbackDataBuilder.aMap().withCardUniqueRef(card.getCardUniqueReference()).build());
                }
            } catch (NotFoundEntityException unused) {
                String.format("Add card %s to digitize.", card.getCardUniqueReference());
                listsOfCards.toDigitize.add(card);
            }
        }
        return listsOfCards;
    }

    private void notifyProvisionResult(Token token, Context context) throws TohuBackendException, NetworkNotPresentException, NotFoundEntityException, CryptoInitException {
        this.notifyProvisionResultLogic.doNotifyProvisionResult(this.notifyProvisionResultLogic.buildSuccessProvisionResult(token.getCardUniqueReference()), token, context);
    }

    private void processDigitizeResult(CallbackManager callbackManager, List<DigitizeCard> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            DigitizeCard digitizeCard = list.get(i10);
            if (digitizeCard.getStatus().equals("NOT_ELIGIBLE")) {
                callbackManager.result(CallbackDataBuilder.aMap().withCardUniqueRef(digitizeCard.getCardUniqueReference()).withResult(TohuCallback.CARD_NOT_ELIGIBLE_RESULT).build());
            } else if (digitizeCard.getStatus().equals("IN_PROGRESS")) {
                this.intentManager.getTokenWithDelay(digitizeCard.getCardUniqueReference());
                callbackManager.result(CallbackDataBuilder.aMap().withCardUniqueRef(digitizeCard.getCardUniqueReference()).withResult(TohuCallback.IN_PROGRESS_RESULT).build());
            }
        }
    }

    private void sendNotEligibleCallbackResponse(CallbackManager callbackManager) {
        callbackManager.sendWithResult(TohuCallback.DEVICE_NOT_ELIGIBLE_RESULT);
    }

    public void doEnablePayment(List<Card> list, String str, ResultReceiver resultReceiver, Context context) throws CryptoInitException {
        CallbackManager callbackManager = ManagerFactory.getCallbackManager(resultReceiver);
        ListsOfCards listsOfCardsFilterCardsToDigitize = filterCardsToDigitize(list, callbackManager, context);
        List<DigitizeCard> listDigitizeCards = digitizeCards(listsOfCardsFilterCardsToDigitize.toDigitize, str, callbackManager);
        listDigitizeCards.addAll(listsOfCardsFilterCardsToDigitize.inProgress);
        processDigitizeResult(callbackManager, listDigitizeCards);
    }
}
