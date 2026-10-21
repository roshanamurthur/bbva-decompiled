package com.bbva.glomohybrid.login.model.enums;

import ad.d;
import android.graphics.Bitmap;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserAvatar.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;", "", "()V", "NoAvatar", "ProfileAvatar", "UsernameAvatar", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar$NoAvatar;", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar$ProfileAvatar;", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar$UsernameAvatar;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class UserAvatar {

    /* JADX INFO: compiled from: UserAvatar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/login/model/enums/UserAvatar$NoAvatar;", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoAvatar extends UserAvatar {

        @NotNull
        public static final NoAvatar INSTANCE = new NoAvatar();

        public NoAvatar() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: UserAvatar.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/login/model/enums/UserAvatar$ProfileAvatar;", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;", "Landroid/graphics/Bitmap;", "component1", "bitmap", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ProfileAvatar extends UserAvatar {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Bitmap bitmap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProfileAvatar(@NotNull Bitmap bitmap) {
            super(null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
        }

        public static /* synthetic */ ProfileAvatar copy$default(ProfileAvatar profileAvatar, Bitmap bitmap, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bitmap = profileAvatar.bitmap;
            }
            return profileAvatar.copy(bitmap);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final ProfileAvatar copy(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return new ProfileAvatar(bitmap);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProfileAvatar) && Intrinsics.areEqual(this.bitmap, ((ProfileAvatar) other).bitmap);
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public int hashCode() {
            return this.bitmap.hashCode();
        }

        @NotNull
        public String toString() {
            return "ProfileAvatar(bitmap=" + this.bitmap + ")";
        }
    }

    /* JADX INFO: compiled from: UserAvatar.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/login/model/enums/UserAvatar$UsernameAvatar;", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;", "", "component1", "name", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class UsernameAvatar extends UserAvatar {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UsernameAvatar(@NotNull String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public static /* synthetic */ UsernameAvatar copy$default(UsernameAvatar usernameAvatar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = usernameAvatar.name;
            }
            return usernameAvatar.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final UsernameAvatar copy(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new UsernameAvatar(name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UsernameAvatar) && Intrinsics.areEqual(this.name, ((UsernameAvatar) other).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("UsernameAvatar(name="), this.name, ")");
        }
    }

    public UserAvatar() {
    }

    public /* synthetic */ UserAvatar(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
