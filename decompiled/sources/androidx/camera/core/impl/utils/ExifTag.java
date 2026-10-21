package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    public ExifTag(String str, int i10, int i11) {
        this.name = str;
        this.number = i10;
        this.primaryFormat = i11;
        this.secondaryFormat = -1;
    }

    public boolean isFormatCompatible(int i10) {
        int i11;
        int i12 = this.primaryFormat;
        if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.secondaryFormat) == i10) {
            return true;
        }
        if ((i12 == 4 || i11 == 4) && i10 == 3) {
            return true;
        }
        if ((i12 == 9 || i11 == 9) && i10 == 8) {
            return true;
        }
        return (i12 == 12 || i11 == 12) && i10 == 11;
    }

    public ExifTag(String str, int i10, int i11, int i12) {
        this.name = str;
        this.number = i10;
        this.primaryFormat = i11;
        this.secondaryFormat = i12;
    }
}
