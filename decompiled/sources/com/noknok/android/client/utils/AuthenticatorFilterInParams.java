package com.noknok.android.client.utils;

import android.content.Context;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AuthenticatorFilterInParams {
    public ActivityProxy activityProxy;
    public List<List<AuthenticatorInfo>> authenticators;
    public boolean checkPolicy;
    public Context context;
    public List<String> disallowedAAIDs;
    public IAuthenticatorFilter.OperationType operationType;
    public boolean showWhenLocked;
}
