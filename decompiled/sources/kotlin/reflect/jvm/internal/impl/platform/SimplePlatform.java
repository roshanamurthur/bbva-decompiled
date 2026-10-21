package kotlin.reflect.jvm.internal.impl.platform;

import androidx.camera.core.impl.utils.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TargetPlatform.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class SimplePlatform {
    @NotNull
    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    @NotNull
    public TargetPlatformVersion getTargetPlatformVersion() {
        return null;
    }

    @NotNull
    public String toString() {
        String targetName = getTargetName();
        if (targetName.length() > 0) {
            return a.a("null (", targetName, RootService.CLOSE_BRACKET);
        }
        return null;
    }
}
