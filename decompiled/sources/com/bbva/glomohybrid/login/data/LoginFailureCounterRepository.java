package com.bbva.glomohybrid.login.data;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.google.gson.JsonElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginFailureCounterRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/login/data/LoginFailureCounterRepository;", "Lcom/bbva/glomohybrid/login/data/LoginFailureCounterDataStore;", "", "increment", "reset", "", "attempts", "", "allowCountFailuresLogin", "Lcom/bbva/glomo/storage/MainStorage;", "mainStorage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LoginFailureCounterRepository implements LoginFailureCounterDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f33326a;

    public LoginFailureCounterRepository(@NotNull MainStorage mainStorage) {
        Intrinsics.checkNotNullParameter(mainStorage, "mainStorage");
        this.f33326a = mainStorage;
    }

    @Override // com.bbva.glomohybrid.login.data.LoginFailureCounterDataStore
    public boolean allowCountFailuresLogin() {
        JsonElement jsonElement = MainStorage.getJson$default(this.f33326a, "allow_counter_fail_login", true, null, 4, null).get("allow_counter_fail_login");
        if (jsonElement != null) {
            return jsonElement.getAsBoolean();
        }
        return true;
    }

    @Override // com.bbva.glomohybrid.login.data.LoginFailureCounterDataStore
    public int attempts() {
        return MainStorage.getInt$default(this.f33326a, "login_failure_counter", 0, false, null, 12, null);
    }

    @Override // com.bbva.glomohybrid.login.data.LoginFailureCounterDataStore
    public void increment() {
        MainStorage.putInt$default(this.f33326a, "login_failure_counter", attempts() + 1, null, 4, null);
    }

    @Override // com.bbva.glomohybrid.login.data.LoginFailureCounterDataStore
    public void reset() {
        this.f33326a.remove(TargetStorage.Local, "login_failure_counter");
    }
}
