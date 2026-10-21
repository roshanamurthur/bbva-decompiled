package com.bbva.networkmonitor.component;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkDataProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/networkmonitor/component/NetworkDataProvider;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "", "dispose", "Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;", "networkProvider", "<init>", "(Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;)V", "Companion", "cmp-dp-network_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkDataProvider extends DataManager {

    @NotNull
    public static final String ID = "component-dp-network";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkChangeProvider f35200p0;

    @JvmField
    @NotNull
    public static final ActionSpec<Boolean> ACTION_NETWORK_CHANGE = new ActionSpec<>("network-change");

    /* JADX INFO: compiled from: NetworkDataProvider.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public a(Object obj) {
            super(1, obj, NetworkDataProvider.class, "onNetworkChanged", "onNetworkChanged(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            NetworkDataProvider.access$onNetworkChanged((NetworkDataProvider) this.receiver, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NetworkDataProvider.kt */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public b(Object obj) {
            super(1, obj, NetworkDataProvider.class, "onNetworkChanged", "onNetworkChanged(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            NetworkDataProvider.access$onNetworkChanged((NetworkDataProvider) this.receiver, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public NetworkDataProvider(@NotNull NetworkChangeProvider networkProvider) {
        Intrinsics.checkNotNullParameter(networkProvider, "networkProvider");
        this.f35200p0 = networkProvider;
        networkProvider.attachNetworkListener(new a(this));
    }

    public static final void access$onNetworkChanged(NetworkDataProvider networkDataProvider, boolean z10) {
        networkDataProvider.fire(ACTION_NETWORK_CHANGE, Boolean.valueOf(z10));
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        this.f35200p0.unregisterListener(new b(this));
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }
}
