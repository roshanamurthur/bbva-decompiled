package org.junit.internal.runners.model;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ReflectiveCallable {
    public Object run() throws Throwable {
        try {
            return runReflectiveCall();
        } catch (InvocationTargetException e5) {
            throw e5.getTargetException();
        }
    }

    public abstract Object runReflectiveCall() throws Throwable;
}
