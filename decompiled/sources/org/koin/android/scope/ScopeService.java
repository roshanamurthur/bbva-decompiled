package org.koin.android.scope;

import android.app.Service;
import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ScopeService.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lorg/koin/android/scope/ScopeService;", "Landroid/app/Service;", "Lorg/koin/android/scope/AndroidScopeComponent;", "", "onCreate", "onDestroy", "Lorg/koin/core/scope/Scope;", "p0", "Lkotlin/Lazy;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "<init>", "()V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScopeService extends Service implements AndroidScopeComponent {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy scope = ServiceExtKt.serviceScope(this);

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return (Scope) this.scope.getValue();
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public void onCloseScope() {
        AndroidScopeComponent.DefaultImpls.onCloseScope(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (getScope() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ServiceExtKt.destroyServiceScope(this);
    }
}
