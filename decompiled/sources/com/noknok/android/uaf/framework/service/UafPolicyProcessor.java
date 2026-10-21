package com.noknok.android.uaf.framework.service;

import com.fido.uaf.ver0100.types.MatchCriteria;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.asm.api.uaf.json.ProtocolTags;
import com.noknok.android.client.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class UafPolicyProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<List<MatchCriteria>> f63602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<MatchCriteria> f63603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Authenticator> f63604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<AcceptedAuthnr>> f63605d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63607f;

    public static class AcceptedAuthnr {
        public final String aaid;
        public final int index;
        public final List<String> keyIDList;

        public AcceptedAuthnr(int i10, String str, List<String> list) {
            this.index = i10;
            this.aaid = str;
            this.keyIDList = list;
        }
    }

    public UafPolicyProcessor(List<List<MatchCriteria>> list, List<MatchCriteria> list2, List<Authenticator> list3) {
        this.f63602a = list;
        this.f63603b = list2;
        this.f63604c = list3;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void a(ArrayList<AcceptedAuthnr> arrayList, int i10) {
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            for (List<AcceptedAuthnr> list : this.f63605d) {
                Iterator<AcceptedAuthnr> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!a(list, it.next().index)) {
                    }
                }
                return;
            }
            this.f63605d.add(arrayList);
            return;
        }
        int size = this.f63604c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Authenticator authenticator = this.f63604c.get(i11);
            MatchCriteria matchCriteria = this.f63602a.get(this.f63606e).get(this.f63607f - i10);
            ArrayList arrayList2 = new ArrayList();
            if (!a((List<AcceptedAuthnr>) arrayList, i11) && a(authenticator, matchCriteria, arrayList2)) {
                ArrayList<AcceptedAuthnr> arrayList3 = new ArrayList<>(arrayList);
                arrayList3.add(new AcceptedAuthnr(i11, this.f63604c.get(i11).getAuthnrInfo().aaid, arrayList2));
                a(arrayList3, i10 - 1);
            }
        }
    }

    public List<List<AcceptedAuthnr>> getAcceptedAuthnrs() {
        int size = this.f63602a.size();
        this.f63606e = 0;
        while (true) {
            int i10 = this.f63606e;
            if (i10 >= size) {
                return this.f63605d;
            }
            this.f63607f = this.f63602a.get(i10).size();
            a(new ArrayList<>(), this.f63607f);
            this.f63606e++;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public List<List<AcceptedAuthnr>> getAllAuthnrs() {
        int size = this.f63604c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new AcceptedAuthnr(i10, this.f63604c.get(i10).getAuthnrInfo().aaid, arrayList));
            this.f63605d.add(arrayList2);
        }
        return this.f63605d;
    }

    public EligibleAuthenticators getEligibleAuthnrs() {
        List<MatchCriteria> list = this.f63603b;
        int size = list == null ? 0 : list.size();
        Iterator<Authenticator> it = this.f63604c.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Authenticator next = it.next();
            if (next.isEnabled()) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (a(next, this.f63603b.get(i10), new ArrayList())) {
                        arrayList.add(next.f63562b.aaid);
                        break;
                    }
                }
            } else {
                it.remove();
            }
        }
        return new EligibleAuthenticators(this.f63604c, arrayList);
    }

    private boolean a(List<AcceptedAuthnr> list, int i10) {
        Iterator<AcceptedAuthnr> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().index == i10) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Authenticator authenticator, MatchCriteria matchCriteria, List<String> list) {
        List<String> list2;
        List<Short> list3;
        AuthenticatorInfo authnrInfo = authenticator.getAuthnrInfo();
        List<Extension> list4 = matchCriteria.exts;
        if (list4 != null) {
            for (Extension extension : list4) {
                if (extension.isFailIfUnknown()) {
                    Iterator<String> it = authnrInfo.supportedExtensionIDs.iterator();
                    while (it.hasNext()) {
                        if (it.next().equals(extension.getId())) {
                        }
                    }
                    return false;
                }
            }
        }
        List<String> list5 = matchCriteria.aaid;
        if (list5 != null && list5.size() > 0) {
            List<String> list6 = matchCriteria.aaid;
            String str = authenticator.f63562b.aaid;
            Iterator<String> it2 = list6.iterator();
            while (it2.hasNext()) {
                if (it2.next().equalsIgnoreCase(str)) {
                    List<String> list7 = matchCriteria.keyIDs;
                    if (list7 != null && list7.size() > 0) {
                        for (String str2 : matchCriteria.keyIDs) {
                            if (authenticator.isKeyIDRegistered(str2)) {
                                list.add(str2);
                            }
                        }
                        break;
                    }
                }
            }
            return false;
        }
        List<Short> list8 = matchCriteria.authenticationAlgorithms;
        if (list8 != null && list8.size() > 0 && (list2 = matchCriteria.assertionSchemes) != null && list2.size() > 0 && matchCriteria.authenticationAlgorithms.contains(Short.valueOf(authenticator.f63562b.authenticationAlgorithm)) && matchCriteria.assertionSchemes.contains(authenticator.f63562b.assertionScheme)) {
            List<String> list9 = matchCriteria.vendorID;
            if (list9 != null && list9.size() > 0) {
                if (!matchCriteria.vendorID.contains(authenticator.f63562b.aaid.split("#")[0])) {
                    return false;
                }
            }
            Long l6 = matchCriteria.userVerification;
            if (l6 != null) {
                long jLongValue = l6.longValue();
                long j10 = authnrInfo.userVerification;
                if (jLongValue != j10) {
                    UserVerification userVerification = UserVerification.USER_VERIFY_ALL;
                    if ((userVerification.getUafValue() & j10) != 0 || (matchCriteria.userVerification.longValue() & userVerification.getUafValue()) != 0 || (authnrInfo.userVerification & matchCriteria.userVerification.longValue()) == 0) {
                        return false;
                    }
                }
            }
            Short sh2 = matchCriteria.keyProtection;
            if (sh2 != null && (sh2.shortValue() & authnrInfo.keyProtection) == 0) {
                return false;
            }
            Short sh3 = matchCriteria.matcherProtection;
            if (sh3 != null && (sh3.shortValue() & authnrInfo.matcherProtection) == 0) {
                return false;
            }
            Short sh4 = matchCriteria.tcDisplay;
            if (sh4 != null && (sh4.shortValue() & authnrInfo.tcDisplay) == 0) {
                return false;
            }
        }
        return false;
        List<Short> list10 = matchCriteria.attestationTypes;
        if (list10 != null && list10.size() > 0) {
            list3 = matchCriteria.attestationTypes;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Short.valueOf(ProtocolTags.TAG_ATTESTATION_BASIC_FULL));
            arrayList.add(Short.valueOf(ProtocolTags.TAG_ATTESTATION_BASIC_SURROGATE));
            list3 = arrayList;
        }
        List<Short> list11 = authenticator.f63562b.attestationTypes;
        if (list11 != null && list11.size() != 0) {
            boolean z10 = false;
            for (Short sh5 : list3) {
                for (Short sh6 : authenticator.f63562b.attestationTypes) {
                    if (sh5.shortValue() == sh6.shortValue()) {
                        authenticator.setAttestationType(sh6.shortValue());
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
            if (!z10) {
                return false;
            }
            Long l7 = matchCriteria.attachmentHint;
            return l7 == null || (l7.longValue() & authnrInfo.attachmentHint) != 0;
        }
        Logger.d("UafPolicyProcessor", "AttestationType not defined in AuthenticatorInfo for aaid " + authenticator.f63562b.aaid);
        return false;
    }
}
