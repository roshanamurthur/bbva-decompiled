package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: javaTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaClassifierType extends JavaType {
    @Nullable
    JavaClassifier getClassifier();

    @NotNull
    String getClassifierQualifiedName();

    @NotNull
    String getPresentableText();

    @NotNull
    List<JavaType> getTypeArguments();

    boolean isRaw();
}
