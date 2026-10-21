package org.koin.android.scope;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AndroidScopeComponent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lorg/koin/android/scope/AndroidScopeComponent;", "", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "onCloseScope", "", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AndroidScopeComponent {
    @NotNull
    Scope getScope();

    void onCloseScope();

    /* JADX INFO: compiled from: AndroidScopeComponent.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onCloseScope(@NotNull AndroidScopeComponent androidScopeComponent) {
        }
    }
}
