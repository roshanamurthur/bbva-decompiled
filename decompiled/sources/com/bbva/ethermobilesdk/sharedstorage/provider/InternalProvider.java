package com.bbva.ethermobilesdk.sharedstorage.provider;

import android.content.Context;
import androidx.camera.core.impl.utils.c;
import com.bbva.localstorage.storage.SharedPreferencesStorage;
import com.bbva.localstorage.storage.Storage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InternalProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/provider/InternalProvider;", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/AbstractSharedPreferencesProvider;", "context", "Landroid/content/Context;", "group", "", "scope", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "shared-storage_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InternalProvider extends AbstractSharedPreferencesProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: InternalProvider.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/provider/InternalProvider$Companion;", "", "()V", "CREATED_KEY", "", "wasCreated", "", "context", "Landroid/content/Context;", "group", "scope", "shared-storage_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean wasCreated(@NotNull Context context, @NotNull String group, @NotNull String scope) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Boolean boolean$default = Storage.DefaultImpls.getBoolean$default(new SharedPreferencesStorage(context, c.a("com.bbva.ethermobilesdk.sharedstorage.internal.file.", group, Constant.DOT_STRING, scope), true, new SharedStorageCipher(context), false, 16, null), "com.bbva.ethermobilesdk.sharedstorage.provider.created", false, false, 4, null);
            if (boolean$default != null) {
                return boolean$default.booleanValue();
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalProvider(@NotNull Context context, @NotNull String group, @NotNull String scope) {
        super(group, new SharedPreferencesStorage(context, c.a("com.bbva.ethermobilesdk.sharedstorage.internal.file.", group, Constant.DOT_STRING, scope), true, new SharedStorageCipher(context), false, 16, null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Storage.DefaultImpls.set$default(getPreferences(), "com.bbva.ethermobilesdk.sharedstorage.provider.created", true, false, 4, (Object) null);
    }
}
