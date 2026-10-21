package com.bbva.showinfo.snackbar;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnackbarDurationMapper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/showinfo/snackbar/SnackbarDurationMapper;", "", "()V", "mapDuration", "", "value", "(Ljava/lang/Integer;)I", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnackbarDurationMapper {

    @NotNull
    public static final SnackbarDurationMapper INSTANCE = new SnackbarDurationMapper();

    public final int mapDuration(@Nullable Integer value) {
        if (value != null && value.intValue() == -1) {
            return -2;
        }
        if (value == null) {
            return -1;
        }
        return value.intValue();
    }
}
