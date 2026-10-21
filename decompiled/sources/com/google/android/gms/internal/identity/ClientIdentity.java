package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.hms.feature.model.c;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.checkerframework.dataflow.qual.Pure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.google.android.gms.internal.location.zze, reason: from Kotlin metadata */
/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001]BS\b\u0017\u0012\b\b\u0001\u0010T\u001a\u00020\b\u0012\b\b\u0001\u0010K\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\bZ\u0010[Bc\b\u0002\u0012\u0006\u0010T\u001a\u00020\b\u0012\u0006\u0010M\u001a\u00020\b\u0012\u0006\u0010K\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\b\u0010@\u001a\u0004\u0018\u000101\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\bZ\u0010\\J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ+\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0013\"\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0013\"\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J<\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0007J+\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0013\"\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J+\u0010#\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0013\"\u00020\u0002H\u0007¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010%\u001a\u00020\u0000H\u0007J\n\u0010&\u001a\u0004\u0018\u00010\u0000H\u0007J&\u0010)\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u001bH\u0007J\u0018\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0007R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b5\u00106R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b8\u00109R,\u0010>\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b;\u0012\b\b,\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0:8G¢\u0006\u0006\u001a\u0004\b<\u0010=R,\u0010@\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b;\u0012\b\b,\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u0002010:8G¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010AR-\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b;\u0012\b\b,\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060:8Ç\u0002¢\u0006\u0006\u001a\u0004\bB\u0010=R\u0011\u0010C\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0011\u0010F\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0011\u0010G\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bG\u0010DR\u0011\u0010H\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bH\u0010DR-\u0010I\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b;\u0012\b\b,\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060:8Ç\u0002¢\u0006\u0006\u001a\u0004\bI\u0010=R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\bJ\u00106R\u001a\u0010K\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u00106R\u0017\u0010M\u001a\u00020\b8G¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0011\u0010S\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\b8GX\u0087\u0004¢\u0006\f\n\u0004\bT\u0010N\u001a\u0004\bU\u0010PR\u0011\u0010Y\u001a\u00020V8G¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006^"}, d2 = {"Lcom/google/android/gms/libs/identity/ClientIdentity;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "toString", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "Landroid/content/Context;", "context", "Lcom/google/android/gms/libs/identity/Impersonator;", "asImpersonator", "", "permissions", "checkAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "checkPermissions", "attributionTag", "listenerId", "", "Lcom/google/android/gms/common/Feature;", "clientFeatures", "impersonator", "copy", "enforceAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)V", "enforceFirstParty", "enforcePackageName", "enforcePermissions", "enforceZeroParty", "forAggregation", "getImpersonator", "impersonatee", "impersonateeListenerId", "impersonate", c.f50460q, "supportsFeature", "name", "", "version", "_clientSdkVersion", "Ljava/lang/Integer;", "Lcom/google/android/gms/libs/identity/ClientType;", "_clientType", "Lcom/google/android/gms/libs/identity/ClientType;", "Ljava/lang/String;", "getAttributionTag", "()Ljava/lang/String;", "Ljava/util/List;", "getClientFeatures", "()Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "getClientSdkVersion", "()Lkotlin/jvm/functions/Function1;", "clientSdkVersion", "getClientType", "clientType", "Lcom/google/android/gms/libs/identity/ClientIdentity;", "isFirstParty", "isImpersonatedIdentity", "()Z", "isMyProcess", "isMyUid", "isMyUser", "isSystemServer", "isZeroParty", "getListenerId", "packageName", "getPackageName", "pid", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPid", "()I", "getRealIdentity", "()Lcom/google/android/gms/libs/identity/ClientIdentity;", "realIdentity", "uid", "getUid", "Landroid/os/UserHandle;", "getUserHandle", "()Landroid/os/UserHandle;", "userHandle", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientType;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "Companion", "java.com.google.android.gms.libs.identity_identity"}, k = 1, mv = {1, 9, 0})
@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({2, 5})
@SourceDebugExtension({"SMAP\nClientIdentity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientIdentity.kt\ncom/google/android/gms/libs/identity/ClientIdentity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,598:1\n335#1:600\n339#1:601\n1#2:599\n1747#3,3:602\n12271#4,2:605\n12474#4,2:607\n13309#4,2:609\n*S KotlinDebug\n*F\n+ 1 ClientIdentity.kt\ncom/google/android/gms/libs/identity/ClientIdentity\n*L\n255#1:600\n264#1:601\n278#1:602,3\n284#1:605,2\n292#1:607,2\n301#1:609,2\n*E\n"})
public final class ClientIdentity extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getUid", id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getPackageName", id = 3)
    @NotNull
    private final String zzc;

    @SafeParcelable.Field(getter = "getAttributionTag", id = 4)
    @Nullable
    private final String zzd;

    @SafeParcelable.Field(getter = "getListenerId", id = 6)
    @Nullable
    private final String zze;

    @SafeParcelable.Field(getter = "getClientFeatures", id = 8)
    @NotNull
    private final List zzf;

    @SafeParcelable.Field(getter = "getImpersonator", id = 7)
    @Nullable
    private final ClientIdentity zzg;

    @NotNull
    public static final zzd zza = new zzd(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zzf();

    static {
        Process.myUid();
        Process.myPid();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "only for Parcelable.Creator")
    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 3) @NotNull String packageName, @SafeParcelable.Param(id = 4) @Nullable String str, @SafeParcelable.Param(id = 6) @Nullable String str2, @SafeParcelable.Param(id = 8) @Nullable List list, @SafeParcelable.Param(id = 7) @Nullable ClientIdentity clientIdentity) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (clientIdentity != null && clientIdentity.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.zzb = i10;
        this.zzc = packageName;
        this.zzd = str;
        if (str2 == null) {
            str2 = clientIdentity != null ? clientIdentity.zze : null;
        }
        this.zze = str2;
        if (list == null) {
            list = clientIdentity != null ? clientIdentity.zzf : null;
            if (list == null) {
                list = zzex.zzi();
                Intrinsics.checkNotNullExpressionValue(list, "of(...)");
            }
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        zzex zzexVarZzj = zzex.zzj(list);
        Intrinsics.checkNotNullExpressionValue(zzexVarZzj, "copyOf(...)");
        this.zzf = zzexVarZzj;
        this.zzg = clientIdentity;
    }

    public final boolean equals(@Nullable Object other) {
        if (other instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) other;
            if (this.zzb == clientIdentity.zzb && Intrinsics.areEqual(this.zzc, clientIdentity.zzc) && Intrinsics.areEqual(this.zzd, clientIdentity.zzd) && Intrinsics.areEqual(this.zze, clientIdentity.zze) && Intrinsics.areEqual(this.zzg, clientIdentity.zzg) && Intrinsics.areEqual(this.zzf, clientIdentity.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzg});
    }

    @NotNull
    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + (str != null ? str.length() : 0));
        sb2.append(this.zzb);
        sb2.append("/");
        sb2.append(this.zzc);
        String str2 = this.zzd;
        if (str2 != null) {
            sb2.append(Constant.BRACKET_OPEN);
            if (l.startsWith$default(str2, this.zzc, false, 2, null)) {
                sb2.append((CharSequence) str2, this.zzc.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append(Constant.BRACKET_CLOSE);
        }
        if (this.zze != null) {
            sb2.append("/");
            String str3 = this.zze;
            sb2.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int i10 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(dest);
        SafeParcelWriter.writeInt(dest, 1, i10);
        SafeParcelWriter.writeString(dest, 3, this.zzc, false);
        SafeParcelWriter.writeString(dest, 4, this.zzd, false);
        SafeParcelWriter.writeString(dest, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(dest, 7, this.zzg, flags, false);
        SafeParcelWriter.writeTypedList(dest, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(dest, iBeginObjectHeader);
    }

    @Pure
    public final boolean zza() {
        return this.zzg != null;
    }
}
