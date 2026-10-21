package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaValueParameter extends JavaAnnotationOwner {
    @Nullable
    Name getName();

    @NotNull
    JavaType getType();

    boolean isVararg();
}
