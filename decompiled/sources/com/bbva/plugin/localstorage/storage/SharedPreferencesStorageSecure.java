package com.bbva.plugin.localstorage.storage;

import android.content.Context;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.localstorage.LocalStorageSecure;
import com.bbva.localstorage.model.BiometricsStorageData;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecureStorage.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/bbva/plugin/localstorage/storage/SharedPreferencesStorageSecure;", "Lcom/bbva/plugin/localstorage/storage/StorageSecure;", "()V", "get", "", "key", "biometricsStorageData", "Lcom/bbva/localstorage/model/BiometricsStorageData;", "(Ljava/lang/String;Lcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBiometricAvailable", "", "context", "Landroid/content/Context;", Constants.authenticationType, "Lcom/bbva/biometrics/authenticator/data/AuthenticationType;", "isSecureHardware", RemoveCommand.ID, "", "save", "value", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesStorageSecure implements StorageSecure {

    /* JADX INFO: compiled from: SecureStorage.kt */
    @DebugMetadata(c = "com.bbva.plugin.localstorage.storage.SharedPreferencesStorageSecure", f = "SecureStorage.kt", i = {}, l = {31}, m = "get", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35801p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35803r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35801p0 = obj;
            this.f35803r0 |= Integer.MIN_VALUE;
            return SharedPreferencesStorageSecure.this.get(null, null, this);
        }
    }

    /* JADX INFO: compiled from: SecureStorage.kt */
    @DebugMetadata(c = "com.bbva.plugin.localstorage.storage.SharedPreferencesStorageSecure", f = "SecureStorage.kt", i = {}, l = {27}, m = "save", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35804p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35806r0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35804p0 = obj;
            this.f35806r0 |= Integer.MIN_VALUE;
            return SharedPreferencesStorageSecure.this.save(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.plugin.localstorage.storage.StorageSecure
    @Nullable
    public Object get(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super String> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f35803r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f35803r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object string = aVar.f35801p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f35803r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(string);
            com.bbva.localstorage.storage.StorageSecure storage = LocalStorageSecure.INSTANCE.getStorage();
            aVar.f35803r0 = 1;
            string = storage.getString(str, biometricsStorageData, aVar);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(string);
        }
        return com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) string);
    }

    @Override // com.bbva.plugin.localstorage.storage.StorageSecure
    public boolean isBiometricAvailable(@NotNull Context context, @NotNull AuthenticationType authenticationType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
        return ((Boolean) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(LocalStorageSecure.INSTANCE.getStorage().isBiometricAvailable(context, authenticationType))).booleanValue();
    }

    @Override // com.bbva.plugin.localstorage.storage.StorageSecure
    public boolean isSecureHardware() {
        return ((Boolean) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(LocalStorageSecure.INSTANCE.getStorage().isSecureHardware())).booleanValue();
    }

    @Override // com.bbva.plugin.localstorage.storage.StorageSecure
    public void remove(@NotNull String key) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        com.bbva.localstorage.storage.StorageSecure storage = LocalStorageSecure.INSTANCE.getStorage();
        storage.remove(key);
        com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(storage.removeAlias(key));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.plugin.localstorage.storage.StorageSecure
    @Nullable
    public Object save(@NotNull String str, @NotNull String str2, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f35806r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f35806r0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f35804p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f35806r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bbva.localstorage.storage.StorageSecure storage = LocalStorageSecure.INSTANCE.getStorage();
            bVar.f35806r0 = 1;
            obj = storage.set(str, str2, biometricsStorageData, bVar);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) obj);
        return Unit.INSTANCE;
    }
}
