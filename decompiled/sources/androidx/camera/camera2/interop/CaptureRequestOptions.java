package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;
import androidx.camera.core.impl.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@ExperimentalCamera2Interop
public class CaptureRequestOptions implements ReadableConfig {
    private final Config mConfig;

    @RequiresApi(21)
    public static final class Builder implements ExtendableBuilder<CaptureRequestOptions> {
        private final MutableOptionsBundle mMutableOptionsBundle = MutableOptionsBundle.create();

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Builder from(@NonNull Config config) {
            Builder builder = new Builder();
            config.findOptions(Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM, new i(builder, config));
            return builder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$from$0(Builder builder, Config config, Config.Option option) {
            builder.getMutableConfig().insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> Builder clearCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key) {
            this.mMutableOptionsBundle.removeOption(Camera2ImplConfig.createCaptureRequestOption(key));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> Builder setCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(Camera2ImplConfig.createCaptureRequestOption(key), valuet);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        public CaptureRequestOptions build() {
            return new CaptureRequestOptions(OptionsBundle.from(this.mMutableOptionsBundle));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public CaptureRequestOptions(@NonNull Config config) {
        this.mConfig = config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ boolean containsOption(Config.Option option) {
        return e0.a(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        e0.b(this, str, optionMatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public <ValueT> ValueT getCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key) {
        return (ValueT) this.mConfig.retrieveOption(Camera2ImplConfig.createCaptureRequestOption(key), null);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Config getConfig() {
        return this.mConfig;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return e0.c(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Set getPriorities(Config.Option option) {
        return e0.d(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Set listOptions() {
        return e0.e(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(Config.Option option) {
        return e0.f(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return e0.h(this, option, optionPriority);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return e0.g(this, option, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public <ValueT> ValueT getCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key, @Nullable ValueT valuet) {
        return (ValueT) this.mConfig.retrieveOption(Camera2ImplConfig.createCaptureRequestOption(key), valuet);
    }
}
