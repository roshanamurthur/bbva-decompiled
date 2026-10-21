package com.veridas.camera.resolution;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class LargestCaptureResolutionSelectionStrategy implements CaptureResolutionSelectionStrategy {
    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    public Resolution select(List<Resolution> list, Resolution resolution) {
        return new LargestResolutionSelectionStrategy().select(list, resolution);
    }
}
