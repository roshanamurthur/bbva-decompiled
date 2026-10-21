package com.bbva.plugin.contacts.command.impl;

import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.androidtoolkit.utils.StringUtils;
import com.bbva.contacts.ContactAccessor;
import com.bbva.plugin.contacts.command.impl.base.ContactCommand;
import com.bbva.plugin.contacts.command.params.FindContactsBySearchTermParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FindContactsBySearchTermCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/contacts/command/impl/FindContactsBySearchTermCommand;", "Lcom/bbva/plugin/contacts/command/impl/base/ContactCommand;", "Lcom/bbva/plugin/contacts/command/params/FindContactsBySearchTermParams;", "", "executeWithPermissionsGranted", "Lcom/bbva/contacts/ContactAccessor;", "contactAccessor", "<init>", "(Lcom/bbva/contacts/ContactAccessor;)V", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class FindContactsBySearchTermCommand extends ContactCommand<FindContactsBySearchTermParams> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindContactsBySearchTermCommand(@NotNull ContactAccessor contactAccessor) {
        super(contactAccessor, FindContactsBySearchTermParams.class, 0);
        Intrinsics.checkNotNullParameter(contactAccessor, "contactAccessor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        T t10 = this.mParams;
        if (t10 != 0 && StringUtils.isNotNullOrEmpty(((FindContactsBySearchTermParams) t10).getFilter())) {
            if (!(((FindContactsBySearchTermParams) this.mParams).getFields().length == 0)) {
                ContactAccessor mContactAccessor = getMContactAccessor();
                T t11 = this.mParams;
                Intrinsics.checkNotNull(t11);
                String filter = ((FindContactsBySearchTermParams) t11).getFilter();
                T t12 = this.mParams;
                Intrinsics.checkNotNull(t12);
                this.mCommandCallback.sendEvent(mContactAccessor.search(filter, ((FindContactsBySearchTermParams) t12).getFields()));
                return;
            }
        }
        this.mCommandCallback.sendError(Errors.ErrorMalformedParam);
    }
}
