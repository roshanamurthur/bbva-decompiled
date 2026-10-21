package org.junit.validator;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class AnnotationValidatorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<ValidateWith, AnnotationValidator> f92068a = new ConcurrentHashMap<>();

    public AnnotationValidator createAnnotationValidator(ValidateWith validateWith) {
        ConcurrentHashMap<ValidateWith, AnnotationValidator> concurrentHashMap = f92068a;
        AnnotationValidator annotationValidator = concurrentHashMap.get(validateWith);
        if (annotationValidator != null) {
            return annotationValidator;
        }
        Class<? extends AnnotationValidator> clsValue = validateWith.value();
        try {
            concurrentHashMap.putIfAbsent(validateWith, clsValue.newInstance());
            return concurrentHashMap.get(validateWith);
        } catch (Exception e5) {
            throw new RuntimeException("Exception received when creating AnnotationValidator class ".concat(clsValue.getName()), e5);
        }
    }
}
