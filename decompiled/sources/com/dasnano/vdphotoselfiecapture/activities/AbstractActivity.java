package com.dasnano.vdphotoselfiecapture.activities;

import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.veridas.activity.DasActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/activities/AbstractActivity;", "Lcom/veridas/activity/DasActivity;", "Lcom/dasnano/vdphotoselfiecapture/config/VDPhotoSelfieConfiguration;", "Lcom/dasnano/vdphotoselfiecapture/model/VDPhotoSelfieViewModel;", "()V", "getConfigurationClass", "Ljava/lang/Class;", "getViewModelClass", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractActivity extends DasActivity<VDPhotoSelfieConfiguration, VDPhotoSelfieViewModel> {
    @Override // com.veridas.activity.DasActivity
    @NotNull
    public Class<VDPhotoSelfieConfiguration> getConfigurationClass() {
        return VDPhotoSelfieConfiguration.class;
    }

    @Override // com.veridas.activity.DasActivity
    @NotNull
    public Class<VDPhotoSelfieViewModel> getViewModelClass() {
        return VDPhotoSelfieViewModel.class;
    }
}
