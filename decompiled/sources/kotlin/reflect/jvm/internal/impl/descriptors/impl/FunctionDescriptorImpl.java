package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {
    public Modality E0;
    public DescriptorVisibility F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public Collection<? extends FunctionDescriptor> S0;
    public volatile Function0<Collection<FunctionDescriptor>> T0;
    public final FunctionDescriptor U0;
    public final CallableMemberDescriptor.Kind V0;

    @Nullable
    public FunctionDescriptor W0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public List<TypeParameterDescriptor> f80315t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public List<ValueParameterDescriptor> f80316u0;
    protected Map<CallableDescriptor.UserDataKey<?>, Object> userDataMap;
    public KotlinType v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public List<ReceiverParameterDescriptor> f80317w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ReceiverParameterDescriptor f80318x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ReceiverParameterDescriptor f80319y0;

    public class CopyConfiguration implements FunctionDescriptor.CopyBuilder<FunctionDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f80320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<TypeParameterDescriptor> f80321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Annotations f80322c;
        protected boolean copyOverrides;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f80323d;

        @Nullable
        protected ReceiverParameterDescriptor dispatchReceiverParameter;
        protected boolean dropOriginalInContainingParts;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LinkedHashMap f80324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f80325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ FunctionDescriptorImpl f80326g;
        protected boolean justForTypeSubstitution;

        @NotNull
        protected CallableMemberDescriptor.Kind kind;

        @Nullable
        protected Name name;

        @NotNull
        protected List<ReceiverParameterDescriptor> newContextReceiverParameters;

        @Nullable
        protected ReceiverParameterDescriptor newExtensionReceiverParameter;

        @NotNull
        protected Modality newModality;

        @NotNull
        protected DeclarationDescriptor newOwner;

        @NotNull
        protected KotlinType newReturnType;

        @NotNull
        protected List<ValueParameterDescriptor> newValueParameterDescriptors;

        @NotNull
        protected DescriptorVisibility newVisibility;

        @Nullable
        protected FunctionDescriptor original;
        protected boolean preserveSourceElement;
        protected boolean signatureChange;

        @NotNull
        protected TypeSubstitution substitution;

        public CopyConfiguration(@NotNull FunctionDescriptorImpl functionDescriptorImpl, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @NotNull CallableMemberDescriptor.Kind kind, @NotNull List<ValueParameterDescriptor> list, @Nullable List<ReceiverParameterDescriptor> list2, @NotNull ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable KotlinType kotlinType, Name name) {
            if (typeSubstitution == null) {
                a(0);
                throw null;
            }
            if (declarationDescriptor == null) {
                a(1);
                throw null;
            }
            if (modality == null) {
                a(2);
                throw null;
            }
            if (descriptorVisibility == null) {
                a(3);
                throw null;
            }
            if (kind == null) {
                a(4);
                throw null;
            }
            if (list == null) {
                a(5);
                throw null;
            }
            if (list2 == null) {
                a(6);
                throw null;
            }
            if (kotlinType == null) {
                a(7);
                throw null;
            }
            this.f80326g = functionDescriptorImpl;
            this.original = null;
            this.dispatchReceiverParameter = functionDescriptorImpl.f80319y0;
            this.copyOverrides = true;
            this.signatureChange = false;
            this.preserveSourceElement = false;
            this.dropOriginalInContainingParts = false;
            this.f80320a = functionDescriptorImpl.isHiddenToOvercomeSignatureClash();
            this.f80321b = null;
            this.f80322c = null;
            this.f80323d = functionDescriptorImpl.isHiddenForResolutionEverywhereBesideSupercalls();
            this.f80324e = new LinkedHashMap();
            this.f80325f = null;
            this.justForTypeSubstitution = false;
            this.substitution = typeSubstitution;
            this.newOwner = declarationDescriptor;
            this.newModality = modality;
            this.newVisibility = descriptorVisibility;
            this.kind = kind;
            this.newValueParameterDescriptors = list;
            this.newContextReceiverParameters = list2;
            this.newExtensionReceiverParameter = receiverParameterDescriptor;
            this.newReturnType = kotlinType;
            this.name = name;
        }

        public static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @Nullable
        public FunctionDescriptor build() {
            return this.f80326g.doSubstitute(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public <V> FunctionDescriptor.CopyBuilder<FunctionDescriptor> putUserData(@NotNull CallableDescriptor.UserDataKey<V> userDataKey, V v3) {
            if (userDataKey != null) {
                this.f80324e.put(userDataKey, v3);
                return this;
            }
            a(39);
            throw null;
        }

        public CopyConfiguration setHasSynthesizedParameterNames(boolean z10) {
            this.f80325f = Boolean.valueOf(z10);
            return this;
        }

        @NotNull
        public CopyConfiguration setJustForTypeSubstitution(boolean z10) {
            this.justForTypeSubstitution = z10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public /* bridge */ /* synthetic */ FunctionDescriptor.CopyBuilder setTypeParameters(@NotNull List list) {
            return setTypeParameters((List<TypeParameterDescriptor>) list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public /* bridge */ /* synthetic */ FunctionDescriptor.CopyBuilder setValueParameters(@NotNull List list) {
            return setValueParameters((List<ValueParameterDescriptor>) list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setAdditionalAnnotations(@NotNull Annotations annotations) {
            if (annotations != null) {
                this.f80322c = annotations;
                return this;
            }
            a(35);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setCopyOverrides(boolean z10) {
            this.copyOverrides = z10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setDispatchReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.dispatchReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setDropOriginalInContainingParts() {
            this.dropOriginalInContainingParts = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setExtensionReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.newExtensionReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setHiddenForResolutionEverywhereBesideSupercalls() {
            this.f80323d = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setHiddenToOvercomeSignatureClash() {
            this.f80320a = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setKind(@NotNull CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.kind = kind;
                return this;
            }
            a(14);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setModality(@NotNull Modality modality) {
            if (modality != null) {
                this.newModality = modality;
                return this;
            }
            a(10);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setName(@NotNull Name name) {
            if (name != null) {
                this.name = name;
                return this;
            }
            a(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor) {
            this.original = (FunctionDescriptor) callableMemberDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setOwner(@NotNull DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.newOwner = declarationDescriptor;
                return this;
            }
            a(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setPreserveSourceElement() {
            this.preserveSourceElement = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setReturnType(@NotNull KotlinType kotlinType) {
            if (kotlinType != null) {
                this.newReturnType = kotlinType;
                return this;
            }
            a(23);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setSignatureChange() {
            this.signatureChange = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setSubstitution(@NotNull TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.substitution = typeSubstitution;
                return this;
            }
            a(37);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setTypeParameters(@NotNull List<TypeParameterDescriptor> list) {
            if (list != null) {
                this.f80321b = list;
                return this;
            }
            a(21);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setValueParameters(@NotNull List<ValueParameterDescriptor> list) {
            if (list != null) {
                this.newValueParameterDescriptors = list;
                return this;
            }
            a(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        @NotNull
        public CopyConfiguration setVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.newVisibility = descriptorVisibility;
                return this;
            }
            a(12);
            throw null;
        }
    }

    public class a implements Function0<Collection<FunctionDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeSubstitutor f80327p0;

        public a(TypeSubstitutor typeSubstitutor) {
            this.f80327p0 = typeSubstitutor;
        }

        @Override // kotlin.jvm.functions.Function0
        public Collection<FunctionDescriptor> invoke() {
            SmartList smartList = new SmartList();
            Iterator<? extends FunctionDescriptor> it = FunctionDescriptorImpl.this.getOverriddenDescriptors().iterator();
            while (it.hasNext()) {
                smartList.add(it.next().substitute(this.f80327p0));
            }
            return smartList;
        }
    }

    public static class b implements Function0<List<VariableDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List f80329p0;

        public b(List list) {
            this.f80329p0 = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public List<VariableDescriptor> invoke() {
            return this.f80329p0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (declarationDescriptor == null) {
            a(0);
            throw null;
        }
        if (annotations == null) {
            a(1);
            throw null;
        }
        if (name == null) {
            a(2);
            throw null;
        }
        if (kind == null) {
            a(3);
            throw null;
        }
        if (sourceElement == null) {
            a(4);
            throw null;
        }
        this.F0 = DescriptorVisibilities.UNKNOWN;
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        this.J0 = false;
        this.K0 = false;
        this.L0 = false;
        this.M0 = false;
        this.N0 = false;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = true;
        this.R0 = false;
        this.S0 = null;
        this.T0 = null;
        this.W0 = null;
        this.userDataMap = null;
        this.U0 = functionDescriptor == null ? this : functionDescriptor;
        this.V0 = kind;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Nullable
    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, @NotNull List<ValueParameterDescriptor> list, @NotNull TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            a(28);
            throw null;
        }
        if (typeSubstitutor != null) {
            return getSubstitutedValueParameters(functionDescriptor, list, typeSubstitutor, false, false, null);
        }
        a(29);
        throw null;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return declarationDescriptorVisitor.visitFunctionDescriptor(this, d2);
    }

    @NotNull
    public abstract FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement);

    @Nullable
    public FunctionDescriptor doSubstitute(@NotNull CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        KotlinType kotlinTypeSubstitute;
        if (copyConfiguration == null) {
            a(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        Annotations annotationsComposeAnnotations = copyConfiguration.f80322c != null ? AnnotationsKt.composeAnnotations(getAnnotations(), copyConfiguration.f80322c) : getAnnotations();
        DeclarationDescriptor declarationDescriptor = copyConfiguration.newOwner;
        FunctionDescriptor functionDescriptor = copyConfiguration.original;
        CallableMemberDescriptor.Kind kind = copyConfiguration.kind;
        Name name = copyConfiguration.name;
        SourceElement source = copyConfiguration.preserveSourceElement ? (functionDescriptor != null ? functionDescriptor : getOriginal()).getSource() : SourceElement.NO_SOURCE;
        if (source == null) {
            a(27);
            throw null;
        }
        FunctionDescriptorImpl functionDescriptorImplCreateSubstitutedCopy = createSubstitutedCopy(declarationDescriptor, functionDescriptor, kind, name, annotationsComposeAnnotations, source);
        List<TypeParameterDescriptor> typeParameters = copyConfiguration.f80321b;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorSubstituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, copyConfiguration.substitution, functionDescriptorImplCreateSubstitutedCopy, arrayList, zArr);
        if (typeSubstitutorSubstituteTypeParameters == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!copyConfiguration.newContextReceiverParameters.isEmpty()) {
            int i10 = 0;
            for (ReceiverParameterDescriptor receiverParameterDescriptor2 : copyConfiguration.newContextReceiverParameters) {
                KotlinType kotlinTypeSubstitute2 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor2.getType(), Variance.IN_VARIANCE);
                if (kotlinTypeSubstitute2 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(DescriptorFactory.createContextReceiverParameterForCallable(functionDescriptorImplCreateSubstitutedCopy, kotlinTypeSubstitute2, ((ImplicitContextReceiver) receiverParameterDescriptor2.getValue()).getCustomLabelName(), receiverParameterDescriptor2.getAnnotations(), i10));
                zArr[0] = zArr[0] | (kotlinTypeSubstitute2 != receiverParameterDescriptor2.getType());
                i10 = i11;
            }
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = copyConfiguration.newExtensionReceiverParameter;
        if (receiverParameterDescriptor3 != null) {
            KotlinType kotlinTypeSubstitute3 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), Variance.IN_VARIANCE);
            if (kotlinTypeSubstitute3 == null) {
                return null;
            }
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = new ReceiverParameterDescriptorImpl(functionDescriptorImplCreateSubstitutedCopy, new ExtensionReceiver(functionDescriptorImplCreateSubstitutedCopy, kotlinTypeSubstitute3, copyConfiguration.newExtensionReceiverParameter.getValue()), copyConfiguration.newExtensionReceiverParameter.getAnnotations());
            zArr[0] = (kotlinTypeSubstitute3 != copyConfiguration.newExtensionReceiverParameter.getType()) | zArr[0];
            receiverParameterDescriptorImpl = receiverParameterDescriptorImpl2;
        } else {
            receiverParameterDescriptorImpl = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor4 = copyConfiguration.dispatchReceiverParameter;
        if (receiverParameterDescriptor4 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorSubstitute = receiverParameterDescriptor4.substitute(typeSubstitutorSubstituteTypeParameters);
            if (receiverParameterDescriptorSubstitute == null) {
                return null;
            }
            zArr[0] = zArr[0] | (receiverParameterDescriptorSubstitute != copyConfiguration.dispatchReceiverParameter);
            receiverParameterDescriptor = receiverParameterDescriptorSubstitute;
        } else {
            receiverParameterDescriptor = null;
        }
        List<ValueParameterDescriptor> substitutedValueParameters = getSubstitutedValueParameters(functionDescriptorImplCreateSubstitutedCopy, copyConfiguration.newValueParameterDescriptors, typeSubstitutorSubstituteTypeParameters, copyConfiguration.dropOriginalInContainingParts, copyConfiguration.preserveSourceElement, zArr);
        if (substitutedValueParameters == null || (kotlinTypeSubstitute = typeSubstitutorSubstituteTypeParameters.substitute(copyConfiguration.newReturnType, Variance.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z10 = zArr[0] | (kotlinTypeSubstitute != copyConfiguration.newReturnType);
        zArr[0] = z10;
        if (!z10 && copyConfiguration.justForTypeSubstitution) {
            return this;
        }
        functionDescriptorImplCreateSubstitutedCopy.initialize(receiverParameterDescriptorImpl, receiverParameterDescriptor, arrayList2, arrayList, substitutedValueParameters, kotlinTypeSubstitute, copyConfiguration.newModality, copyConfiguration.newVisibility);
        functionDescriptorImplCreateSubstitutedCopy.setOperator(this.G0);
        functionDescriptorImplCreateSubstitutedCopy.setInfix(this.H0);
        functionDescriptorImplCreateSubstitutedCopy.setExternal(this.I0);
        functionDescriptorImplCreateSubstitutedCopy.setInline(this.J0);
        functionDescriptorImplCreateSubstitutedCopy.setTailrec(this.K0);
        functionDescriptorImplCreateSubstitutedCopy.setSuspend(this.P0);
        functionDescriptorImplCreateSubstitutedCopy.setExpect(this.L0);
        functionDescriptorImplCreateSubstitutedCopy.setActual(this.M0);
        functionDescriptorImplCreateSubstitutedCopy.setHasStableParameterNames(this.Q0);
        functionDescriptorImplCreateSubstitutedCopy.N0 = copyConfiguration.f80320a;
        functionDescriptorImplCreateSubstitutedCopy.O0 = copyConfiguration.f80323d;
        Boolean bool = copyConfiguration.f80325f;
        functionDescriptorImplCreateSubstitutedCopy.setHasSynthesizedParameterNames(bool != null ? bool.booleanValue() : this.R0);
        if (!copyConfiguration.f80324e.isEmpty() || this.userDataMap != null) {
            LinkedHashMap linkedHashMap = copyConfiguration.f80324e;
            Map<CallableDescriptor.UserDataKey<?>, Object> map = this.userDataMap;
            if (map != null) {
                for (Map.Entry<CallableDescriptor.UserDataKey<?>, Object> entry : map.entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap.size() == 1) {
                functionDescriptorImplCreateSubstitutedCopy.userDataMap = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                functionDescriptorImplCreateSubstitutedCopy.userDataMap = linkedHashMap;
            }
        }
        if (copyConfiguration.signatureChange || getInitialSignatureDescriptor() != null) {
            functionDescriptorImplCreateSubstitutedCopy.W0 = (getInitialSignatureDescriptor() != null ? getInitialSignatureDescriptor() : this).substitute(typeSubstitutorSubstituteTypeParameters);
        }
        if (copyConfiguration.copyOverrides && !getOriginal().getOverriddenDescriptors().isEmpty()) {
            if (copyConfiguration.substitution.isEmpty()) {
                Function0<Collection<FunctionDescriptor>> function0 = this.T0;
                if (function0 != null) {
                    functionDescriptorImplCreateSubstitutedCopy.T0 = function0;
                } else {
                    functionDescriptorImplCreateSubstitutedCopy.setOverriddenDescriptors(getOverriddenDescriptors());
                }
            } else {
                functionDescriptorImplCreateSubstitutedCopy.T0 = new a(typeSubstitutorSubstituteTypeParameters);
            }
        }
        return functionDescriptorImplCreateSubstitutedCopy;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = this.f80317w0;
        if (list != null) {
            return list;
        }
        a(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.f80319y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.f80318x0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @Nullable
    public FunctionDescriptor getInitialSignatureDescriptor() {
        return this.W0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.V0;
        if (kind != null) {
            return kind;
        }
        a(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = this.E0;
        if (modality != null) {
            return modality;
        }
        a(15);
        throw null;
    }

    @NotNull
    public Collection<? extends FunctionDescriptor> getOverriddenDescriptors() {
        Function0<Collection<FunctionDescriptor>> function0 = this.T0;
        if (function0 != null) {
            this.S0 = function0.invoke();
            this.T0 = null;
        }
        Collection<? extends FunctionDescriptor> collectionEmptyList = this.S0;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.v0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f80315t0;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        Map<CallableDescriptor.UserDataKey<?>, Object> map = this.userDataMap;
        if (map == null) {
            return null;
        }
        return (V) map.get(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ValueParameterDescriptor> getValueParameters() {
        List<ValueParameterDescriptor> list = this.f80316u0;
        if (list != null) {
            return list;
        }
        a(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.F0;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        a(16);
        throw null;
    }

    public boolean hasStableParameterNames() {
        return this.Q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.R0;
    }

    @NotNull
    public FunctionDescriptorImpl initialize(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, @NotNull List<ValueParameterDescriptor> list3, @Nullable KotlinType kotlinType, @Nullable Modality modality, @NotNull DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (list3 == null) {
            a(7);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(8);
            throw null;
        }
        this.f80315t0 = CollectionsKt___CollectionsKt.toList(list2);
        this.f80316u0 = CollectionsKt___CollectionsKt.toList(list3);
        this.v0 = kotlinType;
        this.E0 = modality;
        this.F0 = descriptorVisibility;
        this.f80318x0 = receiverParameterDescriptor;
        this.f80319y0 = receiverParameterDescriptor2;
        this.f80317w0 = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            TypeParameterDescriptor typeParameterDescriptor = list2.get(i10);
            if (typeParameterDescriptor.getIndex() != i10) {
                throw new IllegalStateException(typeParameterDescriptor + " index is " + typeParameterDescriptor.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            ValueParameterDescriptor valueParameterDescriptor = list3.get(i11);
            if (valueParameterDescriptor.getIndex() != i11) {
                throw new IllegalStateException(valueParameterDescriptor + "index is " + valueParameterDescriptor.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.L0;
    }

    public boolean isExternal() {
        return this.I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.O0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenToOvercomeSignatureClash() {
        return this.N0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        if (this.H0) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.J0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        if (this.G0) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.P0;
    }

    public boolean isTailrec() {
        return this.K0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> newCopyBuilder() {
        CopyConfiguration copyConfigurationNewCopyBuilder = newCopyBuilder(TypeSubstitutor.EMPTY);
        if (copyConfigurationNewCopyBuilder != null) {
            return copyConfigurationNewCopyBuilder;
        }
        a(23);
        throw null;
    }

    public <V> void putInUserDataMap(CallableDescriptor.UserDataKey<V> userDataKey, Object obj) {
        if (this.userDataMap == null) {
            this.userDataMap = new LinkedHashMap();
        }
        this.userDataMap.put(userDataKey, obj);
    }

    public void setActual(boolean z10) {
        this.M0 = z10;
    }

    public void setExpect(boolean z10) {
        this.L0 = z10;
    }

    public void setExternal(boolean z10) {
        this.I0 = z10;
    }

    public void setHasStableParameterNames(boolean z10) {
        this.Q0 = z10;
    }

    public void setHasSynthesizedParameterNames(boolean z10) {
        this.R0 = z10;
    }

    public void setInfix(boolean z10) {
        this.H0 = z10;
    }

    public void setInline(boolean z10) {
        this.J0 = z10;
    }

    public void setOperator(boolean z10) {
        this.G0 = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            a(17);
            throw null;
        }
        this.S0 = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).isHiddenForResolutionEverywhereBesideSupercalls()) {
                this.O0 = true;
                return;
            }
        }
    }

    public void setReturnType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            this.v0 = kotlinType;
        } else {
            a(11);
            throw null;
        }
    }

    public void setSuspend(boolean z10) {
        this.P0 = z10;
    }

    public void setTailrec(boolean z10) {
        this.K0 = z10;
    }

    public void setVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            this.F0 = descriptorVisibility;
        } else {
            a(10);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        FunctionDescriptor functionDescriptorBuild = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z10).build();
        if (functionDescriptorBuild != null) {
            return functionDescriptorBuild;
        }
        a(26);
        throw null;
    }

    @NotNull
    public CopyConfiguration newCopyBuilder(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new CopyConfiguration(this, typeSubstitutor.getSubstitution(), getContainingDeclaration(), getModality(), getVisibility(), getKind(), getValueParameters(), getContextReceiverParameters(), getExtensionReceiverParameter(), getReturnType(), null);
        }
        a(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public FunctionDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : newCopyBuilder(typeSubstitutor).setOriginal((CallableMemberDescriptor) getOriginal()).setPreserveSourceElement().setJustForTypeSubstitution(true).build();
        }
        a(22);
        throw null;
    }

    @Nullable
    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, @NotNull List<ValueParameterDescriptor> list, @NotNull TypeSubstitutor typeSubstitutor, boolean z10, boolean z11, @Nullable boolean[] zArr) {
        if (list == null) {
            a(30);
            throw null;
        }
        if (typeSubstitutor != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (ValueParameterDescriptor valueParameterDescriptor : list) {
                KotlinType type = valueParameterDescriptor.getType();
                Variance variance = Variance.IN_VARIANCE;
                KotlinType kotlinTypeSubstitute = typeSubstitutor.substitute(type, variance);
                KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
                KotlinType kotlinTypeSubstitute2 = varargElementType == null ? null : typeSubstitutor.substitute(varargElementType, variance);
                if (kotlinTypeSubstitute == null) {
                    return null;
                }
                if ((kotlinTypeSubstitute != valueParameterDescriptor.getType() || varargElementType != kotlinTypeSubstitute2) && zArr != null) {
                    zArr[0] = true;
                }
                arrayList.add(ValueParameterDescriptorImpl.createWithDestructuringDeclarations(functionDescriptor, z10 ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), kotlinTypeSubstitute, valueParameterDescriptor.declaresDefaultValue(), valueParameterDescriptor.isCrossinline(), valueParameterDescriptor.isNoinline(), kotlinTypeSubstitute2, z11 ? valueParameterDescriptor.getSource() : SourceElement.NO_SOURCE, valueParameterDescriptor instanceof ValueParameterDescriptorImpl.WithDestructuringDeclaration ? new b(((ValueParameterDescriptorImpl.WithDestructuringDeclaration) valueParameterDescriptor).getDestructuringVariables()) : null));
            }
            return arrayList;
        }
        a(31);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public FunctionDescriptor getOriginal() {
        FunctionDescriptor functionDescriptor = this.U0;
        FunctionDescriptor original = functionDescriptor == this ? this : functionDescriptor.getOriginal();
        if (original != null) {
            return original;
        }
        a(20);
        throw null;
    }
}
