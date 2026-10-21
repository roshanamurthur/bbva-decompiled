package kotlin.reflect.jvm.internal.impl.load.java.structure;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: javaLoading.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaLoadingKt {
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[RETURN, SYNTHETIC] */
    public static final boolean isObjectMethodInInterface(@NotNull JavaMember javaMember) {
        FqName fqName;
        Intrinsics.checkNotNullParameter(javaMember, "<this>");
        if (javaMember.getContainingClass().isInterface() && (javaMember instanceof JavaMethod)) {
            JavaMethod javaMethod = (JavaMethod) javaMember;
            String strAsString = javaMethod.getName().asString();
            int iHashCode = strAsString.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != -1295482945) {
                    if (iHashCode == 147696667 && strAsString.equals(GenerateActivationFormCommand.HASH_CODE)) {
                        if (javaMethod.getValueParameters().isEmpty()) {
                            return true;
                        }
                    }
                } else if (strAsString.equals("equals")) {
                    JavaValueParameter javaValueParameter = (JavaValueParameter) CollectionsKt___CollectionsKt.singleOrNull((List) javaMethod.getValueParameters());
                    JavaType type = javaValueParameter != null ? javaValueParameter.getType() : null;
                    JavaClassifierType javaClassifierType = type instanceof JavaClassifierType ? (JavaClassifierType) type : null;
                    if (javaClassifierType != null) {
                        JavaClassifier classifier = javaClassifierType.getClassifier();
                        if ((classifier instanceof JavaClass) && (fqName = ((JavaClass) classifier).getFqName()) != null && Intrinsics.areEqual(fqName.asString(), "java.lang.Object")) {
                            return true;
                        }
                    }
                }
            } else if (strAsString.equals("toString")) {
                if (javaMethod.getValueParameters().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
