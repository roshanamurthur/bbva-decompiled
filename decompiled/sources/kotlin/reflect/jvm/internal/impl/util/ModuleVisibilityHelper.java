package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModuleVisibilityHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ModuleVisibilityHelper {

    /* JADX INFO: compiled from: ModuleVisibilityHelper.kt */
    public static final class EMPTY implements ModuleVisibilityHelper {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public boolean isInFriendModule(@NotNull DeclarationDescriptor what, @NotNull DeclarationDescriptor from) {
            Intrinsics.checkNotNullParameter(what, "what");
            Intrinsics.checkNotNullParameter(from, "from");
            return true;
        }
    }

    boolean isInFriendModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2);
}
