package com.bbva.plugin.contacts.command.impl.base;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.contacts.ContactAccessor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ContactCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/contacts/command/impl/base/ContactCommand;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Lcom/bbva/contacts/ContactAccessor;", "q0", "Lcom/bbva/contacts/ContactAccessor;", "getMContactAccessor", "()Lcom/bbva/contacts/ContactAccessor;", "mContactAccessor", "Ljava/lang/Class;", "clazz", "", "threadExecution", "<init>", "(Lcom/bbva/contacts/ContactAccessor;Ljava/lang/Class;I)V", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0})
public abstract class ContactCommand<T> extends PermissionCommand<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ContactAccessor mContactAccessor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactCommand(@NotNull ContactAccessor mContactAccessor, @NotNull Class<T> clazz, int i10) {
        super(clazz, i10, "android.permission.READ_CONTACTS");
        Intrinsics.checkNotNullParameter(mContactAccessor, "mContactAccessor");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.mContactAccessor = mContactAccessor;
    }

    @NotNull
    public final ContactAccessor getMContactAccessor() {
        return this.mContactAccessor;
    }
}
