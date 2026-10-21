package androidx.camera.core.impl;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements UseCaseAttachState.AttachStateFilter {
    @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
    public final boolean filter(UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        return useCaseAttachInfo.getAttached();
    }
}
