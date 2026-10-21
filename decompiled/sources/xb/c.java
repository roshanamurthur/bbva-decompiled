package xb;

import com.bbva.showinfo.model.InfoNativeListModal;
import com.bbva.showinfo.nativemodal.activity.NativeListModalActivity;
import com.bbva.showinfo.nativemodal.modal.NativeListModalConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NativeListModalActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends Lambda implements Function1<InfoNativeListModal, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NativeListModalActivity f94514p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NativeListModalActivity nativeListModalActivity) {
        super(1);
        this.f94514p0 = nativeListModalActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InfoNativeListModal infoNativeListModal) {
        InfoNativeListModal nativeListModal = infoNativeListModal;
        Intrinsics.checkNotNullParameter(nativeListModal, "$this$nativeListModal");
        NativeListModalActivity nativeListModalActivity = this.f94514p0;
        NativeListModalConfiguration nativeListModalConfigurationAccess$getNativeListModalConfig = NativeListModalActivity.access$getNativeListModalConfig(nativeListModalActivity);
        String selected = nativeListModalConfigurationAccess$getNativeListModalConfig != null ? nativeListModalConfigurationAccess$getNativeListModalConfig.getSelected() : null;
        NativeListModalConfiguration nativeListModalConfigurationAccess$getNativeListModalConfig2 = NativeListModalActivity.access$getNativeListModalConfig(nativeListModalActivity);
        nativeListModal.setConfig(new NativeListModalConfiguration(selected, nativeListModalConfigurationAccess$getNativeListModalConfig2 != null ? nativeListModalConfigurationAccess$getNativeListModalConfig2.getValues() : null));
        nativeListModal.setOnActionClickListener(new b(nativeListModalActivity));
        return Unit.INSTANCE;
    }
}
