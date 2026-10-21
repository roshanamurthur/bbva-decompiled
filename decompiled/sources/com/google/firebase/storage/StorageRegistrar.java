package com.google.firebase.storage;

import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    Qualified<Executor> blockingExecutor = Qualified.qualified(Blocking.class, Executor.class);
    Qualified<Executor> uiExecutor = Qualified.qualified(UiThread.class, Executor.class);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c lambda$getComponents$0(ComponentContainer componentContainer) {
        return new c((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(InternalAuthProvider.class), componentContainer.getProvider(InteropAppCheckTokenProvider.class), (Executor) componentContainer.get(this.blockingExecutor), (Executor) componentContainer.get(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(c.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.required(this.blockingExecutor)).add(Dependency.required(this.uiExecutor)).add(Dependency.optionalProvider((Class<?>) InternalAuthProvider.class)).add(Dependency.optionalProvider((Class<?>) InteropAppCheckTokenProvider.class)).factory(new ComponentFactory() { // from class: com.google.firebase.storage.j
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return this.f49143a.lambda$getComponents$0(componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
