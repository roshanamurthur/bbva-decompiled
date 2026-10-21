package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> list, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    generateArrangements(list, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i10) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    @NonNull
    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean isSupported(@NonNull List<SurfaceConfig> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.mSurfaceConfigList.size()) {
            return false;
        }
        for (int[] iArr : getElementsArrangements(this.mSurfaceConfigList.size())) {
            boolean zIsSupported = true;
            for (int i10 = 0; i10 < this.mSurfaceConfigList.size() && (iArr[i10] >= list.size() || ((zIsSupported = zIsSupported & this.mSurfaceConfigList.get(i10).isSupported(list.get(iArr[i10]))))); i10++) {
            }
            if (zIsSupported) {
                return true;
            }
        }
        return false;
    }

    public boolean removeSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
