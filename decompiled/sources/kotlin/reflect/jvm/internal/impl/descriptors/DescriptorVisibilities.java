package kotlin.reflect.jvm.internal.impl.descriptors;

import bk.w;
import com.noknok.android.client.utils.UIConfigTags;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class DescriptorVisibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final DescriptorVisibility DEFAULT_VISIBILITY;

    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED;

    @NotNull
    public static final DescriptorVisibility INHERITED;

    @NotNull
    public static final DescriptorVisibility INTERNAL;

    @NotNull
    public static final DescriptorVisibility INVISIBLE_FAKE;
    public static final Set<DescriptorVisibility> INVISIBLE_FROM_OTHER_MODULES;

    @NotNull
    public static final DescriptorVisibility LOCAL;

    @NotNull
    public static final DescriptorVisibility PRIVATE;

    @NotNull
    public static final DescriptorVisibility PRIVATE_TO_THIS;

    @NotNull
    public static final DescriptorVisibility PROTECTED;

    @NotNull
    public static final DescriptorVisibility PUBLIC;

    @NotNull
    public static final DescriptorVisibility UNKNOWN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<DescriptorVisibility, Integer> f80198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f80199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ModuleVisibilityHelper f80200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final HashMap f80201d;

    public static class a implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class b implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class c implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class d extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == 0) {
                a(1);
                throw null;
            }
            if (declarationDescriptor == null) {
                a(2);
                throw null;
            }
            if (DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility)) {
                if (declarationDescriptor == null) {
                    a(0);
                    throw null;
                }
                if (DescriptorUtils.getContainingSourceFile(declarationDescriptor) != SourceFile.NO_SOURCE_FILE) {
                    return DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
                }
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ClassifierDescriptorWithTypeParameters containingDeclaration = ((ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                if (z10 && DescriptorUtils.isSealedClass(containingDeclaration) && DescriptorUtils.isTopLevelDeclaration(containingDeclaration) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration()) && DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor)) {
                    return true;
                }
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                    break;
                }
            }
            if (declarationDescriptorWithVisibility == 0) {
                return false;
            }
            while (declarationDescriptor != null) {
                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                    return true;
                }
                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                    return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) declarationDescriptorWithVisibility).getFqName().equals(((PackageFragmentDescriptor) declarationDescriptor).getFqName()) && DescriptorUtils.areInSameModule(declarationDescriptor, declarationDescriptorWithVisibility);
                }
                declarationDescriptor = declarationDescriptor.getContainingDeclaration();
            }
            return false;
        }
    }

    public static class e extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z10) {
            DeclarationDescriptor parentOfType;
            if (declarationDescriptorWithVisibility == null) {
                a(0);
                throw null;
            }
            if (declarationDescriptor == null) {
                a(1);
                throw null;
            }
            if (DescriptorVisibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z10)) {
                if (receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                    return true;
                }
                if (receiverValue != DescriptorVisibilities.f80199b && (parentOfType = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class)) != null && (receiverValue instanceof ThisClassReceiver)) {
                    return ((ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
                }
            }
            return false;
        }
    }

    public static class f extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(r0) == false) goto L50;
         */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean isVisible(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r9, boolean r10) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                if (r8 == 0) goto L8e
                r2 = 1
                if (r9 == 0) goto L8a
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r4 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(r8, r3)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r4
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r9 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(r9, r3, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r9 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r9
                if (r9 != 0) goto L18
                return r1
            L18:
                if (r4 == 0) goto L2f
                boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(r4)
                if (r5 == 0) goto L2f
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r4 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(r4, r3)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r4
                if (r4 == 0) goto L2f
                boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubclass(r9, r4)
                if (r4 == 0) goto L2f
                return r2
            L2f:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility r4 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(r8)
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(r4, r3)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
                if (r3 != 0) goto L3c
                return r1
            L3c:
                boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubclass(r9, r3)
                if (r1 == 0) goto L81
                if (r4 == 0) goto L7c
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r0 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.FALSE_IF_PROTECTED
                if (r7 != r0) goto L49
                goto L81
            L49:
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r0 != 0) goto L4e
                goto L7b
            L4e:
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
                if (r0 == 0) goto L53
                goto L7b
            L53:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r0 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER
                if (r7 != r0) goto L58
                goto L7b
            L58:
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.f80199b
                if (r7 == r0) goto L81
                if (r7 != 0) goto L5f
                goto L81
            L5f:
                boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue
                if (r0 == 0) goto L6b
                r0 = r7
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue) r0
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getThisType()
                goto L6f
            L6b:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r7.getType()
            L6f:
                boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubtypeOfClass(r0, r9)
                if (r1 != 0) goto L7b
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(r0)
                if (r0 == 0) goto L81
            L7b:
                return r2
            L7c:
                r7 = 2
                a(r7)
                throw r0
            L81:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r9 = r9.getContainingDeclaration()
                boolean r7 = r6.isVisible(r7, r8, r9, r10)
                return r7
            L8a:
                a(r2)
                throw r0
            L8e:
                a(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.f.isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, boolean):boolean");
        }
    }

    public static class g extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
                throw null;
            }
            if (declarationDescriptor == null) {
                a(1);
                throw null;
            }
            if (DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                return DescriptorVisibilities.f80200c.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            return false;
        }
    }

    public static class h extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
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
                return true;
            }
            a(1);
            throw null;
        }
    }

    public static class i extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
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
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
            a(1);
            throw null;
        }
    }

    public static class j extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
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
                throw new IllegalStateException("Visibility is unknown yet");
            }
            a(1);
            throw null;
        }
    }

    public static class k extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
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
                return false;
            }
            a(1);
            throw null;
        }
    }

    public static class l extends DelegatedDescriptorVisibility {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
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
                return false;
            }
            a(1);
            throw null;
        }
    }

    static {
        d dVar = new d(Visibilities.Private.INSTANCE);
        PRIVATE = dVar;
        e eVar = new e(Visibilities.PrivateToThis.INSTANCE);
        PRIVATE_TO_THIS = eVar;
        f fVar = new f(Visibilities.Protected.INSTANCE);
        PROTECTED = fVar;
        g gVar = new g(Visibilities.Internal.INSTANCE);
        INTERNAL = gVar;
        h hVar = new h(Visibilities.Public.INSTANCE);
        PUBLIC = hVar;
        i iVar = new i(Visibilities.Local.INSTANCE);
        LOCAL = iVar;
        j jVar = new j(Visibilities.Inherited.INSTANCE);
        INHERITED = jVar;
        k kVar = new k(Visibilities.InvisibleFake.INSTANCE);
        INVISIBLE_FAKE = kVar;
        l lVar = new l(Visibilities.Unknown.INSTANCE);
        UNKNOWN = lVar;
        INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(w.setOf((Object[]) new DescriptorVisibility[]{dVar, eVar, gVar, iVar}));
        HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        mapNewHashMapWithExpectedSize.put(eVar, 0);
        mapNewHashMapWithExpectedSize.put(dVar, 0);
        mapNewHashMapWithExpectedSize.put(gVar, 1);
        mapNewHashMapWithExpectedSize.put(fVar, 1);
        mapNewHashMapWithExpectedSize.put(hVar, 2);
        f80198a = Collections.unmodifiableMap(mapNewHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = hVar;
        f80199b = new a();
        ALWAYS_SUITABLE_RECEIVER = new b();
        FALSE_IF_PROTECTED = new c();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f80200c = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.INSTANCE;
        f80201d = new HashMap();
        b(dVar);
        b(eVar);
        b(fVar);
        b(gVar);
        b(hVar);
        b(iVar);
        b(jVar);
        b(kVar);
        b(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = UIConfigTags.TAG_SECOND;
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static void b(DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        f80201d.put(delegatedDescriptorVisibility.getDelegate(), delegatedDescriptorVisibility);
    }

    @Nullable
    public static Integer compare(@NotNull DescriptorVisibility descriptorVisibility, @NotNull DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            a(12);
            throw null;
        }
        if (descriptorVisibility2 == null) {
            a(13);
            throw null;
        }
        Integer numCompareTo = descriptorVisibility.compareTo(descriptorVisibility2);
        if (numCompareTo != null) {
            return numCompareTo;
        }
        Integer numCompareTo2 = descriptorVisibility2.compareTo(descriptorVisibility);
        if (numCompareTo2 != null) {
            return Integer.valueOf(-numCompareTo2.intValue());
        }
        return null;
    }

    @Nullable
    public static DeclarationDescriptorWithVisibility findInvisibleMember(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z10) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityFindInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            a(8);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(9);
            throw null;
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z10)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityFindInvisibleMember = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor, z10)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityFindInvisibleMember;
    }

    public static boolean inSameFile(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            a(6);
            throw null;
        }
        if (declarationDescriptor2 == null) {
            a(7);
            throw null;
        }
        SourceFile containingSourceFile = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static boolean isPrivate(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            return descriptorVisibility == PRIVATE || descriptorVisibility == PRIVATE_TO_THIS;
        }
        a(14);
        throw null;
    }

    public static boolean isVisibleIgnoringReceiver(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z10) {
        if (declarationDescriptorWithVisibility == null) {
            a(2);
            throw null;
        }
        if (declarationDescriptor != null) {
            return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor, z10) == null;
        }
        a(3);
        throw null;
    }

    @NotNull
    public static DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility) {
        if (visibility == null) {
            a(15);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f80201d.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}
