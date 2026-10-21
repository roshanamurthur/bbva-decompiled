package com.bbva.tohu.android.core.utils;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.bbva.ethermobile.help.kit.callback.EtherCallback;
import com.bbva.ethermobile.help.kit.result.JavaResult;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.DeviceChecker;
import com.bbva.ethermobilesdk.devicechecker.play.integrity.IntegrityApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class Integrity {
    private static final int MAX_RETRY_HARD = 300;
    private static final int MAX_RETRY_SOFT = 50;
    private static final String SAFETYNET_ERROR = "SAFETYNET_ERROR";
    private final String TAG = getClass().getSimpleName();
    private final Long cloudId;
    private final DeviceChecker deviceChecker;
    private final IntegrityApi integrityApi;

    public class IntegrityFlags {
        public boolean checked;
        public boolean hasErrors;
        public boolean isRoot;
        public String jws;

        public /* synthetic */ IntegrityFlags(Integrity integrity, int i10) {
            this();
        }

        private IntegrityFlags() {
            this.checked = false;
            this.isRoot = false;
            this.hasErrors = false;
        }
    }

    private Integrity(Context context, PlatformPreferencesManager platformPreferencesManager) {
        this.integrityApi = new IntegrityApi(context);
        this.deviceChecker = new DeviceChecker(context);
        this.cloudId = platformPreferencesManager.getIntegrityCloudProjectNumber();
    }

    private String buildRandomNonce() {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[24];
        new Random().nextBytes(bArr);
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(strValueOf.getBytes());
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 10);
        } catch (IOException unused) {
            return null;
        }
    }

    private void callAttestServiceAndWaitResponse(String str, int i10, final IntegrityFlags integrityFlags) {
        this.integrityApi.token(str, this.cloudId, new JavaResult(new EtherCallback() { // from class: com.bbva.tohu.android.core.utils.b
            @Override // com.bbva.ethermobile.help.kit.callback.EtherCallback
            public final void success(Object obj) {
                this.f36926a.lambda$callAttestServiceAndWaitResponse$0(integrityFlags, (Result) obj);
            }
        }));
        waitForResponse(i10, integrityFlags);
    }

    private void callIsRootAndWaitResponse(int i10, final IntegrityFlags integrityFlags) {
        this.deviceChecker.getRoot().isRoot(true, new JavaResult(new EtherCallback() { // from class: com.bbva.tohu.android.core.utils.a
            @Override // com.bbva.ethermobile.help.kit.callback.EtherCallback
            public final void success(Object obj) {
                Integrity.lambda$callIsRootAndWaitResponse$1(integrityFlags, (Result) obj);
            }
        }));
        waitForResponse(i10, integrityFlags);
    }

    public static Integrity getInstance(Context context, PlatformPreferencesManager platformPreferencesManager) {
        return new Integrity(context, platformPreferencesManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callAttestServiceAndWaitResponse$0(IntegrityFlags integrityFlags, Result result) {
        if (result instanceof Result.Success) {
            integrityFlags.jws = (String) ((Result.Success) result).getValue();
            integrityFlags.checked = true;
        } else if (result instanceof Result.Error) {
            ((Result.Error) result).getException().getMessage();
            integrityFlags.hasErrors = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$callIsRootAndWaitResponse$1(IntegrityFlags integrityFlags, Result result) {
        if (result instanceof Result.Success) {
            integrityFlags.isRoot = ((Boolean) ((Result.Success) result).getValue()).booleanValue();
            integrityFlags.checked = true;
        }
    }

    private void waitForResponse(int i10, IntegrityFlags integrityFlags) {
        for (int i11 = 0; i11 < i10 && !integrityFlags.checked; i11++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e5) {
                LogTohu.e(this.TAG, "Error waiting for Integrity.", e5);
                Thread.currentThread().interrupt();
            }
        }
    }

    public String getAttestJWS(String str) {
        LogTohu.i(this.TAG, "Begin SafetyNet attest request", new Object[0]);
        IntegrityFlags integrityFlags = new IntegrityFlags(this, 0);
        try {
            callAttestServiceAndWaitResponse(str, 300, integrityFlags);
            if (integrityFlags.checked && !integrityFlags.hasErrors) {
                return integrityFlags.jws;
            }
        } catch (Exception unused) {
        }
        return SAFETYNET_ERROR;
    }

    public boolean isRooted() {
        int i10 = 0;
        LogTohu.i(this.TAG, "Begin SafetyNet rooted check", new Object[0]);
        IntegrityFlags integrityFlags = new IntegrityFlags(this, i10);
        try {
            callAttestServiceAndWaitResponse(buildRandomNonce(), 50, integrityFlags);
            if (!integrityFlags.checked || integrityFlags.hasErrors) {
                return false;
            }
            IntegrityFlags integrityFlags2 = new IntegrityFlags(this, i10);
            callIsRootAndWaitResponse(50, integrityFlags2);
            return integrityFlags2.isRoot;
        } catch (Exception e5) {
            Log.w(this.TAG, "Error checking if device is rooted", e5);
            return false;
        }
    }
}
