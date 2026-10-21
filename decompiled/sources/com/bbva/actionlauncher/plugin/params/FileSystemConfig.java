package com.bbva.actionlauncher.plugin.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/actionlauncher/plugin/params/FileSystemConfig;", "", "targetPath", "", "authorities", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthorities", "()Ljava/lang/String;", "getTargetPath", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FileSystemConfig {

    @NotNull
    private final String authorities;

    @NotNull
    private final String targetPath;

    public FileSystemConfig(@NotNull String targetPath, @NotNull String authorities) {
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        Intrinsics.checkNotNullParameter(authorities, "authorities");
        this.targetPath = targetPath;
        this.authorities = authorities;
    }

    public static /* synthetic */ FileSystemConfig copy$default(FileSystemConfig fileSystemConfig, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fileSystemConfig.targetPath;
        }
        if ((i10 & 2) != 0) {
            str2 = fileSystemConfig.authorities;
        }
        return fileSystemConfig.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTargetPath() {
        return this.targetPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorities() {
        return this.authorities;
    }

    @NotNull
    public final FileSystemConfig copy(@NotNull String targetPath, @NotNull String authorities) {
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        Intrinsics.checkNotNullParameter(authorities, "authorities");
        return new FileSystemConfig(targetPath, authorities);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileSystemConfig)) {
            return false;
        }
        FileSystemConfig fileSystemConfig = (FileSystemConfig) other;
        return Intrinsics.areEqual(this.targetPath, fileSystemConfig.targetPath) && Intrinsics.areEqual(this.authorities, fileSystemConfig.authorities);
    }

    @NotNull
    public final String getAuthorities() {
        return this.authorities;
    }

    @NotNull
    public final String getTargetPath() {
        return this.targetPath;
    }

    public int hashCode() {
        return this.authorities.hashCode() + (this.targetPath.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("FileSystemConfig(targetPath=", this.targetPath, ", authorities=", this.authorities, ")");
    }
}
