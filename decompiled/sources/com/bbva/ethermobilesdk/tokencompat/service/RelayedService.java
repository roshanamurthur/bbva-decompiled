package com.bbva.ethermobilesdk.tokencompat.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Keep;
import bk.p;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.extension.ContextKt;
import com.bbva.ethermobilesdk.tokencompat.extension.IntentKt;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RelayedService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/service/RelayedService;", "Landroid/app/Service;", "()V", "mode", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "Companion", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RelayedService extends Service {

    @NotNull
    public static final String KEY = "X19rX18";

    @NotNull
    public static final String KEY_IDS = "ids";

    @NotNull
    public static final String VALUE = "X192X18";

    @Nullable
    private TokenCompatConfig.StorageMode mode;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) throws InterruptedException {
        Pair<String, String> pair;
        TokenCompatConfig.StorageMode storageMode = ContextKt.readStorageMode(this);
        this.mode = storageMode;
        if (intent != null && storageMode != null && (pair = IntentKt.toPair(intent, this)) != null) {
            ContextKt.relay(this, p.mapOf(pair), storageMode);
        }
        stopSelf(startId);
        return 2;
    }
}
