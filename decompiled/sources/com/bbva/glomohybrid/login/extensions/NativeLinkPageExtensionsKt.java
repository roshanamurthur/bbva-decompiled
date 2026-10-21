package com.bbva.glomohybrid.login.extensions;

import com.bbva.glomohybrid.login.domain.model.NativeLinkPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeLinkPageExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"hasValidRoute", "", "Lcom/bbva/glomohybrid/login/domain/model/NativeLinkPage;", "Login_mexicoGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NativeLinkPageExtensionsKt {
    public static final boolean hasValidRoute(@NotNull NativeLinkPage nativeLinkPage) {
        Intrinsics.checkNotNullParameter(nativeLinkPage, "<this>");
        String route = nativeLinkPage.getRoute();
        return !(route == null || route.length() == 0);
    }
}
