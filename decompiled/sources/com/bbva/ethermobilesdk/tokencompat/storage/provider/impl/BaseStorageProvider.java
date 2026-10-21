package com.bbva.ethermobilesdk.tokencompat.storage.provider.impl;

import android.content.Context;
import com.bbva.ethermobilesdk.token.local.storage.TokenLocalStorage;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage;
import com.bbva.ethermobilesdk.tokencompat.storage.provider.StorageProvider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BaseStorageProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/impl/BaseStorageProvider;", "Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/StorageProvider;", "Lcom/bbva/ethermobilesdk/token/local/storage/TokenLocalStorage;", "a", "Lkotlin/Lazy;", "getTempStorage", "()Lcom/bbva/ethermobilesdk/token/local/storage/TokenLocalStorage;", "tempStorage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public abstract class BaseStorageProvider implements StorageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy tempStorage;

    /* JADX INFO: compiled from: BaseStorageProvider.kt */
    public static final class a extends Lambda implements Function0<TokenLocalStorage> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f30655p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f30655p0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TokenLocalStorage invoke() {
            return new TokenLocalStorage(this.f30655p0, TokenCompatStorage.LOCAL_STORAGE_SCOPE);
        }
    }

    public BaseStorageProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.tempStorage = LazyKt__LazyJVMKt.lazy(new a(context));
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.provider.StorageProvider
    @NotNull
    public TokenLocalStorage getTempStorage() {
        return (TokenLocalStorage) this.tempStorage.getValue();
    }
}
