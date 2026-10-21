package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: annotationArguments.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaArrayAnnotationArgument extends JavaAnnotationArgument {
    @NotNull
    List<JavaAnnotationArgument> getElements();
}
