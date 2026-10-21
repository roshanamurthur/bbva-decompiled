package kn;

import java.lang.annotation.Annotation;
import org.junit.runners.model.FrameworkMember;

/* JADX INFO: compiled from: ValidationError.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends Exception {
    public a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", cls.getSimpleName(), frameworkMember.getName(), str));
    }
}
