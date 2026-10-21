package com.bbva.ethermobilesdk.sharedstorage.provider;

import android.content.Context;
import androidx.camera.core.impl.utils.c;
import com.bbva.localstorage.storage.EncryptedSharedPreferencesStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncryptedInternalProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/provider/EncryptedInternalProvider;", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/AbstractSharedPreferencesProvider;", "context", "Landroid/content/Context;", "group", "", "scope", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EncryptedInternalProvider extends AbstractSharedPreferencesProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedInternalProvider(@NotNull Context context, @NotNull String group, @NotNull String scope) {
        super(group, new EncryptedSharedPreferencesStorage(context, c.a("com.bbva.ethermobilesdk.sharedstorage.internal.file.encrypt.", group, Constant.DOT_STRING, scope), true, false, 8, null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(scope, "scope");
    }
}
