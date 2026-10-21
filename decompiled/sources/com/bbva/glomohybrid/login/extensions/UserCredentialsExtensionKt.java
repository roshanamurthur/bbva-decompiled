package com.bbva.glomohybrid.login.extensions;

import com.bbva.glomohybrid.login.domain.model.UserCredentials;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserCredentialsExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "", "isDummyUser", "", "DUMMY_DEVICE_ID", "Ljava/lang/String;", "Login_mexicoGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class UserCredentialsExtensionKt {

    @NotNull
    public static final String DUMMY_DEVICE_ID = "9B7380F112CB220DB574CDD0FC04C055";

    public static final boolean isDummyUser(@NotNull UserCredentials userCredentials) {
        Intrinsics.checkNotNullParameter(userCredentials, "<this>");
        return Intrinsics.areEqual(userCredentials.getUser(), "5533050065");
    }
}
