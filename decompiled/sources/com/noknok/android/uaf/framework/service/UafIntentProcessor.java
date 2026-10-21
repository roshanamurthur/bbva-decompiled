package com.noknok.android.uaf.framework.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import com.fido.android.framework.service.Mfac;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import org.fidoalliance.intent.api.UAFAppIntentExtras;
import org.fidoalliance.intent.api.UAFIntentType;
import org.fidoalliance.uaf.client.UAFMessage;

/* JADX INFO: loaded from: classes11.dex */
public class UafIntentProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f63599a = new GsonBuilder().create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent f63600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f63601c;

    /* JADX INFO: renamed from: com.noknok.android.uaf.framework.service.UafIntentProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$fidoalliance$intent$api$UAFIntentType;

        static {
            int[] iArr = new int[UAFIntentType.values().length];
            $SwitchMap$org$fidoalliance$intent$api$UAFIntentType = iArr;
            try {
                iArr[UAFIntentType.CHECK_POLICY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$fidoalliance$intent$api$UAFIntentType[UAFIntentType.UAF_OPERATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$fidoalliance$intent$api$UAFIntentType[UAFIntentType.DISCOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class UafIntentException extends Exception {
        private static final long serialVersionUID = 1;
        private final Outcome mError;

        public UafIntentException(Outcome outcome, String str) {
            super(str);
            this.mError = outcome;
        }
    }

    private String a(ActivityProxy activityProxy, Context context) {
        String packageName;
        if (activityProxy.hasActivity()) {
            ComponentName callingActivity = activityProxy.getCallingActivity();
            if (callingActivity != null) {
                packageName = callingActivity.getPackageName();
            } else {
                Logger.w("UafIntentProcessor", "processIntent: The activity is not started for result");
                packageName = null;
            }
        } else {
            packageName = null;
        }
        if (packageName != null) {
            return packageName;
        }
        Logger.i("UafIntentProcessor", "processIntent: Assuming this is the local case. The caller is this application.");
        return context.getPackageName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Intent processIntent(Intent intent, Context context, ActivityProxy activityProxy, boolean z10) {
        String str;
        UafIntentProcessor uafIntentProcessor;
        String str2;
        String str3;
        UafIntentProcessor uafIntentProcessor2;
        String str4;
        UafIntentProcessor uafIntentProcessor3;
        boolean z11;
        UafIntentProcessor uafIntentProcessor4;
        Object obj = "Unsupported Intent Type ";
        this.f63601c = new Intent();
        try {
            if (context == null) {
                throw new UafIntentException(Outcome.PROTOCOL_ERROR, "callerContext is null");
            }
            try {
                this.f63601c.putExtra(UAFAppIntentExtras.IEN_COMPONENT_NAME, context.getPackageName());
                Mfac.init(context.getApplicationContext());
                if (intent == null) {
                    throw new UafIntentException(Outcome.PROTOCOL_ERROR, "requestIntent is null");
                }
                this.f63600b = intent;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    Logger.e("UafIntentProcessor", "Malformed request intent: request intent must have extras.");
                    return this.f63601c;
                }
                String string = extras.getString(UAFAppIntentExtras.IEN_UAF_INTENT_TYPE);
                Logger.i("UafIntentProcessor", string);
                if (string == null) {
                    throw new UafIntentException(Outcome.PROTOCOL_ERROR, "IEN_UAF_INTENT_TYPE is missing");
                }
                int i10 = AnonymousClass1.$SwitchMap$org$fidoalliance$intent$api$UAFIntentType[UAFIntentType.valueOf(string).ordinal()];
                if (i10 == 1) {
                    a(UAFIntentType.CHECK_POLICY_RESULT);
                    z11 = true;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new UafIntentException(Outcome.PROTOCOL_ERROR, "Unsupported Intent Type ".concat(string));
                        }
                        a(UAFIntentType.DISCOVER_RESULT);
                        this.f63601c.putExtra(UAFAppIntentExtras.IEN_DISCOVERY_DATA, this.f63599a.toJson(new UafProcessor().getDiscoveryData(activityProxy)));
                        a(Outcome.SUCCESS);
                        return this.f63601c;
                    }
                    a(UAFIntentType.UAF_OPERATION_RESULT);
                    if (extras.getString(UAFAppIntentExtras.IEN_CHANNEL_BINDINGS) == null) {
                        throw new UafIntentException(Outcome.PROTOCOL_ERROR, "IEN_CHANNEL_BINDINGS is missing");
                    }
                    z11 = false;
                }
                UAFMessage uAFMessageA = a();
                if (uAFMessageA == null) {
                    throw new UafIntentException(Outcome.PROTOCOL_ERROR, "IEN_MESSAGE is missing ");
                }
                try {
                    UafProcessor.UafRequestTask uafRequestTask = new UafProcessor.UafRequestTask(uAFMessageA.uafProtocolMessage, this.f63600b.getStringExtra(UAFAppIntentExtras.IEN_CHANNEL_BINDINGS), this.f63600b.getStringExtra("origin"), a(activityProxy, context), Binder.getCallingPid(), Binder.getCallingUid(), context, uAFMessageA.getAdditionalData(), z11, activityProxy, z10);
                    Logger.d("UafIntentProcessor-###", "UAF Request: " + uafRequestTask);
                    UafProcessor.UafResponseTask uafResponseTaskProcessUafRequest = new UafProcessor().processUafRequest(uafRequestTask);
                    Logger.d("UafIntentProcessor-###", "UAF Response: " + uafResponseTaskProcessUafRequest.toString());
                    UAFMessage uAFMessage = uafResponseTaskProcessUafRequest.uafResponseMessage;
                    if (uAFMessage != null) {
                        UafIntentProcessor uafIntentProcessor5 = this;
                        uafIntentProcessor5.f63601c.putExtra("message", uafIntentProcessor5.f63599a.toJson(uAFMessage));
                        uafIntentProcessor4 = uafIntentProcessor5;
                    } else {
                        uafIntentProcessor4 = this;
                    }
                    uafIntentProcessor4.a(uafResponseTaskProcessUafRequest.returnCode);
                    uafIntentProcessor3 = uafIntentProcessor4;
                } catch (UafIntentException e5) {
                    e = e5;
                    obj = this;
                    str3 = "UafIntentProcessor";
                    str4 = " Error while processing Intent";
                    uafIntentProcessor2 = obj;
                    Logger.e(str3, str4, e);
                    uafIntentProcessor2.a(e.mError);
                    uafIntentProcessor3 = uafIntentProcessor2;
                } catch (RuntimeException e7) {
                    e = e7;
                    obj = this;
                    str = "UafIntentProcessor";
                    str2 = " Error while processing Intent";
                    uafIntentProcessor = obj;
                    Logger.e(str, str2, e);
                    uafIntentProcessor.a(Outcome.FAILURE);
                    uafIntentProcessor3 = uafIntentProcessor;
                }
                return uafIntentProcessor3.f63601c;
            } catch (UafIntentException e10) {
                e = e10;
                uafIntentProcessor2 = this;
                str3 = "UafIntentProcessor";
                str4 = " Error while processing Intent";
                Logger.e(str3, str4, e);
                uafIntentProcessor2.a(e.mError);
                uafIntentProcessor3 = uafIntentProcessor2;
            } catch (RuntimeException e11) {
                e = e11;
                uafIntentProcessor = this;
                str = "UafIntentProcessor";
                str2 = " Error while processing Intent";
                Logger.e(str, str2, e);
                uafIntentProcessor.a(Outcome.FAILURE);
                uafIntentProcessor3 = uafIntentProcessor;
            }
        } catch (UafIntentException e12) {
            e = e12;
        } catch (RuntimeException e13) {
            e = e13;
        }
    }

    private UAFMessage a() throws UafIntentException {
        String stringExtra = this.f63600b.getStringExtra("message");
        if (stringExtra == null || stringExtra.isEmpty()) {
            return null;
        }
        try {
            return (UAFMessage) this.f63599a.fromJson(stringExtra, UAFMessage.class);
        } catch (JsonSyntaxException unused) {
            throw new UafIntentException(Outcome.PROTOCOL_ERROR, "Invalid Json syntax");
        }
    }

    private void a(UAFIntentType uAFIntentType) {
        this.f63601c.putExtra(UAFAppIntentExtras.IEN_UAF_INTENT_TYPE, uAFIntentType.name());
    }

    private void a(Outcome outcome) {
        this.f63601c.putExtra("errorCode", outcome.getUafErrorCode());
    }
}
