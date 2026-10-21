package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ShaderProvider {
    public static final ShaderProvider DEFAULT = new ShaderProvider() { // from class: androidx.camera.core.processing.ShaderProvider.1
        @Override // androidx.camera.core.processing.ShaderProvider
        public final /* synthetic */ String createFragmentShader(String str, String str2) {
            return i.a(this, str, str2);
        }
    };

    @Nullable
    String createFragmentShader(@NonNull String str, @NonNull String str2);
}
