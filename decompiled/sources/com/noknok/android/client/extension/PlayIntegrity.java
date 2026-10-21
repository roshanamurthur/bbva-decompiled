package com.noknok.android.client.extension;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.MobileServicesAvailabilityChecker;
import com.noknok.android.common.R;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class PlayIntegrity implements IExtensionProcessor {
    public static final String KEY_PREFERRED = "preferred";
    public static final String KEY_REQUIRED = "required";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f63333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final INonceGenerator f63334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f63335f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Semaphore f63331b = new Semaphore(0, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63332c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63330a = false;

    /* JADX INFO: renamed from: com.noknok.android.client.extension.PlayIntegrity$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63336a;

        static {
            int[] iArr = new int[IExtensionProcessor.ExtensionMode.values().length];
            f63336a = iArr;
            try {
                iArr[IExtensionProcessor.ExtensionMode.never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63336a[IExtensionProcessor.ExtensionMode.requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63336a[IExtensionProcessor.ExtensionMode.silently.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63336a[IExtensionProcessor.ExtensionMode.always.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface INonceGenerator {
        String generateNonce();
    }

    public PlayIntegrity(Context context, INonceGenerator iNonceGenerator) {
        this.f63333d = context;
        this.f63334e = iNonceGenerator;
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void finish(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map) {
        if (this.f63330a) {
            a();
            iExtensionList.addExtension(ExtensionManager.PLAY_INTEGRITY_EXT_ID, this.f63332c, false);
            this.f63330a = false;
        }
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public final /* synthetic */ void start(IExtensionList iExtensionList, HashMap map, Activity activity) {
        a.a(this, iExtensionList, map, activity);
    }

    private void a() {
        if (this.f63335f == null) {
            try {
                this.f63335f = Long.valueOf(Long.parseLong(this.f63333d.getResources().getString(R.string.nnl_google_project_number)));
            } catch (NumberFormatException unused) {
                Logger.e("PlayIntegrity", "Project ID provided in String resources should be Long number");
            }
        }
        if (!MobileServicesAvailabilityChecker.isPlayIntegrityLibraryAvailable(this.f63333d)) {
            this.f63332c = "a";
            Logger.e("PlayIntegrity", "Play integrity library dependency is missing in application");
            return;
        }
        int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f63333d);
        if (iIsGooglePlayServicesAvailable != 0) {
            if (iIsGooglePlayServicesAvailable == 1 || iIsGooglePlayServicesAvailable == 2 || iIsGooglePlayServicesAvailable == 3 || iIsGooglePlayServicesAvailable == 9 || iIsGooglePlayServicesAvailable == 16) {
                Logger.w("PlayIntegrity", "Google play services is not available");
                this.f63332c = "p";
                return;
            } else {
                Logger.w("PlayIntegrity", "Google play services connection error: " + iIsGooglePlayServicesAvailable);
                this.f63332c = "a";
                return;
            }
        }
        String strGenerateNonce = this.f63334e.generateNonce();
        if (strGenerateNonce == null) {
            Logger.e("PlayIntegrity", "Failed to create nonce");
            this.f63332c = "a";
            return;
        }
        IntegrityTokenRequest.Builder nonce = IntegrityTokenRequest.builder().setNonce(strGenerateNonce);
        Long l6 = this.f63335f;
        if (l6 != null) {
            nonce.setCloudProjectNumber(l6.longValue());
        }
        Task<IntegrityTokenResponse> taskRequestIntegrityToken = IntegrityManagerFactory.create(this.f63333d).requestIntegrityToken(nonce.build());
        taskRequestIntegrityToken.addOnSuccessListener(new OnSuccessListener() { // from class: com.noknok.android.client.extension.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f63342a.a((IntegrityTokenResponse) obj);
            }
        });
        taskRequestIntegrityToken.addOnFailureListener(new OnFailureListener() { // from class: com.noknok.android.client.extension.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f63343a.a(exc);
            }
        });
        try {
            if (this.f63331b.tryAcquire(5000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            Logger.e("PlayIntegrity", "Failed to acquire semaphore");
            this.f63332c = "a";
        } catch (InterruptedException e5) {
            Logger.e("PlayIntegrity", "Play Integrity attestation process was interrupted.", e5);
            this.f63332c = "a";
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void start(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map, ActivityProxy activityProxy) {
        boolean z10;
        if (this.f63334e == null) {
            return;
        }
        IExtension extension = iExtensionList.getExtension(ExtensionManager.PLAY_INTEGRITY_EXT_ID);
        if (extension == null) {
            z10 = false;
        } else {
            JsonObject asJsonObject = (JsonObject) new Gson().fromJson(extension.getData(), JsonObject.class);
            String asString = asJsonObject.has("preference") ? asJsonObject.get("preference").getAsString() : null;
            if (asJsonObject.has("data")) {
                asJsonObject = asJsonObject.get("data").getAsJsonObject();
            }
            if (asJsonObject != null && asJsonObject.has("projectId")) {
                this.f63335f = Long.valueOf(Long.parseLong(asJsonObject.get("projectId").getAsString()));
            }
            if (asString == null || asString.equals(KEY_REQUIRED) || asString.equals(KEY_PREFERRED)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        iExtensionList.removeExtension(ExtensionManager.PLAY_INTEGRITY_EXT_ID);
        int i10 = AnonymousClass1.f63336a[ExtensionConfigHelper.getConfigExtensionMode(this.f63333d, AppSDKConfig.Key.sendPlayIntegrity.name(), map.get(IExtensionProcessor.ExtProcParamKey.EXT_OP_TYPE)).ordinal()];
        if (i10 == 1) {
            if (z10) {
                Logger.i("PlayIntegrity", "Play Integrity extension processing disabled");
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                return;
            }
        } else if (!z10) {
            return;
        }
        this.f63330a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(IntegrityTokenResponse integrityTokenResponse) {
        this.f63332c = integrityTokenResponse.token();
        this.f63331b.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Exception exc) {
        Logger.e("PlayIntegrity", "Failed to get attestation result.", exc);
        this.f63332c = "a";
        this.f63331b.release();
    }
}
