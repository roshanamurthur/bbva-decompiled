package kotlin.reflect.jvm.internal.impl.load.java;

import com.noknok.android.client.utils.UIConfigTags;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class JavaDescriptorVisibilities {

    @NotNull
    public static final DescriptorVisibility PACKAGE_VISIBILITY;

    @NotNull
    public static final DescriptorVisibility PROTECTED_AND_PACKAGE;

    @NotNull
    public static final DescriptorVisibility PROTECTED_STATIC_VISIBILITY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashMap f80503a;

    public static class a extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
                throw null;
            }
            if (declarationDescriptor != null) {
                return JavaDescriptorVisibilities.c(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            a(1);
            throw null;
        }
    }

    public static class b extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
                throw null;
            }
            if (declarationDescriptor != null) {
                return JavaDescriptorVisibilities.b(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }
            a(1);
            throw null;
        }
    }

    public static class c extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
                throw null;
            }
            if (declarationDescriptor != null) {
                return JavaDescriptorVisibilities.b(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }
            a(1);
            throw null;
        }
    }

    static {
        a aVar = new a(JavaVisibilities.PackageVisibility.INSTANCE);
        PACKAGE_VISIBILITY = aVar;
        b bVar = new b(JavaVisibilities.ProtectedStaticVisibility.INSTANCE);
        PROTECTED_STATIC_VISIBILITY = bVar;
        c cVar = new c(JavaVisibilities.ProtectedAndPackage.INSTANCE);
        PROTECTED_AND_PACKAGE = cVar;
        HashMap map = new HashMap();
        f80503a = map;
        map.put(aVar.getDelegate(), aVar);
        map.put(bVar.getDelegate(), bVar);
        map.put(cVar.getDelegate(), cVar);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = UIConfigTags.TAG_SECOND;
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            a(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(1);
            throw null;
        }
        if (c(DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    public static boolean c(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            a(2);
            throw null;
        }
        if (declarationDescriptor2 == null) {
            a(3);
            throw null;
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor2, PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) ? false : true;
    }

    @NotNull
    public static DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility) {
        if (visibility == null) {
            a(4);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f80503a.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.toDescriptorVisibility(visibility);
        if (descriptorVisibility2 != null) {
            return descriptorVisibility2;
        }
        a(5);
        throw null;
    }
}
