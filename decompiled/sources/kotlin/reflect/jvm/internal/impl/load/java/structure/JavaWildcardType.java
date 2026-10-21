package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: javaTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaWildcardType extends JavaType {
    @Nullable
    JavaType getBound();

    boolean isExtends();
}
