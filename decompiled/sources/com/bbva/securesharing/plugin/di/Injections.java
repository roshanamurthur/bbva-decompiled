package com.bbva.securesharing.plugin.di;

import android.content.Context;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Injections.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/bbva/securesharing/plugin/di/Injections;", "", "createClient", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "context", "Landroid/content/Context;", "configFilePath", "", "securesharing-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Injections {

    /* JADX INFO: compiled from: Injections.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SecureSharing createClient$default(Injections injections, Context context, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createClient");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return injections.createClient(context, str);
        }
    }

    @NotNull
    SecureSharing createClient(@NotNull Context context, @Nullable String configFilePath);
}
