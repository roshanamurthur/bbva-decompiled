package com.bbva.showinfo.nativemodal.modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeListModalState.kt */
/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eHÇ\u0001\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState;", "Landroid/os/Parcelable;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Loading", "Ready", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState$Loading;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState$Ready;", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
public abstract class NativeListModalState implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.f36552p0);

    /* JADX INFO: compiled from: NativeListModalState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState;", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<NativeListModalState> serializer() {
            return (KSerializer) NativeListModalState.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: compiled from: NativeListModalState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006HÆ\u0001J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004HÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState$Loading;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState;", "()V", "describeContents", "", "serializer", "Lkotlinx/serialization/KSerializer;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final class Loading extends NativeListModalState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new Creator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final /* synthetic */ Lazy<KSerializer<Object>> f36548p0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.f36549p0);

        /* JADX INFO: compiled from: NativeListModalState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Loading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Loading createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Loading[] newArray(int i10) {
                return new Loading[i10];
            }
        }

        /* JADX INFO: compiled from: NativeListModalState.kt */
        public static final class a extends Lambda implements Function0<KSerializer<Object>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f36549p0 = new a(0);

            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("com.bbva.showinfo.nativemodal.modal.NativeListModalState.Loading", Loading.INSTANCE, new Annotation[0]);
            }
        }

        public Loading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final KSerializer<Loading> serializer() {
            return (KSerializer) f36548p0.getValue();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: NativeListModalState.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B%\b\u0011\u0012\u0006\u0010\"\u001a\u00020\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0015\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState$Ready;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$showinfo_release", "(Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState$Ready;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "component1", "nativeListModalConfiguration", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "p0", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "getNativeListModalConfiguration", "()Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "<init>", "(Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "showinfo_release"}, k = 1, mv = {1, 9, 0})
    @Serializable
    public static final /* data */ class Ready extends NativeListModalState {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final NativeListModalConfiguration nativeListModalConfiguration;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<Ready> CREATOR = new Creator();

        /* JADX INFO: compiled from: NativeListModalState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState$Ready$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState$Ready;", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer<Ready> serializer() {
                return NativeListModalState$Ready$$serializer.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: NativeListModalState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Ready> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Ready createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ready(parcel.readInt() == 0 ? null : NativeListModalConfiguration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Ready[] newArray(int i10) {
                return new Ready[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Ready(int i10, NativeListModalConfiguration nativeListModalConfiguration, SerializationConstructorMarker serializationConstructorMarker) {
            super(i10, serializationConstructorMarker);
            if (1 != (i10 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 1, NativeListModalState$Ready$$serializer.INSTANCE.getDescriptor());
            }
            this.nativeListModalConfiguration = nativeListModalConfiguration;
        }

        public static /* synthetic */ Ready copy$default(Ready ready, NativeListModalConfiguration nativeListModalConfiguration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                nativeListModalConfiguration = ready.nativeListModalConfiguration;
            }
            return ready.copy(nativeListModalConfiguration);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$showinfo_release(Ready self, CompositeEncoder output, SerialDescriptor serialDesc) {
            NativeListModalState.write$Self(self, output, serialDesc);
            output.encodeNullableSerializableElement(serialDesc, 0, NativeListModalConfiguration$$serializer.INSTANCE, self.nativeListModalConfiguration);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NativeListModalConfiguration getNativeListModalConfiguration() {
            return this.nativeListModalConfiguration;
        }

        @NotNull
        public final Ready copy(@Nullable NativeListModalConfiguration nativeListModalConfiguration) {
            return new Ready(nativeListModalConfiguration);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ready) && Intrinsics.areEqual(this.nativeListModalConfiguration, ((Ready) other).nativeListModalConfiguration);
        }

        @Nullable
        public final NativeListModalConfiguration getNativeListModalConfiguration() {
            return this.nativeListModalConfiguration;
        }

        public int hashCode() {
            NativeListModalConfiguration nativeListModalConfiguration = this.nativeListModalConfiguration;
            if (nativeListModalConfiguration == null) {
                return 0;
            }
            return nativeListModalConfiguration.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ready(nativeListModalConfiguration=" + this.nativeListModalConfiguration + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            NativeListModalConfiguration nativeListModalConfiguration = this.nativeListModalConfiguration;
            if (nativeListModalConfiguration == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                nativeListModalConfiguration.writeToParcel(parcel, flags);
            }
        }

        public Ready(@Nullable NativeListModalConfiguration nativeListModalConfiguration) {
            super(null);
            this.nativeListModalConfiguration = nativeListModalConfiguration;
        }
    }

    /* JADX INFO: compiled from: NativeListModalState.kt */
    public static final class a extends Lambda implements Function0<KSerializer<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f36552p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedClassSerializer("com.bbva.showinfo.nativemodal.modal.NativeListModalState", Reflection.getOrCreateKotlinClass(NativeListModalState.class), new KClass[]{Reflection.getOrCreateKotlinClass(Loading.class), Reflection.getOrCreateKotlinClass(Ready.class)}, new KSerializer[]{new ObjectSerializer("com.bbva.showinfo.nativemodal.modal.NativeListModalState.Loading", Loading.INSTANCE, new Annotation[0]), NativeListModalState$Ready$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ NativeListModalState(int i10, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public /* synthetic */ NativeListModalState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NativeListModalState() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(NativeListModalState self, CompositeEncoder output, SerialDescriptor serialDesc) {
    }
}
