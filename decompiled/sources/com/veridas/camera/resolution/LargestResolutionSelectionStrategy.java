package com.veridas.camera.resolution;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class LargestResolutionSelectionStrategy implements ResolutionSelectionStrategy {

    public static class a implements Comparator<Resolution> {
        @Override // java.util.Comparator
        public final int compare(Resolution resolution, Resolution resolution2) {
            return resolution2.mp - resolution.mp;
        }
    }

    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    public Resolution select(List<Resolution> list, Resolution resolution) {
        if (list.isEmpty()) {
            return null;
        }
        Collections.sort(list, new a());
        return list.get(0);
    }
}
