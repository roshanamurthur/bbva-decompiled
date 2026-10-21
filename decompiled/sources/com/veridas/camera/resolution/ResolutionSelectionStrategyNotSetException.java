package com.veridas.camera.resolution;

import com.veridas.camera.parameter.ParametersBuilderException;

/* JADX INFO: loaded from: classes9.dex */
public class ResolutionSelectionStrategyNotSetException extends ParametersBuilderException {
    public static final String MESSAGE = "No resolution selection strategy not set";

    public ResolutionSelectionStrategyNotSetException() {
        this(MESSAGE);
    }

    public ResolutionSelectionStrategyNotSetException(String str) {
        super(str);
    }
}
