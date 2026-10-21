package com.veridas.misc;

import android.content.res.Resources;
import androidx.camera.core.processing.f;
import com.veridas.log.Log;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AssetsInfo.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/veridas/misc/AssetsInfo;", "", "", "getName", "getFullPath", "Landroid/content/res/Resources;", "resources", "", "exists", "nameOrPath", "<init>", "(Ljava/lang/String;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class AssetsInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f67265b;

    public AssetsInfo(@NotNull String nameOrPath) {
        Intrinsics.checkNotNullParameter(nameOrPath, "nameOrPath");
        if (StringsKt__StringsKt.contains$default((CharSequence) nameOrPath, (CharSequence) AssetsInfoKt.ANDROID_ASSET_URI, false, 2, (Object) null)) {
            this.f67264a = l.replace$default(nameOrPath, AssetsInfoKt.ANDROID_ASSET_URI, "", false, 4, (Object) null);
            this.f67265b = nameOrPath;
        } else {
            this.f67264a = nameOrPath;
            this.f67265b = f.d(AssetsInfoKt.ANDROID_ASSET_URI, nameOrPath);
        }
    }

    public final boolean exists(@NotNull Resources resources) {
        String str = this.f67264a;
        Intrinsics.checkNotNullParameter(resources, "resources");
        try {
            InputStream inputStreamOpen = resources.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            try {
                inputStreamOpen.close();
                return true;
            } catch (IOException e5) {
                Log.e(Reflection.getOrCreateKotlinClass(AssetsInfo.class).getSimpleName(), e5);
                return true;
            }
        } catch (IOException unused) {
            Log.w(Reflection.getOrCreateKotlinClass(AssetsInfo.class).getSimpleName(), "Could not find resource by name \"%s\".", str);
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getFullPath, reason: from getter */
    public final String getF67265b() {
        return this.f67265b;
    }

    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF67264a() {
        return this.f67264a;
    }
}
