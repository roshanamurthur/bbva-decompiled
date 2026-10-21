package com.bbva.glomohybrid.login.data;

import kotlin.Metadata;

/* JADX INFO: compiled from: LoginFailureCounterDataStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/login/data/LoginFailureCounterDataStore;", "", "allowCountFailuresLogin", "", "attempts", "", "increment", "", "reset", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LoginFailureCounterDataStore {
    boolean allowCountFailuresLogin();

    int attempts();

    void increment();

    void reset();
}
