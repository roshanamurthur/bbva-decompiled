package com.bbva.notifications.extensions;

import ad.d;
import androidx.camera.core.processing.f;
import com.bbva.notifications.constants.NotificationAction;
import com.bbva.notifications.constants.NotificationSubtype;
import com.bbva.notifications.constants.NotificationType;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.notifications.model.Message;
import com.bbva.notifications.model.Money;
import com.bbva.notifications.model.NotificationDataLocal;
import com.bbva.notifications.model.SubType;
import com.bbva.notifications.model.SuspiciousNotificationData;
import com.bbva.notifications.model.TypeNotification;
import com.bbva.notifications.model.VariablesMessageData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NotificationDataLocalExtension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\u001a\u0016\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/notifications/model/NotificationDataLocal;", "", "", "createData", "", "getHaveDeepLink", "(Lcom/bbva/notifications/model/NotificationDataLocal;)Z", "haveDeepLink", "isConversationNotificationType", "", "getActionsList", "(Lcom/bbva/notifications/model/NotificationDataLocal;)Ljava/util/List;", "actionsList", "getActions", "actions", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationDataLocalExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDataLocalExtension.kt\ncom/bbva/notifications/extensions/NotificationDataLocalExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
public final class NotificationDataLocalExtensionKt {
    @NotNull
    public static final Map<String, String> createData(@NotNull NotificationDataLocal notificationDataLocal) {
        String title;
        String preview;
        TypeNotification typeNotification;
        SubType subType;
        String id;
        TypeNotification typeNotification2;
        SubType subType2;
        String id2;
        String messageBody;
        String eventId;
        String currency;
        String amountType;
        String amount;
        String amount2;
        Intrinsics.checkNotNullParameter(notificationDataLocal, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String amount3 = notificationDataLocal.getAmount();
        if (amount3 == null) {
            amount3 = notificationDataLocal.getPaymentAmount();
        }
        VariablesMessageData variables = notificationDataLocal.getVariables();
        if (variables != null) {
            SuspiciousNotificationData suspicionNotification = variables.getSuspicionNotification();
            if (suspicionNotification == null || (amount = suspicionNotification.getPaymentAmount()) == null) {
                SuspiciousNotificationData suspicionNotification2 = variables.getSuspicionNotification();
                amount = suspicionNotification2 != null ? suspicionNotification2.getAmount() : null;
            }
            if (amount != null) {
                amount3 = amount;
            }
            Money money = variables.getMoney();
            if ((money == null || (amount2 = money.getAmount()) == null) && (amount2 = variables.getAmount()) == null) {
                amount2 = variables.getPaymentAmount();
            }
            if (amount2 != null) {
                amount3 = amount2;
            }
        }
        String strReplace$default = amount3;
        if (strReplace$default != null) {
            strReplace$default = l.replace$default(strReplace$default, Constant.MXN_SYMBOL, "", false, 4, (Object) null);
        }
        if (strReplace$default != null) {
            linkedHashMap.put(PushConstants.AMOUNT, strReplace$default);
            VariablesMessageData variables2 = notificationDataLocal.getVariables();
            if (variables2 != null) {
                Money money2 = variables2.getMoney();
                if (money2 == null || (currency = money2.getCurrency()) == null) {
                    currency = "MXN";
                }
                linkedHashMap.put("currency", currency);
                VariablesMessageData variables3 = notificationDataLocal.getVariables();
                if (variables3 != null && (amountType = variables3.getAmountType()) != null && Intrinsics.areEqual(amountType, PushConstants.GE_POINTS)) {
                    linkedHashMap.put("currency", "");
                }
            }
        }
        VariablesMessageData variables4 = notificationDataLocal.getVariables();
        if (variables4 != null && (eventId = variables4.getEventId()) != null && (Intrinsics.areEqual(eventId, PushConstants.PAYMENT_POINTS_EVENT) || Intrinsics.areEqual(eventId, PushConstants.PARTIAL_PAYMENT_POINTS_EVENT))) {
            notificationDataLocal.setType(NotificationType.POINTS.getValue());
        }
        VariablesMessageData variables5 = notificationDataLocal.getVariables();
        if (variables5 != null) {
            String sendDate = variables5.getSendDate();
            if (sendDate != null) {
                linkedHashMap.put("date", sendDate);
            }
            Message message = variables5.getMessage();
            if (message != null && (messageBody = message.getMessageBody()) != null) {
                linkedHashMap.put(PushConstants.GE_MESSAGE_BODY, messageBody);
            }
        }
        VariablesMessageData variables6 = notificationDataLocal.getVariables();
        if (variables6 != null) {
            Message message2 = variables6.getMessage();
            title = message2 != null ? message2.getTitle() : null;
            if (title == null) {
                title = "";
            }
        } else {
            title = null;
        }
        String typeNotification3 = notificationDataLocal.getTypeNotification();
        if (typeNotification3 != null && Intrinsics.areEqual(typeNotification3, NotificationType.CONVERSATION.getValue())) {
            String title2 = notificationDataLocal.getTitle();
            title = title2 != null ? title2 : "";
        }
        String type = notificationDataLocal.getType();
        NotificationType notificationType = NotificationType.DEPOSIT;
        boolean zAreEqual = Intrinsics.areEqual(type, notificationType.getValue());
        String title3 = PushConstants.GE_CHARGE;
        if (zAreEqual || Intrinsics.areEqual(type, NotificationType.PAY_SHEET.getValue())) {
            title = PushConstants.GE_DEPOSIT;
        } else if (Intrinsics.areEqual(type, NotificationType.ATM.getValue())) {
            title = PushConstants.GE_ATM;
        } else if (Intrinsics.areEqual(type, NotificationType.CHARGES.getValue()) || Intrinsics.areEqual(type, NotificationType.BUY_PROMOTION.getValue()) || Intrinsics.areEqual(type, NotificationType.PURCHASE.getValue())) {
            title = PushConstants.GE_CHARGE;
        }
        if (title != null) {
            linkedHashMap.put(PushConstants.NOTIFICATION_TYPE, title);
        }
        VariablesMessageData variables7 = notificationDataLocal.getVariables();
        String str = PushConstants.GE_MOVEMENT;
        String str2 = (variables7 == null || (typeNotification2 = variables7.getTypeNotification()) == null || (subType2 = typeNotification2.getSubType()) == null || (id2 = subType2.getId()) == null || !Intrinsics.areEqual(id2, NotificationSubtype.CASH_BACK.getValue())) ? PushConstants.GE_ALERT : PushConstants.GE_MOVEMENT;
        String type2 = notificationDataLocal.getType();
        if ((!Intrinsics.areEqual(type2, notificationType.getValue()) && !Intrinsics.areEqual(type2, NotificationType.PAY_SHEET.getValue()) && !Intrinsics.areEqual(type2, NotificationType.ATM.getValue()) && !Intrinsics.areEqual(type2, NotificationType.CHARGES.getValue()) && !Intrinsics.areEqual(type2, NotificationType.BUY_PROMOTION.getValue()) && !Intrinsics.areEqual(type2, NotificationType.PROMOTIONS.getValue()) && !Intrinsics.areEqual(type2, NotificationType.PURCHASE.getValue()) && !Intrinsics.areEqual(type2, NotificationType.POINTS.getValue())) || l.equals$default(notificationDataLocal.getMessage(), NotificationType.PROMOTION_PURCHASE.getValue(), false, 2, null)) {
            str = str2;
        }
        linkedHashMap.put(PushConstants.DETAIL_NOTIFICATION_TYPE, str);
        VariablesMessageData variables8 = notificationDataLocal.getVariables();
        String str3 = (variables8 == null || (typeNotification = variables8.getTypeNotification()) == null || (subType = typeNotification.getSubType()) == null || (id = subType.getId()) == null || !Intrinsics.areEqual(id, NotificationSubtype.CASH_BACK.getValue())) ? null : PushConstants.GE_BBVA_MOVEMENT;
        String type3 = notificationDataLocal.getType();
        if (Intrinsics.areEqual(type3, notificationType.getValue())) {
            title3 = PushConstants.GE_DEPOSIT;
        } else if (!Intrinsics.areEqual(type3, NotificationType.CHARGES.getValue())) {
            if (Intrinsics.areEqual(type3, NotificationType.PAY_SHEET.getValue())) {
                title3 = notificationDataLocal.getOperation();
            } else if (Intrinsics.areEqual(type3, NotificationType.ATM.getValue())) {
                title3 = PushConstants.GE_ATM;
            } else if (Intrinsics.areEqual(type3, NotificationType.BUY_PROMOTION.getValue())) {
                title3 = PushConstants.GE_BUY_PROMOTION;
            } else if (Intrinsics.areEqual(type3, NotificationType.ALERTS.getValue())) {
                title3 = PushConstants.GE_ALERT;
            } else if (Intrinsics.areEqual(type3, NotificationType.PURCHASE.getValue())) {
                title3 = f.d("Compra en ", notificationDataLocal.getStore());
            } else if (Intrinsics.areEqual(type3, NotificationType.PROMOTIONS.getValue())) {
                title3 = PushConstants.GE_BBVA_PROMOTION;
            } else if (Intrinsics.areEqual(type3, NotificationType.ONE_CLICK.getValue())) {
                title3 = notificationDataLocal.getSubType();
            } else {
                title3 = Intrinsics.areEqual(type3, NotificationType.POINTS.getValue()) ? notificationDataLocal.getTitle() : str3;
            }
        }
        if (title3 != null) {
            linkedHashMap.put(PushConstants.MOVEMENT_TYPE, title3);
        }
        String type4 = notificationDataLocal.getType();
        if (Intrinsics.areEqual(type4, NotificationType.PAY_SHEET.getValue()) || Intrinsics.areEqual(type4, NotificationType.ATM.getValue())) {
            if (Intrinsics.areEqual(notificationDataLocal.getMessage(), NotificationType.PROMOTION_PURCHASE.getValue())) {
                preview = notificationDataLocal.getPreview();
            } else {
                preview = notificationDataLocal.getMessage() + " " + notificationDataLocal.getProductType() + " " + notificationDataLocal.getProductNumber();
            }
        } else if (Intrinsics.areEqual(type4, NotificationType.PURCHASE.getValue())) {
            String operation = notificationDataLocal.getOperation();
            String store = notificationDataLocal.getStore();
            String productType = notificationDataLocal.getProductType();
            String productNumber = notificationDataLocal.getProductNumber();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(operation);
            sb2.append(" ");
            sb2.append(store);
            sb2.append(" ");
            sb2.append(productType);
            preview = d.f(sb2, " ", productNumber);
        } else if (Intrinsics.areEqual(type4, notificationType.getValue()) || Intrinsics.areEqual(type4, NotificationType.CHARGES.getValue()) || Intrinsics.areEqual(type4, NotificationType.BUY_PROMOTION.getValue())) {
            preview = notificationDataLocal.getPreview();
        } else {
            preview = (Intrinsics.areEqual(type4, NotificationType.PROMOTIONS.getValue()) || Intrinsics.areEqual(type4, NotificationType.POINTS.getValue()) || Intrinsics.areEqual(type4, NotificationType.ONE_CLICK.getValue())) ? notificationDataLocal.getMessage() : null;
        }
        if (preview != null) {
            String type5 = notificationDataLocal.getType();
            if (!Intrinsics.areEqual(type5, NotificationType.CHARGES.getValue()) && !Intrinsics.areEqual(type5, NotificationType.BUY_PROMOTION.getValue())) {
                linkedHashMap.put("description", preview);
            } else if (Intrinsics.areEqual(notificationDataLocal.getType(), NotificationType.BUY_PROMOTION.getValue()) || l.equals$default(notificationDataLocal.getMessage(), NotificationType.PROMOTION_PURCHASE.getValue(), false, 2, null)) {
                linkedHashMap.put(PushConstants.GE_MESSAGE_BODY, preview);
            } else {
                linkedHashMap.put("description", preview);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<String> getActions(@NotNull NotificationDataLocal notificationDataLocal) {
        TypeNotification typeNotification;
        TypeNotification typeNotification2;
        TypeNotification typeNotification3;
        SubType subType;
        String id;
        Intrinsics.checkNotNullParameter(notificationDataLocal, "<this>");
        List<String> arrayList = new ArrayList<>();
        VariablesMessageData variables = notificationDataLocal.getVariables();
        if (variables != null && (typeNotification3 = variables.getTypeNotification()) != null && (subType = typeNotification3.getSubType()) != null && (id = subType.getId()) != null) {
            arrayList = CollectionsKt__CollectionsKt.mutableListOf(id);
        }
        VariablesMessageData variables2 = notificationDataLocal.getVariables();
        String id2 = null;
        SubType subType2 = (variables2 == null || (typeNotification2 = variables2.getTypeNotification()) == null) ? null : typeNotification2.getSubType();
        if (Intrinsics.areEqual(subType2 != null ? subType2.getId() : null, NotificationSubtype.REMOTE_BANKER.getValue())) {
            arrayList = CollectionsKt__CollectionsKt.mutableListOf(NotificationAction.REMOTE_BANKER.getValue());
        }
        String typeNotification4 = notificationDataLocal.getTypeNotification();
        if (typeNotification4 != null && Intrinsics.areEqual(NotificationType.CLAIMS.getValue(), typeNotification4)) {
            arrayList = CollectionsKt__CollectionsKt.mutableListOf(typeNotification4);
        }
        if (ArraysKt___ArraysKt.contains(NotificationType.INSTANCE.getValues(), notificationDataLocal.getTypeNotification()) || Intrinsics.areEqual(notificationDataLocal.getType(), NotificationType.DEPOSIT.getValue())) {
            return arrayList;
        }
        VariablesMessageData variables3 = notificationDataLocal.getVariables();
        if (variables3 != null && (typeNotification = variables3.getTypeNotification()) != null) {
            id2 = typeNotification.getId();
        }
        return !Intrinsics.areEqual(id2, NotificationSubtype.PROMOTION.getValue()) ? CollectionsKt__CollectionsKt.mutableListOf(NotificationAction.CALL_BBVA.getValue()) : arrayList;
    }

    @NotNull
    public static final List<String> getActionsList(@NotNull NotificationDataLocal notificationDataLocal) {
        Intrinsics.checkNotNullParameter(notificationDataLocal, "<this>");
        return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{notificationDataLocal.getAction1(), notificationDataLocal.getAction2(), notificationDataLocal.getAction3(), notificationDataLocal.getAction4(), notificationDataLocal.getAction5(), notificationDataLocal.getAction6()});
    }

    public static final boolean getHaveDeepLink(@NotNull NotificationDataLocal notificationDataLocal) {
        Intrinsics.checkNotNullParameter(notificationDataLocal, "<this>");
        return notificationDataLocal.getDeeplink() != null;
    }

    public static final boolean isConversationNotificationType(@NotNull NotificationDataLocal notificationDataLocal) {
        Intrinsics.checkNotNullParameter(notificationDataLocal, "<this>");
        return Intrinsics.areEqual(notificationDataLocal.getTypeNotification(), NotificationType.CONVERSATION.getValue());
    }
}
