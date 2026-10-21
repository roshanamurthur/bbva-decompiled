package com.bbva.glomohybrid.login.presentation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginAnimationObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/LoginAnimationObserver;", "Landroidx/lifecycle/LifecycleObserver;", "", "onAppInBackground", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/LoginViewModel;", "loginViewModel", "<init>", "(Lcom/bbva/glomohybrid/login/presentation/viewmodel/LoginViewModel;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LoginAnimationObserver implements LifecycleObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final LoginViewModel f33475p0;

    public LoginAnimationObserver(@NotNull LoginViewModel loginViewModel) {
        Intrinsics.checkNotNullParameter(loginViewModel, "loginViewModel");
        this.f33475p0 = loginViewModel;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onAppInBackground() {
        this.f33475p0.comesFromBackground(true);
    }
}
