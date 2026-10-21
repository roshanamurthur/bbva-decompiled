package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface SignaturePropagator {
    public static final SignaturePropagator DO_NOTHING = new a();

    public static class PropagatedSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KotlinType f80590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KotlinType f80591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<ValueParameterDescriptor> f80592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<TypeParameterDescriptor> f80593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f80594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f80595f;

        public PropagatedSignature(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2, @NotNull List<String> list3, boolean z10) {
            if (kotlinType == null) {
                a(0);
                throw null;
            }
            if (list == null) {
                a(1);
                throw null;
            }
            if (list2 == null) {
                a(2);
                throw null;
            }
            if (list3 == null) {
                a(3);
                throw null;
            }
            this.f80590a = kotlinType;
            this.f80591b = kotlinType2;
            this.f80592c = list;
            this.f80593d = list2;
            this.f80594e = list3;
            this.f80595f = z10;
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @NotNull
        public List<String> getErrors() {
            List<String> list = this.f80594e;
            if (list != null) {
                return list;
            }
            a(7);
            throw null;
        }

        @Nullable
        public KotlinType getReceiverType() {
            return this.f80591b;
        }

        @NotNull
        public KotlinType getReturnType() {
            KotlinType kotlinType = this.f80590a;
            if (kotlinType != null) {
                return kotlinType;
            }
            a(4);
            throw null;
        }

        @NotNull
        public List<TypeParameterDescriptor> getTypeParameters() {
            List<TypeParameterDescriptor> list = this.f80593d;
            if (list != null) {
                return list;
            }
            a(6);
            throw null;
        }

        @NotNull
        public List<ValueParameterDescriptor> getValueParameters() {
            List<ValueParameterDescriptor> list = this.f80592c;
            if (list != null) {
                return list;
            }
            a(5);
            throw null;
        }

        public boolean hasStableParameterNames() {
            return this.f80595f;
        }
    }

    public static class a implements SignaturePropagator {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public void reportSignatureErrors(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull List<String> list) {
            if (callableMemberDescriptor == null) {
                a(5);
                throw null;
            }
            if (list != null) {
                throw new UnsupportedOperationException("Should not be called");
            }
            a(6);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        @NotNull
        public PropagatedSignature resolvePropagatedSignature(@NotNull JavaMethod javaMethod, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2) {
            if (javaMethod == null) {
                a(0);
                throw null;
            }
            if (classDescriptor == null) {
                a(1);
                throw null;
            }
            if (kotlinType == null) {
                a(2);
                throw null;
            }
            if (list == null) {
                a(3);
                throw null;
            }
            if (list2 != null) {
                return new PropagatedSignature(kotlinType, kotlinType2, list, list2, Collections.emptyList(), false);
            }
            a(4);
            throw null;
        }
    }

    void reportSignatureErrors(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull List<String> list);

    @NotNull
    PropagatedSignature resolvePropagatedSignature(@NotNull JavaMethod javaMethod, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2);
}
