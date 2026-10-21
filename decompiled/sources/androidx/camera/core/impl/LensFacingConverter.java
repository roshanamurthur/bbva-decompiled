package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class LensFacingConverter {
    private LensFacingConverter() {
    }

    @NonNull
    public static String nameOf(int i10) {
        if (i10 == 0) {
            return "FRONT";
        }
        if (i10 == 1) {
            return "BACK";
        }
        throw new IllegalArgumentException(androidx.appcompat.widget.g0.c("Unknown lens facing ", i10));
    }

    public static int valueOf(@Nullable String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        if (str.equals("BACK")) {
            return 1;
        }
        if (str.equals("FRONT")) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown len facing name ".concat(str));
    }

    @NonNull
    public static Integer[] values() {
        return new Integer[]{0, 1};
    }
}
