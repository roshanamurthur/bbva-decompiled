package com.bbva.glomohybrid.mobilepayment.lib.handler;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import bk.p;
import bk.q;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.mobilepayment.commons.model.PaymentInfoType;
import com.bbva.glomohybrid.mobilepayment.lib.R;
import com.bbva.glomohybrid.mobilepayment.lib.model.ActionResponse;
import com.bbva.glomohybrid.mobilepayment.lib.model.PaymentNotificationContent;
import com.bbva.glomohybrid.mobilepayment.lib.model.TohuData;
import com.bbva.notifications.model.LocalNotificationChannel;
import com.bbva.notifications.model.LocalNotificationData;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.BroadcastActions;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentsNotificationHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/handler/PaymentsNotificationHandler;", "", "Landroid/content/Intent;", "intent", "Lcom/bbva/glomohybrid/mobilepayment/lib/model/PaymentNotificationContent;", "buildNotificationContentFromIntent", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class PaymentsNotificationHandler {
    public static final int CHARACTERS_TO_DROP = 10;

    @NotNull
    public static final String MOBILE_PAYMENT = "mobile_payment";

    @NotNull
    public static final String OPERATION = "operation";

    @NotNull
    public static final String OPERATIVE = "operative";

    @NotNull
    public static final String OPERATIVE_TYPE = "operativeType";

    @NotNull
    public static final String PRODUCT_ID = "productId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f33797a;

    public PaymentsNotificationHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33797a = context;
    }

    public final PaymentNotificationContent a(@StringRes int i10, @StringRes int i11, Pair<String, DeepLinkModel> pair, String str) {
        if (i10 == 0 && i11 == 0) {
            return null;
        }
        int i12 = R.string.tohu_channel_id;
        Context context = this.f33797a;
        String string = context.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        LocalNotificationChannel localNotificationChannel = new LocalNotificationChannel(string, R.string.tohu_channel_name, R.string.tohu_channel_descriptions, 0, 8, null);
        String string2 = context.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new PaymentNotificationContent(new LocalNotificationData(localNotificationChannel, string2, string3, 0, 8, null), pair, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:65:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x0240  */
    @Nullable
    public final PaymentNotificationContent buildNotificationContentFromIntent(@Nullable Intent intent) {
        Parcelable parcelableExtra;
        ActionResponse actionResponse;
        Pair<String, DeepLinkModel> pair;
        int i10;
        String cardUniqueReference;
        Pair<String, DeepLinkModel> pair2;
        int i11;
        String type;
        int i12;
        Pair<String, DeepLinkModel> pair3;
        int i13;
        Pair<String, DeepLinkModel> pair4 = null;
        if (intent == null || (parcelableExtra = intent.getParcelableExtra(BroadcastActions.TOHU_ACTION_RESPONSE)) == null) {
            return null;
        }
        String json = new Gson().toJson(parcelableExtra);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        try {
            Object objFromJson = new Gson().fromJson(json, (Class<Object>) ActionResponse.class);
            Intrinsics.checkNotNull(objFromJson);
            actionResponse = (ActionResponse) objFromJson;
        } catch (Exception unused) {
            actionResponse = new ActionResponse(null, null, 3, null);
        }
        String action = intent.getAction();
        if (action == null) {
            return null;
        }
        int iHashCode = action.hashCode();
        int i14 = 0;
        if (iHashCode == -1971521434) {
            if (!action.equals(BroadcastActions.TOHU_CARD_STATUS_UPDATED_ACTION)) {
                return null;
            }
            String result = actionResponse.getResult();
            if (Intrinsics.areEqual(result, "TOHU_STATUS_UPDATED")) {
                TohuData data = actionResponse.getData();
                if (data == null || (cardUniqueReference = data.getCardUniqueReference()) == null) {
                    cardUniqueReference = "";
                } else {
                    if (cardUniqueReference.length() > 10) {
                        cardUniqueReference = StringsKt___StringsKt.dropLast(cardUniqueReference, 10);
                    }
                    if (cardUniqueReference == null) {
                        cardUniqueReference = "";
                    }
                }
                pair = new Pair<>(LinkParamsKt.UNIVERSAL_KEY, new DeepLinkModel(OPERATIVE_TYPE, MOBILE_PAYMENT, null, q.mapOf(new Pair(PRODUCT_ID, cardUniqueReference), new Pair("operation", OPERATIVE)), 4, null));
                i14 = R.string.tohu_status_updated_title;
                i10 = R.string.tohu_status_updated_descriptions;
            } else if (Intrinsics.areEqual(result, "TOHU_CRYPTO_ERROR")) {
                pair = new Pair<>(LinkParamsKt.UNIVERSAL_KEY, new DeepLinkModel(OPERATIVE_TYPE, MOBILE_PAYMENT, null, p.mapOf(new Pair("operation", "settings")), 4, null));
                i14 = R.string.tohu_crypto_error_title;
                i10 = R.string.tohu_crypto_error_descriptions;
            } else {
                pair = null;
                i10 = 0;
            }
            return a(i14, i10, pair, null);
        }
        if (iHashCode == -798921265) {
            if (!action.equals(BroadcastActions.TOHU_SYSTEM_NOTIFICATIONS)) {
                return null;
            }
            String result2 = actionResponse.getResult();
            if (Intrinsics.areEqual(result2, "TOHU_CRYPTO_ERROR")) {
                i14 = R.string.tohu_crypto_error_title;
                i11 = R.string.tohu_crypto_error_descriptions;
                pair2 = new Pair<>(LinkParamsKt.UNIVERSAL_KEY, new DeepLinkModel(OPERATIVE_TYPE, MOBILE_PAYMENT, null, p.mapOf(new Pair("operation", "settings")), 4, null));
            } else if (Intrinsics.areEqual(result2, "TOHU_LOGIN_NEEDED")) {
                i14 = R.string.tohu_login_needed_title;
                i11 = R.string.tohu_login_needed_descriptions;
                pair2 = new Pair<>(LinkParamsKt.UNIVERSAL_KEY, new DeepLinkModel(OPERATIVE_TYPE, MOBILE_PAYMENT, null, p.mapOf(new Pair("operation", "settings")), 4, null));
            } else {
                pair2 = null;
                i11 = 0;
            }
            return a(i14, i11, pair2, null);
        }
        if (iHashCode != -256541329 || !action.equals(BroadcastActions.TOHU_PAYMENT_ACTION)) {
            return null;
        }
        String result3 = actionResponse.getResult();
        if (result3 != null) {
            switch (result3) {
                case "TOHU_INSECURE_DEVICE":
                    i14 = R.string.tohu_insecure_device_title;
                    i12 = R.string.tohu_insecure_device_descriptions;
                    type = PaymentInfoType.INSECURE_DEVICE.getType();
                    break;
                case "TOHU_PAYMENT_ABORT":
                    i14 = R.string.tohu_payment_abort_title;
                    i12 = R.string.tohu_payment_abort_descriptions;
                    type = PaymentInfoType.ERROR.getType();
                    break;
                case "TOHU_LOGIN_NEEDED":
                    pair3 = new Pair<>(LinkParamsKt.UNIVERSAL_KEY, new DeepLinkModel(OPERATIVE_TYPE, MOBILE_PAYMENT, null, p.mapOf(new Pair("operation", "settings")), 4, null));
                    i14 = R.string.tohu_login_needed_title;
                    i13 = R.string.tohu_login_needed_descriptions;
                    pair4 = pair3;
                    i12 = i13;
                    type = null;
                    break;
                case "TOHU_NOT_REGISTERED":
                    pair3 = new Pair<>(LinkParamsKt.UNIVERSAL_KEY, new DeepLinkModel(OPERATIVE_TYPE, MOBILE_PAYMENT, null, p.mapOf(new Pair("operation", "settings")), 4, null));
                    i14 = R.string.tohu_not_registered_title;
                    i13 = R.string.tohu_not_registered_descriptions;
                    pair4 = pair3;
                    i12 = i13;
                    type = null;
                    break;
                case "TOHU_SET_FAVORITE_NEEDED":
                    pair4 = new Pair<>(LinkParamsKt.UNIVERSAL_KEY, new DeepLinkModel(OPERATIVE_TYPE, MOBILE_PAYMENT, null, p.mapOf(new Pair("operation", OPERATIVE)), 4, null));
                    i14 = R.string.tohu_set_favorite_needed_title;
                    i12 = R.string.tohu_set_favorite_needed_descriptions;
                    type = PaymentInfoType.NOT_DEFAULT_CARD.getType();
                    break;
                case "OK":
                    i14 = R.string.tohu_action_result_ok_title;
                    i12 = R.string.tohu_action_result_ok_descriptions;
                    type = PaymentInfoType.SUCCESS.getType();
                    break;
                case "TOHU_UNLOCK_DEVICE_REQUIRED":
                    i14 = R.string.tohu_unlock_device_required_title;
                    i12 = R.string.tohu_unlock_device_required_descriptions;
                    type = PaymentInfoType.AUTHENTICATED.getType();
                    break;
                case "TOHU_USER_AUTHENTICATION_REQUIRED":
                    i14 = R.string.tohu_user_authentication_required_title;
                    i12 = R.string.tohu_user_authentication_required_descriptions;
                    type = PaymentInfoType.AUTHENTICATION_REQUIRED.getType();
                    break;
                case "TOHU_TOKENS_NOT_PRESENT":
                    pair4 = new Pair<>(LinkParamsKt.UNIVERSAL_KEY, new DeepLinkModel(OPERATIVE_TYPE, MOBILE_PAYMENT, null, p.mapOf(new Pair("operation", OPERATIVE)), 4, null));
                    i14 = R.string.tohu_tokens_not_present_title;
                    i12 = R.string.tohu_tokens_not_present_descriptions;
                    type = PaymentInfoType.TOKENS_NOT_PRESENT.getType();
                    break;
                default:
                    type = null;
                    i12 = 0;
                    break;
            }
        } else {
            type = null;
            i12 = 0;
        }
        return a(i14, i12, pair4, type);
    }
}
