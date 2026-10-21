package com.appsflyer;

import androidx.annotation.WorkerThread;
import com.appsflyer.internal.AFc1rSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1ySDK;
import com.nulabinc.zxcvbn.Guess;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
@Deprecated
public final class CreateOneLinkHttpTask implements AFc1uSDK {

    @NotNull
    private final AFc1ySDK AFKeystoreWrapper;

    @Deprecated
    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask() {
    }

    public CreateOneLinkHttpTask(AFc1ySDK aFc1ySDK) {
        Intrinsics.checkNotNullParameter(aFc1ySDK, "");
        this.AFKeystoreWrapper = aFc1ySDK;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void valueOf(byte[] bArr, Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFc1rSDK(bArr, map, Guess.REFERENCE_YEAR).AFInAppEventType()) {
            this.AFKeystoreWrapper.AFKeystoreWrapper();
        }
    }
}
