package org.junit.internal.runners.model;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class MultipleFailureException extends org.junit.runners.model.MultipleFailureException {
    public MultipleFailureException(List<Throwable> list) {
        super(list);
    }
}
