package com.noknok.android.client.appsdk.uaf;

import android.content.Intent;
import android.os.Bundle;
import com.google.gson.GsonBuilder;
import com.noknok.android.client.appsdk.FidoOut;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import org.fidoalliance.intent.api.UAFAppIntentExtras;
import org.fidoalliance.intent.api.UAFIntentType;
import org.fidoalliance.uaf.client.UAFMessage;

/* JADX INFO: loaded from: classes11.dex */
public class UafIntentParser {

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk.uaf.UafIntentParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62915a;

        static {
            int[] iArr = new int[UAFIntentType.values().length];
            f62915a = iArr;
            try {
                iArr[UAFIntentType.CHECK_POLICY_RESULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62915a[UAFIntentType.UAF_OPERATION_RESULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62915a[UAFIntentType.UAF_OPERATION_COMPLETION_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62915a[UAFIntentType.DISCOVER_RESULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static FidoOut parseUafResponseIntent(Intent intent) {
        FidoOut fidoOut = new FidoOut();
        fidoOut.fidoStatus = ResultType.PROTOCOL_ERROR;
        if (intent == null) {
            Logger.e("UafIntentParser", "Malformed response: data is missing");
            return fidoOut;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Logger.e("UafIntentParser", "Malformed response: UAF intent must have extras");
            return fidoOut;
        }
        if (!extras.containsKey(UAFAppIntentExtras.IEN_COMPONENT_NAME)) {
            Logger.e("UafIntentParser", "Malformed response: mandatory field IEN_COMPONENT_NAME is missing");
            return fidoOut;
        }
        if (!extras.containsKey("errorCode")) {
            Logger.e("UafIntentParser", "Malformed response: mandatory field IEN_ERROR_CODE is missing");
            return fidoOut;
        }
        if (!extras.containsKey(UAFAppIntentExtras.IEN_UAF_INTENT_TYPE)) {
            Logger.e("UafIntentParser", "Malformed response: mandatory field IEN_UAF_INTENT_TYPE is missing");
            return fidoOut;
        }
        String string = extras.getString(UAFAppIntentExtras.IEN_UAF_INTENT_TYPE);
        try {
            UAFIntentType uAFIntentTypeValueOf = UAFIntentType.valueOf(string);
            int i10 = AnonymousClass1.f62915a[uAFIntentTypeValueOf.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (extras.containsKey("message")) {
                    UAFMessage uAFMessage = (UAFMessage) new GsonBuilder().create().fromJson(extras.getString("message"), UAFMessage.class);
                    if (uAFMessage != null) {
                        fidoOut.fidoResponse = uAFMessage.uafProtocolMessage;
                        fidoOut.responseParams = uAFMessage.getAdditionalData();
                    }
                } else {
                    Logger.i("UafIntentParser", "IEN_MESSAGE is not set");
                }
            } else if (i10 != 3) {
                if (i10 != 4) {
                    Logger.e("UafIntentParser", "Unsupported IEN_UAF_INTENT_TYPE " + uAFIntentTypeValueOf);
                    return fidoOut;
                }
                if (extras.containsKey(UAFAppIntentExtras.IEN_DISCOVERY_DATA)) {
                    fidoOut.discoveryData = extras.getString(UAFAppIntentExtras.IEN_DISCOVERY_DATA);
                } else {
                    Logger.i("UafIntentParser", "IEN_DISCOVERY_DATA is not set");
                }
            }
            fidoOut.fidoStatus = ResultType.fromOutcome(Outcome.fromUafErrorCode(extras.getShort("errorCode")));
            return fidoOut;
        } catch (IllegalArgumentException e5) {
            Logger.e("UafIntentParser", "Error while processing value of IEN_UAF_INTENT_TYPE: " + string, e5);
            return fidoOut;
        }
    }
}
