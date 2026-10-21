package com.bbva.glomohybrid.delegates;

import android.content.Context;
import com.bbva.glomohybrid.base.cells.channels.CellsDynamicFeatureChannels;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.google.android.play.core.ktx.SplitInstallManagerKtxKt;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: GoogleDynamicModulesDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/delegates/GoogleDynamicModulesDelegate;", "Lcom/bbva/glomohybrid/delegates/DefaultDynamicModulesDelegate;", "", "dynamicModule", "", "isDynamicModuleInstalled", "", "installDynamicModule", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGoogleDynamicModulesDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleDynamicModulesDelegate.kt\ncom/bbva/glomohybrid/delegates/GoogleDynamicModulesDelegate\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,44:1\n41#2,6:45\n47#2:52\n133#3:51\n107#4:53\n*S KotlinDebug\n*F\n+ 1 GoogleDynamicModulesDelegate.kt\ncom/bbva/glomohybrid/delegates/GoogleDynamicModulesDelegate\n*L\n15#1:45,6\n15#1:52\n15#1:51\n15#1:53\n*E\n"})
public final class GoogleDynamicModulesDelegate extends DefaultDynamicModulesDelegate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SplitInstallManager f32040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SplitInstallStateUpdatedListener f32041d;

    /* JADX INFO: compiled from: GoogleDynamicModulesDelegate.kt */
    public static final class a extends Lambda implements Function1<SplitInstallSessionState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32042p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            SplitInstallSessionState it = splitInstallSessionState;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: GoogleDynamicModulesDelegate.kt */
    @SourceDebugExtension({"SMAP\nGoogleDynamicModulesDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleDynamicModulesDelegate.kt\ncom/bbva/glomohybrid/delegates/GoogleDynamicModulesDelegate$listener$2\n+ 2 com.google.android.play:feature-delivery-ktx@@2.1.0\ncom/google/android/play/core/ktx/SplitInstallManagerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n85#2:45\n1855#3,2:46\n*S KotlinDebug\n*F\n+ 1 GoogleDynamicModulesDelegate.kt\ncom/bbva/glomohybrid/delegates/GoogleDynamicModulesDelegate$listener$2\n*L\n20#1:45\n20#1:46,2\n*E\n"})
    public static final class b extends Lambda implements Function1<SplitInstallSessionState, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            SplitInstallSessionState it = splitInstallSessionState;
            Intrinsics.checkNotNullParameter(it, "it");
            List<String> listModuleNames = it.moduleNames();
            Intrinsics.checkNotNullExpressionValue(listModuleNames, "moduleNames()");
            Iterator<T> it2 = listModuleNames.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                GoogleDynamicModulesDelegate googleDynamicModulesDelegate = GoogleDynamicModulesDelegate.this;
                if (!zHasNext) {
                    googleDynamicModulesDelegate.notifyEvent(CellsDynamicFeatureChannels.CELLS_DYNAMIC_MODULES_SUCCESS_CHANNEL);
                    return Unit.INSTANCE;
                }
                googleDynamicModulesDelegate.loadDynamicModule((String) it2.next());
            }
        }
    }

    /* JADX INFO: compiled from: GoogleDynamicModulesDelegate.kt */
    public static final class c extends Lambda implements Function1<SplitInstallSessionState, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SplitInstallSessionState splitInstallSessionState) {
            SplitInstallSessionState it = splitInstallSessionState;
            Intrinsics.checkNotNullParameter(it, "it");
            GoogleDynamicModulesDelegate.this.notifyEvent(CellsDynamicFeatureChannels.CELLS_DYNAMIC_MODULES_ERROR_CHANNEL);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoogleDynamicModulesDelegate(@NotNull ViewModelComponentsProviders provider) {
        super(provider);
        Intrinsics.checkNotNullParameter(provider, "provider");
        SplitInstallManager splitInstallManagerCreate = SplitInstallManagerFactory.create((Context) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
        Intrinsics.checkNotNullExpressionValue(splitInstallManagerCreate, "create(...)");
        this.f32040c = splitInstallManagerCreate;
        this.f32041d = SplitInstallManagerKtxKt.SplitInstallStateUpdatedListener(a.f32042p0, new b(), (2040 & 4) != 0 ? SplitInstallManagerKtxKt.b.f46177p0 : new c(), (2040 & 8) != 0 ? SplitInstallManagerKtxKt.c.f46178p0 : null, (2040 & 16) != 0 ? SplitInstallManagerKtxKt.d.f46179p0 : null, (2040 & 32) != 0 ? SplitInstallManagerKtxKt.e.f46180p0 : null, (2040 & 64) != 0 ? SplitInstallManagerKtxKt.f.f46181p0 : null, (2040 & 128) != 0 ? SplitInstallManagerKtxKt.g.f46182p0 : null, (2040 & 256) != 0 ? SplitInstallManagerKtxKt.h.f46183p0 : null, (2040 & 512) != 0 ? SplitInstallManagerKtxKt.i.f46184p0 : null, (2040 & 1024) != 0 ? SplitInstallManagerKtxKt.j.f46185p0 : null);
    }

    @Override // com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate
    public void installDynamicModule(@NotNull String dynamicModule) {
        Intrinsics.checkNotNullParameter(dynamicModule, "dynamicModule");
        SplitInstallRequest splitInstallRequestBuild = SplitInstallRequest.newBuilder().addModule(dynamicModule).build();
        Intrinsics.checkNotNullExpressionValue(splitInstallRequestBuild, "build(...)");
        if (isDynamicModuleInstalled(dynamicModule)) {
            loadDynamicModule(dynamicModule);
            notifyEvent(CellsDynamicFeatureChannels.CELLS_DYNAMIC_MODULES_SUCCESS_CHANNEL);
        } else {
            SplitInstallManager splitInstallManager = this.f32040c;
            splitInstallManager.startInstall(splitInstallRequestBuild);
            splitInstallManager.registerListener(this.f32041d);
        }
    }

    @Override // com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate
    public boolean isDynamicModuleInstalled(@NotNull String dynamicModule) {
        Intrinsics.checkNotNullParameter(dynamicModule, "dynamicModule");
        return this.f32040c.getInstalledModules().contains(dynamicModule);
    }
}
