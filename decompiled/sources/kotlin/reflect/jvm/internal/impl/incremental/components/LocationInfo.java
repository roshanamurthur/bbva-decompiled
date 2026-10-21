package kotlin.reflect.jvm.internal.impl.incremental.components;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LookupLocation.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface LocationInfo {
    @NotNull
    String getFilePath();

    @NotNull
    Position getPosition();
}
