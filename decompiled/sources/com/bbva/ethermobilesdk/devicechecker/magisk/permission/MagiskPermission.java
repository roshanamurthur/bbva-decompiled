package com.bbva.ethermobilesdk.devicechecker.magisk.permission;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MagiskApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskPermission;", ExifInterface.GPS_DIRECTION_TRUE, "", "obtainPermissions", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "deviceApiLevel", "(Ljava/lang/Object;)Ljava/util/HashSet;", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MagiskPermission<T> {
    @NotNull
    HashSet<String> obtainPermissions(T deviceApiLevel);
}
