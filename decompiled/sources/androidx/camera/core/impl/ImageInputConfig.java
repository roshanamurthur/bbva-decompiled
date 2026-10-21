package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface ImageInputConfig extends ReadableConfig {
    public static final Config.Option<Integer> OPTION_INPUT_FORMAT = Config.Option.create("camerax.core.imageInput.inputFormat", Integer.TYPE);

    int getInputFormat();
}
