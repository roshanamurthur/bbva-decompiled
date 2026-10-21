package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements CameraFilter {
    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        return CameraFilters.lambda$static$0(list);
    }

    @Override // androidx.camera.core.CameraFilter
    public final /* synthetic */ Identifier getIdentifier() {
        return androidx.camera.core.e.a(this);
    }
}
