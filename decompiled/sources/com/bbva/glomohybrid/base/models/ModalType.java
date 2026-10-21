package com.bbva.glomohybrid.base.models;

import ad.d;
import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModalType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType;", "", "()V", "AkamaiError", "ChangeProfileRequestByDeeplink", "ChangeUser", "ChangeUserRetry", "ChangeUserWithFeaturesList", "ChangeUserWithSigning", "DeviceActivation", "ErrorById", "ErrorEnrolled", "ErrorExpiredPassword", "ErrorGeneric", "ErrorSSO", "ErrorSSONoPhone", "Kne0116Error", "StandIn", "Lcom/bbva/glomohybrid/base/models/ModalType$AkamaiError;", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeProfileRequestByDeeplink;", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUser;", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserRetry;", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserWithFeaturesList;", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserWithSigning;", "Lcom/bbva/glomohybrid/base/models/ModalType$DeviceActivation;", "Lcom/bbva/glomohybrid/base/models/ModalType$ErrorById;", "Lcom/bbva/glomohybrid/base/models/ModalType$ErrorEnrolled;", "Lcom/bbva/glomohybrid/base/models/ModalType$ErrorExpiredPassword;", "Lcom/bbva/glomohybrid/base/models/ModalType$ErrorGeneric;", "Lcom/bbva/glomohybrid/base/models/ModalType$ErrorSSO;", "Lcom/bbva/glomohybrid/base/models/ModalType$ErrorSSONoPhone;", "Lcom/bbva/glomohybrid/base/models/ModalType$Kne0116Error;", "Lcom/bbva/glomohybrid/base/models/ModalType$StandIn;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ModalType {

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$AkamaiError;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class AkamaiError extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AkamaiError(@NotNull String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public static /* synthetic */ AkamaiError copy$default(AkamaiError akamaiError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = akamaiError.id;
            }
            return akamaiError.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final AkamaiError copy(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new AkamaiError(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AkamaiError) && Intrinsics.areEqual(this.id, ((AkamaiError) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("AkamaiError(id="), this.id, ")");
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ChangeProfileRequestByDeeplink;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "Lcom/bbva/glomo/user/domain/model/UserType;", "component1", "target", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomo/user/domain/model/UserType;", "getTarget", "()Lcom/bbva/glomo/user/domain/model/UserType;", "<init>", "(Lcom/bbva/glomo/user/domain/model/UserType;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ChangeProfileRequestByDeeplink extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final UserType target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeProfileRequestByDeeplink(@NotNull UserType target) {
            super(null);
            Intrinsics.checkNotNullParameter(target, "target");
            this.target = target;
        }

        public static /* synthetic */ ChangeProfileRequestByDeeplink copy$default(ChangeProfileRequestByDeeplink changeProfileRequestByDeeplink, UserType userType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                userType = changeProfileRequestByDeeplink.target;
            }
            return changeProfileRequestByDeeplink.copy(userType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UserType getTarget() {
            return this.target;
        }

        @NotNull
        public final ChangeProfileRequestByDeeplink copy(@NotNull UserType target) {
            Intrinsics.checkNotNullParameter(target, "target");
            return new ChangeProfileRequestByDeeplink(target);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeProfileRequestByDeeplink) && this.target == ((ChangeProfileRequestByDeeplink) other).target;
        }

        @NotNull
        public final UserType getTarget() {
            return this.target;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChangeProfileRequestByDeeplink(target=" + this.target + ")";
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUser;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "", "component2", "userName", "hasWear", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "b", "Z", "getHasWear", "()Z", "<init>", "(Ljava/lang/String;Z)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ChangeUser extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String userName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final boolean hasWear;

        /* JADX WARN: Multi-variable type inference failed */
        public ChangeUser() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ChangeUser copy$default(ChangeUser changeUser, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = changeUser.userName;
            }
            if ((i10 & 2) != 0) {
                z10 = changeUser.hasWear;
            }
            return changeUser.copy(str, z10);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasWear() {
            return this.hasWear;
        }

        @NotNull
        public final ChangeUser copy(@Nullable String userName, boolean hasWear) {
            return new ChangeUser(userName, hasWear);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeUser)) {
                return false;
            }
            ChangeUser changeUser = (ChangeUser) other;
            return Intrinsics.areEqual(this.userName, changeUser.userName) && this.hasWear == changeUser.hasWear;
        }

        public final boolean getHasWear() {
            return this.hasWear;
        }

        @Nullable
        public final String getUserName() {
            return this.userName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            String str = this.userName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z10 = this.hasWear;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "ChangeUser(userName=" + this.userName + ", hasWear=" + this.hasWear + ")";
        }

        public ChangeUser(@Nullable String str, boolean z10) {
            super(null);
            this.userName = str;
            this.hasWear = z10;
        }

        public /* synthetic */ ChangeUser(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? false : z10);
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserRetry;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeUserRetry extends ModalType {

        @NotNull
        public static final ChangeUserRetry INSTANCE = new ChangeUserRetry();

        public ChangeUserRetry() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeUserRetry)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1124284867;
        }

        @NotNull
        public String toString() {
            return "ChangeUserRetry";
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserWithFeaturesList;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "", "component2", "", "component3", "userName", "featuresList", "hasWear", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getFeaturesList", "()Ljava/util/List;", "c", "Z", "getHasWear", "()Z", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ChangeUserWithFeaturesList extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String userName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> featuresList;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean hasWear;

        public /* synthetic */ ChangeUserWithFeaturesList(String str, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i10 & 4) != 0 ? false : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChangeUserWithFeaturesList copy$default(ChangeUserWithFeaturesList changeUserWithFeaturesList, String str, List list, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = changeUserWithFeaturesList.userName;
            }
            if ((i10 & 2) != 0) {
                list = changeUserWithFeaturesList.featuresList;
            }
            if ((i10 & 4) != 0) {
                z10 = changeUserWithFeaturesList.hasWear;
            }
            return changeUserWithFeaturesList.copy(str, list, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        @NotNull
        public final List<String> component2() {
            return this.featuresList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getHasWear() {
            return this.hasWear;
        }

        @NotNull
        public final ChangeUserWithFeaturesList copy(@NotNull String userName, @NotNull List<String> featuresList, boolean hasWear) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(featuresList, "featuresList");
            return new ChangeUserWithFeaturesList(userName, featuresList, hasWear);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeUserWithFeaturesList)) {
                return false;
            }
            ChangeUserWithFeaturesList changeUserWithFeaturesList = (ChangeUserWithFeaturesList) other;
            return Intrinsics.areEqual(this.userName, changeUserWithFeaturesList.userName) && Intrinsics.areEqual(this.featuresList, changeUserWithFeaturesList.featuresList) && this.hasWear == changeUserWithFeaturesList.hasWear;
        }

        @NotNull
        public final List<String> getFeaturesList() {
            return this.featuresList;
        }

        public final boolean getHasWear() {
            return this.hasWear;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iA = a.a(this.featuresList, this.userName.hashCode() * 31, 31);
            boolean z10 = this.hasWear;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            return iA + r1;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeUserWithFeaturesList(userName=");
            sb2.append(this.userName);
            sb2.append(", featuresList=");
            sb2.append(this.featuresList);
            sb2.append(", hasWear=");
            return i.c(sb2, this.hasWear, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeUserWithFeaturesList(@NotNull String userName, @NotNull List<String> featuresList, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(featuresList, "featuresList");
            this.userName = userName;
            this.featuresList = featuresList;
            this.hasWear = z10;
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserWithSigning;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "", "component2", "userName", "hasWear", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "b", "Z", "getHasWear", "()Z", "<init>", "(Ljava/lang/String;Z)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ChangeUserWithSigning extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String userName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final boolean hasWear;

        public /* synthetic */ ChangeUserWithSigning(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? false : z10);
        }

        public static /* synthetic */ ChangeUserWithSigning copy$default(ChangeUserWithSigning changeUserWithSigning, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = changeUserWithSigning.userName;
            }
            if ((i10 & 2) != 0) {
                z10 = changeUserWithSigning.hasWear;
            }
            return changeUserWithSigning.copy(str, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasWear() {
            return this.hasWear;
        }

        @NotNull
        public final ChangeUserWithSigning copy(@NotNull String userName, boolean hasWear) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            return new ChangeUserWithSigning(userName, hasWear);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeUserWithSigning)) {
                return false;
            }
            ChangeUserWithSigning changeUserWithSigning = (ChangeUserWithSigning) other;
            return Intrinsics.areEqual(this.userName, changeUserWithSigning.userName) && this.hasWear == changeUserWithSigning.hasWear;
        }

        public final boolean getHasWear() {
            return this.hasWear;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.userName.hashCode() * 31;
            boolean z10 = this.hasWear;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "ChangeUserWithSigning(userName=" + this.userName + ", hasWear=" + this.hasWear + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeUserWithSigning(@NotNull String userName, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(userName, "userName");
            this.userName = userName;
            this.hasWear = z10;
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$DeviceActivation;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeviceActivation extends ModalType {

        @NotNull
        public static final DeviceActivation INSTANCE = new DeviceActivation();

        public DeviceActivation() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceActivation)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -829739818;
        }

        @NotNull
        public String toString() {
            return "DeviceActivation";
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ErrorById;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ErrorById extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorById(@NotNull String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public static /* synthetic */ ErrorById copy$default(ErrorById errorById, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = errorById.id;
            }
            return errorById.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ErrorById copy(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new ErrorById(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorById) && Intrinsics.areEqual(this.id, ((ErrorById) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("ErrorById(id="), this.id, ")");
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ErrorEnrolled;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorEnrolled extends ModalType {

        @NotNull
        public static final ErrorEnrolled INSTANCE = new ErrorEnrolled();

        public ErrorEnrolled() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorEnrolled)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1964792163;
        }

        @NotNull
        public String toString() {
            return "ErrorEnrolled";
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ErrorExpiredPassword;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "component2", "id", "user", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getUser", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ErrorExpiredPassword extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorExpiredPassword(@NotNull String id, @NotNull String user) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(user, "user");
            this.id = id;
            this.user = user;
        }

        public static /* synthetic */ ErrorExpiredPassword copy$default(ErrorExpiredPassword errorExpiredPassword, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = errorExpiredPassword.id;
            }
            if ((i10 & 2) != 0) {
                str2 = errorExpiredPassword.user;
            }
            return errorExpiredPassword.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUser() {
            return this.user;
        }

        @NotNull
        public final ErrorExpiredPassword copy(@NotNull String id, @NotNull String user) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(user, "user");
            return new ErrorExpiredPassword(id, user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorExpiredPassword)) {
                return false;
            }
            ErrorExpiredPassword errorExpiredPassword = (ErrorExpiredPassword) other;
            return Intrinsics.areEqual(this.id, errorExpiredPassword.id) && Intrinsics.areEqual(this.user, errorExpiredPassword.user);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorExpiredPassword(id=");
            sb2.append(this.id);
            sb2.append(", user=");
            return d.f(sb2, this.user, ")");
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ErrorGeneric;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorGeneric extends ModalType {

        @NotNull
        public static final ErrorGeneric INSTANCE = new ErrorGeneric();

        public ErrorGeneric() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorGeneric)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1438191737;
        }

        @NotNull
        public String toString() {
            return "ErrorGeneric";
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ErrorSSO;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "", "component2", "attemps", "phone", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getAttemps", "()I", "b", "Ljava/lang/String;", "getPhone", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ErrorSSO extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int attemps;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String phone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorSSO(int i10, @NotNull String phone) {
            super(null);
            Intrinsics.checkNotNullParameter(phone, "phone");
            this.attemps = i10;
            this.phone = phone;
        }

        public static /* synthetic */ ErrorSSO copy$default(ErrorSSO errorSSO, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = errorSSO.attemps;
            }
            if ((i11 & 2) != 0) {
                str = errorSSO.phone;
            }
            return errorSSO.copy(i10, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAttemps() {
            return this.attemps;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @NotNull
        public final ErrorSSO copy(int attemps, @NotNull String phone) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            return new ErrorSSO(attemps, phone);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorSSO)) {
                return false;
            }
            ErrorSSO errorSSO = (ErrorSSO) other;
            return this.attemps == errorSSO.attemps && Intrinsics.areEqual(this.phone, errorSSO.phone);
        }

        public final int getAttemps() {
            return this.attemps;
        }

        @NotNull
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return this.phone.hashCode() + (this.attemps * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorSSO(attemps=");
            sb2.append(this.attemps);
            sb2.append(", phone=");
            return d.f(sb2, this.phone, ")");
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$ErrorSSONoPhone;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "attemps", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getAttemps", "()I", "<init>", "(I)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ErrorSSONoPhone extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int attemps;

        public ErrorSSONoPhone(int i10) {
            super(null);
            this.attemps = i10;
        }

        public static /* synthetic */ ErrorSSONoPhone copy$default(ErrorSSONoPhone errorSSONoPhone, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = errorSSONoPhone.attemps;
            }
            return errorSSONoPhone.copy(i10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAttemps() {
            return this.attemps;
        }

        @NotNull
        public final ErrorSSONoPhone copy(int attemps) {
            return new ErrorSSONoPhone(attemps);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorSSONoPhone) && this.attemps == ((ErrorSSONoPhone) other).attemps;
        }

        public final int getAttemps() {
            return this.attemps;
        }

        public int hashCode() {
            return this.attemps;
        }

        @NotNull
        public String toString() {
            return androidx.appcompat.widget.a.c(new StringBuilder("ErrorSSONoPhone(attemps="), this.attemps, ")");
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$Kne0116Error;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Kne0116Error extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Kne0116Error(@NotNull String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Kne0116Error copy$default(Kne0116Error kne0116Error, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = kne0116Error.id;
            }
            return kne0116Error.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Kne0116Error copy(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Kne0116Error(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Kne0116Error) && Intrinsics.areEqual(this.id, ((Kne0116Error) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Kne0116Error(id="), this.id, ")");
        }
    }

    /* JADX INFO: compiled from: ModalType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ModalType$StandIn;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "", "component1", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class StandIn extends ModalType {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StandIn(@NotNull String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public static /* synthetic */ StandIn copy$default(StandIn standIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = standIn.id;
            }
            return standIn.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final StandIn copy(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new StandIn(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StandIn) && Intrinsics.areEqual(this.id, ((StandIn) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("StandIn(id="), this.id, ")");
        }
    }

    public ModalType() {
    }

    public /* synthetic */ ModalType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
