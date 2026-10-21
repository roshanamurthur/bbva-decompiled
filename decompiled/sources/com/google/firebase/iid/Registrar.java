package com.google.firebase.iid;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import hg.j;
import hg.k;
import hg.l;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@Keep
@KeepForSdk
public final class Registrar implements ComponentRegistrar {

    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    public static class a implements FirebaseInstanceIdInternal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FirebaseInstanceId f48425a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f48425a = firebaseInstanceId;
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public final void addNewTokenListener(FirebaseInstanceIdInternal.NewTokenListener newTokenListener) {
            this.f48425a.f48413h.add(newTokenListener);
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public final void deleteToken(@NonNull String str, @NonNull String str2) throws IOException {
            this.f48425a.deleteToken(str, str2);
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public final String getId() {
            return this.f48425a.getId();
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public final String getToken() {
            return this.f48425a.getToken();
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public final Task<String> getTokenTask() {
            FirebaseInstanceId firebaseInstanceId = this.f48425a;
            String token = firebaseInstanceId.getToken();
            return token != null ? Tasks.forResult(token) : firebaseInstanceId.getInstanceId().continueWith(l.f69441p0);
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(ComponentContainer componentContainer) {
        return new FirebaseInstanceId((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(UserAgentPublisher.class), componentContainer.getProvider(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class));
    }

    public static final /* synthetic */ FirebaseInstanceIdInternal lambda$getComponents$1$Registrar(ComponentContainer componentContainer) {
        return new a((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseInstanceId.class).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optionalProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.optionalProvider((Class<?>) HeartBeatInfo.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).factory(j.f69439a).alwaysEager().build(), Component.builder(FirebaseInstanceIdInternal.class).add(Dependency.required((Class<?>) FirebaseInstanceId.class)).factory(k.f69440a).build(), LibraryVersionComponent.create("fire-iid", BuildConfig.VERSION_NAME));
    }
}
