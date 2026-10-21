package com.bbva.softtokenbase.presentation.delegate;

import androidx.camera.core.impl.utils.c;
import com.bbva.component.ui.biometrics.BiometricResult;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.softtokenbase.constants.SoftTokenActionConstants;
import com.bbva.softtokenbase.usecase.IsSoftTokenBiometricActiveUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: SoftTokenDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/softtokenbase/presentation/delegate/DefaultSoftTokenDelegate;", "Lcom/bbva/softtokenbase/presentation/delegate/SoftTokenDelegate;", "", "handleAuthentication", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "", "componentId", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Ljava/lang/String;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSoftTokenDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoftTokenDelegate.kt\ncom/bbva/softtokenbase/presentation/delegate/DefaultSoftTokenDelegate\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,31:1\n41#2,6:32\n47#2:39\n133#3:38\n107#4:40\n*S KotlinDebug\n*F\n+ 1 SoftTokenDelegate.kt\ncom/bbva/softtokenbase/presentation/delegate/DefaultSoftTokenDelegate\n*L\n21#1:32,6\n21#1:39\n21#1:38\n21#1:40\n*E\n"})
public final class DefaultSoftTokenDelegate implements SoftTokenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f36889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IsSoftTokenBiometricActiveUseCase f36890b;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSoftTokenDelegate(@NotNull ViewModelComponentsProviders provider, @NotNull String componentId) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.f36889a = componentId;
        this.f36890b = (IsSoftTokenBiometricActiveUseCase) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : c.f(provider)).get(Reflection.getOrCreateKotlinClass(IsSoftTokenBiometricActiveUseCase.class), null, null);
    }

    @Override // com.bbva.softtokenbase.presentation.delegate.SoftTokenDelegate
    public void handleAuthentication() {
        boolean zBooleanValue = this.f36890b.execute().booleanValue();
        String str = this.f36889a;
        if (zBooleanValue) {
            CellsReactor.fire(str, SoftTokenActionConstants.INSTANCE.getAUTHENTICATE(), null);
        } else {
            if (zBooleanValue) {
                return;
            }
            CellsReactor.fire(str, BiometricsComponent.INSTANCE.getON_AUTHENTICATION(), BiometricResult.Success.INSTANCE);
        }
    }
}
