package com.bbva.ethermobilesdk.deviceuid;

import android.accounts.Account;
import android.app.Application;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.deviceuid.store.impl.AccountStore;
import com.bbva.ethermobilesdk.deviceuid.store.impl.MemoryStore;
import com.bbva.ethermobilesdk.deviceuid.store.impl.SharedPreferencesStore;
import com.bbva.ethermobilesdk.deviceuid.store.impl.SharedStorageStore;
import com.bbva.ethermobilesdk.deviceuid.utils.CryptoKt;
import com.bbva.ethermobilesdk.deviceuid.utils.LogKt;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceUID.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\"\u0010\u0018\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceuid/MultiStoreDeviceUID;", "Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;", "Landroid/app/Application;", Constants.APPLICATION, "", "share", "Landroid/accounts/Account;", "account", "", "sharingGroup", "doSync", "", "initialize$deviceuid_release", "(Landroid/app/Application;ZLandroid/accounts/Account;Ljava/lang/String;Z)V", "initialize", "shortened", "Lcom/bbva/ethermobile/help/kit/result/Result;", "uid", "c", "Z", "isInitialized$deviceuid_release", "()Z", "setInitialized$deviceuid_release", "(Z)V", "isInitialized", "<init>", "()V", "deviceuid_release"}, k = 1, mv = {1, 8, 0})
public final class MultiStoreDeviceUID implements DeviceUID {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MemoryStore f29754a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean isInitialized;

    @NotNull
    public static final MultiStoreDeviceUID INSTANCE = new MultiStoreDeviceUID();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Object f29755b = new Object();

    public final void initialize$deviceuid_release(@NotNull Application application, boolean share, @Nullable Account account, @Nullable String sharingGroup, boolean doSync) {
        MemoryStore memoryStore;
        Intrinsics.checkNotNullParameter(application, "application");
        String strGenerateUIDKey = CryptoKt.generateUIDKey();
        SharedPreferencesStore sharedPreferencesStore = new SharedPreferencesStore(application, null, strGenerateUIDKey);
        if (!share) {
            memoryStore = new MemoryStore(sharedPreferencesStore, null, 2, null);
        } else {
            if (sharingGroup == null || sharingGroup.length() <= 0 || !(!l.isBlank(sharingGroup))) {
                throw new IllegalArgumentException("Sharing feature requires a group to be specified".toString());
            }
            SharedStorageStore sharedStorageStore = new SharedStorageStore(application, sharingGroup, null, sharedPreferencesStore, 4, null);
            if (doSync) {
                sharedStorageStore.getSharedStorage().sync();
            }
            try {
                memoryStore = new MemoryStore(new AccountStore(application, account, sharedStorageStore, strGenerateUIDKey), null, 2, null);
            } catch (Exception e5) {
                LogKt.logError("configureUIDStore", e5);
                memoryStore = new MemoryStore(sharedStorageStore, null, 2, null);
            }
        }
        f29754a = memoryStore;
        isInitialized = true;
    }

    public final boolean isInitialized$deviceuid_release() {
        return isInitialized;
    }

    public final void setInitialized$deviceuid_release(boolean z10) {
        isInitialized = z10;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.DeviceUID
    @NotNull
    public Result<String> uid(boolean shortened) {
        String strGenerateUID;
        try {
            MemoryStore memoryStore = f29754a;
            MemoryStore memoryStore2 = null;
            if (memoryStore == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uidStore");
                memoryStore = null;
            }
            String uid = memoryStore.getUID();
            if (uid == null) {
                synchronized (f29755b) {
                    try {
                        strGenerateUID = CryptoKt.generateUID();
                        MemoryStore memoryStore3 = f29754a;
                        if (memoryStore3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("uidStore");
                        } else {
                            memoryStore2 = memoryStore3;
                        }
                        memoryStore2.saveUID(strGenerateUID);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                uid = strGenerateUID;
            }
            if (!shortened) {
                return new Result.Success(uid);
            }
            String strSubstring = uid.substring(0, 32);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new Result.Success(strSubstring);
        } catch (Exception e5) {
            LogKt.logError("uid", e5);
            return new Result.Error(e5);
        }
    }
}
