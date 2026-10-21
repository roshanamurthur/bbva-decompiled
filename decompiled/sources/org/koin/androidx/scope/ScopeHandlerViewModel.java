package org.koin.androidx.scope;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ScopeHandlerViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lorg/koin/androidx/scope/ScopeHandlerViewModel;", "Landroidx/lifecycle/ViewModel;", "", "onCleared", "Lorg/koin/core/scope/Scope;", "p0", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "setScope", "(Lorg/koin/core/scope/Scope;)V", "scope", "<init>", "()V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
@SourceDebugExtension({"SMAP\nScopeHandlerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeHandlerViewModel.kt\norg/koin/androidx/scope/ScopeHandlerViewModel\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n*L\n1#1,39:1\n28#2:40\n46#2,2:41\n29#2:43\n*S KotlinDebug\n*F\n+ 1 ScopeHandlerViewModel.kt\norg/koin/androidx/scope/ScopeHandlerViewModel\n*L\n33#1:40\n33#1:41,2\n33#1:43\n*E\n"})
public final class ScopeHandlerViewModel extends ViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Scope scope;

    @Nullable
    public final Scope getScope() {
        return this.scope;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Scope scope = this.scope;
        if (scope != null && scope.isNotClosed()) {
            Logger logger = scope.getLogger();
            String str = "Closing scope " + this.scope;
            Level level = Level.DEBUG;
            if (logger.isAt(level)) {
                logger.display(level, str);
            }
            scope.close();
        }
        this.scope = null;
    }

    public final void setScope(@Nullable Scope scope) {
        this.scope = scope;
    }
}
