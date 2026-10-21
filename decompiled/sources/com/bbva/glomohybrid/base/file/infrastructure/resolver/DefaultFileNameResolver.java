package com.bbva.glomohybrid.base.file.infrastructure.resolver;

import android.content.Context;
import bk.q;
import com.bbva.glomohybrid.base.file.infrastructure.FileActions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultFileNameResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/base/file/infrastructure/resolver/DefaultFileNameResolver;", "Lcom/bbva/glomohybrid/base/file/infrastructure/resolver/FileNameResolver;", "Lcom/bbva/glomohybrid/base/file/infrastructure/FileActions;", "fileActions", "", "getName", "Landroid/content/Context;", "context", "", "", "mapping", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultFileNameResolver implements FileNameResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f31348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<FileActions, Integer> f31349b;

    public DefaultFileNameResolver(@NotNull Context context, @NotNull Map<FileActions, Integer> mapping) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        this.f31348a = context;
        this.f31349b = mapping;
    }

    @Override // com.bbva.glomohybrid.base.file.infrastructure.resolver.FileNameResolver
    @NotNull
    public String getName(@NotNull FileActions fileActions) {
        Intrinsics.checkNotNullParameter(fileActions, "fileActions");
        Map<FileActions, Integer> map = this.f31349b;
        boolean zContainsKey = map.containsKey(fileActions);
        if (!zContainsKey) {
            if (zContainsKey) {
                throw new NoWhenBranchMatchedException();
            }
            return fileActions.getFileName();
        }
        String string = this.f31348a.getString(((Number) q.getValue(map, fileActions)).intValue());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
