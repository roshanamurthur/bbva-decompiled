package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: javaTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaArrayType extends JavaType {
    @NotNull
    JavaType getComponentType();
}
