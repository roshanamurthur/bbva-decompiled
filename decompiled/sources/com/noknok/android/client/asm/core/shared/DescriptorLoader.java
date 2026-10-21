package com.noknok.android.client.asm.core.shared;

import android.content.Context;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.sdk.IAKSelector;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.JsonObjectAdapter;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes11.dex */
public class DescriptorLoader {
    private static String[] a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.utf8Charset));
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Logger.d("DescriptorLoader", "readRawTextFile: " + ((Object) sb2));
                    String string = sb2.toString();
                    bufferedReader.close();
                    return (String[]) ((DescriptorClassList) JsonObjectAdapter.GsonBuilder().create().fromJson(string, DescriptorClassList.class)).getDescriptorclass().clone();
                }
                sb2.append(line);
                sb2.append('\n');
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static List<IAuthenticatorDescriptor> enumerateAndLoadRegisteredDescriptors(Context context) {
        int identifier = context.getResources().getIdentifier("asmdescriptors", "raw", context.getPackageName());
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : a(context.getResources().openRawResource(identifier))) {
                try {
                    arrayList.add((IAuthenticatorDescriptor) Class.forName(str).asSubclass(IAuthenticatorDescriptor.class).getConstructor(Context.class).newInstance(context));
                } catch (ClassNotFoundException e5) {
                    Logger.w("DescriptorLoader", "Failed to load Descriptor with class name: " + str, e5);
                }
            }
        } catch (IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            Logger.e("DescriptorLoader", "Failed to read ASM descriptors " + e7);
        }
        return arrayList;
    }

    public static IAKSelector loadAKSelectorFromClassName(IMatcher iMatcher, IAuthenticatorDescriptor iAuthenticatorDescriptor, Context context, ProtocolType protocolType, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        Class<? extends IAKSelector> authenticatorSelectorClass = iAuthenticatorDescriptor.getAuthenticatorSelectorClass();
        try {
            return authenticatorSelectorClass.getConstructor(Context.class, ProtocolType.class, IAuthenticatorDescriptor.class, IMatcher.class, IAuthenticatorDescriptor.AAIDInfo.class).newInstance(context, protocolType, iAuthenticatorDescriptor, iMatcher, aAIDInfo);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            throw new AsmException(Outcome.FAILURE, "loadAKSelectorFromClassName: class load error for [" + authenticatorSelectorClass.getCanonicalName() + Constant.BRACKET_CLOSE, e5);
        }
    }

    public static IMatcher loadAuthenticatorUIFromClassName(Class<? extends IMatcher> cls, Context context, ProtocolType protocolType) {
        try {
            return cls.getConstructor(Context.class, ProtocolType.class).newInstance(context, protocolType);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            throw new AsmException(Outcome.FAILURE, "loadAuthenticatorUIFromClassName: class load error for [" + cls.getCanonicalName() + Constant.BRACKET_CLOSE, e5);
        }
    }
}
