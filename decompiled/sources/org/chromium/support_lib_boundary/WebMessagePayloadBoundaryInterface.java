package org.chromium.support_lib_boundary;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes13.dex */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebMessagePayloadType {
        public static final int TYPE_STRING = 0;
    }

    @Nullable
    String getAsString();

    int getType();
}
