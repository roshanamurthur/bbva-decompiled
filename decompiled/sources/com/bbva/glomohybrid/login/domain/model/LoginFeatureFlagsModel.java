package com.bbva.glomohybrid.login.domain.model;

import kotlin.Metadata;

/* JADX INFO: compiled from: LoginFeatureFlagsModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/LoginFeatureFlagsModel;", "", "", "a", "Z", "getForgotPassword", "()Z", "forgotPassword", "<init>", "(Z)V", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LoginFeatureFlagsModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean forgotPassword;

    public LoginFeatureFlagsModel(boolean z10) {
        this.forgotPassword = z10;
    }

    public final boolean getForgotPassword() {
        return this.forgotPassword;
    }

    public LoginFeatureFlagsModel() {
        this(false);
    }
}
