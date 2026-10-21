package com.noknok.android.client.asm.core.uaf;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.asm.service.IUafAsmService;

/* JADX INFO: loaded from: classes11.dex */
public class AsmService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f63241a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f63242b = 0;

    public class AsmServiceImpl extends IUafAsmService.Stub {
        public AsmServiceImpl() {
        }

        @Override // com.noknok.android.uaf.asm.service.IUafAsmService
        public String sendRequest(String str) {
            String[] packagesForUid = AsmService.this.getApplicationContext().getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid == null || packagesForUid.length == 0) {
                return null;
            }
            int i10 = AsmService.f63242b;
            Logger.i("AsmService", String.format("Processing ASM service request from %s", packagesForUid[0]));
            if (AsmService.f63241a) {
                Logger.i(Logger.TAG_CONFIG_REPORTER, String.format("ASMSDK Version : %s", "9.1.0.1100"));
                AsmService.f63241a = false;
            }
            return AsmFactory.createAsmInstance(AsmService.this.getApplicationContext()).process(str, null, packagesForUid[0]);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Logger.d("AsmService", String.format("onBind: %s", intent.toString()));
        return new AsmServiceImpl();
    }

    @Override // android.app.Service
    public void onCreate() {
        Logger.d("AsmService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.d("AsmService", "onDestroy");
        stopSelf();
        super.onDestroy();
    }
}
