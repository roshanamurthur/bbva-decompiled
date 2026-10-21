import{a as t,h as e,i as s,b as i}from"./952f98a9.js";import{B as a}from"./c650b3d8.js";import"./216055dc.js";import"./f6b0e03b.js";import"./a0b89eb0.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";import"./f89161ad.js";import"./7d773f57.js";import"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./d2484b66.js";import"./4656db6d.js";import"./13014d63.js";import"./c281d121.js";import"./41ed0536.js";import"./30ef6f1f.js";import"./854beed0.js";import"./84dff06e.js";import"./e3d898b2.js";import"./972f570a.js";import"./d335c75d.js";import"./ff2cdeea.js";class r extends(t(a)){static get is(){return"bbva-account-participants-es-api-dm"}get _ASOCustomHeaders(){let t={};if(this.host.includes("ASO")){const e="x-dm-local-",s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return JSON.stringify({...this.headers,...t})}static get scopedElements(){const t=[i];return r.scopedElementsFromClasses(t)}render(){return e`
      <bbva-core-generic-dp
        requirestoken
        id="accountParticipantsDP"
        headers="${s(this._ASOCustomHeaders)}"
        host="${this.host}"
        method='GET'
        .cacheType="${this.cacheType}"
        cacheKey="${this.cacheKey}"
        .semaasMonitoring="${this.semaasMonitoring}"
        .encodeCache="${this.encodeCache}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
        cross-domain>
      </bbva-core-generic-dp>
    `}async _handleLocalDMSuccess(t){const e=await this._responseMapping(t.detail);this.dispatchEvent(new CustomEvent("account-participants-api-dm-fetch",{bubbles:!0,composed:!0,detail:e})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(t){this._handleError("account-participants-api-dm-fetch-error",this.shadowRoot.querySelector("#accountParticipantsDP"))(t.detail)}getAccountParticipants(t){const e=this.shadowRoot.querySelector("#accountParticipantsDP");e.path=`contracts/V01/${t}/participants`,e.generateRequest()}_getGlobalParticipantTypeId(t){return{TIT:"HOLDER",PAU:"AUTHORIZED",REP:"REPRESENTATIVE"}[t]??t}async _responseMapping(t){return await this.updateComplete,null!=t&&t.participants?t.participants.map((t=>{const{relationship:e}=t,s=this._getGlobalParticipantTypeId(e.type.id);return{id:s,order:e.order,participantType:{id:s,name:e.type.name},customDetails:{customerId:t.id,firstName:t.name,lastName:t.lastName,personType:"NATURAL_KNOWN"}}})):[]}}customElements.define(r.is,r);export{r as BbvaAccountParticipantsEsApiDm};
