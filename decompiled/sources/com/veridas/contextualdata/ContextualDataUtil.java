package com.veridas.contextualdata;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextualDataUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tJ1\u0010\f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f¢\u0006\u0002\u0010\u0010J7\u0010\u0011\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f¢\u0006\u0002\u0010\u0012JD\u0010\u0013\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/veridas/contextualdata/ContextualDataUtil;", "", "()V", "areAllPermissionsGranted", "", "context", "Landroid/content/Context;", "permissions", "", "", "isPermissionGranted", "permission", "requiresPermission", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requiresPermissions", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "suspendableRequiresPermission", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextualDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualDataUtil.kt\ncom/veridas/contextualdata/ContextualDataUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1726#2,3:55\n*S KotlinDebug\n*F\n+ 1 ContextualDataUtil.kt\ncom/veridas/contextualdata/ContextualDataUtil\n*L\n51#1:55,3\n*E\n"})
public final class ContextualDataUtil {

    @NotNull
    public static final ContextualDataUtil INSTANCE = new ContextualDataUtil();

    public final boolean areAllPermissionsGranted(@NotNull Context context, @NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        List<String> list = permissions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!INSTANCE.isPermissionGranted(context, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isPermissionGranted(@NotNull Context context, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    @Nullable
    public final <T> T requiresPermission(@NotNull Context context, @NotNull String permission, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(block, "block");
        if (isPermissionGranted(context, permission)) {
            return block.invoke();
        }
        return null;
    }

    @Nullable
    public final <T> T requiresPermissions(@NotNull Context context, @NotNull List<String> permissions, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(block, "block");
        if (areAllPermissionsGranted(context, permissions)) {
            return block.invoke();
        }
        return null;
    }

    @Nullable
    public final <T> Object suspendableRequiresPermission(@NotNull Context context, @NotNull String str, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        if (isPermissionGranted(context, str)) {
            return function1.invoke(continuation);
        }
        return null;
    }
}
