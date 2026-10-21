package com.veridas.camera.parameter;

/* JADX INFO: loaded from: classes9.dex */
public interface ParameterNameTranslator {
    Object translate(Parameter.AntiBandingMode antiBandingMode);

    Object translate(Parameter.ColorEffectMode colorEffectMode);

    Object translate(Parameter.FlashMode flashMode);

    Object translate(Parameter.FocusMode focusMode);

    Object translate(Parameter.SceneMode sceneMode);

    Object translate(Parameter.WhiteBalanceMode whiteBalanceMode);

    Object translate(Class<?> cls, String str);
}
