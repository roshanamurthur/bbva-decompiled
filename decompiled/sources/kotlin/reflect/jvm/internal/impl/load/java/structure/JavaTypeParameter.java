package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaTypeParameter extends JavaClassifier {
    @NotNull
    Collection<JavaClassifierType> getUpperBounds();
}
