package kotlin.reflect.jvm.internal.impl.load.java.sources;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JavaSourceElementFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaSourceElement extends SourceElement {
    @NotNull
    JavaElement getJavaElement();
}
