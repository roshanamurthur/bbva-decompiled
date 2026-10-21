package com.salesforce.marketingcloud.registration;

import androidx.annotation.Size;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J.\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H&J$\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/salesforce/marketingcloud/registration/c;", "", "", "contactKey", "", "notifyModules", "Lcom/salesforce/marketingcloud/registration/RegistrationManager$Editor;", "a", "key", "value", "", k.a.f65041h, "sdk_release"}, k = 1, mv = {1, 8, 0})
public interface c {
    @NotNull
    RegistrationManager.Editor a(@NotNull String key, @NotNull String value, boolean notifyModules);

    @NotNull
    RegistrationManager.Editor a(@Size(min = 1) @NotNull String contactKey, @NotNull Map<String, String> attributes, boolean notifyModules);

    @NotNull
    RegistrationManager.Editor a(@Size(min = 1) @NotNull String contactKey, boolean notifyModules);

    @NotNull
    RegistrationManager.Editor a(@NotNull Map<String, String> attributes, boolean notifyModules);
}
